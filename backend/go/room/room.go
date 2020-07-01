package room

import (
	"github.com/gorilla/websocket"
	"github.com/labstack/echo/v4/domain"
)

const (
	GAME int = 0
	WAIT = 1
	FINISH = 2
	CLIENT bool = false
	HOST = true
)

type Room struct {
	status int
	turn bool
	Host *websocket.Conn
	Client *websocket.Conn
}

func NewRoom(host *websocket.Conn, client *websocket.Conn) *Room{
	return &Room{
		status:WAIT,
		Host:host,
		Client:client,
	}
}

func (r *Room) Battle(){
	r.status = GAME
	for r.status != FINISH {
		payload := r.getPayload()
		r.sendPayload(payload)
		// finish させてー

	}
}
/*
	log.Fatal("Host's connection error")
	message.SetMessage("Payload error", 400)
	r.Host.WriteJSON(message)
	message.SetMessage("通信相手が切断しました", 400)
	r.Client.WriteJSON(message)
	r.Host.Close()
	r.Client.Close()
 */

func (r *Room) sendPayload(payload *domain.Payload){
	if r.turn == CLIENT{
		r.Host.WriteJSON(payload)
		// error handling
	}else{
		r.Client.WriteJSON(payload)
	}
}

func (r *Room) getPayload()(payload *domain.Payload){
	if r.turn == CLIENT{
		r.Client.ReadJSON(payload)
		// error handling
	}else{
		r.Client.ReadJSON(payload)
	}
	return
}

func (r *Room) changeTurn(){
	r.turn = !r.turn
}

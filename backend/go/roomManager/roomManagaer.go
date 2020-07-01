package roomManager

import (
	"github.com/gorilla/websocket"
	"github.com/labstack/echo/v4/room"
)

const(
	HOST int = 0
	Client = 1
)
type RoomManager struct{
	Rooms []room.Room
	queue []*websocket.Conn
}

func NewRoomManager() *RoomManager{
	return &RoomManager{}
}

func (r *RoomManager)AddQueue(conn *websocket.Conn){
	r.queue = append(r.queue, conn)
}

func (r *RoomManager)LengthQueue()int{
	return len(r.queue)
}

func (r *RoomManager)CreateRoom(){
	room.NewRoom(r.queue[HOST], r.queue[Client])
}

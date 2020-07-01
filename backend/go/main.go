package main

import (
	"github.com/gin-gonic/gin"
	"github.com/gorilla/websocket"
	"github.com/labstack/echo/v4/roomManager"
	"log"
	"time"
)

const ENDPOINT string  ="hogehoge"

func main() {
	r := gin.Default()
	h := handler{manage:roomManager.RoomManager{}}
	r.GET(ENDPOINT, h.Hogehoge)
	r.Run(":80") // listen and serve on 0.0.0.0:8080 (for windows "localhost:8080")

}

type handler struct {
	manage roomManager.RoomManager
}

const CANMAKEROOM int = 2

func (h *handler) Hogehoge(c *gin.Context){
	log.Println("connect to " + ENDPOINT)
	var upgrader = websocket.Upgrader{HandshakeTimeout:time.Second * 100, EnableCompression:true}
	conn, err := upgrader.Upgrade(c.Writer, c.Request, nil)
	if err != nil {
		log.Fatal("Error upgrading GET request to a websocket::", err)
	}
	defer conn.Close() //別で処理した方がよさそう

	h.manage.AddQueue(conn)

	if h.manage.LengthQueue() == CANMAKEROOM{
		h.manage.CreateRoom()
	}

}

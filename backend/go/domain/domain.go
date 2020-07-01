package domain

type Payload struct {
	x int
	y int
}

type Message struct {
	message string
	statusCode int
}

func NewPayload() *Payload{
	payload := new(Payload)
	return payload
}

func NewMessage() *Message{
	message := new(Message)
	return message
}

func (m *Message)SetMessage(message string, statusCode int){
	m.message = message
	m.statusCode = statusCode
}

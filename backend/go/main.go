package main

import (
	"github.com/gin-gonic/gin"
	"regexp"
)

func main() {
	r := gin.Default()
	r.GET("/get", func(c *gin.Context) {
		c.JSON(200, gin.H{
			"message": "This is GET Method",
		})
	})
	r.POST("/post", func(c *gin.Context) {
		message := struct {
			name string
		}{
			"",
		}

		if err := c.BindJSON(&message); err != nil {
			c.JSON(400, gin.H{
				"message": "Bad Request",
			})
			return
		}

		r := regexp.MustCompile(`[亜-熙ぁ-んァ-ヶ]*`)
		if !r.MatchString(message.name) {
			c.JSON(400, gin.H{
				"message": "name error",
			})
			return
		}

		c.JSON(200, gin.H{
			"message": "your name is" + message.name,
		})
	})
	r.Run(":80") // listen and serve on 0.0.0.0:8080 (for windows "localhost:8080")

}

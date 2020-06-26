package main

import "github.com/gin-gonic/gin"


func main() {
	r := gin.Default()
	r.GET("/get", func(c *gin.Context) {
		c.JSON(200, gin.H{
			"message": "This is GET Method",
		})
	})
	r.POST("/post", func(c *gin.Context){
		c.JSON(200, gin.H{
			"message": "This is POST Method",
		})
	})
	r.Run(":80") // listen and serve on 0.0.0.0:8080 (for windows "localhost:8080")
}

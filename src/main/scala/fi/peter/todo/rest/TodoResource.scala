package fi.peter.todo

import org.scalatra._
import scalate.ScalateSupport

class TodoServlet extends ScalatraServlet with ScalateSupport {

	override protected def defaultTemplatePath: List[String] = List("/templates/views")

	get("/") {
  		contentType="text/html"
  		mustache("/index", "name" -> "scalatra, scalate and mustache")
	}

	get("/:to") {
		contentType = "application/json"
		"Hello " + params("to")
  	}

	get("/jade") {
  		contentType = "text/html"
  		jade("/hello-scalate", "foo" -> "bar")
  	}

  	get("/mustache") {
  		contentType = "text/html"
  		mustache("/index", "name" -> "mustache")
  	}

  	get("/ssp") {
  		contentType = "text/html"
  		ssp("/test")
  	} 
}

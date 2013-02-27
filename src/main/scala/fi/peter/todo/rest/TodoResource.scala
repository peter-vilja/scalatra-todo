package fi.peter.todo

import org.scalatra._
import scalate.ScalateSupport
// JSON-related libraries
import org.json4s.{DefaultFormats, Formats}
// JSON handling support from Scalatra
import org.scalatra.json._

class TodoServlet extends ScalatraServlet with ScalateSupport with JacksonJsonSupport {

  protected implicit val jsonFormats: Formats = DefaultFormats

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

    get("/json") {
      contentType = formats("json")
      List(Todo("asf", false), Todo("sdf", true))
      Todo("sfdfds", false)
    } 
}

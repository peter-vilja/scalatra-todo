package fi.peter.todo

import org.scalatra._
import scalate.ScalateSupport

class TodoServlet extends ScaltaratodoStack {

  get("/") {
  	contentType = "application/json"
    "{\"hello\":\"world\"}"
  }
  
}

package controllers

import javax.inject.Inject
import play.api.libs.json.Json
import database.DoctorData
import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */

class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
//  def index() = Action { implicit request: Request[AnyContent] =>
//    Ok
//  }

  def login(userId: String) = Action {
    if(userId == "" || userId.toLowerCase == "fake") {
      Forbidden
    } else {
      NoContent
    }
  }

  def getDetails() = Action {
    Ok(Json.toJson(DoctorData.getDetails()))
  }

}
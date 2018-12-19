package com.framed.playscalajs.controllers

import javax.inject._

import com.framed.playscalajs.shared.SharedMessages
import play.api.mvc._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val indexImageLocation = "/versionedAssets/images/frontpage.jpg"

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks, indexImageLocation))
  }

}

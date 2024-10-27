package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._

case class Item(id: Int, name: String, price: Double)

object Item {
  implicit val itemFormat = Json.format[Item]
}

@Singleton
class ItemController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  // Sample data storage
  private var items = List(
    Item(1, "Item1", 10.99),
    Item(2, "Item2", 20.49),
    Item(3, "Item3", 15.89)
  )

  // Get all items
  def getItems: Action[AnyContent] = Action {
    Ok(Json.toJson(items))
  }

  // Get item by ID
  def getItemById(id: Int): Action[AnyContent] = Action {
    items.find(_.id == id) match {
      case Some(item) => Ok(Json.toJson(item))
      case None => NotFound(Json.obj("error" -> s"Item with ID $id not found"))
    }
  }
}

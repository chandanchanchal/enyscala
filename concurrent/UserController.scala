package controllers

import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import javax.inject._

// Define a case class for User
case class User(id: Int, name: String, email: String)

// JSON format for User for Play JSON serialization
object User {
  implicit val userFormat: OFormat[User] = Json.format[User]
}

// Define the controller class
@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  // Step 1: Simulate a function to fetch user data from a database (asynchronously)
  def fetchUserFromDatabase(userId: Int): Future[User] = Future {
    // Simulate a long-running database fetch with a delay
    Thread.sleep(2000)
    User(userId, s"User-$userId", s"user$userId@example.com")
  }

  // Step 2: Simulate a function to fetch additional data (asynchronously)
  def fetchAdditionalUserData(userId: Int): Future[String] = Future {
    // Simulate a delay
    Thread.sleep(1500)
    s"Additional data for User-$userId"
  }

  // Step 3: Create an endpoint to fetch user data asynchronously
  def getUser(userId: Int): Action[AnyContent] = Action.async {
    // Start fetching user data and additional data concurrently
    val userFuture = fetchUserFromDatabase(userId)
    val additionalDataFuture = fetchAdditionalUserData(userId)

    // Combine the futures and respond once both are completed
    val combinedFuture: Future[Result] = for {
      user <- userFuture
      additionalData <- additionalDataFuture
    } yield {
      // Combine the data into a JSON response
      Ok(Json.obj(
        "user" -> Json.toJson(user),
        "additionalData" -> additionalData
      ))
    }

    // Return the future result asynchronously
    combinedFuture
  }

  // Step 4: Example of using Promise for manual completion
  def getUserWithPromise(userId: Int): Action[AnyContent] = Action.async {
    // Create a Promise to manually handle the result
    val userPromise: Promise[User] = Promise[User]()

    // Simulate an async task to fetch user data
    Future {
      Thread.sleep(1000) // Simulate a delay
      userPromise.success(User(userId, s"User-$userId", s"user$userId@example.com"))
    }

    // Convert Promise to Future and return result
    userPromise.future.map { user =>
      Ok(Json.toJson(user))
    }
  }
}

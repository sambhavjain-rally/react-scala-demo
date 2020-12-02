package models

import play.api.libs.json.Json

case class DoctorDetails(firstName: String,
                         lastName: String,
                         qualification: String,
                         specialization: String,
                         addressLine1: String,
                         addressLine2: String,
                         phone: String,
                         distance: String,
                         additionalLocations: Seq[String],
                         enrollmentInfo: String,
                         additionalLocation: String,
                         evaluation: String,
                         acceptance: String,
                         botDetails: String)

case class LoginDetails(id: String,
                        email: String,
                        password: String)


object DoctorDetails {
  implicit val doctorFormat = Json.format[DoctorDetails]
}

object LoginDetails {
  implicit val loginFormat = Json.format[LoginDetails]
}

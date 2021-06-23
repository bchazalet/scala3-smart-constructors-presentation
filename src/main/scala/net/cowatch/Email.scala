package net.cowatch

final case class Email private(value: String)

object Email {

    def fromString(input: String): Either[String, Email] = {
        if(input.contains("@")) Right(Email(input))
        else Left("string value doesn't contain an @")
    }

}
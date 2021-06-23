package net.cowatch

/**
  * Demonstrating Smart Constructors in scala 2.13 versus scala 3
  */
object ScalaTwoMain extends App {

    // in scala 2.13
    // val email1 = Email.fromString("not-a-valid-email")
    // println(email1)
    // // val email2 = new Email("not-a-valid-email") // doesn't compile
    // val email3 = Email("not-a-valid-email") // does compile :(
    // println(email3)

    // val email4 = Email.fromString("boris@copmanywatch.net")
    // email4.foreach { valid =>
    //     val email41 = valid.copy(value = "not-a-valid-email-from-copy") // does compile :(
    //     println(email41)
    // }

}

object ScalaThreeMain extends App {

    // in scala 3
    val email1 = Email.fromString("not-a-valid-email")
    println(email1)
    // val email2 = new Email("not-a-valid-email") // doesn't compile
    // val email3 = Email("not-a-valid-email") // does not compile :)

    val email4 = Email.fromString("boris@copmanywatch.net")
    email4.foreach { valid =>
        // val email41 = valid.copy(value = "not-a-valid-email-from-copy") // does not compile :)
    }
}

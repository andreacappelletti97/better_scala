class Main

object Main:
  @main def runIt(): Unit =
    // Values are immutable
    val x: Int = 10
    println(x)

    // Variables are mutable
    var y: Int = 10
    println(y)
    y = y + 10
    println(y)

    // Types
    val myInt: Int = 10
    val myString: String = "Hello!"
    val myChar: Char = 'C'
    val myBool: Boolean = true

    // Compiler can infer types
    val inferInt = 10
    val inferString = "Ciao!"

    // Semicolons are not necessary
    val h = 50

    // Unless you write inline code --> not recommended for readability
    val z = 10; val m = 15
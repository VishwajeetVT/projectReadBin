class Outer {
    // outer class declaration

    var str = "Outer class"

    // nested class declaration
    class nestedClass {
        val firstName = "Praveen"
        val lastName = "Ruhil"
    }
}
fun main(args: Array<String>) {
    // accessing member of Nested class
    print(Outer.nestedClass().firstName)
    print(" ")
    println(Outer.nestedClass().lastName)
}

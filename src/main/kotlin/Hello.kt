val name: String? = null
val greeting: String = "Hello"

val num: Int? = null
fun sayHello(h: String, ite: String) {
    println("$h $ite")
}

fun main() { // ktlint-disable filename
    // ktlint-disable filename
    println("Hello kotlin")
    println(greeting)
    println(name)
    println(num)
    println("******************")
    sayHello("Hello", "Friends")
    sayHello("Chai", "pilo")
    println("*******************")

    val arrayOne = arrayOf("v1", "v2", "v3")

    println("size of the array:" + arrayOne.size)
    println("First Element of the array: " + arrayOne[0])

    for (a in arrayOne) {
        println(a)
    }
    println("*****************")
    arrayOne.forEach {
        println(it)
    }
    val map = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")
    map.put(4,"Four")
    map.forEach { key, value -> println("$key -> $value") }

    println("**************")
    val list = mutableListOf("A1", "A2", "A3")
    list.add(2,"A4")

    list.forEach {
        println(it)
    }
    val person= Person("Vishwajeet","Kotkar")
    val f= person.firstName
    val l=person.lastName
    println("$f $l")
}

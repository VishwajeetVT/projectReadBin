object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        println("This is the test of conversion of java file to kotlin file")
        var a = 3456
        val b = 231
        println(add(a++, b))
        println(div(a.toFloat(), b.toFloat()))
    }
    fun add(a: Int, b: Int): Int {
        return (a + b)
    }
    fun div(a: Float, b: Float): Float {
        return (a / b)
    }
}


fun main(args: Array<String>) {
    Other().test()
}

class Other {
    private val x = 2;

    fun test() {
        printFormattedText("shark_tank") {
            it + x
        }
    }
}


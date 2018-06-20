fun main(args: Array<String>) {
//    printFormattedText("snake_case") { input ->
//        input.split("_")
//                .joinToString("") { it.capitalize() }
//    }

    printFormattedText("snake_case", camelCaseConverter)
}

val camelCaseConverter: (String) -> String = { input ->
    input.split("_")
            .joinToString("") { it.capitalize() }
            .decapitalize()
}

inline fun printFormattedText(text: String, caseConverter: (String) -> String) {
    println(caseConverter(text))
}

val outputTwo: () -> Int = { 2 }

private val logicalOr = { aBoolean: Boolean, aBoolean2: Boolean -> aBoolean || aBoolean2 }
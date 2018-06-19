fun main(args: Array<String>) {
    printFormattedText("snake_case") { input ->
        input.split("_")
                .joinToString("") { it.capitalize() }
    }
}

val camelCaseConverter: (String) -> String = { input ->
    input.split("_")
            .joinToString("") { it.capitalize() }
            .decapitalize()
}

fun printFormattedText(text: String, caseConverter: (String) -> String) {
    println(caseConverter(text))
}
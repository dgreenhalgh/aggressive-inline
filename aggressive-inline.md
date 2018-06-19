# Aggressive Inline
## Higher-Order Functions in Kotlin

---

# David Greenhalgh
## @drgreenhalgh

---

# Aggressive Inline
## Higher-Order Functions in Kotlin

---

# Functions are first class citizens in Kotlin

---

# Simplest case, Java

```java
public class Sample {
  public static void main(String[] args) {
    // Do something
  }
}
```

---

# Simplest case, Kotlin

```kotlin
fun main(args: Array<String>) {
  // Do something
}
```

---

# Strings

In Java:

```java
String name = "Sophie"
```

In Kotlin:

```kotlin
val name: String = "Sophie"
```

---

# Function types

```kotlin
val camelCaseConverter: (String) -> String = { input ->
    input.split("_")
            .joinToString("") { it.capitalize() }
            .decapitalize()
}
```

---

# Lambda calculus

---

# Origins of lambda calculus

---

# Functions as black boxes

// TODO: OmniGraffle diagram

---

# What does lambda calculus look like in Kotlin syntax?

```kotlin
val camelCaseConverter: (String) -> String = { input ->
    input.split("_")
            .joinToString("") { it.capitalize() }
            .decapitalize()
}
```

---

# The arrow operator

```kotlin
(String) -> String
```

---

# Storing references to functions

```kotlin
val camelCaseConverter: (String) -> String = { input ->
    input.split("_")
            .joinToString("") { it.capitalize() }
            .decapitalize()
}
```

---

# Function type invocation

```kotlin
fun main(args: Array<String>) {
  val convertedString = camelCaseConverter("snake_case")
  println(convertedString)
}

val camelCaseConverter: (String) -> String = { input ->
    input.split("_")
            .joinToString("") { it.capitalize() }
            .decapitalize()
}
```

---

# Passing functions as arguments

```kotlin
fun main(args: Array<String>) {
    printFormattedText("snake_case", camelCaseConverter)
}

fun printFormattedText(text: String, 
                      caseConverter: (String) -> String) {
    println(caseConverter(text))
}

val camelCaseConverter: (String) -> String = { input ->
    ...
}
```

---

# Higher-order functions in lambda calculus

// TODO: Call back to lambda calculus syntax here

---

# Anonymous functions

```kotlin
fun main(args: Array<String>) {
    printFormattedText("snake_case", { input ->
        input.split("_")
            .joinToString("") { it.capitalize() } 
    })
}
```

---

# Last parameter trick // Provide proper name

```kotlin
fun main(args: Array<String>) {
    printFormattedText("snake_case") { input ->
        input.split("_")
                .joinToString("") { it.capitalize() }
    }
}
```

---

# Domain-specific languages

```kotlin
verticalLayout {
    val name = editText()
    button("Say Hello") {
        onClick { toast("Hello, ${name.text}!") }
    }
}
```

---

# Domain-specific languages

```kotlin
onClick { toast("Hello, ${name.text}!") }
```

---

# Domain-specific languages

```kotlin
fun View.onClick(v: (View?) -> Unit) {
  setOnClickListener(v)
}
```

---

# Interoperability

---

# Java's FunctionN type

```java
private static final Function1 camelCaseConverter;
```

---

# Higher-order function in Java

```java
public static final void printFormattedText(
    @NotNull String text, 
    @NotNull Function1 caseConverter) {
  Object var2 = caseConverter.invoke(text);
  System.out.println(var2);
}
```

---

# Last parameter trick in Java // rename

```java
public static final void main(@NotNull String[] args) {
  printFormattedText("snake_case", (Function1)null.INSTANCE);
} // TODO: WHy is this null?
```

---

# Performance implications of function types

* Additional object allocation

---

# Function inlining

Fold higher-order function into call site

* inline
* noinline
* crossline

---

# inline

---

# noinline

---

# crossinline

---

# Functional programming

// todo RxJava example
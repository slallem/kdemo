package com.sfeir.kdemo

// see https://kotlinlang.org/docs/reference/basic-syntax.html
// see https://www.codingame.com/playgrounds/28826/formation-kotlin/les-bases-de-kotlin
// Kotlin Koans Online
// Slides https://speakerdeck.com/alexgherschon/introduction-to-kotlin



// ------ FUNCTIONS ------

fun main() {
    println("Hello Kotlin !")
    var c = maximum(4,5)
}

fun test() {
    var annie: Any = "eee" ; annie = 8
    val sb = java.lang.StringBuilder("ee")
}


fun maximum(a: Int = 0, b: Int) : Int = if (a>b) a else b

fun sum(a: Int, b: Int) : Int {
    return a + b
}

//sum can be written in one single line wth inferred return type
//TODO

fun printSum(a: Int, b:Int): Unit {
    println("La somme de $a et $b est ${a+b}")
}

// ------ VARIABLES ------

val PI = 3.14

fun vars() {
    val a: Int = 3
    val b = 4
    val c: Int

    c = 4

    var x = 5
    x++
    x += 1

    var z = 3
    //z = "Test" //error

    var s: String? = null
}



// ------ COMMENTS ------

/* block comments
   on several lines
 */

// Imbrication de commentaires
// /* /* eh oui ! */ */


// Equality

fun `Testing equality`() {

    var a = "Truc"
    var b = "T"
    val c = a

    println( a == "Truc")
    println( a === "Truc")
    println( a == b)
    println( a === b)
    println( a == c)
    println( a === c)


}
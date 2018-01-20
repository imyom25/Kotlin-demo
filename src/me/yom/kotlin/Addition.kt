package me.yom.kotlin

/**
 * @author Yogendra O. Mishra
 */
import java.util.Scanner

fun main(vararg args: String) {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    println(sum(a,b ))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
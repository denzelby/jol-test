package com.github.app.kotlin

import org.openjdk.jol.info.ClassLayout
import org.openjdk.jol.info.GraphLayout

data class KotlinDataClass(val str: String, val s: Short, val i: Int)

fun main(args: Array<String>) {
    val dc = KotlinDataClass("some string here", 4, 2)

    println(ClassLayout.parseClass(KotlinDataClass::class.java).toPrintable())
    println(ClassLayout.parseClass(KotlinDataClass::class.java).toPrintable(dc))

    println(GraphLayout.parseInstance(dc).toPrintable())
    println(GraphLayout.parseInstance(dc).toFootprint())
}
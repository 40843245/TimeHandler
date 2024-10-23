package org.example

import org.example.extension.toTimeAgo
import java.text.SimpleDateFormat
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")

    val date1String = "2001-06-08 12:00:00"
    val date1 = simpleDateFormat.parse(date1String)
    val date2String = "2001-06-08 12:01:00"
    val date2 = simpleDateFormat.parse(date2String)
    val date3String = "2001-06-08 12:01:05"
    val date3 = simpleDateFormat.parse(date3String)

    val ret1 = date1.time.toTimeAgo(date2.time)
    val ret2 = date1.time.toTimeAgo(date3.time)
    val ret3 = date2.time.toTimeAgo(date3.time)

    println(ret1)
    println(ret2)
    println(ret3)
}


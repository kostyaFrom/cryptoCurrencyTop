package com.bulyginkonstantin.cryptocurrency

import java.text.SimpleDateFormat
import java.util.*

fun Float.formatThousands(): String {
    val sb = StringBuilder()
    val formatter = Formatter(sb, Locale.US)
    formatter.format("%(,.0f", this)
    return sb.toString()
}

fun Number.dateToString(pattern: String): String {
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = this.toLong()
    return SimpleDateFormat(pattern, Locale.US).format(calendar.time)
}
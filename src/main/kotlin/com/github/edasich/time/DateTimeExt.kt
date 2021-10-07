package com.github.edasich.time

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId

fun LocalDateTime.toEpochMilli(): Long {
    return this.atZone(ZoneId.systemDefault())
        .toInstant()
        .toEpochMilli()
}

fun LocalDate.toEpochMilli(): Long {
    return this.atStartOfDay(ZoneId.systemDefault())
        .toInstant()
        .toEpochMilli()
}
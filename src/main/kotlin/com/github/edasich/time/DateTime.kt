package com.github.edasich.time

import java.time.*
import java.time.format.DateTimeParseException

object DateTime {

    fun getDateTime(date: LocalDate, time: LocalTime): LocalDateTime {
        return LocalDateTime.of(
            date,
            time
        )
    }

    fun getDaysAgo(days: Long): LocalDate {
        return LocalDate
            .now()
            .minusDays(days)
    }

    fun getYearsAgo(years: Long): LocalDate {
        return LocalDate
            .now()
            .minusYears(years)
    }

    fun getCurrentDayOfWeek(): String {
        return LocalDateTime
            .now()
            .dayOfWeek!!
            .name
    }

    fun getCurrentDateTime(): LocalDateTime {
        return LocalDateTime.now()
    }

    fun getCurrentTime(): LocalTime {
        return LocalTime.now()
    }

    @Throws(DateTimeParseException::class)
    fun parsTime(text: String): LocalTime {
        return LocalTime
            .parse(text)
    }

    fun isBetween(time: LocalTime, start: LocalTime, end: LocalTime): Boolean {
        return time.isAfter(start) && time.isBefore(end)
    }

    fun isSameDay(firstDate: LocalDate, secondDate: LocalDate) : Boolean {
        return firstDate.isEqual(secondDate)
    }

    fun ofTimeStamp(timeStamp: Long): LocalDateTime {
        return LocalDateTime
            .ofInstant(
                Instant.ofEpochMilli(timeStamp),
                ZoneId.systemDefault()
            )
    }

}
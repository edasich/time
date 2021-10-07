package com.github.edasich.time

import java.time.*
import java.time.format.DateTimeParseException

object DateTime {

    fun getCurrentDateTime(): LocalDateTime {
        return LocalDateTime.now()
    }

    fun getCurrentDate(): LocalDate {
        return LocalDate.now()
    }

    fun getCurrentTime(): LocalTime {
        return LocalTime.now()
    }

    fun getDateTime(date: LocalDate, time: LocalTime): LocalDateTime {
        return LocalDateTime.of(
            date,
            time
        )
    }

    fun getDaysAgo(days: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.minusDays(days)
    }

    fun getDaysLater(days: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.plusDays(days)
    }

    fun getWeeksAgo(weeks: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.minusWeeks(weeks)
    }

    fun getWeeksLater(weeks: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.plusWeeks(weeks)
    }

    fun getMonthsAgo(months: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.minusMonths(months)
    }

    fun getMonthsLater(months: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.plusMonths(months)
    }

    fun getYearsAgo(years: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.minusYears(years)
    }

    fun getYearsLater(years: Long, from: LocalDateTime = getCurrentDateTime()): LocalDateTime {
        return from.plusYears(years)
    }

    fun getCurrentDayOfWeek(): String {
        return LocalDateTime
            .now()
            .dayOfWeek!!
            .name
    }

    @Throws(DateTimeParseException::class)
    fun parsTime(text: String): LocalTime {
        return LocalTime
            .parse(text)
    }

    fun isBetween(time: LocalTime, start: LocalTime, end: LocalTime): Boolean {
        return time.isAfter(start) && time.isBefore(end)
    }

    fun isSameDay(firstDate: LocalDate, secondDate: LocalDate): Boolean {
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
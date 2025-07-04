package com.chummer.shared

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneId

fun Long.toLocalDateTime(): LocalDateTime {
    return Instant.ofEpochSecond(this).atZone(ZoneId.systemDefault()).toLocalDateTime()
}

fun Long.toLocalDate(): LocalDate = toLocalDateTime().toLocalDate()

fun LocalDateTime.toUnixSecond(): Long {
    return atZone(ZoneId.systemDefault()).toEpochSecond()
}

fun LocalDate.toUnixSecond() = LocalDateTime.of(this, LocalTime.MIN).toUnixSecond()
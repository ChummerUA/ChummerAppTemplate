package com.chummer.db.adapters

import app.cash.sqldelight.ColumnAdapter
import com.chummer.shared.toLocalDateTime
import com.chummer.shared.toUnixSecond
import java.time.LocalDateTime

object LocalDateTimeAdapter : ColumnAdapter<LocalDateTime, Long> {
    override fun decode(databaseValue: Long): LocalDateTime {
        return databaseValue.toLocalDateTime()
    }

    override fun encode(value: LocalDateTime): Long {
        return value.toUnixSecond()
    }
}
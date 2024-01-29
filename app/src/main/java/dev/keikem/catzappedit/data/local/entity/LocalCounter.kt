package dev.keikem.catzappedit.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "counter_table")
data class LocalCounter(
    @PrimaryKey val id: String,
    @ColumnInfo("counted") val countedNumber: String
)
package com.sensoric.enose.dto

import com.sensoric.enose.enums.SensorEnum
import java.time.LocalDate

class ImportMeasurementDto(val name: String, val time: LocalDate, val measurement: Map<SensorEnum, List<Int>>)
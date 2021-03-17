package com.sensoric.enose.dto

import com.sensoric.enose.enums.SensorEnum
import java.time.LocalDate

class ImportMeasurementDto(var name: String, time: LocalDate, measurement: Map<SensorEnum, List<Int>>)
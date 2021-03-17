package com.sensoric.enose.service

import com.sensoric.enose.dto.ImportMeasurementDto
import org.springframework.web.multipart.MultipartFile

interface ImportMeasurementService {
    fun parseMeasurementFromXml(file: MultipartFile): ImportMeasurementDto?
}

package com.sensoric.enose.service.impl

import com.sensoric.enose.dto.ImportMeasurementDto
import com.sensoric.enose.service.ImportMeasurementService
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class ImportMeasurementServiceImpl : ImportMeasurementService {

    override fun parseMeasurementFromXml(file: MultipartFile): ImportMeasurementDto? {
        //todo parse file
        return null
    }
}

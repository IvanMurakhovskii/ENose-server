package com.sensoric.enose.controller

import com.sensoric.enose.service.ImportMeasurementService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile

@Controller
@RequestMapping("/import")
class ImportMeasurementController(
      private val importMeasurementService: ImportMeasurementService
) {

    @GetMapping("/")
    fun getImportPage(): String {
        return "importMeasurement/importMeasurement"
    }

    @PostMapping("/measurement/save")
    fun saveMeasurementFromFile(@RequestParam file: MultipartFile): String {
        importMeasurementService.parseMeasurementFromXml(file)
        return "importMeasurement"
    }

}


package com.eduHub.eduHub_backend.controller;

import com.eduHub.eduHub_backend.component.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialController {
    @Autowired
    MaterialService materialService;

    @GetMapping("/materials")
    public String getMaterial(){
        return materialService.getMaterials();
    }
}

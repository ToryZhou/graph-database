package com.job.graph.database.controller;

import com.job.graph.database.service.TenementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : toryzhou
 * Date: 9/11/18 09:00
 */
@RequestMapping(value = "/tenement")
@RestController
public class TenementController {

    @Autowired
    private TenementService tenementService;

    @GetMapping
    public ResponseEntity<?> scan() {
        return ResponseEntity.ok().body(tenementService.get());
    }

}

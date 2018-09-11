package com.job.graph.database.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : toryzhou
 * Date: 9/11/18 09:00
 */
@RestController
public class TenementController {

    @GetMapping
    public ResponseEntity<?> scan() {
        return ResponseEntity.ok().body("success");
    }

}

package com.job.graph.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TenementService {

    @Autowired
    private RestTemplate restTemplate;

    public String get() {
        String uri = "https://su.58.com/chuzu/0/?key=%E8%8F%81%E8%8B%B1%E5%85%AC%E5%AF%93&PGTID=0d3090a7-0000-53a8-9df9-cfe4f9a547d1&ClickID=4";
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<String> exchange = restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);
        return exchange.getBody();
    }

}

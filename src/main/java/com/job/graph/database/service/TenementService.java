package com.job.graph.database.service;

import com.job.graph.database.dao.SingleGraph;
import com.job.graph.database.dto.TenementDto;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;

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

    public void save() {
        Graph graph = SingleGraph.getInstance().getGraph();
        TenementDto tenementDto = new TenementDto();
        tenementDto.setAddress("菁英公寓");
        tenementDto.setOwner("王女士");
        tenementDto.setPrice(1000);
        graph.addVertex(tenementDto);
        graph.addVertex("a");
        Vertex a = graph.getVertex("a");
    }

    public String get() {
        String uri = "https://su.58.com/chuzu/0/?key=%E8%8F%81%E8%8B%B1%E5%85%AC%E5%AF%93&PGTID=0d3090a7-0000-522a-1cac-68cef6495b14&ClickID=2";
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<String> exchange = restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);
        String body = exchange.getBody();
        System.out.println(body);

        return body;
    }

    public String get(String key) {
        return "";
    }

}

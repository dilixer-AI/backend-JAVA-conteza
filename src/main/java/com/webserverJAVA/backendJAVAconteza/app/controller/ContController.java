package com.webserverJAVA.backendJAVAconteza.app.controller;

import com.webserverJAVA.backendJAVAconteza.app.entity.Container;
import com.webserverJAVA.backendJAVAconteza.app.service.ContService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
@AllArgsConstructor
public class ContController {


    private final  ContService contService;


    @GetMapping("zzz")
    public ResponseEntity<List<Container>> readAll() {
        return new ResponseEntity<>(contService.readAll(), HttpStatus.OK);
    }





}

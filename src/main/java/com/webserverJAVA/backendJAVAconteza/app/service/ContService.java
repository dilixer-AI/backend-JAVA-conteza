package com.webserverJAVA.backendJAVAconteza.app.service;


import com.webserverJAVA.backendJAVAconteza.app.entity.Container;
import com.webserverJAVA.backendJAVAconteza.app.repository.ContRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContService {

    private final ContRepository contRepository;

    public List<Container> readAll() {
        return contRepository.findAll();
    }

    public Container readById(Long id) {
        return contRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Category not found - " + id));
    }}
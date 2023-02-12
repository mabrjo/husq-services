package com.example.task_manager.controller;

import com.example.task_manager.model.Husq;
import com.example.task_manager.repository.HusqRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/husqs")
public class HusqController {
    @Autowired
    private HusqRepository husqRepository;

    @GetMapping
    public List<Husq> findAll() {
        return husqRepository.findAll();
    }

    @PostMapping
    public Husq save(@Validated @NotNull @RequestBody Husq husq) {
        System.out.println("touched create husq function");
        return husqRepository.save(husq);
    }

    @PutMapping
    public Husq update(@Validated @NotNull @RequestBody Husq husq) {
        return husqRepository.save(husq);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id) {husqRepository.deleteById(id);
        System.out.println("deleted");}

}

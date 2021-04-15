package com.formatoweb.padrehijo.controllers;

import com.formatoweb.padrehijo.converters.HijoConverter;
import com.formatoweb.padrehijo.entity.Hijo;
import com.formatoweb.padrehijo.models.HijoModel;
import com.formatoweb.padrehijo.service.HijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class HijoController {
    @Autowired
    private HijoService hijoService;

    @GetMapping("/hijos")
    public List<Hijo> Hijos(){
        return hijoService.hijos();    }

    @PostMapping("/hijos")
    public Hijo saveHijo(@RequestBody HijoModel hijoModel){
        HijoConverter hijoConverter = new HijoConverter();
        return hijoService.saveHijo(hijoConverter.ModelToEntity(hijoModel));
    }
    @GetMapping("/hijos/{id}")
    public HijoModel getHijoById(@PathVariable Long id){
        HijoConverter hijoConverter = new HijoConverter();
        return hijoConverter.EntityToModel(hijoService.getHijoById(id));
//        return hijoService.getHijoById(id);
    }
}

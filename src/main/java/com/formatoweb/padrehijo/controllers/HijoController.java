package com.formatoweb.padrehijo.controllers;

import com.formatoweb.padrehijo.converters.HijoConverter;
import com.formatoweb.padrehijo.entity.Hijo;
import com.formatoweb.padrehijo.entity.Padre;
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
    @Autowired
    private HijoConverter hijoConverter;

    @GetMapping("/hijos")

    public List<HijoModel> hijos(){
        return hijoConverter.entityToModel(hijoService.hijos());
    }

    @PostMapping("/hijos")
    public Hijo saveHijo(@RequestBody HijoModel hijoModel){
        return hijoService.saveHijo(hijoConverter.modelToEntity(hijoModel));
    }
    @GetMapping("/hijos/{id}")
    public HijoModel getHijoById(@PathVariable Long id){
        return hijoConverter.entityToModel(hijoService.getHijoById(id));
    }
    @PutMapping("/hijos/{id}")
    public HijoModel updateHijo(@RequestBody HijoModel hijoModelViejo, @PathVariable Long id){
        Hijo hijoNuevo = hijoService.getHijoById(id);
        Padre padre = new Padre();
        hijoNuevo.setNombreHijo(hijoModelViejo.getNombreHijo());
        hijoNuevo.setApellidoHijo(hijoModelViejo.getApellidoHijo());
        hijoNuevo.setEdadHijo(hijoModelViejo.getEdadHijo());
        padre.setId(hijoModelViejo.getIdPadre());
        hijoNuevo.setPadreByPadreId(padre);
        return hijoConverter.entityToModel(hijoService.saveHijo(hijoNuevo));
    }
}

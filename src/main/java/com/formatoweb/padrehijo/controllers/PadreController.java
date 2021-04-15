package com.formatoweb.padrehijo.controllers;

import com.formatoweb.padrehijo.converters.PadreConverter;
import com.formatoweb.padrehijo.entity.Padre;
import com.formatoweb.padrehijo.models.PadreModel;
import com.formatoweb.padrehijo.service.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PadreController {
    @Autowired
    private PadreService padreService;
//    private PadreConverter padreConverter;

    @GetMapping("/padres")
    public List<Padre> padres(){
        return padreService.padres();
    }

    @PostMapping("/padres")
    public Padre savePadre(@RequestBody Padre padre){
        return padreService.savePadres(padre);
    }

    @GetMapping("/padres/{id}")
    public PadreModel getPadreById(@PathVariable Long id){
        PadreConverter padreConverter = new PadreConverter();
        return padreConverter.entityToModel(padreService.getPadre(id));
    }

    @PutMapping("padres/{id}")
    public Padre updatePadre(@RequestBody Padre padreNuevo, @PathVariable Long id){
        Padre padreViejo = padreService.getPadre(id);
        padreViejo.setNombrePadre(padreNuevo.getNombrePadre());
        padreViejo.setApellidoPadre(padreNuevo.getApellidoPadre());
        padreViejo.setEdadPadre(padreNuevo.getEdadPadre());
        padreService.savePadres(padreViejo);
        return padreViejo;
    }
}

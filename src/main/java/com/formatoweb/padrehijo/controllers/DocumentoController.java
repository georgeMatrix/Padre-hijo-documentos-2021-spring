package com.formatoweb.padrehijo.controllers;

import com.formatoweb.padrehijo.entity.Documento;
import com.formatoweb.padrehijo.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentoController {
    @Autowired
    private DocumentoService documentoService;

    @GetMapping("/documentos")
    public List<Documento> documentos(){
        return documentoService.documentos();
    }

    @PostMapping("/documentos")
    public Documento saveDocumentos(@RequestBody Documento documento){
        return documentoService.saveDocumento(documento);
    }
}

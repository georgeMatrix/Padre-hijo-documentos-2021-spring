package com.formatoweb.padrehijo.controllers;

import com.formatoweb.padrehijo.converters.DocumentoConverter;
import com.formatoweb.padrehijo.entity.Documento;
import com.formatoweb.padrehijo.models.DocumentoModel;
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
    @Autowired
    private DocumentoConverter documentoConverter;

    @GetMapping("/documentos")
    public List<Documento> documentos(){
        return documentoService.documentos();
    }

    @PostMapping("/documentos")
    public Documento saveDocumentos(@RequestBody Documento documento){
        return documentoService.saveDocumento(documento);
    }
    @GetMapping("/documentos/{id}")
    public DocumentoModel getDocumentoById(@PathVariable Long id){
        return documentoConverter.entityToModel(documentoService.getDocumentoById(id));
    }
}

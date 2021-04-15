package com.formatoweb.padrehijo.service.impl;

import com.formatoweb.padrehijo.entity.Documento;
import com.formatoweb.padrehijo.repository.DocumentoRepository;
import com.formatoweb.padrehijo.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentosServiceImpl implements DocumentoService {
    @Autowired
    private DocumentoRepository documentoRepository;

    @Override
    public List<Documento> documentos() {
        return documentoRepository.findAll();
    }

    @Override
    public Documento saveDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }
}

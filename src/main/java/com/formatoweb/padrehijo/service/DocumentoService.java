package com.formatoweb.padrehijo.service;

import com.formatoweb.padrehijo.entity.Documento;

import java.util.List;

public interface DocumentoService {
    List<Documento> documentos();
    Documento saveDocumento(Documento documento);
}

package com.formatoweb.padrehijo.converters;

import com.formatoweb.padrehijo.entity.Documento;
import com.formatoweb.padrehijo.models.DocumentoModel;
import org.springframework.stereotype.Component;

@Component
public class DocumentoConverter {
    public DocumentoModel entityToModel(Documento documento){
        DocumentoModel documentoModel = new DocumentoModel();
        documentoModel.setId(documento.getId());
        documentoModel.setCurp(documento.getCurp());
        documentoModel.setRfc(documento.getRfc());
        documentoModel.setPadreId(documento.getPadreById().getId());
        return documentoModel;
    }
}

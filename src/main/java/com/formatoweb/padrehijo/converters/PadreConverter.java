package com.formatoweb.padrehijo.converters;

import com.formatoweb.padrehijo.entity.Padre;
import com.formatoweb.padrehijo.models.PadreModel;
import org.springframework.stereotype.Component;

@Component
public class PadreConverter {
    public PadreModel entityToModel(Padre padre){
        PadreModel padreModel = new PadreModel();
        padreModel.setId(padre.getId());
        padreModel.setNombrePadre(padre.getNombrePadre());
        padreModel.setApellidoPadre(padre.getApellidoPadre());
        padreModel.setEdadPadre(padre.getEdadPadre());
        return padreModel;
    }
}

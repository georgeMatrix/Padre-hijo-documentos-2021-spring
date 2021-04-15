package com.formatoweb.padrehijo.converters;

import com.formatoweb.padrehijo.entity.Hijo;
import com.formatoweb.padrehijo.entity.Padre;
import com.formatoweb.padrehijo.models.HijoModel;

public class HijoConverter {
    public Hijo ModelToEntity(HijoModel hijoModel){
        Hijo hijo = new Hijo();
        hijo.setId(hijoModel.getId());
        hijo.setNombreHijo(hijoModel.getNombreHijo());
        hijo.setApellidoHijo(hijoModel.getApellidoHijo());
        hijo.setEdadHijo(hijoModel.getEdadHijo());
        Padre padre = new Padre();
        padre.setId(hijoModel.getIdPadre());
        hijo.setPadreByPadreId(padre);
        return hijo;
    }

    public HijoModel EntityToModel(Hijo hijo){
        HijoModel hijoModel = new HijoModel();
        hijoModel.setId(hijo.getId());
        hijoModel.setNombreHijo(hijo.getNombreHijo());
        hijoModel.setApellidoHijo(hijo.getApellidoHijo());
        hijoModel.setEdadHijo(hijo.getEdadHijo());
        hijoModel.setIdPadre(hijo.getPadreByPadreId().getId());
        return hijoModel;
    }
}

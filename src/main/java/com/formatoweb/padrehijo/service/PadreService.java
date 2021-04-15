package com.formatoweb.padrehijo.service;

import com.formatoweb.padrehijo.entity.Padre;

import java.util.List;

public interface PadreService {
    List<Padre> padres();
    Padre savePadres(Padre padre);
    Padre getPadre(Long id);
}

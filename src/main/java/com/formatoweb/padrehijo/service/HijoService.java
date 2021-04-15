package com.formatoweb.padrehijo.service;

import com.formatoweb.padrehijo.entity.Hijo;

import java.util.List;

public interface HijoService {
    List<Hijo> hijos();
    Hijo saveHijo(Hijo hijo);
    Hijo getHijoById(Long id);
}

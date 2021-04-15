package com.formatoweb.padrehijo.service.impl;

import com.formatoweb.padrehijo.entity.Hijo;
import com.formatoweb.padrehijo.repository.HijoRepository;
import com.formatoweb.padrehijo.service.HijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HijoServiceImpl implements HijoService {
    @Autowired
    private HijoRepository hijoRepository;

    @Override
    public List<Hijo> hijos() {
        return hijoRepository.findAll();
    }

    @Override
    public Hijo saveHijo(Hijo hijo) {
        return hijoRepository.save(hijo);
    }

    @Override
    public Hijo getHijoById(Long id) {
        return hijoRepository.findById(id).orElse(null);
    }
}

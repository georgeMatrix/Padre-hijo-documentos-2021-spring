package com.formatoweb.padrehijo.service.impl;

import com.formatoweb.padrehijo.entity.Padre;
import com.formatoweb.padrehijo.repository.PadreRepository;
import com.formatoweb.padrehijo.service.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadreServiceImpl implements PadreService {
    @Autowired
    private PadreRepository padreRepository;

    @Override
    public List<Padre> padres() {
        return padreRepository.findAll();
    }

    @Override
    public Padre savePadres(Padre padre) {
        return padreRepository.save(padre);
    }

    @Override
    public Padre getPadre(Long id) {
        return padreRepository.findById(id).orElse(null);
    }
}

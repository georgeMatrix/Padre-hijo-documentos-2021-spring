package com.formatoweb.padrehijo.repository;

import com.formatoweb.padrehijo.entity.Padre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PadreRepository extends JpaRepository<Padre, Long> {
}

package com.formatoweb.padrehijo.repository;

import com.formatoweb.padrehijo.entity.Hijo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HijoRepository extends JpaRepository<Hijo, Long> {
}

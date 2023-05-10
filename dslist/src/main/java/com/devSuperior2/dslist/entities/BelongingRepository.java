package com.devSuperior2.dslist.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {
    @Override
    Optional<Belonging> findById(BelongingPK belongingPK);
}
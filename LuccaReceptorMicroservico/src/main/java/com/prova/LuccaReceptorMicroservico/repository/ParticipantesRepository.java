package com.prova.LuccaReceptorMicroservico.repository;

import com.prova.LuccaReceptorMicroservico.entity.ParticipantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantesRepository extends JpaRepository<ParticipantesEntity, Long> {
}
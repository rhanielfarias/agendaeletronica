package com.agenda.agendadecontatos.repository;

import com.agenda.agendadecontatos.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<ContatosModel, Long> {
}

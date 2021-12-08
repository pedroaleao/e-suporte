package com.eservicos.demo1.eservicos.core.repository;

import com.eservicos.demo1.eservicos.core.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SevicoRepository extends JpaRepository<Servico,Long> {
}

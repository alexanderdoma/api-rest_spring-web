package api.suprafarma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.suprafarma.models.Medicamento;

@Repository
public interface IMedicamento extends JpaRepository<Medicamento, Integer>{

}

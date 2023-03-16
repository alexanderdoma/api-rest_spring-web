package api.suprafarma.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.suprafarma.models.Medicamento;
import api.suprafarma.repository.IMedicamento;

@Service
public class MedicamentoServicio implements IMedicamentoServicio{

	@Autowired
	IMedicamento objIMedicamento;
	
	@Override
	public List<Medicamento> obtenerTodo() {
		// TODO Auto-generated method stub
		return objIMedicamento.findAll();
	}

	@Override
	public Medicamento guardar(Medicamento medicamento) {
		return objIMedicamento.save(medicamento);
	}

	@Override
	public Medicamento obtenerPorId(Integer id) {
		return objIMedicamento.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		objIMedicamento.deleteById(id);
	}

}

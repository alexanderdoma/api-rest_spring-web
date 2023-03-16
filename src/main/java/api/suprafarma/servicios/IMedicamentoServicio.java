package api.suprafarma.servicios;

import java.util.List;

import api.suprafarma.models.Medicamento;

public interface IMedicamentoServicio {
	
	public List<Medicamento> obtenerTodo();
	
	public Medicamento guardar(Medicamento medicamento);
	
	public Medicamento obtenerPorId (Integer id);
	
	public void eliminar(Integer id);
}

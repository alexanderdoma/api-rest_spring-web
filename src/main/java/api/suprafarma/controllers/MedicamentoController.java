package api.suprafarma.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.suprafarma.models.Medicamento;
import api.suprafarma.servicios.MedicamentoServicio;

@RestController
@RequestMapping("/api")
public class MedicamentoController {

	@Autowired
	MedicamentoServicio objMedicamentoServicio;
	
	@GetMapping("/medicamentos")
	public List<Medicamento> obtenerTodo(){
		return objMedicamentoServicio.obtenerTodo();
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Medicamento> guardarMedicamento(@RequestBody Medicamento medicamento){
		Medicamento nuevo_medicamento = objMedicamentoServicio.guardar(medicamento);
		return new ResponseEntity<>(nuevo_medicamento, HttpStatus.CREATED);
	}
	
	@GetMapping("/medicamento/{id}")
	public ResponseEntity<Medicamento> obtenerMedicamentoId(@PathVariable Integer id){
		Medicamento MedicamentoPorId = objMedicamentoServicio.obtenerPorId(id);
		return ResponseEntity.ok(MedicamentoPorId);
	}
	
	@PutMapping("/medicamento/{id}")
	public ResponseEntity<Medicamento> actualizarMedicamento(@PathVariable Integer id, @RequestBody Medicamento medicamento){
		Medicamento medicamentoPorId = objMedicamentoServicio.obtenerPorId(id);
		medicamentoPorId.setNombre_medicamento(medicamento.getNombre_medicamento());
		medicamentoPorId.setNombre_comercial(medicamento.getNombre_comercial());
		medicamentoPorId.setDescripcion(medicamento.getDescripcion());
		medicamentoPorId.setForma_farmaceutica(medicamento.getForma_farmaceutica());
		medicamentoPorId.setDosis(medicamento.getDosis());
		medicamentoPorId.setPresentacion(medicamento.getPresentacion());
		medicamentoPorId.setVia_administracion(medicamento.getVia_administracion());
		medicamentoPorId.setFecha_caducidad(medicamento.getFecha_caducidad());
		medicamentoPorId.setProveedor(medicamento.getProveedor());
		medicamentoPorId.setPrecio(medicamento.getPrecio());
		medicamentoPorId.setStock(medicamento.getStock());
		
		Medicamento medicamento_actualizado = objMedicamentoServicio.guardar(medicamentoPorId);
		return new ResponseEntity<>(medicamento_actualizado, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/medicamento/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarMedicamento(@PathVariable Integer id){
		this.objMedicamentoServicio.eliminar(id);
		
		HashMap<String, Boolean> estadoMedicamentoEliminado = new HashMap<>();
		estadoMedicamentoEliminado.put("eliminado", true);
		return ResponseEntity.ok(estadoMedicamentoEliminado);
	}
}

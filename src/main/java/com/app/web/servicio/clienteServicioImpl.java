package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.web.entity.Cliente;
import com.app.web.repository.clienteRepositorio;

@Service
public class clienteServicioImpl implements clienteServicio {

	@Autowired
	private clienteRepositorio repositorio;

	@Override
	public List<Cliente> listarTodosLosClientes() {
		return repositorio.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		return repositorio.save(cliente);
	}

	@Override
	public Cliente obtenerClientePorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		return repositorio.save(cliente);
	}

	@Override
	public void eliminarCliente(Long id) {
		repositorio.deleteById(id);
	}

}

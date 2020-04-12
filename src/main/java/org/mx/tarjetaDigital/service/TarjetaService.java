package org.mx.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.mx.tarjetaDigital.model.Tarjeta;
@WebService
public interface TarjetaService {

	/**
	 * Metodo para Crear una tarjeta 
	 * @param tarjeta
	 * @return
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);

/** 
 * Metodo para obtener todas las tarjetas
 * @return
 */
	List<Tarjeta> obtenerTodas();
}

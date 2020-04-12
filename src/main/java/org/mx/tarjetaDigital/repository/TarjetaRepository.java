package org.mx.tarjetaDigital.repository;
import java.util.List;

import org.mx.tarjetaDigital.model.Tarjeta;

public interface TarjetaRepository {

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

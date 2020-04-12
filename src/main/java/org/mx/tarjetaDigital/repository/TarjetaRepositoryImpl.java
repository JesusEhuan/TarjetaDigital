package org.mx.tarjetaDigital.repository;

import java.util.ArrayList;
import java.util.List;

import org.mx.tarjetaDigital.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {
	
	private static List<Tarjeta> tarjetasDigitales= new ArrayList<Tarjeta>();

	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		System.out.println("Crear tarjeta ::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		System.out.println(":: Obtener todas las tarjetas ");
		return tarjetasDigitales;
	}

}

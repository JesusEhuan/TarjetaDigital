package org.mx.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.mx.tarjetaDigital.model.Tarjeta;
import org.mx.tarjetaDigital.repository.TarjetaRepository;
import org.mx.tarjetaDigital.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "org.mx.tarjetaDigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {
	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl(); 
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		return tarjetaRepository.obtenerTodas();
	}

}

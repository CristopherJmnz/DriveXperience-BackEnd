package es.tfg.drivex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.tfg.drivex.entitybeans.Reserva;
import es.tfg.drivex.repository.ReservaRepository;
@Service
public class ReservaServiceImpl implements ReservaService{

	
	@Autowired
	private ReservaRepository rrepo;
	
	
	@Override
	public Reserva altaReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return rrepo.save(reserva);
	}

}

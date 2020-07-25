package fulbito.app.modelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fulbito.app.modelos.dao.IPersonaDao;
import fulbito.app.modelos.entidades.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	@Transactional(readOnly=true) // puede omitirse, porque ya la hereda
	public List<Persona> listar() {

		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public List<Persona> insertar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> borrarPorId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
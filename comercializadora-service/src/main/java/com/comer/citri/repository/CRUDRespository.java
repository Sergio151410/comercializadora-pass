/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * CRUDRespository.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      9 oct. 2020 12:05:13	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de CRUDRespository.java
 */
package com.comer.citri.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.comer.citri.exception.DataAccessException;
import com.comer.citri.model.AltaProductosBean;
import com.comer.citri.model.BajaProductosBean;
import com.comer.citri.model.CatalogoProductosBean;
import com.comer.citri.model.ModificacionProductosBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Repository
public class CRUDRespository implements ICRUDRespository{

	@Override
	public HashMap<String, Object> altaProductos(AltaProductosBean alta) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> bajaProductos(BajaProductosBean baja) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> modifiacionProductos(ModificacionProductosBean mod) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> consultaProducto(CatalogoProductosBean consulta) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}

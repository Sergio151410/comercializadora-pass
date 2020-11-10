/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * CRUDClientesRepository.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 14:26:04	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de CRUDClientesRepository.java
 */
package com.comer.citri.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.comer.citri.constants.QueryConstants;
import com.comer.citri.exception.DataAccessException;
import com.comer.citri.global.model.ErroresBean;
import com.comer.citri.model.AltaClientesBean;
import com.comer.citri.model.BajaClientesBean;
import com.comer.citri.model.ClientesComercializadoraBean;
import com.comer.citri.model.ModificacionClienteBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Repository
public class CRUDClientesRepository implements ICRUDClientesRepository {
	
	/**
	 * Nombre LOGGER
	 * Tipo Logger
	 * Descripcion Declaracion de variable LOGGER de tipo Logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CRUDClientesRepository.class);

	/**
	 * Nombre jdbcTemplatePrincipal
	 * Tipo JdbcTemplate
	 * Descripcion Declaracion de variable jdbcTemplatePrincipal de tipo JdbcTemplate
	 */
	@Autowired
	@Qualifier("jdbcTemplateProcesos")
	private JdbcTemplate jdbcTemplateProcesos;

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param alta
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> altaClientes(AltaClientesBean alta) throws DataAccessException {
		LOGGER.info("altaClientes------------------------------------------------------BEGIN");
		int resultadoAlta = 0;
		Map<String, Object> response = new HashMap<String, Object>();
		resultadoAlta = jdbcTemplateProcesos.update(QueryConstants.QUERY_ALTA_CLIENTES, 
				alta.getIdCliente(),
				alta.getNombre(),
				alta.getApellidoPaterno(),
				alta.getApellidoMaterno(),
				alta.getRfc(),
				alta.getCurp(),
				alta.getDireccion(),
				alta.getDireccion(),
				alta.getTelefono());
		if (resultadoAlta == 1) {
			response.put("alta", "ALTA EXITOSA");
		}else {
			throw new DataAccessException(new ErroresBean("ERROR001", "OCURRIO UN ERROR AL PROCESAR LA ALTA..."));
		}
		LOGGER.info("altaClientes------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param baja
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> bajaClientes(BajaClientesBean baja) throws DataAccessException {
		LOGGER.info("bajaClientes------------------------------------------------------BEGIN");
		int resultadoAlta = 0;
		Map<String, Object> response = new HashMap<String, Object>();
		resultadoAlta = jdbcTemplateProcesos.update(QueryConstants.QUERY_BAJA_CLIENTES, 
				baja.getIdCliente(),
				baja.getNombre(),
				baja.getApellidoPaterno(),
				baja.getApellidoMaterno(),
				baja.getRfc(),
				baja.getCurp(),
				baja.getDireccion(),
				baja.getDireccion(),
				baja.getTelefono());
		if (resultadoAlta == 1) {
			response.put("baja", "BAJA EXITOSA");
		}else {
			throw new DataAccessException(new ErroresBean("ERROR001", "OCURRIO UN ERROR AL PROCESAR LA BAJA..."));
		}
		LOGGER.info("bajaClientes------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param mod
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> modifiacionClientes(ModificacionClienteBean mod) throws DataAccessException {
		LOGGER.info("modifiacionClientes------------------------------------------------------BEGIN");
		int resultadoAlta = 0;
		Map<String, Object> response = new HashMap<String, Object>();
		resultadoAlta = jdbcTemplateProcesos.update(QueryConstants.QUERY_UPDATE_CLIENTES, 
				mod.getIdCliente(),
				mod.getNombre(),
				mod.getApellidoPaterno(),
				mod.getApellidoMaterno(),
				mod.getRfc(),
				mod.getCurp(),
				mod.getDireccion(),
				mod.getDireccion(),
				mod.getTelefono());
		if (resultadoAlta == 1) {
			response.put("modificacion", "MODIFICACION EXITOSA");
		}else {
			throw new DataAccessException(new ErroresBean("ERROR001", "OCURRIO UN ERROR AL PROCESAR LA MODIFICACION..."));
		}
		LOGGER.info("modifiacionClientes------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo List<ClientesComercializadoraBean>
	 */
	@Override
	public List<ClientesComercializadoraBean> consultaClientes() throws DataAccessException {
		LOGGER.info("consultaClientes------------------------------------------------------BEGIN");
		List<ClientesComercializadoraBean> response = jdbcTemplateProcesos.query(QueryConstants.QUERY_CLIENTES, new ResultSetExtractor<List<ClientesComercializadoraBean>>() {
			/**
			 * Se mappea el resultado utilizando el ResultSetExtractor
			 * */
			@Override
			public List<ClientesComercializadoraBean> extractData(ResultSet rs) throws SQLException {
				List<ClientesComercializadoraBean> listClientes = new ArrayList<ClientesComercializadoraBean>();
				while(rs.next()) {
					ClientesComercializadoraBean clientes = new ClientesComercializadoraBean();
					clientes.setIdCliente(String.valueOf(rs.getBigDecimal("")));
					clientes.setNombre(rs.getString(""));
					clientes.setApellidoPaterno(rs.getString(""));
					clientes.setApellidoMaterno(rs.getString(""));
					clientes.setRfc(rs.getString(""));
					clientes.setCurp(rs.getString(""));
					clientes.setDireccion(rs.getString(""));
					clientes.setTelefono(rs.getString(""));
					listClientes.add(clientes);
				}
				return listClientes;
			}
			
		});
		LOGGER.info("consultaClientes------------------------------------------------------FINISH");
		return response;
	}

}

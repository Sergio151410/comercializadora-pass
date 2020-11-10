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
public class CRUDRespository implements ICRUDRespository {
	
	/**
	 * Nombre LOGGER
	 * Tipo Logger
	 * Descripcion Declaracion de variable LOGGER de tipo Logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CRUDRespository.class);
	
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
	 * Descripcion : Metodo el cual relizara la alta de productos.
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param alta propiedad de tipo AltaProductosBean, el cual contiene los datos de la peticion.
	 * @return retorna la propiedad de tipo Map, el cula contendra el resultado de la operacion.
	 * @throws DataAccessException Devuelve la propiedad del tipo DataAccessException, el cual arrojara un error de Base de datos.
	 */
	@Override
	public Map<String, Object> altaProductos(AltaProductosBean alta) throws DataAccessException {
		LOGGER.info("altaProductos--------------------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		int resultadoAlta = 0;
		resultadoAlta = jdbcTemplateProcesos.update(QueryConstants.QUERY_ALTA_PRODUCTOS, 
				alta.getIdProducto(),
				alta.getDescripcionProducto(),
				alta.getPrecioBase(),
				alta.getPrecionFinal());
		if (resultadoAlta == 1) {
			response.put("alta", "ALTA EXITOSA");
		}else {
			throw new DataAccessException(new ErroresBean("ERROR001", "OCURRIO UN ERROR AL PROCESAR LA ALTA..."));
		}
		LOGGER.info("altaProductos--------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param baja
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	@Override
	public Map<String, Object> bajaProductos(BajaProductosBean baja) throws DataAccessException {
		LOGGER.info("bajaProductos--------------------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		int resultadoAlta = 0;
		resultadoAlta = jdbcTemplateProcesos.update(QueryConstants.QUERY_ALTA_PRODUCTOS, 
				baja.getIdProducto(),
				baja.getDescripProducto(),
				baja.getPrecioBase(),
				baja.getPrecionFinal());
		if (resultadoAlta == 1) {
			response.put("alta", "BAJA EXITOSA");
		}else {
			throw new DataAccessException(new ErroresBean("ERROR001", "OCURRIO UN ERROR AL PROCESAR LA BAJA..."));
		}
		LOGGER.info("bajaProductos--------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param mod
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	@Override
	public Map<String, Object> modifiacionProductos(ModificacionProductosBean mod) throws DataAccessException {
		LOGGER.info("modifiacionProductos------------------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		int resultadoAlta = 0;
		resultadoAlta = jdbcTemplateProcesos.update(QueryConstants.QUERY_ALTA_PRODUCTOS, 
				mod.getIdProducto(),
				mod.getDescripProducto(),
				mod.getPrecioBase(),
				mod.getPrecionFinal());
		if (resultadoAlta == 1) {
			response.put("alta", "MODIFICACION EXITOSA");
		}else {
			throw new DataAccessException(new ErroresBean("ERROR001", "OCURRIO UN ERROR AL PROCESAR LA MODIFICACION..."));
		}
		LOGGER.info("modifiacionProductos------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	@Override
	public List<CatalogoProductosBean> consultaProducto() throws DataAccessException {
		LOGGER.info("consultaProducto------------------------------------------------------------BEGIN");
		List<CatalogoProductosBean> response = jdbcTemplateProcesos.query(QueryConstants.QUERY_PRODUCTOS, new ResultSetExtractor<List<CatalogoProductosBean>>() {
			/**
			 * Se mappea el resultado utilizando el ResultSetExtractor
			 * */
			@Override
			public List<CatalogoProductosBean> extractData(ResultSet rs) throws SQLException {
				List<CatalogoProductosBean> listProductos = new ArrayList<CatalogoProductosBean>();
				while(rs.next()) {
					CatalogoProductosBean producto = new CatalogoProductosBean();
					producto.setIdProducto(String.valueOf(rs.getBigDecimal("")));
					producto.setDescripProducto(rs.getString(""));
					producto.setPrecioBase(rs.getString(""));
					producto.setPrecionFinal(rs.getString(""));
					listProductos.add(producto);
				}
				return listProductos;
			}
			
		});
		LOGGER.info("consultaProducto------------------------------------------------------------FINISH");
		return response;
	}

}

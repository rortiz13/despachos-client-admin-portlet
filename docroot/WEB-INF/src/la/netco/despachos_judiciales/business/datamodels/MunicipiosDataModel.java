package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;
import la.netco.despachos_judiciales.utilitys.MunicipioWrapper;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class MunicipiosDataModel extends LazyDataModel<MunicipioWrapper> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(CircuitosDataModel.class);

	private Class<MunicipioWrapper> entityClass;
	private List<MunicipioWrapper> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public MunicipiosDataModel() {
		super();
	}

	@Override
	public List<MunicipioWrapper> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {
			rowCount = MunicipioLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_MUNICIPIO), (String) filtros.get(ConstantsUtility.FIELD_MUN_NOMBRE),
					(String) filtros.get(ConstantsUtility.FIELD_MUN_INDICATIVO), (Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO + "_ADM"), (Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO + "_DISC"));

			List<Municipio> listMunicipios = MunicipioLocalServiceUtil.findByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_MUNICIPIO), (String) filtros.get(ConstantsUtility.FIELD_MUN_NOMBRE),
					(String) filtros.get(ConstantsUtility.FIELD_MUN_INDICATIVO), (Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO + "_ADM"), (Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO + "_DISC"), first, first + pageSize);
			data = new ArrayList<MunicipioWrapper>();
			for (Municipio municipio : listMunicipios) {

				Circuito circuito = null;
				Circuito circuitoAdministrativo = null;
				Circuito circuitoDisciplinario = null;
				ConsejoSeccional consejoSeccional = null;
				if (municipio.getIdCircuito() != 0)
					circuito = CircuitoLocalServiceUtil.getCircuito(municipio.getIdCircuito());
				if (municipio.getIdCircuitoAdministrativo() != 0)
					circuitoAdministrativo = CircuitoLocalServiceUtil.getCircuito(municipio.getIdCircuitoAdministrativo());
				if (municipio.getIdCircuitoDisciplinario() != 0)
					circuitoDisciplinario = CircuitoLocalServiceUtil.getCircuito(municipio.getIdCircuitoDisciplinario());
				if (municipio.getIdConsejoSeccional() != 0)
					consejoSeccional = ConsejoSeccionalLocalServiceUtil.getConsejoSeccional(municipio.getIdConsejoSeccional());

				MunicipioWrapper tempMunicipio = new MunicipioWrapper(municipio, circuito, circuitoAdministrativo, circuitoDisciplinario,
						consejoSeccional);

				data.add(tempMunicipio);
			}

		} catch (Exception e) {
			_log.error("Error load Datamodel", e);
		}
		setPageSize(pageSize);
		return data;
	}

	@Override
	public int getRowCount() {
		int count = 0;
		try {
			if (rowCount == null) {
				rowCount = MunicipioLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO),
						(Integer) filtros.get(ConstantsUtility.FIELD_ID_MUNICIPIO), (String) filtros.get(ConstantsUtility.FIELD_MUN_NOMBRE),
						(String) filtros.get(ConstantsUtility.FIELD_MUN_INDICATIVO), (Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO),
						(Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO + "_ADM"),
						(Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),
						(Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO + "_DISC"));

			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	private Object getId(MunicipioWrapper t) {
		return t.getCodigo();
	}

	@Override
	public Object getRowKey(MunicipioWrapper object) {
		return getId(object);
	}

	@Override
	public MunicipioWrapper getRowData(String rowKey) {
		for (MunicipioWrapper object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<MunicipioWrapper> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<MunicipioWrapper> entityClass) {
		this.entityClass = entityClass;
	}

	public List<MunicipioWrapper> getData() {
		return data;
	}

	public void setData(List<MunicipioWrapper> data) {
		this.data = data;
	}

	public Map<String, Object> getFiltros() {
		return filtros;
	}

	public void setFiltros(Map<String, Object> filtros) {
		this.filtros = filtros;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

}

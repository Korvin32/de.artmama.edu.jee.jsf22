package de.artmama.edu.jee.jsf22.beans;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

public class LazyDataModelImpl extends LazyDataModel<UserData> {

	private static final long serialVersionUID = -5663998824412627883L;

	@Override
	public List<UserData> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		
		// TODO
		
		return Collections.EMPTY_LIST;
	}
}

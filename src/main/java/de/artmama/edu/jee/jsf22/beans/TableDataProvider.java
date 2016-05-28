package de.artmama.edu.jee.jsf22.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.jboss.logging.Logger;

@ManagedBean
@SessionScoped
public class TableDataProvider implements Serializable {

	private static final long serialVersionUID = 5961971956694077465L;

	private static final Logger LOG = Logger.getLogger(TableDataProvider.class);

	private List<UserData> userDatas;
	private UserData selectedUser;

	public List<UserData> getUserDatas() {
		return userDatas;
	}

	public void setUserDatas(List<UserData> userData) {
		this.userDatas = userData;
	}

	@PostConstruct
	public void init() {
		userDatas = new ArrayList<UserData>();
		UserData userData;
		for (int i = 0; i < 100; i++) {
			userData = new UserData(String.valueOf(i), "Korvin " + i,
					"Vyacheslavovich " + i, "korvin" + i + "@yahoo.com");
			userDatas.add(userData);
		}

	}

	public UserData getSelectedUser() {
		LOG.info("getSelectedUser(): " + selectedUser);
		return selectedUser;
	}

	public void setSelectedUser(UserData selectedUser) {
		LOG.info("setSelectedUser(" + selectedUser + ")");
		this.selectedUser = selectedUser;
	}

	public void deleteUser() {
		LOG.info("deleteUser(): " + selectedUser);
		userDatas.remove(selectedUser);
	}
}

package de.artmama.edu.jee.jsf22.behavior;

import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.behavior.ClientBehaviorContext;
import javax.faces.component.behavior.FacesBehavior;

import org.jboss.logging.Logger;

@FacesBehavior("de.artmama.edu.jee.jsf22.behavior.ConfirmationBehavior")
public class ConfirmationBehavior extends ClientBehaviorBase {

	private static final Logger LOG = Logger.getLogger(ConfirmationBehavior.class);
	
	@Override
	public String getScript(ClientBehaviorContext behaviorContext) {
		LOG.info("getScript().");
		return "return confirm('Are you sure');";
	}
	
}

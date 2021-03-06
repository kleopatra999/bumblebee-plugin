package com.agiletestware.bumblebee;

import java.io.Serializable;

import com.agiletestware.bumblebee.client.utils.BuildLogger;

import hudson.model.TaskListener;

/**
 * Implementation of {@link BuildLogger}.
 *
 * @author Sergey Oplavin
 *
 */
public class JenkinsBuildLogger implements BuildLogger, Serializable {

	/** . */
	private static final long serialVersionUID = 156495367236326713L;
	private final TaskListener listener;

	public JenkinsBuildLogger(final TaskListener listener) {
		this.listener = listener;
	}

	@Override
	public void debug(final String message) {
		listener.getLogger().println(message);
	}

	@Override
	public void info(final String message) {
		listener.getLogger().println(message);
	}

}

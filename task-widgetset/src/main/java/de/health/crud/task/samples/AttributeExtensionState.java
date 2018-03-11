package de.health.crud.task.samples;

import com.vaadin.shared.JavaScriptExtensionState;

import java.util.HashMap;

/**
 * Shared state class for {@link AttributeExtension} communication from server
 * to client.
 */
public class AttributeExtensionState extends JavaScriptExtensionState {
	private static final long serialVersionUID = 1L;
	public HashMap<String, String> attributes = new HashMap<String, String>();
}

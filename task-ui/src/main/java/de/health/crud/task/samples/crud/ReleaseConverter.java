package de.health.crud.task.samples.crud;

import com.vaadin.data.util.converter.StringToBooleanConverter;

/**
 * A converter that converts an boolean value to an symbol.
 * <p>
 * If the value is true it returns: "Yes"
 * <p>
 * If the value is false it returns: "No"
 *
 */
public class ReleaseConverter extends StringToBooleanConverter {

	private static final long serialVersionUID = 1L;

	@Override
	protected String getTrueString() {
		return "Yes";
	}

	@Override
	protected String getFalseString() {
		return "No";
	}

}

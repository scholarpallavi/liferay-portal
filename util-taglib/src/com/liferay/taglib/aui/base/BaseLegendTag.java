/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.taglib.aui.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @author Julio Camarero
 * @generated
 */
public class BaseLegendTag extends com.liferay.taglib.util.IncludeTag {

	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public java.lang.String getLabel() {
		return _label;
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
	}

	public void setLabel(java.lang.String label) {
		_label = label;

		setScopedAttribute("label", label);
	}

	protected void cleanUp() {
		_cssClass = null;
		_label = null;
	}

	protected String getPage() {
		return _PAGE;
	}

	protected void setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "cssClass", _cssClass);
		setNamespacedAttribute(request, "label", _label);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "aui:legend:";

	private static final String _PAGE =
		"/html/taglib/aui/legend/page.jsp";

	protected java.lang.String _cssClass;
	protected java.lang.String _label;

}
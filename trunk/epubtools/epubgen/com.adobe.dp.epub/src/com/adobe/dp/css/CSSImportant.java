package com.adobe.dp.css;

import java.io.PrintWriter;

public class CSSImportant extends CSSValue {

	private final Object value;

	CSSImportant(Object value) {
		this.value = value;
	}

	public void serialize(PrintWriter out) {
		serialize(out, value);
		out.print(" !important");
	}

	public Object getValue() {
		return value;
	}

	public int hashCode() {
		return value.hashCode() + 42;
	}

	public boolean equals(Object other) {
		if (other.getClass() == getClass()) {
			CSSImportant o = (CSSImportant) other;
			return o.value.equals(value);
		}
		return false;
	}
}

package com.zuehlke.contacts.ui.editor;

import com.zuehlke.contacts.service.dto.Customer;

public class CustomerEditorInput extends BasicEditorInput<Customer> {

	public CustomerEditorInput(Customer customer) {
		super(customer);
	}

	@Override
	public String getName() {
		// TODO error: editor doesn't show name anymore
		Customer customer = getObject();
		StringBuilder text = new StringBuilder();
		if (customer.getId() != null) {
			text.append(customer.getName());
		} else {
			text.append("New customer");
		}
		return text.toString();
	}

	@Override
	public String getToolTipText() {
		Customer customer = getObject();
		StringBuilder text = new StringBuilder();
		text.append(getName());
		if (customer.getId() != null) {
			text.append(" (").append(customer.getNumber()).append(")");
		}
		return text.toString();
	}
}

package org.vaadin.suggestfield.client;

import java.util.List;

import com.vaadin.shared.communication.ClientRpc;

public interface SuggestFieldClientRpc extends ClientRpc {

	void setSuggestion(List<SuggestFieldSuggestion> suggestions);
	
	
	void clearValueImmediate();
}

package org.vaadin.suggestfield.client;

import com.vaadin.shared.communication.ServerRpc;

public interface SuggestFieldServerRpc extends ServerRpc {
	
	void searchSuggestions(String query);

	void onSuggestionSelected(SuggestFieldSuggestion suggestion);
	
	void addNewSuggestion(String suggestion);
}

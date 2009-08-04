package com.paulhimes.skylon;

import java.util.*;

import com.paulhimes.skylon.chatactions.SimpleReplyChatAction;

public final class ChatActionLoader {

	private ChatActionLoader() {

	}

	public static List<ChatAction> loadActions() {
		// Load all the actions
		List<ChatAction> actions = new ArrayList<ChatAction>();
		actions.add(new SimpleReplyChatAction(RegexBuilder.anything(),
											  RegexBuilder.endsWith("\\(wave\\)"),
											  "(wave)"));

		return actions;
	}
}

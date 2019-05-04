package org.Zeesuper.commons.processors;

import org.Zeesuper.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}

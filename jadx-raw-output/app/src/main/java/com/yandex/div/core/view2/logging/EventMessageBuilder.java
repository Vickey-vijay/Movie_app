package com.yandex.div.core.view2.logging;

import lk.t;

/* JADX INFO: compiled from: EventMessageBuilder.kt */
/* JADX INFO: loaded from: classes8.dex */
public class EventMessageBuilder {
    private final StringBuilder consolidatedEvents = new StringBuilder();

    public final void appendEventMessage(String str, String str2) {
        if (this.consolidatedEvents.length() > 0) {
            this.consolidatedEvents.append(", ");
        }
        this.consolidatedEvents.append(str + " (" + str2 + ')');
    }

    public final String buildEventsLogMessage() {
        StringBuilder sb2 = this.consolidatedEvents;
        if (!(sb2.length() > 0)) {
            return null;
        }
        String string = sb2.toString();
        t.m(sb2);
        return string;
    }
}

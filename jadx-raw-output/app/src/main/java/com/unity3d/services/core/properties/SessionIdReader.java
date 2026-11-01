package com.unity3d.services.core.properties;

import ck.p;
import java.util.UUID;

/* JADX INFO: compiled from: SessionIdReader.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId;

    private SessionIdReader() {
    }

    static {
        String string = UUID.randomUUID().toString();
        p.i(string, "randomUUID().toString()");
        sessionId = string;
    }

    public final String getSessionId() {
        return sessionId;
    }
}

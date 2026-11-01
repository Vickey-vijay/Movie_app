package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class H {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "ALLOWED";
        }
        if (i10 == 2) {
            return "FORBIDDEN_BY_CLIENT_CONFIG";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "UNKNOWN";
        }
        return "FORBIDDEN_BY_REMOTE_CONFIG";
    }
}

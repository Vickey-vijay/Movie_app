package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4215gb extends JSONObject {
    public C4215gb() {
    }

    public C4215gb(String str) {
        super(str);
    }

    public final Long a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String b(String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (Throwable unused) {
            }
        }
        return "";
    }
}

package com.inmobi.media;

import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f23172a = {ck.s.i(new PropertyReference1Impl(Mh.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String str, String str2) {
        ck.p.j(str, "browser");
        ck.p.j(str2, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", str);
        jSONObject.put("event", str2);
        return jSONObject;
    }
}

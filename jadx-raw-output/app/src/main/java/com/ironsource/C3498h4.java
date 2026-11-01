package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3498h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29038a = "SSA_CORE.SDKController.runFunction";

    public static String a(C3516i4 c3516i4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f29038a, c3516i4.b(), a(c3516i4.c()), b(c3516i4));
    }

    private static String b(C3516i4 c3516i4) {
        if (c3516i4.d() != null && c3516i4.a() != null) {
            return String.format(", '%1$s', '%2$s'", c3516i4.d(), c3516i4.a());
        }
        return "";
    }

    private static String a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? "" : jSONObject.toString();
    }
}

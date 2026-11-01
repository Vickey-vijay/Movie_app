package com.ironsource;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f28026a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f28026a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(O9 o10) {
        if (o10.i()) {
            return C3714t8.e.Banner.toString();
        }
        if (o10.n()) {
            return C3714t8.e.RewardedVideo.toString();
        }
        return C3714t8.e.Interstitial.toString();
    }
}

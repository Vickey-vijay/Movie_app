package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C3676r4;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30928c = "com.ironsource.sdk.controller.g";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30929d = "functionName";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30930e = "params";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30931f = "hash";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f30932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f30933b;

    private void a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.i(f30928c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void b(String str, String str2, String str3) {
        this.f30932a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(f30928c, "messageHandler(" + str + Z7.f27998r + str3 + ")");
            if (this.f30933b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e10) {
            a(e10);
        }
    }

    public g(b bVar, s sVar) {
        this.f30932a = bVar;
        this.f30933b = sVar;
    }

    private void a(String str, String str2) throws Exception {
        this.f30932a.a(str, str2);
    }

    private void a(String str) {
        this.f30932a.b(str);
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("functionName", SDKUtils.encodeString(str));
            jSONObjectJsonObjectInit.put("params", SDKUtils.encodeString(str2));
            jSONObjectJsonObjectInit.put(f30931f, SDKUtils.encodeString(str3));
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit.toString();
    }
}

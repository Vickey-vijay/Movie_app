package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class I0 {
    public static String a(H0 h10) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", h10.f55284a).put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, h10.f55285b).put("reporterType", h10.f55286c.getStringValue()).put("processID", h10.f55287d).put("processSessionID", h10.f55288e).put("errorEnvironment", h10.f55289f).toString().getBytes(lk.c.f63591b), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static H0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), lk.c.f63591b));
            return new H0(jSONObject.getString("apiKey"), jSONObject.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.Z7;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z {
    public static void a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        w wVar = new w(u.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, str2);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", UnifiedMediationParams.KEY_DESCRIPTION, str2);
        }
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
    }

    public static void a(Throwable th2, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        w wVar = new w(u.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        String string2 = th2.getClass().toString();
        try {
            jSONObject.put("exception_name", string2);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", string2);
        }
        String message = th2.getMessage();
        try {
            jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, message);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", UnifiedMediationParams.KEY_DESCRIPTION, message);
        }
        try {
            jSONObject.put(Z7.f27985e, string);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", Z7.f27985e, string);
        }
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
    }
}

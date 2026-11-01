package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3664q8 implements InterfaceC3387b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30543b = "q8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C3664q8 f30544c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, K8> f30545a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.ironsource.q8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3647p8 f30546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f30547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30548c;

        public a(C3647p8 c3647p8, Context context, String str) {
            this.f30546a = c3647p8;
            this.f30547b = context;
            this.f30548c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3664q8.this.f30545a.put(this.f30548c, new C3555k8(this.f30546a, this.f30547b));
        }
    }

    public static synchronized C3664q8 a() {
        if (f30544c == null) {
            f30544c = new C3664q8();
        }
        return f30544c;
    }

    private C3520i8 b(JSONObject jSONObject) {
        C3520i8 c3520i8 = new C3520i8();
        try {
            return a(jSONObject);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return c3520i8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C3426d4.i.f28565s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : IronSourceVideoBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = IronSourceVideoBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f30543b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f30545a.containsKey(string)) {
            Logger.i(f30543b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        K8 k10 = this.f30545a.get(string);
        if (k10 != null) {
            k10.c(jSONObject, str, str2);
        }
    }

    private C3520i8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.getString(C3426d4.i.O));
            String string = jSONObjectJsonObjectInit.get("height").toString();
            String string2 = jSONObjectJsonObjectInit.get("width").toString();
            return new C3520i8(Integer.parseInt(string2), Integer.parseInt(string), jSONObjectJsonObjectInit.get("label").toString());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return new C3520i8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f30545a.containsKey(string)) {
                K8 k10 = this.f30545a.get(string);
                String string2 = jSONObject.getString(C3426d4.i.f28571v0);
                if (k10 != null) {
                    k10.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f30543b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f30543b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f30545a.containsKey(string)) {
                K8 k10 = this.f30545a.get(string);
                this.f30545a.remove(string);
                if (k10 != null) {
                    k10.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(f30543b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f30543b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC3573l8 interfaceC3573l8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C3520i8 c3520i8B = b(jSONObject);
            if (!this.f30545a.containsKey(string)) {
                C3647p8 c3647p8 = new C3647p8(interfaceC3573l8, context, string, c3520i8B);
                c3647p8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c3647p8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    V7.f27797a.d(new a(c3647p8, context, string));
                    return;
                } else {
                    this.f30545a.put(string, c3647p8);
                    return;
                }
            }
            Logger.i(f30543b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(f30543b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC3387b1
    public K8 a(String str) {
        if (str.isEmpty() || !this.f30545a.containsKey(str)) {
            return null;
        }
        return this.f30545a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f30545a.containsKey(string)) {
                K8 k10 = this.f30545a.get(string);
                if (k10 != null) {
                    k10.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f30543b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f30543b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}

package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C3490ge;
import com.ironsource.C3633oc;
import com.ironsource.C3676r4;
import com.ironsource.InterfaceC3666qa;
import com.ironsource.Zf;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31060d = "u";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f31061e = "updateToken";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31062f = "getToken";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f31063g = "functionName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f31064h = "functionParams";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f31065i = "success";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f31066j = "fail";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31068b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3633oc f31067a = new C3633oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Zf f31069c = new Zf();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f31071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f31073d;

        private a() {
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f31070a = jSONObjectJsonObjectInit.optString("functionName");
        aVar.f31071b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        aVar.f31072c = jSONObjectJsonObjectInit.optString("success");
        aVar.f31073d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }

    public u(Context context) {
        this.f31068b = context;
    }

    public void a(String str, InterfaceC3666qa interfaceC3666qa) throws Exception {
        a aVarA = a(str);
        if (f31061e.equals(aVarA.f31070a)) {
            a(aVarA.f31071b, aVarA, interfaceC3666qa);
            return;
        }
        if (f31062f.equals(aVarA.f31070a)) {
            a(aVarA, interfaceC3666qa);
            return;
        }
        Logger.i(f31060d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC3666qa interfaceC3666qa) {
        C3490ge c3490ge = new C3490ge();
        try {
            this.f31067a.a(jSONObject);
            interfaceC3666qa.a(true, aVar.f31072c, c3490ge);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f31060d, "updateToken exception " + e10.getMessage());
            interfaceC3666qa.a(false, aVar.f31073d, c3490ge);
        }
    }

    private void a(a aVar, InterfaceC3666qa interfaceC3666qa) {
        try {
            JSONObject jSONObjectA = this.f31069c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC3666qa.a(true, aVar.f31072c, jSONObjectA);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            interfaceC3666qa.a(false, aVar.f31073d, e10.getMessage());
        }
    }
}

package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C1;
import com.ironsource.C3490ge;
import com.ironsource.C3676r4;
import com.ironsource.InterfaceC3666qa;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31038b = "q";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31039c = "getPermissions";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31040d = "isPermissionGranted";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f31041e = "permissions";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31042f = "permission";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f31043g = "status";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f31044h = "functionName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f31045i = "functionParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f31046j = "success";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f31047k = "fail";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f31048l = "unhandledPermission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31049a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f31051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f31053d;

        private a() {
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f31050a = jSONObjectJsonObjectInit.optString("functionName");
        aVar.f31051b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        aVar.f31052c = jSONObjectJsonObjectInit.optString("success");
        aVar.f31053d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC3666qa interfaceC3666qa) {
        C3490ge c3490ge = new C3490ge();
        try {
            String string = jSONObject.getString(f31042f);
            c3490ge.b(f31042f, string);
            if (C1.d(this.f31049a, string)) {
                c3490ge.b("status", String.valueOf(C1.c(this.f31049a, string)));
                interfaceC3666qa.a(true, aVar.f31052c, c3490ge);
            } else {
                c3490ge.b("status", f31048l);
                interfaceC3666qa.a(false, aVar.f31053d, c3490ge);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            c3490ge.b("errMsg", e10.getMessage());
            interfaceC3666qa.a(false, aVar.f31053d, c3490ge);
        }
    }

    public q(Context context) {
        this.f31049a = context;
    }

    public void a(String str, InterfaceC3666qa interfaceC3666qa) throws Exception {
        a aVarA = a(str);
        if (f31039c.equals(aVarA.f31050a)) {
            a(aVarA.f31051b, aVarA, interfaceC3666qa);
            return;
        }
        if (f31040d.equals(aVarA.f31050a)) {
            b(aVarA.f31051b, aVarA, interfaceC3666qa);
            return;
        }
        Logger.i(f31038b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC3666qa interfaceC3666qa) {
        C3490ge c3490ge = new C3490ge();
        try {
            c3490ge.a(f31041e, C1.a(this.f31049a, jSONObject.getJSONArray(f31041e)));
            interfaceC3666qa.a(true, aVar.f31052c, c3490ge);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f31038b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
            c3490ge.b("errMsg", e10.getMessage());
            interfaceC3666qa.a(false, aVar.f31053d, c3490ge);
        }
    }
}

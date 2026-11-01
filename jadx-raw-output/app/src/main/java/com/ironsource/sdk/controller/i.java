package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.B7;
import com.ironsource.C3426d4;
import com.ironsource.C3490ge;
import com.ironsource.InterfaceC3666qa;
import com.ironsource.Lb;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30943c = "i";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30944d = "getDeviceData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30945e = "deviceDataFunction";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30946f = "deviceDataParams";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30947g = "success";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30948h = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f30949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f30950b = Lb.U().i();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f30952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30954d;

        private a() {
        }
    }

    public void a(String str, InterfaceC3666qa interfaceC3666qa) throws Exception {
        a aVarA = a(str);
        if (f30944d.equals(aVarA.f30951a)) {
            interfaceC3666qa.a(true, aVarA.f30953c, a());
            return;
        }
        Logger.i(f30943c, "unhandled API request " + str);
    }

    public i(Context context) {
        this.f30949a = context;
    }

    private C3490ge a() {
        C3490ge c3490ge = new C3490ge();
        c3490ge.b(SDKUtils.encodeString(C3426d4.j.f28597i0), SDKUtils.encodeString(String.valueOf(this.f30950b.j())));
        c3490ge.b(SDKUtils.encodeString(C3426d4.j.f28599j0), SDKUtils.encodeString(String.valueOf(this.f30950b.q(this.f30949a))));
        c3490ge.b(SDKUtils.encodeString(C3426d4.j.f28601k0), SDKUtils.encodeString(String.valueOf(this.f30950b.C(this.f30949a))));
        c3490ge.b(SDKUtils.encodeString(C3426d4.j.f28603l0), SDKUtils.encodeString(String.valueOf(this.f30950b.D(this.f30949a))));
        c3490ge.b(SDKUtils.encodeString(C3426d4.j.f28605m0), SDKUtils.encodeString(String.valueOf(this.f30950b.e(this.f30949a))));
        c3490ge.b(SDKUtils.encodeString(C3426d4.j.f28607n0), SDKUtils.encodeString(String.valueOf(this.f30950b.h(this.f30949a))));
        return c3490ge;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f30951a = jSONObjectJsonObjectInit.optString(f30945e);
        aVar.f30952b = jSONObjectJsonObjectInit.optJSONObject(f30946f);
        aVar.f30953c = jSONObjectJsonObjectInit.optString("success");
        aVar.f30954d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }
}

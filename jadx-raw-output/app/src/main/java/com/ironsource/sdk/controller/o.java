package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3490ge;
import com.ironsource.C3676r4;
import com.ironsource.Gc;
import com.ironsource.InterfaceC3666qa;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31006c = "o";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31007d = "activate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f31008e = "startSession";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31009f = "finishSession";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f31010g = "impressionOccurred";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f31011h = "getOmidData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f31012i = "omidFunction";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f31013j = "omidParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f31014k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f31015l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f31016m = "%s | unsupported OMID API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gc f31018b = new Gc();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f31020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f31022d;

        private a() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, InterfaceC3666qa interfaceC3666qa) throws Exception {
        a aVarA = a(str);
        C3490ge c3490ge = new C3490ge();
        JSONObject jSONObject = aVarA.f31020b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                c3490ge.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = aVarA.f31019a;
            byte b10 = -1;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(f31007d)) {
                        b10 = 0;
                    }
                    break;
                case -984459207:
                    if (str2.equals(f31011h)) {
                        b10 = 4;
                    }
                    break;
                case 70701699:
                    if (str2.equals(f31009f)) {
                        b10 = 2;
                    }
                    break;
                case 1208109646:
                    if (str2.equals(f31010g)) {
                        b10 = 3;
                    }
                    break;
                case 1850541012:
                    if (str2.equals(f31008e)) {
                        b10 = 1;
                    }
                    break;
            }
            if (b10 == 0) {
                this.f31018b.a(this.f31017a);
                c3490ge = this.f31018b.a();
            } else if (b10 == 1) {
                this.f31018b.d(aVarA.f31020b);
            } else if (b10 == 2) {
                this.f31018b.b(aVarA.f31020b);
            } else if (b10 == 3) {
                this.f31018b.c(aVarA.f31020b);
            } else {
                if (b10 != 4) {
                    throw new IllegalArgumentException(String.format(f31016m, aVarA.f31019a));
                }
                c3490ge = this.f31018b.a();
            }
            interfaceC3666qa.a(true, aVarA.f31021c, c3490ge);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            c3490ge.b("errMsg", e10.getMessage());
            Logger.i(f31006c, "OMIDJSAdapter " + aVarA.f31019a + " Exception: " + e10.getMessage());
            interfaceC3666qa.a(false, aVarA.f31022d, c3490ge);
        }
    }

    public o(Context context) {
        this.f31017a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f31019a = jSONObjectJsonObjectInit.optString(f31012i);
        aVar.f31020b = jSONObjectJsonObjectInit.optJSONObject(f31013j);
        aVar.f31021c = jSONObjectJsonObjectInit.optString("success");
        aVar.f31022d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }
}

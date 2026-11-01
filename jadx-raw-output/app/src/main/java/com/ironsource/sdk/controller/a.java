package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3490ge;
import com.ironsource.C3664q8;
import com.ironsource.C3676r4;
import com.ironsource.InterfaceC3573l8;
import com.ironsource.InterfaceC3666qa;
import com.ironsource.Ng;
import com.ironsource.sg;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a implements InterfaceC3573l8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30793d = "loadWithUrl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30794e = "sendMessage";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30795f = "removeAdView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f30796g = "webviewAction";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f30797h = "handleGetViewVisibility";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30798i = "functionName";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30799j = "functionParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30800k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f30801l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f30802m = "errMsg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f30803n = "%s | unsupported AdViews API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ng f30804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3664q8 f30805b = C3664q8.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f30806c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    public static class C0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f30808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30810d;

        private C0281a() {
        }
    }

    public void a(Ng ng2) {
        this.f30804a = ng2;
    }

    @Override // com.ironsource.InterfaceC3573l8
    public void a(String str, JSONObject jSONObject) {
        if (this.f30804a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f30804a.a(str, jSONObject);
    }

    public a(Context context) {
        this.f30806c = context;
    }

    @Override // com.ironsource.InterfaceC3573l8
    public void a(String str, String str2, String str3) {
        a(str, sg.a(str2, str3));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, InterfaceC3666qa interfaceC3666qa) throws Exception {
        C0281a c0281aA = a(str);
        C3490ge c3490ge = new C3490ge();
        try {
            String str2 = c0281aA.f30807a;
            byte b10 = -1;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f30795f)) {
                        b10 = 2;
                    }
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        b10 = 1;
                    }
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        b10 = 0;
                    }
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        b10 = 3;
                    }
                    break;
                case 1491535759:
                    if (str2.equals(f30796g)) {
                        b10 = 4;
                    }
                    break;
            }
            if (b10 == 0) {
                this.f30805b.a(this, c0281aA.f30808b, this.f30806c, c0281aA.f30809c, c0281aA.f30810d);
                return;
            }
            if (b10 == 1) {
                this.f30805b.d(c0281aA.f30808b, c0281aA.f30809c, c0281aA.f30810d);
                return;
            }
            if (b10 == 2) {
                this.f30805b.c(c0281aA.f30808b, c0281aA.f30809c, c0281aA.f30810d);
            } else {
                if (b10 != 3) {
                    if (b10 == 4) {
                        this.f30805b.b(c0281aA.f30808b, c0281aA.f30809c, c0281aA.f30810d);
                        return;
                    }
                    throw new IllegalArgumentException(String.format(f30803n, c0281aA.f30807a));
                }
                this.f30805b.a(c0281aA.f30808b, c0281aA.f30809c, c0281aA.f30810d);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            c3490ge.b("errMsg", e10.getMessage());
            String strC = this.f30805b.c(c0281aA.f30808b);
            if (!TextUtils.isEmpty(strC)) {
                c3490ge.b("adViewId", strC);
            }
            interfaceC3666qa.a(false, c0281aA.f30810d, c3490ge);
        }
    }

    private C0281a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        C0281a c0281a = new C0281a();
        c0281a.f30807a = jSONObjectJsonObjectInit.optString("functionName");
        c0281a.f30808b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        c0281a.f30809c = jSONObjectJsonObjectInit.optString("success");
        c0281a.f30810d = jSONObjectJsonObjectInit.optString("fail");
        return c0281a;
    }
}

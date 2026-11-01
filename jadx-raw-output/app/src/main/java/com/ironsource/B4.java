package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class B4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26031c = "B4";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f26032d = "setSharedSignal";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26033e = "getSharedSignal";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26034f = "functionName";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f26035g = "functionParams";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f26036h = "success";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f26037i = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A4 f26039b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f26041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f26042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26043d;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f26040a = jSONObject.optString("functionName");
            aVar.f26041b = jSONObject.optJSONObject("functionParams");
            aVar.f26042c = jSONObject.optString("success");
            aVar.f26043d = jSONObject.optString("fail");
            return aVar;
        }

        private a() {
        }
    }

    private a a(String str) throws JSONException {
        return a.a(IronSourceVideoBridge.jsonObjectInit(str));
    }

    private void b(Context context, a aVar, InterfaceC3666qa interfaceC3666qa) {
        C3490ge c3490ge = new C3490ge();
        JSONObject jSONObject = aVar.f26041b;
        this.f26039b.a(context, EnumC3812z4.a(jSONObject.optString("source")), jSONObject.optString(C3426d4.i.W), jSONObject.optString("data"));
        interfaceC3666qa.a(true, aVar.f26042c, c3490ge);
    }

    public B4(Context context, A4 a10) {
        this.f26038a = context;
        this.f26039b = a10;
    }

    public void a(String str, InterfaceC3666qa interfaceC3666qa) throws Exception {
        a aVarA = a(str);
        try {
            String str2 = aVarA.f26040a;
            byte b10 = -1;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(f26032d)) {
                    b10 = 0;
                }
            } else if (str2.equals(f26033e)) {
                b10 = 1;
            }
            if (b10 == 0) {
                b(this.f26038a, aVarA, interfaceC3666qa);
            } else {
                if (b10 == 1) {
                    a(this.f26038a, aVarA, interfaceC3666qa);
                    return;
                }
                throw new UnsupportedOperationException("unsupported API: " + str);
            }
        } catch (Exception e10) {
            a(aVarA, interfaceC3666qa, e10);
        }
    }

    private void a(Context context, a aVar, InterfaceC3666qa interfaceC3666qa) {
        C3490ge c3490ge = new C3490ge();
        JSONObject jSONObject = aVar.f26041b;
        c3490ge.b("data", this.f26039b.a(context, EnumC3812z4.a(jSONObject.optString("source")), jSONObject.optString(C3426d4.i.W)));
        interfaceC3666qa.a(true, aVar.f26042c, c3490ge);
    }

    private void a(a aVar, InterfaceC3666qa interfaceC3666qa, Exception exc) {
        C3676r4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(f26031c, aVar.f26040a + " exception " + message);
        C3490ge c3490ge = new C3490ge();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c3490ge.b("error", message);
        interfaceC3666qa.a(false, aVar.f26043d, c3490ge);
    }
}

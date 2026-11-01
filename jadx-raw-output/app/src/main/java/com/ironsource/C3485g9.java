package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3485g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3485g9 f29007a = new C3485g9();

    public static final JSONObject a() throws JSONException {
        new X9().b(ContextProvider.getInstance().getApplicationContext());
        String string = new C3467f9().a().toString();
        ck.p.i(string, "InitProvider().getInitData().toString()");
        Pe.c(string);
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("data", N9.e(C3644p5.b().c(), string));
        ck.p.i(jSONObjectPut, "encodedJsonInitResponse");
        return jSONObjectPut;
    }

    private C3485g9() {
    }
}

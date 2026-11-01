package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3633oc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f30356b = Lb.U().i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U6 f30355a = new U6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f30355a.a(Q6.f27451n, Boolean.valueOf(this.f30356b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f30355a.a(Q6.f27436i, IronSourceVideoBridge.jsonObjectInit(controllerConfig).opt(C3426d4.a.f28424q));
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void c() {
        this.f30355a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f30355a.a(Q6.V, "9.2.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(Q6.E, Gc.f26642f);
        map.put(Q6.D, Gc.f26641e);
        this.f30355a.a(map);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f30355a.a("debug", jSONObject);
        }
    }

    public void b(Context context) {
        this.f30355a.a("gpi", Boolean.valueOf(C3399bd.e(context)));
    }

    public void a(JSONObject jSONObject) {
        this.f30355a.a(Q6.f27445l, jSONObject);
    }

    public void a(C3714t8.c cVar) {
        this.f30355a.a(Q6.f27486y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f30355a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.f30355a.a(Q6.B1, list);
    }

    public void a(boolean z10) {
        this.f30355a.a(Q6.S0, Boolean.valueOf(z10));
    }
}

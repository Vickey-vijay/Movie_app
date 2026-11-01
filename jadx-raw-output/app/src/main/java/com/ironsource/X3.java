package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X3 implements InterfaceC3764w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3747v7 f27867a;

    public JSONObject a(Context context) {
        return this.f27867a.c(context);
    }

    @Override // com.ironsource.InterfaceC3764w7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC3764w7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.f27867a.b(context);
    }

    @Override // com.ironsource.InterfaceC3764w7
    public void b(String str, JSONObject jSONObject) {
    }

    private InterfaceC3747v7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C3426d4.j.f28593g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        return !C1.c(context, "android.permission.ACCESS_NETWORK_STATE") ? new BroadcastReceiverStrategy(this) : new C3524ic(this);
    }

    public void b() {
        this.f27867a.a();
    }

    public void c(Context context) {
        this.f27867a.a(context);
    }

    public X3(JSONObject jSONObject, Context context) {
        this.f27867a = a(jSONObject, context);
        Logger.i(X3.class.getSimpleName(), "created ConnectivityAdapter with strategy " + this.f27867a.getClass().getSimpleName());
    }
}

package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3699sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3666qa f30726a;

    public void a(C3682ra c3682ra, JSONObject jSONObject) {
        this.f30726a.a(false, c3682ra.a(), jSONObject);
    }

    public void b(C3682ra c3682ra, JSONObject jSONObject) {
        this.f30726a.a(true, c3682ra.d(), jSONObject);
    }

    public C3699sa(InterfaceC3666qa interfaceC3666qa) {
        this.f30726a = interfaceC3666qa;
    }
}

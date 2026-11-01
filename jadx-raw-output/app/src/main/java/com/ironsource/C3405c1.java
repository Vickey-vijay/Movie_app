package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3405c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkSettings f28290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f28291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IronSource.a f28292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28296g;

    public String a() {
        return this.f28290a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.f28292c;
    }

    public JSONObject c() {
        return this.f28291b;
    }

    public int d() {
        return this.f28295f;
    }

    public int e() {
        return this.f28296g;
    }

    public String f() {
        return this.f28290a.getProviderName();
    }

    public String g() {
        return this.f28290a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f28290a;
    }

    public String i() {
        return this.f28290a.getSubProviderId();
    }

    public boolean j() {
        return this.f28293d;
    }

    public boolean k() {
        return this.f28294e;
    }

    public C3405c1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        boolean z10;
        this.f28290a = networkSettings;
        this.f28291b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f28295f = iOptInt;
        if (iOptInt == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28293d = z10;
        this.f28294e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f28296g = jSONObject.optInt(Ne.f27129e2, 99);
        this.f28292c = aVar;
    }
}

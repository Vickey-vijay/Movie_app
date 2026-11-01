package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3716ta implements Me<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Me<String> f31306a;

    public C3716ta(Me<String> me2) {
        ck.p.j(me2, "serverResponse");
        this.f31306a = me2;
    }

    @Override // com.ironsource.Me
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return IronSourceVideoBridge.jsonObjectInit(this.f31306a.a());
    }
}

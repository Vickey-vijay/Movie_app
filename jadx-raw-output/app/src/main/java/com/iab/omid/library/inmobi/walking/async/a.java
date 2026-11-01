package com.iab.omid.library.inmobi.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f21718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f21719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21720e;

    public a(b.InterfaceC0229b interfaceC0229b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0229b);
        this.f21718c = new HashSet<>(hashSet);
        this.f21719d = jSONObject;
        this.f21720e = j10;
    }
}

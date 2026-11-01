package com.iab.omid.library.appodeal.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f21191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f21192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21193e;

    public a(b.InterfaceC0213b interfaceC0213b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0213b);
        this.f21191c = new HashSet<>(hashSet);
        this.f21192d = jSONObject;
        this.f21193e = j10;
    }
}

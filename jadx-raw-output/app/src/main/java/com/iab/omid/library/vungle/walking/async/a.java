package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f22257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f22258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22259e;

    public a(b.InterfaceC0246b interfaceC0246b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0246b);
        this.f22257c = new HashSet<>(hashSet);
        this.f22258d = jSONObject;
        this.f22259e = j10;
    }
}

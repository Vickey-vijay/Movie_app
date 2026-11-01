package com.iab.omid.library.ironsrc.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f21853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f21854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21855e;

    public a(b.InterfaceC0233b interfaceC0233b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0233b);
        this.f21853c = new HashSet<>(hashSet);
        this.f21854d = jSONObject;
        this.f21855e = j10;
    }
}

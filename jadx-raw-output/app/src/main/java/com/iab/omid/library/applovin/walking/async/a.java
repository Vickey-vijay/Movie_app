package com.iab.omid.library.applovin.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f21056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f21057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21058e;

    public a(b.InterfaceC0209b interfaceC0209b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0209b);
        this.f21056c = new HashSet<>(hashSet);
        this.f21057d = jSONObject;
        this.f21058e = j10;
    }
}

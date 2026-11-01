package com.iab.omid.library.fyber.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f21577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f21578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21579e;

    public a(b.InterfaceC0224b interfaceC0224b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0224b);
        this.f21577c = new HashSet<>(hashSet);
        this.f21578d = jSONObject;
        this.f21579e = j10;
    }
}

package com.iab.omid.library.mmadbridge.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f21988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f21989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21990e;

    public a(b.InterfaceC0237b interfaceC0237b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0237b);
        this.f21988c = new HashSet<>(hashSet);
        this.f21989d = jSONObject;
        this.f21990e = j10;
    }
}

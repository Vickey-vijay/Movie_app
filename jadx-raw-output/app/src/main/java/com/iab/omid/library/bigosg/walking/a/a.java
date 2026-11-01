package com.iab.omid.library.bigosg.walking.a;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<String> f21312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f21313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21314c;

    public a(b.InterfaceC0216b interfaceC0216b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0216b);
        this.f21312a = new HashSet<>(hashSet);
        this.f21313b = jSONObject;
        this.f21314c = j10;
    }
}

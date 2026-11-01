package com.iab.omid.library.bytedance2.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f21441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f21442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21443e;

    public a(b.InterfaceC0220b interfaceC0220b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0220b);
        this.f21441c = new HashSet<>(hashSet);
        this.f21442d = jSONObject;
        this.f21443e = j10;
    }
}

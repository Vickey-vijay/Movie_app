package com.iab.omid.library.unity3d.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f22116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f22117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22118e;

    public a(b.InterfaceC0241b interfaceC0241b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0241b);
        this.f22116c = new HashSet<>(hashSet);
        this.f22117d = jSONObject;
        this.f22118e = j10;
    }
}

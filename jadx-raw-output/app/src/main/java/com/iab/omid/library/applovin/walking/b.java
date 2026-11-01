package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.applovin.walking.async.b.InterfaceC0209b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f21066b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f21066b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0209b
    @VisibleForTesting
    public JSONObject a() {
        return this.f21065a;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0209b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f21065a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21066b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f21066b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21066b.b(new f(this, hashSet, jSONObject, j10));
    }
}

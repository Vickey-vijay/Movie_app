package com.iab.omid.library.mmadbridge.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b implements com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0237b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f21998b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f21998b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0237b
    @VisibleForTesting
    public JSONObject a() {
        return this.f21997a;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0237b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f21997a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21998b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f21998b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21998b.b(new f(this, hashSet, jSONObject, j10));
    }
}

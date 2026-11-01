package com.iab.omid.library.fyber.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.walking.async.d;
import com.iab.omid.library.fyber.walking.async.e;
import com.iab.omid.library.fyber.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b implements com.iab.omid.library.fyber.walking.async.b.InterfaceC0224b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.walking.async.c f21587b;

    public b(com.iab.omid.library.fyber.walking.async.c cVar) {
        this.f21587b = cVar;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0224b
    @VisibleForTesting
    public JSONObject a() {
        return this.f21586a;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0224b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f21586a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21587b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f21587b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21587b.b(new f(this, hashSet, jSONObject, j10));
    }
}

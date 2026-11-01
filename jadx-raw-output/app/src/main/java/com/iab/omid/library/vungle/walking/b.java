package com.iab.omid.library.vungle.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b implements com.iab.omid.library.vungle.walking.async.b.InterfaceC0246b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f22266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.async.c f22267b;

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.f22267b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0246b
    @VisibleForTesting
    public JSONObject a() {
        return this.f22266a;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0246b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f22266a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f22267b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f22267b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f22267b.b(new f(this, hashSet, jSONObject, j10));
    }
}

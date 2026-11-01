package com.iab.omid.library.inmobi.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.inmobi.walking.async.d;
import com.iab.omid.library.inmobi.walking.async.e;
import com.iab.omid.library.inmobi.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.iab.omid.library.inmobi.walking.async.b.InterfaceC0229b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.async.c f21728b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.f21728b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0229b
    @VisibleForTesting
    public JSONObject a() {
        return this.f21727a;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0229b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f21727a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21728b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f21728b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21728b.b(new f(this, hashSet, jSONObject, j10));
    }
}

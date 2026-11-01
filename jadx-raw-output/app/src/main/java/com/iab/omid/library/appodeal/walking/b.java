package com.iab.omid.library.appodeal.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.walking.async.d;
import com.iab.omid.library.appodeal.walking.async.e;
import com.iab.omid.library.appodeal.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class b implements com.iab.omid.library.appodeal.walking.async.b.InterfaceC0213b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.walking.async.c f21201b;

    public b(com.iab.omid.library.appodeal.walking.async.c cVar) {
        this.f21201b = cVar;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0213b
    @VisibleForTesting
    public JSONObject a() {
        return this.f21200a;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0213b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f21200a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21201b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f21201b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21201b.b(new f(this, hashSet, jSONObject, j10));
    }
}

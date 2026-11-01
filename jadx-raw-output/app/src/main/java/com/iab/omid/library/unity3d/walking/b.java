package com.iab.omid.library.unity3d.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b implements com.iab.omid.library.unity3d.walking.async.b.InterfaceC0241b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f22125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.walking.async.c f22126b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.f22126b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0241b
    @VisibleForTesting
    public JSONObject a() {
        return this.f22125a;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0241b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f22125a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f22126b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f22126b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f22126b.b(new f(this, hashSet, jSONObject, j10));
    }
}

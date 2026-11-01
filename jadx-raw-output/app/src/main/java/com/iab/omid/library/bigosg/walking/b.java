package com.iab.omid.library.bigosg.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.walking.a.d;
import com.iab.omid.library.bigosg.walking.a.e;
import com.iab.omid.library.bigosg.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b implements com.iab.omid.library.bigosg.walking.a.b.InterfaceC0216b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.walking.a.c f21322b;

    public b(com.iab.omid.library.bigosg.walking.a.c cVar) {
        this.f21322b = cVar;
    }

    public void a() {
        this.f21322b.b(new d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0216b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f21321a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21322b.b(new f(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0216b
    @VisibleForTesting
    public JSONObject b() {
        return this.f21321a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21322b.b(new e(this, hashSet, jSONObject, j10));
    }
}

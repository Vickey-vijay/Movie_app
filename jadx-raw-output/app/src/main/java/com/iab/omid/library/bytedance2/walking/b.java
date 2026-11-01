package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b implements com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0220b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f21451b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f21451b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0220b
    @VisibleForTesting
    public JSONObject a() {
        return this.f21450a;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0220b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f21450a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21451b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f21451b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f21451b.b(new f(this, hashSet, jSONObject, j10));
    }
}

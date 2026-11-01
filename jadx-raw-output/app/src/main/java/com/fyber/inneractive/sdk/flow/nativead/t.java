package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f15549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f15550b;

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Uri uri = (Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.f15550b.a(null, exc, this.f15549a);
            return;
        }
        s sVar = this.f15550b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f15549a;
        sVar.a(new g(fVar.f18466a, uri), null, fVar);
    }

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, s sVar) {
        this.f15549a = fVar;
        this.f15550b = sVar;
    }
}

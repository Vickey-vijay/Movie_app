package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.g1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f18104a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18106c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f18105b = new ConcurrentHashMap();

    public final void a(String str, String str2, boolean z10) {
        if (!z10) {
            this.f18105b.put(str, str2);
            return;
        }
        d dVar = this.f18104a;
        if (dVar != null) {
            dVar.f18091b.a(str2);
        }
    }

    public e(d dVar) {
        this.f18104a = dVar;
    }

    public final void a(int i10, g1 g1Var) {
        n nVar;
        d dVar = this.f18104a;
        if (dVar == null || (nVar = dVar.f18094e) == null) {
            return;
        }
        ((z) nVar).a(i10, g1Var);
    }
}

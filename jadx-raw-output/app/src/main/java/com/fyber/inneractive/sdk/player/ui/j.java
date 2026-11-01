package com.fyber.inneractive.sdk.player.ui;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18079b;

    public j(l lVar, int i10) {
        this.f18079b = lVar;
        this.f18078a = i10;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        if (this.f18079b.f18074h) {
            IAlog.a("Autoclick is aborted - app in background", new Object[0]);
        } else {
            IAlog.a("Autoclick is triggered", new Object[0]);
            ((z) this.f18079b.f18073g).a(this.f18078a, l.I);
        }
        this.f18079b.p();
    }
}

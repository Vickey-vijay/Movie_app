package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q0;

/* JADX INFO: loaded from: classes.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f15424a;

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        IAlog.a("%s End-Card loaded", this.f15424a.f15355a);
        this.f15424a.f15432h.set(false);
        u uVar = this.f15424a;
        uVar.getClass();
        boolean z10 = iVar != null;
        uVar.f15430f = z10;
        com.fyber.inneractive.sdk.web.m mVar = z10 ? iVar.f18682b : null;
        String str = IAConfigManager.O.H.f14936e;
        if (!uVar.f() || mVar == null || TextUtils.isEmpty(str)) {
            uVar.f15356b.m();
        } else {
            q0.a(mVar, str, uVar);
        }
    }

    public s(u uVar) {
        this.f15424a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.f("%s End-Card failed to load!", this.f15424a.f15355a);
        this.f15424a.f15432h.set(false);
        u uVar = this.f15424a;
        uVar.f15430f = false;
        uVar.f15356b.a(inneractiveInfrastructureError);
    }
}

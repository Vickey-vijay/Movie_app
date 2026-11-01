package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.o f15371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15372b;

    public final void a(b bVar, boolean z10) {
        int iB;
        if (bVar == null) {
            IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
            return;
        }
        if (bVar.k()) {
            iB = z10 ? this.f15371a.b("d_e_pl_dl_pl", this.f15372b, 0) : this.f15371a.b("d_e_pl", this.f15372b, 0);
        } else {
            iB = z10 ? this.f15371a.b("d_e_npl_dl_npl", this.f15372b, 0) : this.f15371a.b("d_e_npl", this.f15372b, 0);
        }
        bVar.f15362f = iB;
    }

    public h() {
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.O.f15026u.f15195b;
        this.f15371a = oVar;
        this.f15372b = oVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(b bVar, boolean z10, boolean z11) {
        int iB;
        if (bVar == null) {
            IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
            return;
        }
        if (!z10) {
            iB = this.f15371a.b("d_e_def", this.f15372b, 0);
        } else if (z11) {
            iB = this.f15371a.b("d_e_pl_dl_dl", this.f15372b, 0);
        } else {
            iB = this.f15371a.b("d_e_npl_dl_dl", this.f15372b, 0);
        }
        bVar.f15362f = iB;
    }
}

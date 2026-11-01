package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f15694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15695j;

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f15749d;
        if (s0Var == null || (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f15149f) == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.a(this), this.f15749d);
            return false;
        }
        UnitDisplayType unitDisplayType = t0Var.f15209j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        if (this.f15726g != null && c()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f15726g;
            v0Var.f18785y = true;
            v0Var.D = false;
            v0Var.f18762b.f15787h.remove(v0Var);
            v0Var.f18769i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f15726g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.f15694i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.f18039a;
            if (bVar != null && (nVar = bVar.f16146b) != null) {
                nVar.f17971i = true;
                IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar.f18029t.f15376b.a();
                if (bVarA != null) {
                    bVarA.destroy();
                }
                if (nVar.f17963a != null) {
                    IAlog.a("%s : destroy() : playerController being destroyed", com.fyber.inneractive.sdk.player.f.class.getSimpleName());
                    nVar.f17963a.a();
                    nVar.f17963a = null;
                }
                nVar.f17974l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f18029t;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.f15376b;
                    Iterator it = mVar.f15411a.iterator();
                    while (it.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.endcard.b) it.next()).destroy();
                    }
                    mVar.f15411a.clear();
                    mVar.f15412b.clear();
                    mVar.f15413c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.f18030u;
                if (gVar != null) {
                    gVar.f18119a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.f18031v;
                if (bVar2 != null) {
                    bVar2.f15584a.a();
                    bVar2.a();
                    bVar2.f15588e = null;
                    bVar2.f15591h.clear();
                }
            }
            this.f15694i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f15694i != null;
    }

    public t0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(s0Var, rVar);
        this.f15695j = false;
        this.f15747b = gVar;
        this.f15746a = inneractiveAdRequest;
    }
}

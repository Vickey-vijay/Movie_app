package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.player.s;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements d, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f15528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f15529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f15530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InneractiveAdRequest f15531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f15532e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f15534g = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f15533f = new u();

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(inneractiveInfrastructureError.getErrorCode(), i.NATIVE_AD_VIDEO_LOAD_FAILED);
        this.f15534g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f15532e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError2, "onAdFailedToLoad");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.f fVar;
        com.fyber.inneractive.sdk.response.nativead.e eVar;
        String str;
        g gVar;
        if (this.f15533f != null && (fVar = this.f15529b) != null && (eVar = fVar.f18468c) != null && (str = eVar.f18465a) != null && !str.trim().isEmpty() && (gVar = this.f15530c) != null) {
            this.f15534g = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            this.f15533f.a(this.f15528a, gVar, this.f15531d, this);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VIDEO_ERROR_NULL);
        this.f15534g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f15532e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, "mVideoContentLoader is null, can't start loading");
        }
        IAlog.b("%smVideoContentLoader is null, can't start loading", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void c() throws Throwable {
        u uVar;
        this.f15534g = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar = this.f15532e;
        if (cVar == null || (uVar = this.f15533f) == null) {
            IAlog.b("%sCan't notify success, required member is null in onAdLoaded. Is null: mLoadListener: %s, mVideoContentLoader: %s", IAlog.a(this), Boolean.valueOf(this.f15532e == null), Boolean.valueOf(this.f15533f == null));
            return;
        }
        t0 t0Var = (t0) uVar.f15465c;
        com.fyber.inneractive.sdk.flow.nativead.f fVar = (com.fyber.inneractive.sdk.flow.nativead.f) cVar;
        if (t0Var == null) {
            fVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, i.NATIVE_AD_EMPTY_CONTENT), "Undetectable main media");
        } else {
            fVar.f15492e = t0Var;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u uVar = this.f15533f;
        if (uVar != null) {
            x xVar = uVar.f15465c;
            if (xVar != null) {
                ((t0) xVar).destroy();
            }
            u uVar2 = this.f15533f;
            uVar2.getClass();
            IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(uVar2));
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(uVar2.f15474l);
            uVar2.f15473k.a();
            this.f15533f = null;
        }
        this.f15532e = null;
        this.f15531d = null;
        this.f15530c = null;
        this.f15534g = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    public f(com.fyber.inneractive.sdk.response.nativead.f fVar, r rVar, g gVar, InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.flow.nativead.f fVar2) {
        this.f15529b = fVar;
        this.f15528a = rVar;
        this.f15530c = gVar;
        this.f15531d = inneractiveAdRequest;
        this.f15532e = fVar2;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f15534g == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}

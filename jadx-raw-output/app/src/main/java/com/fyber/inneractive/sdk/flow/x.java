package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f15746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f15747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f15748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.s0 f15749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15750e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15751f = false;

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public void a(String str) {
    }

    public boolean a(boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void destroy();

    public abstract boolean e();

    public void f() {
    }

    public abstract boolean isVideoAd();

    public com.fyber.inneractive.sdk.response.e b() {
        return this.f15747b;
    }

    public boolean c() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f15749d;
        if (s0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        return false;
    }

    public x(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f15749d = s0Var;
        this.f15748c = rVar;
    }
}

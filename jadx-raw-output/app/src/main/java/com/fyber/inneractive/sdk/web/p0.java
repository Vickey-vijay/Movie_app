package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 implements q0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f18744c;

    @Override // q0.a
    public final void a() {
        v0 v0Var = this.f18744c;
        v0Var.f18762b.a(v0Var.f18763c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f18766f, v0Var.f18764d, v0Var.f18768h.f15699a));
        this.f18744c.d("onShowInstallStarted();");
    }

    public p0(v0 v0Var, String str, String str2) {
        this.f18744c = v0Var;
        this.f18742a = str;
        this.f18743b = str2;
    }

    @Override // q0.a
    public final void a(String str) {
        v0 v0Var = this.f18744c;
        v0Var.f18762b.m();
        v0Var.d("onInstallationFailed();");
        v0 v0Var2 = this.f18744c;
        v0Var2.f18768h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.f18742a, this.f18743b, v0Var2.f18764d);
    }
}

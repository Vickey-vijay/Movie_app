package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 implements q0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f18746a;

    @Override // q0.a
    public final void a() {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.f18746a;
        v0Var.f18762b.a(v0Var.f18763c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f18766f, v0Var.f18764d, v0Var.f18768h.f15699a));
        this.f18746a.d("onShowInstallStarted();");
    }

    public q0(v0 v0Var) {
        this.f18746a = v0Var;
    }

    @Override // q0.a
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}

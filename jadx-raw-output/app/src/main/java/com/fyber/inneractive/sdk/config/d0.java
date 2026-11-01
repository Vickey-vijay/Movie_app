package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f15052a;

    public d0(IAConfigManager iAConfigManager) {
        this.f15052a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = this.f15052a;
        if (iAConfigManager.f15021p == null) {
            iAConfigManager.f15021p = j.a(iAConfigManager.f15011f);
        }
        com.fyber.inneractive.sdk.util.r.f18607b.post(new c0(this));
    }
}

package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdUnitController f15321a;

    public h(NativeAdUnitController nativeAdUnitController) {
        this.f15321a = nativeAdUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15321a.a();
    }
}

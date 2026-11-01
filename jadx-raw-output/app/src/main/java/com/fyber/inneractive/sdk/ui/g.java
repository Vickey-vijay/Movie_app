package com.fyber.inneractive.sdk.ui;

import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAmraidWebViewController f18547a;

    public g(IAmraidWebViewController iAmraidWebViewController) {
        this.f18547a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f18547a.f18682b;
        if (mVar != null) {
            try {
                mVar.invalidate();
            } catch (Throwable unused) {
            }
        }
    }
}

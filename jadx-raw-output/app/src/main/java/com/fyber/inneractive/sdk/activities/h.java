package com.fyber.inneractive.sdk.activities;

import com.fyber.inneractive.sdk.click.q;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f14858a;

    public h(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f14858a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f14960a != q.FAILED) {
            InneractiveInternalBrowserActivity.a(this.f14858a, bVar);
            this.f14858a.finish();
        }
    }
}

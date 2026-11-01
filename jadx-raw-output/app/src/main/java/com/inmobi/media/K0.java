package com.inmobi.media;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public final class K0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f22971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3195t2 f22972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Qh f22974d;

    public K0(L0 l10, AbstractC3195t2 abstractC3195t2, boolean z10, Qh qh2) {
        this.f22971a = l10;
        this.f22972b = abstractC3195t2;
        this.f22973c = z10;
        this.f22974d = qh2;
    }

    @Override // com.inmobi.media.Eg
    public final void a(Object obj) {
        this.f22971a.a((Bitmap) obj, this.f22972b, this.f22973c, this.f22974d);
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f22971a.a(exc, this.f22972b);
    }
}

package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3006lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3053n9 f24764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2946j2 f24765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f24766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3299x6 f24767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qk.k f24768e;

    public C3006lc(Context context, nk.l0 l0Var, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(l0Var, "coroutineScope");
        this.f24764a = c3053n9;
        qk.k kVarB = qk.q.b(0, 0, null, 7, null);
        this.f24766c = new MediaView(context);
        this.f24767d = new C3299x6(context, l0Var, kVarB, c3053n9);
        this.f24768e = kVarB;
    }

    public final Object a(AbstractC3324y6 abstractC3324y6, ContinuationImpl continuationImpl) {
        C3053n9 c3053n9 = this.f24764a;
        if (c3053n9 != null) {
            c3053n9.a("MediaViewManager", "load called - experienceModel: " + abstractC3324y6);
        }
        return this.f24765b != null ? this.f24766c : nk.h.g(nk.w0.b(), new C2981kc(this, abstractC3324y6, null), continuationImpl);
    }
}

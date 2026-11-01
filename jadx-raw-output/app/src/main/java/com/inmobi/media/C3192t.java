package com.inmobi.media;

import com.squareup.picasso.Picasso;

/* JADX INFO: renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3192t implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3267w f25358a;

    public C3192t(C3267w c3267w) {
        this.f25358a = c3267w;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        C3053n9 c3053n9 = this.f25358a.f25604d;
        if (c3053n9 != null) {
            c3053n9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C3267w c3267w = this.f25358a;
        C3053n9 c3053n10 = c3267w.f25604d;
        if (c3053n10 != null) {
            c3053n10.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = Qf.f23387a;
        Qf.b(c3267w.f25601a).cancelTag(c3267w.f25605e);
        return mj.r.f64562a;
    }
}

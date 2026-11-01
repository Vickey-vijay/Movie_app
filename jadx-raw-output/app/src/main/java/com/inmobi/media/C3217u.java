package com.inmobi.media;

import com.squareup.picasso.Callback;

/* JADX INFO: renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3217u implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3267w f25418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f25419b;

    public C3217u(C3267w c3267w, kotlinx.coroutines.c cVar) {
        this.f25418a = c3267w;
        this.f25419b = cVar;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        C3053n9 c3053n9 = this.f25418a.f25604d;
        if (c3053n9 != null) {
            c3053n9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        P4.a(this.f25419b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        C3053n9 c3053n9 = this.f25418a.f25604d;
        if (c3053n9 != null) {
            c3053n9.a("AdChoiceViewManager", "onSuccess Called");
        }
        P4.a(this.f25419b, Boolean.TRUE);
    }
}

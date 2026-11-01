package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes.dex */
public final class Oh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f55698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55699b;

    public Oh(C4248hi c4248hi, UserProfile userProfile) {
        this.f55699b = c4248hi;
        this.f55698a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55699b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportUserProfile(this.f55698a);
    }
}

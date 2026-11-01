package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes4.dex */
public final class V0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f56004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56005b;

    public V0(C4558u1 c4558u1, UserProfile userProfile) {
        this.f56005b = c4558u1;
        this.f56004a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f56005b).reportUserProfile(this.f56004a);
    }
}

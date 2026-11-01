package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4659y2 f55957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f55958c;

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f55956a + ", mBackgroundRestrictionsState=" + this.f55957b + ", mAvailableProviders=" + this.f55958c + '}';
    }

    public U1(List list, C4659y2 c4659y2, List list2) {
        this.f55956a = list;
        this.f55957b = c4659y2;
        this.f55958c = list2;
    }
}

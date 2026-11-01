package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f18591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f18592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18593c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18591a.mPriority.compareTo(((l1) obj).f18591a.mPriority);
    }

    public l1(k1 k1Var, Uri uri, List list) {
        this.f18591a = k1Var;
        this.f18592b = uri;
        this.f18593c = list;
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4655xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f57976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f57977f;

    public C4655xn(String str, int i10, long j10, String str2, Integer num, List list) {
        List listUnmodifiableListCopy;
        this.f57972a = str;
        this.f57973b = i10;
        this.f57974c = j10;
        this.f57975d = str2;
        this.f57976e = num;
        if (list == null) {
            listUnmodifiableListCopy = Collections.emptyList();
        } else {
            listUnmodifiableListCopy = CollectionUtils.unmodifiableListCopy(list);
        }
        this.f57977f = listUnmodifiableListCopy;
    }
}

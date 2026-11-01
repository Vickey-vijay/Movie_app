package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4176eo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f56699c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f56700a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56701b = 0;

    public C4176eo(int[] iArr) {
        for (int i10 : iArr) {
            this.f56700a.put(i10, new HashMap());
        }
    }
}

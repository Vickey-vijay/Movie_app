package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes5.dex */
public final class Hc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f55297c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55299b;

    static {
        SparseArray sparseArray = new SparseArray();
        f55297c = sparseArray;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Hc("jvm", "binder"));
        sparseArray.put(5890, new Hc("jvm", C3426d4.i.f28530b));
        sparseArray.put(5889, new Hc("jvm", C3426d4.i.f28530b));
        sparseArray.put(5897, new Hc("jni_native", C3426d4.i.f28530b));
        sparseArray.put(5898, new Hc("jni_native", C3426d4.i.f28530b));
    }

    public Hc(String str, String str2) {
        this.f55298a = str;
        this.f55299b = str2;
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC4645xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C4666y9 f57930a;

    public static final synchronized C4666y9 a(Context context) {
        C4666y9 c4666y9;
        c4666y9 = f57930a;
        if (c4666y9 == null) {
            c4666y9 = new C4666y9(context, "uuid.dat");
            f57930a = c4666y9;
        }
        return c4666y9;
    }
}

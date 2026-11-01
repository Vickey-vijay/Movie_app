package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4048a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56311a;

    public final byte[] a() {
        try {
            return AbstractC4249hj.a(new StringBuilder(this.f56311a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC4249hj.a(this.f56311a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public C4048a(Context context) {
        this.f56311a = context;
    }
}

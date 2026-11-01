package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4496re implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f57600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kg f57601b;

    @Override // io.appmetrica.analytics.impl.J6
    public final File a(Context context, String str) {
        return new File(this.f57600a, this.f57601b.a(str));
    }

    public C4496re(File file, Kg kg2) {
        this.f57600a = file;
        this.f57601b = kg2;
    }
}

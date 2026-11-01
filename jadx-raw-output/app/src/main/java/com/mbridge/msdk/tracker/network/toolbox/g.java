package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HttpResponse.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f38261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f38263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f38264e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f38260a = i10;
        this.f38261b = list;
        this.f38262c = i11;
        this.f38263d = inputStream;
        this.f38264e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f38263d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f38264e != null) {
            return new ByteArrayInputStream(this.f38264e);
        }
        return null;
    }

    public final int b() {
        return this.f38262c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f38261b);
    }

    public final int d() {
        return this.f38260a;
    }
}

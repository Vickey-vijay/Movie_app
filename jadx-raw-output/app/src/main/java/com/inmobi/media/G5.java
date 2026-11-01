package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class G5 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f22717a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f22717a) {
            AbstractC2762bl.a(inputStream);
        }
    }

    public G5(InputStream[] inputStreamArr) {
        this.f22717a = inputStreamArr;
    }
}

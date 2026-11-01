package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Timeout.java */
/* JADX INFO: loaded from: classes11.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f38080d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38083c;

    /* JADX INFO: compiled from: Timeout.java */
    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f38083c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    public t b() {
        this.f38083c = 0L;
        return this;
    }

    public long c() {
        if (this.f38081a) {
            return this.f38082b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f38081a;
    }

    public long f() {
        return this.f38083c;
    }

    public void e() throws IOException {
        if (!Thread.interrupted()) {
            if (this.f38081a && this.f38082b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public t a(long j10) {
        this.f38081a = true;
        this.f38082b = j10;
        return this;
    }

    public t a() {
        this.f38081a = false;
        return this;
    }
}

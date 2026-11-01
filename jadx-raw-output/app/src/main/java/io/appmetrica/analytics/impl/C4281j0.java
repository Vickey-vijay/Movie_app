package io.appmetrica.analytics.impl;

import android.util.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4281j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gc f56985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4528sl f56988d;

    public final synchronized void a(Pair pair) {
        if (this.f56988d.b(this.f56985a, (String) pair.first, (String) pair.second)) {
            this.f56987c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f56985a.size() + ". Is changed " + this.f56987c + ". Current revision " + this.f56986b;
    }

    public C4281j0(String str, long j10, C4528sl c4528sl) {
        this.f56986b = j10;
        try {
            this.f56985a = new Gc(str);
        } catch (Throwable unused) {
            this.f56985a = new Gc();
        }
        this.f56988d = c4528sl;
    }

    public final synchronized C4256i0 a() {
        if (this.f56987c) {
            this.f56986b++;
            this.f56987c = false;
        }
        return new C4256i0(AbstractC4241hb.b(this.f56985a), this.f56986b);
    }
}

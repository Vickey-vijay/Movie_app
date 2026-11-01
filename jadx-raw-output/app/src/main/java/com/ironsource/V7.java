package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class V7 implements Tf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27799c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final V9 f27801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final V9 f27802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final V9 f27803g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V7 f27797a = new V7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f27798b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final mj.g f27800d = kotlin.b.a(a.f27804a);

    public static final class a extends Lambda implements bk.a<C3543je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27804a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3543je invoke() {
            return new C3543je(0, null, null, 7, null);
        }
    }

    public final void a(boolean z10) {
        f27799c = z10;
    }

    public final void b(Runnable runnable) {
        ck.p.j(runnable, "action");
        a(this, runnable, 0L, 2, (Object) null);
    }

    public final void c(Runnable runnable) {
        ck.p.j(runnable, "action");
        b(this, runnable, 0L, 2, null);
    }

    public final void d(Runnable runnable) {
        ck.p.j(runnable, "action");
        c(this, runnable, 0L, 2, null);
    }

    static {
        V9 v10 = new V9("isadplayer-background");
        v10.start();
        v10.a();
        f27801e = v10;
        V9 v11 = new V9("isadplayer-publisher-callbacks");
        v11.start();
        v11.a();
        f27802f = v11;
        V9 v12 = new V9("isadplayer-release");
        v12.start();
        v12.a();
        f27803g = v12;
    }

    private final C3543je b() {
        return (C3543je) f27800d.getValue();
    }

    public static /* synthetic */ void c(V7 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.d(runnable, j10);
    }

    private final boolean f(Runnable runnable) {
        return f27799c && b().getQueue().contains(runnable);
    }

    @Override // com.ironsource.Tf
    public void a(Runnable runnable) {
        ck.p.j(runnable, "action");
        c(this, runnable, 0L, 2, null);
    }

    public final boolean d() {
        return f27799c;
    }

    public final void e(Runnable runnable) {
        ck.p.j(runnable, "action");
        if (f(runnable)) {
            b().remove(runnable);
        } else {
            f27803g.b(runnable);
        }
    }

    private V7() {
    }

    public static /* synthetic */ void a(V7 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.b(runnable, j10);
    }

    public final void b(Runnable runnable, long j10) {
        ck.p.j(runnable, "action");
        f27801e.a(runnable, j10);
    }

    public final void c(Runnable runnable, long j10) {
        ck.p.j(runnable, "action");
        f27802f.a(runnable, j10);
    }

    public final void d(Runnable runnable, long j10) {
        ck.p.j(runnable, "action");
        f27798b.postDelayed(runnable, j10);
    }

    public static /* synthetic */ void b(V7 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.c(runnable, j10);
    }

    @Override // com.ironsource.Tf
    public void a(Runnable runnable, long j10) {
        ck.p.j(runnable, "action");
        if (f27799c) {
            b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            f27803g.a(runnable, j10);
        }
    }

    public final ThreadPoolExecutor c() {
        return b();
    }

    public final Looper a() {
        return f27801e.getLooper();
    }
}

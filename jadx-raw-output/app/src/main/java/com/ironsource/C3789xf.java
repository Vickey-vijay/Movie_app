package com.ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3789xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3789xf f31600a = new C3789xf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mj.g f31601b = kotlin.b.a(a.f31602a);

    /* JADX INFO: renamed from: com.ironsource.xf$a */
    public static final class a extends Lambda implements bk.a<C3543je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31602a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3543je invoke() {
            return new C3543je(16, null, null, 6, null);
        }
    }

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "action");
        a(this, runnable, 0L, 2, null);
    }

    private final C3543je a() {
        return (C3543je) f31601b.getValue();
    }

    private C3789xf() {
    }

    public static /* synthetic */ void a(C3789xf c3789xf, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3789xf.a(runnable, j10);
    }

    public final void a(Runnable runnable, long j10) {
        ck.p.j(runnable, "action");
        a().schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}

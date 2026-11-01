package com.ironsource;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public final class W6 implements InterfaceC3755vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27825a;

    public interface a {

        /* JADX INFO: renamed from: com.ironsource.W6$a$a, reason: collision with other inner class name */
        public interface InterfaceC0250a {
            void cancel();
        }

        InterfaceC0250a a(Runnable runnable, long j10);
    }

    public static final class b extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f27826b;

        public b(Runnable runnable) {
            this.f27826b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            this.f27826b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC3755vf
    public InterfaceC3755vf.a a(Runnable runnable, long j10) {
        ck.p.j(runnable, "task");
        return new InterfaceC3755vf.a(this.f27825a.a(a(runnable), mk.b.p(j10)));
    }

    public W6(a aVar) {
        ck.p.j(aVar, "handler");
        this.f27825a = aVar;
    }

    public /* synthetic */ W6(a aVar, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? X6.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    @Override // com.ironsource.InterfaceC3755vf
    public InterfaceC3755vf.a a(InterfaceC3755vf.b bVar, long j10) {
        ck.p.j(bVar, "task");
        return a(bVar.a(), j10);
    }

    private final AbstractRunnableC3526ie a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC3526ie ? (AbstractRunnableC3526ie) runnable : new b(runnable);
    }
}

package com.ironsource;

import android.os.Handler;

/* JADX INFO: loaded from: classes5.dex */
public final class X6 {

    public static final class a implements W6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f27868a;

        @Override // com.ironsource.W6.a
        public W6.a.InterfaceC0250a a(final Runnable runnable, long j10) {
            ck.p.j(runnable, "runnable");
            this.f27868a.postDelayed(runnable, j10);
            final Handler handler = this.f27868a;
            return new W6.a.InterfaceC0250a() { // from class: com.ironsource.vj
                @Override // com.ironsource.W6.a.InterfaceC0250a
                public final void cancel() {
                    X6.a.a(handler, runnable);
                }
            };
        }

        public a(Handler handler) {
            this.f27868a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Handler handler, Runnable runnable) {
            ck.p.j(handler, "$this_asScheduler");
            ck.p.j(runnable, "$runnable");
            handler.removeCallbacks(runnable);
        }
    }

    public static final W6.a a(Handler handler) {
        ck.p.j(handler, "<this>");
        return new a(handler);
    }

    public static final <T> InterfaceC3755vf.b a(T t10, bk.l<? super T, mj.r> lVar) {
        ck.p.j(lVar, "block");
        return InterfaceC3755vf.b.f31485b.a(t10, lVar);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Eg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26483c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f26484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vc f26485b;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final Eg a(W0 w10, AbstractC3757w0 abstractC3757w0, Vc vc2, yg ygVar, G g10) {
            ck.p.j(w10, "adTools");
            ck.p.j(abstractC3757w0, "adUnitData");
            ck.p.j(vc2, "outcomeReporter");
            ck.p.j(ygVar, "waterfallInstances");
            ck.p.j(g10, "adInstanceLoadStrategy");
            return abstractC3757w0.q() ? new C3671qf(w10, vc2, ygVar, g10) : new O4(w10, vc2, ygVar);
        }
    }

    public abstract void a();

    public abstract void a(A a10);

    public final void a(A a10, List<? extends A> list) {
        ck.p.j(a10, "instanceToShow");
        ck.p.j(list, "orderedInstances");
        b(a10, list);
        c(a10);
    }

    public abstract void b(A a10);

    public abstract void c(A a10);

    public Eg(C3621o0 c3621o0, Vc vc2) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(vc2, "outcomeReporter");
        this.f26484a = c3621o0;
        this.f26485b = vc2;
    }

    private final void b(A a10, List<? extends A> list) {
        for (A a11 : list) {
            if (a11 == a10) {
                a10.a(true);
                return;
            }
            a11.a(false);
            IronLog.INTERNAL.verbose(C3621o0.a(this.f26484a, a11.q() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public final void a(A a10, String str, C3649pa c3649pa) {
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(c3649pa, "publisherDataHolder");
        this.f26485b.a(a10, str, c3649pa);
    }
}

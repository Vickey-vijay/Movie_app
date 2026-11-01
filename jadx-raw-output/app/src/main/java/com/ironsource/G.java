package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26543c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3757w0 f26544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yg f26545b;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        /* JADX INFO: renamed from: com.ironsource.G$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0247a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f26546a;

            static {
                int[] iArr = new int[Cg.values().length];
                try {
                    iArr[Cg.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Cg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f26546a = iArr;
            }
        }

        private a() {
        }

        public final G a(AbstractC3757w0 abstractC3757w0, yg ygVar) {
            ck.p.j(abstractC3757w0, "adUnitData");
            ck.p.j(ygVar, "waterfallInstances");
            int i10 = C0247a.f26546a[(abstractC3757w0.d() ? Cg.BIDDER_SENSITIVE : Cg.DEFAULT).ordinal()];
            if (i10 == 1) {
                return new C3743v3(abstractC3757w0, ygVar);
            }
            if (i10 == 2) {
                return abstractC3757w0.q() ? new C3654pf(abstractC3757w0, ygVar) : new K4(abstractC3757w0, ygVar);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<A> f26547a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<A> f26548b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<A> f26549c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f26550d;

        public final List<A> a() {
            return this.f26547a;
        }

        public final void a(boolean z10) {
            this.f26550d = z10;
        }

        public final List<A> b() {
            return this.f26548b;
        }

        public final List<A> c() {
            return this.f26549c;
        }

        public final boolean d() {
            return this.f26550d;
        }

        public final boolean f() {
            return this.f26547a.isEmpty() && this.f26549c.isEmpty();
        }

        public final int g() {
            return this.f26547a.size() + this.f26548b.size() + this.f26549c.size();
        }

        public final boolean e() {
            if (g() == 0) {
                return true;
            }
            return false;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A f26551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<A> f26552b;

        public final A a() {
            return this.f26551a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return ck.p.e(this.f26551a, cVar.f26551a) && ck.p.e(this.f26552b, cVar.f26552b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(A a10, List<? extends A> list) {
            ck.p.j(list, "orderedInstances");
            this.f26551a = a10;
            this.f26552b = list;
        }

        public final c a(A a10, List<? extends A> list) {
            ck.p.j(list, "orderedInstances");
            return new c(a10, list);
        }

        public final List<A> b() {
            return this.f26552b;
        }

        public final A c() {
            return this.f26551a;
        }

        public final List<A> d() {
            return this.f26552b;
        }

        public int hashCode() {
            A a10 = this.f26551a;
            return ((a10 == null ? 0 : a10.hashCode()) * 31) + this.f26552b.hashCode();
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f26551a + ", orderedInstances=" + this.f26552b + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, A a10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                a10 = cVar.f26551a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f26552b;
            }
            return cVar.a(a10, list);
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return qj.b.d(Integer.valueOf(((A) t10).h().l()), Integer.valueOf(((A) t11).h().l()));
        }
    }

    private final List<A> b() {
        return nj.b0.H0(this.f26545b.b(), new d());
    }

    public abstract void a(A a10, b bVar);

    public boolean a(A a10, yg ygVar) {
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(ygVar, "waterfallInstances");
        return false;
    }

    public G(AbstractC3757w0 abstractC3757w0, yg ygVar) {
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(ygVar, "waterfallInstances");
        this.f26544a = abstractC3757w0;
        this.f26545b = ygVar;
    }

    public final boolean a(A a10) {
        Object next;
        ck.p.j(a10, C3605n2.f30210p);
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((A) next).v()) {
                return ck.p.e(next, a10);
            }
        }
        next = null;
        return ck.p.e(next, a10);
    }

    public final b d() {
        IronLog.INTERNAL.verbose(this.f26544a.b().a().name() + " waterfall size: " + this.f26545b.b().size());
        b bVar = new b();
        Iterator<A> it = this.f26545b.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }

    private final boolean b(A a10, b bVar) {
        if (a10.v()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is failed to load");
        } else if (a10.w()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is already loaded");
            bVar.b().add(a10);
        } else if (a10.x()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " still loading");
            bVar.c().add(a10);
        } else if (a(a10, this.f26545b)) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is not better than already loaded instances");
        } else {
            a(a10, bVar);
        }
        return a(bVar);
    }

    public final c c() {
        Object next;
        List<A> listB = b();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((A) next).w()) {
                return new c((A) next, listB);
            }
        }
        next = null;
        return new c((A) next, listB);
    }

    public final boolean a() {
        int i10;
        List<A> listB = this.f26545b.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = listB.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((A) it.next()).w() && (i10 = i10 + 1) < 0) {
                    nj.s.t();
                }
            }
        }
        return i10 >= this.f26544a.k();
    }

    public boolean a(b bVar) {
        ck.p.j(bVar, "loadSelection");
        return bVar.g() >= this.f26544a.k();
    }
}

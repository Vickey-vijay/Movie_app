package com.ironsource;

import com.ironsource.AbstractC3659q3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Fg<Smash extends AbstractC3659q3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f26542a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return qj.b.d(Integer.valueOf(((AbstractC3659q3) t10).i().l()), Integer.valueOf(((AbstractC3659q3) t11).i().l()));
        }
    }

    public final boolean a(AbstractC3659q3<?> abstractC3659q3, List<? extends Smash> list) {
        Object next;
        ck.p.j(abstractC3659q3, "smash");
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
        Iterator<T> it = b(list).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((AbstractC3659q3) next).x()) {
                return ck.p.e(next, abstractC3659q3);
            }
        }
        next = null;
        return ck.p.e(next, abstractC3659q3);
    }

    public Fg(V v10) {
        ck.p.j(v10, "managerData");
        this.f26542a = v10;
    }

    public final List<Smash> b(List<? extends Smash> list) {
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
        return nj.b0.H0(list, new a());
    }

    public final Smash c(List<? extends Smash> list) {
        Object next;
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
        Iterator<T> it = b(list).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbstractC3659q3) next).B()) {
                return (Smash) next;
            }
        }
        next = null;
        return (Smash) next;
    }

    public final Gg<Smash> d(List<? extends Smash> list) {
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
        IronLog.INTERNAL.verbose(this.f26542a.b().name() + " waterfall size: " + list.size());
        Lg<Smash> lgA = Lg.f27015g.a(this.f26542a.c() ? Cg.BIDDER_SENSITIVE : Cg.DEFAULT, this.f26542a.i(), this.f26542a.m(), list);
        Iterator<? extends Smash> it = list.iterator();
        while (it.hasNext()) {
            lgA.d(it.next());
            if (lgA.e()) {
                return new Gg<>(lgA);
            }
        }
        return new Gg<>(lgA);
    }

    public final boolean a(List<? extends Smash> list) {
        int i10;
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
        if ((list instanceof Collection) && list.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((AbstractC3659q3) it.next()).y() && (i10 = i10 + 1) < 0) {
                    nj.s.t();
                }
            }
        }
        return i10 >= this.f26542a.i();
    }
}

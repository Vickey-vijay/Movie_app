package com.ironsource;

import com.ironsource.AbstractC3659q3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Lg<Smash extends AbstractC3659q3<?>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f27015g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Smash> f27018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Smash> f27019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Smash> f27020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Smash> f27021f;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        /* JADX INFO: renamed from: com.ironsource.Lg$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0249a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27022a;

            static {
                int[] iArr = new int[Cg.values().length];
                try {
                    iArr[Cg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Cg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27022a = iArr;
            }
        }

        private a() {
        }

        public final <Smash extends AbstractC3659q3<?>> Lg<Smash> a(Cg cg2, int i10, boolean z10, List<? extends Smash> list) {
            ck.p.j(cg2, "loadingStrategy");
            ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
            int i11 = C0249a.f27022a[cg2.ordinal()];
            if (i11 == 1) {
                return new N4(i10, z10, list);
            }
            if (i11 == 2) {
                return new C3760w3(i10, z10, list, false, 8, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final List<Smash> a() {
        return this.f27021f;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.f27019d.size() + this.f27020e.size() + this.f27021f.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Lg(int i10, boolean z10, List<? extends Smash> list) {
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
        this.f27016a = i10;
        this.f27017b = z10;
        this.f27018c = list;
        this.f27019d = new ArrayList();
        this.f27020e = new ArrayList();
        this.f27021f = new ArrayList();
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final List<Smash> c() {
        return this.f27019d;
    }

    public final void d(Smash smash) {
        ck.p.j(smash, "smash");
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.f27020e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f27021f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f27021f.add(smash);
            return;
        }
        if (!this.f27017b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    private final int b() {
        Integer num;
        List<Smash> list = this.f27018c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC3659q3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(a((AbstractC3659q3) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(a((AbstractC3659q3) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public boolean e() {
        if (d() >= this.f27016a) {
            return true;
        }
        return false;
    }
}

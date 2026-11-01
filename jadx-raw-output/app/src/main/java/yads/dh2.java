package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class dh2 {
    public static final ch2 Companion = new ch2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xk.b[] f76673b = {new bl.f(gh2.f77804a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76674a;

    public /* synthetic */ dh2(int i10, List list) {
        if (1 != (i10 & 1)) {
            bl.o1.a(i10, 1, bh2.f75829a.getDescriptor());
        }
        this.f76674a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh2) && ck.p.e(this.f76674a, ((dh2) obj).f76674a);
    }

    public dh2(List list) {
        this.f76674a = list;
    }

    public final int hashCode() {
        return this.f76674a.hashCode();
    }

    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.f76674a + ")";
    }
}

package yads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class fy extends hy {
    public static hy a(int i10) {
        if (i10 < 0) {
            return hy.f78411b;
        }
        return i10 > 0 ? hy.f78412c : hy.f78410a;
    }

    @Override // yads.hy
    public final int a() {
        return 0;
    }

    @Override // yads.hy
    public final hy a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else {
            i12 = i10 > i11 ? 1 : 0;
        }
        return a(i12);
    }

    @Override // yads.hy
    public final hy a(long j10, long j11) {
        int i10;
        if (j10 < j11) {
            i10 = -1;
        } else {
            i10 = j10 > j11 ? 1 : 0;
        }
        return a(i10);
    }

    @Override // yads.hy
    public final hy b(boolean z10, boolean z11) {
        return a(lq.a(z11, z10));
    }

    @Override // yads.hy
    public final hy a(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // yads.hy
    public final hy a(boolean z10, boolean z11) {
        return a(lq.a(z10, z11));
    }
}

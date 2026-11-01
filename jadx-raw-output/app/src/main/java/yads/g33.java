package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g33 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f77623c;

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 < this.f77623c.size()) {
            return ((Long) this.f77623c.get(i10)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        int iA = ib3.a(this.f77623c, Long.valueOf(j10), false);
        return iA == -1 ? Collections.emptyList() : (List) this.f77622b.get(iA);
    }

    public g33(ArrayList arrayList, ArrayList arrayList2) {
        this.f77622b = arrayList;
        this.f77623c = arrayList2;
    }

    @Override // yads.r43
    public final int a() {
        return this.f77623c.size();
    }

    @Override // yads.r43
    public final int a(long j10) {
        int i10;
        List list = this.f77623c;
        Long lValueOf = Long.valueOf(j10);
        int i11 = ib3.f78556a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i10 = iBinarySearch;
        }
        if (i10 < this.f77623c.size()) {
            return i10;
        }
        return -1;
    }
}

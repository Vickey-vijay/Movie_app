package yads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yads.lo3;

/* JADX INFO: loaded from: classes11.dex */
public final class to3 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f83128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f83129d;

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f83129d;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f83127b.size(); i10++) {
            long[] jArr = this.f83128c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                lo3 lo3Var = (lo3) this.f83127b.get(i10);
                o20 o20Var = lo3Var.f79873a;
                if (o20Var.f80908f == -3.4028235E38f) {
                    arrayList2.add(lo3Var);
                } else {
                    arrayList.add(o20Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: cp.ma
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((lo3) obj).f79874b, ((lo3) obj2).f79874b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            o20 o20Var2 = ((lo3) arrayList2.get(i12)).f79873a;
            o20Var2.getClass();
            arrayList.add(new o20(o20Var2.f80904b, o20Var2.f80905c, o20Var2.f80906d, o20Var2.f80907e, (-1) - i12, 1, o20Var2.f80910h, o20Var2.f80911i, o20Var2.f80912j, o20Var2.f80917o, o20Var2.f80918p, o20Var2.f80913k, o20Var2.f80914l, o20Var2.f80915m, o20Var2.f80916n, o20Var2.f80919q, o20Var2.f80920r));
        }
        return arrayList;
    }

    public to3(ArrayList arrayList) {
        this.f83127b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f83128c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            lo3 lo3Var = (lo3) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f83128c;
            jArr[i11] = lo3Var.f79874b;
            jArr[i11 + 1] = lo3Var.f79875c;
        }
        long[] jArr2 = this.f83128c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f83129d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // yads.r43
    public final int a() {
        return this.f83129d.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f83129d, j10, false);
        if (iA < this.f83129d.length) {
            return iA;
        }
        return -1;
    }
}

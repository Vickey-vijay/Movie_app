package qj;

import ck.p;

/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes10.dex */
public class c extends b {
    public static final int g(int i10, int... iArr) {
        p.j(iArr, "other");
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    public static final <T extends Comparable<? super T>> T h(T t10, T t11) {
        p.j(t10, "a");
        p.j(t11, "b");
        return t10.compareTo(t11) >= 0 ? t10 : t11;
    }
}

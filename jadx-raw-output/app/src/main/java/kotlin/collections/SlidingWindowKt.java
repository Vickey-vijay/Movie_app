package kotlin.collections;

import ck.p;
import java.util.Iterator;
import java.util.List;
import kk.l;
import nj.c0;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SlidingWindowKt {
    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        p.j(it, "iterator");
        return !it.hasNext() ? c0.f64726b : l.a(new SlidingWindowKt$windowedIterator$1(i10, i11, it, z11, z10, null));
    }
}

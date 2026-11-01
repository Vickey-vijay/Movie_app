package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import ik.f;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t10) {
        return range.extend(t10);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t10, T t11) {
        return new Range<>(t10, t11);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> f<T> toClosedRange(final Range<T> range) {
        return (f<T>) new f<T>() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // ik.f
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // ik.f
            public Comparable getStart() {
                return range.getLower();
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                return f.a.a(this, comparable);
            }

            public boolean isEmpty() {
                return f.a.b(this);
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(f<T> fVar) {
        return new Range<>(fVar.getStart(), fVar.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }
}

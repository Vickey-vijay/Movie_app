package ik;

import ck.p;
import java.lang.Comparable;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface f<T extends Comparable<? super T>> {

    /* JADX INFO: compiled from: Range.kt */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(f<T> fVar, T t10) {
            p.j(t10, "value");
            return t10.compareTo(fVar.getStart()) >= 0 && t10.compareTo(fVar.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(f<T> fVar) {
            if (fVar.getStart().compareTo(fVar.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    T getEndInclusive();

    T getStart();
}

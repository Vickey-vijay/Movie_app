package nj;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: MutableCollectionsJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public class w extends v {
    public static final <T extends Comparable<? super T>> void A(List<T> list) {
        ck.p.j(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void B(List<T> list, Comparator<? super T> comparator) {
        ck.p.j(list, "<this>");
        ck.p.j(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

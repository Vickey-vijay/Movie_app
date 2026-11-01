package kotlin.enums;

import ck.p;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final <E extends Enum<E>> uj.a<E> a(E[] eArr) {
        p.j(eArr, "entries");
        return new EnumEntriesList(eArr);
    }
}

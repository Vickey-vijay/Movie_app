package yads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class fr implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}

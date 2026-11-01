package kotlin.enums;

import ck.p;
import java.io.Serializable;
import java.lang.Enum;
import nj.d;
import nj.n;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes8.dex */
final class EnumEntriesList<T extends Enum<T>> extends d<T> implements uj.a<T>, Serializable {
    private final T[] entries;

    @Override // nj.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum) obj);
        }
        return false;
    }

    @Override // nj.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }

    @Override // nj.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum) obj);
        }
        return -1;
    }

    public EnumEntriesList(T[] tArr) {
        p.j(tArr, "entries");
        this.entries = tArr;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    public boolean contains(T t10) {
        p.j(t10, "element");
        return ((Enum) n.R(this.entries, t10.ordinal())) == t10;
    }

    @Override // nj.d, java.util.List
    public T get(int i10) {
        d.Companion.b(i10, this.entries.length);
        return this.entries[i10];
    }

    @Override // nj.d, nj.b
    public int getSize() {
        return this.entries.length;
    }

    public int indexOf(T t10) {
        p.j(t10, "element");
        int iOrdinal = t10.ordinal();
        if (((Enum) n.R(this.entries, iOrdinal)) == t10) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(T t10) {
        p.j(t10, "element");
        return indexOf((Object) t10);
    }
}

package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class y72 extends sa2 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y72 f84838b = new y72();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    private Object readResolve() {
        return f84838b;
    }

    @Override // yads.sa2
    public final sa2 a() {
        return jq2.f79148b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}

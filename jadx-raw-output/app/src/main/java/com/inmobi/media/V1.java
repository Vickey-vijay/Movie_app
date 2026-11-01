package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 com.inmobi.media.V1[], still in use, count: 1, list:
  (r8v2 com.inmobi.media.V1[]) from 0x0031: INVOKE (r8v2 com.inmobi.media.V1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:52)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class V1 {
    f23665d("UNKNOWN"),
    f23666e("PLAYING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("PAUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("COMPLETED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U1 f23663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f23664c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23668a;

    static {
        kotlin.enums.a.a(new V1[]{r0, r2, new V1("PAUSED"), new V1("COMPLETED")});
        f23663b = new U1();
        f23664c = new SparseArray();
        for (V1 v10 : values()) {
            f23664c.put(v10.f23668a, v10);
        }
    }

    public static V1 valueOf(String str) {
        return (V1) Enum.valueOf(V1.class, str);
    }

    public static V1[] values() {
        return (V1[]) f23667f.clone();
    }

    public V1(String str) {
        super(str, i);
        this.f23668a = i;
    }
}

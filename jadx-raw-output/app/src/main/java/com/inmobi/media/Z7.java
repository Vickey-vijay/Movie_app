package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 com.inmobi.media.Z7[], still in use, count: 1, list:
  (r9v3 com.inmobi.media.Z7[]) from 0x0041: INVOKE (r9v3 com.inmobi.media.Z7[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:68)
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
/* JADX INFO: loaded from: classes8.dex */
public final class Z7 {
    /* JADX INFO: Fake field, exist only in values array */
    START("q0"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_QUARTILE("q1"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDPOINT("q2"),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD_QUARTILE("q3"),
    /* JADX INFO: Fake field, exist only in values array */
    FOURTH_QUARTILE("q4");

    static {
        kotlin.enums.a.a(z7Arr);
    }

    public static Z7 valueOf(String str) {
        return (Z7) Enum.valueOf(Z7.class, str);
    }

    public static Z7[] values() {
        return (Z7[]) f23895a.clone();
    }

    public Z7(String str) {
        super(str, i);
    }
}

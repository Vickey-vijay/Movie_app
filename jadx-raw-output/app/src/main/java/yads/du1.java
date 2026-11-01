package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 yads.du1[], still in use, count: 1, list:
  (r10v2 yads.du1[]) from 0x003d: INVOKE (r10v2 yads.du1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:64)
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
public final class du1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0,
    /* JADX INFO: Fake field, exist only in values array */
    EF2,
    f76796b,
    f76797c,
    f76798d;

    static {
        kotlin.enums.a.a(du1VarArr);
    }

    public static du1 valueOf(String str) {
        return (du1) Enum.valueOf(du1.class, str);
    }

    public static du1[] values() {
        return (du1[]) f76799e.clone();
    }

    public du1() {
        super(str, i);
    }
}

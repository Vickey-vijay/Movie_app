package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.kj3[], still in use, count: 1, list:
  (r6v2 yads.kj3[]) from 0x0025: INVOKE (r6v2 yads.kj3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:40)
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
/* JADX INFO: loaded from: classes11.dex */
public final class kj3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0,
    f79432b,
    /* JADX INFO: Fake field, exist only in values array */
    EF23;

    static {
        kotlin.enums.a.a(kj3VarArr);
    }

    public static kj3 valueOf(String str) {
        return (kj3) Enum.valueOf(kj3.class, str);
    }

    public static kj3[] values() {
        return (kj3[]) f79433c.clone();
    }

    public kj3() {
        super(str, i);
    }
}

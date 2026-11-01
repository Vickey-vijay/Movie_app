package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.qa3[], still in use, count: 1, list:
  (r4v2 yads.qa3[]) from 0x001d: INVOKE (r4v2 yads.qa3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:32)
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
/* JADX INFO: loaded from: classes2.dex */
public final class qa3 {
    f81783b,
    f81784c;

    static {
        kotlin.enums.a.a(qa3VarArr);
    }

    public static qa3 valueOf(String str) {
        return (qa3) Enum.valueOf(qa3.class, str);
    }

    public static qa3[] values() {
        return (qa3[]) f81785d.clone();
    }

    public qa3() {
        super(str, i);
    }
}

package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 yads.dr1[], still in use, count: 1, list:
  (r1v1 yads.dr1[]) from 0x000f: INVOKE (r1v1 yads.dr1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:18)
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
public final class dr1 {
    INVALID_MEDIATION_ADAPTER_VERSION;

    static {
        kotlin.enums.a.a(dr1VarArr);
    }

    public dr1() {
        super("INVALID_MEDIATION_ADAPTER_VERSION", 0);
    }

    public static dr1 valueOf(String str) {
        return (dr1) Enum.valueOf(dr1.class, str);
    }

    public static dr1[] values() {
        return (dr1[]) f76781c.clone();
    }
}

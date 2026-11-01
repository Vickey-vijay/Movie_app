package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 yads.cg0[], still in use, count: 1, list:
  (r1v1 yads.cg0[]) from 0x000d: INVOKE (r1v1 yads.cg0[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:16)
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
public final class cg0 {
    /* JADX INFO: Fake field, exist only in values array */
    AD_POD;

    static {
        kotlin.enums.a.a(cg0VarArr);
    }

    public cg0() {
        super("AD_POD", 0);
    }

    public static cg0 valueOf(String str) {
        return (cg0) Enum.valueOf(cg0.class, str);
    }

    public static cg0[] values() {
        return (cg0[]) f76276b.clone();
    }
}

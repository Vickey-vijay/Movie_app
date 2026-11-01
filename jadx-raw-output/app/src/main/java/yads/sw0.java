package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 yads.sw0[], still in use, count: 1, list:
  (r8v2 yads.sw0[]) from 0x0035: INVOKE (r8v2 yads.sw0[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:56)
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
/* JADX INFO: loaded from: classes9.dex */
public final class sw0 {
    f82780b,
    f82781c,
    f82782d,
    f82783e;

    static {
        kotlin.enums.a.a(sw0VarArr);
    }

    public static sw0 valueOf(String str) {
        return (sw0) Enum.valueOf(sw0.class, str);
    }

    public static sw0[] values() {
        return (sw0[]) f82784f.clone();
    }

    public sw0() {
        super(str, i);
    }
}

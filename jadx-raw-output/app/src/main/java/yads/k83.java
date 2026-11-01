package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 yads.k83[], still in use, count: 1, list:
  (r9v3 yads.k83[]) from 0x0084: INVOKE (r9v3 yads.k83[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:135)
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
/* JADX INFO: loaded from: classes5.dex */
public final class k83 {
    f79330b,
    f79331c,
    f79332d,
    f79333e,
    f79334f,
    f79335g,
    f79336h,
    f79337i,
    f79338j,
    /* JADX INFO: Fake field, exist only in values array */
    EF97;

    static {
        kotlin.enums.a.a(k83VarArr);
    }

    public static k83 valueOf(String str) {
        return (k83) Enum.valueOf(k83.class, str);
    }

    public static k83[] values() {
        return (k83[]) f79339k.clone();
    }

    public k83() {
        super(str, i);
    }
}

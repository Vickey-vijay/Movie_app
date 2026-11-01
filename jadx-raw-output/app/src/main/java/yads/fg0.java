package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.fg0[], still in use, count: 1, list:
  (r6v2 yads.fg0[]) from 0x0029: INVOKE (r6v2 yads.fg0[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:44)
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
/* JADX INFO: loaded from: classes10.dex */
public final class fg0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("ad"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("pack_shot"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("close_dialog");

    static {
        kotlin.enums.a.a(fg0VarArr);
    }

    public static fg0 valueOf(String str) {
        return (fg0) Enum.valueOf(fg0.class, str);
    }

    public static fg0[] values() {
        return (fg0[]) f77387b.clone();
    }

    public fg0(String str) {
        super(str, i);
    }
}

package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 yads.p62[], still in use, count: 1, list:
  (r1v1 yads.p62[]) from 0x000d: INVOKE (r1v1 yads.p62[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:16)
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
public final class p62 {
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_VIDEO_PRELOADING_STRATEGY;

    static {
        kotlin.enums.a.a(p62VarArr);
    }

    public p62() {
        super("FIRST_VIDEO_PRELOADING_STRATEGY", 0);
    }

    public static p62 valueOf(String str) {
        return (p62) Enum.valueOf(p62.class, str);
    }

    public static p62[] values() {
        return (p62[]) f81264b.clone();
    }
}

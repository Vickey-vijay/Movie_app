package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.bb0[], still in use, count: 1, list:
  (r4v2 yads.bb0[]) from 0x001d: INVOKE (r4v2 yads.bb0[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:32)
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
public final class bb0 {
    f75772c,
    f75773d;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ab0 f75771b = new ab0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ uj.a f75775f;

    static {
        f75775f = kotlin.enums.a.a(new bb0[]{r0, r2});
    }

    public static bb0 valueOf(String str) {
        return (bb0) Enum.valueOf(bb0.class, str);
    }

    public static bb0[] values() {
        return (bb0[]) f75774e.clone();
    }

    public bb0() {
        super(str, i);
    }
}

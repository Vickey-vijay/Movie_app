package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.l7[], still in use, count: 1, list:
  (r4v2 yads.l7[]) from 0x001f: INVOKE (r4v2 yads.l7[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:34)
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
public final class l7 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("automatic"),
    f79716c("manual");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79718b;

    static {
        kotlin.enums.a.a(l7VarArr);
    }

    public static l7 valueOf(String str) {
        return (l7) Enum.valueOf(l7.class, str);
    }

    public static l7[] values() {
        return (l7[]) f79717d.clone();
    }

    public l7(String str) {
        super(str, i);
        this.f79718b = str;
    }
}

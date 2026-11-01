package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.q22[], still in use, count: 1, list:
  (r4v2 yads.q22[]) from 0x0021: INVOKE (r4v2 yads.q22[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:36)
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
/* JADX INFO: loaded from: classes8.dex */
public final class q22 {
    f81687c("custom"),
    f81688d("template");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81690b;

    static {
        kotlin.enums.a.a(q22VarArr);
    }

    public static q22 valueOf(String str) {
        return (q22) Enum.valueOf(q22.class, str);
    }

    public static q22[] values() {
        return (q22[]) f81689e.clone();
    }

    public q22(String str) {
        super(str, i);
        this.f81690b = str;
    }
}

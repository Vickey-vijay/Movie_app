package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.jl1[], still in use, count: 1, list:
  (r4v2 yads.jl1[]) from 0x001d: INVOKE (r4v2 yads.jl1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:32)
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
public final class jl1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("streaming"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("progressive");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79089b;

    static {
        kotlin.enums.a.a(jl1VarArr);
    }

    public static jl1 valueOf(String str) {
        return (jl1) Enum.valueOf(jl1.class, str);
    }

    public static jl1[] values() {
        return (jl1[]) f79088c.clone();
    }

    public jl1(String str) {
        super(str, i);
        this.f79089b = str;
    }
}

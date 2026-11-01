package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.p03[], still in use, count: 1, list:
  (r4v2 yads.p03[]) from 0x001f: INVOKE (r4v2 yads.p03[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:34)
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
/* JADX INFO: loaded from: classes4.dex */
public final class p03 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("next"),
    f81197c("last");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81199b;

    static {
        kotlin.enums.a.a(p03VarArr);
    }

    public static p03 valueOf(String str) {
        return (p03) Enum.valueOf(p03.class, str);
    }

    public static p03[] values() {
        return (p03[]) f81198d.clone();
    }

    public p03(String str) {
        super(str, i);
        this.f81199b = str;
    }
}

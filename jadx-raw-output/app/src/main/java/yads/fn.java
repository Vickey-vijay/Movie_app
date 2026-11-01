package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 yads.fn[], still in use, count: 1, list:
  (r10v2 yads.fn[]) from 0x0045: INVOKE (r10v2 yads.fn[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:72)
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
public final class fn {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("constant"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("ratio"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("screen_based"),
    f77450d("screen_orientation_based"),
    f77451e("mediation");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final en f77449c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77453b;

    /* JADX WARN: Type inference failed for: r0v1, types: [yads.en] */
    static {
        kotlin.enums.a.a(fnVarArr);
        f77449c = new Object() { // from class: yads.en
        };
    }

    public static fn valueOf(String str) {
        return (fn) Enum.valueOf(fn.class, str);
    }

    public static fn[] values() {
        return (fn[]) f77452f.clone();
    }

    public fn(String str) {
        super(str, i);
        this.f77453b = str;
    }
}

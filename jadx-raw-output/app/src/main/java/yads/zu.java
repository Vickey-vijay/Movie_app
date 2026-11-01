package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.zu[], still in use, count: 1, list:
  (r6v2 yads.zu[]) from 0x002d: INVOKE (r6v2 yads.zu[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:48)
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
public final class zu {
    f85586c("internal_browser"),
    f85587d("browser"),
    /* JADX INFO: Fake field, exist only in values array */
    EF31("unknown");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85589b;

    static {
        kotlin.enums.a.a(zuVarArr);
    }

    public static zu valueOf(String str) {
        return (zu) Enum.valueOf(zu.class, str);
    }

    public static zu[] values() {
        return (zu[]) f85588e.clone();
    }

    public zu(String str) {
        super(str, i);
        this.f85589b = str;
    }
}

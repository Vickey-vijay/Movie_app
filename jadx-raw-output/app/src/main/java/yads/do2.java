package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 yads.do2[], still in use, count: 1, list:
  (r8v2 yads.do2[]) from 0x003b: INVOKE (r8v2 yads.do2[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:62)
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
/* JADX INFO: loaded from: classes2.dex */
public final class do2 {
    f76756c("success"),
    f76757d("error"),
    f76758e("no_ads"),
    /* JADX INFO: Fake field, exist only in values array */
    EF43("filtered");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76760b;

    static {
        kotlin.enums.a.a(do2VarArr);
    }

    public static do2 valueOf(String str) {
        return (do2) Enum.valueOf(do2.class, str);
    }

    public static do2[] values() {
        return (do2[]) f76759f.clone();
    }

    public do2(String str) {
        super(str, i);
        this.f76760b = str;
    }
}

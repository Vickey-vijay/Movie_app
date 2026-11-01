package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 yads.zz2[], still in use, count: 1, list:
  (r8v2 yads.zz2[]) from 0x003b: INVOKE (r8v2 yads.zz2[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:62)
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
public final class zz2 {
    f85664c("fixed"),
    f85665d("flexible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("screen"),
    f85666e("sticky");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85668b;

    static {
        kotlin.enums.a.a(zz2VarArr);
    }

    public static zz2 valueOf(String str) {
        return (zz2) Enum.valueOf(zz2.class, str);
    }

    public static zz2[] values() {
        return (zz2[]) f85667f.clone();
    }

    public zz2(String str) {
        super(str, i);
        this.f85668b = str;
    }
}

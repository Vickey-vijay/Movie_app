package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v21 yads.if3[], still in use, count: 1, list:
  (r1v21 yads.if3[]) from 0x01fa: INVOKE (r1v21 yads.if3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:509)
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
public final class if3 {
    f78626b,
    f78627c,
    f78628d,
    f78629e,
    f78630f,
    f78631g,
    f78632h,
    f78633i,
    f78634j,
    f78635k,
    f78636l,
    f78637m,
    f78638n,
    f78639o,
    f78640p,
    f78641q,
    f78642r,
    f78643s,
    f78644t,
    f78645u,
    f78646v,
    f78647w,
    f78648x,
    f78649y,
    f78650z,
    A,
    B,
    C,
    D,
    E,
    F,
    G;

    static {
        kotlin.enums.a.a(if3VarArr);
    }

    public static if3 valueOf(String str) {
        return (if3) Enum.valueOf(if3.class, str);
    }

    public static if3[] values() {
        return (if3[]) H.clone();
    }

    public if3() {
        super(str, i);
    }
}

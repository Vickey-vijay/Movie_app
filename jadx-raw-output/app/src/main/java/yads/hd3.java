package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 yads.hd3[], still in use, count: 1, list:
  (r6v1 yads.hd3[]) from 0x0027: INVOKE (r6v1 yads.hd3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:42)
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
/* JADX INFO: loaded from: classes3.dex */
public final class hd3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("VERIFICATION_REJECTED"),
    f78185c("VERIFICATION_NOT_SUPPORTED"),
    f78186d("ERROR_RESOURCE_LOAD");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78188b;

    static {
        kotlin.enums.a.a(hd3VarArr);
    }

    public static hd3 valueOf(String str) {
        return (hd3) Enum.valueOf(hd3.class, str);
    }

    public static hd3[] values() {
        return (hd3[]) f78187e.clone();
    }

    public hd3(String str) {
        super(str, i);
        this.f78188b = i;
    }
}

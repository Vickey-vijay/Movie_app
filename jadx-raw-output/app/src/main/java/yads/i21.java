package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.i21[], still in use, count: 1, list:
  (r6v2 yads.i21[]) from 0x002b: INVOKE (r6v2 yads.i21[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:46)
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
public final class i21 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("top"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("bottom"),
    f78455c("topOffset");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78457b;

    static {
        kotlin.enums.a.a(i21VarArr);
    }

    public static i21 valueOf(String str) {
        return (i21) Enum.valueOf(i21.class, str);
    }

    public static i21[] values() {
        return (i21[]) f78456d.clone();
    }

    public i21(String str) {
        super(str, i);
        this.f78457b = str;
    }
}

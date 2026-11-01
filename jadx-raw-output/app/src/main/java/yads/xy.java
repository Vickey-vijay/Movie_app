package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.xy[], still in use, count: 1, list:
  (r4v2 yads.xy[]) from 0x0021: INVOKE (r4v2 yads.xy[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:36)
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
public final class xy {
    f84741c("network"),
    f84742d("cache");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84744b;

    static {
        kotlin.enums.a.a(xyVarArr);
    }

    public static xy valueOf(String str) {
        return (xy) Enum.valueOf(xy.class, str);
    }

    public static xy[] values() {
        return (xy[]) f84743e.clone();
    }

    public xy(String str) {
        super(str, i);
        this.f84744b = str;
    }
}

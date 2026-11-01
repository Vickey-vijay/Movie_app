package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.v42[], still in use, count: 1, list:
  (r6v2 yads.v42[]) from 0x002f: INVOKE (r6v2 yads.v42[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:50)
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
public final class v42 {
    f83737c("ad"),
    f83738d("bulk"),
    f83739e("ad_unit");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83741b;

    static {
        kotlin.enums.a.a(v42VarArr);
    }

    public static v42 valueOf(String str) {
        return (v42) Enum.valueOf(v42.class, str);
    }

    public static v42[] values() {
        return (v42[]) f83740f.clone();
    }

    public v42(String str) {
        super(str, i);
        this.f83741b = str;
    }
}

package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.sb3[], still in use, count: 1, list:
  (r6v2 yads.sb3[]) from 0x002f: INVOKE (r6v2 yads.sb3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:50)
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
public final class sb3 {
    f82586c("inconsistent_asset_value"),
    f82587d("no_visible_sponsored_asset"),
    f82588e("no_visible_required_assets");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82590b;

    static {
        kotlin.enums.a.a(sb3VarArr);
    }

    public static sb3 valueOf(String str) {
        return (sb3) Enum.valueOf(sb3.class, str);
    }

    public static sb3[] values() {
        return (sb3[]) f82589f.clone();
    }

    public sb3(String str) {
        super(str, i);
        this.f82590b = str;
    }
}

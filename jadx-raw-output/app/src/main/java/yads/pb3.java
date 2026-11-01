package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 yads.pb3[], still in use, count: 1, list:
  (r14v2 yads.pb3[]) from 0x0067: INVOKE (r14v2 yads.pb3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:106)
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
public final class pb3 {
    f81339c("no_ad_view"),
    f81340d("no_visible_ads"),
    f81341e("not_visible_for_percent"),
    f81342f("required_asset_can_not_be_visible"),
    f81343g("superview_null"),
    f81344h("superview_hidden"),
    f81345i("visible_area_too_small");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81347b;

    static {
        kotlin.enums.a.a(pb3VarArr);
    }

    public static pb3 valueOf(String str) {
        return (pb3) Enum.valueOf(pb3.class, str);
    }

    public static pb3[] values() {
        return (pb3[]) f81346j.clone();
    }

    public pb3(String str) {
        super(str, i);
        this.f81347b = str;
    }
}

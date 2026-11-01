package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 yads.e00[], still in use, count: 1, list:
  (r11v4 yads.e00[]) from 0x0076: INVOKE (r11v4 yads.e00[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:121)
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
public final class e00 {
    f76859d("banner"),
    f76860e("interstitial"),
    f76861f("rewarded"),
    f76862g("native"),
    f76863h("instream"),
    f76864i("appopenad"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("retail"),
    f76865j("feed");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d00 f76858c = new d00();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ uj.a f76867l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76868b;

    static {
        f76867l = kotlin.enums.a.a(new e00[]{r0, r2, r4, r6, r8, r10, r12, r14});
    }

    public static e00 valueOf(String str) {
        return (e00) Enum.valueOf(e00.class, str);
    }

    public static e00[] values() {
        return (e00[]) f76866k.clone();
    }

    public e00(String str) {
        super(str, i);
        this.f76868b = str;
    }
}

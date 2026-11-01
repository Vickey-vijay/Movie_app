package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 yads.th1[], still in use, count: 1, list:
  (r2v4 yads.th1[]) from 0x00f2: INVOKE (r2v4 yads.th1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:245)
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
public final class th1 {
    f83036c(com.safedk.android.utils.g.f44979y + ".AUTOMATIC_SDK_INITIALIZATION"),
    f83037d(com.safedk.android.utils.g.f44979y + ".AGE_RESTRICTED_USER"),
    f83038e(com.safedk.android.utils.g.f44979y + ".ENABLE_LOGGING"),
    f83039f(com.safedk.android.utils.g.f44979y + ".AD_HOST"),
    f83040g(com.safedk.android.utils.g.f44979y + ".FALLBACK_HOSTS"),
    f83041h(com.safedk.android.utils.g.f44979y + ".APPMETRICA_EASY_INTEGRATION_ENABLED"),
    f83042i(com.safedk.android.utils.g.f44979y + ".APPMETRICA_ANALYTICS_ENABLED"),
    f83043j(com.safedk.android.utils.g.f44979y + ".SINGLE_ASSEMBLY_ENABLED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83045b;

    static {
        kotlin.enums.a.a(th1VarArr);
    }

    public static th1 valueOf(String str) {
        return (th1) Enum.valueOf(th1.class, str);
    }

    public static th1[] values() {
        return (th1[]) f83044k.clone();
    }

    public th1(String str) {
        super(str, i);
        this.f83045b = str;
    }
}

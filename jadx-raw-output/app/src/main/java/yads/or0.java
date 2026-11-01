package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 yads.or0[], still in use, count: 1, list:
  (r11v4 yads.or0[]) from 0x006e: INVOKE (r11v4 yads.or0[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:113)
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
public final class or0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("AdPodSkipFeatureToggle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("InterstitialPreloading"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("RewardedPreloading"),
    f81130c("FirstVideoPreloadingStrategyFeatureToggle"),
    f81131d("TestingNewAdapterFeatureToggle"),
    f81132e("FallbackForVideoFeatureToggle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF73("BackgroundNativeVideoPreloading"),
    /* JADX INFO: Fake field, exist only in values array */
    EF83("DontWaitForWebViewLoadFinishOnPreloading");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81134b;

    static {
        kotlin.enums.a.a(or0VarArr);
    }

    public static or0 valueOf(String str) {
        return (or0) Enum.valueOf(or0.class, str);
    }

    public static or0[] values() {
        return (or0[]) f81133f.clone();
    }

    public or0(String str) {
        super(str, i);
        this.f81134b = str;
    }
}

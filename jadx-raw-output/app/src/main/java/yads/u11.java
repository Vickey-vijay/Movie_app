package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 yads.u11[], still in use, count: 1, list:
  (r3v46 yads.u11[]) from 0x03d8: INVOKE (r3v46 yads.u11[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)]
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
/* JADX INFO: loaded from: classes9.dex */
public final class u11 {
    f83300c("Ad-Width"),
    f83301d("Ad-Height"),
    f83302e("Ad-Type"),
    f83303f("Ad-Info"),
    f83304g("Ad-CloseButtonDelay"),
    f83305h("Ad-ImpressionData"),
    f83306i("Ad-PreloadNativeVideo"),
    f83307j("Ad-PreloadImages"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("Ad-RenderTrackingUrls"),
    f83308k("Ad-Design"),
    f83309l("Ad-Language"),
    f83310m("Ad-Experiments"),
    f83311n("Ad-AbExperiments"),
    f83312o("Ad-Mediation"),
    f83313p("Ad-ContentType"),
    f83314q("Ad-ServerLogId"),
    f83315r("Ad-PrefetchCount"),
    f83316s("Ad-RefreshPeriod"),
    f83317t("Ad-ReloadTimeout"),
    f83318u("Ad-RewardAmount"),
    f83319v("Ad-RewardDelay"),
    f83320w("Ad-RewardType"),
    f83321x("Ad-RewardUrl"),
    f83322y("Ad-EmptyInterval"),
    f83323z("Ad-Renderer"),
    A("Ad-RotationEnabled"),
    B("Ad-RawVastEnabled"),
    C("Ad-ServerSideReward"),
    D("Ad-SessionData"),
    E("Ad-FeedSessionData"),
    F("Ad-RenderAdIds"),
    G("Ad-ImpressionAdIds"),
    H("Ad-NonSkippableAdEnabled"),
    I("Ad-AdTypeFormat"),
    J("Ad-ProductType"),
    K("Ad-Source"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("User-Agent"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("encrypted-request"),
    L("Ad-AnalyticsParameters"),
    M("Ad-IncreasedAdSize"),
    N("Ad-ShouldInvalidateStartup"),
    O("Ad-DesignFormat"),
    P("Ad-NativeVideoPreloadingStrategy"),
    Q("Ad-NativeImageLoadingStrategy"),
    R("Ad-ServerSideClientIP"),
    S("Ad-OpenLinksInApp"),
    T("Ad-Base64Encoding"),
    U("Ad-MediaBase64Encoding"),
    V("Ad-DivBase64Encoding"),
    W("Ad-WaitWebViewLoadFinishOnPreloading"),
    X("Ad-NativeVideoBackgroundPreloading"),
    Y("Ad-HideNavigationBar"),
    Z("Ad-WebViewCacheMode"),
    f83298a0("Ad-ForceValidateAssets");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83324b;

    static {
        kotlin.enums.a.a(u11VarArr);
    }

    public static u11 valueOf(String str) {
        return (u11) Enum.valueOf(u11.class, str);
    }

    public static u11[] values() {
        return (u11[]) f83299b0.clone();
    }

    public final String a() {
        return this.f83324b;
    }

    public u11(String str) {
        super(str, i);
        this.f83324b = str;
    }
}

package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 yads.co2[], still in use, count: 1, list:
  (r3v46 yads.co2[]) from 0x03b4: INVOKE (r3v46 yads.co2[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)]
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
public final class co2 {
    f76352c("ad_loading_result"),
    f76353d("ad_rendering_result"),
    f76354e("adapter_auto_refresh"),
    f76355f("adapter_invalid"),
    f76356g("adapter_request"),
    f76357h("adapter_response"),
    f76358i("adapter_bidder_token_request"),
    f76359j("adtune"),
    f76360k("ad_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("ad_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("vast_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("vast_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("vast_wrapper_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("vast_wrapper_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("video_ad_start"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("video_ad_complete"),
    f76361l("video_ad_player_error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("vmap_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("vmap_response"),
    f76362m("rendering_start"),
    f76363n("dsp_rendering_start"),
    f76364o("impression_tracking_start"),
    f76365p("impression_tracking_success"),
    f76366q("impression_tracking_failure"),
    f76367r("forced_impression_tracking_failure"),
    f76368s("adapter_action"),
    f76369t("click"),
    f76370u("close"),
    f76371v("feedback"),
    f76372w("deeplink"),
    f76373x("bound_assets"),
    f76374y("rendered_assets"),
    f76375z("rebind"),
    A("binding_failure"),
    B("expected_view_missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("returned_to_app"),
    C("reward"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("video_ad_rendering_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("multibanner_event"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("ad_view_size_info"),
    D("dsp_impression_tracking_start"),
    E("dsp_impression_tracking_success"),
    F("dsp_impression_tracking_failure"),
    G("dsp_forced_impression_tracking_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(CreativeInfo.f44317an),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("open_bidding_token_generation_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("sdk_configuration_success"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("sdk_configuration_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("tracking_event"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("ad_verification_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("sdk_configuration_request"),
    H("activity_result_opened"),
    I("client_bidding_loading_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF731("activity_action");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76376b;

    static {
        kotlin.enums.a.a(co2VarArr);
    }

    public static co2 valueOf(String str) {
        return (co2) Enum.valueOf(co2.class, str);
    }

    public static co2[] values() {
        return (co2[]) J.clone();
    }

    public final String a() {
        return this.f76376b;
    }

    public co2(String str) {
        super(str, i);
        this.f76376b = str;
    }
}

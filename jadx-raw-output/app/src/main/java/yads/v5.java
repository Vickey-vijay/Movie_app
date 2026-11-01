package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 yads.v5[], still in use, count: 1, list:
  (r1v15 yads.v5[]) from 0x01b7: INVOKE (r1v15 yads.v5[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:442)
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
public final class v5 {
    f83743c("adapter_loading_duration"),
    f83744d("advertising_info_loading_duration"),
    f83745e("ad_loading_duration"),
    f83746f("ad_rendering_duration"),
    f83747g("bidding_data_loading_duration"),
    f83748h("identifiers_loading_duration"),
    f83749i("sdk_initialization_duration"),
    f83750j("sdk_configuration_queue_duration"),
    f83751k("sdk_configuration_loading_duration"),
    f83752l("sdk_configuration_request_queue_duration"),
    f83753m("sdk_configuration_request_duration"),
    f83754n("resources_loading_duration"),
    f83755o("image_loading_duration"),
    f83756p("video_caching_duration"),
    f83757q("web_view_caching_duration"),
    f83758r("network_request_queue_duration"),
    f83759s("network_request_durations"),
    f83760t("vast_loading_durations"),
    f83761u("video_ad_rendering_duration"),
    f83762v("video_ad_prepare_duration"),
    f83763w("vmap_loading_duration"),
    f83764x("bidder_token_loading_duration"),
    f83765y("bidder_token_generation_duration"),
    f83766z("dns_prefetch_duration"),
    A("client_bidding_data_loading_duration");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83767b;

    static {
        kotlin.enums.a.a(v5VarArr);
    }

    public static v5 valueOf(String str) {
        return (v5) Enum.valueOf(v5.class, str);
    }

    public static v5[] values() {
        return (v5[]) B.clone();
    }

    public v5(String str) {
        super(str, i);
        this.f83767b = str;
    }
}

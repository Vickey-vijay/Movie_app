package yads;

import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class eu2 implements dq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f77194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq2 f77195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g53 f77196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm0 f77197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ip f77198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dn0 f77199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u7 f77200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p33 f77201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cy2 f77202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final od2 f77203j;

    public static Integer a(String str, JSONObject jSONObject) {
        Object objM3458constructorimpl;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (Integer) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    public eu2(at1 at1Var, dq2 dq2Var, g53 g53Var, hm0 hm0Var, ip ipVar, dn0 dn0Var, u7 u7Var, p33 p33Var, cy2 cy2Var, od2 od2Var) {
        this.f77194a = at1Var;
        this.f77195b = dq2Var;
        this.f77196c = g53Var;
        this.f77197d = hm0Var;
        this.f77198e = ipVar;
        this.f77199f = dn0Var;
        this.f77200g = u7Var;
        this.f77201h = p33Var;
        this.f77202i = cy2Var;
        this.f77203j = od2Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0177  */
    @Override // yads.dq2
    public final Object a(wp2 wp2Var) {
        gm0 gm0Var;
        Map mapA;
        Object objM3458constructorimpl;
        Object objM3458constructorimpl2;
        Set setA;
        md2 md2Var;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        String str = (String) this.f77195b.a(wp2Var);
        Object obj = null;
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean zOptBoolean = jSONObject.optBoolean("custom_click_handling_enabled");
            boolean zOptBoolean2 = jSONObject.optBoolean("legacy_visibility_logic_enabled");
            boolean zOptBoolean3 = jSONObject.optBoolean("legacy_vast_tracking_enabled");
            boolean zOptBoolean4 = jSONObject.optBoolean("overlapping_view_tracking_enabled");
            boolean zOptBoolean5 = jSONObject.optBoolean("overlapping_window_tracking_enabled");
            boolean zOptBoolean6 = jSONObject.optBoolean("open_measurement_sdk_disabled");
            cl.a aVar = ge1.f77787a;
            Boolean boolValueOf = jSONObject.has("visibility_error_indicator_enabled") ? Boolean.valueOf(jSONObject.optBoolean("visibility_error_indicator_enabled")) : null;
            String strOptString2 = jSONObject.optString("mraid_controller", null);
            String strOptString3 = jSONObject.optString("open_measurement_sdk_controller", null);
            String strOptString4 = jSONObject.optString("click_handler_type", null);
            String strOptString5 = jSONObject.optString("ad_host", null);
            String strOptString6 = jSONObject.optString("divkit_font", null);
            String strOptString7 = jSONObject.optString("instream_design", null);
            boolean zOptBoolean7 = jSONObject.optBoolean("sensitive_mode_disabled");
            boolean zOptBoolean8 = jSONObject.optBoolean("hard_sensitive_mode_enabled");
            boolean zOptBoolean9 = jSONObject.optBoolean("encrypted_requests_enabled");
            Boolean boolValueOf2 = jSONObject.has("mediation_sensitive_mode_disabled") ? Boolean.valueOf(jSONObject.optBoolean("mediation_sensitive_mode_disabled")) : null;
            boolean zOptBoolean10 = jSONObject.optBoolean("fused_location_provider_disabled");
            boolean zOptBoolean11 = jSONObject.optBoolean("lock_screen_enabled");
            boolean zOptBoolean12 = jSONObject.optBoolean("impression_validation_on_click_enabled");
            boolean zOptBoolean13 = jSONObject.optBoolean("legacy_slider_impression_enabled");
            long jOptLong = jSONObject.optLong("reload_timeout");
            this.f77196c.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() + (jOptLong > 0 ? jOptLong * 1000 : SignalManager.TWENTY_FOUR_HOURS_MILLIS);
            int iOptInt = jSONObject.optInt("ad_ids_storage_size");
            int iOptInt2 = jSONObject.optInt("native_web_view_pool_size");
            long jOptLong2 = jSONObject.optLong("max_disk_cache_size_bytes_for_video");
            long jOptLong3 = jSONObject.optLong("max_disk_cache_size_bytes_for_request_queue");
            Integer numA = ge1.a("ad_request_max_retries", jSONObject);
            Integer numA2 = ge1.a("ping_request_max_retries", jSONObject);
            boolean zOptBoolean14 = jSONObject.optBoolean("show_version_validation_error_log", false);
            boolean zOptBoolean15 = jSONObject.optBoolean("show_version_validation_error_indicator", false);
            boolean zOptBoolean16 = jSONObject.optBoolean("fullscreen_back_button_enabled", false);
            boolean zOptBoolean17 = jSONObject.optBoolean("divkit_disabled", false);
            boolean zOptBoolean18 = jSONObject.optBoolean("location_consent", false);
            boolean zOptBoolean19 = jSONObject.optBoolean("libssl_enabled", false);
            boolean zOptBoolean20 = jSONObject.optBoolean("client_bidding_startup_initialization_enabled");
            boolean zOptBoolean21 = jSONObject.optBoolean("header_bidding_startup_initialization_enabled");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bidding_settings");
            hp hpVarB = jSONObjectOptJSONObject2 != null ? this.f77198e.b(jSONObjectOptJSONObject2) : null;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("encryption");
            this.f77197d.getClass();
            if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("rsa")) == null) {
                gm0Var = null;
            } else {
                try {
                    String strOptString8 = jSONObjectOptJSONObject.optString("public_key", "");
                    Integer numA3 = ge1.a("version", jSONObjectOptJSONObject);
                    if (strOptString8.length() <= 0 || numA3 == null) {
                        gm0Var = null;
                    } else {
                        gm0Var = new gm0(numA3.intValue(), strOptString8);
                    }
                } catch (JSONException e10) {
                    e = e10;
                    obj = null;
                    boolean z10 = ad1.f75480a;
                    this.f77194a.reportError("Can't parse sdk configuration response", e);
                    return obj;
                }
            }
            boolean zOptBoolean22 = jSONObject.optBoolean("legacy_impression_callback_enabled", false);
            boolean zOptBoolean23 = jSONObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
            boolean zOptBoolean24 = jSONObject.optBoolean("render_asset_validation_enabled", false);
            boolean zOptBoolean25 = jSONObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
            boolean zOptBoolean26 = jSONObject.optBoolean("native_banner_enabled", false);
            boolean zOptBoolean27 = jSONObject.optBoolean("use_divkit_close_action_instead_system_click", false);
            obj = null;
            String strOptString9 = jSONObject.optString("banner_size_calculation_type", null);
            String strOptString10 = jSONObject.optString("startup_version", null);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("startup_parameters");
            if (jSONObjectOptJSONObject4 != null) {
                this.f77201h.getClass();
                mapA = p33.a(jSONObjectOptJSONObject4);
            } else {
                mapA = null;
            }
            boolean zOptBoolean28 = jSONObject.optBoolean("app_open_ad_preloading_enabled", false);
            boolean zOptBoolean29 = jSONObject.optBoolean("interstitial_preloading_enabled", false);
            boolean zOptBoolean30 = jSONObject.optBoolean("rewarded_preloading_enabled", false);
            boolean zOptBoolean31 = jSONObject.optBoolean("new_false_click_tracking_enabled", false);
            boolean zOptBoolean32 = jSONObject.optBoolean("varioqub_enabled", false);
            boolean zOptBoolean33 = jSONObject.optBoolean("crash_tracker_enabled", false);
            boolean zOptBoolean34 = jSONObject.optBoolean("error_tracker_enabled", false);
            boolean zOptBoolean35 = jSONObject.optBoolean("anr_tracker_enabled", false);
            try {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(Long.valueOf(jSONObject.getLong("anr_tracker_interval")));
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            Long l10 = (Long) objM3458constructorimpl;
            try {
                objM3458constructorimpl2 = Result.m3458constructorimpl(Long.valueOf(jSONObject.getLong("anr_tracker_threshold")));
            } catch (Throwable th3) {
                Result.a aVar4 = Result.Companion;
                objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th3));
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl2)) {
                objM3458constructorimpl2 = null;
            }
            Long l11 = (Long) objM3458constructorimpl2;
            boolean zOptBoolean36 = jSONObject.optBoolean("exit_info_anr_tracker_enabled", false);
            Integer numA4 = a("exit_info_anr_tracker_max_results", jSONObject);
            Integer numA5 = a("exit_info_anr_tracker_historical_threshold_days", jSONObject);
            Boolean boolValueOf3 = jSONObject.has("exit_info_anr_tracker_enriched_traces_enabled") ? Boolean.valueOf(jSONObject.optBoolean("exit_info_anr_tracker_enriched_traces_enabled")) : null;
            boolean zOptBoolean37 = jSONObject.optBoolean("crash_ignore_enabled", false);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("crash_stack_trace_exclusion_rules");
            if (jSONArrayOptJSONArray != null) {
                this.f77199f.getClass();
                setA = dn0.a(jSONArrayOptJSONArray);
            } else {
                setA = null;
            }
            boolean zOptBoolean38 = jSONObject.optBoolean("time_stamping_tracking_urls_enabled", false);
            boolean zOptBoolean39 = jSONObject.optBoolean("app_ad_analytics_reporting_enabled", true);
            boolean zOptBoolean40 = jSONObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
            Integer numA6 = a("network_thread_pool_size", jSONObject);
            Integer numA7 = a("image_loading_thread_pool_size", jSONObject);
            Integer numA8 = a("timeout_interval_for_request", jSONObject);
            Integer numA9 = a("timeout_interval_for_ping_request", jSONObject);
            u7 u7Var = this.f77200g;
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("verification_configuration");
            u7Var.getClass();
            f8 f8VarA = u7.a(jSONObjectOptJSONObject5);
            boolean zOptBoolean41 = jSONObject.optBoolean("sdk_tracking_reporter_enabled", false);
            List listB = ge1.b("fallback_hosts", jSONObject);
            if (listB == null) {
                listB = nj.s.k();
            }
            List list = listB;
            boolean zOptBoolean42 = jSONObject.optBoolean("should_prefetch_dns", false);
            boolean zOptBoolean43 = jSONObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
            boolean zOptBoolean44 = jSONObject.optBoolean("outstream_wrapper_video_supported", false);
            boolean zOptBoolean45 = jSONObject.optBoolean("validate_click_in_web_view", false);
            boolean zOptBoolean46 = jSONObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
            Integer numA10 = a("instream_qrcode_size_in_px", jSONObject);
            boolean zOptBoolean47 = jSONObject.optBoolean("hide_bottom_navigation_bar", false);
            boolean zOptBoolean48 = jSONObject.optBoolean("pre_warm_web_view_on_background", false);
            boolean zOptBoolean49 = jSONObject.optBoolean("support_gif", false);
            vw0 vw0VarA = jSONObject.has("font") ? xw0.a(jSONObject.getJSONObject("font")) : null;
            boolean zOptBoolean50 = jSONObject.optBoolean("force_default_player", false);
            boolean zOptBoolean51 = jSONObject.optBoolean("use_media3", false);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("session");
            this.f77202i.getClass();
            by2 by2Var = (jSONObjectOptJSONObject6 == null || (strOptString = jSONObjectOptJSONObject6.optString("token")) == null || strOptString.length() == 0) ? null : new by2(strOptString);
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("playback_optimization_config");
            od2 od2Var = this.f77203j;
            od2Var.getClass();
            if (jSONObjectOptJSONObject7 != null) {
                try {
                    cl.a aVar5 = od2Var.f81006a;
                    String string = jSONObjectOptJSONObject7.toString();
                    aVar5.a();
                    md2Var = (md2) aVar5.b(md2.Companion.serializer(), string);
                } catch (Exception unused) {
                    md2Var = null;
                }
            } else {
                md2Var = null;
            }
            Object obj2 = dw2.f76819j;
            return new nt2(iOptInt, iOptInt2, jOptLong2, jOptLong3, jCurrentTimeMillis, zOptBoolean, zOptBoolean10, zOptBoolean11, zOptBoolean7, zOptBoolean8, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean12, zOptBoolean13, zOptBoolean15, zOptBoolean14, zOptBoolean16, zOptBoolean23, zOptBoolean22, zOptBoolean17, zOptBoolean6, zOptBoolean18, zOptBoolean19, zOptBoolean9, zOptBoolean24, zOptBoolean25, zOptBoolean26, zOptBoolean27, zOptBoolean28, zOptBoolean29, zOptBoolean30, zOptBoolean31, zOptBoolean32, numA, numA2, cw2.a().d(), cw2.a().b(), boolValueOf, strOptString9, strOptString2, strOptString3, "7.18.1", strOptString4, strOptString7, strOptString5, strOptString6, boolValueOf2, gm0Var, zOptBoolean20, zOptBoolean21, hpVarB, strOptString10, mapA, zOptBoolean33, zOptBoolean34, zOptBoolean35, l10, l11, zOptBoolean36, numA4, numA5, boolValueOf3, zOptBoolean37, setA, zOptBoolean38, zOptBoolean39, zOptBoolean40, numA6, numA7, numA8, numA9, f8VarA, zOptBoolean41, list, zOptBoolean42, zOptBoolean43, zOptBoolean44, zOptBoolean45, zOptBoolean46, numA10, zOptBoolean47, zOptBoolean48, vw0VarA, zOptBoolean50, zOptBoolean51, zOptBoolean49, by2Var, md2Var);
        } catch (JSONException e11) {
            e = e11;
            boolean z11 = ad1.f75480a;
            this.f77194a.reportError("Can't parse sdk configuration response", e);
            return obj;
        }
    }
}

package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class pno extends tlj {
    public static final ArrayList<String> yu = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Set<String> f13063le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13064lh;

    @Override // com.bytedance.sdk.openadsdk.core.settings.fkw
    public final void ouw(JSONObject jSONObject) {
        int iOptInt;
        fkw.ouw ouwVarOuw = ouw();
        JSONObject jSONObjectFkw = cf.vt().fkw();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.f13064lh = (jSONObjectOptJSONObject == null || jSONObjectFkw == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectFkw.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            ouwVarOuw.ouw("digest", jSONObjectOptJSONObject.toString());
        } else {
            ouwVarOuw.ouw("digest");
        }
        ouwVarOuw.ouw("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * 60 * 1000;
            if (jOptLong < 0 || jOptLong > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                jOptLong = 600000;
            }
            ouwVarOuw.ouw("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            ouwVarOuw.ouw("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            ouwVarOuw.ouw("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("duration")) {
                ouwVarOuw.ouw("duration", jSONObjectOptJSONObject2.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject2.has("max")) {
                ouwVarOuw.ouw("max", jSONObjectOptJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            ouwVarOuw.ouw("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                ouwVarOuw.ouw("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                ouwVarOuw.ouw("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            cf.vt().pno.ouw().ouw("tt_sdk_settings").ouw("ab_test_param").ouw();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            ouwVarOuw.ouw("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            ouwVarOuw.ouw("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            ouwVarOuw.ouw("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            ouwVarOuw.ouw("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            ouwVarOuw.ouw("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            ouwVarOuw.ouw("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            ouwVarOuw.ouw("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            ouwVarOuw.ouw("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            ouwVarOuw.ouw("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            ouwVarOuw.ouw("dc", jSONObject.optString("dc"));
        }
        final cf cfVarVt = cf.vt();
        if (jSONObject.has("dyn_draw_engine_url")) {
            pno pnoVar = cfVarVt.pno;
            String str = cf.yu;
            String strOuw = pnoVar.ouw("dyn_draw_engine_url", str);
            final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
            if (!TextUtils.isEmpty(strOuw) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strOuw)) {
                jg.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.7
                    public final /* synthetic */ String ouw;

                    public AnonymousClass7() {
                        str = strOptString;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TextUtils.equals(cf.this.pno.ouw("dyn_draw_engine_url", cf.yu), str)) {
                            com.bytedance.sdk.component.adexpress.ouw.vt.yu.vt().lh();
                        }
                    }
                }, 5000L);
            }
            ouwVarOuw.ouw("dyn_draw_engine_url", strOptString);
        }
        cf.vt();
        cf.ouw(jSONObject, ouwVarOuw);
        if (jSONObject.has("if_both_open")) {
            ouwVarOuw.ouw("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            ouwVarOuw.ouw("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            ouwVarOuw.ouw("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            ouwVarOuw.ouw("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            ouwVarOuw.ouw("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString2 = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString2) && yu.contains(strOptString2)) {
                    ouwVarOuw.ouw("force_language", strOptString2);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                ouwVarOuw.ouw("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                ouwVarOuw.ouw("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                ouwVarOuw.ouw("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                ouwVarOuw.ouw("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                ouwVarOuw.ouw("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                ouwVarOuw.ouw("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.f13063le.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            this.f13063le.add(jSONArrayOptJSONArray.getString(i10));
                        }
                    }
                    this.f13063le = ouw(this.f13063le);
                    ouwVarOuw.ouw("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th2) {
                    qbp.yu("GeckoLog: settings json error ".concat(String.valueOf(th2)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            ouwVarOuw.ouw("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        lh.ouw(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                ouwVarOuw.ouw("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                ouwVarOuw.ouw("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                ouwVarOuw.ouw("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                ouwVarOuw.ouw("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                ouwVarOuw.ouw("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String strOptString3 = jSONObjectOptJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (TextUtils.isEmpty(strOptString3)) {
                    ouwVarOuw.ouw("privacy_fields_allowed");
                } else {
                    ouwVarOuw.ouw("privacy_fields_allowed", strOptString3);
                }
            }
            if (jSONObjectOptJSONObject6.has("app_reg")) {
                int iOptInt3 = jSONObjectOptJSONObject6.optInt("app_reg", 1);
                if (iOptInt3 == 0 && pd.ouw().yu() == 1 && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("app_register_alert_enable", false)) {
                    bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.pno.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toast.makeText(zih.ouw(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                ouwVarOuw.ouw("privacy_app_reg", iOptInt3 != 0);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            ouwVarOuw.ouw("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            ouwVarOuw.ouw("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt5 < 0 || iOptInt5 > 3) {
                iOptInt5 = 0;
            }
            ouwVarOuw.ouw("splash_video_load_strategy", iOptInt5);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            ouwVarOuw.ouw("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                ouwVarOuw.ouw("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                ouwVarOuw.ouw("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                ouwVarOuw.ouw("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                ouwVarOuw.ouw("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                ouwVarOuw.ouw("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                ouwVarOuw.ouw("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                ouwVarOuw.ouw("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                ouwVarOuw.ouw("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                ouwVarOuw.ouw("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", d.f44769a));
            }
            String str2 = cf.ouw;
            if (jSONObjectOptJSONObject7.has(str2)) {
                ouwVarOuw.ouw(str2, jSONObjectOptJSONObject7.optBoolean(str2, false));
            }
            String str3 = cf.vt;
            if (jSONObjectOptJSONObject7.has(str3)) {
                ouwVarOuw.ouw(str3, jSONObjectOptJSONObject7.optInt(str3, 10000));
            }
            String str4 = cf.f13052lh;
            if (jSONObjectOptJSONObject7.has(str4)) {
                ouwVarOuw.ouw(str4, (float) jSONObjectOptJSONObject7.optDouble(str4, 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_stats_rate")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            ouwVarOuw.ouw("perf_con_stats_rate", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString5 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString5)) {
                            ouwVarOuw.ouw("perf_con_applog_send", strOptString5);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        ouwVarOuw.ouw("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        ouwVarOuw.ouw("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        ouwVarOuw.ouw("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        ouwVarOuw.ouw("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        ouwVarOuw.ouw("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        ouwVarOuw.ouw("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString6 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString6)) {
                            ouwVarOuw.ouw("perf_con_thread_pool_config", strOptString6);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        ouwVarOuw.ouw("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        ouwVarOuw.ouw("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        ouwVarOuw.ouw("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        ouwVarOuw.ouw("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        ouwVarOuw.ouw("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        ouwVarOuw.ouw("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        ouwVarOuw.ouw("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        ouwVarOuw.ouw("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        ouwVarOuw.ouw("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                }
            } catch (Throwable th3) {
                qbp.lh("SettingsDefaultRepository", th3.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e10) {
            qbp.yu("SettingsDefaultRepository", "coreSettingJson", e10.getMessage());
        }
        ouwVarOuw.ouw("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            ouwVarOuw.ouw("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            ouwVarOuw.ouw("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String strOptString7 = jSONObject.optString("token_adx_ids", "");
            if (TextUtils.isEmpty(strOptString7)) {
                ouwVarOuw.ouw("token_adx_ids");
            } else {
                ouwVarOuw.ouw("token_adx_ids", strOptString7);
            }
        }
        ouwVarOuw.ouw();
        cf.vt().rn();
        lh();
    }

    public pno(tlj.ouw ouwVar) {
        super("tt_sdk_settings_sr.prop", ouwVar);
        this.f13063le = Collections.synchronizedSet(new HashSet());
    }

    public static Set<String> ouw(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}

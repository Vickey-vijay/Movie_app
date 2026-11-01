package com.applovin.impl;

/* JADX INFO: loaded from: classes2.dex */
public class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f10263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z4 f10238c = new z4("com.applovin.sdk.impl.isFirstRun", String.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z4 f10239d = new z4("com.applovin.sdk.launched_before", Boolean.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z4 f10240e = new z4("com.applovin.sdk.launch_count", Long.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z4 f10241f = new z4("com.applovin.sdk.last_launch_timestamp", Long.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z4 f10242g = new z4("com.applovin.sdk.latest_installed_version", String.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z4 f10243h = new z4("com.applovin.sdk.install_date", Long.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z4 f10244i = new z4("com.applovin.sdk.av", Boolean.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z4 f10245j = new z4("com.applovin.sdk.save_settings_with_sdk_key_agnostic_name", Boolean.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z4 f10246k = new z4("com.applovin.sdk.user_id", String.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z4 f10247l = new z4("com.applovin.sdk.compass_random_token", String.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z4 f10248m = new z4("com.applovin.sdk.applovin_random_token", String.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z4 f10249n = new z4("com.applovin.sdk.alart", String.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z4 f10250o = new z4("com.applovin.sdk.aleid", String.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z4 f10251p = new z4("com.applovin.sdk.device_test_group", String.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z4 f10252q = new z4("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z4 f10253r = new z4("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z4 f10254s = new z4("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z4 f10255t = new z4("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final z4 f10256u = new z4("IABTCF_CmpSdkID", Object.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z4 f10257v = new z4("IABTCF_CmpSdkVersion", Object.class);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z4 f10258w = new z4("IABTCF_gdprApplies", Object.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final z4 f10259x = new z4("IABTCF_TCString", String.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final z4 f10260y = new z4("IABTCF_AddtlConsent", String.class);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z4 f10261z = new z4("IABTCF_VendorConsents", String.class);
    public static final z4 A = new z4("IABTCF_VendorLegitimateInterests", String.class);
    public static final z4 B = new z4("IABTCF_PurposeConsents", String.class);
    public static final z4 C = new z4("IABTCF_PurposeLegitimateInterests", String.class);
    public static final z4 D = new z4("IABTCF_SpecialFeaturesOptIns", String.class);
    public static final z4 E = new z4("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final z4 F = new z4("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final z4 G = new z4("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final z4 H = new z4("com.applovin.sdk.persisted_data", String.class);
    public static final z4 I = new z4("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final z4 J = new z4("com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula", Boolean.class);
    public static final z4 K = new z4("com.applovin.sdk.mediation.stats_per_ad_unit_since_install", String.class);
    public static final z4 L = new z4("com.applovin.sdk.mediation.stats_per_ad_format_since_install", String.class);
    public static final z4 M = new z4("com.applovin.sdk.user_agent", String.class);
    public static final z4 N = new z4("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final z4 O = new z4("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final z4 P = new z4("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final z4 Q = new z4("com.applovin.sdk.app_killed_last_ad_data", String.class);
    public static final z4 R = new z4("com.applovin.sdk.app_killed_last_mediated_ad_tracking_info", String.class);
    public static final z4 S = new z4("com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms", Long.class);
    public static final z4 T = new z4("com.applovin.sdk.template_browser_package_name", String.class);

    public String a() {
        return this.f10262a;
    }

    public Class b() {
        return this.f10263b;
    }

    public String toString() {
        return "Key{name='" + this.f10262a + "', type=" + this.f10263b + '}';
    }

    public z4(String str, Class cls) {
        this.f10262a = str;
        this.f10263b = cls;
    }
}

package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Consumer;
import com.applovin.impl.d8;
import com.applovin.impl.f4;
import com.applovin.impl.g1;
import com.applovin.impl.h5;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.o0;
import com.applovin.impl.o4;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends AppLovinAdImpl implements q4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f9141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f9142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f9143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bundle f9144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f9146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f9149m;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    public enum EnumC0045b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9162e;

        private d() {
            this.f9158a = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), b.this.o());
            this.f9159b = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), b.this.q());
            this.f9160c = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), b.this.m());
            this.f9161d = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), ((Integer) b.this.sdk.a(x4.f9956j1)).intValue());
            this.f9162e = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), ((Integer) b.this.sdk.a(x4.f9947i1)).intValue());
        }
    }

    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    private List E() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List k(h5 h5Var) {
        return n7.a(h5Var.a("imp_urls", new JSONObject()), getClCode(), null, null, J(), N0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d8 o(h5 h5Var) {
        return new d8(h5Var.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    public List A() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.k
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9178a.k((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, J(), N0(), this.sdk);
        }
        return listA;
    }

    public int B() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(x4.S0)).intValue());
    }

    public boolean C() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public abstract boolean C0();

    public List D() {
        List listE = E();
        if (listE == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listE.size());
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public abstract void E0();

    public List F() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public Uri G() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public List H() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public abstract String I();

    public Map J() {
        HashMap map = new HashMap();
        try {
            h5 h5Var = this.synchronizedAdObject;
            map.putAll(h5Var != null ? (Map) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.y
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.l((h5) obj);
                }
            }) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e10) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for postbacks", e10);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", n8.a());
        }
        return map;
    }

    public EnumC0045b K() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0045b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0045b.DO_NOT_DISMISS;
            }
        }
        return EnumC0045b.UNSPECIFIED;
    }

    public int L() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public long M() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public List N() {
        return getStringListFromAdObject("pbpn", this.sdk.c(x4.O6));
    }

    public long O() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public void c(final String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.a(new Consumer() { // from class: com.applovin.impl.sdk.ad.t
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    b.a(str, (h5) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public abstract Uri c0();

    public List e() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.i
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9177a.a((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public long f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public long g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public abstract f4 getAdEventTracker();

    public Bundle h() {
        return this.f9144h;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public abstract boolean isOpenMeasurementEnabled();

    public List j() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.h
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9176a.b((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public Map l() {
        return this.f9140d;
    }

    public abstract Uri l0();

    public int m() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(x4.M1)).intValue());
    }

    public com.applovin.impl.adview.e.a p() {
        List listE = E();
        int intFromAdObject = getIntFromAdObject("close_style", (listE == null || listE.size() <= 0) ? -1 : ((Integer) listE.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int q() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(x4.O1)).intValue());
    }

    public long r() {
        List listF = F();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listF == null || listF.size() <= 0) ? 0L : ((Integer) listF.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public int t() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public boolean u() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public String v() {
        return this.f9145i;
    }

    public int w() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int x() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int y() {
        return n7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public abstract boolean y0();

    public long z() {
        return this.f9146j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g1 h(h5 h5Var) {
        JSONObject jSONObjectA = h5Var.a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new g1(jSONObjectA);
        }
        return null;
    }

    private String h0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map l(h5 h5Var) {
        try {
            return JsonUtils.toStringMap(h5Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.adview.m q(h5 h5Var) {
        JSONObject jSONObjectA = h5Var.a("web_view_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new com.applovin.impl.adview.m(jSONObjectA);
        }
        return null;
    }

    public boolean A0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(x4.Y1));
    }

    public boolean B0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public boolean F0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.a(x4.f10064w2));
    }

    public boolean G0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.a(x4.f9929g1));
    }

    public boolean H0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean I0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(x4.D6));
    }

    public boolean J0() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? ((Boolean) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.p
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.r((h5) obj);
            }
        })).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public boolean K0() {
        return this.f9142f.get();
    }

    public boolean M0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(x4.R0));
    }

    public boolean N0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public boolean O0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public int P() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean P0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public List Q() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean Q0() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    public int R() {
        return this.f9147k;
    }

    public boolean R0() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public List S() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.c(x4.F0));
        if (n7.j(com.applovin.impl.sdk.k.o())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean S0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(x4.f10056v2)).contains(NotificationCompat.CATEGORY_NAVIGATION);
    }

    public boolean T0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(x4.f10056v2)).contains("none");
    }

    public com.applovin.impl.adview.e.a U() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? p() : a(intFromAdObject);
    }

    public boolean U0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(x4.f10056v2)).contains("status");
    }

    public boolean V0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public c W() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean W0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public String X() {
        return this.f9148l;
    }

    public boolean X0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public Uri Y() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean Y0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public String Z() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? (String) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.x
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.m((h5) obj);
            }
        }) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public void a(String str) {
        this.f9145i = str;
    }

    public String a0() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? (String) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.o
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.n((h5) obj);
            }
        }) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public boolean a1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public void b(String str) {
        this.f9148l = str;
    }

    public d8 b0() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? (d8) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.w
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f9191a.o((h5) obj);
            }
        }) : new d8(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean b1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public boolean c1() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.a(x4.N6));
    }

    public long d0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public boolean d1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public long e0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public int f0() {
        return n7.c(getIntFromAdObject("video_completion_percent", -1));
    }

    public List g0() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.f
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9174a.p((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), h0(), this.sdk);
        }
        return listA;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public Bundle getCustomTabsHeaders() {
        Map map;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            map = (Map) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.g
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9175a.c((h5) obj);
                }
            });
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e10) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", n8.a());
        }
        return bundle;
    }

    public List getCustomTabsNavigationAbortedPostbacks() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.r
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9186a.d((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationFailedPostbacks() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.z
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9192a.e((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationFinishedPostbacks() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.q
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9185a.f((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsNavigationStartedPostbacks() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.s
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9187a.g((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public g1 getCustomTabsSettings() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (g1) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.j
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.h((h5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new g1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List getCustomTabsTabHiddenPostbacks() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.e
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9173a.i((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List getCustomTabsTabShownPostbacks() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.l
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9179a.j((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        final Function function = new Function() { // from class: com.applovin.impl.sdk.ad.u
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f9189a.a((JSONArray) obj);
            }
        };
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.v
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.a(function, (h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public e i0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if ("top".equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return e.LEFT;
        }
        return "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public int j0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean k0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public com.applovin.impl.adview.m n0() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (com.applovin.impl.adview.m) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.a0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.q((h5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.adview.m(jsonObjectFromAdObject);
        }
        return null;
    }

    public List o0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List p0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public void q0() {
        this.f9147k++;
    }

    public boolean r0() {
        return getBooleanFromAdObject("aocve", (Boolean) this.sdk.a(x4.f10052u6));
    }

    public int s() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public boolean s0() {
        return this.f9147k > 0;
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public boolean t0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(x4.f9943h6));
    }

    public boolean u0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(x4.L1));
    }

    public boolean v0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean w0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean x0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public AtomicBoolean z0() {
        return this.f9141e;
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f9140d = Collections.synchronizedMap(new HashMap());
        this.f9141e = new AtomicBoolean();
        this.f9142f = new AtomicBoolean();
        this.f9143g = new AtomicReference();
        this.f9144h = new Bundle();
    }

    public boolean D0() {
        boolean z10;
        if (!n7.j(com.applovin.impl.sdk.k.o()) && !n7.h(com.applovin.impl.sdk.k.o()) && !((Boolean) this.sdk.a(x4.f10092z6)).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(z10));
    }

    public boolean L0() {
        if (!U0() && !S0() && !T0()) {
            return false;
        }
        return true;
    }

    public List T() {
        return getStringListFromAdObject("rea", Q());
    }

    public List V() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean Z0() {
        if (g() >= 0) {
            return true;
        }
        return false;
    }

    public void a(long j10) {
        this.f9146j = j10;
    }

    public void b(boolean z10) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.a("html_resources_cached", z10);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z10);
        }
    }

    public void d() {
        this.f9142f.set(true);
    }

    public List getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public o4 i() {
        return (o4) this.f9143g.getAndSet(null);
    }

    public String k() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public int m0() {
        int i10;
        if (n7.a(getSize())) {
            i10 = 1;
        } else if (((Boolean) this.sdk.a(x4.f9881a6)).booleanValue()) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        return getIntFromAdObject("whalt", i10);
    }

    public d n() {
        if (this.f9149m == null) {
            this.f9149m = new d();
        }
        return this.f9149m;
    }

    public int o() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(x4.N1)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th2) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to parse OMID verification script resource", th2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean r(h5 h5Var) {
        return JsonUtils.getBoolean(h5Var.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List p(h5 h5Var) {
        return n7.a(h5Var.a("video_end_urls", new JSONObject()), getClCode(), h0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public long c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(h5 h5Var) {
        return n7.a(h5Var.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private String c(MotionEvent motionEvent, boolean z10) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapA = a(motionEvent, z10);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapA);
        }
        return null;
    }

    private List b(final MotionEvent motionEvent, final boolean z10) {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.n
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9182a.a(motionEvent, z10, (h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z10), c(motionEvent, z10), J(), N0(), this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(h5 h5Var) {
        try {
            return JsonUtils.toStringMap(h5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e10) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
            }
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(Function function, h5 h5Var) {
        return (List) function.apply(h5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void a(String str, String str2) {
        this.f9140d.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, h5 h5Var) {
        JsonUtils.putString(h5Var.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(h5 h5Var) {
        return n7.a(h5Var.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List b(final MotionEvent motionEvent) {
        List listA;
        List list;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            list = (List) h5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.m
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9180a.a(motionEvent, (h5) obj);
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                listA = n7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, J(), N0(), this.sdk);
            }
            list = listA;
        }
        return list.isEmpty() ? b(motionEvent, true) : list;
    }

    public List a(MotionEvent motionEvent) {
        return b(motionEvent, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, h5 h5Var) {
        return n7.a(h5Var.a("click_tracking_urls", new JSONObject()), a(motionEvent, z10), c(motionEvent, z10), J(), N0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, h5 h5Var) {
        return n7.a(h5Var.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, J(), N0(), this.sdk);
    }

    public void b(Uri uri) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    private Map a(MotionEvent motionEvent, boolean z10) {
        Point pointB = o0.b(com.applovin.impl.sdk.k.o());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointB.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointB.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        return map;
    }

    public void a(Uri uri) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public void a(o4 o4Var) {
        this.f9143g.set(o4Var);
    }

    private com.applovin.impl.adview.e.a a(boolean z10) {
        return z10 ? com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT : com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }

    public com.applovin.impl.adview.e.a a(int i10) {
        if (i10 == 1) {
            return com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return com.applovin.impl.adview.e.a.INVISIBLE;
        }
        if (i10 == 3) {
            return com.applovin.impl.adview.e.a.TRANSPARENT_SKIP;
        }
        return com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }
}

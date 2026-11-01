package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import androidx.annotation.Size;
import androidx.annotation.UiThread;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.A9;
import com.inmobi.media.AbstractC3213tk;
import com.inmobi.media.AbstractC3301x8;
import com.inmobi.media.AbstractC3363zk;
import com.inmobi.media.C3298x5;
import com.inmobi.media.C3327y9;
import com.inmobi.media.Da;
import com.inmobi.media.E1;
import com.inmobi.media.Ea;
import com.inmobi.media.Ii;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Kf;
import com.inmobi.media.L2;
import com.inmobi.media.Lg;
import com.inmobi.media.Og;
import com.inmobi.media.Oj;
import com.inmobi.media.P9;
import com.inmobi.media.Pg;
import com.inmobi.media.RunnableC3352z9;
import com.inmobi.media.Tg;
import com.inmobi.media.W6;
import com.inmobi.media.Yk;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import lk.x;
import mj.g;
import mj.h;
import mj.r;
import nj.s;
import nk.j;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");

        private static final /* synthetic */ uj.a $ENTRIES = kotlin.enums.a.a(values());
        private final String value;

        public static uj.a<AgeGroup> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        AgeGroup(String str) {
            this.value = str;
        }
    }

    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");

        private static final /* synthetic */ uj.a $ENTRIES = kotlin.enums.a.a(values());
        private final String value;

        public static uj.a<Education> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        Education(String str) {
            this.value = str;
        }
    }

    public enum Gender {
        FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
        MALE(InneractiveMediationDefs.GENDER_MALE);

        private static final /* synthetic */ uj.a $ENTRIES = kotlin.enums.a.a(values());
        private final String value;

        public static uj.a<Gender> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        Gender(String str) {
            this.value = str;
        }
    }

    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG;

        private static final /* synthetic */ uj.a $ENTRIES = kotlin.enums.a.a(values());

        public static uj.a<LogLevel> getEntries() {
            return $ENTRIES;
        }
    }

    public static final class PublisherSignals {
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        public final Map<String, Object> getPublisherSignals() {
            Map mapJ;
            ArrayList arrayList;
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                p.i(strAccess$getTAG$p, "access$getTAG$p(...)");
                Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            Og og2 = Og.f23290a;
            og2.getClass();
            try {
                SignalsConfig.PublisherConfig publisherConfigC = Og.c();
                Map map = Pg.f23339a;
                p.j(publisherConfigC, "<this>");
                if (!(publisherConfigC.getEnableMCO() || publisherConfigC.getEnableAB())) {
                    return kotlin.collections.a.j();
                }
                try {
                    SignalsConfig.PublisherConfig publisherConfigC2 = Og.c();
                    p.j(publisherConfigC2, "<this>");
                    mapJ = !(publisherConfigC2.getEnableMCO() || publisherConfigC2.getEnableAB()) ? kotlin.collections.a.j() : kotlin.collections.a.q(Pg.a(og2.b(), Og.c()), og2.d());
                } catch (Exception e10) {
                    g gVar = P9.f23321a;
                    P9.a(new L2(e10));
                    mapJ = kotlin.collections.a.j();
                }
                Map mapB = kotlin.collections.a.B(mapJ);
                for (Pair pair : s.n(h.a(Og.c().getObj(), "o_i_dep"), h.a(Og.c().getDirect(), "d_i_dep"))) {
                    SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
                    String str = (String) pair.component2();
                    if (baseInputData.getDepth().getEnabled()) {
                        Og og3 = Og.f23290a;
                        og3.getClass();
                        JSONArray jSONArrayOptJSONArray = ((JSONObject) Og.f23295f.getValue(og3, Og.f23291b[1])).optJSONArray(str);
                        if (jSONArrayOptJSONArray != null) {
                            p.j(jSONArrayOptJSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                Object obj = jSONArrayOptJSONArray.get(i10);
                                p.i(obj, "get(...)");
                                arrayList.add(obj);
                            }
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            p.j(jSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length2 = jSONArray.length();
                            for (int i11 = 0; i11 < length2; i11++) {
                                Object obj2 = jSONArray.get(i11);
                                p.i(obj2, "get(...)");
                                arrayList.add(obj2);
                            }
                        }
                        mapB.put(str, arrayList);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapB.entrySet()) {
                    if (!x.R((String) entry.getKey(), "auto_", false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            } catch (Exception e11) {
                g gVar2 = P9.f23321a;
                P9.a(new L2(e11));
                Kb.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                return kotlin.collections.a.j();
            }
        }

        public final void putPublisherSignals(Map<String, ? extends Object> map) {
            if (InMobiSdk.isSDKInitialized()) {
                if (map != null) {
                    Og.f23290a.getClass();
                    Og.a(map);
                    return;
                }
                return;
            }
            String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
            p.i(strAccess$getTAG$p, "access$getTAG$p(...)");
            Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
        }

        public final void resetPublisherSignals() {
            if (InMobiSdk.isSDKInitialized()) {
                Og.f23290a.getClass();
                Context context = Ji.f22951a;
                if (context != null && j.d(A9.f22353e, null, null, new Lg(context, null), 3, null) != null) {
                    return;
                }
                r rVar = r.f64562a;
                return;
            }
            String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
            p.i(strAccess$getTAG$p, "access$getTAG$p(...)");
            Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
        }
    }

    public static void a(final Context context, final String str, final JSONObject jSONObject, final SdkInitializationListener sdkInitializationListener) {
        Oj.a(new Runnable() { // from class: c7.a
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.a(context, sdkInitializationListener, str, jSONObject);
            }
        });
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static final void b(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.getClass();
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static final String getToken() {
        return getToken(null, null);
    }

    public static final String getVersion() {
        return "11.1.0";
    }

    public static final void a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        if (context == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Yk.a()) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = p.l(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String string = str.subSequence(i10, length + 1).toString();
        try {
            W6.a(jSONObject);
            if (string.length() == 0) {
                INSTANCE.getClass();
                a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!Kf.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !Kf.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                p.i("InMobiSdk", "TAG");
                Kb.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (Ji.d()) {
                p.i("InMobiSdk", "TAG");
                INSTANCE.getClass();
                a(sdkInitializationListener, null);
                return;
            }
            if (Ji.f22959i == 1) {
                p.i("InMobiSdk", "TAG");
                return;
            }
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(string, "accountId");
            Ji.f22959i = 1;
            Ji.f22951a = context.getApplicationContext();
            Ji.f22954d.set(true);
            Ji.f22953c = string;
            if (!Ji.c(context)) {
                p.i("InMobiSdk", "TAG");
                Ji.f22953c = null;
                Ji.f22951a = null;
                Ji.f22959i = 3;
                INSTANCE.getClass();
                a(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                return;
            }
            p.j(context, GAMConfig.KEY_CONTEXT);
            E1.b(context);
            INSTANCE.getClass();
            a();
            C3327y9 c3327y9 = new C3327y9(context, string, sdkInitializationListener, jElapsedRealtime, null);
            p.j(c3327y9, "runnable");
            j.d(Ji.f22958h, null, null, new Ii(c3327y9, null), 3, null);
        } catch (Exception e10) {
            p.i("InMobiSdk", "TAG");
            e10.getMessage();
            Ji.f22953c = null;
            Ji.f22951a = null;
            Ji.f22959i = 3;
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    @UiThread
    public static final String getToken(Map<String, String> map, String str) {
        return AbstractC3213tk.a(map, str);
    }

    @UiThread
    public static final void init(Context context, @Size(max = 36, min = 32) String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        InMobiSdk inMobiSdk = INSTANCE;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        inMobiSdk.getClass();
        a(applicationContext, str, jSONObject, sdkInitializationListener);
    }

    public static final void setAge(int i10) {
        Context context = Ji.f22951a;
        if (i10 != Integer.MIN_VALUE) {
            Tg.f23564a = i10;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_age", i10, false);
            }
        }
    }

    public static final void setAgeGroup(AgeGroup ageGroup) {
        p.j(ageGroup, "group");
        String string = ageGroup.toString();
        Locale locale = Locale.ENGLISH;
        p.i(locale, "ENGLISH");
        String lowerCase = string.toLowerCase(locale);
        p.i(lowerCase, "toLowerCase(...)");
        Context context = Ji.f22951a;
        if (lowerCase != null) {
            Tg.f23566c = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_age_group", lowerCase, false);
            }
        }
    }

    public static final void setApplicationMuted(boolean z10) {
        Ji.f22956f = z10;
    }

    public static final void setAreaCode(String str) {
        Context context = Ji.f22951a;
        Tg.f23567d = str;
        if (context == null || str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Da.a(context, "user_info_store").a("user_area_code", str, false);
    }

    public static final void setEducation(Education education) {
        p.j(education, "education");
        String string = education.toString();
        Locale locale = Locale.ENGLISH;
        p.i(locale, "ENGLISH");
        String lowerCase = string.toLowerCase(locale);
        p.i(lowerCase, "toLowerCase(...)");
        Context context = Ji.f22951a;
        if (lowerCase != null) {
            Tg.f23574k = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_education", lowerCase, false);
            }
        }
    }

    public static final void setGender(Gender gender) {
        p.j(gender, InneractiveMediationDefs.KEY_GENDER);
        String string = gender.toString();
        Locale locale = Locale.ENGLISH;
        p.i(locale, "ENGLISH");
        String lowerCase = string.toLowerCase(locale);
        p.i(lowerCase, "toLowerCase(...)");
        Context context = Ji.f22951a;
        if (lowerCase != null) {
            Tg.f23573j = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_gender", lowerCase, false);
            }
        }
    }

    public static final void setInterests(String str) {
        Context context = Ji.f22951a;
        if (str != null) {
            Tg.f23576m = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_interest", str, false);
            }
        }
    }

    public static final void setLanguage(String str) {
        Context context = Ji.f22951a;
        if (str != null) {
            Tg.f23575l = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_language", str, false);
            }
        }
    }

    public static final void setLocation(Location location) {
        Context context = Ji.f22951a;
        if (location != null) {
            Tg.f23577n = location;
            if (context != null) {
                String strA = Tg.a(location);
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_location", strA, false);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(String str, String str2, String str3) {
        Context context = Ji.f22951a;
        if (str != null) {
            Tg.f23569f = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_city_code", str, false);
            }
        }
        Context context2 = Ji.f22951a;
        if (str2 != null) {
            Tg.f23570g = str2;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
                Da.a(context2, "user_info_store").a("user_state_code", str2, false);
            }
        }
        Context context3 = Ji.f22951a;
        if (str3 != null) {
            Tg.f23571h = str3;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap3 = Ea.f22576b;
                Da.a(context3, "user_info_store").a("user_country_code", str3, false);
            }
        }
    }

    public static final void setLogLevel(LogLevel logLevel) {
        int i10 = logLevel == null ? -1 : a.f25878a[logLevel.ordinal()];
        if (i10 == 1) {
            Kb.f23011a = (byte) 0;
            return;
        }
        if (i10 == 2) {
            Kb.f23011a = (byte) 1;
        } else if (i10 != 3) {
            Kb.f23011a = (byte) 2;
        } else {
            Kb.f23011a = (byte) 2;
        }
    }

    public static final void setPartnerGDPRConsent(JSONObject jSONObject) {
        if (jSONObject != null) {
            W6.f23728b = jSONObject;
        }
    }

    public static final void setPostalCode(String str) {
        Context context = Ji.f22951a;
        if (str != null) {
            Tg.f23568e = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_post_code", str, false);
            }
        }
    }

    public static final void setPublisherProvidedUnifiedId(JSONObject jSONObject) {
        p.i("InMobiSdk", "TAG");
        Objects.toString(jSONObject);
        RunnableC3352z9 runnableC3352z9 = new RunnableC3352z9(jSONObject);
        Context context = Ji.f22951a;
        p.j(runnableC3352z9, "runnable");
        Ji.f22957g.submit(runnableC3352z9);
    }

    public static final void setYearOfBirth(int i10) {
        Context context = Ji.f22951a;
        if (i10 != Integer.MIN_VALUE) {
            Tg.f23572i = i10;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Da.a(context, "user_info_store").a("user_yob", i10, false);
            }
        }
    }

    public static final /* synthetic */ Map access$prepareTelemetryPayload(InMobiSdk inMobiSdk, long j10) {
        inMobiSdk.getClass();
        return a(j10);
    }

    public static final /* synthetic */ void access$provideCallback(InMobiSdk inMobiSdk, SdkInitializationListener sdkInitializationListener, String str) {
        inMobiSdk.getClass();
        a(sdkInitializationListener, str);
    }

    public static final boolean isSDKInitialized() {
        return Ji.d();
    }

    public static final void setIsAgeRestricted(boolean z10) {
        Tg.a(z10);
        AbstractC3363zk.a(z10);
        if (z10) {
            InMobiUnifiedIdService.reset();
            AbstractC3301x8.a(null);
        }
    }

    public static final void updateGDPRConsent(JSONObject jSONObject) {
        W6.a(jSONObject);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (Kf.a(Ji.f22951a, str)) {
                sb2.append("\n");
                sb2.append(str);
            }
        }
        p.i("InMobiSdk", "TAG");
        Kb.a((byte) 2, "InMobiSdk", sb2.toString());
    }

    public static void a(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            Oj.a(new Runnable() { // from class: c7.c
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.b(sdkInitializationListener, str);
                }
            });
        }
        if (str == null) {
            p.i("InMobiSdk", "TAG");
            Kb.a((byte) 2, "InMobiSdk", "InMobi SDK initialized with account id: " + Ji.f22953c);
            return;
        }
        p.i("InMobiSdk", "TAG");
        Kb.a((byte) 1, "InMobiSdk", str);
    }

    public static LinkedHashMap a(long j10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        p.i("InMobiSdk", "TAG");
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", C3298x5.m());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: c7.b
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.b();
            }
        };
        Context context = Ji.f22951a;
        p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }
}

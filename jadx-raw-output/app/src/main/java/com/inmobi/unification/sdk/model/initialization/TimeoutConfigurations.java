package com.inmobi.unification.sdk.model.initialization;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import bk.p;
import ck.i;
import com.inmobi.media.AbstractC3139qk;
import com.inmobi.media.C3163rk;
import com.inmobi.media.Xh;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.C3605n2;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class TimeoutConfigurations implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;
    public static final C3163rk Companion = new C3163rk();
    private static final String APPLOVIN_KEY = "c_applovin";
    private static final JSONObject defaultNonABBannerloadTimeout = AbstractC3139qk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerMuttTimeout = AbstractC3139qk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntloadTimeout = AbstractC3139qk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntMuttTimeout = AbstractC3139qk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeloadTimeout = AbstractC3139qk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeMuttTimeout = AbstractC3139qk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioloadTimeout = AbstractC3139qk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioMuttTimeout = AbstractC3139qk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABBannerloadTimeout = AbstractC3139qk.a(14500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABBannerMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABBannerRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABIntloadTimeout = AbstractC3139qk.a(29500, 29500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABIntMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABIntRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABNativeloadTimeout = AbstractC3139qk.a(14500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABNativeMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABNativeRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABAudioloadTimeout = AbstractC3139qk.a(14500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABAudioMaxRetries = AbstractC3139qk.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABAudioRetryInterval = AbstractC3139qk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultPreloadBannerPreloadTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadBannerMuttTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadBannerLoadTimeout = Xh.a("default", 14500);
    private static final JSONObject defaultPreloadBannerMaxRetries = Xh.a("default", 3);
    private static final JSONObject defaultPreloadBannerRetryInterval = Xh.a("default", 1000);
    private static final JSONObject defaultPreloadIntPreloadTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadIntMuttTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadIntloadTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadIntMaxRetries = Xh.a("default", 3);
    private static final JSONObject defaultPreloadIntRetryInterval = Xh.a("default", 1000);
    private static final JSONObject defaultPreloadNativePreloadTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadNativeMuttTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadNativeloadTimeout = Xh.a("default", 14500);
    private static final JSONObject defaultPreloadNativeMaxRetries = Xh.a("default", 3);
    private static final JSONObject defaultPreloadNativeRetryInterval = Xh.a("default", 1000);
    private static final JSONObject defaultPreloadAudioPreloadTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadAudioMuttTimeout = Xh.a("default", 29500);
    private static final JSONObject defaultPreloadAudioloadTimeout = Xh.a("default", 14500);
    private static final JSONObject defaultPreloadAudioMaxRetries = Xh.a("default", 3);
    private static final JSONObject defaultPreloadAudioRetryInterval = Xh.a("default", 1000);
    private static final p<JSONObject, Integer, Boolean> validator = new p() { // from class: d7.a
        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo1invoke(Object obj, Object obj2) {
            return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
        }
    };
    private int step4s = 15000;
    private MediationConfig mediationConfig = new MediationConfig();

    @Keep
    public static final class ABConfig {
        private AdABConfig audio;
        private AdABConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        private AdABConfig f4int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private AdABConfig f5native;

        public final AdABConfig getAudio() {
            return this.audio;
        }

        public final AdABConfig getBanner() {
            return this.banner;
        }

        public final AdABConfig getInterstitial() {
            return this.f4int;
        }

        public final AdABConfig getNative() {
            return this.f5native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f4int.isValid() && this.f5native.isValid() && this.audio.isValid();
        }

        public ABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdABConfig(TimeoutConfigurations.defaultABBannerloadTimeout, TimeoutConfigurations.defaultABBannerRetryInterval, TimeoutConfigurations.defaultABBannerMaxRetries);
            this.f4int = new AdABConfig(TimeoutConfigurations.defaultABIntloadTimeout, TimeoutConfigurations.defaultABIntRetryInterval, TimeoutConfigurations.defaultABIntMaxRetries);
            this.f5native = new AdABConfig(TimeoutConfigurations.defaultABNativeloadTimeout, TimeoutConfigurations.defaultABNativeRetryInterval, TimeoutConfigurations.defaultABNativeMaxRetries);
            this.audio = new AdABConfig(TimeoutConfigurations.defaultABAudioloadTimeout, TimeoutConfigurations.defaultABAudioRetryInterval, TimeoutConfigurations.defaultABAudioMaxRetries);
        }
    }

    @Keep
    public static final class AdABConfig {
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            this();
            ck.p.j(jSONObject, C3605n2.f30214t);
            ck.p.j(jSONObject2, "retryInterval");
            ck.p.j(jSONObject3, "maxRetries");
            this.loadTimeout = jSONObject;
            this.loadRetryInterval = jSONObject2;
            this.maxLoadRetries = jSONObject3;
        }
    }

    @Keep
    public static final class AdNonABConfig {
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;
        private JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.muttTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            this();
            ck.p.j(jSONObject, C3605n2.f30214t);
            ck.p.j(jSONObject2, "muttTimeout");
            ck.p.j(jSONObject3, "retryInterval");
            ck.p.j(jSONObject4, "maxRetries");
            this.loadTimeout = jSONObject;
            this.muttTimeout = jSONObject2;
            this.loadRetryInterval = jSONObject3;
            this.maxLoadRetries = jSONObject4;
        }
    }

    @Keep
    public static final class AdPreloadConfig {
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;
        private JSONObject muttTimeout;
        private JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        public final JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.mo1invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
            this();
            ck.p.j(jSONObject, "preloadTimeout");
            ck.p.j(jSONObject2, "muttTimeout");
            ck.p.j(jSONObject3, C3605n2.f30214t);
            ck.p.j(jSONObject4, "retryInterval");
            ck.p.j(jSONObject5, "maxRetries");
            this.preloadTimeout = jSONObject;
            this.muttTimeout = jSONObject2;
            this.loadTimeout = jSONObject3;
            this.loadRetryInterval = jSONObject4;
            this.maxLoadRetries = jSONObject5;
        }
    }

    @Keep
    public static final class MediationConfig {

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        private ABConfig f25879ab = new ABConfig();
        private NonABConfig nonAb = new NonABConfig();
        private PreloadConfig preload = new PreloadConfig();

        public final ABConfig getABConfig() {
            return this.f25879ab;
        }

        public final NonABConfig getNonABConfig() {
            return this.nonAb;
        }

        public final PreloadConfig getPreloadConfig() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.f25879ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    @Keep
    public static final class NonABConfig {
        private AdNonABConfig audio;
        private AdNonABConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        private AdNonABConfig f6int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private AdNonABConfig f7native;

        public final AdNonABConfig getAudio() {
            return this.audio;
        }

        public final AdNonABConfig getBanner() {
            return this.banner;
        }

        public final AdNonABConfig getInterstitial() {
            return this.f6int;
        }

        public final AdNonABConfig getNative() {
            return this.f7native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f6int.isValid() && this.f7native.isValid() && this.audio.isValid();
        }

        public NonABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdNonABConfig(TimeoutConfigurations.defaultNonABBannerloadTimeout, TimeoutConfigurations.defaultNonABBannerMuttTimeout, TimeoutConfigurations.defaultNonABBannerRetryInterval, TimeoutConfigurations.defaultNonABBannerMaxRetries);
            this.f6int = new AdNonABConfig(TimeoutConfigurations.defaultNonABIntloadTimeout, TimeoutConfigurations.defaultNonABIntMuttTimeout, TimeoutConfigurations.defaultNonABIntRetryInterval, TimeoutConfigurations.defaultNonABIntMaxRetries);
            this.f7native = new AdNonABConfig(TimeoutConfigurations.defaultNonABNativeloadTimeout, TimeoutConfigurations.defaultNonABNativeMuttTimeout, TimeoutConfigurations.defaultNonABNativeRetryInterval, TimeoutConfigurations.defaultNonABNativeMaxRetries);
            this.audio = new AdNonABConfig(TimeoutConfigurations.defaultNonABAudioloadTimeout, TimeoutConfigurations.defaultNonABAudioMuttTimeout, TimeoutConfigurations.defaultNonABAudioRetryInterval, TimeoutConfigurations.defaultNonABAudioMaxRetries);
        }
    }

    @Keep
    public static final class PreloadConfig {
        private AdPreloadConfig audio;
        private AdPreloadConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        private AdPreloadConfig f8int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private AdPreloadConfig f9native;

        public final AdPreloadConfig getAudio() {
            return this.audio;
        }

        public final AdPreloadConfig getBanner() {
            return this.banner;
        }

        public final AdPreloadConfig getInterstitial() {
            return this.f8int;
        }

        public final AdPreloadConfig getNative() {
            return this.f9native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f8int.isValid() && this.f9native.isValid() && this.audio.isValid();
        }

        public PreloadConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, TimeoutConfigurations.defaultPreloadBannerMuttTimeout, TimeoutConfigurations.defaultPreloadBannerLoadTimeout, TimeoutConfigurations.defaultPreloadBannerRetryInterval, TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.f8int = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadIntPreloadTimeout, TimeoutConfigurations.defaultPreloadIntMuttTimeout, TimeoutConfigurations.defaultPreloadIntloadTimeout, TimeoutConfigurations.defaultPreloadIntRetryInterval, TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.f9native = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadNativePreloadTimeout, TimeoutConfigurations.defaultPreloadNativeMuttTimeout, TimeoutConfigurations.defaultPreloadNativeloadTimeout, TimeoutConfigurations.defaultPreloadNativeRetryInterval, TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, TimeoutConfigurations.defaultPreloadAudioMuttTimeout, TimeoutConfigurations.defaultPreloadAudioloadTimeout, TimeoutConfigurations.defaultPreloadAudioRetryInterval, TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }
    }

    @Keep
    public static final class RenderTimeoutByType {
        public static final a Companion = new a();
        private int audio;
        private int banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        private int f10int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private int f11native;

        public /* synthetic */ RenderTimeoutByType(i iVar) {
            this();
        }

        private RenderTimeoutByType() {
        }

        public final int getAudio$media_release() {
            return this.audio;
        }

        public final int getBanner$media_release() {
            return this.banner;
        }

        public final int getInt$media_release() {
            return this.f10int;
        }

        public final int getNative$media_release() {
            return this.f11native;
        }

        public final int getTimeoutByType$media_release(String str, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            ck.p.j(str, "adType");
            int iHashCode = str.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && str.equals("audio") && (i14 = this.audio) > 0) {
                            return i14;
                        }
                    } else if (str.equals(ImpressionLog.f43647w) && (i13 = this.f10int) > 0) {
                        return i13;
                    }
                } else if (str.equals("native") && (i12 = this.f11native) > 0) {
                    return i12;
                }
            } else if (str.equals("banner") && (i11 = this.banner) > 0) {
                return i11;
            }
            return i10;
        }

        public final void setAudio$media_release(int i10) {
            this.audio = i10;
        }

        public final void setBanner$media_release(int i10) {
            this.banner = i10;
        }

        public final void setInt$media_release(int i10) {
            this.f10int = i10;
        }

        public final void setNative$media_release(int i10) {
            this.f11native = i10;
        }

        @VisibleForTesting(otherwise = 5)
        public final void setTimeoutByType(String str, int i10) {
            ck.p.j(str, "adType");
            int iHashCode = str.hashCode();
            if (iHashCode == -1396342996) {
                if (str.equals("banner")) {
                    this.banner = i10;
                }
            } else if (iHashCode == -1052618729) {
                if (str.equals("native")) {
                    this.f11native = i10;
                }
            } else if (iHashCode == 104431) {
                if (str.equals(ImpressionLog.f43647w)) {
                    this.f10int = i10;
                }
            } else if (iHashCode == 93166550 && str.equals("audio")) {
                this.audio = i10;
            }
        }
    }

    public static final boolean a(JSONObject jSONObject, int i10) {
        ck.p.j(jSONObject, "param");
        Iterator<String> itKeys = jSONObject.keys();
        ck.p.i(itKeys, "keys(...)");
        boolean z10 = true;
        while (itKeys.hasNext()) {
            if (jSONObject.getInt(itKeys.next()) < i10) {
                z10 = false;
            }
        }
        return z10;
    }

    public final MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = 15000;
        }
        this.step4s = i10;
    }
}

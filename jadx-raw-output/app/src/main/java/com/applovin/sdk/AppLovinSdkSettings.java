package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10405b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10410g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f10413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k f10414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10415l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10407d = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f10411h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f10412i = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10406c = true;

    public void attachAppLovinSdk(k kVar) {
        this.f10414k = kVar;
        if (StringUtils.isValidString(this.f10408e)) {
            kVar.s0().a(Arrays.asList(this.f10408e.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            this.f10408e = null;
        }
        if (this.f10409f != null) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinSdkSettings", "Setting user id: " + this.f10409f);
            }
            kVar.w0().a(this.f10409f);
            this.f10409f = null;
        }
        if (StringUtils.isValidString(this.f10410g)) {
            l.a(this.f10410g, kVar);
            this.f10410g = null;
        }
        for (Map.Entry entry : this.f10412i.entrySet()) {
            kVar.v0().a(d2.f7213k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + ((String) entry.getValue())));
        }
        this.f10412i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f10411h) {
            map = CollectionUtils.map(this.f10411h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f10413j;
    }

    @Nullable
    public String getUserIdentifier() {
        k kVar = this.f10414k;
        return kVar == null ? this.f10409f : kVar.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f10406c;
    }

    public boolean isMuted() {
        return this.f10405b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f10404a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f10406c == z10) {
            return;
        }
        this.f10406c = z10;
        k kVar = this.f10414k;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.y().l();
        } else {
            kVar.y().k();
        }
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        o.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f10414k == null) {
                this.f10408e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f10414k.s0().a(Arrays.asList(strTrim.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            } else {
                this.f10414k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f10415l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.f10414k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.f10410g = strTrim;
            }
        }
        if (this.f10414k != null) {
            this.f10414k.v0().a(d2.f7213k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + str2));
        } else {
            this.f10412i.put(str, strTrim);
        }
        this.f10411h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f10405b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f10407d = z10;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > n7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + n7.d(8) + " maximum)");
        }
        k kVar = this.f10414k;
        if (kVar == null) {
            this.f10409f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            this.f10414k.O().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.f10414k.w0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!n7.l()) {
            this.f10404a = z10;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (n7.m(null) != z10) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f10407d;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f10404a + ", muted=" + this.f10405b + ", creativeDebuggerEnabled=" + this.f10406c + '}';
    }

    public AppLovinSdkSettings(Context context) {
        this.f10415l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = n7.e(context);
        this.f10404a = n7.m(contextE);
        this.f10413j = u0.a(contextE);
        this.f10415l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        JSONObject jSONObject;
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = n7.a(identifier, context, (k) null);
        if (StringUtils.isValidString(strA)) {
            jSONObject = JsonUtils.jsonObjectFromJsonString(strA, new JSONObject());
        } else {
            jSONObject = new JSONObject();
        }
        this.f10411h.putAll(JsonUtils.tryToStringMap(jSONObject));
    }
}

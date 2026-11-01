package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f15063a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f15064b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f15065c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15066d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15067e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InneractiveAdManager.GdprConsentSource f15068f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15069g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15070h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f15071i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f15072j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f15073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f15074l;

    public final boolean a(boolean z10, String str) {
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            return false;
        }
        f();
        SharedPreferences sharedPreferences = this.f15073k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z10).apply();
        return true;
    }

    public final void b() {
        IAlog.a("Clearing LGPD consent status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f15071i = null;
        SharedPreferences sharedPreferences = this.f15073k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f15070h = null;
        SharedPreferences sharedPreferences = this.f15073k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final Boolean d() {
        if (this.f15063a == null) {
            this.f15064b = g();
        }
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            return null;
        }
        Boolean bool = this.f15063a;
        return bool == null ? this.f15064b : bool;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    public final boolean e() {
        boolean z10;
        o oVar;
        SharedPreferences sharedPreferences;
        if (this.f15065c == null) {
            s sVar = IAConfigManager.O.f15026u;
            if (sVar != null && (oVar = sVar.f15195b) != null && oVar.a("TcfPurpose1", 1, Integer.MIN_VALUE) == 1 && (sharedPreferences = this.f15074l) != null) {
                try {
                    String string = sharedPreferences.getString("IABTCF_PurposeConsents", null);
                    z10 = (string == null || string.isEmpty() || string.charAt(0) != '0') ? false : true;
                } catch (Exception unused) {
                    IAlog.b("%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs", IAlog.a(this));
                }
            }
            this.f15065c = Boolean.valueOf(z10);
        }
        return this.f15065c.booleanValue();
    }

    public final void f() {
        Application application = com.fyber.inneractive.sdk.util.o.f18599a;
        if (application != null) {
            if (this.f15074l == null) {
                this.f15074l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            if (this.f15073k == null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.f15073k = sharedPreferences;
                if (sharedPreferences != null) {
                    if (sharedPreferences.contains("IAGDPRBool")) {
                        this.f15063a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                    } else {
                        this.f15064b = g();
                    }
                    if (sharedPreferences.contains("IAGdprConsentData")) {
                        this.f15066d = sharedPreferences.getString("IAGdprConsentData", null);
                    } else {
                        this.f15067e = h();
                    }
                    if (sharedPreferences.contains("IACCPAConsentData")) {
                        this.f15070h = sharedPreferences.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences.contains("IAGdprSource")) {
                        try {
                            this.f15068f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f15068f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences.contains("IALgpdConsentStatus")) {
                        this.f15071i = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences.contains("keyUserID")) {
                        this.f15069g = sharedPreferences.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final Boolean g() {
        o oVar;
        SharedPreferences sharedPreferences;
        s sVar = IAConfigManager.O.f15026u;
        if (sVar != null && (oVar = sVar.f15195b) != null) {
            int iA = oVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (iA != 0 && (sharedPreferences = this.f15074l) != null) {
                try {
                    String string = sharedPreferences.getString("IABTCF_VendorConsents", null);
                    if (string == null) {
                        return null;
                    }
                    int i10 = (iA >= 0 ? iA : 262) - 1;
                    return Boolean.valueOf(string.length() > i10 && string.charAt(i10) == '1');
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final String h() {
        SharedPreferences sharedPreferences;
        if (IAConfigManager.O.f15026u.f15195b.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.f15074l) != null && sharedPreferences.contains("IABTCF_TCString")) {
            try {
                return this.f15074l.getString("IABTCF_TCString", null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            return false;
        }
        f();
        if (this.f15073k == null) {
            return false;
        }
        IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f15073k.edit().putString(str, str2).apply();
        return true;
    }

    public final void a(String str) {
        if (com.fyber.inneractive.sdk.util.o.f18599a != null) {
            f();
            if (TextUtils.isEmpty(str)) {
                this.f15069g = str;
                SharedPreferences sharedPreferences = this.f15073k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            SharedPreferences sharedPreferences2 = this.f15073k;
            if (sharedPreferences2 != null) {
                this.f15069g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final void a() {
        IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f15063a = null;
        this.f15066d = null;
        SharedPreferences sharedPreferences = this.f15073k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }
}

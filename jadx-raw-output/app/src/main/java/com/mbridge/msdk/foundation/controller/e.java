package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: TCStringManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34618a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34619b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34620c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34621d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34622e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34623f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f34629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SharedPreferences f34630m;

    /* JADX INFO: compiled from: TCStringManager.java */
    public interface a {
        void a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f34630m;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString("IABTCF_TCString", ""));
            a(this.f34630m.getInt("IABTCF_gdprApplies", 0));
            c(this.f34630m.getString("IABTCF_PurposeConsents", ""));
            e(this.f34630m.getString("IABTCF_VendorConsents", ""));
            b(this.f34630m.getString("IABTCF_AddtlConsent", ""));
        }
    }

    public String b() {
        return this.f34618a;
    }

    public void c(String str) {
        this.f34624g = a(str, 1);
        this.f34625h = a(str, 2);
        this.f34619b = str;
    }

    public void b(String str) {
        this.f34621d = str;
        if (TextUtils.isEmpty(str)) {
            this.f34627j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f34628k = false;
            return;
        }
        this.f34628k = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f34627j = false;
                } else {
                    this.f34627j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public void d(String str) {
        this.f34618a = str;
    }

    public void e(String str) {
        this.f34626i = a(str, 867);
        this.f34620c = str;
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f34630m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -2004976699:
                        if (str.equals("IABTCF_PurposeConsents")) {
                            b10 = 2;
                        }
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies")) {
                            b10 = 1;
                        }
                        break;
                    case 1218895378:
                        if (str.equals("IABTCF_TCString")) {
                            b10 = 0;
                        }
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            b10 = 4;
                        }
                        break;
                    case 1450203731:
                        if (str.equals("IABTCF_VendorConsents")) {
                            b10 = 3;
                        }
                        break;
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    b(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                                }
                            } else {
                                e(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                            }
                        } else {
                            c(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                        }
                    } else {
                        a(sharedPreferences.getInt("IABTCF_gdprApplies", 0));
                    }
                } else {
                    d(sharedPreferences.getString("IABTCF_TCString", ""));
                }
                a aVar = this.f34629l;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public boolean c() {
        if (this.f34622e == 0) {
            a(true);
            return this.f34623f;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f34626i || (this.f34628k && this.f34627j)) && this.f34624g && this.f34625h);
        } else {
            a(this.f34626i && this.f34624g && this.f34625h);
        }
        return this.f34623f;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f34629l = aVar;
        }
    }

    public void a(int i10) {
        this.f34622e = i10;
    }

    public void a(boolean z10) {
        this.f34623f = z10;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}

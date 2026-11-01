package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC3382ae;

/* JADX INFO: loaded from: classes2.dex */
public class z6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f10266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f10267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f10268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f10269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f10272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f10273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f10274j;

    public Boolean a(int i10) {
        return c7.a(i10, this.f10271g);
    }

    public boolean b() {
        return c7.a(this.f10271g);
    }

    public String c() {
        return this.f10271g;
    }

    public String d() {
        return x6.a(this.f10267c);
    }

    private Integer a(String str) {
        if (this.f10266b.contains(str)) {
            Integer num = (Integer) a5.a(str, null, Integer.class, this.f10266b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) a5.a(str, null, Long.class, this.f10266b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) a5.a(str, null, String.class, this.f10266b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f10265a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10265a.O().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    private Integer h() {
        String strA = z4.f10258w.a();
        if (this.f10266b.contains(strA)) {
            Integer num = (Integer) a5.a(strA, null, Integer.class, this.f10266b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f10265a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10265a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) a5.a(strA, null, Long.class, this.f10266b, false);
            if (l10 != null) {
                if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                }
                this.f10265a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10265a.O().b("TcfManager", "Long value (" + l10 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) a5.a(strA, null, Boolean.class, this.f10266b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) a5.a(strA, null, String.class, this.f10266b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || com.ironsource.mediationsdk.metadata.a.f29886h.equals(str)) {
                    return 0;
                }
                this.f10265a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10265a.O().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean b(int i10) {
        String str = this.f10273i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f10274j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f10272h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public Integer e() {
        return this.f10267c;
    }

    public Integer f() {
        return this.f10268d;
    }

    public Integer g() {
        return this.f10269e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f10267c) + a("CMP SDK Version", this.f10268d) + a(z4.f10258w.a(), this.f10269e) + a(z4.f10259x.a(), this.f10270f) + a(z4.f10260y.a(), this.f10271g);
    }

    public String j() {
        return this.f10270f;
    }

    public String k() {
        return this.f10272h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(z4.f10256u.a())) {
            this.f10267c = a(str);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10267c);
            }
            this.f10265a.Q0();
            return;
        }
        if (str.equals(z4.f10257v.a())) {
            this.f10268d = a(str);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10268d);
                return;
            }
            return;
        }
        if (str.equals(z4.f10258w.a())) {
            this.f10269e = h();
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10269e);
                return;
            }
            return;
        }
        if (str.equals(z4.f10259x.a())) {
            this.f10270f = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10270f);
            }
            this.f10265a.Q0();
            return;
        }
        if (str.equals(z4.f10260y.a())) {
            this.f10271g = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10271g);
            }
            b(this.f10271g);
            return;
        }
        if (str.equals(z4.f10261z.a())) {
            this.f10272h = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10272h);
                return;
            }
            return;
        }
        if (str.equals(z4.A.a())) {
            String str2 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(z4.B.a())) {
            this.f10273i = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10273i);
                return;
            }
            return;
        }
        if (str.equals(z4.C.a())) {
            String str3 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(z4.D.a())) {
            this.f10274j = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f10274j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f10265a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10265a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    public z6(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f10266b = defaultSharedPreferences;
        this.f10265a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f10267c = a(z4.f10256u.a());
        this.f10268d = a(z4.f10257v.a());
        this.f10269e = h();
        this.f10270f = (String) a5.a(z4.f10259x, (Object) null, defaultSharedPreferences, false);
        this.f10271g = (String) a5.a(z4.f10260y, (Object) null, defaultSharedPreferences, false);
        this.f10272h = (String) a5.a(z4.f10261z, (Object) null, defaultSharedPreferences, false);
        this.f10273i = (String) a5.a(z4.B, (Object) null, defaultSharedPreferences, false);
        this.f10274j = (String) a5.a(z4.D, (Object) null, defaultSharedPreferences, false);
        b(this.f10271g);
    }

    private void b(String str) {
        this.f10265a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10265a.O().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolA = c7.a(InterfaceC3382ae.c.f28183e, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f10265a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10265a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                p0.b(true, com.applovin.impl.sdk.k.o());
            } else {
                this.f10265a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10265a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                p0.b(false, com.applovin.impl.sdk.k.o());
            }
            this.f10265a.Q0();
            return;
        }
        this.f10265a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10265a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f10267c = null;
        this.f10269e = null;
        this.f10270f = null;
        this.f10271g = null;
        this.f10272h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n");
        sb2.append(str);
        sb2.append(" - ");
        sb2.append(obj != null ? obj.toString() : "No value set");
        return sb2.toString();
    }
}

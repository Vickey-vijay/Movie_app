package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class RedirectData implements Serializable {
    private static final long serialVersionUID = -2180364199406342143L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43713a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43714b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43715c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43716d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f43717e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43718f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f43719g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f43720h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f43721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f43722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BrandSafetyEvent.AdFormatType f43723k;

    public RedirectData(String sdkPackageName, BrandSafetyEvent.AdFormatType adFormatType) {
        this.f43721i = sdkPackageName;
        this.f43723k = adFormatType;
    }

    public void a(String str, String str2, String str3) {
        this.f43713a = true;
        this.f43716d = str2;
        this.f43717e = str;
        this.f43718f = str3;
        this.f43722j = System.currentTimeMillis();
    }

    public void b(String str, String str2, String str3) {
        this.f43714b = true;
        this.f43717e = str;
        if (str2 == null) {
            str2 = str;
        }
        this.f43716d = str2;
        this.f43719g = str3;
        this.f43722j = System.currentTimeMillis();
    }

    public synchronized void a(String str) {
        if (str != null) {
            if (this.f43720h == null) {
                this.f43720h = str;
            } else if (!this.f43720h.contains(str)) {
                this.f43720h += ImpressionLog.P + str;
            }
        }
    }
}

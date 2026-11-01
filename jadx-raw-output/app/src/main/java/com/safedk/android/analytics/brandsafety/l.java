package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44512i = "ImpressionInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f44513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f44514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f44515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RedirectData f44516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f44517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashSet<String> f44518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet<String> f44519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ImpressionLog f44520h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CreativeInfo f44521j;

    public l(String str) {
        this(str, null);
    }

    public l(String str, j jVar) {
        this.f44515c = null;
        this.f44517e = 0;
        this.f44518f = new HashSet<>();
        this.f44519g = new HashSet<>();
        this.f44520h = new ImpressionLog();
        this.f44513a = str == null ? UUID.randomUUID().toString() : str;
        this.f44514b = jVar;
        this.f44521j = null;
    }

    public l(RedirectData redirectData) {
        this(null, null);
        this.f44516d = redirectData;
    }

    public boolean a() {
        return this.f44516d != null && this.f44516d.f43713a;
    }

    public boolean b() {
        return this.f44516d != null && this.f44516d.f43714b;
    }

    public void a(RedirectData redirectData) {
        this.f44516d = redirectData;
        this.f44517e++;
        if (redirectData.f43714b && this.f44521j != null) {
            this.f44521j.e();
        }
    }

    public void a(CreativeInfo creativeInfo) {
        if (this.f44521j == null && creativeInfo != null) {
            a(ImpressionLog.f43637m, new ImpressionLog.a[0]);
        }
        this.f44521j = creativeInfo;
        if (creativeInfo != null) {
            synchronized (this.f44518f) {
                Logger.d(f44512i, "set creative info, removing webview resource urls ci = " + creativeInfo.L() + ", webview_resource_urls resourceUrlList = " + this.f44518f);
            }
            creativeInfo.q().addAll(this.f44518f);
            this.f44518f = new HashSet<>();
            creativeInfo.p().addAll(this.f44519g);
            this.f44519g = new HashSet<>();
            boolean zA = CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            if (creativeInfo.ah() && this.f44514b != null && !zA) {
                Logger.d(f44512i, "set creative info, removing image taken for multi-ad " + this.f44514b.f44460b);
                BrandSafetyUtils.d(this.f44514b.f44460b);
                this.f44514b = null;
            }
        }
    }

    public CreativeInfo c() {
        return this.f44521j;
    }

    public void d() {
        this.f44514b = null;
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        this.f44520h.a(str, aVarArr);
    }

    public void b(String str, ImpressionLog.a... aVarArr) {
        this.f44520h.b(str, aVarArr);
    }

    public String toString() {
        return "Impression: id=" + this.f44513a + ", image is: " + this.f44514b + ", CI is: " + this.f44521j;
    }
}

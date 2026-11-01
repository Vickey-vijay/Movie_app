package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.p;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class RedirectEvent extends StatsEvent implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44644a = 120000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44645b = "redirect";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44646c = "redirect_url";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44647d = "redirect_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44648e = "foreground_activity";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44649f = "max_events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44650g = "touch_ts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44651h = "external";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44652i = "internal";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44653j = "customtab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44654k = "suspected_store_kit";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44655l = "RedirectEvent";
    private static final long serialVersionUID = 4907228751695554606L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f44656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f44657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f44658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f44659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MaxEvents f44660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f44661r;

    public RedirectEvent(String sdk, String redirectUrl, String redirectType, String foregroundActivity, long timestamp, long touchTs) {
        super(sdk, StatsCollector.EventType.redirect);
        this.f44660q = null;
        Logger.d(f44655l, "RedirectEvent ctor started, sdk=" + sdk + ", redirectUrl=" + redirectUrl + ", redirectType=" + redirectType + ", foregroundActivity=" + foregroundActivity + " ,timestamp=" + timestamp + ", touchTs=" + touchTs);
        Logger.d(f44655l, "RedirectEvent ctor SdksMapping.getSdkNameByPackage()=" + SdksMapping.getSdkNameByPackage(sdk));
        Logger.d(f44655l, "RedirectEvent ctor SdksMapping.getSdkPackageByClass()=" + SdksMapping.getSdkPackageByClass(sdk));
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(sdk);
        if (sdkUUIDByPackage != null && SdksMapping.getAllSdkVersionsMap() != null && SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage) != null) {
            this.f44656m = SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage);
            Logger.d(f44655l, "RedirectEvent ctor sdkVersion=" + this.f44656m);
        } else {
            Logger.d(f44655l, "RedirectEvent ctor cannot find version for sdk " + sdk + " , SdkVersionsMap=" + SdksMapping.getAllSdkVersionsMap());
        }
        this.f44657n = redirectUrl;
        this.f44658o = redirectType;
        this.f44659p = foregroundActivity;
        this.f44661r = k.b(touchTs);
        this.I = false;
    }

    public void a(MaxEvents maxEvents) {
        synchronized (p.a()) {
            this.f44660q = (MaxEvents) maxEvents.clone();
            Logger.d(f44655l, "setMaxEvents , added " + this.f44660q.size() + " items. content : " + this.f44660q);
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.redirect;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StatsCollector.EventType.redirect + "_");
        sb2.append(this.f44657n == null ? "_" : this.f44657n + "_");
        sb2.append(this.G);
        Logger.d(f44655l, "Getting key from object : " + sb2.toString());
        return sb2.toString();
    }

    public static String a(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StatsCollector.EventType.redirect + "_");
        if (bundle.getString("redirect_url") == null) {
            sb2.append("_");
        } else {
            sb2.append(bundle.getString("redirect_url") + "_");
        }
        sb2.append(bundle.getLong("timestamp"));
        Logger.d(f44655l, "Getting key from bundle : " + sb2.toString());
        return sb2.toString();
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
        if (((RedirectEvent) statsEvent).I) {
            this.I = true;
        }
        if (((RedirectEvent) statsEvent).d() != null && d() == null) {
            a(((RedirectEvent) statsEvent).d());
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Bundle e() {
        Bundle bundleE = super.e();
        bundleE.putString("sdk_version", this.f44656m);
        bundleE.putString("redirect_url", this.f44657n);
        bundleE.putString("redirect_type", this.f44658o);
        bundleE.putString("foreground_activity", this.f44659p);
        bundleE.putLong(f44650g, this.f44661r);
        if (this.f44660q != null && this.f44660q.size() > 0) {
            synchronized (p.a()) {
                bundleE.putParcelableArrayList(f44649f, this.f44660q.a());
            }
        }
        Logger.d(f44655l, "Redirect Event toBundle : " + bundleE.toString());
        return bundleE;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public boolean a_() {
        return System.currentTimeMillis() - this.G > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS || this.f44657n != null || this.I;
    }

    public String d() {
        return this.f44657n;
    }

    public void a(String str) {
        this.f44657n = str;
    }
}

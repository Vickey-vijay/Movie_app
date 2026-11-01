package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class MaxEvent implements Serializable, Comparable<MaxEvent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44629a = "event";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44630b = "ts";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44631c = "ad_format";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44632d = "network";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44633e = "creative_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44634f = "dsp_name";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44635g = "MaxEvent";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f44636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f44637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f44638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f44639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f44640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f44641m;

    public String a() {
        return this.f44641m;
    }

    public String b() {
        return this.f44636h;
    }

    public void a(String str) {
        this.f44636h = str;
    }

    public long c() {
        return this.f44637i.longValue();
    }

    public String d() {
        return this.f44638j;
    }

    public String e() {
        return this.f44639k;
    }

    public String f() {
        return this.f44640l;
    }

    public MaxEvent(String event, long timestamp, String adFormat, String network, String creativeId, String dspName) {
        this.f44636h = event;
        this.f44637i = Long.valueOf(timestamp);
        this.f44638j = adFormat;
        this.f44639k = network;
        this.f44641m = creativeId;
        this.f44640l = dspName;
        Logger.d(f44635g, "New MaxEvent created , event=" + event + ", timestamp=" + timestamp + ", adFormat=" + adFormat + ", network=" + network + ", creativeId=" + creativeId + ", dspName=" + dspName);
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("event", this.f44636h);
        bundle.putLong("ts", this.f44637i.longValue());
        bundle.putString("ad_format", this.f44638j);
        bundle.putString("network", this.f44639k);
        bundle.putString("creative_id", this.f44641m);
        if (this.f44640l != null) {
            bundle.putString("dsp_name", this.f44640l);
        }
        Logger.d(f44635g, "MaxEvent toBundle : " + bundle.toString());
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("event:" + this.f44636h + StringUtils.COMMA);
        sb2.append("ts:" + this.f44637i);
        sb2.append("(" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f44637i.longValue() * 1000)) + "),");
        sb2.append("ad_format:" + this.f44638j + StringUtils.COMMA);
        sb2.append("network:" + this.f44639k + StringUtils.COMMA);
        sb2.append("creative_id:" + this.f44641m);
        if (this.f44640l != null) {
            sb2.append(",DSP_NAME:" + this.f44640l);
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(MaxEvent maxEvent) {
        return this.f44637i.compareTo(maxEvent.f44637i);
    }
}

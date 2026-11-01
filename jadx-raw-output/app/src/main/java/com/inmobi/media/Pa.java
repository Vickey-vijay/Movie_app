package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Pa {
    public static void a(Na na2, Ya ya2, Integer num, bk.p pVar) {
        ck.p.j(na2, "funnelState");
        if (ya2 == null || na2.f23234c <= ya2.f23835e) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", ya2.f23831a.f23902c);
        linkedHashMap.put("impressionId", ya2.f23831a.f23901b);
        linkedHashMap.put("plId", Long.valueOf(ya2.f23831a.f23900a));
        linkedHashMap.put("adType", ya2.f23831a.f23903d);
        linkedHashMap.put("markupType", ya2.f23831a.f23904e);
        linkedHashMap.put("creativeType", ya2.f23831a.f23905f);
        linkedHashMap.put("metadataBlob", ya2.f23831a.f23906g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(ya2.f23831a.f23907h));
        String str = ya2.f23836f;
        if (str == null) {
            str = ya2.f23831a.f23908i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", ya2.f23832b);
        if (num != null) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, num);
        }
        long j10 = ya2.f23834d;
        if (j10 != 0) {
            nk.l0 l0Var = AbstractC2940il.f24565a;
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        }
        ya2.f23835e = na2.f23234c;
        nk.j.d(A9.f22351c, null, null, new Oa(linkedHashMap, na2, null), 3, null);
        int i10 = ya2.f23833c;
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(TelemetryConfig.class, "clazz");
        if (i10 > ((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || pVar == null) {
            return;
        }
        String str2 = na2.f23233b;
        String str3 = ya2.f23836f;
        if (str3 == null) {
            str3 = ya2.f23831a.f23908i;
        }
        pVar.mo1invoke(str2, kotlin.collections.a.m(mj.h.a("$OPENMODE", str3), mj.h.a("$URLTYPE", ya2.f23832b)));
    }

    public static String a(String str) {
        if (str == null || str.length() == 0 || !lk.a0.X(str, "://", false, 2, null)) {
            return "invalid";
        }
        if (lk.x.P(str, "inmobideeplink://", true)) {
            return "inmobideeplink";
        }
        if (lk.x.P(str, "inmobinativebrowser://", true)) {
            return "inmobinativebrowser";
        }
        if (lk.x.P(str, "https://", true)) {
            return "https";
        }
        if (lk.x.P(str, "http://", true)) {
            return "http";
        }
        return lk.x.P(str, "market://", true) ? "market" : "deeplink";
    }
}

package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3037mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2888gi f24835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f24840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f24841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24842h;

    public final void a(int i10) {
        short s10;
        Context context = Ji.f22951a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            Ea eaA = Da.a(context, "im_telemetry_prefs");
            String str = A1.f22335c;
            if (str == null) {
                str = "unknown";
            }
            ck.p.j("last_app_version", C3426d4.i.W);
            if (ck.p.e(eaA.f22577a.getString("last_app_version", null), str)) {
                return;
            }
            Map mapA = a();
            switch (i10) {
                case 8800:
                    s10 = 2365;
                    break;
                case 8801:
                default:
                    s10 = (short) i10;
                    break;
                case 8802:
                    s10 = 2366;
                    break;
                case 8803:
                    s10 = 2367;
                    break;
                case 8804:
                    s10 = 2368;
                    break;
            }
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
            Wj wj2 = Wj.f23753a;
            Wj.b("VideoPlayerNotSupported", mapA, EnumC2735ak.SDK);
            eaA.a("last_app_version", str, false);
        }
    }

    public C3037mi(C2888gi c2888gi) {
        ck.p.j(c2888gi, "renderViewMetaData");
        this.f24835a = c2888gi;
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(TelemetryConfig.class, "clazz");
        TelemetryConfig telemetryConfig = (TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class);
        C3012li c3012li = c2888gi.f24444k;
        this.f24840f = new AtomicInteger(c3012li != null ? c3012li.f24779a : telemetryConfig.getMaxTemplateEvents());
        this.f24841g = new AtomicBoolean(false);
    }

    public final void b() {
        String strA = a("WebViewLoadCalled");
        this.f24837c = SystemClock.elapsedRealtime();
        Map mapA = a();
        if (ck.p.e(strA, "CompanionWebViewLoadCalled")) {
            long j10 = this.f24836b;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        } else {
            C3120q1 c3120q1 = this.f24835a.f24443j;
            if (c3120q1 != null) {
                long j11 = c3120q1.f25129a.f25219c;
                nk.l0 l0Var2 = AbstractC2940il.f24565a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j11));
            }
        }
        mapA.put("creativeId", this.f24835a.f24440g);
        Wj wj2 = Wj.f23753a;
        Wj.b(strA, mapA, EnumC2735ak.SDK);
    }

    public final void a(String str, String str2) {
        ck.p.j(str, "eventType");
        if (this.f24841g.get()) {
            return;
        }
        if (this.f24840f.decrementAndGet() <= 0) {
            this.f24841g.set(true);
            Map mapA = a();
            long j10 = this.f24837c;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            Wj wj2 = Wj.f23753a;
            Wj.b("TemplateEventDropped", mapA, EnumC2735ak.SDK);
            return;
        }
        if (str2 != null) {
            try {
                if (new JSONObject(str2).length() == 0) {
                    str2 = null;
                }
            } catch (JSONException e10) {
                Log.e(Wj.f23754b, "Error parsing JSON: " + e10);
            }
        }
        String str3 = this.f24835a.f24445l;
        if (str3 == null) {
            str3 = "";
        }
        Map mapO = kotlin.collections.a.o(mj.h.a("trigger", str3), mj.h.a("plType", String.valueOf(this.f24835a.f24434a.f25510f)), mj.h.a("impressionId", this.f24835a.f24436c), mj.h.a("markupType", this.f24835a.f24435b), mj.h.a("networkType", C3298x5.m()));
        if (str2 != null) {
            mapO.put("payload", str2);
        }
        if (this.f24835a.f24437d.length() > 0) {
            mapO.put("metadataBlob", this.f24835a.f24437d);
        }
        Wj.b(str, mapO, EnumC2735ak.TEMPLATE);
    }

    public final void a(boolean z10, short s10) {
        String strA = a("WebViewRenderProcessGoneEvent");
        String str = this.f24835a.f24445l;
        if (str == null) {
            str = "";
        }
        Pair pairA = mj.h.a("trigger", str);
        long j10 = this.f24837c;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        Map mapO = kotlin.collections.a.o(pairA, mj.h.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10)), mj.h.a("source", "render_view_" + this.f24835a.f24434a.f25509e), mj.h.a("isCrashed", Boolean.valueOf(z10)), mj.h.a("creativeId", this.f24835a.f24440g), mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)));
        Wj wj2 = Wj.f23753a;
        Wj.b(strA, mapO, EnumC2735ak.SDK);
    }

    public final Map a() {
        String str = this.f24835a.f24445l;
        if (str == null) {
            str = "";
        }
        Map mapO = kotlin.collections.a.o(mj.h.a("trigger", str), mj.h.a("plType", String.valueOf(this.f24835a.f24434a.f25510f)), mj.h.a("plId", String.valueOf(this.f24835a.f24434a.f25505a)), mj.h.a("adType", String.valueOf(this.f24835a.f24434a.f25509e)), mj.h.a("markupType", this.f24835a.f24435b), mj.h.a("networkType", C3298x5.m()), mj.h.a("retryCount", String.valueOf(this.f24835a.f24438e)), mj.h.a("creativeType", this.f24835a.f24439f), mj.h.a("adPosition", String.valueOf(this.f24835a.f24442i)), mj.h.a("isRewarded", String.valueOf(this.f24835a.f24441h)), mj.h.a("impressionId", this.f24835a.f24436c));
        if (this.f24835a.f24437d.length() > 0) {
            mapO.put("metadataBlob", this.f24835a.f24437d);
        }
        return mapO;
    }

    public final String a(String str) {
        if (ck.p.e(this.f24835a.f24445l, "default")) {
            return str;
        }
        switch (str.hashCode()) {
            case -1395724590:
                return !str.equals("PageStarted") ? str : "CompanionWebViewPageStarted";
            case -81019210:
                return !str.equals("FireAdFailed") ? str : "CompanionFireAdFailed";
            case 147127306:
                return !str.equals("FireAdReady") ? str : "CompanionFireAdReady";
            case 260281564:
                return !str.equals("WebViewLoadCalled") ? str : "CompanionWebViewLoadCalled";
            case 520950289:
                return !str.equals("WebViewLoadFinished") ? str : "CompanionWebViewLoadFinished";
            case 570988141:
                return !str.equals("RenderProcessResponsive") ? str : "RenderProcessResponsive";
            case 1001819046:
                return !str.equals("RenderProcessUnResponsive") ? str : "CompanionRenderProcessUnResponsive";
            default:
                return str;
        }
    }
}

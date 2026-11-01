package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3201t8 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3251v8 f25374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3201t8(C3251v8 c3251v8, rj.c cVar) {
        super(2, cVar);
        this.f25374b = c3251v8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3201t8 c3201t8 = new C3201t8(this.f25374b, cVar);
        c3201t8.f25373a = obj;
        return c3201t8;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C3201t8 c3201t8 = new C3201t8(this.f25374b, (rj.c) obj2);
        c3201t8.f25373a = (Rl) obj;
        return c3201t8.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jLongValue;
        sj.a.f();
        kotlin.c.b(obj);
        Rl rl2 = (Rl) this.f25373a;
        this.f25374b.a(rl2);
        C3037mi c3037mi = this.f25374b.f25540b;
        if (c3037mi != null) {
            ck.p.j(rl2, "mediaEvent");
            if (rl2 instanceof C2801d8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((C2801d8) rl2).f24225a;
                Map mapA = c3037mi.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                mapA.put("payload", jSONObject.toString());
                Wj wj2 = Wj.f23753a;
                Wj.b("VideoLoadStarted", mapA, EnumC2735ak.SDK);
            } else if (rl2 instanceof C2878g8) {
                C2878g8 c2878g8 = (C2878g8) rl2;
                Map mapA2 = c3037mi.a();
                Long latency = c2878g8.f24414a.getLatency();
                if (latency != null) {
                    jLongValue = latency.longValue();
                } else {
                    jLongValue = -1;
                }
                mapA2.put("latency", Long.valueOf(jLongValue));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(UnifiedMediationParams.KEY_VIDEO_URL, c2878g8.f24414a.getVideoUrl());
                jSONObject2.put("cacheProgress", c2878g8.f24415b);
                mapA2.put("payload", jSONObject2.toString());
                Wj wj3 = Wj.f23753a;
                Wj.b("VideoLoadSuccess", mapA2, EnumC2735ak.SDK);
            } else if (rl2 instanceof C2992kn) {
                Map mapA3 = c3037mi.a();
                Wj wj4 = Wj.f23753a;
                Wj.b("VideoStart", mapA3, EnumC2735ak.SDK);
            } else if (rl2 instanceof C3315xm) {
                Map mapA4 = c3037mi.a();
                Wj wj5 = Wj.f23753a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC2735ak.SDK);
            } else if (rl2 instanceof C2942in) {
                Map mapA5 = c3037mi.a();
                Wj wj6 = Wj.f23753a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC2735ak.SDK);
            } else if (rl2 instanceof C3166rn) {
                Map mapA6 = c3037mi.a();
                Wj wj7 = Wj.f23753a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC2735ak.SDK);
            } else if (rl2 instanceof Pl) {
                Map mapA7 = c3037mi.a();
                Wj wj8 = Wj.f23753a;
                Wj.b("VideoComplete", mapA7, EnumC2735ak.SDK);
            } else if (rl2 instanceof C2749b8) {
                C2749b8 c2749b8 = (C2749b8) rl2;
                Map mapA8 = c3037mi.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", c2749b8.f24046a.getVideoFiles());
                mapA8.put("payload", jSONObject3.toString());
                mapA8.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(c2749b8.f24047b));
                Wj wj9 = Wj.f23753a;
                Wj.b("VideoLoadFailure", mapA8, EnumC2735ak.SDK);
            }
        }
        return mj.r.f64562a;
    }
}

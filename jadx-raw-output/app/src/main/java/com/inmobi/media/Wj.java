package com.inmobi.media;

import com.inmobi.media.I2;
import com.inmobi.media.Wj;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Wj implements Jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wj f23753a = new Wj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f23755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mj.g f23756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f23757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C3000l6 f23758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C2964jk f23759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.l f23760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C2864fk f23761i;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final mj.r a(I2 i10) {
        ck.p.j(i10, "it");
        int i11 = i10.f22839a;
        if (i11 != 1 && i11 != 2) {
            switch (i11) {
                case 150:
                    C2864fk c2864fk = f23761i;
                    if (c2864fk != null) {
                        Map map = i10.f22841c;
                        Object obj = map != null ? map.get("data") : null;
                        c2864fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                    }
                    break;
                case 151:
                    C2864fk c2864fk2 = f23761i;
                    if (c2864fk2 != null) {
                        Map map2 = i10.f22841c;
                        Object obj2 = map2 != null ? map2.get("data") : null;
                        Wn wn2 = obj2 instanceof Wn ? (Wn) obj2 : null;
                        if (wn2 != null && AbstractC2940il.a(wn2)) {
                            C3298x5.f25687a.getClass();
                            if (!C3298x5.r()) {
                                c2864fk2.a("MainThreadBlockedEvent", wn2);
                            }
                        }
                    }
                    break;
                case 152:
                    C2864fk c2864fk3 = f23761i;
                    if (c2864fk3 != null) {
                        Map map3 = i10.f22841c;
                        Object obj3 = map3 != null ? map3.get("data") : null;
                        c2864fk3.a(obj3 instanceof C3344z1 ? (C3344z1) obj3 : null);
                    }
                    break;
            }
        } else {
            f23757e.set(false);
            C3000l6 c3000l6 = f23758f;
            if (c3000l6 != null) {
                c3000l6.f24744f.set(false);
                c3000l6.f24745g.set(true);
                c3000l6.f24746h.clear();
                c3000l6.f24748j = null;
            }
            f23758f = null;
            f23761i = null;
            ((C3305xc) Ji.f22955e.getValue()).a(f23760h);
        }
        return mj.r.f64562a;
    }

    public static final void b(String str, Map map, EnumC2735ak enumC2735ak) {
        ck.p.j(str, "eventType");
        ck.p.j(map, "keyValueMap");
        ck.p.j(enumC2735ak, "telemetryEventType");
        nk.j.d(A9.f22351c, null, null, new Uj(str, map, enumC2735ak, null), 3, null);
    }

    static {
        String simpleName = Wj.class.getSimpleName();
        ck.p.i(simpleName, "getSimpleName(...)");
        f23754b = simpleName;
        List listQ = nj.s.q("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed");
        f23755c = listQ;
        f23756d = kotlin.b.a(new bk.a() { // from class: b7.e5
            @Override // bk.a
            public final Object invoke() {
                return Wj.c();
            }
        });
        f23757e = new AtomicBoolean(false);
        Vj vj2 = new Vj();
        f23760h = new bk.l() { // from class: b7.f5
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Wj.a((I2) obj);
            }
        };
        TelemetryConfig telemetryConfigB = b();
        f23759g = new C2964jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetConfig().isImageEnabled(), telemetryConfigB.getAssetConfig().isGifEnabled(), telemetryConfigB.getAssetConfig().isVideoEnabled(), telemetryConfigB.isGeneralEventsDisabled(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), nj.b0.O0(listQ));
        Y3.a("telemetry", vj2);
    }

    public static final C2813dk c() {
        return new C2813dk(AbstractC2904h9.b());
    }

    public static TelemetryConfig b() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(TelemetryConfig.class, "clazz");
        return (TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(ContinuationImpl continuationImpl) throws Throwable {
        Tj tj2;
        if (continuationImpl instanceof Tj) {
            tj2 = (Tj) continuationImpl;
            int i10 = tj2.f23583b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tj2.f23583b = i10 - Integer.MIN_VALUE;
            } else {
                tj2 = new Tj(continuationImpl);
            }
        } else {
            tj2 = new Tj(continuationImpl);
        }
        Object obj = tj2.f23582a;
        Object objF = sj.a.f();
        int i11 = tj2.f23583b;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (!f23757e.getAndSet(true)) {
                Wj wj2 = f23753a;
                tj2.f23583b = 1;
                if (wj2.a((ContinuationImpl) tj2) == objF) {
                    return objF;
                }
            }
            return mj.r.f64562a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        ((C3305xc) Ji.f22955e.getValue()).a(new int[]{2, 1, 150, 152, 151}, f23760h);
        f23761i = new C2864fk(b());
        return mj.r.f64562a;
    }

    public static boolean a(String str, Map map, EnumC2735ak enumC2735ak) {
        boolean zA;
        C2964jk c2964jk = f23759g;
        if (c2964jk == null) {
            ck.p.B("mTelemetryValidator");
            c2964jk = null;
        }
        c2964jk.getClass();
        ck.p.j(enumC2735ak, "telemetryEventType");
        ck.p.j(map, "keyValueMap");
        ck.p.j(str, "eventType");
        if (c2964jk.f24627a.f23858a) {
            int iOrdinal = enumC2735ak.ordinal();
            if (iOrdinal == 0) {
                zA = c2964jk.f24628b.a(str, map);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                zA = true;
            }
        } else {
            zA = false;
        }
        return !zA;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r9.a(r8, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C2838ek r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(com.inmobi.media.ek, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        if (f23757e.get()) {
            C2773c6 eventConfig = b().getEventConfig();
            eventConfig.f24124k = b().getTelemetryUrl();
            C3000l6 c3000l6 = f23758f;
            if (c3000l6 == null) {
                f23758f = new C3000l6("telemetry", (C2813dk) f23756d.getValue(), this, eventConfig, this);
            } else {
                ck.p.j(eventConfig, "eventConfig");
                c3000l6.f24748j = eventConfig;
            }
            C3000l6 c3000l7 = f23758f;
            if (c3000l7 != null) {
                c3000l7.a(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        Qj qj2;
        if (continuationImpl instanceof Qj) {
            qj2 = (Qj) continuationImpl;
            int i10 = qj2.f23405c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qj2.f23405c = i10 - Integer.MIN_VALUE;
            } else {
                qj2 = new Qj(this, continuationImpl);
            }
        } else {
            qj2 = new Qj(this, continuationImpl);
        }
        Object objA = qj2.f23403a;
        Object objF = sj.a.f();
        int i11 = qj2.f23405c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2813dk c2813dk = (C2813dk) f23756d.getValue();
            qj2.f23405c = 1;
            objA = c2813dk.a(qj2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        if (((Number) objA).intValue() > 0) {
            a();
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.inmobi.media.Jf
    public final Object a(rj.c cVar) throws Throwable {
        Rj rj2;
        int iA;
        int i10;
        String string;
        if (cVar instanceof Rj) {
            rj2 = (Rj) cVar;
            int i11 = rj2.f23470d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rj2.f23470d = i11 - Integer.MIN_VALUE;
            } else {
                rj2 = new Rj(this, (ContinuationImpl) cVar);
            }
        } else {
            rj2 = new Rj(this, (ContinuationImpl) cVar);
        }
        Object obj = rj2.f23468b;
        Object objF = sj.a.f();
        int i12 = rj2.f23470d;
        if (i12 == 0) {
            kotlin.c.b(obj);
            C3298x5.f25687a.getClass();
            if (C3298x5.l() == 1) {
                iA = b().getWifiConfig().a();
            } else {
                iA = b().getMobileConfig().a();
            }
            C2813dk c2813dk = (C2813dk) f23756d.getValue();
            rj2.f23467a = iA;
            rj2.f23470d = 1;
            Object objB = c2813dk.b(iA, rj2);
            if (objB == objF) {
                return objF;
            }
            i10 = iA;
            obj = objB;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = rj2.f23467a;
            kotlin.c.b(obj);
        }
        List<C2838ek> listR0 = nj.b0.R0((Collection) obj);
        if (!a("DatabaseMaxLimitReachedV2", kotlin.collections.a.j(), EnumC2735ak.SDK) && listR0.size() < i10 && AbstractC2761bk.a() > 0) {
            int iA2 = AbstractC2761bk.a();
            C2838ek c2838ek = new C2838ek("DatabaseMaxLimitReachedV2", null, "sdk");
            String string2 = UUID.randomUUID().toString();
            ck.p.i(string2, "toString(...)");
            HashMap mapL = kotlin.collections.a.l(mj.h.a("eventId", string2), mj.h.a("eventType", "DatabaseMaxLimitReachedV2"), mj.h.a("samplingRate", 100), mj.h.a("isTemplateEvent", Boolean.FALSE), mj.h.a("eventLostCount", Integer.valueOf(iA2)));
            ck.p.h(mapL, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String string3 = new JSONObject(mapL).toString();
            ck.p.i(string3, "toString(...)");
            ck.p.j(string3, "payload");
            c2838ek.f24529b = string3;
            AbstractC2761bk.f24081c = tj.a.d(c2838ek.f24531d);
            listR0.add(c2838ek);
        }
        if (!listR0.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listR0.iterator();
            while (it.hasNext()) {
                arrayList.add(tj.a.d(((C2838ek) it.next()).f24531d));
            }
            try {
                String str = Ji.f22953c;
                if (str == null) {
                    str = "";
                }
                Map mapO = kotlin.collections.a.o(mj.h.a("im-accid", str), mj.h.a("version", "4.0.0"), mj.h.a("mk-version", Ki.a()), mj.h.a("u-appbid", A1.f22333a), mj.h.a("tp", Ki.f23020b));
                String str2 = Ki.f23019a;
                if (str2 != null) {
                    mapO.put("tp-v", str2);
                }
                ck.p.h(mapO, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                JSONObject jSONObject = new JSONObject(mapO);
                JSONArray jSONArray = new JSONArray();
                for (C2838ek c2838ek2 : listR0) {
                    String str3 = c2838ek2.f24529b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (lk.a0.k1(str3).toString().length() > 0) {
                        String str4 = c2838ek2.f24529b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        JSONObject jSONObject2 = new JSONObject(str4);
                        jSONObject2.put("dts", c2838ek2.f24530c);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("payload", jSONArray);
                string = jSONObject.toString();
            } catch (JSONException unused) {
                string = null;
            }
            if (string != null) {
                return new C2824e6(string, arrayList);
            }
        }
        return null;
    }
}

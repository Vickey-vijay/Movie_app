package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2935ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3085og f24558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cif f24560c;

    public static void a(Rf rf2, short s10) {
        C2888gi c2888gi = rf2.f23462k;
        if (c2888gi == null) {
            Gi gi2 = AbstractC2960jg.f24614a;
            AbstractC2960jg.a("PingFailed", kotlin.collections.a.o(mj.h.a("trigger", rf2.f23456e), mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)), mj.h.a("retryCount", Integer.valueOf(rf2.f23458g))));
            return;
        }
        C3037mi c3037mi = new C3037mi(c2888gi);
        String str = rf2.f23456e;
        int i10 = rf2.f23458g;
        ck.p.j(str, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        Map mapA = c3037mi.a();
        mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        mapA.put("trigger", str);
        mapA.put("retryCount", String.valueOf(i10));
        AbstractC2960jg.a("PingFailed", mapA);
    }

    public AbstractC2935ig(C3085og c3085og) {
        ck.p.j(c3085og, "dao");
        this.f24558a = c3085og;
        this.f24559b = new ConcurrentHashMap();
        this.f24560c = new Cif(a());
    }

    public static AdConfig.PingsV2Config a() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f23815a.a(AdConfig.class)).getPingsV2Config();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2935ig.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void a(int i10, String str, short s10, Rf rf2, long j10, InterfaceC2860fg interfaceC2860fg) {
        ck.p.j(rf2, "ping");
        ck.p.i(AbstractC2935ig.class.getSimpleName(), "getSimpleName(...)");
        String str2 = rf2.f23452a;
        ck.p.i(AbstractC2935ig.class.getSimpleName(), "getSimpleName(...)");
        Objects.toString(interfaceC2860fg);
        if (interfaceC2860fg != null) {
            ((C2834eg) interfaceC2860fg).a(rf2, i10, str, rf2.f23458g, j10);
        } else {
            a(rf2, s10);
        }
    }

    public static void a(Xf xf2, InterfaceC2860fg interfaceC2860fg) {
        ck.p.i(AbstractC2935ig.class.getSimpleName(), "getSimpleName(...)");
        String str = xf2.f23799a.f23452a;
        Objects.toString(interfaceC2860fg);
        if (interfaceC2860fg != null) {
            ((C2834eg) interfaceC2860fg).a(xf2.f23799a, xf2.f23800b, xf2.f23802d);
            return;
        }
        Rf rf2 = xf2.f23799a;
        C2888gi c2888gi = rf2.f23462k;
        if (c2888gi != null) {
            C3037mi c3037mi = new C3037mi(c2888gi);
            String str2 = rf2.f23456e;
            long j10 = rf2.f23460i;
            ck.p.j(str2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3037mi.a();
            mapA.put("trigger", str2);
            mapA.put("latency", Long.valueOf(j10));
            AbstractC2960jg.a("PingSuccess", mapA);
            return;
        }
        Gi gi2 = AbstractC2960jg.f24614a;
        AbstractC2960jg.a("PingSuccess", kotlin.collections.a.o(mj.h.a("trigger", rf2.f23456e), mj.h.a("retryCount", Integer.valueOf(rf2.f23458g))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(Xf xf2, InterfaceC2860fg interfaceC2860fg, rj.c cVar) throws Throwable {
        C2886gg c2886gg;
        int maxRetries;
        Pair pair;
        InterfaceC2860fg interfaceC2860fg2;
        Rf rf2;
        InterfaceC2860fg interfaceC2860fg3;
        Rf rf3;
        InterfaceC2860fg interfaceC2860fg4;
        Xf xf3 = xf2;
        if (cVar instanceof C2886gg) {
            c2886gg = (C2886gg) cVar;
            int i10 = c2886gg.f24433f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2886gg.f24433f = i10 - Integer.MIN_VALUE;
            } else {
                c2886gg = new C2886gg(this, cVar);
            }
        } else {
            c2886gg = new C2886gg(this, cVar);
        }
        C2886gg c2886gg2 = c2886gg;
        Object obj = c2886gg2.f24431d;
        Object objF = sj.a.f();
        int i11 = c2886gg2.f24433f;
        if (i11 != 0) {
            if (i11 == 1) {
                InterfaceC2860fg interfaceC2860fg5 = c2886gg2.f24429b;
                Xf xf4 = c2886gg2.f24428a;
                kotlin.c.b(obj);
                interfaceC2860fg4 = interfaceC2860fg5;
                xf3 = xf4;
                a(xf3.f23800b, "Redirect URL is malformed", (short) 2258, xf3.f23799a, xf3.f23802d, interfaceC2860fg4);
                return mj.r.f64562a;
            }
            if (i11 == 2) {
                Rf rf4 = c2886gg2.f24430c;
                InterfaceC2860fg interfaceC2860fg6 = c2886gg2.f24429b;
                Xf xf5 = c2886gg2.f24428a;
                kotlin.c.b(obj);
                rf3 = rf4;
                interfaceC2860fg3 = interfaceC2860fg6;
                xf3 = xf5;
                a(xf3.f23800b, xf3.f23801c, (short) 2249, rf3, xf3.f23802d, interfaceC2860fg3);
                return mj.r.f64562a;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rf rf5 = c2886gg2.f24430c;
            InterfaceC2860fg interfaceC2860fg7 = c2886gg2.f24429b;
            Xf xf6 = c2886gg2.f24428a;
            kotlin.c.b(obj);
            rf2 = rf5;
            interfaceC2860fg2 = interfaceC2860fg7;
            xf3 = xf6;
            a(xf3.f23800b, xf3.f23801c, (short) 2247, rf2, xf3.f23802d, interfaceC2860fg2);
            return mj.r.f64562a;
        }
        kotlin.c.b(obj);
        String str = xf3.f23799a.f23452a;
        int i12 = xf3.f23800b;
        Y5 y10 = EnumC2721a6.f23946b;
        if (i12 == 178) {
            String str2 = xf3.f23799a.f23452a;
            C3085og c3085og = this.f24558a;
            Rf rf6 = xf3.f23799a;
            c2886gg2.f24428a = xf3;
            c2886gg2.f24429b = interfaceC2860fg;
            c2886gg2.f24433f = 1;
            Object objA = c3085og.f24997a.a("pings", "id=?", new String[]{rf6.f23453b}, c2886gg2);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA != objF) {
                interfaceC2860fg4 = interfaceC2860fg;
                a(xf3.f23800b, "Redirect URL is malformed", (short) 2258, xf3.f23799a, xf3.f23802d, interfaceC2860fg4);
                return mj.r.f64562a;
            }
        } else {
            Rf rf7 = xf3.f23799a;
            int i13 = rf7.f23458g + 1;
            if (ck.p.e(rf7.f23456e, "high")) {
                maxRetries = a().getRetryConfig().getHigh().getMaxRetries();
            } else {
                maxRetries = a().getRetryConfig().getNormal().getMaxRetries();
            }
            if (i13 > maxRetries) {
                C3085og c3085og2 = this.f24558a;
                c2886gg2.f24428a = xf3;
                c2886gg2.f24429b = interfaceC2860fg;
                c2886gg2.f24430c = rf7;
                c2886gg2.f24433f = 2;
                Object objA2 = c3085og2.f24997a.a("pings", "id=?", new String[]{rf7.f23453b}, c2886gg2);
                if (objA2 != sj.a.f()) {
                    objA2 = mj.r.f64562a;
                }
                if (objA2 != objF) {
                    interfaceC2860fg3 = interfaceC2860fg;
                    rf3 = rf7;
                    a(xf3.f23800b, xf3.f23801c, (short) 2249, rf3, xf3.f23802d, interfaceC2860fg3);
                    return mj.r.f64562a;
                }
            } else {
                if (ck.p.e(rf7.f23456e, "high")) {
                    pair = new Pair(tj.a.e(a().getRetryConfig().getHigh().getRetryInterval()), tj.a.b(a().getRetryConfig().getHigh().getFactor()));
                } else {
                    pair = new Pair(tj.a.e(a().getRetryConfig().getNormal().getRetryInterval()), tj.a.b(a().getRetryConfig().getNormal().getFactor()));
                }
                Long lE = tj.a.e(System.currentTimeMillis() + ((long) (Math.pow(((Number) pair.component2()).doubleValue(), i13) * ((Number) pair.component1()).longValue() * 1000)));
                String str3 = rf7.f23452a;
                String str4 = rf7.f23453b;
                Map map = rf7.f23454c;
                boolean z10 = rf7.f23455d;
                String str5 = rf7.f23456e;
                boolean z11 = rf7.f23457f;
                String str6 = rf7.f23459h;
                long j10 = rf7.f23460i;
                C2888gi c2888gi = rf7.f23462k;
                ck.p.j(str3, "url");
                ck.p.j(str4, "id");
                ck.p.j(map, "headers");
                ck.p.j(str5, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                ck.p.j(str6, "ownerId");
                Rf rf8 = new Rf(str3, str4, map, z10, str5, z11, i13, str6, j10, lE, c2888gi);
                C3085og c3085og3 = this.f24558a;
                c2886gg2.f24428a = xf3;
                c2886gg2.f24429b = interfaceC2860fg;
                c2886gg2.f24430c = rf7;
                c2886gg2.f24433f = 3;
                Object objA3 = C2879g9.a(c3085og3.f24997a, "pings", AbstractC3110pg.a(rf8), "id=?", new String[]{str4}, c2886gg2, 16);
                if (objA3 != sj.a.f()) {
                    objA3 = mj.r.f64562a;
                }
                if (objA3 == objF) {
                    return objF;
                }
                interfaceC2860fg2 = interfaceC2860fg;
                rf2 = rf7;
                a(xf3.f23800b, xf3.f23801c, (short) 2247, rf2, xf3.f23802d, interfaceC2860fg2);
                return mj.r.f64562a;
            }
        }
        return objF;
    }
}

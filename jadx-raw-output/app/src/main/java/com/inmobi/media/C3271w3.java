package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.C3271w3;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3271w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3271w3 f25610a = new C3271w3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mj.g f25611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static nk.l0 f25612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerC2873g3 f25613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HandlerThread f25614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static List f25615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f25616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f25617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f25618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f25619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.l f25620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3196t3 f25621l;

    public static final mj.r a(I2 i10) {
        ck.p.j(i10, "event");
        int i11 = i10.f22839a;
        if (i11 == 1 || i11 == 2) {
            ck.p.i("w3", "TAG");
            f25617h.set(false);
        } else if (i11 != 10) {
            if (i11 != 11) {
                ck.p.i("w3", "TAG");
            } else if (!Boolean.parseBoolean(i10.f22840b)) {
                f();
            }
        } else if (ck.p.e("available", i10.f22840b)) {
            f();
        }
        return mj.r.f64562a;
    }

    public static final void b(S2 s10) throws InterruptedException {
        int i10 = s10.f23483f;
        if (i10 > 0) {
            s10.f23483f = i10 - 1;
            s10.f23484g = System.currentTimeMillis();
            nk.i.b(null, new C3246v3(s10, null), 1, null);
        }
    }

    static {
        String simpleName = C3271w3.class.getSimpleName();
        f25611b = kotlin.b.a(new bk.a() { // from class: b7.rb
            @Override // bk.a
            public final Object invoke() {
                return C3271w3.b();
            }
        });
        f25615f = new ArrayList();
        f25616g = new AtomicBoolean(false);
        f25617h = new AtomicBoolean(true);
        f25618i = new Object();
        f25619j = new LinkedHashMap();
        f25620k = new bk.l() { // from class: b7.sb
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C3271w3.a((I2) obj);
            }
        };
        ck.p.i(simpleName, "TAG");
        Runnable runnable = new Runnable() { // from class: b7.tb
            @Override // java.lang.Runnable
            public final void run() {
                C3271w3.a();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
        f25621l = new C3196t3();
    }

    public static AdConfig.ImaiConfig c() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f23815a.a(AdConfig.class)).getImaiConfig();
    }

    public static void d() {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            ck.p.i("w3", "TAG");
            ck.p.j("w3", "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new B9("w3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f25612c = kotlinx.coroutines.d.a(nk.l1.c(threadPoolExecutor).plus(nk.j2.b(null, 1, null)));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f25614e = handlerThread;
            H6.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = f25614e;
            ck.p.g(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            ck.p.i(looper, "getLooper(...)");
            f25613d = new HandlerC2873g3(looper);
            ((C3305xc) Ji.f22955e.getValue()).a(new int[]{10, 11, 2, 1}, f25620k);
        } catch (Exception e10) {
            ck.p.i("w3", "TAG");
            e10.getMessage();
        }
    }

    public static boolean e() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(RootConfig.class, "clazz");
        return !((RootConfig) Y3.f23815a.a(RootConfig.class)).isMonetizationDisabled();
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = f25616g;
            atomicBoolean.set(false);
            synchronized (f25618i) {
                if (!atomicBoolean.get()) {
                    HandlerThread handlerThread = f25614e;
                    if (handlerThread != null) {
                        handlerThread.getLooper().quit();
                        handlerThread.interrupt();
                    }
                    f25614e = null;
                    f25613d = null;
                }
                mj.r rVar = mj.r.f64562a;
            }
        } catch (Exception e10) {
            ck.p.i("w3", "TAG");
            e10.getMessage();
        }
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (Re.a() == null) {
                synchronized (f25618i) {
                    if (f25616g.compareAndSet(false, true)) {
                        ck.p.i("w3", "TAG");
                        if (f25614e == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            f25614e = handlerThread2;
                            H6.a(handlerThread2, "pingHandlerThread");
                        }
                        if (f25613d == null && (handlerThread = f25614e) != null) {
                            Looper looper = handlerThread.getLooper();
                            ck.p.i(looper, "getLooper(...)");
                            f25613d = new HandlerC2873g3(looper);
                        }
                        nk.i.b(null, new C3221u3(null), 1, null);
                    }
                    mj.r rVar = mj.r.f64562a;
                }
            }
        } catch (Exception e10) {
            ck.p.i("w3", "TAG");
            e10.getMessage();
        }
    }

    public static final W2 b() {
        return new W2(AbstractC2904h9.b());
    }

    public static final HashMap a(S2 s10) {
        HashMap map = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - s10.f23483f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
                return map;
            }
        } catch (Exception unused) {
            ck.p.i("w3", "TAG");
        }
        return map;
    }

    public static final void a() {
        d();
    }

    public static void a(String str, boolean z10, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(str, "url");
        ck.p.i("w3", "TAG");
        Dg.a(Ag.REGULAR, new C3022m3(str, z10, interfaceC3028m9, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(S2 s10, C2715a0 c2715a0, InterfaceC3028m9 interfaceC3028m9, ContinuationImpl continuationImpl) throws Throwable {
        C3122q3 c3122q3;
        C2715a0 c2715a1;
        S2 s11 = s10;
        InterfaceC3028m9 interfaceC3028m10 = interfaceC3028m9;
        if (continuationImpl instanceof C3122q3) {
            c3122q3 = (C3122q3) continuationImpl;
            int i10 = c3122q3.f25137f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3122q3.f25137f = i10 - Integer.MIN_VALUE;
            } else {
                c3122q3 = new C3122q3(this, continuationImpl);
            }
        } else {
            c3122q3 = new C3122q3(this, continuationImpl);
        }
        Object obj = c3122q3.f25135d;
        Object objF = sj.a.f();
        int i11 = c3122q3.f25137f;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (interfaceC3028m10 != null) {
                ck.p.i("w3", "TAG");
                ((C3053n9) interfaceC3028m10).c("w3", "record Click");
            }
            W2 w10 = (W2) f25611b.getValue();
            int maxDbEvents = c().getMaxDbEvents();
            c3122q3.f25132a = s11;
            c2715a1 = c2715a0;
            c3122q3.f25133b = c2715a1;
            c3122q3.f25134c = interfaceC3028m10;
            c3122q3.f25137f = 1;
            C2879g9 c2879g9 = w10.f23722a;
            V2 v10 = new V2(maxDbEvents, w10, s11, null);
            c2879g9.getClass();
            Object objA = c2879g9.a(new C2853f9(c2879g9, v10, null), c3122q3);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC3028m9 interfaceC3028m11 = c3122q3.f25134c;
            C2715a0 c2715a2 = c3122q3.f25133b;
            S2 s12 = c3122q3.f25132a;
            kotlin.c.b(obj);
            c2715a1 = c2715a2;
            interfaceC3028m10 = interfaceC3028m11;
            s11 = s12;
        }
        if (c2715a1 != null) {
            f25619j.put(Integer.valueOf(s11.f23478a), c2715a1);
        }
        if (Re.a() != null) {
            if (interfaceC3028m10 != null) {
                ck.p.i("w3", "TAG");
                ((C3053n9) interfaceC3028m10).b("w3", "No network available. Saving click for later processing ...");
            }
            f25616g.set(false);
            g();
        } else {
            if (interfaceC3028m10 != null) {
                ck.p.i("w3", "TAG");
                ((C3053n9) interfaceC3028m10).a("w3", "submit click - " + s11.f23478a);
            }
            nk.l0 l0Var = f25612c;
            if (l0Var != null) {
                nk.j.d(l0Var, null, null, new C3146r3(s11, interfaceC3028m10, null), 3, null);
            }
        }
        return mj.r.f64562a;
    }

    public static void a(S2 s10, String str) {
        ck.p.j(s10, "click");
        ck.p.j(str, "error");
        LinkedHashMap linkedHashMap = f25619j;
        C2715a0 c2715a0 = (C2715a0) linkedHashMap.get(Integer.valueOf(s10.f23478a));
        if (c2715a0 != null) {
            ck.p.j(s10, "click");
            ck.p.j(str, "error");
            C2890gk c2890gk = c2715a0.f23933b;
            ck.p.j(str, "reason");
            LinkedHashMap linkedHashMapA = c2890gk.a();
            linkedHashMapA.put("networkType", C3298x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
            linkedHashMapA.put("reason", str);
            String str2 = c2890gk.f24454d;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMapA.put("impressionId", str2);
            Wj wj2 = Wj.f23753a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2735ak.SDK);
        }
        linkedHashMap.remove(Integer.valueOf(s10.f23478a));
    }
}

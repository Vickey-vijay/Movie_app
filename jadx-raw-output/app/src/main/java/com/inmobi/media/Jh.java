package com.inmobi.media;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.I2;
import com.inmobi.media.Jh;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Jh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Jb f22943b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ab f22942a = Ab.ERROR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f22944c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ih f22945d = new Ih();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f22946e = new ReentrantLock();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.l f22947f = new bk.l() { // from class: b7.z1
        @Override // bk.l
        public final Object invoke(Object obj) {
            return Jh.a((I2) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ReferenceQueue f22948g = new ReferenceQueue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap f22949h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f22950i = new AtomicBoolean(false);

    public static final mj.r a(I2 i10) throws JSONException {
        ck.p.j(i10, "it");
        int i11 = i10.f22839a;
        if (i11 != 1 && i11 != 2) {
            switch (i11) {
                case 150:
                case 151:
                case 152:
                    Map map = i10.f22841c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = i10.f22841c.get("data");
                        ck.p.h(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((Q9) obj);
                    }
                    break;
            }
        } else {
            a(i11);
            f22944c.set(false);
            ((C3305xc) Ji.f22955e.getValue()).a(f22947f);
            f22943b = null;
        }
        return mj.r.f64562a;
    }

    public static void b() {
        if (f22943b == null && f22946e.tryLock()) {
            try {
                if (f22943b == null && f22944c.get()) {
                    Context context = Ji.f22951a;
                    if (context != null) {
                        C2924i4 c2924i4 = Y3.f23815a;
                        ck.p.j(TelemetryConfig.class, "clazz");
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getLoggingConfig();
                        f22943b = new Jb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * ((long) 1000), loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Jb jb2 = f22943b;
                    if (jb2 != null) {
                        AbstractC3128q9.a(jb2);
                    }
                }
            } finally {
                f22946e.unlock();
            }
        }
    }

    public static final void c() throws InterruptedException {
        while (f22944c.get()) {
            a();
        }
    }

    public static void a(Object obj, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(obj, IconCompat.EXTRA_OBJ);
        try {
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(TelemetryConfig.class, "clazz");
            if (((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC3028m9 != null) {
                    f22949h.put(new PhantomReference(obj, f22948g), new Pair(obj.toString(), new WeakReference(interfaceC3028m9)));
                    if (f22950i.getAndSet(true)) {
                        return;
                    }
                    nk.l0 l0Var = Sb.f23496a;
                    Runnable runnable = new Runnable() { // from class: b7.a2
                        @Override // java.lang.Runnable
                        public final void run() throws InterruptedException {
                            Jh.c();
                        }
                    };
                    ck.p.j("RemoteLoggerComponent", "tag");
                    ck.p.j(runnable, "runnable");
                    try {
                        nk.j.d(Sb.f23496a, null, null, new Ob(runnable, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (ck.p.e(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (ck.p.e(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (ck.p.e(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (ck.p.e(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static C3053n9 a(String str, String str2) {
        ck.p.j(str, "logType");
        ck.p.j(str2, "placementType");
        Context context = Ji.f22951a;
        if (context != null) {
            try {
                b();
                C2924i4 c2924i4 = Y3.f23815a;
                ck.p.j(TelemetryConfig.class, "clazz");
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getLoggingConfig();
                double dB = b(str, str2, loggingConfig);
                Ab abA = a(str, str2, loggingConfig);
                boolean z10 = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * ((long) 1000);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ck.p.j(abA, "logLevel");
                return new C3053n9(context, dB, abA, z10, maxNoOfEntries, expiry);
            } catch (Exception e10) {
                mj.g gVar = P9.f23321a;
                AbstractC2929i9.a(e10);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Ab a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (ck.p.e(str2, "AB")) {
                        return Bb.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (ck.p.e(str2, "AB")) {
                        return Bb.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (ck.p.e(str2, "AB")) {
                        return Bb.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return Bb.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (ck.p.e(str2, "AB")) {
                        return Bb.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Bb.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f22942a;
    }

    public static void a() throws InterruptedException {
        WeakReference weakReference;
        InterfaceC3028m9 interfaceC3028m9;
        Reference referenceRemove = f22948g.remove();
        ConcurrentHashMap concurrentHashMap = f22949h;
        if (nj.b0.U(concurrentHashMap.keySet(), referenceRemove)) {
            Pair pair = (Pair) concurrentHashMap.get(referenceRemove);
            if (pair != null && (weakReference = (WeakReference) pair.getSecond()) != null && (interfaceC3028m9 = (InterfaceC3028m9) weakReference.get()) != null) {
                ((C3053n9) interfaceC3028m9).a("ReferenceTracker", " reference " + pair.getFirst() + " reference is GCed.");
            }
            ck.x.d(concurrentHashMap).remove(referenceRemove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((Pair) entry.getValue()).getSecond()).get() == null) {
                f22949h.remove(entry.getKey());
            }
        }
    }

    public static void a(Q9 q10) throws JSONException {
        ck.p.j(q10, "incident");
        if (!(q10 instanceof T4) && !(q10 instanceof Wn)) {
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(CrashConfig.class, "clazz");
            C2924i4 c2924i5 = Y3.f23815a;
            if (((CrashConfig) c2924i5.a(CrashConfig.class)).getANRConfig().getAppExitReason().getReportToLogs() && (q10 instanceof C3344z1)) {
                ck.p.j(CrashConfig.class, "clazz");
                Y9 y10 = new Y9(((CrashConfig) c2924i5.a(CrashConfig.class)).getANRConfig().getAppExitReason().getIncompleteLogThresholdTime());
                String str = q10.f24528a;
                String str2 = q10.f24529b;
                String str3 = str2 == null ? "" : str2;
                int i10 = ((C3344z1) q10).f25820g;
                long j10 = q10.f24530c;
                ck.p.j(str, "message");
                ck.p.j(str3, "exitData");
                nk.l0 l0Var = Sb.f23496a;
                Rb.a(new X9(y10, j10, str, i10, str3, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3128q9.f25157a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f23154a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei2 : arrayList) {
            Ab ab2 = Ab.ERROR;
            String str4 = q10.f24528a;
            long j11 = q10.f24530c;
            String str5 = q10.f24529b;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = "TYPE - " + str4 + ", TIMESTAMP - " + j11 + ", PAYLOAD - " + str5;
            ei2.getClass();
            ck.p.j(ab2, "logLevel");
            ck.p.j("LOGGER CRASH", "tag");
            ck.p.j(str6, "message");
            ei2.f22600a.a(ab2, "LOGGER CRASH", str6);
            if (q10 instanceof T4) {
                ei2.f22600a.b();
            }
        }
    }

    public static void a(int i10) throws JSONException {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3128q9.f25157a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f23154a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei2 : arrayList) {
            Ab ab2 = Ab.ERROR;
            String str = "SYSTEM SHUTDOWN RECEIVED - " + i10;
            ei2.getClass();
            ck.p.j(ab2, "logLevel");
            ck.p.j("LOGGER CRASH", "tag");
            ck.p.j(str, "message");
            ei2.f22600a.a(ab2, "LOGGER CRASH", str);
            ei2.f22600a.b();
        }
        f22944c.set(false);
        ((C3305xc) Ji.f22955e.getValue()).a(f22947f);
        f22943b = null;
    }
}

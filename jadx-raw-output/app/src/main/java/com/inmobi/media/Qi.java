package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.media.Qi;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes8.dex */
public final class Qi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f23395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f23396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f23397f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ea f23400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final I1 f23401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I1 f23402k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f23393b = {ck.s.i(new PropertyReference1Impl(Qi.class, "sessionCnt", "getSessionCnt()I", 0)), ck.s.i(new PropertyReference1Impl(Qi.class, "userRetention", "getUserRetention()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Qi f23392a = new Qi();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23394c = Qi.class.getSimpleName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f23398g = nj.s.q(0, 0, 0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f23399h = new AtomicBoolean(false);

    public static boolean a(int i10) {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getSessionConfig().getSigControlList().contains(Integer.valueOf(i10));
    }

    static {
        Ea eaA;
        Context context = Ji.f22951a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            eaA = Da.a(context, "session_pref_file");
        } else {
            eaA = null;
        }
        f23400i = eaA;
        int i10 = 12;
        f23401j = new I1(-1, new bk.a() { // from class: b7.c4
            @Override // bk.a
            public final Object invoke() {
                return Integer.valueOf(Qi.a());
            }
        }, i10);
        f23402k = new I1(-1, new bk.a() { // from class: b7.d4
            @Override // bk.a
            public final Object invoke() {
                return Integer.valueOf(Qi.b());
            }
        }, i10);
    }

    public static final int b() {
        f23392a.getClass();
        Ea ea2 = f23400i;
        if (ea2 == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ck.p.j("u-ret", C3426d4.i.W);
        return Integer.min((int) ((jCurrentTimeMillis - ea2.f22577a.getLong("u-ret", jCurrentTimeMillis)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS), Integer.MAX_VALUE);
    }

    public static void c() {
        if (f23399h.getAndSet(true)) {
            return;
        }
        if (Yi.a().isSessionEnabled()) {
            String string = UUID.randomUUID().toString();
            ck.p.i(string, "toString(...)");
            f23395d = string;
            ck.p.i(f23394c, "TAG");
        }
        f23397f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            Ea ea2 = f23400i;
            if (ea2 != null) {
                ck.p.j(ImpressionLog.M, C3426d4.i.W);
                ea2.a(ImpressionLog.M, Integer.min(ea2.f22577a.getInt(ImpressionLog.M, 0) + 1, Integer.MAX_VALUE), false);
            }
            f23401j.a();
        }
        if (a(6)) {
            Ea ea3 = f23400i;
            if (ea3 != null) {
                ck.p.j("u-ret", C3426d4.i.W);
                if (!ea3.f22577a.contains("u-ret")) {
                    ea3.a("u-ret", System.currentTimeMillis(), false);
                }
            }
            f23402k.a();
        }
    }

    public static final int a() {
        f23392a.getClass();
        Ea ea2 = f23400i;
        if (ea2 == null) {
            return 0;
        }
        ck.p.j(ImpressionLog.M, C3426d4.i.W);
        return ea2.f22577a.getInt(ImpressionLog.M, 0);
    }

    public static void a(String str, Boolean bool) {
        ck.p.j(str, "adtype");
        if (ck.p.e(str, "banner") && a(1)) {
            List list = f23398g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (ck.p.e(str, ImpressionLog.f43647w) && !ck.p.e(bool, Boolean.TRUE) && a(2)) {
            List list2 = f23398g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (ck.p.e(str, "native") && a(4)) {
            List list3 = f23398g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (ck.p.e(bool, Boolean.TRUE) && a(3)) {
            List list4 = f23398g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}

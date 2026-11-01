package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.media.AbstractC3363zk;
import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3363zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C3194t1 f25867a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e10) {
            ck.p.i("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void b() {
        String str;
        try {
            C3194t1 c3194t1 = f25867a;
            if (c3194t1 == null || (str = c3194t1.f25366b) == null) {
                return;
            }
            ck.p.i("zk", "TAG");
            Kb.a((byte) 2, "zk", "Publisher device Id is " + str);
        } catch (Exception e10) {
            ck.p.i("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void c() {
        boolean zBooleanValue;
        C3194t1 c3194t1;
        try {
            Context context = Ji.f22951a;
            if (context != null) {
                C3194t1 c3194t2 = new C3194t1();
                try {
                    ck.s.b(AdvertisingIdClient.class).i();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        ck.p.i(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c3194t2.f25366b = advertisingIdInfo.getId();
                        c3194t2.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        f25867a = c3194t2;
                        Boolean bool = Tg.f23565b;
                        boolean z10 = false;
                        if (bool == null) {
                            Context context2 = Ji.f22951a;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                                Ea eaA = Da.a(context2, "user_info_store");
                                ck.p.j("user_age_restricted", C3426d4.i.W);
                                Tg.f23565b = Boolean.valueOf(eaA.f22577a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = Tg.f23565b;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            if (z10 || (c3194t1 = f25867a) == null) {
                                return;
                            }
                            c3194t1.f25366b = null;
                            return;
                            ck.p.i("zk", "TAG");
                            e.getMessage();
                        }
                        zBooleanValue = bool.booleanValue();
                        z10 = zBooleanValue;
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Exception e10) {
                        ck.p.i("zk", "TAG");
                        e10.getMessage();
                        return;
                    }
                } catch (NoClassDefFoundError unused) {
                    return;
                }
                ck.p.i("zk", "TAG");
                e.getMessage();
            }
        } catch (Exception e11) {
            ck.p.i("zk", "TAG");
            e11.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a(boolean z10) {
        C3194t1 c3194t1 = f25867a;
        if (c3194t1 == null) {
            return;
        }
        if (z10) {
            c3194t1.f25366b = null;
        } else if (c3194t1.f25366b == null) {
            Runnable runnable = new Runnable() { // from class: b7.vc
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3363zk.d();
                }
            };
            Context context = Ji.f22951a;
            ck.p.j(runnable, "runnable");
            Ji.f22957g.submit(runnable);
        }
    }
}

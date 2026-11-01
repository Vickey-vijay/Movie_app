package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inmobi.media.AbstractC2835eh;
import com.inmobi.media.C2961jh;
import com.inmobi.media.Wg;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.inmobi.media.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2961jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bk.l f24615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BillingClient f24616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f24617c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wg f24618d = new Wg();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24619e = 2;

    public static final void a(BillingResult billingResult, List list) {
        ck.p.j(billingResult, "<unused var>");
    }

    public static final void b(BillingResult billingResult, List list) {
        ck.p.j(billingResult, "<unused var>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new b7.q8()).build();
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            mj.g gVar2 = P9.f23321a;
            P9.a(new L2(e11));
            e11.getMessage();
            return null;
        }
    }

    public final void a(Context context, bk.l lVar) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(lVar, "onComplete");
        try {
            this.f24615a = lVar;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            ck.p.i(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new Yg((short) 2236), (Wg) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new Yg((short) 2233), (Wg) null);
                return;
            }
            this.f24616b = billingClient;
            bk.l lVar2 = new bk.l() { // from class: b7.r8
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return C2961jh.a(this.f5159b, (AbstractC2835eh) obj);
                }
            };
            ck.p.j(lVar2, "onComplete");
            BillingClient billingClient2 = this.f24616b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new C2861fh(lVar2, this));
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            e10.getMessage();
            a(new Yg((short) 2237), (Wg) null);
        }
    }

    public static final void b(final C2961jh c2961jh, final bk.l lVar, BillingResult billingResult, List list) {
        ck.p.j(billingResult, "<unused var>");
        ck.p.j(list, "purchasesResult");
        Wg wg2 = c2961jh.f24618d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg2.f23748a = arrayList.size();
        Runnable runnable = new Runnable() { // from class: b7.o8
            @Override // java.lang.Runnable
            public final void run() {
                C2961jh.b(lVar, c2961jh);
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final mj.r a(final C2961jh c2961jh, AbstractC2835eh abstractC2835eh) {
        ck.p.j(abstractC2835eh, "result");
        if (abstractC2835eh instanceof C2784ch) {
            c2961jh.a(new Xg(String.valueOf(((C2784ch) abstractC2835eh).f24137a)), (Wg) null);
            return mj.r.f64562a;
        }
        c2961jh.a(new bk.l() { // from class: b7.t8
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C2961jh.a(this.f5187b, (Wg) obj);
            }
        });
        return mj.r.f64562a;
    }

    public static final void b(bk.l lVar, C2961jh c2961jh) {
        lVar.invoke(c2961jh.f24618d);
    }

    public static final mj.r a(C2961jh c2961jh, Wg wg2) {
        ck.p.j(wg2, "data");
        if (c2961jh.f24617c.incrementAndGet() != c2961jh.f24619e) {
            return mj.r.f64562a;
        }
        int i10 = wg2.f23748a;
        if (i10 == 0 && wg2.f23749b == 0) {
            c2961jh.a(new Yg((short) 2234), (Wg) null);
            return mj.r.f64562a;
        }
        lk.q.l("No of In-App Purchases: " + i10 + "\n                                    | and No of Subscriptions: " + wg2.f23749b + "\n                                ", null, 1, null);
        c2961jh.a(Zg.f23919a, wg2);
        return mj.r.f64562a;
    }

    public final bk.l a(String str) {
        if (lk.x.R(str, "6", false, 2, null)) {
            return new C2887gh(this);
        }
        if (lk.x.R(str, com.ironsource.Gc.f26641e, false, 2, null)) {
            return new C2912hh(this);
        }
        return new C2936ih(this);
    }

    public final void a(AbstractC2732ah abstractC2732ah, Wg wg2) {
        AbstractC2758bh.a(abstractC2732ah);
        bk.l lVar = this.f24615a;
        if (lVar != null) {
            lVar.invoke(wg2);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new b7.q8()).build();
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            mj.g gVar2 = P9.f23321a;
            P9.a(new L2(e11));
            e11.getMessage();
            return null;
        }
    }

    public final void a(final bk.l lVar) {
        ck.p.j(lVar, "onComplete");
        QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder builderNewBuilder2 = QueryPurchasesParams.newBuilder();
        ck.p.i(builderNewBuilder2, "newBuilder(...)");
        builderNewBuilder2.setProductType("subs");
        BillingClient billingClient = this.f24616b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(builderNewBuilder.build(), new PurchasesResponseListener() { // from class: b7.s8
            });
        }
        BillingClient billingClient2 = this.f24616b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(builderNewBuilder2.build(), new PurchasesResponseListener() { // from class: b7.s8
            });
        }
    }

    public static final void a(final C2961jh c2961jh, final bk.l lVar, BillingResult billingResult, List list) {
        ck.p.j(billingResult, "<unused var>");
        ck.p.j(list, "purchasesResult");
        Wg wg2 = c2961jh.f24618d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg2.f23749b = arrayList.size();
        Runnable runnable = new Runnable() { // from class: b7.p8
            @Override // java.lang.Runnable
            public final void run() {
                C2961jh.a(lVar, c2961jh);
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void a(bk.l lVar, C2961jh c2961jh) {
        lVar.invoke(c2961jh.f24618d);
    }
}

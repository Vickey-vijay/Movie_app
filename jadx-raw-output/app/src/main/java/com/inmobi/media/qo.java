package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f25206a = new LinkedHashMap();

    public static final String a(C3292x c3292x, double d10) {
        ck.p.j(c3292x, "adComponent");
        LinkedHashMap linkedHashMap = f25206a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(c3292x));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (!((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            C3053n9 c3053n9 = c3292x.f25676a.f24939c;
            if (c3053n9 == null) {
                return "win/loss notification already triggered";
            }
            c3053n9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList arrayListA = AbstractC3347z4.a(c3292x.f25677b, "win_beacon");
            if (arrayListA.isEmpty()) {
                C3053n9 c3053n10 = c3292x.f25676a.f24939c;
                if (c3053n10 == null) {
                    return "no win/loss notification url";
                }
                c3053n10.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String strA = H3.a((String) it.next(), kotlin.collections.a.m(mj.h.a("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), mj.h.a("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                C3271w3 c3271w3 = C3271w3.f25610a;
                C3053n9 c3053n11 = c3292x.f25676a.f24939c;
                ck.p.j(strA, "url");
                C3271w3.a(strA, true, c3053n11);
            }
            if (d10 > 0.0d) {
                return null;
            }
            C3053n9 c3053n12 = c3292x.f25676a.f24939c;
            if (c3053n12 == null) {
                return "notification triggering with invalid params";
            }
            c3053n12.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d10);
            return "notification triggering with invalid params";
        } catch (Exception e10) {
            C3053n9 c3053n13 = c3292x.f25676a.f24939c;
            if (c3053n13 == null) {
                return "win notification failed internally";
            }
            c3053n13.a("NativeWinLossBeacon", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    public static final String a(C3292x c3292x, int i10, double d10) {
        ck.p.j(c3292x, "adComponent");
        LinkedHashMap linkedHashMap = f25206a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(c3292x));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            try {
                ArrayList arrayListA = AbstractC3347z4.a(c3292x.f25677b, "loss_beacon");
                if (arrayListA.isEmpty()) {
                    C3053n9 c3053n9 = c3292x.f25676a.f24939c;
                    if (c3053n9 == null) {
                        return "no win/loss notification url";
                    }
                    c3053n9.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    String strA = H3.a((String) it.next(), kotlin.collections.a.m(mj.h.a(com.ironsource.mediationsdk.d.f29600l, String.valueOf(i10)), mj.h.a(com.ironsource.mediationsdk.d.f29602n, String.valueOf(d10))));
                    C3271w3 c3271w3 = C3271w3.f25610a;
                    C3053n9 c3053n10 = c3292x.f25676a.f24939c;
                    ck.p.j(strA, "url");
                    C3271w3.a(strA, true, c3053n10);
                }
                if (i10 > 0 && d10 > 0.0d) {
                    return null;
                }
                C3053n9 c3053n11 = c3292x.f25676a.f24939c;
                if (c3053n11 == null) {
                    return "notification triggering with invalid params";
                }
                c3053n11.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
                return "notification triggering with invalid params";
            } catch (Exception e10) {
                C3053n9 c3053n12 = c3292x.f25676a.f24939c;
                if (c3053n12 == null) {
                    return "loss notification failed internally";
                }
                c3053n12.a("NativeWinLossBeacon", "Exception in notifyLoss", e10);
                return "loss notification failed internally";
            }
        }
        C3053n9 c3053n13 = c3292x.f25676a.f24939c;
        if (c3053n13 == null) {
            return "win/loss notification already triggered";
        }
        c3053n13.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
        return "win/loss notification already triggered";
    }
}

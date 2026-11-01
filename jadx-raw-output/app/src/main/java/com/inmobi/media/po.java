package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class po implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.network.common.model.Ad f25114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3053n9 f25115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f25116c;

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        if (!this.f25116c.compareAndSet(false, true)) {
            C3053n9 c3053n9 = this.f25115b;
            if (c3053n9 == null) {
                return "win/loss notification already triggered";
            }
            c3053n9.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad2 = this.f25114a;
            List listA = ad2 != null ? AbstractC3336yi.a(ad2, "win_beacon") : null;
            if (listA != null && !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String strA = H3.a((String) it.next(), kotlin.collections.a.m(mj.h.a("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), mj.h.a("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                    C3271w3 c3271w3 = C3271w3.f25610a;
                    C3053n9 c3053n10 = this.f25115b;
                    ck.p.j(strA, "url");
                    C3271w3.a(strA, true, c3053n10);
                }
                if (d10 > 0.0d) {
                    return null;
                }
                C3053n9 c3053n11 = this.f25115b;
                if (c3053n11 == null) {
                    return "notification triggering with invalid params";
                }
                c3053n11.b("l1", "Win notification triggered with invalid minBidToWin: " + d10);
                return "notification triggering with invalid params";
            }
            C3053n9 c3053n12 = this.f25115b;
            if (c3053n12 == null) {
                return "no win/loss notification url";
            }
            c3053n12.b("l1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e10) {
            C3053n9 c3053n13 = this.f25115b;
            if (c3053n13 == null) {
                return "win notification failed internally";
            }
            c3053n13.a("l1", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    public po(com.inmobi.media.ads.network.common.model.Ad ad2, C3053n9 c3053n9) {
        ck.p.j("l1", "tag");
        this.f25114a = ad2;
        this.f25115b = c3053n9;
        this.f25116c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        if (this.f25116c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad2 = this.f25114a;
                List listA = ad2 != null ? AbstractC3336yi.a(ad2, "loss_beacon") : null;
                if (listA != null && !listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        String strA = H3.a((String) it.next(), kotlin.collections.a.m(mj.h.a(com.ironsource.mediationsdk.d.f29600l, String.valueOf(i10)), mj.h.a(com.ironsource.mediationsdk.d.f29602n, String.valueOf(d10))));
                        C3271w3 c3271w3 = C3271w3.f25610a;
                        C3053n9 c3053n9 = this.f25115b;
                        ck.p.j(strA, "url");
                        C3271w3.a(strA, true, c3053n9);
                    }
                    if (i10 > 0 && d10 > 0.0d) {
                        return null;
                    }
                    C3053n9 c3053n10 = this.f25115b;
                    if (c3053n10 == null) {
                        return "notification triggering with invalid params";
                    }
                    c3053n10.b("l1", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
                    return "notification triggering with invalid params";
                }
                C3053n9 c3053n11 = this.f25115b;
                if (c3053n11 == null) {
                    return "no win/loss notification url";
                }
                c3053n11.b("l1", "Loss beacon URLs not found or empty");
                return "no win/loss notification url";
            } catch (Exception e10) {
                C3053n9 c3053n12 = this.f25115b;
                if (c3053n12 == null) {
                    return "loss notification failed internally";
                }
                c3053n12.a("l1", "Exception in notifyLoss", e10);
                return "loss notification failed internally";
            }
        }
        C3053n9 c3053n13 = this.f25115b;
        if (c3053n13 == null) {
            return "win/loss notification already triggered";
        }
        c3053n13.b("l1", "Win/Loss notification already triggered");
        return "win/loss notification already triggered";
    }
}

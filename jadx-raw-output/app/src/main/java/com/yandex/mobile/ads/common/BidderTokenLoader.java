package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdSize;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.d;
import nk.j;
import nk.j2;
import nk.l0;
import nk.w0;
import yads.bt2;
import yads.dp;
import yads.e00;
import yads.it2;
import yads.iu3;
import yads.jt2;
import yads.km0;
import yads.lm0;
import yads.m43;
import yads.n43;
import yads.na2;
import yads.rd;
import yads.w5;
import yads.wq3;
import yads.y10;
import yads.zu2;

/* JADX INFO: loaded from: classes11.dex */
public final class BidderTokenLoader {
    public static final void loadBidderToken(Context context, BidderTokenRequestConfiguration bidderTokenRequestConfiguration, BidderTokenLoadListener bidderTokenLoadListener) {
        e00 e00Var;
        BannerAdSize bannerAdSize;
        iu3 iu3Var = new iu3(context);
        wq3 wq3Var = new wq3(bidderTokenLoadListener);
        boolean z10 = bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Banner;
        if (z10) {
            e00Var = e00.f76859d;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Interstitial) {
            e00Var = e00.f76860e;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Rewarded) {
            e00Var = e00.f76861f;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Native) {
            e00Var = e00.f76862g;
        } else {
            if (!(bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.AppOpenAd)) {
                throw new NoWhenBranchMatchedException();
            }
            e00Var = e00.f76864i;
        }
        dp dpVar = new dp(e00Var, (!z10 || (bannerAdSize = bidderTokenRequestConfiguration.getBannerAdSize()) == null) ? null : com.yandex.mobile.ads.banner.a.a(bannerAdSize).f75579a, bidderTokenRequestConfiguration.getParameters());
        l0 l0VarA = d.a(j2.b(null, 1, null).plus(w0.b()).plus(new y10(iu3Var.a())));
        Context applicationContext = context.getApplicationContext();
        w5 w5Var = new w5();
        lm0 lm0Var = lm0.f79847c;
        lm0 lm0VarA = km0.a(applicationContext);
        rd rdVar = new rd();
        zu2 zu2Var = new zu2(applicationContext, iu3Var, l0VarA, w5Var, lm0VarA, rdVar, 2097088);
        n43 n43Var = n43.f80556b;
        j.d(l0VarA, null, null, new it2(new jt2(l0VarA, applicationContext, w5Var, lm0VarA, rdVar, zu2Var, m43.a(), new bt2(w5Var), new na2(w5Var, iu3Var.a())), dpVar, wq3Var, null), 3, null);
    }
}

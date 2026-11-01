package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.authoritycontroller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.middle.b;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class BidManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f35793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BidListennning f35794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35795c;

    public BidManager(String str, String str2) {
        this(str, str2, "0");
    }

    public static String getBuyerUid(Context context) {
        if (com.mbridge.msdk.util.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                q0.b("BidManager", th2.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, "");
    }

    public BidManager(String str, String str2, String str3) {
        this.f35795c = false;
        this.f35793a = new b(str, str2, str3);
    }

    private void a(String str) {
        BidListennning bidListennning = this.f35794b;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    public void bid() {
        b bVar = this.f35793a;
        if (bVar != null) {
            bVar.a(this.f35795c);
        } else {
            a("you need init the class :BidManager");
        }
    }

    public void setBidListener(BidListennning bidListennning) {
        this.f35794b = bidListennning;
        b bVar = this.f35793a;
        if (bVar != null) {
            bVar.a(bidListennning);
        }
    }

    public void setRewardPlus(boolean z10) {
        this.f35795c = z10;
    }

    public <T extends CommonBidRequestParams> BidManager(T t10) {
        this(t10 == null ? "" : t10.getmPlacementId(), t10 == null ? "" : t10.getmUnitId(), t10 != null ? t10.getmFloorPrice() : "");
        if (t10 instanceof BannerBidRequestParams) {
            BannerBidRequestParams bannerBidRequestParams = (BannerBidRequestParams) t10;
            this.f35793a.a(bannerBidRequestParams.getHeight());
            this.f35793a.b(bannerBidRequestParams.getWidth());
            this.f35793a.a(296);
            if (t10 instanceof SplashBidRequestParams) {
                SplashBidRequestParams splashBidRequestParams = (SplashBidRequestParams) t10;
                this.f35793a.b(splashBidRequestParams.a());
                this.f35793a.b(splashBidRequestParams.getOrientation());
                this.f35793a.a(297);
                return;
            }
            return;
        }
        if (t10 instanceof AdvancedNativeBidRequestParams) {
            AdvancedNativeBidRequestParams advancedNativeBidRequestParams = (AdvancedNativeBidRequestParams) t10;
            this.f35793a.a(advancedNativeBidRequestParams.getHeight());
            this.f35793a.b(advancedNativeBidRequestParams.getWidth());
            this.f35793a.a(298);
        }
    }

    public static String getBuyerUid(Context context, String str) {
        if (com.mbridge.msdk.util.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                q0.b("BidManager", th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, str);
    }

    public static String getBuyerUid(Context context, Map<String, String> map) {
        if (com.mbridge.msdk.util.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                q0.b("BidManager", th2.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, map);
    }
}

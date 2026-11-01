package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* JADX INFO: loaded from: classes2.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public String f35796ln;
    private String price;

    /* JADX INFO: renamed from: wn, reason: collision with root package name */
    public String f35797wn;

    public String getBidId() {
        return this.bidId;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCur() {
        return this.cur;
    }

    public String getLn() {
        return this.f35796ln;
    }

    public String getPrice() {
        return this.price;
    }

    public String getWn() {
        return this.f35797wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (TextUtils.isEmpty(this.f35796ln) || context == null || bidLossCode == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(this.f35796ln);
        if (this.f35796ln.contains("?")) {
            sb2.append(C3426d4.j.f28584c);
        } else {
            sb2.append("?");
        }
        sb2.append("reason=");
        sb2.append(bidLossCode.getCurrentCode());
        a.a(context, (CampaignEx) null, "", sb2.toString(), false, false);
    }

    public void sendWinNotice(Context context) {
        if (TextUtils.isEmpty(this.f35797wn) || context == null) {
            return;
        }
        a.a(context, (CampaignEx) null, "", this.f35797wn, false, false);
    }

    public void setBidId(String str) {
        this.bidId = str;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCur(String str) {
        this.cur = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }
}

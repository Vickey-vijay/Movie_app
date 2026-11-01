package com.ironsource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class R1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f27526a;

    public void a(@Nullable Double d10) {
        HashMap map;
        if (d10 != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10);
        } else {
            map = null;
        }
        this.f27526a.a(B0.AUCTION_REQUEST, map);
    }

    public void b(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f27526a.a(B0.AUCTION_REQUEST_WATERFALL, map);
    }

    public void c(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f27526a.a(B0.AUCTION_RESULT_WATERFALL, map);
    }

    public R1(E0 e10) {
        this.f27526a = e10;
    }

    public String a(int i10, int i11, int i12, int i13) {
        return "interstitial=" + i10 + ";rewarded=" + i11 + ";banner=" + i12 + ";native=" + i13;
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f27526a.a(B0.AUCTION_FAILED, map);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f27526a.a(B0.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j10, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f27526a.a(B0.AUCTION_SUCCESS, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        map.put("auctionId", str);
        this.f27526a.a(B0.AD_FORMAT_CAPPED, map);
    }
}

package com.ironsource.mediationsdk.adunit.adapter.utility;

import ck.p;
import com.ironsource.Bb;
import com.ironsource.C3676r4;
import com.ironsource.Z8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class AdInfo {
    private final Z8 impressionData;
    private final Bb loadArmData;

    public final String getAb() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.a() == null) ? "" : this.impressionData.a();
    }

    public final String getAdNetwork() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.c() == null) ? "" : this.impressionData.c();
    }

    public final String getAuctionId() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.e() == null) ? "" : this.impressionData.e();
    }

    public final String getCountry() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.f() == null) ? "" : this.impressionData.f();
    }

    public final String getEncryptedCPM() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.h() == null) ? "" : this.impressionData.h();
    }

    public final String getInstanceId() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.i() == null) ? "" : this.impressionData.i();
    }

    public final String getInstanceName() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.j() == null) ? "" : this.impressionData.j();
    }

    public final String getPrecision() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.c();
        }
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.d();
        }
        Z8 z10 = this.impressionData;
        if (z10 == null) {
            return 0.0d;
        }
        z10.o();
        return this.impressionData.o();
    }

    public final String getSegmentName() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.p() == null) ? "" : this.impressionData.p();
    }

    public AdInfo(Z8 z10, Bb bb2) {
        this.impressionData = z10;
        this.loadArmData = bb2;
    }

    public String toString() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("auctionId", getAuctionId());
            jSONObjectJsonObjectInit.put("country", getCountry());
            jSONObjectJsonObjectInit.put("ab", getAb());
            jSONObjectJsonObjectInit.put("segmentName", getSegmentName());
            jSONObjectJsonObjectInit.put("adNetwork", getAdNetwork());
            jSONObjectJsonObjectInit.put("instanceName", getInstanceName());
            jSONObjectJsonObjectInit.put("instanceId", getInstanceId());
            jSONObjectJsonObjectInit.put("revenue", getRevenue());
            jSONObjectJsonObjectInit.put("precision", getPrecision());
            jSONObjectJsonObjectInit.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("error while parsing ad info " + e10.getMessage());
        }
        String string = jSONObjectJsonObjectInit.toString();
        p.i(string, "adInfoData.toString()");
        return string;
    }
}

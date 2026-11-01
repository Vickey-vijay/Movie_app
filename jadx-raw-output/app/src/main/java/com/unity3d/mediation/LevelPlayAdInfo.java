package com.unity3d.mediation;

import ck.i;
import ck.p;
import com.ironsource.Bb;
import com.ironsource.C3605n2;
import com.ironsource.C3676r4;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import java.util.Iterator;
import java.util.Map;
import kk.r;
import kotlin.sequences.SequencesKt___SequencesKt;
import lk.x;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class LevelPlayAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3605n2 f45305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LevelPlayAdSize f45306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f45307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f45308g;

    public LevelPlayAdInfo(String str, String str2, String str3, C3605n2 c3605n2, LevelPlayAdSize levelPlayAdSize, String str4, Map<String, ? extends Object> map) {
        p.j(str, f.b.f30919c);
        p.j(str2, "adUnitId");
        p.j(str3, "adFormat");
        p.j(map, "adapterData");
        this.f45302a = str;
        this.f45303b = str2;
        this.f45304c = str3;
        this.f45305d = c3605n2;
        this.f45306e = levelPlayAdSize;
        this.f45307f = str4;
        this.f45308g = map;
    }

    private final String a() {
        return this.f45302a;
    }

    private final String b() {
        return this.f45303b;
    }

    private final String c() {
        return this.f45304c;
    }

    private final LevelPlayAdSize e() {
        return this.f45306e;
    }

    private final String f() {
        return this.f45307f;
    }

    private final Map<String, Object> g() {
        return this.f45308g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return p.e(this.f45302a, levelPlayAdInfo.f45302a) && p.e(this.f45303b, levelPlayAdInfo.f45303b) && p.e(this.f45304c, levelPlayAdInfo.f45304c) && p.e(this.f45305d, levelPlayAdInfo.f45305d) && p.e(this.f45306e, levelPlayAdInfo.f45306e) && p.e(this.f45307f, levelPlayAdInfo.f45307f) && p.e(this.f45308g, levelPlayAdInfo.f45308g);
    }

    public int hashCode() {
        int iHashCode = ((((this.f45302a.hashCode() * 31) + this.f45303b.hashCode()) * 31) + this.f45304c.hashCode()) * 31;
        C3605n2 c3605n2 = this.f45305d;
        int iHashCode2 = (iHashCode + (c3605n2 == null ? 0 : c3605n2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f45306e;
        int iHashCode3 = (iHashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f45307f;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f45308g.hashCode();
    }

    private final /* synthetic */ <T> T a(String str) {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        T t10 = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : (T) jSONObjectM.opt(str);
        p.p(2, "T");
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C3605n2 c3605n2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = levelPlayAdInfo.f45302a;
        }
        if ((i10 & 2) != 0) {
            str2 = levelPlayAdInfo.f45303b;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = levelPlayAdInfo.f45304c;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            c3605n2 = levelPlayAdInfo.f45305d;
        }
        C3605n2 c3605n3 = c3605n2;
        if ((i10 & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f45306e;
        }
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        if ((i10 & 32) != 0) {
            str4 = levelPlayAdInfo.f45307f;
        }
        String str7 = str4;
        if ((i10 & 64) != 0) {
            map = levelPlayAdInfo.f45308g;
        }
        return levelPlayAdInfo.copy(str, str5, str6, c3605n3, levelPlayAdSize2, str7, map);
    }

    private final C3605n2 d() {
        return this.f45305d;
    }

    public final LevelPlayAdInfo copy(String str, String str2, String str3, C3605n2 c3605n2, LevelPlayAdSize levelPlayAdSize, String str4, Map<String, ? extends Object> map) {
        p.j(str, f.b.f30919c);
        p.j(str2, "adUnitId");
        p.j(str3, "adFormat");
        p.j(map, "adapterData");
        return new LevelPlayAdInfo(str, str2, str3, c3605n2, levelPlayAdSize, str4, map);
    }

    public final String getAb() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("ab");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getAdFormat() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("adFormat");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f45304c : str;
    }

    public final String getAdId() {
        return this.f45302a;
    }

    public final String getAdNetwork() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("adNetwork");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f45306e;
    }

    public final String getAdUnitId() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f45303b : str;
    }

    public final String getAdUnitName() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getAuctionId() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("auctionId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getCountry() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("country");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getCreativeId() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("creativeId");
        if (!(objOpt instanceof String)) {
            objOpt = null;
        }
        String str = (String) objOpt;
        if (str != null) {
            return str;
        }
        Object obj = this.f45308g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    public final String getEncryptedCPM() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("encryptedCPM");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("precision");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Double dValueOf = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : Double.valueOf(jSONObjectM.optDouble("revenue"));
        if (p.a(dValueOf, Double.NaN) || dValueOf == null) {
            return 0.0d;
        }
        return dValueOf.doubleValue();
    }

    public final String getInstanceId() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("instanceId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getInstanceName() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("instanceName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getPlacementName() {
        String str = this.f45307f;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        Bb bbD;
        String strC;
        C3605n2 c3605n2 = this.f45305d;
        return (c3605n2 == null || (bbD = c3605n2.d()) == null || (strC = bbD.c()) == null) ? getImpressionPrecision$mediationsdk_release() : strC;
    }

    public final double getRevenue() {
        Bb bbD;
        C3605n2 c3605n2 = this.f45305d;
        return (c3605n2 == null || (bbD = c3605n2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : bbD.d();
    }

    public final String getSegmentName() {
        JSONObject jSONObjectM;
        C3605n2 c3605n2 = this.f45305d;
        Object objOpt = (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) ? null : jSONObjectM.opt("segmentName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0033 -> B:24:0x0046). Please report as a decompilation issue!!! */
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectM;
        try {
            C3605n2 c3605n2 = this.f45305d;
            if (c3605n2 == null || (jSONObjectM = c3605n2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> itKeys = jSONObjectM.keys();
                p.i(itKeys, "it.keys()");
                jSONObject = new JSONObject(jSONObjectM, (String[]) SequencesKt___SequencesKt.T(r.g(itKeys)).toArray(new String[0]));
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e10);
            C3676r4.d().a(e10);
            jSONObject = new JSONObject();
        }
        try {
            String strOptString = jSONObject.optString("placement");
            p.i(strOptString, "placement");
            if (strOptString.length() > 0 && (str = this.f45307f) != null) {
                jSONObject.put("placement", x.N(strOptString, d.f29606r, str, false, 4, null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e11) {
            IronLog.INTERNAL.error("failed to put impression values", e11);
            C3676r4.d().a(e11);
        }
        return jSONObject;
    }

    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f45306e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C3605n2 c3605n2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, i iVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : c3605n2, (i10 & 16) != 0 ? null : levelPlayAdSize, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? kotlin.collections.a.j() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(LevelPlayAdInfo levelPlayAdInfo, String str) {
        this(levelPlayAdInfo.f45302a, levelPlayAdInfo.f45303b, levelPlayAdInfo.f45304c, levelPlayAdInfo.f45305d, levelPlayAdInfo.f45306e, str, levelPlayAdInfo.f45308g);
        p.j(levelPlayAdInfo, "adInfo");
    }
}

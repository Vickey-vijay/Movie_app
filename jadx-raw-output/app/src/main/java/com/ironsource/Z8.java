package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Z8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28007c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28008d = "auctionId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28009e = "adUnit";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f28010f = "adFormat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f28011g = "mediationAdUnitName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28012h = "mediationAdUnitId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f28013i = "country";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f28014j = "ab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f28015k = "segmentName";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f28016l = "placement";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f28017m = "adNetwork";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f28018n = "instanceName";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f28019o = "instanceId";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f28020p = "revenue";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f28021q = "precision";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f28022r = "encryptedCPM";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f28023s = "creativeId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlayAdInfo f28024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DecimalFormat f28025b;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public Z8(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f28024a = levelPlayAdInfo;
        this.f28025b = new DecimalFormat("#.#####");
    }

    public final String a() {
        return this.f28024a.getAb();
    }

    public final String b() {
        return this.f28024a.getAdFormat();
    }

    public final String c() {
        return this.f28024a.getAdNetwork();
    }

    public final JSONObject d() {
        return this.f28024a.impressionData$mediationsdk_release();
    }

    public final String e() {
        return this.f28024a.getAuctionId();
    }

    public final String f() {
        return this.f28024a.getCountry();
    }

    public final String g() {
        return this.f28024a.getCreativeId();
    }

    public final String h() {
        return this.f28024a.getEncryptedCPM();
    }

    public final String i() {
        return this.f28024a.getInstanceId();
    }

    public final String j() {
        return this.f28024a.getInstanceName();
    }

    public final String k() {
        return this.f28024a.getAdUnitId();
    }

    public final String l() {
        return this.f28024a.getAdUnitName();
    }

    public final String m() {
        return this.f28024a.getPlacementName();
    }

    public final String n() {
        return this.f28024a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.f28024a.getImpressionRevenue$mediationsdk_release();
    }

    public final String p() {
        return this.f28024a.getSegmentName();
    }

    public String toString() {
        String strE = e();
        String strL = l();
        String strK = k();
        String strB = b();
        String strF = f();
        String strA = a();
        String strP = p();
        String strM = m();
        String strC = c();
        String strJ = j();
        String strI = i();
        o();
        return "auctionId: '" + strE + "', mediationAdUnitName: '" + strL + "', mediationAdUnitId: '" + strK + "', adFormat: '" + strB + "', country: '" + strF + "', ab: '" + strA + "', segmentName: '" + strP + "', placement: '" + strM + "', adNetwork: '" + strC + "', instanceName: '" + strJ + "', instanceId: '" + strI + "', revenue: " + this.f28025b.format(o()) + ", precision: '" + n() + "', encryptedCPM: '" + h() + "', creativeId: '" + g() + "'";
    }
}

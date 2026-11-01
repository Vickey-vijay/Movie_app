package com.unity3d.mediation.impression;

import ck.i;
import ck.p;
import java.text.DecimalFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class LevelPlayImpressionData {
    public static final a Companion = new a(null);
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f45340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DecimalFormat f45341b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(JSONObject jSONObject) {
        p.j(jSONObject, "allData");
        this.f45340a = jSONObject;
        this.f45341b = new DecimalFormat("#.#####");
    }

    public final String getAb() {
        String strOptString = this.f45340a.optString("ab", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getAdFormat() {
        String strOptString = this.f45340a.optString("adFormat", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getAdNetwork() {
        String strOptString = this.f45340a.optString("adNetwork", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final JSONObject getAllData() {
        return this.f45340a;
    }

    public final String getAuctionId() {
        String strOptString = this.f45340a.optString("auctionId", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getCountry() {
        String strOptString = this.f45340a.optString("country", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getCreativeId() {
        String strOptString = this.f45340a.optString("creativeId", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getEncryptedCPM() {
        String strOptString = this.f45340a.optString("encryptedCPM", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getInstanceId() {
        String strOptString = this.f45340a.optString("instanceId", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getInstanceName() {
        String strOptString = this.f45340a.optString("instanceName", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getMediationAdUnitId() {
        String strOptString = this.f45340a.optString("mediationAdUnitId", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getMediationAdUnitName() {
        String strOptString = this.f45340a.optString("mediationAdUnitName", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getPlacement() {
        String strOptString = this.f45340a.optString("placement", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String getPrecision() {
        String strOptString = this.f45340a.optString("precision", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final Double getRevenue() {
        Double dValueOf = Double.valueOf(this.f45340a.optDouble("revenue"));
        if (Double.isNaN(dValueOf.doubleValue())) {
            return null;
        }
        return dValueOf;
    }

    public final String getSegmentName() {
        String strOptString = this.f45340a.optString("segmentName", "");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public String toString() {
        String str;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab2 = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            str = null;
        } else {
            str = this.f45341b.format(getRevenue());
        }
        return "auctionId: '" + auctionId + "', mediationAdUnitName: '" + mediationAdUnitName + "', mediationAdUnitId: '" + mediationAdUnitId + "', adFormat: '" + adFormat + "', country: '" + country + "', ab: '" + ab2 + "', segmentName: '" + segmentName + "', placement: '" + placement + "', adNetwork: '" + adNetwork + "', instanceName: '" + instanceName + "', instanceId: '" + instanceId + "', revenue: " + str + ", precision: '" + getPrecision() + "', encryptedCPM: '" + getEncryptedCPM() + "', creativeId: '" + getCreativeId() + "'";
    }
}

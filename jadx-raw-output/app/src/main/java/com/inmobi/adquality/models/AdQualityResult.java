package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import ck.i;
import ck.p;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class AdQualityResult {
    private final String beaconUrl;
    private String extras;
    private String imageLocation;
    private String sdkModelResult;

    public AdQualityResult(String str, String str2, String str3, String str4) {
        p.j(str, "imageLocation");
        p.j(str3, "beaconUrl");
        this.imageLocation = str;
        this.sdkModelResult = str2;
        this.beaconUrl = str3;
        this.extras = str4;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i10 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.imageLocation;
    }

    public final String component2() {
        return this.sdkModelResult;
    }

    public final String component3() {
        return this.beaconUrl;
    }

    public final String component4() {
        return this.extras;
    }

    public final AdQualityResult copy(String str, String str2, String str3, String str4) {
        p.j(str, "imageLocation");
        p.j(str3, "beaconUrl");
        return new AdQualityResult(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) obj;
        return p.e(this.imageLocation, adQualityResult.imageLocation) && p.e(this.sdkModelResult, adQualityResult.sdkModelResult) && p.e(this.beaconUrl, adQualityResult.beaconUrl) && p.e(this.extras, adQualityResult.extras);
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iHashCode2 = (this.beaconUrl.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.extras;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AdQualityResult(imageLocation=" + this.imageLocation + ", sdkModelResult=" + this.sdkModelResult + ", beaconUrl=" + this.beaconUrl + ", extras=" + this.extras + ")";
    }

    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    public final String getExtras() {
        return this.extras;
    }

    public final String getImageLocation() {
        return this.imageLocation;
    }

    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public final void setExtras(String str) {
        this.extras = str;
    }

    public final void setImageLocation(String str) {
        p.j(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(String str) {
        this.sdkModelResult = str;
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i10, i iVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}

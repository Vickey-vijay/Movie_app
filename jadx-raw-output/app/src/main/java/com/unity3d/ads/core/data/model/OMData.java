package com.unity3d.ads.core.data.model;

import ck.p;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: OMData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OMData {
    private final String partnerName;
    private final String partnerVersion;
    private final String version;

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oMData.version;
        }
        if ((i10 & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i10 & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.partnerName;
    }

    public final String component3() {
        return this.partnerVersion;
    }

    public final OMData copy(String str, String str2, String str3) {
        p.j(str, "version");
        p.j(str2, HandleInvocationsFromAdViewer.KEY_OM_PARTNER);
        p.j(str3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION);
        return new OMData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) obj;
        return p.e(this.version, oMData.version) && p.e(this.partnerName, oMData.partnerName) && p.e(this.partnerVersion, oMData.partnerVersion);
    }

    public int hashCode() {
        return (((this.version.hashCode() * 31) + this.partnerName.hashCode()) * 31) + this.partnerVersion.hashCode();
    }

    public String toString() {
        return "OMData(version=" + this.version + ", partnerName=" + this.partnerName + ", partnerVersion=" + this.partnerVersion + ')';
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public OMData(String str, String str2, String str3) {
        p.j(str, "version");
        p.j(str2, HandleInvocationsFromAdViewer.KEY_OM_PARTNER);
        p.j(str3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION);
        this.version = str;
        this.partnerName = str2;
        this.partnerVersion = str3;
    }
}

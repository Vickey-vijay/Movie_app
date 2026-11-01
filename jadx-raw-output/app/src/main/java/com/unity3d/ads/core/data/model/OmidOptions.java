package com.unity3d.ads.core.data.model;

import ck.i;
import ck.p;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;

/* JADX INFO: compiled from: OmidOptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OmidOptions {
    private final CreativeType creativeType;
    private final String customReferenceData;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;
    private final Owner videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public OmidOptions(boolean z10, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3) {
        this.isolateVerificationScripts = z10;
        this.impressionOwner = owner;
        this.videoEventsOwner = owner2;
        this.customReferenceData = str;
        this.impressionType = impressionType;
        this.creativeType = creativeType;
        this.mediaEventsOwner = owner3;
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z10, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = omidOptions.isolateVerificationScripts;
        }
        if ((i10 & 2) != 0) {
            owner = omidOptions.impressionOwner;
        }
        Owner owner4 = owner;
        if ((i10 & 4) != 0) {
            owner2 = omidOptions.videoEventsOwner;
        }
        Owner owner5 = owner2;
        if ((i10 & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            impressionType = omidOptions.impressionType;
        }
        ImpressionType impressionType2 = impressionType;
        if ((i10 & 32) != 0) {
            creativeType = omidOptions.creativeType;
        }
        CreativeType creativeType2 = creativeType;
        if ((i10 & 64) != 0) {
            owner3 = omidOptions.mediaEventsOwner;
        }
        return omidOptions.copy(z10, owner4, owner5, str2, impressionType2, creativeType2, owner3);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    public final Owner component2() {
        return this.impressionOwner;
    }

    public final Owner component3() {
        return this.videoEventsOwner;
    }

    public final String component4() {
        return this.customReferenceData;
    }

    public final ImpressionType component5() {
        return this.impressionType;
    }

    public final CreativeType component6() {
        return this.creativeType;
    }

    public final Owner component7() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean z10, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3) {
        return new OmidOptions(z10, owner, owner2, str, impressionType, creativeType, owner3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && p.e(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z10 = this.isolateVerificationScripts;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        Owner owner = this.impressionOwner;
        int iHashCode = (i10 + (owner == null ? 0 : owner.hashCode())) * 31;
        Owner owner2 = this.videoEventsOwner;
        int iHashCode2 = (iHashCode + (owner2 == null ? 0 : owner2.hashCode())) * 31;
        String str = this.customReferenceData;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ImpressionType impressionType = this.impressionType;
        int iHashCode4 = (iHashCode3 + (impressionType == null ? 0 : impressionType.hashCode())) * 31;
        CreativeType creativeType = this.creativeType;
        int iHashCode5 = (iHashCode4 + (creativeType == null ? 0 : creativeType.hashCode())) * 31;
        Owner owner3 = this.mediaEventsOwner;
        return iHashCode5 + (owner3 != null ? owner3.hashCode() : 0);
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final Owner getImpressionOwner() {
        return this.impressionOwner;
    }

    public final ImpressionType getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final Owner getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final Owner getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    public /* synthetic */ OmidOptions(boolean z10, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i10, i iVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : owner, (i10 & 4) != 0 ? null : owner2, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : impressionType, (i10 & 32) != 0 ? null : creativeType, (i10 & 64) == 0 ? owner3 : null);
    }
}

package com.unity3d.ads.core.domain.offerwall;

import ck.i;
import ck.p;
import com.unity3d.services.ads.offerwall.OfferwallEvent;

/* JADX INFO: compiled from: OfferwallEventData.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class OfferwallEventData {
    private final Integer errorCode;
    private final String errorMessage;
    private final OfferwallEvent offerwallEvent;
    private final String placementName;

    public OfferwallEventData(OfferwallEvent offerwallEvent, String str, String str2, Integer num) {
        p.j(offerwallEvent, "offerwallEvent");
        this.offerwallEvent = offerwallEvent;
        this.placementName = str;
        this.errorMessage = str2;
        this.errorCode = num;
    }

    public static /* synthetic */ OfferwallEventData copy$default(OfferwallEventData offerwallEventData, OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offerwallEvent = offerwallEventData.offerwallEvent;
        }
        if ((i10 & 2) != 0) {
            str = offerwallEventData.placementName;
        }
        if ((i10 & 4) != 0) {
            str2 = offerwallEventData.errorMessage;
        }
        if ((i10 & 8) != 0) {
            num = offerwallEventData.errorCode;
        }
        return offerwallEventData.copy(offerwallEvent, str, str2, num);
    }

    public final OfferwallEvent component1() {
        return this.offerwallEvent;
    }

    public final String component2() {
        return this.placementName;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final Integer component4() {
        return this.errorCode;
    }

    public final OfferwallEventData copy(OfferwallEvent offerwallEvent, String str, String str2, Integer num) {
        p.j(offerwallEvent, "offerwallEvent");
        return new OfferwallEventData(offerwallEvent, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferwallEventData)) {
            return false;
        }
        OfferwallEventData offerwallEventData = (OfferwallEventData) obj;
        return this.offerwallEvent == offerwallEventData.offerwallEvent && p.e(this.placementName, offerwallEventData.placementName) && p.e(this.errorMessage, offerwallEventData.errorMessage) && p.e(this.errorCode, offerwallEventData.errorCode);
    }

    public int hashCode() {
        int iHashCode = this.offerwallEvent.hashCode() * 31;
        String str = this.placementName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "OfferwallEventData(offerwallEvent=" + this.offerwallEvent + ", placementName=" + this.placementName + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    public final String getPlacementName() {
        return this.placementName;
    }

    public /* synthetic */ OfferwallEventData(OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i10, i iVar) {
        this(offerwallEvent, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }
}

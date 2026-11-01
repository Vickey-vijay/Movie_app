package com.unity3d.ads.core.data.model;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import mk.b;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: AdObject.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private l<AdObjectState> state;
    private ByteString trackingToken;
    private l<b> ttl;

    public AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, l<b> lVar, l<AdObjectState> lVar2) {
        p.j(byteString, "opportunityId");
        p.j(str, "placementId");
        p.j(byteString2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        p.j(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        p.j(diagnosticAdType, "adType");
        p.j(lVar, "ttl");
        p.j(lVar2, "state");
        this.opportunityId = byteString;
        this.placementId = str;
        this.trackingToken = byteString2;
        this.isScarAd = z10;
        this.scarQueryId = str2;
        this.scarAdUnitId = str3;
        this.scarAdString = str4;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str5;
        this.adPlayer = adPlayer;
        this.playerServerId = str6;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = z12;
        this.adType = diagnosticAdType;
        this.ttl = lVar;
        this.state = lVar2;
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final AdPlayer component10() {
        return this.adPlayer;
    }

    public final String component11() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    public final l<b> component15() {
        return this.ttl;
    }

    public final l<AdObjectState> component16() {
        return this.state;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    public final String component9() {
        return this.offerwallPlacementName;
    }

    public final AdObject copy(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, l<b> lVar, l<AdObjectState> lVar2) {
        p.j(byteString, "opportunityId");
        p.j(str, "placementId");
        p.j(byteString2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        p.j(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        p.j(diagnosticAdType, "adType");
        p.j(lVar, "ttl");
        p.j(lVar2, "state");
        return new AdObject(byteString, str, byteString2, z10, str2, str3, str4, z11, str5, adPlayer, str6, unityAdsLoadOptions, z12, diagnosticAdType, lVar, lVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return p.e(this.opportunityId, adObject.opportunityId) && p.e(this.placementId, adObject.placementId) && p.e(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && p.e(this.scarQueryId, adObject.scarQueryId) && p.e(this.scarAdUnitId, adObject.scarAdUnitId) && p.e(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && p.e(this.offerwallPlacementName, adObject.offerwallPlacementName) && p.e(this.adPlayer, adObject.adPlayer) && p.e(this.playerServerId, adObject.playerServerId) && p.e(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && p.e(this.ttl, adObject.ttl) && p.e(this.state, adObject.state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z10 = this.isScarAd;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode4 + r11) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z12 = this.isHeaderBidding;
        return ((((((iHashCode7 + (z12 ? 1 : z12)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final l<AdObjectState> getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final l<b> getTtl() {
        return this.ttl;
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z10) {
        this.isOfferwallAd = z10;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setState(l<AdObjectState> lVar) {
        p.j(lVar, "<set-?>");
        this.state = lVar;
    }

    public final void setTrackingToken(ByteString byteString) {
        p.j(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(l<b> lVar) {
        p.j(lVar, "<set-?>");
        this.ttl = lVar;
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, l lVar, l lVar2, int i10, i iVar) {
        this(byteString, str, byteString2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : adPlayer, (i10 & 1024) != 0 ? null : str6, unityAdsLoadOptions, z12, diagnosticAdType, (i10 & 16384) != 0 ? v.a(null) : lVar, (i10 & 32768) != 0 ? v.a(AdObjectState.INIT) : lVar2);
    }
}

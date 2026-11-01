package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import ck.i;
import ck.p;
import com.inmobi.media.A8;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class InlineParams {

    @A8
    private String callerBundleId;
    private final String listing;
    private final boolean overlay;

    @A8
    private boolean pingInWebView;
    private final String referrer;

    @A8
    private String targetBundleId;
    private final String url;

    public InlineParams() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public static /* synthetic */ InlineParams copy$default(InlineParams inlineParams, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inlineParams.url;
        }
        if ((i10 & 2) != 0) {
            str2 = inlineParams.referrer;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = inlineParams.listing;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            z10 = inlineParams.overlay;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            str4 = inlineParams.callerBundleId;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = inlineParams.targetBundleId;
        }
        String str9 = str5;
        if ((i10 & 64) != 0) {
            z11 = inlineParams.pingInWebView;
        }
        return inlineParams.copy(str, str6, str7, z12, str8, str9, z11);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.referrer;
    }

    public final String component3() {
        return this.listing;
    }

    public final boolean component4() {
        return this.overlay;
    }

    public final String component5() {
        return this.callerBundleId;
    }

    public final String component6() {
        return this.targetBundleId;
    }

    public final boolean component7() {
        return this.pingInWebView;
    }

    public final InlineParams copy(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11) {
        p.j(str, "url");
        return new InlineParams(str, str2, str3, z10, str4, str5, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineParams)) {
            return false;
        }
        InlineParams inlineParams = (InlineParams) obj;
        return p.e(this.url, inlineParams.url) && p.e(this.referrer, inlineParams.referrer) && p.e(this.listing, inlineParams.listing) && this.overlay == inlineParams.overlay && p.e(this.callerBundleId, inlineParams.callerBundleId) && p.e(this.targetBundleId, inlineParams.targetBundleId) && this.pingInWebView == inlineParams.pingInWebView;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.referrer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.listing;
        int iHashCode3 = (Boolean.hashCode(this.overlay) + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.callerBundleId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetBundleId;
        return Boolean.hashCode(this.pingInWebView) + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "InlineParams(url=" + this.url + ", referrer=" + this.referrer + ", listing=" + this.listing + ", overlay=" + this.overlay + ", callerBundleId=" + this.callerBundleId + ", targetBundleId=" + this.targetBundleId + ", pingInWebView=" + this.pingInWebView + ")";
    }

    public InlineParams(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11) {
        p.j(str, "url");
        this.url = str;
        this.referrer = str2;
        this.listing = str3;
        this.overlay = z10;
        this.callerBundleId = str4;
        this.targetBundleId = str5;
        this.pingInWebView = z11;
    }

    public final String getCallerBundleId() {
        return this.callerBundleId;
    }

    public final String getListing() {
        return this.listing;
    }

    public final boolean getOverlay() {
        return this.overlay;
    }

    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setCallerBundleId(String str) {
        this.callerBundleId = str;
    }

    public final void setPingInWebView(boolean z10) {
        this.pingInWebView = z10;
    }

    public final void setTargetBundleId(String str) {
        this.targetBundleId = str;
    }

    public /* synthetic */ InlineParams(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, i iVar) {
        this((i10 & 1) != 0 ? "https://play.google.com/d?" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) == 0 ? str5 : null, (i10 & 64) != 0 ? false : z11);
    }
}

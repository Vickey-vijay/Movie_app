package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import ck.p;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class HtmlOmidTracker {
    private String verificationParams;
    private String vendor = "";
    private String url = "";

    public final String getUrl() {
        return this.url;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final String getVerificationParams() {
        return this.verificationParams;
    }

    public final void setUrl(String str) {
        p.j(str, "<set-?>");
        this.url = str;
    }

    public final void setVendor(String str) {
        p.j(str, "<set-?>");
        this.vendor = str;
    }

    public final void setVerificationParams(String str) {
        this.verificationParams = str;
    }
}

package com.safedk.android.analytics.brandsafety.creatives;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class VastAdTagUri implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43945b = "VastAdTagUri";
    private static final long serialVersionUID = 2423634386629424135L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f43946a;

    public VastAdTagUri(String uri) {
        this.f43946a = uri;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrefetchVastAdTagUri) {
            return obj.equals(this.f43946a);
        }
        return (this.f43946a == null || obj == null || !this.f43946a.equals(obj.toString())) ? false : true;
    }

    public int hashCode() {
        int iIndexOf;
        if (this.f43946a == null || (iIndexOf = this.f43946a.indexOf("//")) < 0) {
            return 0;
        }
        int iIndexOf2 = this.f43946a.indexOf("/", iIndexOf + 2);
        if (iIndexOf2 < 0) {
            iIndexOf2 = this.f43946a.length();
        }
        return this.f43946a.substring(iIndexOf + 2, iIndexOf2).hashCode();
    }

    public String toString() {
        return this.f43946a;
    }
}

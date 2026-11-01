package com.unity3d.ads.core.data.model;

import ck.p;
import java.util.List;

/* JADX INFO: compiled from: WebViewConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final String type;
    private final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i11 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i10, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final String component4() {
        return this.type;
    }

    public final WebViewConfiguration copy(int i10, String str, List<String> list, String str2) {
        p.j(str, "entryPoint");
        p.j(list, "additionalFiles");
        p.j(str2, "type");
        return new WebViewConfiguration(i10, str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && p.e(this.entryPoint, webViewConfiguration.entryPoint) && p.e(this.additionalFiles, webViewConfiguration.additionalFiles) && p.e(this.type, webViewConfiguration.type);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.version) * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ", type=" + this.type + ')';
    }

    public WebViewConfiguration(int i10, String str, List<String> list, String str2) {
        p.j(str, "entryPoint");
        p.j(list, "additionalFiles");
        p.j(str2, "type");
        this.version = i10;
        this.entryPoint = str;
        this.additionalFiles = list;
        this.type = str2;
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }
}

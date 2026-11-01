package com.vungle.ads.internal.network;

import android.os.Build;
import ck.p;
import com.vungle.ads.BuildConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: VungleHeader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/network/VungleHeader;", "", "", "defaultHeader", "Lmj/r;", "reset", "headerUa", "Ljava/lang/String;", "getHeaderUa", "()Ljava/lang/String;", "setHeaderUa", "(Ljava/lang/String;)V", "appId", "getAppId", "setAppId", "appVersion", "getAppVersion", "setAppVersion", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleHeader {
    public static final VungleHeader INSTANCE;
    private static String appId;
    private static String appVersion;
    private static String headerUa;

    private VungleHeader() {
    }

    static {
        VungleHeader vungleHeader = new VungleHeader();
        INSTANCE = vungleHeader;
        headerUa = vungleHeader.defaultHeader();
    }

    private final String defaultHeader() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p.e("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb2.append(BuildConfig.VERSION_NAME);
        return sb2.toString();
    }

    public final String getAppId() {
        return appId;
    }

    public final String getAppVersion() {
        return appVersion;
    }

    public final String getHeaderUa() {
        return headerUa;
    }

    public final void setAppId(String str) {
        appId = str;
    }

    public final void setAppVersion(String str) {
        appVersion = str;
    }

    public final void setHeaderUa(String str) {
        p.j(str, "<set-?>");
        headerUa = str;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }
}

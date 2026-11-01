package com.vungle.ads.internal.load;

import ck.p;
import com.vungle.ads.internal.network.VungleApiClient;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;

/* JADX INFO: compiled from: RTADebugger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/load/RTADebugger;", "", "", "adm", "Lmj/r;", "reportAdMarkup", "Lcom/vungle/ads/internal/network/VungleApiClient;", "apiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "<init>", "(Lcom/vungle/ads/internal/network/VungleApiClient;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class RTADebugger {
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";
    private final VungleApiClient apiClient;

    public RTADebugger(VungleApiClient vungleApiClient) {
        p.j(vungleApiClient, "apiClient");
        this.apiClient = vungleApiClient;
    }

    public final void reportAdMarkup(String str) {
        p.j(str, "adm");
        this.apiClient.sendAdMarkup(str, RTA_DEBUG_ENDPOINT);
    }
}

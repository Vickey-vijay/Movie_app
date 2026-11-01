package com.vungle.ads;

import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/NoSpaceError;", "Lcom/vungle/ads/VungleError;", NotificationCompat.CATEGORY_MESSAGE, "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NoSpaceError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public NoSpaceError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NoSpaceError(String str, int i10, i iVar) {
        this((i10 & 1) != 0 ? "No space left on device" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSpaceError(String str) {
        super(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE, str, null);
        p.j(str, NotificationCompat.CATEGORY_MESSAGE);
    }
}

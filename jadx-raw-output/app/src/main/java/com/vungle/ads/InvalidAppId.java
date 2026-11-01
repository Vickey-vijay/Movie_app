package com.vungle.ads;

import androidx.core.app.NotificationCompat;
import ck.p;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/InvalidAppId;", "Lcom/vungle/ads/VungleError;", NotificationCompat.CATEGORY_MESSAGE, "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InvalidAppId extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAppId(String str) {
        super(Sdk.SDKError.Reason.INVALID_APP_ID, str, null);
        p.j(str, NotificationCompat.CATEGORY_MESSAGE);
    }
}

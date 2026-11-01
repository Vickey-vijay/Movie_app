package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ck.p;
import com.vungle.ads.internal.ui.VungleWebClient;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: RingerModeReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/util/RingerModeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Intent;", "intent", "Lmj/r;", "onReceive", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "webClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "getWebClient", "()Lcom/vungle/ads/internal/ui/VungleWebClient;", "setWebClient", "(Lcom/vungle/ads/internal/ui/VungleWebClient;)V", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class RingerModeReceiver extends BroadcastReceiver {
    private VungleWebClient webClient;

    public final VungleWebClient getWebClient() {
        return this.webClient;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        VungleWebClient vungleWebClient;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e10) {
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage != null) {
                    Logger.INSTANCE.e("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (p.e(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            Logger.INSTANCE.d("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                VungleWebClient vungleWebClient2 = this.webClient;
                if (vungleWebClient2 != null) {
                    vungleWebClient2.notifySilentModeChange(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (vungleWebClient = this.webClient) != null) {
                    vungleWebClient.notifySilentModeChange(false);
                    return;
                }
                return;
            }
            VungleWebClient vungleWebClient3 = this.webClient;
            if (vungleWebClient3 != null) {
                vungleWebClient3.notifySilentModeChange(true);
            }
        }
    }

    public final void setWebClient(VungleWebClient vungleWebClient) {
        this.webClient = vungleWebClient;
    }
}

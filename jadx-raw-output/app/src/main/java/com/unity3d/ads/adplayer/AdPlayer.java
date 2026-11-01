package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import ck.p;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlinx.coroutines.d;
import mj.r;
import nk.l0;
import qk.k;
import qk.q;

/* JADX INFO: compiled from: AdPlayer.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    /* JADX INFO: compiled from: AdPlayer.kt */
    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final k<String> broadcastEventChannel = q.b(0, 0, null, 7, null);

        private Companion() {
        }

        public final k<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* JADX INFO: compiled from: AdPlayer.kt */
    public static final class DefaultImpls {
        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            p.j(showOptions, "showOptions");
            throw new NotImplementedError(null, 1, null);
        }

        @CallSuper
        public static Object destroy(AdPlayer adPlayer, rj.c<? super r> cVar) {
            d.d(adPlayer.getScope(), null, 1, null);
            return r.f64562a;
        }
    }

    @CallSuper
    Object destroy(rj.c<? super r> cVar);

    void dispatchShowCompleted();

    qk.c<LoadEvent> getOnLoadEvent();

    qk.c<OfferwallShowEvent> getOnOfferwallEvent();

    qk.c<ScarEvent> getOnScarEvent();

    qk.c<ShowEvent> getOnShowEvent();

    l0 getScope();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, rj.c<? super r> cVar);

    Object onBroadcastEvent(String str, rj.c<? super r> cVar);

    Object requestShow(Map<String, ? extends Object> map, rj.c<? super r> cVar);

    Object sendActivityDestroyed(rj.c<? super r> cVar);

    Object sendFocusChange(boolean z10, rj.c<? super r> cVar);

    Object sendGmaEvent(GMAEvent gMAEvent, rj.c<? super r> cVar);

    Object sendMuteChange(boolean z10, rj.c<? super r> cVar);

    Object sendOfferwallEvent(OfferwallEvent offerwallEvent, rj.c<? super r> cVar);

    Object sendPrivacyFsmChange(byte[] bArr, rj.c<? super r> cVar);

    Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, rj.c<? super r> cVar);

    Object sendUserConsentChange(byte[] bArr, rj.c<? super r> cVar);

    Object sendVisibilityChange(boolean z10, rj.c<? super r> cVar);

    Object sendVolumeChange(double d10, rj.c<? super r> cVar);

    void show(ShowOptions showOptions);
}

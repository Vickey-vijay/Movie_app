package io.bidmachine.measurer;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Mf;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.AdMeasurer;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OMSDKAdMeasurer<AdView extends View> implements AdMeasurer<AdView> {
    private static final String TAG = "AdMeasurer";

    @Nullable
    private AdEvents adEvents;

    @Nullable
    private AdSession adSession;

    @Nullable
    private WeakReference<View> adViewWeak;

    @NonNull
    private final AtomicBoolean isShownTracked;
    private final boolean isTrackShownOutside;

    @Nullable
    private MediaEvents mediaEvents;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.resume();
                    OMSDKAdMeasurer.this.log("onMediaResumed");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ float val$volume;

        public b(float f10) {
            this.val$volume = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.volumeChange(this.val$volume);
                    OMSDKAdMeasurer.this.log("onMediaVolumeChanged");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.skipped();
                    OMSDKAdMeasurer.this.log("onMediaSkipped");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                OMSDKAdMeasurer.this.mediaEvents = null;
                OMSDKAdMeasurer.this.adEvents = null;
                if (OMSDKAdMeasurer.this.adSession != null) {
                    OMSDKAdMeasurer.this.adSession.finish();
                }
                OMSDKAdMeasurer.this.log("destroy");
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ String val$errorMessage;
        public final /* synthetic */ ErrorType val$errorType;

        public e(ErrorType errorType, String str) {
            this.val$errorType = errorType;
            this.val$errorMessage = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.adSession != null) {
                    OMSDKAdMeasurer.this.adSession.error(this.val$errorType, this.val$errorMessage);
                    OMSDKAdMeasurer.this.log("error");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ ViewGroup val$viewGroup;

        public f(ViewGroup viewGroup) {
            this.val$viewGroup = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.adSession != null) {
                    OMSDKAdMeasurer oMSDKAdMeasurer = OMSDKAdMeasurer.this;
                    oMSDKAdMeasurer.registerAdView(oMSDKAdMeasurer.adSession, this.val$viewGroup);
                } else {
                    OMSDKAdMeasurer.this.adViewWeak = new WeakReference(this.val$viewGroup);
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.adEvents != null) {
                    OMSDKAdMeasurer.this.adEvents.impressionOccurred();
                    OMSDKAdMeasurer.this.log("onAdShown");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.adUserInteraction(InteractionType.CLICK);
                    OMSDKAdMeasurer.this.log(Mf.f27056f);
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ float val$duration;
        public final /* synthetic */ float val$volume;

        public i(float f10, float f11) {
            this.val$duration = f10;
            this.val$volume = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.start(this.val$duration / 1000.0f, this.val$volume);
                    OMSDKAdMeasurer.this.log("onMediaStarted");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.firstQuartile();
                    OMSDKAdMeasurer.this.log("onMediaFirstQuartile");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.midpoint();
                    OMSDKAdMeasurer.this.log("onMediaMidpoint");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.thirdQuartile();
                    OMSDKAdMeasurer.this.log("onMediaThirdQuartile");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.complete();
                    OMSDKAdMeasurer.this.log("onMediaCompleted");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMSDKAdMeasurer.this.mediaEvents != null) {
                    OMSDKAdMeasurer.this.mediaEvents.pause();
                    OMSDKAdMeasurer.this.log("onMediaPaused");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public OMSDKAdMeasurer() {
        this(false);
    }

    public void error(@NonNull String str) {
        error(ErrorType.GENERIC, str);
    }

    @UiThread
    public abstract void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable;

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onAdViewReady(@NonNull AdView adview) {
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void registerAdView(@NonNull AdView adview) {
    }

    public OMSDKAdMeasurer(boolean z10) {
        this.isTrackShownOutside = z10;
        this.isShownTracked = new AtomicBoolean(false);
    }

    private void error(@NonNull ErrorType errorType, @NonNull String str) {
        Utils.onUiThread(new e(errorType, str));
    }

    @UiThread
    private void registerViews(@NonNull AdSession adSession) throws Throwable {
        WeakReference<View> weakReference = this.adViewWeak;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            registerAdView(adSession, view);
        }
        this.adViewWeak = null;
    }

    public void destroy() {
        Utils.onUiThread(new d());
    }

    public boolean isSessionPrepared() {
        return this.adSession != null;
    }

    public void log(@NonNull String str) {
        Logger.d(TAG, str);
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onAdClicked() {
        Utils.onUiThread(new h());
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onAdShown() {
        if (this.isTrackShownOutside) {
            return;
        }
        trackShown();
    }

    public void onMediaCompleted() {
        Utils.onUiThread(new m());
    }

    public void onMediaFirstQuartile() {
        Utils.onUiThread(new j());
    }

    public void onMediaMidpoint() {
        Utils.onUiThread(new k());
    }

    public void onMediaPaused() {
        Utils.onUiThread(new n());
    }

    public void onMediaResumed() {
        Utils.onUiThread(new a());
    }

    public void onMediaSkipped() {
        Utils.onUiThread(new c());
    }

    public void onMediaStarted(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        Utils.onUiThread(new i(f10, f11));
    }

    public void onMediaThirdQuartile() {
        Utils.onUiThread(new l());
    }

    public void onMediaVolumeChanged(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        Utils.onUiThread(new b(f10));
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void registerAdContainer(@NonNull ViewGroup viewGroup) {
        Utils.onUiThread(new f(viewGroup));
    }

    public void trackShown() {
        if (this.isShownTracked.compareAndSet(false, true)) {
            Utils.onUiThread(new g());
        }
    }

    public void videoError(@NonNull String str) {
        error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void registerAdView(@NonNull AdSession adSession, @NonNull View view) throws Throwable {
        adSession.registerAdView(view);
        log("registerAdView");
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onError(@NonNull IabError iabError) {
        error(iabError.getMessage());
    }

    @UiThread
    public void prepareAdSession(@NonNull AdSessionConfiguration adSessionConfiguration, @NonNull AdSessionContext adSessionContext) {
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.adSession = adSessionCreateAdSession;
            this.adEvents = AdEvents.createAdEvents(adSessionCreateAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.mediaEvents = MediaEvents.createMediaEvents(this.adSession);
            }
            registerViews(this.adSession);
            this.adSession.start();
            onAdLoaded(this.adEvents);
            log("prepareAdSession");
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }
}

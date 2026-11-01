package io.bidmachine.ads.networks.adaptiverendering.measurer;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
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
import io.bidmachine.rendering.measurer.Measurer;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.utils.Tag;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class OMMeasurer<AdView extends View> implements Measurer<AdView> {

    @Nullable
    private AdEvents adEvents;

    @Nullable
    private AdSession adSession;

    @Nullable
    public MediaEvents mediaEvents;

    @NonNull
    private final Tag tag = new Tag("OMMeasurer");

    @NonNull
    private final AtomicBoolean isLoadedTracked = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean isShownTracked = new AtomicBoolean(false);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!OMMeasurer.this.isSessionPrepared() || OMMeasurer.this.adEvents == null) {
                    return;
                }
                OMMeasurer.this.adEvents.impressionOccurred();
                OMMeasurer.this.log("onAdShown");
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaEvents mediaEvents = OMMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.adUserInteraction(InteractionType.CLICK);
                    OMMeasurer.this.log(Mf.f27056f);
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ Runnable val$postback;

        public c(Runnable runnable, Handler handler) {
            this.val$postback = runnable;
            this.val$handler = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                OMMeasurer oMMeasurer = OMMeasurer.this;
                oMMeasurer.mediaEvents = null;
                oMMeasurer.adEvents = null;
                if (OMMeasurer.this.adSession != null) {
                    OMMeasurer.this.adSession.finish();
                }
                OMMeasurer.this.log("destroy");
                Runnable runnable = this.val$postback;
                if (runnable != null) {
                    this.val$handler.postDelayed(runnable, OMMeasurer.this.getDestroyDelayMs());
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
                if (!OMMeasurer.this.isSessionPrepared() || OMMeasurer.this.adEvents == null) {
                    return;
                }
                OMMeasurer oMMeasurer = OMMeasurer.this;
                oMMeasurer.onAdLoaded(oMMeasurer.adEvents);
                OMMeasurer.this.log(Mf.f27060j);
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
                if (OMMeasurer.this.adSession != null) {
                    OMMeasurer.this.adSession.error(this.val$errorType, this.val$errorMessage);
                    OMMeasurer.this.log("error");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ View val$view;

        public f(View view) {
            this.val$view = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMMeasurer.this.adSession != null) {
                    OMMeasurer.this.adSession.registerAdView(this.val$view);
                    OMMeasurer.this.log("registerView");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public long getDestroyDelayMs() {
        return 0L;
    }

    @UiThread
    public abstract void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable;

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewAddedToContainer(@NonNull AdView adview, @NonNull ViewGroup viewGroup) {
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onViewCreated(@NonNull AdView adview) {
    }

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewReady(@NonNull AdView adview) {
    }

    public void trackError(@NonNull String str) {
        trackError(ErrorType.GENERIC, str);
    }

    private void trackError(@NonNull ErrorType errorType, @NonNull String str) {
        Utils.onUiThread(new e(errorType, str));
    }

    public boolean isSessionPrepared() {
        return this.adSession != null;
    }

    public void log(@NonNull String str) {
        Logger.d(this.tag, str);
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onClicked() {
        Utils.onUiThread(new b());
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onShown() {
        if (this.isShownTracked.compareAndSet(false, true)) {
            Utils.onUiThread(new a());
        }
    }

    public void registerView(@NonNull View view) {
        Utils.onUiThread(new f(view));
    }

    public void trackLoaded() {
        if (this.isLoadedTracked.compareAndSet(false, true)) {
            Utils.onUiThread(new d());
        }
    }

    public void trackVideoError(@NonNull String str) {
        trackError(ErrorType.VIDEO, str);
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void destroy(@Nullable Runnable runnable) {
        Utils.onUiThread(new c(runnable, Utils.createHandlerWithMyOrMainLooper()));
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onError(@NonNull Error error) {
        trackError(error.getMessage());
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
            this.adSession.start();
            log("prepareAdSession");
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }
}

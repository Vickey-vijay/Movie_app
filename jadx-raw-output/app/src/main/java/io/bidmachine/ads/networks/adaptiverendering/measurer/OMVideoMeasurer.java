package io.bidmachine.ads.networks.adaptiverendering.measurer;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.CreativeType;
import com.iab.omid.library.appodeal.adsession.ImpressionType;
import com.iab.omid.library.appodeal.adsession.Owner;
import com.iab.omid.library.appodeal.adsession.Partner;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.iab.omid.library.appodeal.adsession.media.Position;
import com.iab.omid.library.appodeal.adsession.media.VastProperties;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.rendering.measurer.VideoMeasurer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class OMVideoMeasurer extends OMMeasurer<View> implements VideoMeasurer {
    private static final boolean IS_AUTO_PLAY = true;

    @NonNull
    @VisibleForTesting
    public final VastProperties vastProperties;

    @NonNull
    @VisibleForTesting
    public final List<VerificationScriptResource> verificationScriptResourceList;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Partner partner = OMSDKSettings.getPartner();
                if (partner != null && !OMVideoMeasurer.this.isSessionPrepared()) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    OMVideoMeasurer.this.prepareAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(partner, OMSDKSettings.OM_JS, OMVideoMeasurer.this.verificationScriptResourceList, "", ""));
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ float val$durationMs;
        public final /* synthetic */ float val$volume;

        public b(float f10, float f11) {
            this.val$durationMs = f10;
            this.val$volume = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.start(this.val$durationMs / 1000.0f, this.val$volume);
                    OMVideoMeasurer.this.log("onMediaStarted");
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
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.firstQuartile();
                    OMVideoMeasurer.this.log("onMediaFirstQuartile");
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
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.midpoint();
                    OMVideoMeasurer.this.log("onMediaMidpoint");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.thirdQuartile();
                    OMVideoMeasurer.this.log("onMediaThirdQuartile");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.complete();
                    OMVideoMeasurer.this.log("onMediaCompleted");
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
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.pause();
                    OMVideoMeasurer.this.log("onMediaPaused");
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
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.resume();
                    OMVideoMeasurer.this.log("onMediaResumed");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ float val$volume;

        public i(float f10) {
            this.val$volume = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(this.val$volume);
                    OMVideoMeasurer.this.log("onMediaVolumeChanged");
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
                MediaEvents mediaEvents = OMVideoMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.skipped();
                    OMVideoMeasurer.this.log("onMediaSkipped");
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer
    public void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable {
        adEvents.loaded(this.vastProperties);
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaCompleted() {
        Utils.onUiThread(new f());
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaFirstQuartile() {
        Utils.onUiThread(new c());
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaMidpoint() {
        Utils.onUiThread(new d());
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaPaused() {
        Utils.onUiThread(new g());
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaResumed() {
        Utils.onUiThread(new h());
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaSkipped() {
        Utils.onUiThread(new j());
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaStarted(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        Utils.onUiThread(new b(f10, f11));
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaThirdQuartile() {
        Utils.onUiThread(new e());
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaVolumeChanged(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        Utils.onUiThread(new i(f10));
    }

    public void startAdSession() {
        Utils.onUiThread(new a());
    }

    public OMVideoMeasurer(@NonNull List<VerificationScriptResource> list, @Nullable Float f10) {
        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia;
        this.verificationScriptResourceList = list;
        if (f10 != null && f10.floatValue() >= 0.0f) {
            vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(f10.floatValue(), true, Position.STANDALONE);
        } else {
            vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        this.vastProperties = vastPropertiesCreateVastPropertiesForNonSkippableMedia;
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer, io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewAddedToContainer(@NonNull View view, @NonNull ViewGroup viewGroup) {
        registerView(viewGroup);
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer, io.bidmachine.rendering.measurer.Measurer
    public void onViewCreated(@NonNull View view) {
        startAdSession();
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer, io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewReady(@NonNull View view) {
        trackLoaded();
    }
}

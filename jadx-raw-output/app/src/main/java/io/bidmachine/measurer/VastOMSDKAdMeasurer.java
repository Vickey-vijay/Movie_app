package io.bidmachine.measurer;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.CreativeType;
import com.iab.omid.library.appodeal.adsession.ImpressionType;
import com.iab.omid.library.appodeal.adsession.Owner;
import com.iab.omid.library.appodeal.adsession.Partner;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.adsession.media.Position;
import com.iab.omid.library.appodeal.adsession.media.VastProperties;
import com.ironsource.Mf;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.vast.VastPlaybackListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.tags.AdVerificationsExtensionTag;
import io.bidmachine.iab.vast.tags.JavaScriptResourceTag;
import io.bidmachine.iab.vast.tags.VerificationTag;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VastOMSDKAdMeasurer extends OMSDKAdMeasurer<View> implements VastAdMeasurer, VastPlaybackListener {
    private static final boolean IS_AUTO_PLAY = true;

    @NonNull
    private final List<VerificationScriptResource> resourceList = new ArrayList();

    @Nullable
    private Float skipOffset;

    public class a implements Runnable {
        public final /* synthetic */ VastRequest val$vastRequest;

        public a(VastRequest vastRequest) {
            this.val$vastRequest = vastRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                VastOMSDKAdMeasurer.this.setupAdMeasurer(this.val$vastRequest);
                VastOMSDKAdMeasurer vastOMSDKAdMeasurer = VastOMSDKAdMeasurer.this;
                vastOMSDKAdMeasurer.startAdSession(vastOMSDKAdMeasurer.resourceList);
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ VastRequest val$vastRequest;

        public b(VastRequest vastRequest) {
            this.val$vastRequest = vastRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                VastAd vastAd = this.val$vastRequest.getVastAd();
                VastOMSDKAdMeasurer.this.addVerificationScriptResourceList(vastAd != null ? vastAd.getAdVerificationsExtensionList() : null);
                VastOMSDKAdMeasurer.this.setSkipOffset(Float.valueOf(this.val$vastRequest.getFusedVideoCloseTimeSec()));
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ List val$adVerificationsExtensionTagList;

        public c(List list) {
            this.val$adVerificationsExtensionTagList = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (AdVerificationsExtensionTag adVerificationsExtensionTag : this.val$adVerificationsExtensionTagList) {
                    if (adVerificationsExtensionTag != null) {
                        for (VerificationTag verificationTag : adVerificationsExtensionTag.getVerificationTagList()) {
                            JavaScriptResourceTag javaScriptResourceTag = verificationTag.getJavaScriptResourceTag();
                            String text = javaScriptResourceTag != null ? javaScriptResourceTag.getText() : null;
                            String vendor = verificationTag.getVendor();
                            String verificationParameters = verificationTag.getVerificationParameters();
                            if (!TextUtils.isEmpty(text)) {
                                VastOMSDKAdMeasurer.this.addVerificationScriptResource(text, vendor, verificationParameters);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ List val$verificationScriptResourceList;

        public d(List list) {
            this.val$verificationScriptResourceList = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Partner partner = OMSDKSettings.getPartner();
                if (partner != null && !VastOMSDKAdMeasurer.this.isSessionPrepared()) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    VastOMSDKAdMeasurer.this.prepareAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(partner, OMSDKSettings.OM_JS, this.val$verificationScriptResourceList, "", ""));
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    @UiThread
    public void addVerificationScriptResource(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        try {
            URL url = new URL(str);
            this.resourceList.add((TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str2, url, str3));
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    public void addVerificationScriptResourceList(@Nullable List<AdVerificationsExtensionTag> list) {
        if (list == null) {
            return;
        }
        Utils.onUiThread(new c(list));
    }

    @Override // io.bidmachine.measurer.OMSDKAdMeasurer
    @UiThread
    public void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable {
        Float f10 = this.skipOffset;
        adEvents.loaded(f10 == null ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia(f10.floatValue(), true, Position.STANDALONE));
        log(Mf.f27060j);
    }

    @Override // io.bidmachine.iab.measurer.VastAdMeasurer
    public void onVastModelLoaded(@NonNull VastRequest vastRequest) {
        Utils.onUiThread(new a(vastRequest));
    }

    public void setSkipOffset(@Nullable Float f10) {
        this.skipOffset = f10;
    }

    public void setupAdMeasurer(@NonNull VastRequest vastRequest) {
        Utils.onUiThread(new b(vastRequest));
    }

    public void startAdSession(@NonNull List<VerificationScriptResource> list) {
        Utils.onUiThread(new d(list));
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoCompleted() {
        onMediaCompleted();
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoFirstQuartile() {
        onMediaFirstQuartile();
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoMidpoint() {
        onMediaMidpoint();
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoPaused() {
        onMediaPaused();
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoResumed() {
        onMediaResumed();
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoSkipped() {
        onMediaSkipped();
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoStarted(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        onMediaStarted(f10, f11);
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoThirdQuartile() {
        onMediaThirdQuartile();
    }

    @Override // io.bidmachine.iab.vast.VastPlaybackListener
    public void onVideoVolumeChanged(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        onMediaVolumeChanged(f10);
    }
}

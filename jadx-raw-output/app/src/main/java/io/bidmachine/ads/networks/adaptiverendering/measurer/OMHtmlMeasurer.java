package io.bidmachine.ads.networks.adaptiverendering.measurer;

import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.appodeal.ScriptInjector;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.CreativeType;
import com.iab.omid.library.appodeal.adsession.ImpressionType;
import com.iab.omid.library.appodeal.adsession.Owner;
import com.iab.omid.library.appodeal.adsession.Partner;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class OMHtmlMeasurer extends OMMeasurer<WebView> implements HtmlMeasurer {
    private static final long DESTROY_DELAY = 1000;

    @NonNull
    private final AtomicBoolean isCreativePrepared = new AtomicBoolean(false);

    public class a implements Runnable {
        public final /* synthetic */ WebView val$webView;

        public a(WebView webView) {
            this.val$webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Partner partner = OMSDKSettings.getPartner();
                if (partner != null && !OMHtmlMeasurer.this.isSessionPrepared()) {
                    CreativeType creativeType = CreativeType.HTML_DISPLAY;
                    ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    OMHtmlMeasurer.this.prepareAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(partner, this.val$webView, "", ""));
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer
    public long getDestroyDelayMs() {
        return 1000L;
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer, io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewAddedToContainer(@NonNull WebView webView, @NonNull ViewGroup viewGroup) {
        registerView(viewGroup);
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer, io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewReady(@NonNull WebView webView) {
        startAdSession(webView);
        trackLoaded();
    }

    @Override // io.bidmachine.rendering.measurer.HtmlMeasurer
    @NonNull
    public String prepareCreativeForMeasure(@NonNull String str) {
        if (!this.isCreativePrepared.compareAndSet(false, true)) {
            return str;
        }
        try {
            return ScriptInjector.injectScriptContentIntoHtml(OMSDKSettings.OM_JS, str);
        } catch (Throwable th2) {
            Logger.w(th2);
            return str;
        }
    }

    public void startAdSession(@NonNull WebView webView) {
        Utils.onUiThread(new a(webView));
    }

    @Override // io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer
    public void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable {
        adEvents.loaded();
    }
}

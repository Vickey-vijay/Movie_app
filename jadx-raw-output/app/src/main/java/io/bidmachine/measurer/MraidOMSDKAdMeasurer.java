package io.bidmachine.measurer;

import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.iab.omid.library.appodeal.ScriptInjector;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.CreativeType;
import com.iab.omid.library.appodeal.adsession.ImpressionType;
import com.iab.omid.library.appodeal.adsession.Owner;
import com.iab.omid.library.appodeal.adsession.Partner;
import com.ironsource.Mf;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@UiThread
public class MraidOMSDKAdMeasurer extends OMSDKAdMeasurer<WebView> implements MraidAdMeasurer {
    private static final long DESTROY_DELAY = 1000;

    @NonNull
    private final AtomicBoolean isCreativePrepared;

    public class a implements Runnable {
        public final /* synthetic */ WebView val$webView;

        public a(WebView webView) {
            this.val$webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Partner partner = OMSDKSettings.getPartner();
                if (partner != null && !MraidOMSDKAdMeasurer.this.isSessionPrepared()) {
                    CreativeType creativeType = CreativeType.HTML_DISPLAY;
                    ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    MraidOMSDKAdMeasurer.this.prepareAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(partner, this.val$webView, "", ""));
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ Runnable val$postBack;

        public b(Runnable runnable, Handler handler) {
            this.val$postBack = runnable;
            this.val$handler = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidOMSDKAdMeasurer.this.destroy();
            Runnable runnable = this.val$postBack;
            if (runnable != null) {
                this.val$handler.postDelayed(runnable, 1000L);
            }
        }
    }

    public MraidOMSDKAdMeasurer() {
        this(false);
    }

    public MraidOMSDKAdMeasurer(boolean z10) {
        super(z10);
        this.isCreativePrepared = new AtomicBoolean(false);
    }

    @Override // io.bidmachine.measurer.OMSDKAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
    public void onAdViewReady(@NonNull WebView webView) {
        startAdSession(webView);
    }

    @Override // io.bidmachine.iab.measurer.MraidAdMeasurer
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

    public void destroy(@Nullable Runnable runnable) {
        Utils.onUiThread(new b(runnable, Utils.createHandlerWithMyOrMainLooper()));
    }

    @Override // io.bidmachine.measurer.OMSDKAdMeasurer
    @UiThread
    public void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable {
        adEvents.loaded();
        log(Mf.f27060j);
    }
}

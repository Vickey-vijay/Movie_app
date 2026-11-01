package sg.bigo.ads.api;

import android.webkit.WebView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public interface InnerBannerAd extends BannerAd {
    void destroyInMainThread();

    sg.bigo.ads.api.core.b getInnerBannerAdData();

    sg.bigo.ads.common.view.c getWatermarkView();

    WebView getWebView();

    void handleInnerBannerAdResponse(@NonNull sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar);

    boolean isInnerBannerAdFromAutoRefresh();

    void markFromAutoFresh(sg.bigo.ads.api.core.b bVar);

    int updateFormOpenTimes();
}

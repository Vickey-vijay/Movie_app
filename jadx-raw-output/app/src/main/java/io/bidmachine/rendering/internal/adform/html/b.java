package io.bidmachine.rendering.internal.adform.html;

import android.webkit.WebView;
import ck.p;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.mraid.MraidAdView;
import io.bidmachine.iab.mraid.MraidOrientationProperties;
import io.bidmachine.iab.mraid.MraidResizeProperties;
import io.bidmachine.iab.mraid.MraidScreenMetrics;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements MraidAdView.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f60024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f60025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.event.b f60026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HtmlMeasurer f60027d;

    public b(a aVar, c cVar, io.bidmachine.rendering.internal.event.b bVar, HtmlMeasurer htmlMeasurer) {
        p.j(aVar, "htmlAdForm");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        this.f60024a = aVar;
        this.f60025b = cVar;
        this.f60026c = bVar;
        this.f60027d = htmlMeasurer;
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onCalendarEventIntention(MraidAdView mraidAdView, String str) {
        p.j(mraidAdView, "mraidAdView");
        p.j(str, "url");
        onOpenUrlIntention(mraidAdView, str);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onChangeOrientationIntention(MraidAdView mraidAdView, MraidOrientationProperties mraidOrientationProperties) {
        p.j(mraidAdView, "mraidAdView");
        p.j(mraidOrientationProperties, "mraidOrientationProperties");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onCloseIntention(MraidAdView mraidAdView) {
        p.j(mraidAdView, "mraidAdView");
        this.f60026c.onClose();
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public boolean onExpandIntention(MraidAdView mraidAdView, WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z10) {
        p.j(mraidAdView, "mraidAdView");
        p.j(webView, "webView");
        return false;
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onExpanded(MraidAdView mraidAdView) {
        p.j(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewExpired(MraidAdView mraidAdView, IabError iabError) {
        p.j(mraidAdView, "mraidAdView");
        p.j(iabError, "iabError");
        c cVar = this.f60025b;
        a aVar = this.f60024a;
        String message = iabError.getMessage();
        p.i(message, "iabError.message");
        cVar.b(aVar, new Error(message));
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewLoadFailed(MraidAdView mraidAdView, IabError iabError) {
        p.j(mraidAdView, "mraidAdView");
        p.j(iabError, "iabError");
        a aVar = this.f60024a;
        String message = iabError.getMessage();
        p.i(message, "iabError.message");
        aVar.a(new Error(message));
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewPageLoaded(MraidAdView mraidAdView, String str, WebView webView, boolean z10) {
        p.j(mraidAdView, "mraidAdView");
        p.j(str, "url");
        p.j(webView, "webView");
        HtmlMeasurer htmlMeasurer = this.f60027d;
        if (htmlMeasurer != null) {
            htmlMeasurer.onViewReady(webView);
        }
        this.f60025b.b(this.f60024a);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewShowFailed(MraidAdView mraidAdView, IabError iabError) {
        p.j(mraidAdView, "mraidAdView");
        p.j(iabError, "iabError");
        a aVar = this.f60024a;
        String message = iabError.getMessage();
        p.i(message, "iabError.message");
        aVar.b(new Error(message));
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewShown(MraidAdView mraidAdView) {
        p.j(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidLoadedIntention(MraidAdView mraidAdView) {
        p.j(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onOpenPrivacySheet(MraidAdView mraidAdView, PrivacySheetParams privacySheetParams) {
        p.j(mraidAdView, "mraidAdView");
        p.j(privacySheetParams, "privacySheetParams");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onOpenUrlIntention(MraidAdView mraidAdView, String str) {
        p.j(mraidAdView, "mraidAdView");
        p.j(str, "url");
        HtmlMeasurer htmlMeasurer = this.f60027d;
        if (htmlMeasurer != null) {
            htmlMeasurer.onClicked();
        }
        this.f60026c.a(str);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onPlayVideoIntention(MraidAdView mraidAdView, String str) {
        p.j(mraidAdView, "mraidAdView");
        p.j(str, "url");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public boolean onResizeIntention(MraidAdView mraidAdView, WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        p.j(mraidAdView, "mraidAdView");
        p.j(webView, "webView");
        p.j(mraidResizeProperties, "mraidResizeProperties");
        p.j(mraidScreenMetrics, "mraidScreenMetrics");
        return false;
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onStorePictureIntention(MraidAdView mraidAdView, String str) {
        p.j(mraidAdView, "mraidAdView");
        p.j(str, "url");
        onOpenUrlIntention(mraidAdView, str);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onSyncCustomCloseIntention(MraidAdView mraidAdView, boolean z10) {
        p.j(mraidAdView, "mraidAdView");
        this.f60026c.onUseCustomClose(z10);
    }
}

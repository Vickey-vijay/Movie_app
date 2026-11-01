package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes8.dex */
public class d extends sg.bigo.ads.controller.landing.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LandingPageStyleConfig f68438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f68439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f68440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ProgressBar f68441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f68442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68444g;

    public d(@NonNull Activity activity) {
        super(activity);
        this.f68442e = 5;
        this.f68443f = false;
        this.f68444g = true;
        Intent intent = activity.getIntent();
        this.f68438a = intent == null ? null : (LandingPageStyleConfig) intent.getParcelableExtra("layout_style");
        sg.bigo.ads.api.core.b bVar = this.f71001t;
        if (bVar != null) {
            this.f68439b = bVar.e();
        }
    }

    private int a(String str, String str2, String str3) {
        LandingPageStyleConfig landingPageStyleConfig;
        str.hashCode();
        int i10 = 2;
        switch (str) {
            case "video_play_page.webview2_force_time":
                break;
            case "video_play_page.loading_timing":
            case "video_play_page.is_loading":
                i10 = 1;
                break;
            default:
                i10 = 0;
                break;
        }
        m mVar = this.f68439b;
        if (mVar == null || (landingPageStyleConfig = this.f68438a) == null) {
            return i10;
        }
        int i11 = landingPageStyleConfig.f70933c;
        if (i11 == 0) {
            return mVar.a(str);
        }
        if (i11 != 1) {
            return (i11 == 9 || i11 == 10) ? mVar.a(str2) : i10;
        }
        return mVar.a(str3);
    }

    private void f() {
        ViewStub viewStub;
        View view;
        if (!this.f68443f && x()) {
            if ((this.f68440c == null || this.f68441d == null) && (viewStub = (ViewStub) p(R.id.bigo_web_loading_container)) != null) {
                View viewInflate = viewStub.inflate();
                this.f68440c = viewInflate;
                if (viewInflate != null) {
                    this.f68441d = (ProgressBar) viewInflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.f68440c;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.f68441d;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int iY = y();
            if (iY > 1 && (view = this.f68440c) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a(d.this.f71000s)) {
                            return;
                        }
                        d.this.g();
                    }
                }, ((long) iY) * 1000);
            }
            this.f68443f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        View view = this.f68440c;
        if (view != null) {
            this.f68443f = false;
            view.setVisibility(8);
        }
    }

    private boolean x() {
        return 1 == a("video_play_page.is_loading", "layer.is_loading", "endpage.is_loading");
    }

    private int y() {
        int iA = a("video_play_page.loading_timing", "layer.loading_timing", "endpage.loading_timing");
        if (iA == 2) {
            return 3;
        }
        if (iA == 3) {
            return 5;
        }
        if (iA != 4) {
            return iA;
        }
        return 10;
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i10) {
        super.a(i10);
        ProgressBar progressBar = this.f68441d;
        if (progressBar == null || i10 <= 5) {
            return;
        }
        if (i10 > 95) {
            i10 = 95;
        }
        progressBar.setProgress(i10);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (this.f68440c == null || y() > 1) {
            return;
        }
        g();
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z10) {
        f();
        super.a(str, z10);
        if (this.f68444g) {
            this.f68444g = false;
            return;
        }
        this.f71004w = true;
        q();
        int iA = a("video_play_page.webview2_force_time", "layer.webview2_force_time", "endpage.webview2_force_time");
        if (iA == 1 || iA == 2 || iA == 3 || iA == 4) {
            this.f71003v = iA + 1;
        } else {
            this.f71003v = 0;
        }
        w();
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        f();
        if (c()) {
            ProgressBar progressBar = this.f71566y;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.A;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.f71565x;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean c() {
        return 1 == a("video_play_page.support_browser", "layer.support_browser", "endpage.support_browser");
    }
}

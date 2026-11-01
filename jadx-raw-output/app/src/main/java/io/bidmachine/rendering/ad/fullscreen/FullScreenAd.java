package io.bidmachine.rendering.ad.fullscreen;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener;
import io.bidmachine.rendering.ad.view.AdView;
import io.bidmachine.rendering.ad.view.AdViewListener;
import io.bidmachine.rendering.internal.state.d;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;
import io.bidmachine.util.ViewUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.state.a f59985a = new d("FullScreenAd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdView f59986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FullScreenAdListener f59987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f59988d;

    public class b implements AdViewListener {
        private b() {
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdAppeared(AdView adView) {
            FullScreenAd.this.k();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdClicked(AdView adView) {
            FullScreenAd.this.l();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onAdDisappeared(AdView adView) {
            FullScreenAd.this.m();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onAdExpired(AdView adView) {
            FullScreenAd.this.n();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onAdFinished(AdView adView) {
            FullScreenAd.this.r();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AdView adView) {
            FullScreenAd.this.p();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onAdShown(AdView adView) {
            FullScreenAd.this.q();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdFailToLoad(AdView adView, Error error) {
            FullScreenAd.this.c(error);
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdFailToShow(AdView adView, Error error) {
            FullScreenAd.this.d(error);
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBrokenCreativeEvent(AdView adView, BrokenCreativeEvent brokenCreativeEvent) {
            FullScreenAd.this.b(brokenCreativeEvent);
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onOpenPrivacySheet(AdView adView, PrivacySheetParams privacySheetParams) {
            FullScreenAd.this.b(privacySheetParams);
        }
    }

    public FullScreenAd(@NonNull Context context, @NonNull AdParams adParams) {
        this.f59986b = new AdView(context.getApplicationContext(), adParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdExpired(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFinished(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdLoaded(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdShown(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f59985a.b(true)) {
            UiUtils.onUiThread(new Runnable() { // from class: th.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72398b.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.f59985a.e();
        UiUtils.onUiThread(new Runnable() { // from class: th.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f72405b.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f59985a.b(false)) {
            UiUtils.onUiThread(new Runnable() { // from class: th.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72410b.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.f59985a.k()) {
            UiUtils.onUiThread(new Runnable() { // from class: th.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72409b.g();
                }
            });
        }
    }

    private void o() {
        if (this.f59985a.j()) {
            UiUtils.onUiThread(new Runnable() { // from class: th.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72395b.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f59985a.a(true)) {
            UiUtils.onUiThread(new Runnable() { // from class: th.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72406b.i();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.f59985a.i()) {
            UiUtils.onUiThread(new Runnable() { // from class: th.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72411b.j();
                }
            });
        }
    }

    public void destroy() {
        this.f59985a.a();
        this.f59986b.destroy();
        a();
    }

    public boolean isFinished() {
        return this.f59985a.g();
    }

    public boolean isLoaded() {
        return this.f59985a.b();
    }

    public void load() {
        if (this.f59985a.c()) {
            this.f59986b.setAdViewListener(new b());
            this.f59986b.load();
        }
    }

    public void r() {
        a();
        m();
        o();
    }

    public void setFullScreenAdListener(@Nullable FullScreenAdListener fullScreenAdListener) {
        this.f59987c = fullScreenAdListener;
    }

    public void show(@NonNull Context context) {
        if (isLoaded()) {
            FullScreenActivity.show(context, this);
        } else {
            d(new Error("FullScreenAd not loaded"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdAppeared(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdDisappeared(this);
        }
    }

    public void b() {
        WeakReference weakReference = this.f59988d;
        if (weakReference != null) {
            weakReference.clear();
            this.f59988d = null;
        }
    }

    public Activity c() {
        WeakReference weakReference = this.f59988d;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Error error) {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToShow(this, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Error error) {
        if (this.f59985a.a(false)) {
            UiUtils.onUiThread(new Runnable() { // from class: th.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72393b.a(error);
                }
            });
        }
    }

    public void d(final Error error) {
        UiUtils.onUiThread(new Runnable() { // from class: th.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f72399b.b(error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final BrokenCreativeEvent brokenCreativeEvent) {
        if (this.f59985a.h()) {
            return;
        }
        UiUtils.onUiThread(new Runnable() { // from class: th.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f72396b.a(brokenCreativeEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final PrivacySheetParams privacySheetParams) {
        UiUtils.onUiThread(new Runnable() { // from class: th.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f72407b.a(privacySheetParams);
            }
        });
    }

    public void a(Activity activity) {
        this.f59988d = new WeakReference(activity);
    }

    private void a() {
        Activity activityC = c();
        if (activityC != null) {
            try {
                io.bidmachine.util.UiUtils.finishActivityWithoutAnimation(activityC);
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public void b(Activity activity) {
        a(activity);
        UiUtils.setupActivityOrientation(activity, this.f59986b.getRequiredOrientation());
        Utils.applyFullscreenActivityFlags(activity);
        Utils.removeFromParent(this.f59986b);
        UiUtils.applyInsets(activity, this.f59986b, false);
        activity.setContentView(this.f59986b, ViewUtils.createMatchParentParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Error error) {
        FullScreenAdListener fullScreenAdListener = this.f59987c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToLoad(this, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BrokenCreativeEvent brokenCreativeEvent, FullScreenAdListener fullScreenAdListener) {
        fullScreenAdListener.onBrokenCreativeEvent(this, brokenCreativeEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final BrokenCreativeEvent brokenCreativeEvent) {
        io.bidmachine.util.Utils.ifNotNull(this.f59987c, new Executable() { // from class: th.g
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f72403a.a(brokenCreativeEvent, (FullScreenAdListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final PrivacySheetParams privacySheetParams) {
        io.bidmachine.util.Utils.ifNotNull(this.f59987c, new Executable() { // from class: th.f
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f72401a.a(privacySheetParams, (FullScreenAdListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(PrivacySheetParams privacySheetParams, FullScreenAdListener fullScreenAdListener) {
        fullScreenAdListener.onOpenPrivacySheet(this, privacySheetParams);
    }
}

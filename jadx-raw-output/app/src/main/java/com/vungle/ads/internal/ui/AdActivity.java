package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import ck.p;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.OpenActivityDelegate;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.RingerModeReceiver;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import mj.r;

/* JADX INFO: compiled from: AdActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001@\b&\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\bF\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u000f\u0010 \u001a\u00020\u000bH\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010!\u001a\u00020\u0004H\u0014R(\u0010\"\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010+\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u0010)\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00103\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010)\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006P²\u0006\f\u0010I\u001a\u00020H8\nX\u008a\u0084\u0002²\u0006\f\u0010K\u001a\u00020J8\nX\u008a\u0084\u0002²\u0006\f\u0010M\u001a\u00020L8\nX\u008a\u0084\u0002²\u0006\f\u0010O\u001a\u00020N8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ui/AdActivity;", "Landroid/app/Activity;", "", "placement", "Lmj/r;", "onConcurrentPlaybackError", "hideSystemUi", "clearStaticFields", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "hasFocus", "onWindowFocusChanged", "", "requestCode", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "onActivityResult", "intent", "onNewIntent", C3426d4.i.f28569u0, C3426d4.i.f28567t0, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onBackPressed", "requestedOrientation", "setRequestedOrientation", "canRotate$vungle_ads_release", "()Z", "canRotate", "onDestroy", "placementRefId", "Ljava/lang/String;", "getPlacementRefId$vungle_ads_release", "()Ljava/lang/String;", "setPlacementRefId$vungle_ads_release", "(Ljava/lang/String;)V", "getPlacementRefId$vungle_ads_release$annotations", "()V", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "mraidPresenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "getMraidPresenter$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "setMraidPresenter$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/MRAIDPresenter;)V", "getMraidPresenter$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "mraidAdWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "getMraidAdWidget$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "setMraidAdWidget$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;)V", "getMraidAdWidget$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/model/UnclosedAd;", "unclosedAd", "Lcom/vungle/ads/internal/model/UnclosedAd;", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "ringerModeReceiver", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "com/vungle/ads/internal/ui/AdActivity$lifeCycleCallback$1", "lifeCycleCallback", "Lcom/vungle/ads/internal/ui/AdActivity$lifeCycleCallback$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "willPresentInlineInstall", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", VastTagName.COMPANION, "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "Lcom/vungle/ads/internal/executor/Executors;", "executors", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", "omTrackerFactory", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public abstract class AdActivity extends Activity {
    public static final String AD_INVISIBLE_LOGGED_KEY = "ad_invisible_logged";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static AdPayload advertisement;
    private static BidPayload bidPayload;
    private static AdEventListener eventListener;
    private static PresenterDelegate presenterDelegate;
    private MRAIDAdWidget mraidAdWidget;
    private MRAIDPresenter mraidPresenter;
    private UnclosedAd unclosedAd;
    private String placementRefId = "";
    private final RingerModeReceiver ringerModeReceiver = new RingerModeReceiver();
    private final AdActivity$lifeCycleCallback$1 lifeCycleCallback = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.ui.AdActivity$lifeCycleCallback$1
        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onForeground() {
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onBackground() {
            MRAIDPresenter mraidPresenter = this.this$0.getMraidPresenter();
            Long viewStatus = mraidPresenter != null ? mraidPresenter.getViewStatus() : null;
            Logger.INSTANCE.d("AdActivity", "App is in background, status: " + viewStatus);
            if (viewStatus != null) {
                long jLongValue = viewStatus.longValue();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION;
                AdPayload advertisement$vungle_ads_release = AdActivity.INSTANCE.getAdvertisement$vungle_ads_release();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry() : null, null, 8, null);
            }
        }
    };
    private final AtomicBoolean willPresentInlineInstall = new AtomicBoolean(false);

    /* JADX INFO: compiled from: AdActivity.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004J\u0012\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020#H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/ui/AdActivity$Companion;", "", "()V", "AD_INVISIBLE_LOGGED_KEY", "", "REQUEST_KEY_EVENT_ID_EXTRA", "getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations", "REQUEST_KEY_EXTRA", "getREQUEST_KEY_EXTRA$vungle_ads_release$annotations", "TAG", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "getBidPayload$vungle_ads_release", "()Lcom/vungle/ads/internal/model/BidPayload;", "setBidPayload$vungle_ads_release", "(Lcom/vungle/ads/internal/model/BidPayload;)V", "eventListener", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getEventListener$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setEventListener$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "presenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "getPresenterDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "setPresenterDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/PresenterDelegate;)V", "createIntent", "Landroid/content/Intent;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "placement", "eventId", "getEventId", "intent", "getPlacement", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EXTRA);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @VisibleForTesting
        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }

        public final Intent createIntent(Context context, String placement, String eventId) {
            p.j(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString(AdActivity.REQUEST_KEY_EXTRA, placement);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, eventId);
            intent.putExtras(bundle);
            return intent;
        }

        public final AdPayload getAdvertisement$vungle_ads_release() {
            return AdActivity.advertisement;
        }

        public final BidPayload getBidPayload$vungle_ads_release() {
            return AdActivity.bidPayload;
        }

        @VisibleForTesting
        public final AdEventListener getEventListener$vungle_ads_release() {
            return AdActivity.eventListener;
        }

        public final PresenterDelegate getPresenterDelegate$vungle_ads_release() {
            return AdActivity.presenterDelegate;
        }

        public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
            AdActivity.advertisement = adPayload;
        }

        public final void setBidPayload$vungle_ads_release(BidPayload bidPayload) {
            AdActivity.bidPayload = bidPayload;
        }

        public final void setEventListener$vungle_ads_release(AdEventListener adEventListener) {
            AdActivity.eventListener = adEventListener;
        }

        public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
            AdActivity.presenterDelegate = presenterDelegate;
        }
    }

    private final void clearStaticFields() {
        eventListener = null;
        presenterDelegate = null;
        advertisement = null;
        bidPayload = null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }

    @VisibleForTesting(otherwise = 4)
    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44958d, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        p.i(intent, "intent");
        String placement = companion.getPlacement(intent);
        if (placement == null) {
            placement = "";
        }
        this.placementRefId = placement;
        AdPayload adPayload = advertisement;
        Placement placement2 = ConfigManager.INSTANCE.getPlacement(placement);
        frameLayout = null;
        FrameLayout frameLayout = null;
        if (placement2 == null || adPayload == null) {
            AdEventListener adEventListener = eventListener;
            if (adEventListener != null) {
                adEventListener.onError(new AdNotLoadedCantPlay("Can not play fullscreen ad. placement=" + placement2 + " adv=" + adPayload).setLogEntry$vungle_ads_release(adPayload != null ? adPayload.getLogEntry() : null).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
            return;
        }
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(this, adPayload.eventId());
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            long j10 = getIntent().getBooleanExtra(AD_INVISIBLE_LOGGED_KEY, false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(Long.valueOf(j10));
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, adPayload.getLogEntry(), (String) null, 4, (Object) null);
            Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j10);
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            final mj.g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a<SignalManager>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
                @Override // bk.a
                public final SignalManager invoke() {
                    return ServiceLocator.INSTANCE.getInstance(this).getService(SignalManager.class);
                }
            });
            Intent intent2 = getIntent();
            p.i(intent2, "intent");
            String eventId = companion.getEventId(intent2);
            UnclosedAd unclosedAd = eventId != null ? new UnclosedAd(eventId, (String) null, 2, (ck.i) null) : null;
            this.unclosedAd = unclosedAd;
            if (unclosedAd != null) {
                m3272onCreate$lambda1(gVarB).recordUnclosedAd(unclosedAd);
            }
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    MRAIDPresenter mraidPresenter = this.this$0.getMraidPresenter();
                    Long viewStatus = mraidPresenter != null ? mraidPresenter.getViewStatus() : null;
                    if (viewStatus != null) {
                        long jLongValue = viewStatus.longValue();
                        AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION;
                        AdPayload advertisement$vungle_ads_release = AdActivity.INSTANCE.getAdvertisement$vungle_ads_release();
                        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry() : null, null, 8, null);
                    }
                    UnclosedAd unclosedAd2 = this.this$0.unclosedAd;
                    if (unclosedAd2 != null) {
                        AdActivity.m3272onCreate$lambda1(gVarB).removeUnclosedAd(unclosedAd2);
                    }
                    this.this$0.finish();
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent event) {
                    MRAIDPresenter mraidPresenter = this.this$0.getMraidPresenter();
                    if (mraidPresenter == null) {
                        return false;
                    }
                    mraidPresenter.onViewTouched(event);
                    return false;
                }
            });
            mRAIDAdWidget.setOrientationDelegate(new MRAIDAdWidget.OrientationDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$3
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate
                public void setOrientation(int i10) {
                    this.this$0.setRequestedOrientation(i10);
                }
            });
            mj.g gVarB2 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Executors>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // bk.a
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(this).getService(Executors.class);
                }
            });
            mj.g gVarB3 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Platform>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // bk.a
                public final Platform invoke() {
                    return ServiceLocator.INSTANCE.getInstance(this).getService(Platform.class);
                }
            });
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(adPayload, placement2, m3273onCreate$lambda5(gVarB2).getOFFLOAD_EXECUTOR(), m3274onCreate$lambda6(gVarB3));
            OMTracker oMTrackerMake = m3275onCreate$lambda7(kotlin.b.b(lazyThreadSafetyMode, new bk.a<OMTracker.Factory>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // bk.a
                public final OMTracker.Factory invoke() {
                    return ServiceLocator.INSTANCE.getInstance(this).getService(OMTracker.Factory.class);
                }
            })).make(adPayload.omEnabled());
            VungleThreadPoolExecutor job_executor = m3273onCreate$lambda5(gVarB2).getJOB_EXECUTOR();
            orCreateWebViewClient.setWebViewObserver(oMTrackerMake);
            this.ringerModeReceiver.setWebClient(orCreateWebViewClient);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement2, orCreateWebViewClient, job_executor, oMTrackerMake, m3274onCreate$lambda6(gVarB3));
            mRAIDPresenter.setEventListener(eventListener);
            mRAIDPresenter.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            mRAIDPresenter.setOpenActivityDelegate$vungle_ads_release(new OpenActivityDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity.onCreate.5
                public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
                    com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
                    if (p11 == null) {
                        return;
                    }
                    BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44958d);
                    p10.startActivityForResult(p11, p12);
                }

                @Override // com.vungle.ads.internal.presenter.OpenActivityDelegate
                public Pair<Boolean, String> openInlineInstall(Intent intent3) {
                    Object objM3458constructorimpl;
                    p.j(intent3, "intent");
                    AdActivity adActivity = AdActivity.this;
                    try {
                        Result.a aVar = Result.Companion;
                        adActivity.willPresentInlineInstall.set(true);
                        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(adActivity, intent3, 10001);
                        objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                    }
                    AdActivity adActivity2 = AdActivity.this;
                    Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                    if (thM3461exceptionOrNullimpl == null) {
                        return new Pair<>(Boolean.TRUE, null);
                    }
                    adActivity2.willPresentInlineInstall.set(false);
                    return new Pair<>(Boolean.FALSE, thM3461exceptionOrNullimpl.getLocalizedMessage());
                }
            });
            mRAIDPresenter.prepare();
            setContentView(mRAIDAdWidget, mRAIDAdWidget.getLayoutParams());
            try {
                Result.a aVar = Result.Companion;
                getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            ViewCompat.setOnApplyWindowInsetsListener(mRAIDAdWidget, new OnApplyWindowInsetsListener() { // from class: com.vungle.ads.internal.ui.a
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return AdActivity.m3276onCreate$lambda9(this.f45461a, view, windowInsetsCompat);
                }
            });
            hideSystemUi();
            AdConfig adConfig = adPayload.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    WatermarkView watermarkView = new WatermarkView(this, watermark$vungle_ads_release);
                    frameLayout.addView(watermarkView);
                    watermarkView.bringToFront();
                }
            }
            this.mraidAdWidget = mRAIDAdWidget;
            this.mraidPresenter = mRAIDPresenter;
            ActivityManager.INSTANCE.addLifecycleListener(this.lifeCycleCallback);
            try {
                Result.m3458constructorimpl(registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED")));
            } catch (Throwable th3) {
                Result.a aVar3 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th3));
            }
        } catch (InstantiationException e10) {
            AdEventListener adEventListener2 = eventListener;
            if (adEventListener2 != null) {
                adEventListener2.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(adPayload.getLogEntry()).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        p.j(intent, "intent");
        super.onNewIntent(intent);
        Companion companion = INSTANCE;
        Intent intent2 = getIntent();
        p.i(intent2, "getIntent()");
        Pair pairA = mj.h.a(companion.getPlacement(intent2), companion.getPlacement(intent));
        String str = (String) pairA.component1();
        String str2 = (String) pairA.component2();
        Intent intent3 = getIntent();
        p.i(intent3, "getIntent()");
        Pair pairA2 = mj.h.a(companion.getEventId(intent3), companion.getEventId(intent));
        String str3 = (String) pairA2.component1();
        String str4 = (String) pairA2.component2();
        if ((str == null || str2 == null || p.e(str, str2)) && (str3 == null || str4 == null || p.e(str3, str4))) {
            return;
        }
        Logger.INSTANCE.d(TAG, "Tried to play another placement " + str2 + " while playing " + str);
        onConcurrentPlaybackError(str2);
    }

    private final void onConcurrentPlaybackError(String str) {
        ConcurrentPlaybackUnsupported concurrentPlaybackUnsupported = new ConcurrentPlaybackUnsupported("Trying to show " + str + " but " + this.placementRefId + " is already showing");
        AdPayload adPayload = advertisement;
        VungleError vungleErrorLogError$vungle_ads_release = concurrentPlaybackUnsupported.setLogEntry$vungle_ads_release(adPayload != null ? adPayload.getLogEntry() : null).logError$vungle_ads_release();
        AdEventListener adEventListener = eventListener;
        if (adEventListener != null) {
            adEventListener.onError(vungleErrorLogError$vungle_ads_release, str);
        }
        Logger.INSTANCE.e(TAG, "onConcurrentPlaybackError: " + vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
    }

    /* JADX INFO: renamed from: getMraidAdWidget$vungle_ads_release, reason: from getter */
    public final MRAIDAdWidget getMraidAdWidget() {
        return this.mraidAdWidget;
    }

    /* JADX INFO: renamed from: getMraidPresenter$vungle_ads_release, reason: from getter */
    public final MRAIDPresenter getMraidPresenter() {
        return this.mraidPresenter;
    }

    /* JADX INFO: renamed from: getPlacementRefId$vungle_ads_release, reason: from getter */
    public final String getPlacementRefId() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        p.j(configuration, "newConfig");
        try {
            super.onConfigurationChanged(configuration);
            int i10 = configuration.orientation;
            if (i10 == 2) {
                Logger.INSTANCE.d(TAG, C3426d4.i.C);
            } else if (i10 == 1) {
                Logger.INSTANCE.d(TAG, C3426d4.i.D);
            }
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.onViewConfigurationChanged();
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "onConfigurationChanged: " + e10.getLocalizedMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        MRAIDPresenter mRAIDPresenter2 = this.mraidPresenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.setOpenActivityDelegate$vungle_ads_release(null);
        }
        ActivityManager.INSTANCE.removeLifecycleListener(this.lifeCycleCallback);
        try {
            Result.a aVar = Result.Companion;
            unregisterReceiver(this.ringerModeReceiver);
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        clearStaticFields();
        this.mraidPresenter = null;
        super.onDestroy();
    }

    public final void setMraidAdWidget$vungle_ads_release(MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        p.j(str, "<set-?>");
        this.placementRefId = str;
    }

    private final void hideSystemUi() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        p.i(insetsController, "getInsetsController(window, window.decorView)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final SignalManager m3272onCreate$lambda1(mj.g<SignalManager> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-5, reason: not valid java name */
    private static final Executors m3273onCreate$lambda5(mj.g<? extends Executors> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final Platform m3274onCreate$lambda6(mj.g<? extends Platform> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final OMTracker.Factory m3275onCreate$lambda7(mj.g<OMTracker.Factory> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-9, reason: not valid java name */
    public static final WindowInsetsCompat m3276onCreate$lambda9(AdActivity adActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        p.j(adActivity, "this$0");
        p.j(view, "v");
        p.j(windowInsetsCompat, "insets");
        if (!adActivity.willPresentInlineInstall.get()) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            p.i(insets, "insets.getInsets(\n      …t()\n                    )");
            view.setPadding(insets.left, insets.f3822top, insets.right, insets.bottom);
        }
        return windowInsetsCompat;
    }

    @Override // android.app.Activity
    public void onActivityResult(final int i10, final int i11, final Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.AdActivity.onActivityResult.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public final String invoke() {
                return "onActivityResult: " + i10 + ", " + i11 + ", " + intent;
            }
        });
        if (i10 == 10001) {
            this.willPresentInlineInstall.set(false);
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release("onActivityResultCode=" + i11);
            }
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            hideSystemUi();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i10);
        }
    }
}

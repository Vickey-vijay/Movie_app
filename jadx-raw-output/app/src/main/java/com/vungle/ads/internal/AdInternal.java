package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import bk.l;
import ck.i;
import ck.p;
import cl.m;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.load.AdRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.load.RealtimeAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import mj.g;
import mj.r;
import nj.s;
import xk.h;

/* JADX INFO: compiled from: AdInternal.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 f2\u00020\u0001:\u0002gfB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bd\u0010eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\n\u0010\f\u001a\u0004\u0018\u00010\tH&J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0001J\u000f\u0010\u0015\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018J!\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.R*\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010#R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010GR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u001a\u0010U\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bY\u0010WR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006t²\u0006\f\u0010i\u001a\u00020h8\nX\u008a\u0084\u0002²\u0006\f\u0010k\u001a\u00020j8\nX\u008a\u0084\u0002²\u0006\f\u0010m\u001a\u00020l8\nX\u008a\u0084\u0002²\u0006\f\u0010o\u001a\u00020n8\nX\u008a\u0084\u0002²\u0006\f\u0010q\u001a\u00020p8\nX\u008a\u0084\u0002²\u0006\f\u0010s\u001a\u00020r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "", "onPlay", "Lcom/vungle/ads/VungleError;", "canPlayAd", "Lcom/vungle/ads/internal/model/Placement;", "placement", "isValidAdTypeForPlacement", "Lcom/vungle/ads/VungleAdSize;", C3426d4.i.O, "isValidAdSize", "getAdSizeForAdRequest", "", "placementId", "adMarkup", "adLoaderCallback", "Lmj/r;", f.H, "cancelDownload$vungle_ads_release", "()V", "cancelDownload", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "adPlayCallback", "play", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "renderAd$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;Lcom/vungle/ads/internal/model/AdPayload;)V", "renderAd", "onSuccess", "adLoadedAndUpdateConfigure$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "adLoadedAndUpdateConfigure", "error", "onFailure", "", IronSourceConstants.EVENTS_ERROR_CODE, "isErrorTerminal$vungle_ads_release", "(I)Z", "isErrorTerminal", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "value", "adState", "Lcom/vungle/ads/internal/AdInternal$AdState;", "getAdState", "()Lcom/vungle/ads/internal/AdInternal$AdState;", "setAdState", "(Lcom/vungle/ads/internal/AdInternal$AdState;)V", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement", "Lcom/vungle/ads/internal/model/Placement;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "setPlacement", "(Lcom/vungle/ads/internal/model/Placement;)V", "Lcom/vungle/ads/internal/model/BidPayload;", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "getBidPayload", "()Lcom/vungle/ads/internal/model/BidPayload;", "setBidPayload", "(Lcom/vungle/ads/internal/model/BidPayload;)V", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "Lmj/g;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "baseAdLoader", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "Lcom/vungle/ads/TimeIntervalMetric;", "requestMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "loadMetric", "showToValidationMetric", "getShowToValidationMetric$vungle_ads_release", "()Lcom/vungle/ads/TimeIntervalMetric;", "validationToPresentMetric", "getValidationToPresentMetric$vungle_ads_release", "Ljava/lang/ref/WeakReference;", "playContext", "Ljava/lang/ref/WeakReference;", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "<init>", "(Landroid/content/Context;)V", VastTagName.COMPANION, "AdState", "Lcom/vungle/ads/internal/task/JobRunner;", "jobRunner", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "omInjector", "Lcom/vungle/ads/internal/executor/SDKExecutors;", "sdkExecutors", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloader", "Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public abstract class AdInternal implements AdLoaderCallback {
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private AdLoaderCallback adLoaderCallback;
    private AdState adState;
    private AdPayload advertisement;
    private BaseAdLoader baseAdLoader;
    private BidPayload bidPayload;
    private final Context context;
    private TimeIntervalMetric loadMetric;
    private LogEntry logEntry;
    private Placement placement;
    private WeakReference<Context> playContext;
    private TimeIntervalMetric requestMetric;
    private final TimeIntervalMetric showToValidationMetric;
    private final TimeIntervalMetric validationToPresentMetric;

    /* JADX INFO: renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final g vungleApiClient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final cl.a json = m.b(null, new l<cl.d, r>() { // from class: com.vungle.ads.internal.AdInternal$Companion$json$1
        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(cl.d dVar) {
            invoke2(dVar);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(cl.d dVar) {
            p.j(dVar, "$this$Json");
            dVar.f(true);
            dVar.d(true);
            dVar.e(false);
        }
    }, 1, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AdInternal.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H&J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState;", "", "(Ljava/lang/String;I)V", "canTransitionTo", "", "adState", "isTerminalState", "transitionTo", "NEW", "LOADING", "READY", "PLAYING", "FINISHED", "ERROR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AdState {
        public static final AdState NEW = new NEW("NEW", 0);
        public static final AdState LOADING = new LOADING("LOADING", 1);
        public static final AdState READY = new READY("READY", 2);
        public static final AdState PLAYING = new PLAYING("PLAYING", 3);
        public static final AdState FINISHED = new FINISHED("FINISHED", 4);
        public static final AdState ERROR = new ERROR("ERROR", 5);
        private static final /* synthetic */ AdState[] $VALUES = $values();

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$ERROR;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class ERROR extends AdState {
            public ERROR(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                p.j(adState, "adState");
                return adState == AdState.FINISHED;
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$FINISHED;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class FINISHED extends AdState {
            public FINISHED(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                p.j(adState, "adState");
                return false;
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$LOADING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class LOADING extends AdState {
            public LOADING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                p.j(adState, "adState");
                return adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$NEW;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class NEW extends AdState {
            public NEW(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                p.j(adState, "adState");
                return adState == AdState.LOADING || adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$PLAYING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class PLAYING extends AdState {
            public PLAYING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                p.j(adState, "adState");
                return adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$READY;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class READY extends AdState {
            public READY(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                p.j(adState, "adState");
                return adState == AdState.PLAYING || adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        private static final /* synthetic */ AdState[] $values() {
            return new AdState[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
        }

        private AdState(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ AdState(String str, int i10, i iVar) {
            this(str, i10);
        }

        public static AdState valueOf(String str) {
            return (AdState) Enum.valueOf(AdState.class, str);
        }

        public static AdState[] values() {
            return (AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(AdState adState);

        public final boolean isTerminalState() {
            return s.n(FINISHED, ERROR).contains(this);
        }

        public final AdState transitionTo(AdState adState) {
            p.j(adState, "adState");
            if (this != adState && !canTransitionTo(adState)) {
                String str = "Cannot transition from " + name() + " to " + adState.name();
                if (AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                    throw new IllegalStateException(str);
                }
                Logger.INSTANCE.e(AdInternal.TAG, "Illegal state transition", new IllegalStateException(str));
            }
            return adState;
        }
    }

    /* JADX INFO: compiled from: AdInternal.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "THROW_ON_ILLEGAL_TRANSITION", "Z", "Lcl/a;", "json", "Lcl/a;", "getJson$annotations", "()V", "<init>", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdInternal.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            iArr[AdState.NEW.ordinal()] = 1;
            iArr[AdState.LOADING.ordinal()] = 2;
            iArr[AdState.READY.ordinal()] = 3;
            iArr[AdState.PLAYING.ordinal()] = 4;
            iArr[AdState.FINISHED.ordinal()] = 5;
            iArr[AdState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        p.j(advertisement, "advertisement");
    }

    public abstract VungleAdSize getAdSizeForAdRequest();

    public abstract boolean isValidAdSize(VungleAdSize adSize);

    public abstract boolean isValidAdTypeForPlacement(Placement placement);

    public AdInternal(final Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        this.adState = AdState.NEW;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.vungleApiClient = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<VungleApiClient>() { // from class: com.vungle.ads.internal.AdInternal$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // bk.a
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        });
        this.showToValidationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
    }

    public static /* synthetic */ VungleError canPlayAd$default(AdInternal adInternal, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return adInternal.canPlayAd(z10);
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient.getValue();
    }

    public final VungleError canPlayAd(boolean onPlay) {
        VungleError adExpiredOnPlayError;
        AdPayload.AdUnit adUnit;
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            adExpiredOnPlayError = new AdNotLoadedCantPlay("adv is null on onPlay=" + onPlay);
        } else {
            AdState adState = this.adState;
            if (adState == AdState.PLAYING) {
                adExpiredOnPlayError = new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
            } else {
                if (adState == AdState.READY) {
                    boolean z10 = adPayload != null && adPayload.hasExpired();
                    adExpiredOnPlayError = null;
                    expiry = null;
                    Integer expiry = null;
                    if (z10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Ad expiry: ");
                        AdPayload adPayload2 = this.advertisement;
                        if (adPayload2 != null && (adUnit = adPayload2.adUnit()) != null) {
                            expiry = adUnit.getExpiry();
                        }
                        sb2.append(expiry);
                        sb2.append(", device: ");
                        sb2.append(System.currentTimeMillis());
                        String string = sb2.toString();
                        adExpiredOnPlayError = onPlay ? new AdExpiredOnPlayError(string) : new AdExpiredError(string);
                    }
                    return adExpiredOnPlayError;
                }
                adExpiredOnPlayError = new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.adState + " is not READY");
            }
        }
        if (onPlay) {
            adExpiredOnPlayError.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return adExpiredOnPlayError;
    }

    public final void cancelDownload$vungle_ads_release() {
        AdPayload adPayload = this.advertisement;
        if (adPayload != null && adPayload.isPartialDownloadEnabled()) {
            Logger.INSTANCE.d(TAG, "Skip cancelling download for ads with partial download enabled.");
            return;
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    public final AdState getAdState() {
        return this.adState;
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final BidPayload getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: getShowToValidationMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getShowToValidationMetric() {
        return this.showToValidationMetric;
    }

    /* JADX INFO: renamed from: getValidationToPresentMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getValidationToPresentMetric() {
        return this.validationToPresentMetric;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int errorCode) {
        return this.adState == AdState.READY && errorCode == 304;
    }

    public final void loadAd(String str, String str2, AdLoaderCallback adLoaderCallback) {
        Sdk.SDKError.Reason reason;
        p.j(str, "placementId");
        p.j(adLoaderCallback, "adLoaderCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
        this.adLoaderCallback = adLoaderCallback;
        if (!VungleAds.INSTANCE.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized("SDK not initialized").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        ConfigManager configManager = ConfigManager.INSTANCE;
        Placement placement = configManager.getPlacement(str);
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(placement.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } else if (placement.getHeaderBidding()) {
                if (str2 == null || str2.length() == 0) {
                    adLoaderCallback.onFailure(new EmptyBidPayloadError(str).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                    return;
                }
            }
        } else if (configManager.configLastValidatedTimestamp() != -1) {
            adLoaderCallback.onFailure(new PlacementNotFoundError(str).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        } else {
            Placement placement2 = new Placement(str, false, (String) null, 6, (i) null);
            this.placement = placement2;
            placement = placement2;
        }
        VungleAdSize adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(adSizeForAdRequest != null ? adSizeForAdRequest.toString() : null).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        AdState adState = this.adState;
        if (adState != AdState.NEW) {
            switch (WhenMappings.$EnumSwitchMapping$0[adState.ordinal()]) {
                case 1:
                    throw new NotImplementedError(null, 1, null);
                case 2:
                    reason = Sdk.SDKError.Reason.AD_IS_LOADING;
                    break;
                case 3:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 4:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk.SDKError.Reason.AD_CONSUMED;
                    break;
                case 6:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        TimeIntervalMetric timeIntervalMetric2 = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = timeIntervalMetric2;
        timeIntervalMetric2.markStart();
        if (!(str2 == null || str2.length() == 0)) {
            try {
                cl.a aVar = json;
                xk.b<Object> bVarB = h.b(aVar.a(), ck.s.l(BidPayload.class));
                p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.bidPayload = (BidPayload) aVar.b(bVarB, str2);
            } catch (IllegalArgumentException e10) {
                adLoaderCallback.onFailure(new AdMarkupInvalidError("Unable to decode payload into BidPayload object. Error: " + e10.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } catch (Throwable th2) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        setAdState(AdState.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a<OMInjector>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
            @Override // bk.a
            public final OMInjector invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(OMInjector.class);
            }
        });
        final Context context2 = this.context;
        g gVarB2 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<SDKExecutors>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.SDKExecutors, java.lang.Object] */
            @Override // bk.a
            public final SDKExecutors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(SDKExecutors.class);
            }
        });
        final Context context3 = this.context;
        g gVarB3 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<PathProvider>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // bk.a
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context3).getService(PathProvider.class);
            }
        });
        final Context context4 = this.context;
        g gVarB4 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Downloader>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.Downloader, java.lang.Object] */
            @Override // bk.a
            public final Downloader invoke() {
                return ServiceLocator.INSTANCE.getInstance(context4).getService(Downloader.class);
            }
        });
        if (str2 == null || str2.length() == 0) {
            this.baseAdLoader = new DefaultAdLoader(this.context, getVungleApiClient(), m3212loadAd$lambda3(gVarB2), m3211loadAd$lambda2(gVarB), m3214loadAd$lambda5(gVarB4), m3213loadAd$lambda4(gVarB3), new AdRequest(placement, null, adSizeForAdRequest));
        } else {
            this.baseAdLoader = new RealtimeAdLoader(this.context, getVungleApiClient(), m3212loadAd$lambda3(gVarB2), m3211loadAd$lambda2(gVarB), m3214loadAd$lambda5(gVarB4), m3213loadAd$lambda4(gVarB3), new AdRequest(placement, this.bidPayload, adSizeForAdRequest));
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.setLogEntry$vungle_ads_release(this.logEntry);
        }
        BaseAdLoader baseAdLoader2 = this.baseAdLoader;
        if (baseAdLoader2 != null) {
            baseAdLoader2.loadAd(this);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onFailure(VungleError vungleError) {
        p.j(vungleError, "error");
        setAdState(AdState.ERROR);
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, vungleError.getCode() + '-' + vungleError.getErrorMessage());
        }
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onFailure(vungleError);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onSuccess(AdPayload adPayload) {
        p.j(adPayload, "advertisement");
        this.advertisement = adPayload;
        setAdState(AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(adPayload);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(adPayload);
        }
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            if (!adPayload.adLoadOptimizationEnabled()) {
                timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, this.logEntry, (String) null, 4, (Object) null);
        }
        TimeIntervalMetric timeIntervalMetric2 = this.requestMetric;
        if (timeIntervalMetric2 != null) {
            if (!adPayload.adLoadOptimizationEnabled()) {
                timeIntervalMetric2.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric2.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric2, this.logEntry, (String) null, 4, (Object) null);
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.context;
            g gVarB = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<TpatSender>() { // from class: com.vungle.ads.internal.AdInternal$onSuccess$lambda-11$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
                @Override // bk.a
                public final TpatSender invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
                }
            });
            List tpatUrls$default = AdPayload.getTpatUrls$default(adPayload, Constants.AD_LOAD_DURATION, String.valueOf(timeIntervalMetric2.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(m3215onSuccess$lambda11$lambda9(gVarB), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_LOAD_DURATION).withLogEntry(this.logEntry).build(), false, 2, null);
                }
            }
        }
    }

    public final void play(Context context, final AdPlayCallback adPlayCallback) {
        p.j(adPlayCallback, "adPlayCallback");
        this.showToValidationMetric.markStart();
        this.playContext = context != null ? new WeakReference<>(context) : null;
        VungleError vungleErrorCanPlayAd = canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            adPlayCallback.onFailure(vungleErrorCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                setAdState(AdState.ERROR);
                return;
            }
            return;
        }
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            return;
        }
        AdPlayCallbackWrapper adPlayCallbackWrapper = new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.AdInternal$play$callbackWrapper$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) {
                this.setAdState(AdInternal.AdState.PLAYING);
                this.getValidationToPresentMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.getValidationToPresentMetric(), this.getLogEntry(), (String) null, 4, (Object) null);
                super.onAdStart(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError vungleError) {
                p.j(vungleError, "error");
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(vungleError);
            }
        };
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(adPlayCallbackWrapper, adPayload);
    }

    public void renderAd$vungle_ads_release(final AdPlayCallback listener, AdPayload advertisement) {
        Context context;
        p.j(advertisement, "advertisement");
        AdActivity.Companion companion = AdActivity.INSTANCE;
        final Placement placement = this.placement;
        companion.setEventListener$vungle_ads_release(new AdEventListener(listener, placement) { // from class: com.vungle.ads.internal.AdInternal$renderAd$1
        });
        companion.setAdvertisement$vungle_ads_release(advertisement);
        companion.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        p.i(context, "playContext?.get() ?: context");
        Placement placement2 = this.placement;
        if (placement2 == null) {
            return;
        }
        Intent intentCreateIntent = companion.createIntent(context, placement2.getReferenceId(), advertisement.eventId());
        ActivityManager.Companion companion2 = ActivityManager.INSTANCE;
        if (!companion2.isForeground()) {
            Logger.INSTANCE.d(TAG, "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentCreateIntent.putExtra(AdActivity.AD_INVISIBLE_LOGGED_KEY, true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(1L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.logEntry, (String) null, 4, (Object) null);
        }
        this.showToValidationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.showToValidationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.validationToPresentMetric.markStart();
        companion2.startWhenForeground(context, null, intentCreateIntent, null);
    }

    public final void setAdvertisement(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setBidPayload(BidPayload bidPayload) {
        this.bidPayload = bidPayload;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /* JADX INFO: renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final JobRunner m3210_set_adState_$lambda1$lambda0(g<? extends JobRunner> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final OMInjector m3211loadAd$lambda2(g<OMInjector> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final SDKExecutors m3212loadAd$lambda3(g<SDKExecutors> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final PathProvider m3213loadAd$lambda4(g<PathProvider> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final Downloader m3214loadAd$lambda5(g<? extends Downloader> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: onSuccess$lambda-11$lambda-9, reason: not valid java name */
    private static final TpatSender m3215onSuccess$lambda11$lambda9(g<TpatSender> gVar) {
        return gVar.getValue();
    }

    public final void setAdState(AdState adState) {
        AdPayload adPayload;
        String strEventId;
        p.j(adState, "value");
        if (adState.isTerminalState() && (adPayload = this.advertisement) != null && (strEventId = adPayload.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.context;
            m3210_set_adState_$lambda1$lambda0(kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<JobRunner>() { // from class: com.vungle.ads.internal.AdInternal$_set_adState_$lambda-1$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // bk.a
                public final JobRunner invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(JobRunner.class);
                }
            })).execute(CleanupJob.INSTANCE.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(adState);
    }
}

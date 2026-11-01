package com.vungle.ads.internal.presenter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.HeartbeatMissingError;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.LinkError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.SuspendableTimer;
import com.vungle.ads.internal.util.ThreadUtil;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import mj.g;
import mj.h;
import mj.r;

/* JADX INFO: compiled from: MRAIDPresenter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 Æ\u00012\u00020\u00012\u00020\u0002:\u0002Æ\u0001BA\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010a\u001a\u00020`\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J$\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u0019\u0010 \u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010%\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010&\u001a\u00020\u0003J\u0006\u0010'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0003J\u0010\u0010+\u001a\u00020\u00032\b\b\u0001\u0010*\u001a\u00020)J\u000e\u0010-\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000bJ\u0010\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.J\u0006\u00101\u001a\u00020\u0003J%\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0006042\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106J\u001b\u0010:\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b<\u0010=J\u0018\u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?H\u0016J\u0018\u0010D\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u000bH\u0016J#\u0010G\u001a\u00020\u000b2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010C\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bG\u0010HJ\u001c\u0010L\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010E2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016J\u0006\u0010M\u001a\u00020\u0003J\u000f\u0010P\u001a\u00020\u000bH\u0000¢\u0006\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR(\u0010f\u001a\u00020;8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bl\u0010m\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR*\u0010n\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bn\u0010o\u0012\u0004\bt\u0010m\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010u\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR \u0010x\u001a\u00020w8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bx\u0010y\u0012\u0004\b|\u0010m\u001a\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010yR.\u0010~\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0004\b~\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010m\u001a\u0005\b\u0080\u0001\u0010=\"\u0006\b\u0081\u0001\u0010\u0082\u0001R1\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0089\u0001\u0010m\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0005\b\u0088\u0001\u00109R!\u0010\u008f\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0094\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008c\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R!\u0010\u0099\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u008c\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R!\u0010\u009e\u0001\u001a\u00030\u009a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u008c\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u009f\u0001R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010 \u0001R!\u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u008c\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R#\u0010ª\u0001\u001a\u0005\u0018\u00010¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010\u008c\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R.\u0010«\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b«\u0001\u0010v\u0012\u0005\b¯\u0001\u0010m\u001a\u0005\b¬\u0001\u0010O\"\u0006\b\u00ad\u0001\u0010®\u0001R(\u0010µ\u0001\u001a\u00030°\u00018@X\u0081\u0084\u0002¢\u0006\u0017\n\u0006\b±\u0001\u0010\u008c\u0001\u0012\u0005\b´\u0001\u0010m\u001a\u0006\b²\u0001\u0010³\u0001R.\u0010¶\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b¶\u0001\u0010v\u0012\u0005\b¹\u0001\u0010m\u001a\u0005\b·\u0001\u0010O\"\u0006\b¸\u0001\u0010®\u0001R(\u0010¿\u0001\u001a\u00030º\u00018@X\u0081\u0084\u0002¢\u0006\u0017\n\u0006\b»\u0001\u0010\u008c\u0001\u0012\u0005\b¾\u0001\u0010m\u001a\u0006\b¼\u0001\u0010½\u0001R-\u0010À\u0001\u001a\u00020;8\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\bÀ\u0001\u0010g\u0012\u0005\bÃ\u0001\u0010m\u001a\u0005\bÁ\u0001\u0010i\"\u0005\bÂ\u0001\u0010k¨\u0006Ç\u0001"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "Lmj/r;", "sendAdCloseEvent", "closeView", "", "deeplinkUrl", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "createDeeplinkCallback", "url", "", "launchInlineInstall", "message", "logInlineInstallFailure", C3426d4.i.W, "triggerEventMetricForTpat", "Lcom/vungle/ads/VungleError;", "reason", "makeBusError", "reportErrorAndCloseAd", "fatal", "errorMessage", "handleWebViewException", "loadMraidAd", "Lcom/vungle/ads/internal/presenter/AdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setEventListener", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "presenterDelegate", "setPresenterDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/PresenterDelegate;)V", "setPresenterDelegate", "Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;", "appStoreDelegate", "setOpenActivityDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;)V", "setOpenActivityDelegate", "onViewConfigurationChanged", "start", "stop", "", "stopReason", "detach", C3426d4.i.f28556o, "setAdVisibility", "Landroid/view/MotionEvent;", "event", "onViewTouched", "handleExit", "Landroid/content/Intent;", "intent", "Lkotlin/Pair;", "checkInlineInstallIntent$vungle_ads_release", "(Landroid/content/Intent;)Lkotlin/Pair;", "checkInlineInstallIntent", "logInlineInstallSuccess$vungle_ads_release", "(Ljava/lang/String;)V", "logInlineInstallSuccess", "", "getViewStatus", "()Ljava/lang/Long;", f.b.f30923g, "Lkotlinx/serialization/json/JsonObject;", "arguments", "processCommand", "errorDesc", "didCrash", "onReceivedError", "Landroid/webkit/WebView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onWebRenderingProcessGone", "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "webView", "Landroid/webkit/WebViewRenderProcess;", "webViewRenderProcess", "onRenderProcessUnresponsive", "prepare", "shouldBlockAutoRedirect$vungle_ads_release", "()Z", "shouldBlockAutoRedirect", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "Lcom/vungle/ads/internal/model/Placement;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "vungleWebClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "omTracker", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "lastUserInteractionTimestamp", "J", "getLastUserInteractionTimestamp$vungle_ads_release", "()J", "setLastUserInteractionTimestamp$vungle_ads_release", "(J)V", "getLastUserInteractionTimestamp$vungle_ads_release$annotations", "()V", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getBus", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setBus", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "getBus$annotations", "cp0Fired", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release$annotations", "sendReportIncentivized", "adStartTime", "Ljava/lang/Long;", "getAdStartTime$vungle_ads_release", "setAdStartTime$vungle_ads_release", "(Ljava/lang/Long;)V", "getAdStartTime$vungle_ads_release$annotations", "userId", "Ljava/lang/String;", "getUserId$vungle_ads_release", "()Ljava/lang/String;", "setUserId$vungle_ads_release", "getUserId$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "Lmj/g;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider$delegate", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;", "Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler$delegate", "getScheduler", "()Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "heartbeatEnabled", "getHeartbeatEnabled$vungle_ads_release", "setHeartbeatEnabled$vungle_ads_release", "(Z)V", "getHeartbeatEnabled$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/util/SuspendableTimer;", "suspendableTimer$delegate", "getSuspendableTimer$vungle_ads_release", "()Lcom/vungle/ads/internal/util/SuspendableTimer;", "getSuspendableTimer$vungle_ads_release$annotations", "suspendableTimer", "backEnabled", "getBackEnabled$vungle_ads_release", "setBackEnabled$vungle_ads_release", "getBackEnabled$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "clickCoordinateTracker$delegate", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "clickCoordinateTracker", "videoLength", "getVideoLength$vungle_ads_release", "setVideoLength$vungle_ads_release", "getVideoLength$vungle_ads_release$annotations", "<init>", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/ui/VungleWebClient;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/omsdk/OMTracker;Lcom/vungle/ads/internal/platform/Platform;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_APP_STORE = "openAppStore";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String PING_URL = "pingUrl";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    private Long adStartTime;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private OpenActivityDelegate appStoreDelegate;
    private boolean backEnabled;
    private AdEventListener bus;

    /* JADX INFO: renamed from: clickCoordinateTracker$delegate, reason: from kotlin metadata */
    private final g clickCoordinateTracker;
    private boolean cp0Fired;
    private Executor executor;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;

    /* JADX INFO: renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final g logEntry;
    private final OMTracker omTracker;

    /* JADX INFO: renamed from: pathProvider$delegate, reason: from kotlin metadata */
    private final g pathProvider;
    private final Placement placement;
    private final Platform platform;
    private PresenterDelegate presenterDelegate;

    /* JADX INFO: renamed from: scheduler$delegate, reason: from kotlin metadata */
    private final g scheduler;
    private final AtomicBoolean sendReportIncentivized;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final g signalManager;

    /* JADX INFO: renamed from: suspendableTimer$delegate, reason: from kotlin metadata */
    private final g suspendableTimer;

    /* JADX INFO: renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final g tpatSender;
    private String userId;
    private long videoLength;

    /* JADX INFO: renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final g vungleApiClient;
    private final VungleWebClient vungleWebClient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = kotlin.collections.a.m(h.a("checkpoint.0", Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), h.a("clickUrl", Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    @VisibleForTesting
    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBus$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView view, Boolean didCrash) {
        boolean zBooleanValue = didCrash != null ? didCrash.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone("didCrash=" + zBooleanValue), zBooleanValue, null, 4, null);
        return true;
    }

    /* JADX INFO: compiled from: MRAIDPresenter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0002R\u0016\u0010\u0019\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0002R\u0016\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0002R\u0016\u0010\u001d\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0002R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0002R\u0016\u0010\"\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b#\u0010\u0002R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b'\u0010\u0002R(\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020*0)8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter$Companion;", "", "()V", "ACTION", "", "ACTION_WITH_VALUE", "getACTION_WITH_VALUE$vungle_ads_release$annotations", "CLOSE", "getCLOSE$vungle_ads_release$annotations", "CONSENT_ACTION", "getCONSENT_ACTION$vungle_ads_release$annotations", "CREATIVE_HEARTBEAT", "getCREATIVE_HEARTBEAT$vungle_ads_release$annotations", "ERROR", "getERROR$vungle_ads_release$annotations", "GET_AVAILABLE_DISK_SPACE", "getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations", "HEARTBEAT_INTERVAL", "", "OPEN", "getOPEN$vungle_ads_release$annotations", "OPEN_APP_STORE", "OPEN_NON_MRAID", "OPEN_PRIVACY", "getOPEN_PRIVACY$vungle_ads_release$annotations", "PING_URL", "getPING_URL$vungle_ads_release$annotations", "SET_ORIENTATION_PROPERTIES", "getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations", "SUCCESSFUL_VIEW", "getSUCCESSFUL_VIEW$vungle_ads_release$annotations", "TAG", "TPAT", "getTPAT$vungle_ads_release$annotations", "UPDATE_SIGNALS", "getUPDATE_SIGNALS$vungle_ads_release$annotations", "USE_CUSTOM_CLOSE", "USE_CUSTOM_PRIVACY", "VIDEO_LENGTH", "getVIDEO_LENGTH$vungle_ads_release$annotations", "eventMap", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getEventMap$vungle_ads_release$annotations", "getEventMap$vungle_ads_release", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return MRAIDPresenter.eventMap;
        }
    }

    public MRAIDPresenter(MRAIDAdWidget mRAIDAdWidget, AdPayload adPayload, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker oMTracker, Platform platform) {
        p.j(mRAIDAdWidget, "adWidget");
        p.j(adPayload, "advertisement");
        p.j(placement, "placement");
        p.j(vungleWebClient, "vungleWebClient");
        p.j(executor, "executor");
        p.j(oMTracker, "omTracker");
        p.j(platform, "platform");
        this.adWidget = mRAIDAdWidget;
        this.advertisement = adPayload;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = oMTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = mRAIDAdWidget.getContext();
        p.i(context, "adWidget.context");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.vungleApiClient = kotlin.b.b(lazyThreadSafetyMode, new bk.a<VungleApiClient>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$1
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
        final Context context2 = mRAIDAdWidget.getContext();
        p.i(context2, "adWidget.context");
        this.pathProvider = kotlin.b.b(lazyThreadSafetyMode, new bk.a<PathProvider>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // bk.a
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(PathProvider.class);
            }
        });
        final Context context3 = mRAIDAdWidget.getContext();
        p.i(context3, "adWidget.context");
        this.signalManager = kotlin.b.b(lazyThreadSafetyMode, new bk.a<SignalManager>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // bk.a
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context3).getService(SignalManager.class);
            }
        });
        final Context context4 = mRAIDAdWidget.getContext();
        p.i(context4, "adWidget.context");
        this.tpatSender = kotlin.b.b(lazyThreadSafetyMode, new bk.a<TpatSender>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // bk.a
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context4).getService(TpatSender.class);
            }
        });
        this.scheduler = kotlin.b.a(new bk.a<HandlerScheduler>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$scheduler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final HandlerScheduler invoke() {
                return new HandlerScheduler();
            }
        });
        this.logEntry = kotlin.b.a(new bk.a<LogEntry>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logEntry$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final LogEntry invoke() {
                return this.this$0.advertisement.getLogEntry();
            }
        });
        this.suspendableTimer = kotlin.b.a(new bk.a<SuspendableTimer>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final SuspendableTimer invoke() {
                final MRAIDPresenter mRAIDPresenter = this.this$0;
                return new SuspendableTimer(6.0d, true, null, new bk.a<r>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2.1
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        mRAIDPresenter.reportErrorAndCloseAd(new HeartbeatMissingError());
                    }
                }, 4, null);
            }
        });
        this.clickCoordinateTracker = kotlin.b.a(new bk.a<ClickCoordinateTracker>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$clickCoordinateTracker$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ClickCoordinateTracker invoke() {
                Context context5 = this.this$0.adWidget.getContext();
                p.i(context5, "adWidget.context");
                return new ClickCoordinateTracker(context5, this.this$0.advertisement);
            }
        });
    }

    private final void closeView() {
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        if (threadUtil.isMainThread()) {
            this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.c
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m3256closeView$lambda3(this.f45454b);
                }
            });
        } else {
            sendAdCloseEvent();
        }
        threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.closeView.2
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MRAIDPresenter.this.adWidget.close();
            }
        });
    }

    private final PresenterAdOpenCallback createDeeplinkCallback(final String deeplinkUrl) {
        return new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.createDeeplinkCallback.1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean z10) {
                if (!z10) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                List tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, Constants.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null);
                if (tpatUrls$default != null) {
                    MRAIDPresenter mRAIDPresenter = this;
                    Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(mRAIDPresenter.getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(mRAIDPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry.getValue();
    }

    private final PathProvider getPathProvider() {
        return (PathProvider) this.pathProvider.getValue();
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler.getValue();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender.getValue();
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError vungleError, boolean z10, String str) {
        Logger.INSTANCE.e(TAG, "handleWebViewException: " + vungleError.getLocalizedMessage() + ", fatal: " + z10 + ", errorMsg: " + str);
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (z10) {
            makeBusError(vungleError);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z10, str);
    }

    private final boolean launchInlineInstall(String url) {
        Pair<Boolean, String> pair;
        ExternalRouter externalRouter = ExternalRouter.INSTANCE;
        Context context = this.adWidget.getContext();
        p.i(context, "adWidget.context");
        Intent intentFromUrl$vungle_ads_release = externalRouter.getIntentFromUrl$vungle_ads_release(context, url);
        if (intentFromUrl$vungle_ads_release == null) {
            logInlineInstallFailure("url: " + url + ", message: intent is null");
            return false;
        }
        Pair<Boolean, String> pairCheckInlineInstallIntent$vungle_ads_release = checkInlineInstallIntent$vungle_ads_release(intentFromUrl$vungle_ads_release);
        boolean zBooleanValue = pairCheckInlineInstallIntent$vungle_ads_release.component1().booleanValue();
        String strComponent2 = pairCheckInlineInstallIntent$vungle_ads_release.component2();
        if (!zBooleanValue) {
            logInlineInstallFailure("url: " + url + ", message: resolveInfo " + strComponent2);
            return false;
        }
        OpenActivityDelegate openActivityDelegate = this.appStoreDelegate;
        if (openActivityDelegate == null || (pair = openActivityDelegate.openInlineInstall(intentFromUrl$vungle_ads_release)) == null) {
            pair = new Pair<>(Boolean.FALSE, null);
        }
        boolean zBooleanValue2 = pair.component1().booleanValue();
        String strComponent3 = pair.component2();
        if (zBooleanValue2) {
            logInlineInstallSuccess$vungle_ads_release("url: " + url);
            return true;
        }
        logInlineInstallFailure("url: " + url + ", message: " + strComponent3);
        return false;
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fail to load html ");
            sb2.append(file != null ? file.getPath() : null);
            return new IndexHtmlError(reason, sb2.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file.getPath());
        return null;
    }

    private final void logInlineInstallFailure(String str) {
        ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.logInlineInstallFailure.1
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MRAIDPresenter.this.vungleWebClient.notifyPresentAppStoreFailed();
            }
        });
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(2L);
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), str);
        analyticsClient.logError$vungle_ads_release(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), getLogEntry());
    }

    public static /* synthetic */ void logInlineInstallFailure$default(MRAIDPresenter mRAIDPresenter, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallFailure(str);
    }

    public static /* synthetic */ void logInlineInstallSuccess$vungle_ads_release$default(MRAIDPresenter mRAIDPresenter, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release(str);
    }

    private final void makeBusError(VungleError vungleError) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(vungleError, this.placement.getReferenceId());
        }
    }

    private final void sendAdCloseEvent() {
        Long l10 = this.adStartTime;
        if (l10 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    private final void triggerEventMetricForTpat(String str) {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(str);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    @VisibleForTesting
    public final Pair<Boolean, String> checkInlineInstallIntent$vungle_ads_release(Intent intent) {
        p.j(intent, "intent");
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.adWidget.getContext().getPackageManager());
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        return new Pair<>(Boolean.valueOf(p.e(packageName, "com.android.vending")), packageName);
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int i10) {
        AdEventListener adEventListener;
        Logger.INSTANCE.d(TAG, "detach()");
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext("end", null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop(), this.platform.isProblematicMaliDevice());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    /* JADX INFO: renamed from: getAdStartTime$vungle_ads_release, reason: from getter */
    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    /* JADX INFO: renamed from: getBackEnabled$vungle_ads_release, reason: from getter */
    public final boolean getBackEnabled() {
        return this.backEnabled;
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker.getValue();
    }

    /* JADX INFO: renamed from: getHeartbeatEnabled$vungle_ads_release, reason: from getter */
    public final boolean getHeartbeatEnabled() {
        return this.heartbeatEnabled;
    }

    /* JADX INFO: renamed from: getLastUserInteractionTimestamp$vungle_ads_release, reason: from getter */
    public final long getLastUserInteractionTimestamp() {
        return this.lastUserInteractionTimestamp;
    }

    public final SuspendableTimer getSuspendableTimer$vungle_ads_release() {
        return (SuspendableTimer) this.suspendableTimer.getValue();
    }

    /* JADX INFO: renamed from: getUserId$vungle_ads_release, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: getVideoLength$vungle_ads_release, reason: from getter */
    public final long getVideoLength() {
        return this.videoLength;
    }

    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    /* JADX INFO: renamed from: isDestroying$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsDestroying() {
        return this.isDestroying;
    }

    public final void logInlineInstallSuccess$vungle_ads_release(String message) {
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(1L);
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), message);
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String str, boolean z10) {
        p.j(str, "errorDesc");
        if (z10) {
            reportErrorAndCloseAd(new WebViewError(str));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Logger.INSTANCE.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    public final void prepare() {
        int i10;
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        VungleError vungleErrorLoadMraidAd;
        int settings;
        boolean z10 = false;
        this.isDestroying.set(false);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i10 = 7;
        } else {
            i10 = (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i10);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (vungleErrorLoadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(vungleErrorLoadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (alertTitleText = presenterDelegate2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (alertBodyText = presenterDelegate3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (alertContinueButtonText = presenterDelegate4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (alertCloseButtonText = presenterDelegate5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        ConfigManager configManager = ConfigManager.INSTANCE;
        if (configManager.getGDPRIsCountryDataProtected() && p.e("unknown", PrivacyManager.INSTANCE.getConsentStatus())) {
            z10 = true;
        }
        this.vungleWebClient.setConsentStatus(z10, configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
        if (z10) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.presenter.a
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m3257prepare$lambda14(this.f45452b);
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.placement.getReferenceId());
        }
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().start();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0262, code lost:
    
        if (r26.equals("open") == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0278, code lost:
    
        if (r26.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x027c, code lost:
    
        r0 = r25.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0282, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0284, code lost:
    
        r0 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0289, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x028a, code lost:
    
        r1 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(r27, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0296, code lost:
    
        if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(r1) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0298, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r1 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02c0, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02c2, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02dd, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        r18 = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
        r2 = r25.adWidget.getContext();
        ck.p.i(r2, "adWidget.context");
        r0 = r18.launch$vungle_ads_release(r0, r1, r2, getLogEntry(), createDeeplinkCallback(r0));
        r1 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0300, code lost:
    
        if (r1 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0302, code lost:
    
        r1.onNext("open", "adClick", r25.placement.getReferenceId());
        r1 = mj.r.f64562a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x030d, code lost:
    
        if (r0 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x030f, code lost:
    
        r0 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0311, code lost:
    
        if (r0 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0313, code lost:
    
        r0.onNext("open", "adLeftApplication", r25.placement.getReferenceId());
        r0 = mj.r.f64562a;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processCommand(java.lang.String r26, kotlinx.serialization.json.JsonObject r27) {
        /*
            Method dump skipped, instruction units count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand(java.lang.String, kotlinx.serialization.json.JsonObject):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l10) {
        this.adStartTime = l10;
    }

    public final void setAdVisibility(boolean z10) {
        this.vungleWebClient.setAdVisibility(z10);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z10) {
        this.backEnabled = z10;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z10) {
        this.heartbeatEnabled = z10;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j10) {
        this.lastUserInteractionTimestamp = j10;
    }

    public final void setOpenActivityDelegate$vungle_ads_release(OpenActivityDelegate appStoreDelegate) {
        this.appStoreDelegate = appStoreDelegate;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j10) {
        this.videoLength = j10;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        ConfigManager configManager = ConfigManager.INSTANCE;
        if (configManager.allowAutoRedirects()) {
            return false;
        }
        return this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > configManager.afterClickDuration();
    }

    public final void start() {
        Logger.INSTANCE.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        Logger.INSTANCE.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m3256closeView$lambda3(MRAIDPresenter mRAIDPresenter) {
        p.j(mRAIDPresenter, "this$0");
        mRAIDPresenter.sendAdCloseEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-14, reason: not valid java name */
    public static final void m3257prepare$lambda14(MRAIDPresenter mRAIDPresenter) {
        p.j(mRAIDPresenter, "this$0");
        mRAIDPresenter.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m3258processCommand$lambda11(final MRAIDPresenter mRAIDPresenter) {
        p.j(mRAIDPresenter, "this$0");
        List list = null;
        CommonRequestBody.AdSizeParam adSizeParam = null;
        Call<Void> callRi = mRAIDPresenter.getVungleApiClient().ri(new CommonRequestBody.RequestParam(list, adSizeParam, mRAIDPresenter.adStartTime, mRAIDPresenter.advertisement.advAppId(), mRAIDPresenter.placement.getReferenceId(), mRAIDPresenter.userId, 3, (i) null));
        if (callRi == null) {
            Logger.INSTANCE.e(TAG, "Invalid ri call.");
            new NetworkUnreachable("Error RI API for placement: " + mRAIDPresenter.placement.getReferenceId()).setLogEntry$vungle_ads_release(mRAIDPresenter.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        callRi.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
                Logger.INSTANCE.d("MRAIDPresenter", "send RI Failure");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error RI API calls: ");
                sb2.append(th2 != null ? th2.getLocalizedMessage() : null);
                new NetworkUnreachable(sb2.toString()).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                Logger.INSTANCE.d("MRAIDPresenter", "send RI success");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(VungleError vungleError) {
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(vungleError);
        closeView();
    }
}

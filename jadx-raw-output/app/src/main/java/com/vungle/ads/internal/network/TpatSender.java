package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import ck.s;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import el.c;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import jk.o;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.Regex;
import mj.r;
import xk.h;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B3\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010/\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b2\u00103J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u001c\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0004J\u000f\u0010\u0019\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0007R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/vungle/ads/internal/network/TpatSender;", "", "", "event", "", "isPriorityTpat", "Lcom/vungle/ads/internal/network/TpatRequest;", AdActivity.REQUEST_KEY_EXTRA, "url", "Lcom/vungle/ads/internal/model/ErrorInfo;", "performPriorityRetry", "error", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "reason", "Lmj/r;", "logTpatError", "", "Lcom/vungle/ads/internal/network/FailedTpat;", "getStoredTpats", "tpats", "saveStoredTpats", "fromFailedTpat", "sendTpat", "resendStoredTpats$vungle_ads_release", "()V", "resendStoredTpats", "injectSessionIdToUrl", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "Ljava/util/concurrent/Executor;", "jobExecutor", "Ljava/util/concurrent/Executor;", "getJobExecutor", "()Ljava/util/concurrent/Executor;", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "tpatFilePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "tpatLock", "Ljava/lang/Object;", "ioExecutor", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "<init>", "(Lcom/vungle/ads/internal/network/VungleApiClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/signals/SignalManager;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class TpatSender {
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final String TAG = "TpatSender";
    private final Executor jobExecutor;
    private final SignalManager signalManager;
    private final FilePreferences tpatFilePreferences;
    private final Object tpatLock;
    private final VungleApiClient vungleApiClient;

    public TpatSender(VungleApiClient vungleApiClient, Executor executor, Executor executor2, PathProvider pathProvider, SignalManager signalManager) {
        p.j(vungleApiClient, "vungleApiClient");
        p.j(executor, "ioExecutor");
        p.j(executor2, "jobExecutor");
        p.j(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = executor2;
        this.signalManager = signalManager;
        this.tpatFilePreferences = FilePreferences.INSTANCE.get(executor, pathProvider, FilePreferences.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, FailedTpat> getStoredTpats() {
        Object objM3458constructorimpl;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                Result.a aVar = Result.Companion;
                cl.a.C0024a c0024a = cl.a.f6073d;
                c cVarA = c0024a.a();
                o.a aVar2 = o.f61802c;
                xk.b<Object> bVarB = h.b(cVarA, s.d(s.n(Map.class, aVar2.a(s.l(String.class)), aVar2.a(s.l(FailedTpat.class)))));
                p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objM3458constructorimpl = Result.m3458constructorimpl((Map) c0024a.b(bVarB, string));
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                Logger.INSTANCE.e(TAG, "Failed to decode stored tpats: " + thM3461exceptionOrNullimpl);
            }
            if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
                objM3458constructorimpl = new LinkedHashMap();
            }
            Map<String, FailedTpat> map = (Map) objM3458constructorimpl;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final boolean isPriorityTpat(String event) {
        return p.e(event, "checkpoint.0") || p.e(event, "clickUrl") || p.e(event, "impression") || p.e(event, Constants.LOAD_AD);
    }

    private final void logTpatError(TpatRequest tpatRequest, String str, ErrorInfo errorInfo, Sdk.SDKError.Reason reason) {
        String str2 = "tpat key: " + tpatRequest.getTpatKey() + ", error: " + errorInfo.getDescription() + ", errorIsTerminal: " + errorInfo.getErrorIsTerminal() + " url: " + str;
        Logger.INSTANCE.e(TAG, str2);
        new TpatError(reason, str2).setLogEntry$vungle_ads_release(tpatRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final void saveStoredTpats(Map<String, FailedTpat> map) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            FilePreferences filePreferences = this.tpatFilePreferences;
            cl.a.C0024a c0024a = cl.a.f6073d;
            c cVarA = c0024a.a();
            o.a aVar2 = o.f61802c;
            xk.b<Object> bVarB = h.b(cVarA, s.d(s.n(Map.class, aVar2.a(s.l(String.class)), aVar2.a(s.l(FailedTpat.class)))));
            p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(FAILED_TPATS, c0024a.c(bVarB, map)).apply();
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            Logger.INSTANCE.e(TAG, "Failed to encode the about to storing tpats: " + map);
        }
    }

    public static /* synthetic */ void sendTpat$default(TpatSender tpatSender, TpatRequest tpatRequest, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        tpatSender.sendTpat(tpatRequest, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m3249sendTpat$lambda1(TpatSender tpatSender, TpatRequest tpatRequest, String str, boolean z10) {
        FailedTpat failedTpat;
        p.j(tpatSender, "this$0");
        p.j(tpatRequest, "$request");
        p.j(str, "$urlWithSessionId");
        ErrorInfo errorInfoPerformPriorityRetry = tpatSender.performPriorityRetry(tpatRequest, str);
        if (tpatRequest.getRegularRetry()) {
            if (errorInfoPerformPriorityRetry != null && errorInfoPerformPriorityRetry.getErrorIsTerminal()) {
                return;
            }
            if (errorInfoPerformPriorityRetry != null || z10) {
                synchronized (tpatSender.tpatLock) {
                    Map<String, FailedTpat> storedTpats = tpatSender.getStoredTpats();
                    FailedTpat failedTpat2 = storedTpats.get(tpatRequest.getUrl());
                    int retryAttempt = failedTpat2 != null ? failedTpat2.getRetryAttempt() : 0;
                    if (errorInfoPerformPriorityRetry == null && retryAttempt > 0) {
                        storedTpats.remove(tpatRequest.getUrl());
                        tpatSender.saveStoredTpats(storedTpats);
                    } else if (errorInfoPerformPriorityRetry != null && retryAttempt >= tpatRequest.getRegularRetryCount()) {
                        storedTpats.remove(tpatRequest.getUrl());
                        tpatSender.saveStoredTpats(storedTpats);
                        tpatSender.logTpatError(tpatRequest, str, errorInfoPerformPriorityRetry, Sdk.SDKError.Reason.TPAT_RETRY_FAILED);
                    } else if (errorInfoPerformPriorityRetry != null) {
                        FailedTpat failedTpat3 = storedTpats.get(tpatRequest.getUrl());
                        if (failedTpat3 == null || (failedTpat = FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                            failedTpat = new FailedTpat(tpatRequest.getMethod(), tpatRequest.getHeaders(), tpatRequest.getBody(), 1, tpatRequest.getRegularRetryCount(), tpatRequest.getTpatKey());
                        }
                        storedTpats.put(tpatRequest.getUrl(), failedTpat);
                        tpatSender.saveStoredTpats(storedTpats);
                    }
                    r rVar = r.f64562a;
                }
            }
        }
    }

    public final Executor getJobExecutor() {
        return this.jobExecutor;
    }

    public final SignalManager getSignalManager() {
        return this.signalManager;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void sendTpat(final TpatRequest tpatRequest, final boolean z10) {
        p.j(tpatRequest, AdActivity.REQUEST_KEY_EXTRA);
        final String strInjectSessionIdToUrl = injectSessionIdToUrl(tpatRequest.getUrl());
        this.jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.network.a
            @Override // java.lang.Runnable
            public final void run() {
                TpatSender.m3249sendTpat$lambda1(this.f45446b, tpatRequest, strInjectSessionIdToUrl, z10);
            }
        });
    }

    private final ErrorInfo performPriorityRetry(TpatRequest request, String url) {
        boolean zIsPriorityTpat;
        boolean z10;
        ErrorInfo errorInfoPingTPAT;
        Sdk.SDKError.Reason reason;
        boolean z11;
        Boolean priorityRetry = request.getPriorityRetry();
        if (priorityRetry != null) {
            zIsPriorityTpat = priorityRetry.booleanValue();
        } else {
            zIsPriorityTpat = isPriorityTpat(request.getTpatKey());
        }
        if (ConfigManager.INSTANCE.retryPriorityTPATs() && zIsPriorityTpat) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = 0;
        do {
            errorInfoPingTPAT = this.vungleApiClient.pingTPAT(url, request.getHeaders(), request.getBody(), request.getMethod(), request.getLogEntry());
            if (!z10) {
                break;
            }
            if (errorInfoPingTPAT != null && errorInfoPingTPAT.isRetryCode()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            i10++;
        } while (i10 < request.getPriorityRetryCount());
        if (errorInfoPingTPAT != null) {
            if (i10 >= request.getPriorityRetryCount()) {
                reason = Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
            } else {
                reason = Sdk.SDKError.Reason.TPAT_ERROR;
            }
            logTpatError(request, url, errorInfoPingTPAT, reason);
        }
        return errorInfoPingTPAT;
    }

    @VisibleForTesting
    public final String injectSessionIdToUrl(String url) {
        String uuid;
        boolean z10;
        p.j(url, "url");
        SignalManager signalManager = this.signalManager;
        if (signalManager != null) {
            uuid = signalManager.getUuid();
        } else {
            uuid = null;
        }
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String strQuote = Pattern.quote(Constants.SESSION_ID);
            p.i(strQuote, "quote(Constants.SESSION_ID)");
            return new Regex(strQuote).replace(url, uuid);
        }
        return url;
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, FailedTpat> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            FailedTpat value = entry.getValue();
            sendTpat(new TpatRequest.Builder(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public /* synthetic */ TpatSender(VungleApiClient vungleApiClient, Executor executor, Executor executor2, PathProvider pathProvider, SignalManager signalManager, int i10, i iVar) {
        this(vungleApiClient, executor, executor2, pathProvider, (i10 & 16) != 0 ? null : signalManager);
    }
}

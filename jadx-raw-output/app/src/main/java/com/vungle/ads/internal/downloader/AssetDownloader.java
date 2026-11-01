package com.vungle.ads.internal.downloader;

import android.support.v4.media.session.PlaybackStateCompat;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b;
import lk.x;
import mj.g;
import mj.r;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;

/* JADX INFO: compiled from: AssetDownloader.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\"\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0018\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "downloadRequest", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "downloadError", "Lmj/r;", "deliverError", "launchRequest", "Lokhttp3/Response;", "networkResponse", "Lokhttp3/ResponseBody;", "decodeGzipIfNeeded", "Ljava/io/File;", C3426d4.i.f28530b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "deliverSuccess", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "progress", "onProgressChanged", "", "checkSpaceAvailable", NativeAdPresenter.DOWNLOAD, AdActivity.REQUEST_KEY_EXTRA, "cancel", "cancelAll", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lmj/g;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient", "", "transitioning", "Ljava/util/List;", "<init>", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", VastTagName.COMPANION, "OkHttpSingleton", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final VungleThreadPoolExecutor downloadExecutor;

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private final g okHttpClient;
    private final PathProvider pathProvider;
    private final List<DownloadRequest> transitioning;

    /* JADX INFO: compiled from: AssetDownloader.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "createOkHttpClient", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class OkHttpSingleton {
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();
        private static OkHttpClient client;

        private OkHttpSingleton() {
        }

        public final OkHttpClient createOkHttpClient(PathProvider pathProvider) {
            p.j(pathProvider, "pathProvider");
            OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderFollowSslRedirects = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            if (configManager.isCleverCacheEnabled()) {
                long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
                int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
                String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
                p.i(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
                long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
                if (jMin > 0) {
                    builderFollowSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), jMin));
                } else {
                    Logger.INSTANCE.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
                }
            }
            OkHttpClient okHttpClientBuild = builderFollowSslRedirects.build();
            client = okHttpClientBuild;
            return okHttpClientBuild;
        }
    }

    public AssetDownloader(VungleThreadPoolExecutor vungleThreadPoolExecutor, PathProvider pathProvider) {
        p.j(vungleThreadPoolExecutor, "downloadExecutor");
        p.j(pathProvider, "pathProvider");
        this.downloadExecutor = vungleThreadPoolExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = b.a(new bk.a<OkHttpClient>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // bk.a
            public final OkHttpClient invoke() {
                return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        p.i(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (assetDownloadListener != null) {
            assetDownloadListener.onSuccess(file, downloadRequest);
        }
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:103:0x0241 A[Catch: all -> 0x0372, Exception -> 0x037a, TRY_LEAVE, TryCatch #41 {Exception -> 0x037a, all -> 0x0372, blocks: (B:101:0x023b, B:103:0x0241, B:107:0x0252, B:112:0x0275, B:111:0x0271), top: B:325:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0252 A[Catch: all -> 0x0372, Exception -> 0x037a, TRY_ENTER, TRY_LEAVE, TryCatch #41 {Exception -> 0x037a, all -> 0x0372, blocks: (B:101:0x023b, B:103:0x0241, B:107:0x0252, B:112:0x0275, B:111:0x0271), top: B:325:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x026c A[Catch: all -> 0x0210, Exception -> 0x0212, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x0212, all -> 0x0210, blocks: (B:85:0x020b, B:105:0x0247, B:109:0x026c), top: B:345:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0271 A[Catch: all -> 0x0372, Exception -> 0x037a, TRY_ENTER, TryCatch #41 {Exception -> 0x037a, all -> 0x0372, blocks: (B:101:0x023b, B:103:0x0241, B:107:0x0252, B:112:0x0275, B:111:0x0271), top: B:325:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d5 A[Catch: Exception -> 0x02db, all -> 0x035d, TRY_LEAVE, TryCatch #15 {Exception -> 0x02db, blocks: (B:121:0x0290, B:133:0x02d5), top: B:304:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f6 A[Catch: Exception -> 0x0328, all -> 0x035d, TRY_LEAVE, TryCatch #18 {Exception -> 0x0328, blocks: (B:138:0x02ea, B:140:0x02f6), top: B:308:0x02ea }] */
    /* JADX WARN: Code duplicated, block: B:144:0x030e A[Catch: all -> 0x035d, Exception -> 0x0368, TryCatch #17 {Exception -> 0x0368, blocks: (B:142:0x0305, B:144:0x030e, B:145:0x0315, B:149:0x032b, B:150:0x035c, B:163:0x03a1), top: B:307:0x0305 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03a1 A[Catch: all -> 0x035d, Exception -> 0x0368, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0368, blocks: (B:142:0x0305, B:144:0x030e, B:145:0x0315, B:149:0x032b, B:150:0x035c, B:163:0x03a1), top: B:307:0x0305 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:180:0x0403  */
    /* JADX WARN: Code duplicated, block: B:182:0x041c  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:247:0x0537  */
    /* JADX WARN: Code duplicated, block: B:248:0x053c  */
    /* JADX WARN: Code duplicated, block: B:250:0x053f  */
    /* JADX WARN: Code duplicated, block: B:254:0x054c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0579  */
    /* JADX WARN: Code duplicated, block: B:258:0x057c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0587  */
    /* JADX WARN: Code duplicated, block: B:264:0x058b  */
    /* JADX WARN: Code duplicated, block: B:266:0x0591  */
    /* JADX WARN: Code duplicated, block: B:272:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:273:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:275:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:279:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:282:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:283:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:288:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:290:0x0604  */
    /* JADX WARN: Code duplicated, block: B:291:0x061a  */
    /* JADX WARN: Code duplicated, block: B:292:0x061e  */
    /* JADX WARN: Code duplicated, block: B:306:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x038b A[EDGE_INSN: B:347:0x038b->B:160:0x038b BREAK  A[LOOP:0: B:82:0x01ff->B:146:0x0319], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0150 A[Catch: Exception -> 0x04c8, all -> 0x04d5, TRY_LEAVE, TryCatch #36 {all -> 0x04d5, blocks: (B:41:0x0146, B:42:0x014a, B:44:0x0150, B:56:0x018d), top: B:312:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0193 A[Catch: Exception -> 0x0169, all -> 0x0175, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0169, blocks: (B:47:0x0158, B:58:0x0193), top: B:302:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x0403, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:266:0x0591, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:290:0x0604, please report this as an issue */
    public final void launchRequest(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws Throwable {
        BufferedSink bufferedSinkBuffer;
        BufferedSource bufferedSourceRetrofitExceptionCatchingRequestBody_source;
        Response responseOkhttp3CallExecute;
        Call callNewCall;
        ResponseBody responseBodyOkhttp3Response_body;
        Logger.Companion companion;
        int status;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion2;
        boolean z10;
        ResponseBody responseBodyOkhttp3Response_body2;
        Logger.Companion companion3;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion4;
        AssetDownloadListener.DownloadError downloadError;
        ResponseBody responseBodyOkhttp3Response_body3;
        int status2;
        boolean z11;
        ResponseBody responseBodyOkhttp3Response_body4;
        ResponseBody responseBodyDecodeGzipIfNeeded;
        long contentLength;
        Response response;
        int i10;
        long j10;
        long j11;
        File file;
        BufferedSource bufferedSource;
        int status3;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion5;
        Logger.Companion companion6;
        int status4;
        boolean z12;
        ResponseBody responseBodyOkhttp3Response_body5;
        BufferedSource bufferedSource2;
        long j12;
        Long rangeEnd;
        long rangeStart;
        int i11;
        File file2;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion7;
        String str = "On cancel ";
        String str2 = "download status: ";
        AdAsset asset = downloadRequest.getAsset();
        Logger.Companion companion8 = Logger.INSTANCE;
        companion8.d(TAG, "launch request in thread: " + Thread.currentThread().getId() + " request: " + asset.getServerPath());
        if (downloadRequest.isCancelled()) {
            companion8.d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new AssetDownloadListener.Progress().setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
            return;
        }
        AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
        progress.setTimestampDownloadStart(System.currentTimeMillis());
        String serverPath = asset.getServerPath();
        String localPath = asset.getLocalPath();
        int iCode = -1;
        if ((serverPath.length() == 0) || !FileUtility.INSTANCE.isValidUrl(serverPath)) {
            deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new InvalidAssetUrlError("invalid url: " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
            return;
        }
        if (localPath.length() == 0) {
            deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new AssetWriteError("invalid path: " + localPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()));
            return;
        }
        if (!checkSpaceAvailable(downloadRequest)) {
            deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR()));
            return;
        }
        File file3 = new File(localPath);
        if (assetDownloadListener != null) {
            assetDownloadListener.onStart(downloadRequest);
            r rVar = r.f64562a;
        }
        try {
            File parentFile = file3.getParentFile();
            if (parentFile == null) {
                callNewCall = getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
                responseOkhttp3CallExecute = LiftoffMonetizeNetworkBridge.okhttp3CallExecute(callNewCall);
                iCode = responseOkhttp3CallExecute.code();
                if (!responseOkhttp3CallExecute.isSuccessful()) {
                    str2 = "download status: ";
                    callNewCall = callNewCall;
                    responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                    str = "On cancel ";
                    file3 = file3;
                    throw new Downloader.RequestException(responseOkhttp3CallExecute.message());
                }
                if (responseOkhttp3CallExecute.cacheResponse() != null) {
                    AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                    r rVar2 = r.f64562a;
                }
                responseBodyDecodeGzipIfNeeded = decodeGzipIfNeeded(responseOkhttp3CallExecute);
                if (responseBodyDecodeGzipIfNeeded != null) {
                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyDecodeGzipIfNeeded);
                } else {
                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                }
                StringBuilder sb2 = new StringBuilder();
                str = "On cancel ";
                sb2.append("Start download from url: ");
                sb2.append(serverPath);
                companion8.d(TAG, sb2.toString());
                bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file3, false, 1, null));
                if (responseBodyDecodeGzipIfNeeded != null) {
                    contentLength = responseBodyDecodeGzipIfNeeded.getContentLength();
                } else {
                    contentLength = 0;
                }
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                progress.setSizeBytes(contentLength);
                response = responseOkhttp3CallExecute;
                str2 = "download status: ";
                progress.setReadBytes(0L);
                progress.setProgressPercent(0);
                asset.setContentLength(contentLength);
                onProgressChanged(downloadRequest, progress, assetDownloadListener);
                i10 = 0;
                j10 = 0;
                while (true) {
                    if (bufferedSourceRetrofitExceptionCatchingRequestBody_source != null) {
                        callNewCall = callNewCall;
                        j11 = bufferedSourceRetrofitExceptionCatchingRequestBody_source.read(bufferedSinkBuffer.getBuffer(), PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                    } else {
                        callNewCall = callNewCall;
                        j11 = -1;
                    }
                    r rVar3 = r.f64562a;
                    if (j11 > 0) {
                        break;
                        break;
                    }
                    if (file3.exists()) {
                        new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        throw new Downloader.RequestException("File is not existing");
                    }
                    if (downloadRequest.isCancelled()) {
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
                        break;
                    }
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                    bufferedSinkBuffer.emit();
                    bufferedSinkBuffer.flush();
                    j12 = j10 + j11;
                    progress.setReadBytes(j12);
                    rangeEnd = asset.getRangeEnd();
                    if (rangeEnd != null) {
                        rangeStart = rangeEnd.longValue();
                    } else {
                        rangeStart = asset.getRangeStart();
                    }
                    i11 = i10;
                    long j13 = rangeStart;
                    if (asset.isWaitingForDownload()) {
                        file2 = file3;
                        responseOkhttp3CallExecute = response;
                        bufferedSource2 = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                    } else {
                        file2 = file3;
                        responseOkhttp3CallExecute = response;
                        bufferedSource2 = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                    }
                    if (contentLength > 0) {
                        i10 = (int) ((((long) 100) * j12) / contentLength);
                    } else {
                        i10 = i11;
                    }
                    while (progress.getPercent() + 1 <= Math.min(i10, 100)) {
                        companion7 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                        progress.setStatus(companion7.getIN_PROGRESS());
                        progress.setProgressPercent(progress.getPercent() + 1);
                        if (progress.getPercent() >= 100) {
                            progress.setStatus(companion7.getDONE());
                        }
                        onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    }
                    file3 = file2;
                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSource2;
                    response = responseOkhttp3CallExecute;
                    j10 = j12;
                    serverPath = serverPath;
                    callNewCall = callNewCall;
                }
                file = file3;
                responseOkhttp3CallExecute = response;
                bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                bufferedSinkBuffer.flush();
                status3 = progress.getStatus();
                companion5 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                if (status3 == companion5.getIN_PROGRESS()) {
                    progress.setStatus(companion5.getDONE());
                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                }
                if (LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute) != null) {
                    responseBodyOkhttp3Response_body5.close();
                }
                callNewCall.cancel();
                FileUtility fileUtility = FileUtility.INSTANCE;
                fileUtility.closeQuietly(bufferedSinkBuffer);
                fileUtility.closeQuietly(bufferedSource);
                companion6 = Logger.INSTANCE;
                companion6.d(TAG, str2 + progress.getStatus());
                status4 = progress.getStatus();
                if (status4 == companion5.getERROR()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    deliverError(downloadRequest, assetDownloadListener, null);
                    return;
                }
                if (status4 == companion5.getCANCELLED()) {
                    file3 = file;
                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                    return;
                }
                companion6.d(TAG, str + downloadRequest);
                onProgressChanged(downloadRequest, progress, assetDownloadListener);
                return;
                str = "On cancel ";
                file3 = file3;
                bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                bufferedSinkBuffer = null;
                companion3 = Logger.INSTANCE;
                companion3.e(TAG, String.valueOf(e));
                companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                progress.setStatus(companion4.getERROR());
                downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if (responseOkhttp3CallExecute != null) {
                    responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                } else {
                    responseBodyOkhttp3Response_body3 = null;
                }
                if (responseBodyOkhttp3Response_body3 != null) {
                    responseBodyOkhttp3Response_body4.close();
                    r rVar4 = r.f64562a;
                }
                if (callNewCall != null) {
                    callNewCall.cancel();
                    r rVar5 = r.f64562a;
                }
                FileUtility fileUtility2 = FileUtility.INSTANCE;
                fileUtility2.closeQuietly(bufferedSinkBuffer);
                fileUtility2.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                companion3.d(TAG, str2 + progress.getStatus());
                status2 = progress.getStatus();
                if (status2 == companion4.getERROR()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    deliverError(downloadRequest, assetDownloadListener, downloadError);
                    return;
                }
                if (status2 == companion4.getCANCELLED()) {
                    companion3.d(TAG, str + downloadRequest);
                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    return;
                }
                deliverSuccess(file3, downloadRequest, assetDownloadListener);
                return;
            }
            try {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    callNewCall = getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
                    try {
                        responseOkhttp3CallExecute = LiftoffMonetizeNetworkBridge.okhttp3CallExecute(callNewCall);
                        try {
                            try {
                                iCode = responseOkhttp3CallExecute.code();
                                try {
                                    if (!responseOkhttp3CallExecute.isSuccessful()) {
                                        if (responseOkhttp3CallExecute.cacheResponse() != null) {
                                            try {
                                                try {
                                                    try {
                                                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                                                        r rVar6 = r.f64562a;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                                        bufferedSinkBuffer = null;
                                                        str = "On cancel ";
                                                        file3 = file3;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str2 = "download status: ";
                                                    callNewCall = callNewCall;
                                                    bufferedSinkBuffer = null;
                                                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                                    str = "On cancel ";
                                                    file3 = file3;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                                bufferedSinkBuffer = null;
                                                str = "On cancel ";
                                                file3 = file3;
                                            }
                                        }
                                        try {
                                            responseBodyDecodeGzipIfNeeded = decodeGzipIfNeeded(responseOkhttp3CallExecute);
                                            if (responseBodyDecodeGzipIfNeeded != null) {
                                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyDecodeGzipIfNeeded);
                                            } else {
                                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                            }
                                            try {
                                                StringBuilder sb3 = new StringBuilder();
                                                str = "On cancel ";
                                                try {
                                                    try {
                                                        sb3.append("Start download from url: ");
                                                        sb3.append(serverPath);
                                                        companion8.d(TAG, sb3.toString());
                                                        try {
                                                            bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file3, false, 1, null));
                                                            if (responseBodyDecodeGzipIfNeeded != null) {
                                                                try {
                                                                    contentLength = responseBodyDecodeGzipIfNeeded.getContentLength();
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    callNewCall = callNewCall;
                                                                    file3 = file3;
                                                                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                    responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                                                    str2 = "download status: ";
                                                                    companion3 = Logger.INSTANCE;
                                                                    companion3.e(TAG, String.valueOf(e));
                                                                    companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                    progress.setStatus(companion4.getERROR());
                                                                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                    if (responseOkhttp3CallExecute != null) {
                                                                        responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                    } else {
                                                                        responseBodyOkhttp3Response_body3 = null;
                                                                    }
                                                                    if (responseBodyOkhttp3Response_body3 != null) {
                                                                        responseBodyOkhttp3Response_body4.close();
                                                                        r rVar7 = r.f64562a;
                                                                    }
                                                                    if (callNewCall != null) {
                                                                        callNewCall.cancel();
                                                                        r rVar8 = r.f64562a;
                                                                    }
                                                                    FileUtility fileUtility3 = FileUtility.INSTANCE;
                                                                    fileUtility3.closeQuietly(bufferedSinkBuffer);
                                                                    fileUtility3.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                    companion3.d(TAG, str2 + progress.getStatus());
                                                                    status2 = progress.getStatus();
                                                                    if (status2 == companion4.getERROR()) {
                                                                        z11 = true;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    if (z11) {
                                                                        deliverError(downloadRequest, assetDownloadListener, downloadError);
                                                                        return;
                                                                    }
                                                                    if (status2 == companion4.getCANCELLED()) {
                                                                        companion3.d(TAG, str + downloadRequest);
                                                                        onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                        return;
                                                                    }
                                                                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                    return;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    str2 = "download status: ";
                                                                    str = str;
                                                                    if (responseOkhttp3CallExecute != null) {
                                                                        responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                    } else {
                                                                        responseBodyOkhttp3Response_body = null;
                                                                    }
                                                                    if (responseBodyOkhttp3Response_body != null) {
                                                                        responseBodyOkhttp3Response_body2.close();
                                                                        r rVar9 = r.f64562a;
                                                                    }
                                                                    if (callNewCall != null) {
                                                                        callNewCall.cancel();
                                                                        r rVar10 = r.f64562a;
                                                                    }
                                                                    FileUtility fileUtility4 = FileUtility.INSTANCE;
                                                                    fileUtility4.closeQuietly(bufferedSinkBuffer);
                                                                    fileUtility4.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                    companion = Logger.INSTANCE;
                                                                    companion.d(TAG, str2 + progress.getStatus());
                                                                    status = progress.getStatus();
                                                                    companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                    if (status == companion2.getERROR()) {
                                                                        z10 = true;
                                                                    } else {
                                                                        z10 = false;
                                                                    }
                                                                    if (!z10) {
                                                                        deliverError(downloadRequest, assetDownloadListener, null);
                                                                    } else if (status == companion2.getCANCELLED()) {
                                                                        companion.d(TAG, str + downloadRequest);
                                                                        onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                    } else {
                                                                        deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                contentLength = 0;
                                                            }
                                                            try {
                                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                                                                progress.setSizeBytes(contentLength);
                                                                response = responseOkhttp3CallExecute;
                                                                str2 = "download status: ";
                                                                try {
                                                                    progress.setReadBytes(0L);
                                                                    progress.setProgressPercent(0);
                                                                    asset.setContentLength(contentLength);
                                                                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                    i10 = 0;
                                                                    j10 = 0;
                                                                    while (true) {
                                                                        if (bufferedSourceRetrofitExceptionCatchingRequestBody_source != null) {
                                                                            try {
                                                                                callNewCall = callNewCall;
                                                                                try {
                                                                                    j11 = bufferedSourceRetrofitExceptionCatchingRequestBody_source.read(bufferedSinkBuffer.getBuffer(), PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                                                                                } catch (Exception e13) {
                                                                                    e = e13;
                                                                                    file3 = file3;
                                                                                    responseOkhttp3CallExecute = response;
                                                                                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                                    str2 = str2;
                                                                                    companion3 = Logger.INSTANCE;
                                                                                    companion3.e(TAG, String.valueOf(e));
                                                                                    companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                    progress.setStatus(companion4.getERROR());
                                                                                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                                    if (responseOkhttp3CallExecute != null) {
                                                                                        responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                    } else {
                                                                                        responseBodyOkhttp3Response_body3 = null;
                                                                                    }
                                                                                    if (responseBodyOkhttp3Response_body3 != null) {
                                                                                        responseBodyOkhttp3Response_body4.close();
                                                                                        r rVar11 = r.f64562a;
                                                                                    }
                                                                                    if (callNewCall != null) {
                                                                                        callNewCall.cancel();
                                                                                        r rVar12 = r.f64562a;
                                                                                    }
                                                                                    FileUtility fileUtility5 = FileUtility.INSTANCE;
                                                                                    fileUtility5.closeQuietly(bufferedSinkBuffer);
                                                                                    fileUtility5.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                    companion3.d(TAG, str2 + progress.getStatus());
                                                                                    status2 = progress.getStatus();
                                                                                    if (status2 == companion4.getERROR()) {
                                                                                        z11 = true;
                                                                                    } else {
                                                                                        z11 = false;
                                                                                    }
                                                                                    if (z11) {
                                                                                        deliverError(downloadRequest, assetDownloadListener, downloadError);
                                                                                        return;
                                                                                    }
                                                                                    if (status2 == companion4.getCANCELLED()) {
                                                                                        companion3.d(TAG, str + downloadRequest);
                                                                                        onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                        return;
                                                                                    }
                                                                                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                    return;
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    file3 = file3;
                                                                                    responseOkhttp3CallExecute = response;
                                                                                    str = str;
                                                                                    str2 = str2;
                                                                                    if (responseOkhttp3CallExecute != null) {
                                                                                        responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                    } else {
                                                                                        responseBodyOkhttp3Response_body = null;
                                                                                    }
                                                                                    if (responseBodyOkhttp3Response_body != null) {
                                                                                        responseBodyOkhttp3Response_body2.close();
                                                                                        r rVar13 = r.f64562a;
                                                                                    }
                                                                                    if (callNewCall != null) {
                                                                                        callNewCall.cancel();
                                                                                        r rVar14 = r.f64562a;
                                                                                    }
                                                                                    FileUtility fileUtility6 = FileUtility.INSTANCE;
                                                                                    fileUtility6.closeQuietly(bufferedSinkBuffer);
                                                                                    fileUtility6.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                    companion = Logger.INSTANCE;
                                                                                    companion.d(TAG, str2 + progress.getStatus());
                                                                                    status = progress.getStatus();
                                                                                    companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                    if (status == companion2.getERROR()) {
                                                                                        z10 = true;
                                                                                    } else {
                                                                                        z10 = false;
                                                                                    }
                                                                                    if (!z10) {
                                                                                        deliverError(downloadRequest, assetDownloadListener, null);
                                                                                    } else if (status == companion2.getCANCELLED()) {
                                                                                        companion.d(TAG, str + downloadRequest);
                                                                                        onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                    } else {
                                                                                        deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (Exception e14) {
                                                                                e = e14;
                                                                                callNewCall = callNewCall;
                                                                                file3 = file3;
                                                                                responseOkhttp3CallExecute = response;
                                                                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                                str2 = str2;
                                                                                companion3 = Logger.INSTANCE;
                                                                                companion3.e(TAG, String.valueOf(e));
                                                                                companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                progress.setStatus(companion4.getERROR());
                                                                                downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                                if (responseOkhttp3CallExecute != null) {
                                                                                    responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                } else {
                                                                                    responseBodyOkhttp3Response_body3 = null;
                                                                                }
                                                                                if (responseBodyOkhttp3Response_body3 != null) {
                                                                                    responseBodyOkhttp3Response_body4.close();
                                                                                    r rVar15 = r.f64562a;
                                                                                }
                                                                                if (callNewCall != null) {
                                                                                    callNewCall.cancel();
                                                                                    r rVar16 = r.f64562a;
                                                                                }
                                                                                FileUtility fileUtility7 = FileUtility.INSTANCE;
                                                                                fileUtility7.closeQuietly(bufferedSinkBuffer);
                                                                                fileUtility7.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                companion3.d(TAG, str2 + progress.getStatus());
                                                                                status2 = progress.getStatus();
                                                                                if (status2 == companion4.getERROR()) {
                                                                                    z11 = true;
                                                                                } else {
                                                                                    z11 = false;
                                                                                }
                                                                                if (z11) {
                                                                                    deliverError(downloadRequest, assetDownloadListener, downloadError);
                                                                                    return;
                                                                                }
                                                                                if (status2 == companion4.getCANCELLED()) {
                                                                                    companion3.d(TAG, str + downloadRequest);
                                                                                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                    return;
                                                                                }
                                                                                deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                return;
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                callNewCall = callNewCall;
                                                                                file3 = file3;
                                                                                responseOkhttp3CallExecute = response;
                                                                                str = str;
                                                                                str2 = str2;
                                                                                if (responseOkhttp3CallExecute != null) {
                                                                                    responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                } else {
                                                                                    responseBodyOkhttp3Response_body = null;
                                                                                }
                                                                                if (responseBodyOkhttp3Response_body != null) {
                                                                                    responseBodyOkhttp3Response_body2.close();
                                                                                    r rVar17 = r.f64562a;
                                                                                }
                                                                                if (callNewCall != null) {
                                                                                    callNewCall.cancel();
                                                                                    r rVar18 = r.f64562a;
                                                                                }
                                                                                FileUtility fileUtility8 = FileUtility.INSTANCE;
                                                                                fileUtility8.closeQuietly(bufferedSinkBuffer);
                                                                                fileUtility8.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                companion = Logger.INSTANCE;
                                                                                companion.d(TAG, str2 + progress.getStatus());
                                                                                status = progress.getStatus();
                                                                                companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                if (status == companion2.getERROR()) {
                                                                                    z10 = true;
                                                                                } else {
                                                                                    z10 = false;
                                                                                }
                                                                                if (!z10) {
                                                                                    deliverError(downloadRequest, assetDownloadListener, null);
                                                                                } else if (status == companion2.getCANCELLED()) {
                                                                                    companion.d(TAG, str + downloadRequest);
                                                                                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                } else {
                                                                                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            callNewCall = callNewCall;
                                                                            j11 = -1;
                                                                        }
                                                                        try {
                                                                            r rVar19 = r.f64562a;
                                                                            if (j11 > 0) {
                                                                                break;
                                                                            }
                                                                            try {
                                                                                if (file3.exists()) {
                                                                                    new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                                                    throw new Downloader.RequestException("File is not existing");
                                                                                }
                                                                                if (downloadRequest.isCancelled()) {
                                                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
                                                                                    break;
                                                                                }
                                                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                                                                bufferedSinkBuffer.emit();
                                                                                bufferedSinkBuffer.flush();
                                                                                j12 = j10 + j11;
                                                                                progress.setReadBytes(j12);
                                                                                rangeEnd = asset.getRangeEnd();
                                                                                if (rangeEnd != null) {
                                                                                    rangeStart = rangeEnd.longValue();
                                                                                } else {
                                                                                    rangeStart = asset.getRangeStart();
                                                                                }
                                                                                i11 = i10;
                                                                                long j14 = rangeStart;
                                                                                if (asset.isWaitingForDownload() || j12 < j14) {
                                                                                    file2 = file3;
                                                                                    responseOkhttp3CallExecute = response;
                                                                                    bufferedSource2 = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                                } else {
                                                                                    file2 = file3;
                                                                                    try {
                                                                                        Logger.Companion companion9 = Logger.INSTANCE;
                                                                                        bufferedSource2 = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                                        try {
                                                                                            StringBuilder sb4 = new StringBuilder();
                                                                                            responseOkhttp3CallExecute = response;
                                                                                            try {
                                                                                                try {
                                                                                                    sb4.append("Downloader totalRead=");
                                                                                                    sb4.append(j12);
                                                                                                    sb4.append(" requiredBytes=");
                                                                                                    sb4.append(j14);
                                                                                                    companion9.e(TAG, sb4.toString());
                                                                                                    asset.notifyDownloadEnough();
                                                                                                } catch (Exception e15) {
                                                                                                    e = e15;
                                                                                                    str2 = str2;
                                                                                                    file3 = file2;
                                                                                                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSource2;
                                                                                                    companion3 = Logger.INSTANCE;
                                                                                                    companion3.e(TAG, String.valueOf(e));
                                                                                                    companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                                    progress.setStatus(companion4.getERROR());
                                                                                                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                                                    if (responseOkhttp3CallExecute != null) {
                                                                                                        responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                                    } else {
                                                                                                        responseBodyOkhttp3Response_body3 = null;
                                                                                                    }
                                                                                                    if (responseBodyOkhttp3Response_body3 != null) {
                                                                                                        responseBodyOkhttp3Response_body4.close();
                                                                                                        r rVar110 = r.f64562a;
                                                                                                    }
                                                                                                    if (callNewCall != null) {
                                                                                                        callNewCall.cancel();
                                                                                                        r rVar111 = r.f64562a;
                                                                                                    }
                                                                                                    FileUtility fileUtility9 = FileUtility.INSTANCE;
                                                                                                    fileUtility9.closeQuietly(bufferedSinkBuffer);
                                                                                                    fileUtility9.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                                    companion3.d(TAG, str2 + progress.getStatus());
                                                                                                    status2 = progress.getStatus();
                                                                                                    if (status2 == companion4.getERROR()) {
                                                                                                        z11 = true;
                                                                                                    } else {
                                                                                                        z11 = false;
                                                                                                    }
                                                                                                    if (z11) {
                                                                                                        deliverError(downloadRequest, assetDownloadListener, downloadError);
                                                                                                        return;
                                                                                                    }
                                                                                                    if (status2 == companion4.getCANCELLED()) {
                                                                                                        companion3.d(TAG, str + downloadRequest);
                                                                                                        onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                                        return;
                                                                                                    }
                                                                                                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                                    return;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                str = str;
                                                                                                str2 = str2;
                                                                                                file3 = file2;
                                                                                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSource2;
                                                                                                responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                                                                                if (responseOkhttp3CallExecute != null) {
                                                                                                    responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                                } else {
                                                                                                    responseBodyOkhttp3Response_body = null;
                                                                                                }
                                                                                                if (responseBodyOkhttp3Response_body != null) {
                                                                                                    responseBodyOkhttp3Response_body2.close();
                                                                                                    r rVar112 = r.f64562a;
                                                                                                }
                                                                                                if (callNewCall != null) {
                                                                                                    callNewCall.cancel();
                                                                                                    r rVar113 = r.f64562a;
                                                                                                }
                                                                                                FileUtility fileUtility10 = FileUtility.INSTANCE;
                                                                                                fileUtility10.closeQuietly(bufferedSinkBuffer);
                                                                                                fileUtility10.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                                companion = Logger.INSTANCE;
                                                                                                companion.d(TAG, str2 + progress.getStatus());
                                                                                                status = progress.getStatus();
                                                                                                companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                                if (status == companion2.getERROR()) {
                                                                                                    z10 = true;
                                                                                                } else {
                                                                                                    z10 = false;
                                                                                                }
                                                                                                if (!z10) {
                                                                                                    deliverError(downloadRequest, assetDownloadListener, null);
                                                                                                } else if (status == companion2.getCANCELLED()) {
                                                                                                    companion.d(TAG, str + downloadRequest);
                                                                                                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                                } else {
                                                                                                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (Exception e16) {
                                                                                            e = e16;
                                                                                            responseOkhttp3CallExecute = response;
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            responseOkhttp3CallExecute = response;
                                                                                        }
                                                                                    } catch (Exception e17) {
                                                                                        e = e17;
                                                                                        responseOkhttp3CallExecute = response;
                                                                                        bufferedSource2 = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        responseOkhttp3CallExecute = response;
                                                                                        str = str;
                                                                                        str2 = str2;
                                                                                        file3 = file2;
                                                                                    }
                                                                                }
                                                                                if (contentLength > 0) {
                                                                                    i10 = (int) ((((long) 100) * j12) / contentLength);
                                                                                } else {
                                                                                    i10 = i11;
                                                                                }
                                                                                while (progress.getPercent() + 1 <= Math.min(i10, 100)) {
                                                                                    try {
                                                                                        companion7 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                        progress.setStatus(companion7.getIN_PROGRESS());
                                                                                        try {
                                                                                            progress.setProgressPercent(progress.getPercent() + 1);
                                                                                            if (progress.getPercent() >= 100) {
                                                                                                progress.setStatus(companion7.getDONE());
                                                                                            }
                                                                                            onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                        } catch (Exception e18) {
                                                                                            e = e18;
                                                                                            file3 = file2;
                                                                                            bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSource2;
                                                                                            companion3 = Logger.INSTANCE;
                                                                                            companion3.e(TAG, String.valueOf(e));
                                                                                            companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                            progress.setStatus(companion4.getERROR());
                                                                                            downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                                            if (responseOkhttp3CallExecute != null) {
                                                                                                responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                            } else {
                                                                                                responseBodyOkhttp3Response_body3 = null;
                                                                                            }
                                                                                            if (responseBodyOkhttp3Response_body3 != null) {
                                                                                                responseBodyOkhttp3Response_body4.close();
                                                                                                r rVar114 = r.f64562a;
                                                                                            }
                                                                                            if (callNewCall != null) {
                                                                                                callNewCall.cancel();
                                                                                                r rVar115 = r.f64562a;
                                                                                            }
                                                                                            FileUtility fileUtility11 = FileUtility.INSTANCE;
                                                                                            fileUtility11.closeQuietly(bufferedSinkBuffer);
                                                                                            fileUtility11.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                            companion3.d(TAG, str2 + progress.getStatus());
                                                                                            status2 = progress.getStatus();
                                                                                            if (status2 == companion4.getERROR()) {
                                                                                                z11 = true;
                                                                                            } else {
                                                                                                z11 = false;
                                                                                            }
                                                                                            if (z11) {
                                                                                                deliverError(downloadRequest, assetDownloadListener, downloadError);
                                                                                                return;
                                                                                            }
                                                                                            if (status2 == companion4.getCANCELLED()) {
                                                                                                companion3.d(TAG, str + downloadRequest);
                                                                                                onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                                return;
                                                                                            }
                                                                                            deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                            return;
                                                                                        }
                                                                                    } catch (Exception e19) {
                                                                                        e = e19;
                                                                                    }
                                                                                }
                                                                                file3 = file2;
                                                                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSource2;
                                                                                response = responseOkhttp3CallExecute;
                                                                                j10 = j12;
                                                                                serverPath = serverPath;
                                                                                callNewCall = callNewCall;
                                                                            } catch (Exception e20) {
                                                                                e = e20;
                                                                                responseOkhttp3CallExecute = response;
                                                                                bufferedSource2 = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                                file3 = file3;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                responseOkhttp3CallExecute = response;
                                                                                file3 = file3;
                                                                                str = str;
                                                                                str2 = str2;
                                                                                responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                                                                if (responseOkhttp3CallExecute != null) {
                                                                                    responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                                } else {
                                                                                    responseBodyOkhttp3Response_body = null;
                                                                                }
                                                                                if (responseBodyOkhttp3Response_body != null) {
                                                                                    responseBodyOkhttp3Response_body2.close();
                                                                                    r rVar116 = r.f64562a;
                                                                                }
                                                                                if (callNewCall != null) {
                                                                                    callNewCall.cancel();
                                                                                    r rVar117 = r.f64562a;
                                                                                }
                                                                                FileUtility fileUtility12 = FileUtility.INSTANCE;
                                                                                fileUtility12.closeQuietly(bufferedSinkBuffer);
                                                                                fileUtility12.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                                companion = Logger.INSTANCE;
                                                                                companion.d(TAG, str2 + progress.getStatus());
                                                                                status = progress.getStatus();
                                                                                companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                                if (status == companion2.getERROR()) {
                                                                                    z10 = true;
                                                                                } else {
                                                                                    z10 = false;
                                                                                }
                                                                                if (!z10) {
                                                                                    deliverError(downloadRequest, assetDownloadListener, null);
                                                                                } else if (status == companion2.getCANCELLED()) {
                                                                                    companion.d(TAG, str + downloadRequest);
                                                                                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                } else {
                                                                                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (Exception e21) {
                                                                            e = e21;
                                                                            file3 = file3;
                                                                            responseOkhttp3CallExecute = response;
                                                                            bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                            str2 = str2;
                                                                            iCode = iCode;
                                                                            companion3 = Logger.INSTANCE;
                                                                            companion3.e(TAG, String.valueOf(e));
                                                                            companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                            progress.setStatus(companion4.getERROR());
                                                                            downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                            if (responseOkhttp3CallExecute != null) {
                                                                                responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                            } else {
                                                                                responseBodyOkhttp3Response_body3 = null;
                                                                            }
                                                                            if (responseBodyOkhttp3Response_body3 != null) {
                                                                                responseBodyOkhttp3Response_body4.close();
                                                                                r rVar118 = r.f64562a;
                                                                            }
                                                                            if (callNewCall != null) {
                                                                                callNewCall.cancel();
                                                                                r rVar119 = r.f64562a;
                                                                            }
                                                                            FileUtility fileUtility13 = FileUtility.INSTANCE;
                                                                            fileUtility13.closeQuietly(bufferedSinkBuffer);
                                                                            fileUtility13.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                            companion3.d(TAG, str2 + progress.getStatus());
                                                                            status2 = progress.getStatus();
                                                                            if (status2 == companion4.getERROR()) {
                                                                                z11 = true;
                                                                            } else {
                                                                                z11 = false;
                                                                            }
                                                                            if (z11) {
                                                                                deliverError(downloadRequest, assetDownloadListener, downloadError);
                                                                                return;
                                                                            }
                                                                            if (status2 == companion4.getCANCELLED()) {
                                                                                companion3.d(TAG, str + downloadRequest);
                                                                                onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                                return;
                                                                            }
                                                                            deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                            return;
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            file3 = file3;
                                                                            responseOkhttp3CallExecute = response;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                                                            if (responseOkhttp3CallExecute != null) {
                                                                                responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                            } else {
                                                                                responseBodyOkhttp3Response_body = null;
                                                                            }
                                                                            if (responseBodyOkhttp3Response_body != null) {
                                                                                responseBodyOkhttp3Response_body2.close();
                                                                                r rVar1110 = r.f64562a;
                                                                            }
                                                                            if (callNewCall != null) {
                                                                                callNewCall.cancel();
                                                                                r rVar1111 = r.f64562a;
                                                                            }
                                                                            FileUtility fileUtility14 = FileUtility.INSTANCE;
                                                                            fileUtility14.closeQuietly(bufferedSinkBuffer);
                                                                            fileUtility14.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                            companion = Logger.INSTANCE;
                                                                            companion.d(TAG, str2 + progress.getStatus());
                                                                            status = progress.getStatus();
                                                                            companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                            if (status == companion2.getERROR()) {
                                                                                z10 = true;
                                                                            } else {
                                                                                z10 = false;
                                                                            }
                                                                            if (!z10) {
                                                                                deliverError(downloadRequest, assetDownloadListener, null);
                                                                            } else if (status == companion2.getCANCELLED()) {
                                                                                companion.d(TAG, str + downloadRequest);
                                                                                onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                            } else {
                                                                                deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    file = file3;
                                                                    responseOkhttp3CallExecute = response;
                                                                    bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                    try {
                                                                        bufferedSinkBuffer.flush();
                                                                        status3 = progress.getStatus();
                                                                        companion5 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        if (status3 == companion5.getIN_PROGRESS()) {
                                                                            progress.setStatus(companion5.getDONE());
                                                                            onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                        }
                                                                        if (LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute) != null && (responseBodyOkhttp3Response_body5 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute)) != null) {
                                                                            responseBodyOkhttp3Response_body5.close();
                                                                        }
                                                                        callNewCall.cancel();
                                                                        FileUtility fileUtility15 = FileUtility.INSTANCE;
                                                                        fileUtility15.closeQuietly(bufferedSinkBuffer);
                                                                        fileUtility15.closeQuietly(bufferedSource);
                                                                        companion6 = Logger.INSTANCE;
                                                                        companion6.d(TAG, str2 + progress.getStatus());
                                                                        status4 = progress.getStatus();
                                                                        if (status4 == companion5.getERROR() && status4 != companion5.getSTARTED()) {
                                                                            z12 = false;
                                                                        } else {
                                                                            z12 = true;
                                                                        }
                                                                        if (z12) {
                                                                            deliverError(downloadRequest, assetDownloadListener, null);
                                                                            return;
                                                                        }
                                                                        if (status4 == companion5.getCANCELLED()) {
                                                                            file3 = file;
                                                                            deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                            return;
                                                                        }
                                                                        companion6.d(TAG, str + downloadRequest);
                                                                        onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                        return;
                                                                    } catch (Exception e22) {
                                                                        e = e22;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        file3 = file;
                                                                        bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSource;
                                                                        iCode = iCode;
                                                                        companion3 = Logger.INSTANCE;
                                                                        companion3.e(TAG, String.valueOf(e));
                                                                        companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        progress.setStatus(companion4.getERROR());
                                                                        downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                        if (responseOkhttp3CallExecute != null) {
                                                                            responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                        } else {
                                                                            responseBodyOkhttp3Response_body3 = null;
                                                                        }
                                                                        if (responseBodyOkhttp3Response_body3 != null) {
                                                                            responseBodyOkhttp3Response_body4.close();
                                                                            r rVar1112 = r.f64562a;
                                                                        }
                                                                        if (callNewCall != null) {
                                                                            callNewCall.cancel();
                                                                            r rVar1113 = r.f64562a;
                                                                        }
                                                                        FileUtility fileUtility16 = FileUtility.INSTANCE;
                                                                        fileUtility16.closeQuietly(bufferedSinkBuffer);
                                                                        fileUtility16.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                        companion3.d(TAG, str2 + progress.getStatus());
                                                                        status2 = progress.getStatus();
                                                                        if (status2 == companion4.getERROR()) {
                                                                            z11 = true;
                                                                        } else {
                                                                            z11 = false;
                                                                        }
                                                                        if (z11) {
                                                                            deliverError(downloadRequest, assetDownloadListener, downloadError);
                                                                            return;
                                                                        } else if (status2 == companion4.getCANCELLED()) {
                                                                            companion3.d(TAG, str + downloadRequest);
                                                                            onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                            return;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        file3 = file;
                                                                        bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSource;
                                                                        bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                        responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                                                        if (responseOkhttp3CallExecute != null) {
                                                                            responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                                                        } else {
                                                                            responseBodyOkhttp3Response_body = null;
                                                                        }
                                                                        if (responseBodyOkhttp3Response_body != null) {
                                                                            responseBodyOkhttp3Response_body2.close();
                                                                            r rVar1114 = r.f64562a;
                                                                        }
                                                                        if (callNewCall != null) {
                                                                            callNewCall.cancel();
                                                                            r rVar1115 = r.f64562a;
                                                                        }
                                                                        FileUtility fileUtility17 = FileUtility.INSTANCE;
                                                                        fileUtility17.closeQuietly(bufferedSinkBuffer);
                                                                        fileUtility17.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                                                        companion = Logger.INSTANCE;
                                                                        companion.d(TAG, str2 + progress.getStatus());
                                                                        status = progress.getStatus();
                                                                        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        if (status == companion2.getERROR()) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        if (!z10) {
                                                                            deliverError(downloadRequest, assetDownloadListener, null);
                                                                        } else if (status == companion2.getCANCELLED()) {
                                                                            companion.d(TAG, str + downloadRequest);
                                                                            onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                                                        } else {
                                                                            deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception e23) {
                                                                    e = e23;
                                                                    callNewCall = callNewCall;
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    callNewCall = callNewCall;
                                                                }
                                                            } catch (Exception e24) {
                                                                e = e24;
                                                                callNewCall = callNewCall;
                                                                file3 = file3;
                                                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                                                str2 = "download status: ";
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                str2 = "download status: ";
                                                                str = str;
                                                            }
                                                        } catch (Exception e25) {
                                                            e = e25;
                                                            str = str;
                                                            bufferedSinkBuffer = null;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        str = str;
                                                        bufferedSinkBuffer = null;
                                                    }
                                                } catch (Exception e26) {
                                                    e = e26;
                                                    str = str;
                                                }
                                            } catch (Exception e27) {
                                                e = e27;
                                                str = "On cancel ";
                                            } catch (Throwable th15) {
                                                th = th15;
                                                str = "On cancel ";
                                            }
                                        } catch (Exception e28) {
                                            e = e28;
                                            str = "On cancel ";
                                            file3 = file3;
                                            bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                        }
                                    } else {
                                        str2 = "download status: ";
                                        callNewCall = callNewCall;
                                        responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                        str = "On cancel ";
                                        file3 = file3;
                                        try {
                                            throw new Downloader.RequestException(responseOkhttp3CallExecute.message());
                                        } catch (Exception e29) {
                                            e = e29;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                            bufferedSinkBuffer = null;
                                            bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                            if (responseOkhttp3CallExecute != null) {
                                                responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                                            } else {
                                                responseBodyOkhttp3Response_body = null;
                                            }
                                            if (responseBodyOkhttp3Response_body != null) {
                                                responseBodyOkhttp3Response_body2.close();
                                                r rVar1116 = r.f64562a;
                                            }
                                            if (callNewCall != null) {
                                                callNewCall.cancel();
                                                r rVar1117 = r.f64562a;
                                            }
                                            FileUtility fileUtility18 = FileUtility.INSTANCE;
                                            fileUtility18.closeQuietly(bufferedSinkBuffer);
                                            fileUtility18.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                            companion = Logger.INSTANCE;
                                            companion.d(TAG, str2 + progress.getStatus());
                                            status = progress.getStatus();
                                            companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                            if (status == companion2.getERROR()) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (!z10) {
                                                deliverError(downloadRequest, assetDownloadListener, null);
                                            } else if (status == companion2.getCANCELLED()) {
                                                companion.d(TAG, str + downloadRequest);
                                                onProgressChanged(downloadRequest, progress, assetDownloadListener);
                                            } else {
                                                deliverSuccess(file3, downloadRequest, assetDownloadListener);
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e30) {
                                    e = e30;
                                }
                                str = "On cancel ";
                                file3 = file3;
                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                bufferedSinkBuffer = null;
                            } catch (Exception e31) {
                                e = e31;
                                str2 = "download status: ";
                                callNewCall = callNewCall;
                                responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                                str = "On cancel ";
                                file3 = file3;
                                bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                                bufferedSinkBuffer = null;
                                iCode = -1;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            str2 = "download status: ";
                            callNewCall = callNewCall;
                            str = "On cancel ";
                            file3 = file3;
                        }
                    } catch (Exception e32) {
                        e = e32;
                        callNewCall = callNewCall;
                        bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                        bufferedSinkBuffer = null;
                        iCode = -1;
                        responseOkhttp3CallExecute = null;
                    } catch (Throwable th18) {
                        th = th18;
                        str2 = "download status: ";
                        callNewCall = callNewCall;
                        str = "On cancel ";
                        file3 = file3;
                        bufferedSinkBuffer = null;
                        bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                        responseOkhttp3CallExecute = null;
                    }
                } catch (Exception e33) {
                    e = e33;
                    str = "On cancel ";
                    str2 = "download status: ";
                    file3 = file3;
                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                    bufferedSinkBuffer = null;
                    callNewCall = null;
                    responseOkhttp3CallExecute = null;
                } catch (Throwable th19) {
                    th = th19;
                    str = "On cancel ";
                    str2 = "download status: ";
                    file3 = file3;
                    bufferedSinkBuffer = null;
                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
                    responseOkhttp3CallExecute = null;
                    callNewCall = null;
                }
                companion3 = Logger.INSTANCE;
                companion3.e(TAG, String.valueOf(e));
                companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                progress.setStatus(companion4.getERROR());
                downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if (responseOkhttp3CallExecute != null) {
                    responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                } else {
                    responseBodyOkhttp3Response_body3 = null;
                }
                if (responseBodyOkhttp3Response_body3 != null && (responseBodyOkhttp3Response_body4 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute)) != null) {
                    responseBodyOkhttp3Response_body4.close();
                    r rVar1118 = r.f64562a;
                }
                if (callNewCall != null) {
                    callNewCall.cancel();
                    r rVar1119 = r.f64562a;
                }
                FileUtility fileUtility19 = FileUtility.INSTANCE;
                fileUtility19.closeQuietly(bufferedSinkBuffer);
                fileUtility19.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                companion3.d(TAG, str2 + progress.getStatus());
                status2 = progress.getStatus();
                if (status2 == companion4.getERROR() && status2 != companion4.getSTARTED()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    deliverError(downloadRequest, assetDownloadListener, downloadError);
                    return;
                }
                if (status2 == companion4.getCANCELLED()) {
                    companion3.d(TAG, str + downloadRequest);
                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                    return;
                }
                deliverSuccess(file3, downloadRequest, assetDownloadListener);
                return;
            } catch (Throwable th20) {
                th = th20;
                bufferedSourceRetrofitExceptionCatchingRequestBody_source = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                responseOkhttp3CallExecute = responseOkhttp3CallExecute;
                if (responseOkhttp3CallExecute != null) {
                    responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
                } else {
                    responseBodyOkhttp3Response_body = null;
                }
                if (responseBodyOkhttp3Response_body != null) {
                    responseBodyOkhttp3Response_body2.close();
                    r rVar11110 = r.f64562a;
                }
                if (callNewCall != null) {
                    callNewCall.cancel();
                    r rVar11111 = r.f64562a;
                }
                FileUtility fileUtility110 = FileUtility.INSTANCE;
                fileUtility110.closeQuietly(bufferedSinkBuffer);
                fileUtility110.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                companion = Logger.INSTANCE;
                companion.d(TAG, str2 + progress.getStatus());
                status = progress.getStatus();
                companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                if (status == companion2.getERROR()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    deliverError(downloadRequest, assetDownloadListener, null);
                } else if (status == companion2.getCANCELLED()) {
                    companion.d(TAG, str + downloadRequest);
                    onProgressChanged(downloadRequest, progress, assetDownloadListener);
                } else {
                    deliverSuccess(file3, downloadRequest, assetDownloadListener);
                }
                throw th;
            }
        } catch (Exception e34) {
            e = e34;
            bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
            bufferedSinkBuffer = null;
            iCode = -1;
            callNewCall = null;
        } catch (Throwable th21) {
            th = th21;
            str = "On cancel ";
            str2 = "download status: ";
            file3 = file3;
            bufferedSinkBuffer = null;
            bufferedSourceRetrofitExceptionCatchingRequestBody_source = null;
            responseOkhttp3CallExecute = null;
            callNewCall = null;
        }
        if (responseOkhttp3CallExecute != null) {
            responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute);
        } else {
            responseBodyOkhttp3Response_body = null;
        }
        if (responseBodyOkhttp3Response_body != null && (responseBodyOkhttp3Response_body2 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseOkhttp3CallExecute)) != null) {
            responseBodyOkhttp3Response_body2.close();
            r rVar11112 = r.f64562a;
        }
        if (callNewCall != null) {
            callNewCall.cancel();
            r rVar11113 = r.f64562a;
        }
        FileUtility fileUtility111 = FileUtility.INSTANCE;
        fileUtility111.closeQuietly(bufferedSinkBuffer);
        fileUtility111.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
        companion = Logger.INSTANCE;
        companion.d(TAG, str2 + progress.getStatus());
        status = progress.getStatus();
        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
        if (status == companion2.getERROR() && status != companion2.getSTARTED()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            deliverError(downloadRequest, assetDownloadListener, null);
        } else if (status == companion2.getCANCELLED()) {
            companion.d(TAG, str + downloadRequest);
            onProgressChanged(downloadRequest, progress, assetDownloadListener);
        } else {
            deliverSuccess(file3, downloadRequest, assetDownloadListener);
        }
        throw th;
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onProgress(progress, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest downloadRequest) {
        if (downloadRequest == null || downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequest(downloadRequest, assetDownloadListener);
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.a
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m3233download$lambda0(downloadRequest, this, assetDownloadListener);
            }
        });
    }

    private final ResponseBody decodeGzipIfNeeded(Response networkResponse) {
        ResponseBody responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(networkResponse);
        if (x.E(GZIP, Response.header$default(networkResponse, CONTENT_ENCODING, null, 2, null), true) && responseBodyOkhttp3Response_body != null) {
            return new RealResponseBody(Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyOkhttp3Response_body))));
        }
        return responseBodyOkhttp3Response_body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m3233download$lambda0(DownloadRequest downloadRequest, AssetDownloader assetDownloader, AssetDownloadListener assetDownloadListener) {
        p.j(assetDownloader, "this$0");
        assetDownloader.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }
}

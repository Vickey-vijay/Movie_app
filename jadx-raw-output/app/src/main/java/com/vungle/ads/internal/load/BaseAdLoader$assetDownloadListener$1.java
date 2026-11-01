package com.vungle.ads.internal.load;

import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.DeviceCheckUtils;
import com.vungle.ads.internal.util.Logger;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: BaseAdLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/vungle/ads/internal/load/BaseAdLoader$assetDownloadListener$1", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "downloadRequest", "Lmj/r;", "onStart", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "progress", "onProgress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "error", "onError", "Ljava/io/File;", C3426d4.i.f28530b, "onSuccess", "", "partialDownloadRecorded", "Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class BaseAdLoader$assetDownloadListener$1 implements AssetDownloadListener {
    private boolean partialDownloadRecorded;
    public final /* synthetic */ BaseAdLoader this$0;

    public BaseAdLoader$assetDownloadListener$1(BaseAdLoader baseAdLoader) {
        this.this$0 = baseAdLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onError$lambda-1, reason: not valid java name */
    public static final void m3242onError$lambda1(DownloadRequest downloadRequest, BaseAdLoader baseAdLoader, BaseAdLoader$assetDownloadListener$1 baseAdLoader$assetDownloadListener$1, AssetDownloadListener.DownloadError downloadError) {
        p.j(downloadRequest, "$downloadRequest");
        p.j(baseAdLoader, "this$0");
        p.j(baseAdLoader$assetDownloadListener$1, "this$1");
        AdAsset asset = downloadRequest.getAsset();
        if (asset.isPrivacyIcon()) {
            File fileInjectPrivacyIcon = DefaultPrivacyIconInjector.INSTANCE.injectPrivacyIcon(baseAdLoader.getPathProvider().getVmDir());
            if (fileInjectPrivacyIcon != null && fileInjectPrivacyIcon.exists()) {
                baseAdLoader$assetDownloadListener$1.onSuccess(fileInjectPrivacyIcon, downloadRequest);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(baseAdLoader.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
        baseAdLoader.fullyDownloaded.set(false);
        if (asset.getIsRequired()) {
            baseAdLoader.requiredAssetDownloaded.set(false);
        }
        new AssetRequestError("Failed to download assets " + asset.getServerPath() + ". error: " + downloadError + " proxyEnabled=" + DeviceCheckUtils.INSTANCE.isProxyEnabled(baseAdLoader.getContext())).setLogEntry$vungle_ads_release(baseAdLoader.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (asset.getIsRequired()) {
            baseAdLoader.downloadRequiredAssets.remove(downloadRequest.getAsset().getServerPath());
            if (baseAdLoader.downloadRequiredAssets.isEmpty()) {
                baseAdLoader.onAdLoadFailed(new AssetRequestError("Error: Failed to download required assets."));
                baseAdLoader.cancel();
                return;
            }
        }
        if (baseAdLoader.downloadCount.decrementAndGet() <= 0) {
            baseAdLoader.onAdLoadFailed(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSuccess$lambda-2, reason: not valid java name */
    public static final void m3244onSuccess$lambda2(File file, BaseAdLoader$assetDownloadListener$1 baseAdLoader$assetDownloadListener$1, DownloadRequest downloadRequest, BaseAdLoader baseAdLoader) {
        p.j(file, "$file");
        p.j(baseAdLoader$assetDownloadListener$1, "this$0");
        p.j(downloadRequest, "$downloadRequest");
        p.j(baseAdLoader, "this$1");
        if (!file.exists()) {
            baseAdLoader$assetDownloadListener$1.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()), downloadRequest);
            return;
        }
        AdAsset asset = downloadRequest.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(AdAsset.Status.DOWNLOAD_SUCCESS);
        if (asset.isHtmlTemplate()) {
            downloadRequest.stopTemplateRecord();
            baseAdLoader.templateHtmlSizeMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(baseAdLoader.templateHtmlSizeMetric, baseAdLoader.getLogEntry(), asset.getServerPath());
        } else if (asset.isMainVideo()) {
            baseAdLoader.mainVideoSizeMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(baseAdLoader.mainVideoSizeMetric, baseAdLoader.getLogEntry(), asset.getServerPath());
        }
        AdPayload advertisement = baseAdLoader.getAdvertisement();
        if (advertisement != null) {
            advertisement.updateAdAssetPath(asset.getAdIdentifier(), file);
        }
        if (asset.isHtmlTemplate() && !baseAdLoader.processVmTemplate(asset, baseAdLoader.getAdvertisement())) {
            baseAdLoader.fullyDownloaded.set(false);
            if (asset.getIsRequired()) {
                baseAdLoader.requiredAssetDownloaded.set(false);
            }
        }
        if (asset.getIsRequired()) {
            baseAdLoader.downloadRequiredAssets.remove(asset.getServerPath());
            if (baseAdLoader.downloadRequiredAssets.isEmpty()) {
                if (!baseAdLoader.requiredAssetDownloaded.get()) {
                    baseAdLoader.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                    baseAdLoader.cancel();
                    return;
                }
                baseAdLoader.onRequiredDownloadCompleted();
            }
        }
        if (baseAdLoader.downloadCount.decrementAndGet() <= 0) {
            if (baseAdLoader.fullyDownloaded.get()) {
                baseAdLoader.onDownloadCompleted(baseAdLoader.getAdRequest());
            } else {
                baseAdLoader.onAdLoadFailed(new AssetRequestError("Failed to download assets."));
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onError(final AssetDownloadListener.DownloadError downloadError, final DownloadRequest downloadRequest) {
        p.j(downloadRequest, "downloadRequest");
        Logger.INSTANCE.e("BaseAdLoader", "onError called: " + downloadError);
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: bd.c
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m3242onError$lambda1(downloadRequest, baseAdLoader, this, downloadError);
            }
        });
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
        p.j(progress, "progress");
        p.j(downloadRequest, "downloadRequest");
        final AdAsset asset = downloadRequest.getAsset();
        Logger.Companion companion = Logger.INSTANCE;
        companion.d("BaseAdLoader", "Download progress: " + progress + " url: " + asset.getServerPath());
        if (!asset.getIsRequired() || asset.getPercentage() == null || asset.getPercentage().intValue() <= 0 || progress.getPercent() < asset.getPercentage().intValue() || this.partialDownloadRecorded) {
            return;
        }
        this.partialDownloadRecorded = true;
        downloadRequest.stopPartialDownloadRecord();
        companion.w("BaseAdLoader", "Download progress: hit chunk percentage=" + asset.getPercentage() + " for url: " + asset.getServerPath());
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: bd.b
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m3243onProgress$lambda0(baseAdLoader, asset);
            }
        });
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onStart(DownloadRequest downloadRequest) {
        p.j(downloadRequest, "downloadRequest");
        Logger.INSTANCE.w("BaseAdLoader", "onStart called: " + downloadRequest.getAsset().getServerPath());
        AdAsset asset = downloadRequest.getAsset();
        if (asset.getIsRequired()) {
            Integer percentage = asset.getPercentage();
            if ((percentage != null ? percentage.intValue() : 0) > 0) {
                downloadRequest.startPartialDownloadRecord();
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onSuccess(final File file, final DownloadRequest downloadRequest) {
        p.j(file, C3426d4.i.f28530b);
        p.j(downloadRequest, "downloadRequest");
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: bd.d
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m3244onSuccess$lambda2(file, this, downloadRequest, baseAdLoader);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onProgress$lambda-0, reason: not valid java name */
    public static final void m3243onProgress$lambda0(BaseAdLoader baseAdLoader, AdAsset adAsset) {
        p.j(baseAdLoader, "this$0");
        p.j(adAsset, "$adAsset");
        baseAdLoader.downloadRequiredAssets.remove(adAsset.getServerPath());
        if (baseAdLoader.downloadRequiredAssets.isEmpty()) {
            if (baseAdLoader.requiredAssetDownloaded.get()) {
                baseAdLoader.onRequiredDownloadCompleted();
            } else {
                baseAdLoader.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                baseAdLoader.cancel();
            }
        }
    }
}

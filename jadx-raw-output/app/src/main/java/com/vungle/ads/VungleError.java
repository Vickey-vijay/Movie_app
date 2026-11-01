package com.vungle.ads;

import ck.i;
import ck.p;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import kotlin.Metadata;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"\u0082\u00012%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUV¨\u0006W"}, d2 = {"Lcom/vungle/ads/VungleError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "getLocalizedMessage", "logError$vungle_ads_release", "()Lcom/vungle/ads/VungleError;", "logError", "Lmj/r;", "logErrorNoReturnValue$vungle_ads_release", "()V", "logErrorNoReturnValue", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)Lcom/vungle/ads/VungleError;", "setLogEntry", "", "other", "", "equals", "", "hashCode", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "loggableReason", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "errorMessage", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "code", "I", "getCode", "()I", "Lcom/vungle/ads/internal/util/LogEntry;", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;)V", "Lcom/vungle/ads/APIFailedStatusCodeError;", "Lcom/vungle/ads/AdCantPlayWithoutWebView;", "Lcom/vungle/ads/AdExpiredError;", "Lcom/vungle/ads/AdExpiredOnPlayError;", "Lcom/vungle/ads/AdMarkupInvalidError;", "Lcom/vungle/ads/AdMarkupJsonError;", "Lcom/vungle/ads/AdNotLoadedCantPlay;", "Lcom/vungle/ads/AdPayloadError;", "Lcom/vungle/ads/AdResponseEmptyError;", "Lcom/vungle/ads/AdRetryActiveError;", "Lcom/vungle/ads/AdRetryError;", "Lcom/vungle/ads/AssetFailedToDeleteError;", "Lcom/vungle/ads/AssetRequestError;", "Lcom/vungle/ads/AssetWriteError;", "Lcom/vungle/ads/ConcurrentPlaybackUnsupported;", "Lcom/vungle/ads/EmptyBidPayloadError;", "Lcom/vungle/ads/EvaluateJsError;", "Lcom/vungle/ads/GzipEncodeError;", "Lcom/vungle/ads/HeartbeatMissingError;", "Lcom/vungle/ads/IndexHtmlError;", "Lcom/vungle/ads/InvalidAdStateError;", "Lcom/vungle/ads/InvalidAppId;", "Lcom/vungle/ads/InvalidAssetUrlError;", "Lcom/vungle/ads/InvalidBannerSizeError;", "Lcom/vungle/ads/InvalidBidPayloadError;", "Lcom/vungle/ads/InvalidCTAUrl;", "Lcom/vungle/ads/InvalidEndpointError;", "Lcom/vungle/ads/InvalidEventIdError;", "Lcom/vungle/ads/InvalidTemplateURLError;", "Lcom/vungle/ads/JsonEncodeError;", "Lcom/vungle/ads/LinkError;", "Lcom/vungle/ads/MraidTemplateError;", "Lcom/vungle/ads/NativeAssetError;", "Lcom/vungle/ads/NetworkTimeoutError;", "Lcom/vungle/ads/NetworkUnreachable;", "Lcom/vungle/ads/NoSpaceError;", "Lcom/vungle/ads/OmSdkJsError;", "Lcom/vungle/ads/OutOfMemory;", "Lcom/vungle/ads/PlacementAdTypeMismatchError;", "Lcom/vungle/ads/PlacementMismatchError;", "Lcom/vungle/ads/PlacementNotFoundError;", "Lcom/vungle/ads/PrivacyIconFallbackError;", "Lcom/vungle/ads/PrivacyUrlError;", "Lcom/vungle/ads/SdkNotInitialized;", "Lcom/vungle/ads/SdkVersionTooLow;", "Lcom/vungle/ads/TpatError;", "Lcom/vungle/ads/UserAgentError;", "Lcom/vungle/ads/WebViewError;", "Lcom/vungle/ads/WebViewRenderProcessUnresponsive;", "Lcom/vungle/ads/WebViewRenderingProcessGone;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public abstract class VungleError extends Exception {
    private final int code;
    private final String errorMessage;
    private LogEntry logEntry;
    private final Sdk.SDKError.Reason loggableReason;

    private VungleError(Sdk.SDKError.Reason reason, String str) {
        super(str);
        this.loggableReason = reason;
        this.errorMessage = str;
        this.code = reason.getNumber();
    }

    public /* synthetic */ VungleError(Sdk.SDKError.Reason reason, String str, i iVar) {
        this(reason, str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!p.e(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        p.h(other, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        VungleError vungleError = (VungleError) other;
        return this.loggableReason == vungleError.loggableReason && p.e(this.errorMessage, vungleError.errorMessage) && p.e(this.logEntry, vungleError.logEntry);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iHashCode = ((this.loggableReason.hashCode() * 31) + this.errorMessage.hashCode()) * 31;
        LogEntry logEntry = this.logEntry;
        return iHashCode + (logEntry != null ? logEntry.hashCode() : 0);
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(this.loggableReason, this.errorMessage, this.logEntry);
    }

    public final VungleError setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
        return this;
    }

    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }
}

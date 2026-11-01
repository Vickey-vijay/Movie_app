package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ck.p;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.net.URISyntaxException;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExternalRouter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\nJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002JE\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/util/ExternalRouter;", "", "()V", "TAG", "", "getIntentFromUrl", "Landroid/content/Intent;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "url", "getIntentFromUrl$vungle_ads_release", "contextIsNotActivity", "", "launch", "deeplinkUrl", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "launch$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ExternalRouter {
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0012  */
    /* JADX WARN: Code duplicated, block: B:13:0x0013 A[Catch: URISyntaxException -> 0x000d, TryCatch #0 {URISyntaxException -> 0x000d, blocks: (B:4:0x0004, B:16:0x001c, B:13:0x0013), top: B:20:0x0004 }] */
    private final Intent getIntentFromUrl(String url, boolean contextIsNotActivity) {
        boolean z10;
        Intent uri = null;
        if (url != null) {
            try {
                z10 = url.length() == 0;
                if (z10) {
                    uri = Intent.parseUri(url, 0);
                }
                if (uri != null && contextIsNotActivity) {
                    uri.setFlags(268435456);
                }
            } catch (URISyntaxException e10) {
                Logger.INSTANCE.e(TAG, "url format is not correct " + e10.getLocalizedMessage());
            }
        } else {
            if (z10) {
                uri = Intent.parseUri(url, 0);
            }
            if (uri != null) {
                uri.setFlags(268435456);
            }
        }
        return uri;
    }

    public static /* synthetic */ Intent getIntentFromUrl$default(ExternalRouter externalRouter, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl(str, z10);
    }

    public static /* synthetic */ Intent getIntentFromUrl$vungle_ads_release$default(ExternalRouter externalRouter, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl$vungle_ads_release(context, str);
    }

    public final Intent getIntentFromUrl$vungle_ads_release(Context context, String url) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return getIntentFromUrl(url, !(context instanceof Activity));
    }

    public final boolean launch$vungle_ads_release(String deeplinkUrl, String url, Context context, LogEntry logEntry, PresenterAdOpenCallback adOpenCallback) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        boolean z10 = true;
        if (deeplinkUrl == null || deeplinkUrl.length() == 0) {
            if (url == null || url.length() == 0) {
                return false;
            }
        }
        boolean z11 = !(context instanceof Activity);
        try {
            return ActivityManager.INSTANCE.startWhenForeground(context, getIntentFromUrl(deeplinkUrl, z11), getIntentFromUrl(url, z11), adOpenCallback);
        } catch (Exception e10) {
            if (deeplinkUrl != null && deeplinkUrl.length() != 0) {
                z10 = false;
            }
            if (z10) {
                new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, "Fail to open " + url).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
            Logger.Companion companion = Logger.INSTANCE;
            companion.e(TAG, "Error while opening url" + e10.getLocalizedMessage());
            companion.d(TAG, "Cannot open url " + url);
            return false;
        }
    }
}

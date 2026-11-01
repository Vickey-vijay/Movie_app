package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import ck.p;
import com.vungle.ads.internal.presenter.WebViewManager;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: ViewUtility.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/util/ViewUtility;", "", "()V", "dpToPixels", "", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "dp", "getDeviceWidthAndHeightWithOrientation", "Lkotlin/Pair;", "orientation", "getWebView", "Landroid/webkit/WebView;", "eventId", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewUtility {
    public static final ViewUtility INSTANCE = new ViewUtility();

    private ViewUtility() {
    }

    public final int dpToPixels(Context context, int dp2) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return (int) ((dp2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final Pair<Integer, Integer> getDeviceWidthAndHeightWithOrientation(Context context, int orientation) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i10 = resources.getConfiguration().orientation;
        if (orientation == 0) {
            orientation = i10;
        }
        return orientation == i10 ? new Pair<>(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density))) : new Pair<>(Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }

    public final WebView getWebView(Context context, String eventId) throws InstantiationException {
        p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            return WebViewManager.INSTANCE.getOrCreateWebView(context, eventId);
        } catch (Resources.NotFoundException e10) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e10 + ".message");
        } catch (Exception e11) {
            throw new InstantiationException(e11.getMessage());
        }
    }
}

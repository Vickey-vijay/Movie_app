package com.unity3d.services.banners;

import android.content.Context;
import ck.i;
import ck.p;
import com.unity3d.services.core.misc.ViewUtilities;
import com.vungle.ads.internal.protos.Sdk;
import ek.b;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: UnityBannerSize.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;
    public static final Companion Companion = new Companion(null);
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    private static final UnityBannerSize standard = new UnityBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);

    /* JADX INFO: compiled from: UnityBannerSize.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final UnityBannerSize getDynamicSize(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            int iC = b.c(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            if (iC >= getLeaderboard().getWidth()) {
                return getLeaderboard();
            }
            return iC >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }

        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }
    }

    public static final UnityBannerSize getDynamicSize(Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public UnityBannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}

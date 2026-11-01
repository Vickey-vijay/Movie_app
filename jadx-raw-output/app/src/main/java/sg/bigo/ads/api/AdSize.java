package sg.bigo.ads.api;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes8.dex */
public final class AdSize extends p {
    public static final String ADAPTIVE = "adaptive";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p f69282d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69283a;
    public static final AdSize BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "320x50");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(com.safedk.android.internal.d.f44769a, 250, "300x250");
    public static final AdSize LARGE_BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, "320x90");
    public static final AdSize MOBILE_LARGE_LEADERBOARD = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "320x100");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90");

    private AdSize(int i10, int i11, String str) {
        super(i10, i11);
        this.f69283a = str;
    }

    public static int dp2px(Context context, int i10) {
        if (context == null) {
            return 0;
        }
        return e.a(context, i10);
    }

    public static AdSize getAdaptiveAdSize(Context context, int i10) {
        float f10;
        float f11;
        int iRound;
        if (context == null || i10 == 0) {
            return BANNER;
        }
        if (f69282d == null) {
            f69282d = e.e(context);
        }
        int height = f69282d.getHeight();
        if (height <= 0) {
            return BANNER;
        }
        int iMin = Math.min(90, Math.round(height * 0.15f));
        if (i10 < 0) {
            i10 = f69282d.getWidth();
        }
        if (i10 <= 655) {
            if (i10 > 632) {
                iRound = 81;
            } else if (i10 > 526) {
                f10 = i10 / 468.0f;
                f11 = 60.0f;
            } else if (i10 > 432) {
                iRound = 68;
            } else {
                f10 = i10 / 320.0f;
                f11 = 50.0f;
            }
            return new AdSize(i10, Math.max(Math.min(iRound, iMin), 50), ADAPTIVE);
        }
        f10 = i10 / 728.0f;
        f11 = 90.0f;
        iRound = Math.round(f10 * f11);
        return new AdSize(i10, Math.max(Math.min(iRound, iMin), 50), ADAPTIVE);
    }

    @Override // sg.bigo.ads.common.p
    public final int getHeight() {
        return super.getHeight();
    }

    @Override // sg.bigo.ads.common.p
    public final int getWidth() {
        return super.getWidth();
    }
}

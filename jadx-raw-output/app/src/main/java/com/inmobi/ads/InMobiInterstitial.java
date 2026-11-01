package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC2905ha;
import com.inmobi.media.AbstractC2929i9;
import com.inmobi.media.AbstractC2995l1;
import com.inmobi.media.C2930ia;
import com.inmobi.media.C2953j9;
import com.inmobi.media.C2954ja;
import com.inmobi.media.C2979ka;
import com.inmobi.media.C3004la;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.P9;
import com.inmobi.media.Pj;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import mj.g;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class InMobiInterstitial {
    public static final C2953j9 Companion = new C2953j9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jg f22301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f22302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f22303f;
    public C3004la mAdManager;
    public AbstractC2905ha mPubListener;

    public static final class a extends C2979ka {
        @Override // com.inmobi.media.C2979ka, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
            p.j(inMobiInterstitial, "interstitial");
        }

        @Override // com.inmobi.media.C2979ka, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) throws JSONException {
            p.j(adMetaInfo, "info");
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiInterstitial inMobiInterstitial = this.f24665a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().i();
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    p.i(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }

        @Override // com.inmobi.media.C2979ka, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            AbstractC2905ha mPubListener$media_release;
            p.j(inMobiAdRequestStatus, "status");
            InMobiInterstitial inMobiInterstitial = this.f24665a.get();
            if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
                mPubListener$media_release.a(inMobiInterstitial, inMobiAdRequestStatus);
            }
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void load(byte[] bArr) {
        this.f22299b = true;
        Jg jg2 = this.f22301d;
        p.j("AB", "<set-?>");
        jg2.f22941g = "AB";
        C3004la mAdManager$media_release = getMAdManager$media_release();
        Jg jg3 = this.f22301d;
        Context context = this.f22298a;
        if (context == null) {
            p.B("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, true, "intHtml");
        if (Build.VERSION.SDK_INT >= 29) {
            J5.c((Context) this.f22300c.get());
        }
        getMAdManager$media_release().a(bArr, this.f22302e);
    }

    @UiThread
    public final void show(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        if (context instanceof Activity) {
            a((Activity) context);
            return;
        }
        p.i("InMobiInterstitial", "TAG");
        Kb.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
        a(null);
    }

    public InMobiInterstitial(Context context, long j10, InterstitialAdEventListener interstitialAdEventListener) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(interstitialAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Jg jg2 = new Jg();
        this.f22301d = jg2;
        this.f22302e = new a(this);
        this.f22303f = new e(this);
        if (!Ji.d()) {
            p.i("InMobiInterstitial", "TAG");
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        this.f22298a = context.getApplicationContext();
        jg2.f22935a = j10;
        this.f22300c = new WeakReference(context);
        setMPubListener$media_release(new C2930ia(interstitialAdEventListener));
        setMAdManager$media_release(new C3004la());
    }

    public final void a(Activity activity) {
        try {
            if (this.f22299b) {
                getMAdManager$media_release().a(activity);
            } else {
                p.i("InMobiInterstitial", "TAG");
                Kb.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e10) {
            p.i("InMobiInterstitial", "TAG");
            Kb.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            p.i("InMobiInterstitial", "TAG");
            e10.getMessage();
            g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final void disableHardwareAcceleration() {
        this.f22301d.f22938d = true;
    }

    public final C3004la getMAdManager$media_release() {
        C3004la c3004la = this.mAdManager;
        if (c3004la != null) {
            return c3004la;
        }
        p.B("mAdManager");
        return null;
    }

    public final AbstractC2905ha getMPubListener$media_release() {
        AbstractC2905ha abstractC2905ha = this.mPubListener;
        if (abstractC2905ha != null) {
            return abstractC2905ha;
        }
        p.B("mPubListener");
        return null;
    }

    public final PreloadManager getPreloadManager() {
        return this.f22303f;
    }

    public final void getSignals() {
        Jg jg2 = this.f22301d;
        jg2.getClass();
        p.j("AB", "<set-?>");
        jg2.f22941g = "AB";
        C3004la mAdManager$media_release = getMAdManager$media_release();
        Jg jg3 = this.f22301d;
        Context context = this.f22298a;
        if (context == null) {
            p.B("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, false, "getToken");
        getMAdManager$media_release().a(this.f22302e);
    }

    public final void notifyLoss(int i10, double d10) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        C3004la mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC2995l1 abstractC2995l1F = mAdManager$media_release.f();
            strA = abstractC2995l1F != null ? abstractC2995l1F.a(i10, d10) : null;
        }
        if (strA != null) {
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double d10) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        C3004la mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC2995l1 abstractC2995l1F = mAdManager$media_release.f();
            strA = abstractC2995l1F != null ? abstractC2995l1F.a(d10) : null;
        }
        if (strA != null) {
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void setContentUrl(String str) {
        p.j(str, "contentUrl");
        this.f22301d.f22939e = str;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f23020b = str;
            }
            String str2 = map.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f23019a = str2;
            }
        }
        this.f22301d.f22937c = map;
    }

    public final void setKeywords(String str) {
        this.f22301d.f22936b = str;
    }

    public final void setListener(InterstitialAdEventListener interstitialAdEventListener) {
        p.j(interstitialAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        setMPubListener$media_release(new C2930ia(interstitialAdEventListener));
    }

    public final void setMAdManager$media_release(C3004la c3004la) {
        p.j(c3004la, "<set-?>");
        this.mAdManager = c3004la;
    }

    public final void setMPubListener$media_release(AbstractC2905ha abstractC2905ha) {
        p.j(abstractC2905ha, "<set-?>");
        this.mPubListener = abstractC2905ha;
    }

    public final boolean isReady() {
        boolean z10;
        C2954ja c2954ja;
        Pj pj2;
        C3004la mAdManager$media_release = getMAdManager$media_release();
        C2954ja c2954ja2 = mAdManager$media_release.f24758h;
        if (c2954ja2 != null && 2 == mAdManager$media_release.f22537a && c2954ja2.f24710b == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (((c2954ja = getMAdManager$media_release().f24758h) == null || (pj2 = c2954ja.H) == null || !pj2.f23344b) && c2954ja != null)) {
            c2954ja.a0();
        }
        return z10;
    }

    @VisibleForTesting
    public final void loadAdUnit() {
        getMAdManager$media_release().b(this.f22302e);
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        p.j(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    @UiThread
    public final void show() {
        a(null);
    }

    @UiThread
    public final void load() {
        try {
            this.f22299b = true;
            Jg jg2 = this.f22301d;
            p.j("NonAB", "<set-?>");
            jg2.f22941g = "NonAB";
            C3004la mAdManager$media_release = getMAdManager$media_release();
            Jg jg3 = this.f22301d;
            Context context = this.f22298a;
            if (context == null) {
                p.B("mContext");
                context = null;
            }
            mAdManager$media_release.a(jg3, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                J5.c((Context) this.f22300c.get());
            }
            loadAdUnit();
        } catch (Exception e10) {
            p.i("InMobiInterstitial", "TAG");
            Kb.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            p.i("InMobiInterstitial", "TAG");
            e10.getMessage();
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().f24758h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }
}

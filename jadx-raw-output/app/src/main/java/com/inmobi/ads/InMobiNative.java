package com.inmobi.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC2831ed;
import com.inmobi.media.AbstractC2929i9;
import com.inmobi.media.Ac;
import com.inmobi.media.C2755be;
import com.inmobi.media.C2806dd;
import com.inmobi.media.C3053n9;
import com.inmobi.media.C3107pd;
import com.inmobi.media.C3182se;
import com.inmobi.media.InterfaceC2786cj;
import com.inmobi.media.InterfaceC3028m9;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.P9;
import com.inmobi.media.Rg;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import mj.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class InMobiNative {
    public static final String APP_INSTALLS = "AppInstalls";
    public static final String LIKES = "Likes";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2806dd f22310a;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f22309b = "InMobiNative";

    public interface LockScreenListener {
        void onActionRequired(InMobiNative inMobiNative);
    }

    public final void load(byte[] bArr) {
        C2806dd c2806dd = this.f22310a;
        Jg jg2 = c2806dd.f24234a;
        p.j("AB", "<set-?>");
        jg2.f22941g = "AB";
        c2806dd.f24237d.f22732b.a(bArr);
    }

    public static final class Companion {
        public Companion(i iVar) {
        }
    }

    public InMobiNative(Context context, long j10, NativeAdEventListener nativeAdEventListener) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(nativeAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C2806dd c2806dd = new C2806dd(this, context, j10);
        this.f22310a = c2806dd;
        if (Ji.d()) {
            p.j(nativeAdEventListener, "adEventListener");
            c2806dd.f24235b.f23463a = nativeAdEventListener;
        } else {
            String str = f22309b;
            p.i(str, "TAG");
            throw new SdkNotInitializedException(str);
        }
    }

    public final void destroy() {
        C2806dd c2806dd = this.f22310a;
        c2806dd.getClass();
        try {
            c2806dd.f24238e = null;
            Rg rg2 = c2806dd.f24235b;
            rg2.f23463a = null;
            rg2.f23464b = null;
            rg2.f23465c = null;
            c2806dd.f24236c.f22807c.clear();
            c2806dd.f24237d.f22732b.j();
        } catch (Exception e10) {
            String str = AbstractC2831ed.f24309a;
            p.i(str, "access$getTAG$p(...)");
            Kb.a((byte) 1, str, "Failed to destroy ad; SDK encountered an unexpected error");
            g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final View getAdChoiceIcon() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24070j;
        }
        return null;
    }

    public final JSONObject getAdContent() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24065e;
        }
        return null;
    }

    public final String getAdDescription() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24062b;
        }
        return null;
    }

    public final InMobiNativeImage getAdIcon() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24063c;
        }
        return null;
    }

    public final float getAdRating() {
        Float f10;
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be == null || (f10 = c2755be.f24067g) == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public final String getAdTitle() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24061a;
        }
        return null;
    }

    public final String getAdvertiserName() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24066f;
        }
        return null;
    }

    public final String getCtaText() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24064d;
        }
        return null;
    }

    public final MediaView getMediaView() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24069i;
        }
        return null;
    }

    public final boolean isReady() {
        return this.f22310a.f24238e != null;
    }

    public final boolean isVideo() {
        C2755be c2755be = this.f22310a.f24238e;
        if (c2755be != null) {
            return c2755be.f24068h;
        }
        return false;
    }

    public final void notifyLoss(int i10, double d10) {
        String strA = this.f22310a.f24237d.f22732b.a(i10, d10);
        if (strA.length() > 0) {
            Kb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void notifyWin(double d10) {
        String strA = this.f22310a.f24237d.f22732b.a(d10);
        if (strA.length() > 0) {
            Kb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void registerViewForTracking(InMobiNativeViewData inMobiNativeViewData) {
        p.j(inMobiNativeViewData, "inMobiNativeViewData");
        C2806dd c2806dd = this.f22310a;
        c2806dd.getClass();
        p.j(inMobiNativeViewData, "inMobiNativeViewData");
        c2806dd.f24237d.a(inMobiNativeViewData);
    }

    public final void setContentUrl(String str) {
        this.f22310a.f24234a.f22939e = str;
    }

    public final void setExtras(Map<String, String> map) {
        C2806dd c2806dd = this.f22310a;
        if (map != null) {
            c2806dd.getClass();
            String str = map.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f23020b = str;
            }
            String str2 = map.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f23019a = str2;
            }
        }
        c2806dd.f24234a.f22937c = map;
    }

    public final void setKeywords(String str) {
        this.f22310a.f24234a.f22936b = str;
    }

    public final void setListener(NativeAdEventListener nativeAdEventListener) {
        p.j(nativeAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C2806dd c2806dd = this.f22310a;
        c2806dd.getClass();
        p.j(nativeAdEventListener, "adEventListener");
        c2806dd.f24235b.f23463a = nativeAdEventListener;
    }

    public final void setVideoEventListener(VideoEventListener videoEventListener) {
        p.j(videoEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C2806dd c2806dd = this.f22310a;
        c2806dd.getClass();
        p.j(videoEventListener, "videoEventListener");
        c2806dd.f24235b.f23464b = videoEventListener;
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        p.j(lockScreenListener, "lockScreenListener");
        C2806dd c2806dd = this.f22310a;
        c2806dd.getClass();
        p.j(lockScreenListener, "lockScreenListener");
        c2806dd.f24234a.f22940f = true;
        c2806dd.f24235b.f23465c = lockScreenListener;
    }

    public final void takeAction() {
        Ac ac2 = this.f22310a.f24237d.f22732b;
        InterfaceC2786cj interfaceC2786cj = ac2.f22360c;
        C3107pd c3107pd = interfaceC2786cj instanceof C3107pd ? (C3107pd) interfaceC2786cj : null;
        if (c3107pd != null) {
            InterfaceC3028m9 interfaceC3028m9L = c3107pd.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("AUM-NativeLoadedState", "takeAction - delegating to ad unit");
            }
            c3107pd.f25073h.a();
        }
        InterfaceC2786cj interfaceC2786cj2 = ac2.f22360c;
        C3182se c3182se = interfaceC2786cj2 instanceof C3182se ? (C3182se) interfaceC2786cj2 : null;
        if (c3182se != null) {
            InterfaceC3028m9 interfaceC3028m9L2 = c3182se.l();
            if (interfaceC3028m9L2 != null) {
                ((C3053n9) interfaceC3028m9L2).a("AUM-NativeRenderedState", "takeAction - delegating to ad unit");
            }
            c3182se.f25321f.a();
        }
    }

    public final void unTrackViews() {
        this.f22310a.f24237d.f22732b.d();
    }

    public final void load() {
        C2806dd c2806dd = this.f22310a;
        Jg jg2 = c2806dd.f24234a;
        p.j("NonAB", "<set-?>");
        jg2.f22941g = "NonAB";
        c2806dd.f24237d.f22732b.c();
    }
}

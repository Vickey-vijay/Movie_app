package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C2954ja;
import com.inmobi.media.EnumC2721a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2954ja extends AbstractC2995l1 {
    public int F;
    public boolean G;
    public final Pj H;
    public bk.a I;

    public static final mj.r d(C2954ja c2954ja) throws JSONException {
        c2954ja.Y();
        return mj.r.f64562a;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44963i);
        p10.startActivity(p11);
    }

    @Override // com.inmobi.media.InterfaceC3268w0
    public final void a(int i10, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
    }

    public final short b(Context context) {
        int i10;
        try {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                ck.p.i("ja", "TAG");
                c3053n9.a("ja", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI = i();
            if (gestureDetectorOnGestureListenerC2785ciI == null) {
                return (short) 2155;
            }
            if (ck.p.e("unknown", gestureDetectorOnGestureListenerC2785ciI.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.f22317k;
            ck.p.j(gestureDetectorOnGestureListenerC2785ciI, "container");
            int iHashCode = gestureDetectorOnGestureListenerC2785ciI.hashCode();
            InMobiAdActivity.f22317k.put(iHashCode, gestureDetectorOnGestureListenerC2785ciI);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                String string = UUID.randomUUID().toString();
                ck.p.i(string, "toString(...)");
                HashMap map = P8.f23320a;
                String string2 = string.toString();
                ck.p.j(string2, C3426d4.i.W);
                ck.p.j(c3053n10, IconCompat.EXTRA_OBJ);
                P8.f23320a.put(string2, new WeakReference(c3053n10));
                intent.putExtra("loggerCacheKey", string);
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strS = s();
            if (ck.p.e(strS, CreativeInfo.f44315al)) {
                i10 = 200;
            } else {
                i10 = ck.p.e(strS, "htmlUrl") ? 202 : 201;
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", i10);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.f24727s) {
                if (this.f24725q == -1) {
                    this.f24725q = System.currentTimeMillis();
                }
                if (this.f24723o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = Ji.f22951a;
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(intent, "intent");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return (short) 0;
        } catch (Exception e10) {
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                c3053n11.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
            return (short) 2154;
        }
    }

    public final void e(short s10) {
        if (this.f24710b == 2) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                c3053n9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.f24720l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    public final void f(AbstractC2871g1 abstractC2871g1) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("ja", "TAG");
            c3053n9.c("ja", "handleAdScreenDismissed " + ((int) this.f24710b));
        }
        byte b10 = this.f24710b;
        if (b10 == 7) {
            int i10 = this.F - 1;
            this.F = i10;
            if (i10 == 1) {
                c((byte) 6);
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("ja", "TAG");
                    c3053n10.d("ja", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (b10 == 6 || b10 == 8) {
            this.F--;
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                c3053n11.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.f24720l);
            }
            if (abstractC2871g1 != null) {
                abstractC2871g1.a();
                return;
            }
            C3053n9 c3053n12 = this.f24717i;
            if (c3053n12 != null) {
                c3053n12.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final String l() {
        return ImpressionLog.f43647w;
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final byte t() {
        return (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954ja(Context context, C3243v0 c3243v0, C3004la c3004la) {
        super(context, c3243v0, c3004la);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3243v0, "adPlacement");
        this.H = new Pj();
        ck.p.i("ja", "TAG");
        long j10 = c3243v0.f25505a;
        a(context, c3243v0, c3004la);
        ck.p.j(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "monetizationContext");
        super.K();
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void K() {
        ck.p.j(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "monetizationContext");
        super.K();
    }

    public final void X() throws JSONException {
        AdConfig adConfig;
        if (ck.p.e(this.f24720l.f25510f, "AB") && (adConfig = this.f24711c) != null && adConfig.getSkipNetCheckHB()) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                ck.p.i("ja", "TAG");
                c3053n9.a("ja", "renderAd without internet check");
            }
            Y();
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("ja", "TAG");
            c3053n10.a("ja", "renderAd");
        }
        a(new bk.a() { // from class: b7.l8
            @Override // bk.a
            public final Object invoke() {
                return C2954ja.d(this.f5039b);
            }
        }, new bk.l() { // from class: b7.m8
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C2954ja.a(this.f5059b, (EnumC2721a6) obj);
            }
        });
    }

    public final void Y() throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("ja", "TAG");
            c3053n9.a("ja", "renderAdPostInternetCheck");
        }
        super.I();
        this.F = 0;
        try {
            if (M()) {
                return;
            }
            C3144r1 c3144r1 = this.f24734z;
            c3144r1.getClass();
            c3144r1.f25223g = SystemClock.elapsedRealtime();
            String strS = s();
            if (!ck.p.e(strS, CreativeInfo.f44315al) && !ck.p.e(strS, "htmlUrl")) {
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("ja", "TAG");
                    c3053n10.a("ja", "Cannot handle markupType: " + s());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.f24718j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7.n8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2954ja.e(this.f5083b);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("ja", "TAG");
                c3053n11.a("ja", "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void Z() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("ja", "TAG");
            c3053n9.d("ja", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C3144r1 c3144r1 = this.f24734z;
        c3144r1.getClass();
        c3144r1.f25225i = SystemClock.elapsedRealtime();
        P();
        S();
        this.H.f23343a = true;
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("ja", "TAG");
                c3053n10.a("ja", "signaling Success");
            }
            d(abstractC2871g1M);
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void a(byte[] bArr) {
        if (V()) {
            super.a(bArr);
        }
    }

    public final void a0() {
        short s10;
        MetaInfo metaInfo;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "<get-TAG>(...)");
            c3053n9.c("l1", "submitAdNotReady " + this);
        }
        Pj pj2 = this.H;
        C3144r1 c3144r1 = this.f24734z;
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        String creativeType = (adP == null || (metaInfo = adP.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet adSetR = r();
        Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.isRewarded()) : null;
        String strS = s();
        byte b10 = this.f24710b;
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        String impressionId = adP2 != null ? adP2.getImpressionId() : null;
        C3193t0 c3193t0 = new C3193t0(c3144r1, creativeType, boolValueOf, strS, b10, impressionId);
        pj2.getClass();
        ck.p.j(c3193t0, "adNotReadyMetadata");
        HashMap map = new HashMap();
        long j10 = c3144r1.f25219c;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        if (b10 == 0) {
            s10 = 2204;
        } else if (b10 == 1) {
            s10 = 2282;
        } else if (b10 == 2) {
            s10 = 2283;
        } else if (b10 == 3) {
            s10 = 2284;
        } else if (b10 == 6) {
            s10 = 2285;
        } else if (b10 == 7) {
            s10 = 2209;
        } else {
            s10 = b10 == 8 ? (short) 2242 : (short) 2210;
        }
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        map.put("markupType", strS);
        if (creativeType != null) {
            map.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        if (boolValueOf != null) {
            map.put("isRewarded", boolValueOf);
        }
        String strA = c3144r1.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", c3144r1.f25217a.l());
        map.put("networkType", C3298x5.m());
        map.put("plId", Long.valueOf(c3144r1.f25217a.f24720l.f25505a));
        map.put("isAdLoaded", Boolean.valueOf(pj2.f23343a));
        String str = c3144r1.f25217a.f24720l.f25510f;
        if (str != null) {
            map.put("plType", str);
        }
        Wj wj2 = Wj.f23753a;
        Wj.b("AdNotReady", map, EnumC2735ak.SDK);
    }

    public final void b0() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            c3053n9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.f24720l);
        }
        h();
        Z();
    }

    public final void g(AbstractC2871g1 abstractC2871g1) {
        byte b10 = this.f24710b;
        if (b10 != 6) {
            if (b10 == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i10 = this.F + 1;
        this.F = i10;
        if (i10 != 1) {
            c((byte) 7);
            return;
        }
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            c3053n9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.f24720l);
        }
        if (abstractC2871g1 != null) {
            b((byte) 4);
            a(abstractC2871g1);
        }
    }

    public final boolean h(AbstractC2871g1 abstractC2871g1) {
        byte b10 = this.f24710b;
        if (b10 == 1) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                c3053n9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f24720l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b10 == 7 || b10 == 6) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                c3053n10.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f24720l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        if (ck.p.e(CreativeInfo.f44315al, s()) || ck.p.e("htmlUrl", s())) {
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                c3053n11.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f24720l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC2871g1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void p(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        if (!this.f24727s || !a(gestureDetectorOnGestureListenerC2785ci)) {
            U();
        }
        super.p(gestureDetectorOnGestureListenerC2785ci);
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final GestureDetectorOnGestureListenerC2785ci q() {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (this.f24716h.size() <= 0 || this.f24724p >= this.f24716h.size()) ? null : (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(this.f24724p);
        if (this.G && gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.k();
        }
        return gestureDetectorOnGestureListenerC2785ci;
    }

    public static final void c(C2954ja c2954ja) {
        c2954ja.g(c2954ja.m());
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void C() {
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void F() {
        super.F();
        if (!ck.p.e(s(), CreativeInfo.f44315al) && !ck.p.e(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.f24710b == 2) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                c3053n9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.f24720l);
            }
            AbstractC2871g1 abstractC2871g1M = m();
            if (abstractC2871g1M != null) {
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("ja", "TAG");
                    c3053n10.a("ja", "callback - onFetchSuccess");
                }
                c(abstractC2871g1M);
                return;
            }
            c((short) 2188);
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("ja", "TAG");
                c3053n11.b("ja", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void I() throws JSONException {
        super.I();
        this.F = 0;
    }

    public final boolean V() throws JSONException {
        if (E()) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                ck.p.i("ja", "TAG");
                c3053n9.a("ja", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M == null || h(abstractC2871g1M)) {
            return false;
        }
        if (4 == this.f24710b) {
            if (z()) {
                super.d();
                this.I = null;
            } else {
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("ja", "TAG");
                    c3053n10.a("ja", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC2871g1 abstractC2871g1M2 = m();
                if (abstractC2871g1M2 == null) {
                    C3053n9 c3053n11 = this.f24717i;
                    if (c3053n11 != null) {
                        c3053n11.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(abstractC2871g1M2);
                    d(abstractC2871g1M2);
                }
                return false;
            }
        }
        D();
        return true;
    }

    public final int W() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        Integer num = null;
        if (adSetR != null) {
            Integer numValueOf = Integer.valueOf(adSetR.getPodSuccessCount());
            if (numValueOf.intValue() < 1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        AdSet adSetR2 = r();
        if (adSetR2 != null && (ads = adSetR2.getAds()) != null) {
            Integer numValueOf2 = Integer.valueOf(ads.size());
            if (numValueOf2.intValue() > 0) {
                num = numValueOf2;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return 1;
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void d() throws JSONException {
        super.d();
        this.I = null;
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void o(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        super.o(gestureDetectorOnGestureListenerC2785ci);
        if (this.f24727s) {
            int iIndexOf = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
            if (iIndexOf < this.f24724p) {
                C3053n9 c3053n9 = this.f24717i;
                if (c3053n9 != null) {
                    ck.p.i("ja", "TAG");
                    c3053n9.a("ja", "Ignoring loaded ad with index " + iIndexOf + " as current rendering index is " + this.f24724p);
                    return;
                }
                return;
            }
            this.f24726r.add(Integer.valueOf(iIndexOf));
            if (this.f24710b == 2) {
                int iW = W();
                for (int i10 = 0; i10 < iW && i10 < this.f24716h.size(); i10++) {
                    if (this.f24716h.get(i10) == null || !this.f24726r.contains(Integer.valueOf(i10))) {
                        return;
                    }
                }
                C3053n9 c3053n10 = this.f24717i;
                if (c3053n10 != null) {
                    ck.p.i("ja", "TAG");
                    c3053n10.a("ja", "Providing success based on index " + iIndexOf);
                }
                b((byte) 1);
                this.f24724p = 0;
                b0();
                return;
            }
            return;
        }
        if (this.f24710b == 2) {
            b((byte) 1);
            b0();
        }
    }

    public final void a(final C3004la c3004la, final Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC2871g1) c3004la, (Context) activity);
        } else {
            ((Wb) AbstractC3075o6.f24960e.getValue()).f23740a.post(new Runnable() { // from class: b7.f8
                @Override // java.lang.Runnable
                public final void run() {
                    C2954ja.a(this.f4924b, c3004la, activity);
                }
            });
        }
    }

    public static final void e(C2954ja c2954ja) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c2954ja.N();
        if (c2954ja.f24727s) {
            AdSet adSetR = c2954ja.r();
            int size = (adSetR == null || (ads = adSetR.getAds()) == null) ? 0 : ads.size();
            for (int i10 = 1; i10 < size; i10++) {
                c2954ja.f24723o++;
                c2954ja.N();
            }
        }
    }

    public static final void a(C2954ja c2954ja, AbstractC2871g1 abstractC2871g1, Context context) {
        c2954ja.a(abstractC2871g1, context);
    }

    public static final void a(final C2954ja c2954ja, final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Context context) {
        final int iIndexOf = c2954ja.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
        ArrayList arrayList = c2954ja.f24716h;
        ck.p.j(arrayList, "list");
        if (iIndexOf < 0 || iIndexOf >= arrayList.size()) {
            return;
        }
        short sB = c2954ja.b(context);
        if (sB != 0) {
            c2954ja.e(iIndexOf);
        }
        c2954ja.b(iIndexOf, sB == 0);
        Handler handler = c2954ja.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.k8
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C2954ja.a(gestureDetectorOnGestureListenerC2785ci, c2954ja, iIndexOf);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final synchronized void e(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        super.e(gestureDetectorOnGestureListenerC2785ci);
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.h8
                @Override // java.lang.Runnable
                public final void run() {
                    C2954ja.b(this.f4959b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final synchronized void f(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        super.f(gestureDetectorOnGestureListenerC2785ci);
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.g8
                @Override // java.lang.Runnable
                public final void run() {
                    C2954ja.c(this.f4945b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.InterfaceC3268w0
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Activity activity) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "<get-TAG>(...)");
            c3053n9.c("l1", "closeCurrentPodAd " + this);
        }
        if (this.f24727s) {
            Integer num = (Integer) this.f24726r.higher(Integer.valueOf(this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci)));
            if (num != null) {
                a(num.intValue(), gestureDetectorOnGestureListenerC2785ci, activity);
            } else {
                b();
            }
        }
    }

    public final void a(AbstractC2871g1 abstractC2871g1, Context context) {
        if (abstractC2871g1 == null) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                c3053n9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        bk.a aVar = this.I;
        if (aVar != null) {
            aVar.invoke();
            return;
        }
        byte b10 = this.f24710b;
        if (b10 == 8) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("ja", "TAG");
                c3053n10.b("ja", "unload has been called on this ad. Dont show. ");
            }
            ck.p.i("ja", "TAG");
            Kb.a((byte) 2, "ja", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (b10 == 4) {
            e(abstractC2871g1);
            c((byte) 6);
            if (z()) {
                a((short) 2153);
                c((byte) 0);
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI = i();
                if (gestureDetectorOnGestureListenerC2785ciI != null) {
                    gestureDetectorOnGestureListenerC2785ciI.b();
                    return;
                }
                return;
            }
            if (context == null) {
                context = n();
            }
            short sB = b(context);
            if (sB != 0) {
                a(sB);
                return;
            } else {
                abstractC2871g1.c();
                return;
            }
        }
        Kb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 != null) {
            ck.p.i("ja", "TAG");
            c3053n11.b("ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        }
        ck.p.i("ja", "TAG");
        Kb.a((byte) 1, "ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        a((short) 2152);
    }

    @Override // com.inmobi.media.InterfaceC3268w0
    public final void b() {
        if (this.f24727s) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                ck.p.i("ja", "TAG");
                c3053n9.a("ja", "Closing the ad as closeAll is called");
            }
            Handler handler = this.f24718j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7.j8
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C2954ja.a(this.f5002b);
                    }
                });
            }
        }
    }

    public static final void b(C2954ja c2954ja) {
        c2954ja.f(c2954ja.m());
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.InterfaceC3268w0
    public final boolean a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        if (this.f24727s) {
            if (((Integer) this.f24726r.higher(Integer.valueOf(this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.InterfaceC3039mk
    public final void a(byte b10) throws JSONException {
        if (b10 == 1) {
            if (this.f24727s) {
                if (this.f24710b == 2) {
                    C3053n9 c3053n9 = this.f24717i;
                    if (c3053n9 != null) {
                        ck.p.i("ja", "TAG");
                        c3053n9.b("ja", "RenderView time out");
                    }
                    int iW = W();
                    int i10 = 0;
                    for (int i11 = 0; i11 < iW; i11++) {
                        if (!this.f24726r.contains(Integer.valueOf(i11))) {
                            i10 = i11;
                            break;
                        }
                    }
                    a((GestureDetectorOnGestureListenerC2785ci) null, Integer.valueOf(i10), 2);
                    f();
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b10);
            return;
        }
        super.a(b10);
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.InterfaceC3268w0
    public final void a(int i10, final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, final Context context) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        if (!this.f24727s) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                ck.p.i("ja", "TAG");
                c3053n9.a("ja", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.f24726r.contains(Integer.valueOf(i10)) && i10 > this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) && i10 < this.f24716h.size() && this.f24716h.get(i10) != null && ((gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(i10)) == null || gestureDetectorOnGestureListenerC2785ci2.B0)) {
            if (context == null) {
                context = n();
            }
            super.a(i10, gestureDetectorOnGestureListenerC2785ci, context);
            Handler handler = this.f24718j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7.i8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2954ja.a(this.f4984b, gestureDetectorOnGestureListenerC2785ci, context);
                    }
                });
                return;
            }
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("ja", "TAG");
            c3053n10.a("ja", "Cannot show an pod ad with invalid index passed");
        }
        b(this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci), false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public static final mj.r a(C2954ja c2954ja, EnumC2721a6 enumC2721a6) {
        short s10;
        ck.p.j(enumC2721a6, "it");
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        ck.p.j(enumC2721a6, IronSourceConstants.EVENTS_ERROR_CODE);
        int iOrdinal = enumC2721a6.ordinal();
        if (iOrdinal == 0) {
            s10 = 2122;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s10 = 2123;
                    break;
                case 13:
                    s10 = 2124;
                    break;
                case 14:
                    s10 = 2125;
                    break;
                case 15:
                    s10 = 2126;
                    break;
                case 16:
                    s10 = 2127;
                    break;
                default:
                    s10 = 2122;
                    break;
            }
        } else {
            s10 = 2229;
        }
        c2954ja.a(inMobiAdRequestStatus, true, s10);
        return mj.r.f64562a;
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, short s10) throws JSONException {
        super.a(gestureDetectorOnGestureListenerC2785ci, s10);
        if (this.f24727s) {
            int iIndexOf = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
            if (iIndexOf < W()) {
                a(gestureDetectorOnGestureListenerC2785ci, (Integer) null, s10 == 2137 ? 1 : 3);
                e(s10);
            }
            a(iIndexOf, true);
            return;
        }
        e(s10);
    }

    public static final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, C2954ja c2954ja, int i10) throws JSONException {
        gestureDetectorOnGestureListenerC2785ci.l();
        c2954ja.a(i10, false);
    }

    public static final void a(C2954ja c2954ja) throws JSONException {
        c2954ja.e();
        C3053n9 c3053n9 = c2954ja.f24717i;
        if (c3053n9 != null) {
            c3053n9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c2954ja.f24720l);
        }
        if (c2954ja.m() != null) {
            AbstractC2871g1 abstractC2871g1M = c2954ja.m();
            if (abstractC2871g1M != null) {
                abstractC2871g1M.a();
                return;
            }
            return;
        }
        C3053n9 c3053n10 = c2954ja.f24717i;
        if (c3053n10 != null) {
            c3053n10.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.AbstractC2836ei
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, boolean z10) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        super.a(gestureDetectorOnGestureListenerC2785ci, z10);
        byte b10 = this.f24710b;
        if (b10 == 4) {
            final short s10 = z10 ? (short) 2220 : (short) 2219;
            this.I = new bk.a() { // from class: b7.e8
                @Override // bk.a
                public final Object invoke() {
                    return C2954ja.a(this.f4907b, s10);
                }
            };
            return;
        }
        if (b10 != 6) {
            if (b10 == 7) {
                short s11 = z10 ? (short) 2224 : (short) 2223;
                Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                C3053n9 c3053n9 = this.f24717i;
                if (c3053n9 != null) {
                    ck.p.i("ja", "TAG");
                    c3053n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                gestureDetectorOnGestureListenerC2785ci.a(z10, s11);
                gestureDetectorOnGestureListenerC2785ci.x();
                f(m());
                return;
            }
            return;
        }
        short s12 = z10 ? (short) 2222 : (short) 2221;
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            ck.p.i("ja", "TAG");
            c3053n10.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        gestureDetectorOnGestureListenerC2785ci.x();
        if (this.F == 0) {
            a(s12);
        } else {
            gestureDetectorOnGestureListenerC2785ci.a(z10, s12);
            f(m());
        }
    }

    public static final mj.r a(C2954ja c2954ja, short s10) {
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3053n9 c3053n9 = c2954ja.f24717i;
        if (c3053n9 != null) {
            ck.p.i("ja", "TAG");
            c3053n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c2954ja.a(s10);
        c2954ja.I = null;
        return mj.r.f64562a;
    }
}

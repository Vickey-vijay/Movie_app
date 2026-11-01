package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C2820e2;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2820e2 extends Dk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24282h = "InMobi";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f24283i = C2820e2.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2717a2 f24284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2717a2 f24285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2717a2 f24286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2717a2 f24287m;

    public final boolean a(long j10) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "checkForRefreshRate " + this);
        }
        C2717a2 c2717a2 = this.f24287m;
        if (c2717a2 == null) {
            return false;
        }
        AdConfig adConfig = c2717a2.f24711c;
        ck.p.g(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = this.f24283i;
            ck.p.i(str2, "TAG");
            c3053n10.b(str2, "Early refresh request");
        }
        b(this.f24287m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String str3 = this.f24283i;
        ck.p.i(str3, "TAG");
        C2717a2 c2717a3 = this.f24287m;
        Kb.a((byte) 1, str3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2717a3 != null ? c2717a3.f24720l : null) + ")");
        C3053n9 c3053n11 = this.f22542f;
        if (c3053n11 != null) {
            String str4 = this.f24283i;
            ck.p.i(str4, "TAG");
            C2717a2 c2717a4 = this.f24287m;
            c3053n11.b(str4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2717a4 != null ? c2717a4.f24720l : null) + ")");
        }
        return false;
    }

    public final void b(InMobiBanner inMobiBanner) {
        C3243v0 c3243v0;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "displayInternal " + this);
        }
        C2717a2 c2717a2 = this.f24286l;
        if (c2717a2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI = c2717a2.i();
        if (!(gestureDetectorOnGestureListenerC2785ciI instanceof GestureDetectorOnGestureListenerC2785ci)) {
            gestureDetectorOnGestureListenerC2785ciI = null;
        }
        if (gestureDetectorOnGestureListenerC2785ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC2785ciI.getViewableAd();
        C2717a2 c2717a3 = this.f24286l;
        if (c2717a3 != null && (c3243v0 = c2717a3.f24720l) != null && c3243v0.f25514j) {
            gestureDetectorOnGestureListenerC2785ciI.k();
        }
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC2785ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void c(final AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(adMetaInfo);
        this.f22537a = (byte) 0;
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = this.f24283i;
            ck.p.i(str2, "TAG");
            c3053n10.a(str2, "Ad load successful, providing callback");
        }
        this.f22540d.post(new Runnable() { // from class: b7.r6
            @Override // java.lang.Runnable
            public final void run() {
                C2820e2.b(this.f5156b, adMetaInfo);
            }
        });
    }

    public final void h() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C2717a2 c2717a2;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "canScheduleRefresh " + this);
        }
        C2717a2 c2717a3 = this.f24287m;
        if (c2717a3 == null) {
            return false;
        }
        byte b10 = c2717a3.f24710b;
        if (b10 != 4 && b10 != 1 && b10 != 2 && ((c2717a2 = this.f24286l) == null || c2717a2.f24710b != 7)) {
            return true;
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = this.f24283i;
            ck.p.i(str2, "TAG");
            c3053n10.a(str2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "clear " + this);
        }
        t();
        C2717a2 c2717a2 = this.f24284j;
        if (c2717a2 != null) {
            c2717a2.d();
        }
        this.f24284j = null;
        C2717a2 c2717a3 = this.f24285k;
        if (c2717a3 != null) {
            c2717a3.d();
        }
        this.f24285k = null;
        this.f22542f = null;
        this.f24286l = null;
        this.f24287m = null;
        this.f22538b = null;
    }

    public final int k() {
        AdConfig adConfig;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "defaultRefreshInterval " + this);
        }
        AbstractC2995l1 abstractC2995l1F = f();
        if (abstractC2995l1F == null || (adConfig = abstractC2995l1F.f24711c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        ck.p.i(this.f24283i, "TAG");
        ck.p.e(this.f24286l, this.f24284j);
        ck.p.i(this.f24283i, "TAG");
        ck.p.e(this.f24287m, this.f24284j);
        ck.p.i(this.f24283i, "TAG");
        ck.p.e(this.f24286l, this.f24285k);
        ck.p.i(this.f24283i, "TAG");
        ck.p.e(this.f24287m, this.f24285k);
        ck.p.i(this.f24283i, "TAG");
        C2717a2 c2717a2 = this.f24284j;
        Objects.toString(this.f24284j);
        ck.p.i(this.f24283i, "TAG");
        C2717a2 c2717a3 = this.f24285k;
        Objects.toString(this.f24285k);
        C2717a2 c2717a4 = this.f24286l;
        return c2717a4 != null && c2717a4.f24710b == 7;
    }

    public final void m() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "pause " + this);
        }
        C2717a2 c2717a2 = this.f24286l;
        if (c2717a2 != null) {
            c2717a2.W();
        }
    }

    public final void n() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        C2717a2 c2717a2 = this.f24284j;
        if (c2717a2 != null) {
            c2717a2.Y();
        }
        C2717a2 c2717a3 = this.f24285k;
        if (c2717a3 != null) {
            c2717a3.Y();
        }
    }

    public final void o() {
        C2717a2 c2717a2;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "render " + this);
        }
        C2717a2 c2717a3 = this.f24287m;
        if (c2717a3 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.f24282h, String.valueOf(c2717a3.f24720l.f25505a))) {
            PublisherCallbacks publisherCallbacks = this.f22539c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c2717a2 = this.f24287m) != null) {
                c2717a2.d((byte) 1);
            }
            this.f22537a = (byte) 8;
            c2717a3.Z();
        }
    }

    public final void p() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "resume " + this);
        }
        C2717a2 c2717a2 = this.f24286l;
        if (c2717a2 != null) {
            c2717a2.X();
        }
    }

    public final boolean q() {
        C2717a2 c2717a2 = this.f24286l;
        Byte bValueOf = c2717a2 != null ? Byte.valueOf(c2717a2.f24710b) : null;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "submitAdShowFail " + this);
        }
        AbstractC2995l1 abstractC2995l1F = f();
        if (abstractC2995l1F != null) {
            abstractC2995l1F.d((short) 2239);
        }
    }

    public final void s() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "swapAdUnits " + this);
        }
        C2717a2 c2717a2 = this.f24286l;
        if (c2717a2 == null) {
            this.f24286l = this.f24284j;
            this.f24287m = this.f24285k;
        } else if (ck.p.e(c2717a2, this.f24284j)) {
            this.f24286l = this.f24285k;
            this.f24287m = this.f24284j;
        } else if (ck.p.e(c2717a2, this.f24285k)) {
            this.f24286l = this.f24284j;
            this.f24287m = this.f24285k;
        }
    }

    public final void t() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "unregisterLifeCycleCallbacks " + this);
        }
        C2717a2 c2717a2 = this.f24284j;
        if (c2717a2 != null) {
            c2717a2.b0();
        }
        C2717a2 c2717a3 = this.f24285k;
        if (c2717a3 != null) {
            c2717a3.b0();
        }
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC2995l1 f() {
        if (q()) {
            return this.f24286l;
        }
        return this.f24287m;
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void b(final AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onAdFetchSuccess " + this);
        }
        this.f22541e = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C2717a2 c2717a2 = this.f24287m;
        if ((c2717a2 != null ? c2717a2.b(0) : null) == null) {
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                String str2 = this.f24283i;
                ck.p.i(str2, "TAG");
                c3053n10.b(str2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC2995l1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        C3053n9 c3053n11 = this.f22542f;
        if (c3053n11 != null) {
            String str3 = this.f24283i;
            ck.p.i(str3, "TAG");
            c3053n11.a(str3, "Ad fetch successful, calling loadAd()");
        }
        super.b(adMetaInfo);
        this.f22540d.post(new Runnable() { // from class: b7.t6
            @Override // java.lang.Runnable
            public final void run() {
                C2820e2.a(this.f5184b, adMetaInfo);
            }
        });
    }

    public final void a(InMobiBanner inMobiBanner) {
        C3243v0 c3243v0;
        ck.p.j(inMobiBanner, "banner");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "displayAd " + this);
        }
        C2717a2 c2717a2 = this.f24286l;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI = c2717a2 != null ? c2717a2.i() : null;
        if (!(gestureDetectorOnGestureListenerC2785ciI instanceof GestureDetectorOnGestureListenerC2785ci)) {
            gestureDetectorOnGestureListenerC2785ciI = null;
        }
        if (gestureDetectorOnGestureListenerC2785ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC2785ciI.getViewableAd();
        C2717a2 c2717a3 = this.f24286l;
        if (c2717a3 != null && (c3243v0 = c2717a3.f24720l) != null && c3243v0.f25514j) {
            gestureDetectorOnGestureListenerC2785ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC2785ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        C2717a2 c2717a4 = this.f24287m;
        if (c2717a4 != null) {
            c2717a4.W();
        }
        C2717a2 c2717a5 = this.f24286l;
        if (c2717a5 != null && c2717a5.f24710b == 8) {
            View view = new View(inMobiBanner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            if (viewGroup == null) {
                inMobiBanner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            inMobiBanner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        C2717a2 c2717a6 = this.f24287m;
        if (c2717a6 != null) {
            c2717a6.d();
        }
    }

    public static final void b(C2820e2 c2820e2, AdMetaInfo adMetaInfo) {
        C3053n9 c3053n9 = c2820e2.f22542f;
        if (c3053n9 != null) {
            String str = c2820e2.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c2820e2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c2820e2.b((short) 2184);
        }
    }

    public final void b(short s10) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "submitAdLoadFailed " + this);
        }
        AbstractC2995l1 abstractC2995l1F = f();
        if (abstractC2995l1F != null) {
            abstractC2995l1F.c(s10);
        }
    }

    public final int a(int i10, int i11) {
        AdConfig adConfig;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "getRefreshInterval " + this);
        }
        C2717a2 c2717a2 = this.f24287m;
        if (c2717a2 == null || (adConfig = c2717a2.f24711c) == null) {
            return i11;
        }
        return i10 < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i10;
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z10) {
        C2717a2 c2717a2;
        ck.p.j(publisherCallbacks, "callbacks");
        ck.p.j(str, C3426d4.i.O);
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str2 = this.f24283i;
            ck.p.i(str2, "TAG");
            c3053n9.c(str2, "load 1 " + this);
        }
        if (ck.p.e(this.f22538b, Boolean.FALSE)) {
            b(this.f24287m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C2717a2 c2717a3 = this.f24287m;
            if (c2717a3 != null) {
                c2717a3.b((short) 2006);
            }
            Kb.a((byte) 1, this.f24282h, "Cannot call load() API after calling load(byte[])");
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                String str3 = this.f24283i;
                ck.p.i(str3, "TAG");
                c3053n10.b(str3, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.f22538b = Boolean.TRUE;
        if (this.f22539c == null) {
            this.f22539c = publisherCallbacks;
        }
        C2717a2 c2717a4 = this.f24287m;
        if (c2717a4 == null || !a(this.f24282h, String.valueOf(c2717a4.f24720l), publisherCallbacks) || (c2717a2 = this.f24287m) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks2 = this.f22539c;
        if (c2717a2.d((publisherCallbacks2 == null || publisherCallbacks2.getType() != 1) ? (byte) 1 : (byte) 2)) {
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                String str4 = this.f24283i;
                ck.p.i(str4, "TAG");
                c3053n11.d(str4, "AdManager state - LOADING");
            }
            this.f22537a = (byte) 1;
            this.f22541e = null;
            C2717a2 c2717a5 = this.f24287m;
            ck.p.g(c2717a5);
            c2717a5.c(str);
            C2717a2 c2717a6 = this.f24287m;
            ck.p.g(c2717a6);
            c2717a6.b(z10);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        C2717a2 c2717a2;
        ck.p.j(publisherCallbacks, "callbacks");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "load 2 " + this);
        }
        if (ck.p.e(this.f22538b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                String str2 = this.f24283i;
                ck.p.i(str2, "TAG");
                c3053n10.b(str2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.f22538b = Boolean.FALSE;
        this.f22537a = (byte) 1;
        this.f22539c = publisherCallbacks;
        if (this.f24287m != null) {
            C2717a2 c2717a3 = this.f24286l;
            if ((c2717a3 == null || !c2717a3.B()) && (c2717a2 = this.f24287m) != null && c2717a2.d((byte) 1)) {
                C3053n9 c3053n11 = this.f22542f;
                if (c3053n11 != null) {
                    String str3 = this.f24283i;
                    ck.p.i(str3, "TAG");
                    c3053n11.a(str3, "timer started - load banner");
                }
                C2717a2 c2717a4 = this.f24287m;
                if (c2717a4 != null) {
                    c2717a4.D();
                }
                C2717a2 c2717a5 = this.f24287m;
                if (c2717a5 != null) {
                    c2717a5.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void a() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onAdDismissed " + this);
        }
        this.f22537a = (byte) 0;
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = this.f24283i;
            ck.p.i(str2, "TAG");
            c3053n10.d(str2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(C2820e2 c2820e2, AdMetaInfo adMetaInfo) {
        C3053n9 c3053n9 = c2820e2.f22542f;
        if (c3053n9 != null) {
            String str = c2820e2.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c2820e2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        C3053n9 c3053n10 = c2820e2.f22542f;
        if (c3053n10 != null) {
            String str2 = c2820e2.f24283i;
            ck.p.i(str2, "TAG");
            c3053n10.b(str2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void a(int i10, final int i11, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ViewParent parent;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = this.f24283i;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onShowNextPodAd " + this);
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = this.f24283i;
            ck.p.i(str2, "TAG");
            c3053n10.a(str2, "on Show next pod ad index: " + i10);
        }
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            try {
                parent = gestureDetectorOnGestureListenerC2785ci.getParent();
            } catch (Exception unused) {
                C2717a2 c2717a2 = this.f24286l;
                if (c2717a2 != null) {
                    c2717a2.e(i11);
                }
                C2717a2 c2717a3 = this.f24286l;
                if (c2717a3 != null) {
                    c2717a3.b(i11, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C2717a2 c2717a4 = this.f24286l;
            if (c2717a4 != null) {
                c2717a4.b(i11, true);
            }
            b(inMobiBanner);
            this.f22540d.post(new Runnable() { // from class: b7.s6
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C2820e2.a(this.f5168b, i11);
                }
            });
            return;
        }
        C2717a2 c2717a5 = this.f24286l;
        if (c2717a5 != null) {
            c2717a5.e(i11);
        }
        C2717a2 c2717a6 = this.f24286l;
        if (c2717a6 != null) {
            c2717a6.b(i11, false);
        }
    }

    public final void a(Context context, Jg jg2, String str) {
        String str2;
        String str3;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(jg2, "pubSettings");
        ck.p.j(str, C3426d4.i.O);
        ck.p.j("banner", "logType");
        ck.p.i(this.f24283i, "TAG");
        ck.p.j("banner", "mAdType");
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        String str4 = context instanceof Activity ? ActivityChooserModel.ATTRIBUTE_ACTIVITY : "others";
        ck.p.j(str4, "m10Context");
        long j10 = jg2.f22935a;
        String str5 = jg2.f22936b;
        Map map = jg2.f22937c;
        ck.p.j(str, C3426d4.i.O);
        boolean z10 = jg2.f22938d;
        String str6 = jg2.f22941g;
        String str7 = jg2.f22939e;
        if (j10 != Long.MIN_VALUE) {
            if (map == null || (str2 = (String) map.get("tp")) == null) {
                str2 = "";
            }
            C3243v0 c3243v0 = new C3243v0(j10, str2, "banner", str6);
            c3243v0.f25508d = str5;
            c3243v0.f25507c = map;
            ck.p.j(str, "<set-?>");
            c3243v0.f25512h = str;
            ck.p.j(str4, "<set-?>");
            c3243v0.f25513i = str4;
            c3243v0.f25511g = string;
            c3243v0.f25514j = z10;
            c3243v0.f25515k = str7;
            String str8 = jg2.f22941g;
            if (str8 != null) {
                C3053n9 c3053n9 = this.f22542f;
                if (c3053n9 != null) {
                    c3053n9.a();
                }
                this.f22542f = Jh.a("banner", str8);
            }
            C2717a2 c2717a2 = this.f24284j;
            if (c2717a2 != null && this.f24285k != null) {
                c2717a2.a(context, c3243v0, this);
                C2717a2 c2717a3 = this.f24285k;
                if (c2717a3 != null) {
                    c2717a3.a(context, c3243v0, this);
                }
            } else {
                this.f24284j = new C2717a2(context, c3243v0, this);
                C2717a2 c2717a4 = new C2717a2(context, c3243v0, this);
                this.f24285k = c2717a4;
                this.f24287m = this.f24284j;
                this.f24286l = c2717a4;
            }
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                C2717a2 c2717a5 = this.f24284j;
                if (c2717a5 != null) {
                    ck.p.j(c3053n10, "logger");
                    c2717a5.f24717i = c3053n10;
                    C2741b0 c2741b0 = c2717a5.f24729u;
                    c2741b0.getClass();
                    ck.p.j(c3053n10, "logger");
                    c2741b0.f24029f = c3053n10;
                }
                C2717a2 c2717a6 = this.f24285k;
                if (c2717a6 != null) {
                    ck.p.j(c3053n10, "logger");
                    c2717a6.f24717i = c3053n10;
                    C2741b0 c2741b1 = c2717a6.f24729u;
                    c2741b1.getClass();
                    ck.p.j(c3053n10, "logger");
                    c2741b1.f24029f = c3053n10;
                }
                C3053n9 c3053n11 = this.f22542f;
                if (c3053n11 != null) {
                    String str9 = this.f24283i;
                    str3 = "TAG";
                    ck.p.i(str9, str3);
                    c3053n11.a(str9, "adding mBannerAdUnit1 to reference tracker");
                } else {
                    str3 = "TAG";
                }
                Ab ab2 = Jh.f22942a;
                C2717a2 c2717a7 = this.f24284j;
                ck.p.g(c2717a7);
                Jh.a(c2717a7, this.f22542f);
                C3053n9 c3053n12 = this.f22542f;
                if (c3053n12 != null) {
                    String str10 = this.f24283i;
                    ck.p.i(str10, str3);
                    c3053n12.a(str10, "adding mBannerAdUnit2 to reference tracker");
                }
                C2717a2 c2717a8 = this.f24285k;
                ck.p.g(c2717a8);
                Jh.a(c2717a8, this.f22542f);
            }
            WatermarkData watermarkData = this.f22543g;
            if (watermarkData != null) {
                C2717a2 c2717a9 = this.f24284j;
                if (c2717a9 != null) {
                    ck.p.j(watermarkData, "watermarkData");
                    c2717a9.A = watermarkData;
                    GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciQ = c2717a9.q();
                    if (gestureDetectorOnGestureListenerC2785ciQ != null) {
                        gestureDetectorOnGestureListenerC2785ciQ.setWatermark(watermarkData);
                    }
                }
                C2717a2 c2717a10 = this.f24285k;
                if (c2717a10 != null) {
                    ck.p.j(watermarkData, "watermarkData");
                    c2717a10.A = watermarkData;
                    GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciQ2 = c2717a10.q();
                    if (gestureDetectorOnGestureListenerC2785ciQ2 != null) {
                        gestureDetectorOnGestureListenerC2785ciQ2.setWatermark(watermarkData);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(C2820e2 c2820e2, int i10) throws JSONException {
        C2717a2 c2717a2 = c2820e2.f24286l;
        if (c2717a2 != null) {
            c2717a2.a(i10, false);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        ck.p.j(watermarkData, "watermarkData");
        super.a(watermarkData);
        C2717a2 c2717a2 = this.f24284j;
        if (c2717a2 != null) {
            ck.p.j(watermarkData, "watermarkData");
            c2717a2.A = watermarkData;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciQ = c2717a2.q();
            if (gestureDetectorOnGestureListenerC2785ciQ != null) {
                gestureDetectorOnGestureListenerC2785ciQ.setWatermark(watermarkData);
            }
        }
        C2717a2 c2717a3 = this.f24285k;
        if (c2717a3 != null) {
            ck.p.j(watermarkData, "watermarkData");
            c2717a3.A = watermarkData;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciQ2 = c2717a3.q();
            if (gestureDetectorOnGestureListenerC2785ciQ2 != null) {
                gestureDetectorOnGestureListenerC2785ciQ2.setWatermark(watermarkData);
            }
        }
    }
}

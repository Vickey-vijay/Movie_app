package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.W1;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class W1 extends Dk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N1 f23718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N1 f23719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public N1 f23720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public N1 f23721k;

    public static final void a(W1 w10, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w10.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(W1 w10, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w10.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    public W1(InMobiAudio.a aVar) {
        ck.p.j(aVar, "callbacks");
        this.f22539c = aVar;
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void c(final AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(adMetaInfo);
        this.f22537a = (byte) 0;
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = X1.f23777a;
            ck.p.i(str2, "access$getTAG$p(...)");
            c3053n10.d(str2, "AdManager state - CREATED");
        }
        C3053n9 c3053n11 = this.f22542f;
        if (c3053n11 != null) {
            String str3 = X1.f23777a;
            ck.p.i(str3, "access$getTAG$p(...)");
            c3053n11.a(str3, "Ad load successful, providing callback");
        }
        this.f22540d.post(new Runnable() { // from class: b7.c5
            @Override // java.lang.Runnable
            public final void run() {
                W1.b(this.f4872b, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final void g() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "submitAdLoadCalled " + this);
        }
        N1 n10 = this.f23721k;
        if (n10 != null) {
            n10.O();
        }
    }

    public final void h() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "clear " + this);
        }
        p();
        N1 n10 = this.f23718h;
        if (n10 != null) {
            n10.d();
        }
        this.f23718h = null;
        N1 n11 = this.f23719i;
        if (n11 != null) {
            n11.d();
        }
        this.f23719i = null;
        this.f23720j = null;
        this.f23721k = null;
        this.f22538b = null;
    }

    public final void i() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "pause " + this);
        }
        N1 n10 = this.f23720j;
        if (n10 != null) {
            n10.W();
        }
    }

    public final void j() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        N1 n10 = this.f23718h;
        if (n10 != null) {
            n10.Y();
        }
        N1 n11 = this.f23719i;
        if (n11 != null) {
            n11.Y();
        }
    }

    public final void k() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "loadIntoView " + this);
        }
        N1 n10 = this.f23721k;
        if (n10 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a("InMobi", String.valueOf(n10.f24720l.f25505a))) {
            this.f22537a = (byte) 8;
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                String str2 = X1.f23777a;
                ck.p.i(str2, "access$getTAG$p(...)");
                c3053n10.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            n10.Z();
        }
    }

    public final void l() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "resume " + this);
        }
        N1 n10 = this.f23720j;
        if (n10 != null) {
            n10.X();
        }
    }

    public final boolean m() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.c(str, "shouldUseForegroundUnit " + this);
        }
        N1 n10 = this.f23720j;
        Byte bValueOf = n10 != null ? Byte.valueOf(n10.f24710b) : null;
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = X1.f23777a;
            ck.p.i(str2, "access$getTAG$p(...)");
            c3053n10.d(str2, "State - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "submitAdShowCalled " + this);
        }
        N1 n10 = this.f23721k;
        if (n10 != null) {
            n10.Q();
        }
    }

    public final void o() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "swapAdUnits " + this);
        }
        N1 n10 = this.f23720j;
        if (ck.p.e(n10, this.f23718h)) {
            this.f23720j = this.f23719i;
            this.f23721k = this.f23718h;
        } else if (ck.p.e(n10, this.f23719i) || n10 == null) {
            this.f23720j = this.f23718h;
            this.f23721k = this.f23719i;
        }
    }

    public final void p() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        N1 n10 = this.f23718h;
        if (n10 != null) {
            n10.b0();
        }
        N1 n11 = this.f23719i;
        if (n11 != null) {
            n11.b0();
        }
    }

    public final boolean a(long j10) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.c(str, "checkForRefreshRate " + this);
        }
        if (this.f23721k == null) {
            return false;
        }
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        int minRefreshInterval = ((AdConfig) Y3.f23815a.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.f23721k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = X1.f23777a;
        ck.p.i(str2, "access$getTAG$p(...)");
        N1 n10 = this.f23721k;
        Kb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n10 != null ? n10.f24720l : null) + ")");
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            ck.p.i(str2, "access$getTAG$p(...)");
            N1 n11 = this.f23721k;
            c3053n10.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n11 != null ? n11.f24720l : null) + ")");
        }
        return false;
    }

    public final void b(String str) {
        ck.p.j(str, C3426d4.i.O);
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str2 = X1.f23777a;
            ck.p.i(str2, "access$getTAG$p(...)");
            c3053n9.a(str2, "load 1 " + this);
        }
        N1 n10 = this.f23721k;
        if (n10 != null && a("InMobi", String.valueOf(n10.f24720l.f25505a), this.f22539c) && n10.d((byte) 1)) {
            this.f22537a = (byte) 1;
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                String str3 = X1.f23777a;
                ck.p.i(str3, "access$getTAG$p(...)");
                c3053n10.d(str3, "AdManager state - LOADING");
            }
            this.f22541e = null;
            n10.c(str);
            n10.b(false);
        }
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC2995l1 f() {
        if (m()) {
            return this.f23720j;
        }
        return this.f23721k;
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void b(final AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.c(str, "onAdFetchSuccess " + this);
        }
        N1 n10 = this.f23721k;
        if ((n10 != null ? n10.b(0) : null) == null) {
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                String str2 = X1.f23777a;
                ck.p.i(str2, "access$getTAG$p(...)");
                c3053n10.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC2995l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        C3053n9 c3053n11 = this.f22542f;
        if (c3053n11 != null) {
            String str3 = X1.f23777a;
            ck.p.i(str3, "access$getTAG$p(...)");
            c3053n11.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(adMetaInfo);
        this.f22540d.post(new Runnable() { // from class: b7.b5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f4854b, adMetaInfo);
            }
        });
    }

    public final void a(RelativeLayout relativeLayout) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI;
        C3243v0 c3243v0;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "displayAd " + this);
        }
        N1 n10 = this.f23720j;
        if (n10 == null || (gestureDetectorOnGestureListenerC2785ciI = n10.i()) == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC2785ciI.getViewableAd();
        N1 n11 = this.f23720j;
        if (n11 != null && (c3243v0 = n11.f24720l) != null && c3243v0.f25514j) {
            gestureDetectorOnGestureListenerC2785ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC2785ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a((Map) null);
        N1 n12 = this.f23721k;
        if (n12 != null) {
            n12.W();
        }
        if (viewGroup == null) {
            relativeLayout.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        N1 n13 = this.f23721k;
        if (n13 != null) {
            n13.d();
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void b() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "onAdShowFailed " + this);
        }
        this.f22540d.post(new Runnable() { // from class: b7.d5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f4887b);
            }
        });
    }

    public final void b(RelativeLayout relativeLayout) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "showAudioAd");
        }
        N1 n10 = this.f23720j;
        if (n10 != null && n10.f24710b == 7) {
            String str2 = X1.f23777a;
            ck.p.i(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                ck.p.i(str2, "access$getTAG$p(...)");
                c3053n10.b(str2, "ad is active");
            }
            N1 n11 = this.f23721k;
            if (n11 != null) {
                n11.e((short) 15);
                return;
            }
            return;
        }
        N1 n12 = this.f23721k;
        if (n12 != null) {
            C3053n9 c3053n11 = n12.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n11.c("l1", "canProceedToShow");
            }
            if (n12.z()) {
                ck.p.i("l1", "<get-TAG>(...)");
                Kb.a((byte) 1, "l1", "Ad Show has failed because current ad is expired. Please call load() again.");
                C3053n9 c3053n12 = n12.f24717i;
                if (c3053n12 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n12.b("l1", "ad is expired");
                }
                n12.c0();
                return;
            }
            byte b10 = n12.f24710b;
            if (b10 == 1 || b10 == 2) {
                Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                C3053n9 c3053n13 = n12.f24717i;
                if (c3053n13 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n13.b("l1", "ad is not ready");
                }
                C3053n9 c3053n14 = n12.f24717i;
                if (c3053n14 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n14.a("l1", "callback - onShowFailure");
                }
                n12.e((short) 2152);
                return;
            }
            if (b10 == 3) {
                Kb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n12.e((short) 0);
                C3053n9 c3053n15 = n12.f24717i;
                if (c3053n15 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n15.a("l1", "callback - onShowFailure");
                }
                C3053n9 c3053n16 = n12.f24717i;
                if (c3053n16 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n16.b("l1", "ad is failed");
                    return;
                }
                return;
            }
            if (b10 == 8) {
                Kb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n12.e((short) 0);
                C3053n9 c3053n17 = n12.f24717i;
                if (c3053n17 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n17.a("l1", "callback - onShowFailure");
                }
                C3053n9 c3053n18 = n12.f24717i;
                if (c3053n18 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n18.b("l1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b10 == 0) {
                Kb.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                n12.e((short) 0);
                C3053n9 c3053n19 = n12.f24717i;
                if (c3053n19 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n19.a("l1", "callback - onShowFailure");
                }
                C3053n9 c3053n20 = n12.f24717i;
                if (c3053n20 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n20.b("l1", "show called before load");
                    return;
                }
                return;
            }
            o();
            a(relativeLayout);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void a() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "onAdDismissed " + this);
        }
        this.f22537a = (byte) 0;
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            String str2 = X1.f23777a;
            ck.p.i(str2, "access$getTAG$p(...)");
            c3053n10.d(str2, "AdManager state - CREATED");
        }
        C3053n9 c3053n11 = this.f22542f;
        if (c3053n11 != null) {
            c3053n11.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void a(AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "onAdDisplayed");
        }
        super.a(adMetaInfo);
        AbstractC2995l1 abstractC2995l1F = f();
        if (abstractC2995l1F != null) {
            abstractC2995l1F.R();
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void a(AbstractC2995l1 abstractC2995l1, InMobiAdRequestStatus inMobiAdRequestStatus) {
        ck.p.j(inMobiAdRequestStatus, "status");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.b(str, com.ironsource.Mf.f27052b);
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
    }

    public static final void a(W1 w10) {
        C3053n9 c3053n9 = w10.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = w10.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3053n9 c3053n10 = w10.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
    }

    public final void a(final InMobiAudio inMobiAudio) {
        ck.p.j(inMobiAudio, "audio");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(inMobiAudio);
            } else {
                this.f22540d.post(new Runnable() { // from class: b7.a5
                    @Override // java.lang.Runnable
                    public final void run() {
                        W1.a(this.f4840b, inMobiAudio);
                    }
                });
            }
        } catch (Exception e10) {
            N1 n10 = this.f23721k;
            if (n10 != null) {
                n10.e((short) 26);
            }
            String str2 = X1.f23777a;
            ck.p.i(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                ck.p.i(str2, "access$getTAG$p(...)");
                c3053n10.b(str2, "Show failed with unexpected error: " + e10.getMessage());
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final void b(short s10) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.b(str, "submitAdLoadFailed " + this);
        }
        N1 n10 = this.f23721k;
        if (n10 != null) {
            n10.c((short) 15);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(short s10) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            String str = X1.f23777a;
            ck.p.i(str, "access$getTAG$p(...)");
            c3053n9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        N1 n10 = this.f23721k;
        if (n10 != null) {
            n10.b(s10);
        }
    }

    public final void a(Context context, Jg jg2, String str) {
        String str2;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(jg2, "pubSettings");
        ck.p.j(str, C3426d4.i.O);
        String str3 = X1.f23777a;
        ck.p.i(str3, "access$getTAG$p(...)");
        ck.p.j("audio", "mAdType");
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
            C3243v0 c3243v0 = new C3243v0(j10, str2, "audio", str6);
            c3243v0.f25508d = str5;
            c3243v0.f25507c = map;
            ck.p.j(str, "<set-?>");
            c3243v0.f25512h = str;
            ck.p.j(str4, "<set-?>");
            c3243v0.f25513i = str4;
            c3243v0.f25511g = string;
            c3243v0.f25514j = z10;
            c3243v0.f25515k = str7;
            N1 n10 = this.f23718h;
            if (n10 != null && this.f23719i != null) {
                n10.a(context, c3243v0, this);
                N1 n11 = this.f23719i;
                if (n11 != null) {
                    n11.a(context, c3243v0, this);
                }
            } else {
                this.f23718h = new N1(context, c3243v0, this);
                this.f23719i = new N1(context, c3243v0, this);
                this.f23721k = this.f23718h;
            }
            String str8 = jg2.f22941g;
            if (str8 != null) {
                C3053n9 c3053n9 = this.f22542f;
                if (c3053n9 != null) {
                    c3053n9.a();
                }
                C3053n9 c3053n9A = Jh.a("audio", str8);
                this.f22542f = c3053n9A;
                if (c3053n9A != null) {
                    ck.p.i(str3, "access$getTAG$p(...)");
                    c3053n9A.a(str3, "adding audioAdUnit1 to reference tracker");
                }
                N1 n12 = this.f23718h;
                ck.p.g(n12);
                Jh.a(n12, this.f22542f);
                C3053n9 c3053n10 = this.f22542f;
                if (c3053n10 != null) {
                    ck.p.i(str3, "access$getTAG$p(...)");
                    c3053n10.a(str3, "adding audioAdUnit2 to reference tracker");
                }
                N1 n13 = this.f23719i;
                ck.p.g(n13);
                Jh.a(n13, this.f22542f);
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(W1 w10, RelativeLayout relativeLayout) {
        w10.b(relativeLayout);
    }
}

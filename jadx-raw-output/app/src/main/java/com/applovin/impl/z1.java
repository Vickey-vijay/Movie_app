package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class z1 extends a2 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final o7 f10233p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final Set f10234q0;

    public class a implements b1.b {
        public a() {
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(z1.this.f6818g0 - ((long) (z1.this.P.getDuration() - z1.this.P.getCurrentPosition())));
            int iC = z1.this.C();
            HashSet hashSet = new HashSet();
            for (y7 y7Var : new HashSet(z1.this.f10234q0)) {
                if (y7Var.a(seconds, iC)) {
                    hashSet.add(y7Var);
                    z1.this.f10234q0.remove(y7Var);
                }
            }
            z1.this.a(hashSet);
            if (iC >= 25 && iC < 50) {
                z1.this.f10233p0.getAdEventTracker().x();
                return;
            }
            if (iC >= 50 && iC < 75) {
                z1.this.f10233p0.getAdEventTracker().y();
            } else if (iC >= 75) {
                z1.this.f10233p0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return !z1.this.f6821j0;
        }
    }

    private boolean V() {
        return this.X != null && this.f10233p0.r1();
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.a2
    public void D() {
        a(o7.d.VIDEO, "skip");
        this.f10233p0.getAdEventTracker().B();
        super.D();
    }

    @Override // com.applovin.impl.a2
    public void O() {
        long jP;
        int iR;
        long millis = 0;
        if (this.f10233p0.O() >= 0 || this.f10233p0.P() >= 0) {
            if (this.f10233p0.O() >= 0) {
                jP = this.f10233p0.O();
            } else {
                o7 o7Var = this.f10233p0;
                b8 b8VarP1 = o7Var.p1();
                if (b8VarP1 == null || b8VarP1.d() <= 0) {
                    long j10 = this.f6818g0;
                    if (j10 > 0) {
                        millis = j10;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(b8VarP1.d());
                }
                if (o7Var.W0() && (iR = (int) o7Var.r()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iR);
                }
                jP = (long) (millis * (((double) this.f10233p0.P()) / 100.0d));
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.a2
    public void g(String str) {
        a(o7.d.ERROR, t7.MEDIA_FILE_ERROR);
        this.f10233p0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void v() {
        this.f6814c0.c();
        super.v();
    }

    public z1(final com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f10234q0 = hashSet;
        o7 o7Var = (o7) bVar;
        this.f10233p0 = o7Var;
        if (o7Var.r1()) {
            ImageView imageViewA = u7.a(o7Var.l1().e(), activity, kVar);
            this.X = imageViewA;
            imageViewA.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.lg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7931b.a(bVar, kVar, activity, view);
                }
            });
        }
        o7.d dVar = o7.d.VIDEO;
        hashSet.addAll(o7Var.a(dVar, z7.f10275a));
        a(o7.d.IMPRESSION);
        a(dVar, "creativeView");
        o7Var.getAdEventTracker().g();
    }

    private void W() {
        if (G() && !this.f10234q0.isEmpty()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9769c.k("AppLovinFullscreenActivity", "Firing " + this.f10234q0.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.f10234q0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Activity activity, View view) {
        Uri uriC = this.f10233p0.l1().c();
        if (uriC != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9769c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriC);
            }
            a(o7.d.INDUSTRY_ICON_CLICK);
            if (bVar.isCustomTabsEnabled()) {
                kVar.z().a(uriC, b().getController(), activity);
            } else {
                k7.b(uriC, bVar, activity, kVar);
            }
        }
    }

    @Override // com.applovin.impl.a2
    public void E() {
        super.E();
        o7 o7Var = this.f10233p0;
        if (o7Var != null) {
            o7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.a2
    public void R() {
        super.R();
        o7 o7Var = this.f10233p0;
        if (o7Var != null) {
            o7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.a2
    public void S() {
        W();
        if (a8.a(this.f10233p0)) {
            if (!this.f6821j0) {
                a(o7.d.COMPANION, "creativeView");
                this.f10233p0.getAdEventTracker().w();
                super.S();
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9769c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        a("no_valid_companion_ad");
    }

    @Override // com.applovin.impl.a2
    public void U() {
        String str;
        super.U();
        o7.d dVar = o7.d.VIDEO;
        if (this.f6817f0) {
            str = CampaignEx.JSON_NATIVE_VIDEO_MUTE;
        } else {
            str = CampaignEx.JSON_NATIVE_VIDEO_UNMUTE;
        }
        a(dVar, str);
        this.f10233p0.getAdEventTracker().b(this.f6817f0);
    }

    @Override // com.applovin.impl.a2
    public void d(long j10) {
        super.d(j10);
        this.f10233p0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j10), n7.e(this.f9768b));
    }

    @Override // com.applovin.impl.w1
    public void s() {
        o7.d dVar;
        super.s();
        if (this.f6821j0) {
            dVar = o7.d.COMPANION;
        } else {
            dVar = o7.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f10233p0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.w1
    public void t() {
        o7.d dVar;
        super.t();
        if (this.f6821j0) {
            dVar = o7.d.COMPANION;
        } else {
            dVar = o7.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f10233p0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void a(String str) {
        if (this.f10233p0 != null) {
            a(o7.d.VIDEO, "close");
            a(o7.d.COMPANION, "close");
        }
        super.a(str);
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (V()) {
            a(o7.d.INDUSTRY_ICON_IMPRESSION);
            this.X.setVisibility(0);
        }
        this.f6814c0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            arrayList.add(new h4(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.R;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        i0 i0Var = this.S;
        if (i0Var != null) {
            arrayList.add(new h4(i0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.V;
        if (progressBar != null) {
            arrayList.add(new h4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.T;
        if (imageView != null) {
            arrayList.add(new h4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.U;
        if (lVar != null) {
            arrayList.add(new h4(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f9776j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9776j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f10233p0.getAdEventTracker().b(this.P, arrayList);
    }

    @Override // com.applovin.impl.a2
    public void a(MotionEvent motionEvent) {
        a(o7.d.VIDEO_CLICK);
        this.f10233p0.getAdEventTracker().v();
        super.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, t7.UNSPECIFIED);
    }

    private void a(o7.d dVar) {
        a(dVar, t7.UNSPECIFIED);
    }

    private void a(o7.d dVar, String str) {
        a(dVar, str, t7.UNSPECIFIED);
    }

    private void a(o7.d dVar, t7 t7Var) {
        a(dVar, "", t7Var);
    }

    private void a(o7.d dVar, String str, t7 t7Var) {
        a(this.f10233p0.a(dVar, str), t7Var);
    }

    private void a(Set set, t7 t7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.P.getCurrentPosition());
        c8 c8VarQ1 = this.f10233p0.q1();
        Uri uriD = c8VarQ1 != null ? c8VarQ1.d() : null;
        if (com.applovin.impl.sdk.o.a()) {
            this.f9769c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        a8.a(set, seconds, uriD, t7Var, this.f9768b);
    }
}

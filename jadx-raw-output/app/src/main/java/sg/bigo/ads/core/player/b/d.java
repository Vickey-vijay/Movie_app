package sg.bigo.ads.core.player.b;

import android.content.Context;
import androidx.annotation.NonNull;
import com.ironsource.Mf;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends f implements sg.bigo.ads.core.g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final sg.bigo.ads.core.g.a.a f71836a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f71837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f71838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f71839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f71840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f71841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final sg.bigo.ads.core.g.e f71842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f71843n;

    public d(Context context, int i10, int i11, @NonNull sg.bigo.ads.api.c.b bVar, @NonNull sg.bigo.ads.core.a.a aVar) {
        super(context, bVar, aVar);
        this.f71837h = 0;
        this.f71838i = false;
        this.f71839j = false;
        this.f71841l = false;
        sg.bigo.ads.core.g.e eVar = new sg.bigo.ads.core.g.e() { // from class: sg.bigo.ads.core.player.b.d.1
            @Override // sg.bigo.ads.core.g.e
            public final void a() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdImpression");
                d.this.a("AdVPAIDImpression", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(float f10) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVolumeChange, volume=".concat(String.valueOf(f10)));
                d.this.f71839j = f10 <= 0.0f;
                d dVar = d.this;
                dVar.b(dVar.f71839j);
                d dVar2 = d.this;
                int[] iArr = new int[1];
                iArr[0] = dVar2.f71839j ? 0 : 100;
                dVar2.a("AdVolumeChange", iArr);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(int i12) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdDurationChange, duration=".concat(String.valueOf(i12)));
                d.this.f71840k = i12;
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(int i12, int i13) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdSizeChange, w=" + i12 + ", h=" + i13);
                d.this.a("AdSizeChange", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(String str) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdError, message=".concat(String.valueOf(str)));
                d.this.a("AdError", str, new int[]{-1, -1});
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(String str, String str2, boolean z10) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdClickThru, url=" + str + ", id=" + str2 + ", playerHandles=" + z10);
                d.a(d.this, str, z10);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(boolean z10) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdExpandedChange, expanded=".concat(String.valueOf(z10)));
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoStart");
                d.this.a("AdVideoStart", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b(int i12) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdRemainingTimeChange, remaining=".concat(String.valueOf(i12)));
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b(String str) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdLog, message=".concat(String.valueOf(str)));
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b(boolean z10) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdInteraction, adLinear=".concat(String.valueOf(z10)));
            }

            @Override // sg.bigo.ads.core.g.e
            public final void c() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoFirstQuartile");
                d.this.a("AdVideoFirstQuartile", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void c(String str) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdInteraction, id=".concat(String.valueOf(str)));
            }

            @Override // sg.bigo.ads.core.g.e
            public final void d() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoMidpoint");
                d.this.a("AdVideoMidpoint", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void e() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoThirdQuartile");
                d.this.a("AdVideoThirdQuartile", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void f() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoComplete");
                d.this.f71837h = 5;
                d.this.f71843n = true;
                d dVar = d.this;
                dVar.setPlayOrPauseViewHidden(dVar.f71875d.f69349b);
                d.this.c(true);
                d.this.d(false);
                d.this.a("AdVideoComplete", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void g() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdSkippableStateChange");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void h() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", Mf.f27060j);
                d.this.f71837h = 1;
                d.this.f71838i = true;
                d dVar = d.this;
                dVar.setAdVolume(dVar.f71875d.f69351d ? 0.0f : 1.0f);
                if (d.this.n()) {
                    d.this.b(18);
                    d.this.setStatPrepareEventOnce(false);
                }
                if (d.this.f71841l) {
                    d.b(d.this);
                    d.this.b();
                } else if (!d.this.q() && !d.this.f71843n) {
                    d.this.d(true);
                }
                d.this.a("AdLoaded", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void i() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdPlaying");
                d.this.f71837h = 2;
                d.this.a("AdVideoPlaying", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void j() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onStartAd");
                d.this.f71837h = 2;
                d.this.f71843n = false;
                d.this.a("AdVideoPlaying", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void k() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onStopAd");
                d.this.f71837h = 4;
                d.this.a("AdStopped", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void l() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onSkipAd");
                d.this.b(10);
                d.this.a("AdSkipped", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void m() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdPaused");
                d.this.f71837h = 3;
                d.this.a("AdVideoPaused", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void n() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdUserAcceptInvitation");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void o() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdUserMinimize");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void p() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdUserClose");
                d.this.a("AdClosed", (int[]) null);
            }
        };
        this.f71842m = eVar;
        this.f71843n = bVar.f69352e;
        p pVarBt = aVar.bt();
        sg.bigo.ads.core.f.a.a.a aVar2 = pVarBt != null ? pVarBt.B : null;
        sg.bigo.ads.core.g.a.a aVar3 = new sg.bigo.ads.core.g.a.a(context, this, aVar.b(context), i10, i11, sg.bigo.ads.api.core.a.b(aVar.x()) ? sg.bigo.ads.core.g.f.FULLSCREEN : sg.bigo.ads.core.g.f.NORMAL, aVar2 != null ? aVar2.a().trim() : "", sg.bigo.ads.api.core.a.d(aVar.x()) ? 3 : bVar.f69348a, aVar.bs());
        this.f71836a = aVar3;
        aVar3.f71487b.setVPAIDEvenListener(eVar);
        aVar3.f71488c = new sg.bigo.ads.core.g.a.a.InterfaceC0737a() { // from class: sg.bigo.ads.core.player.b.d.2
            @Override // sg.bigo.ads.core.g.a.a.InterfaceC0737a
            public final void a() {
                sg.bigo.ads.common.t.a.b("VPAIDPlayView", "onVPAIDPlayerDestroy");
                d.this.f71838i = false;
                d.this.d(false);
                if (d.this.f71843n) {
                    return;
                }
                d.this.r();
            }
        };
    }

    public static /* synthetic */ void a(d dVar, String str, boolean z10) {
        if (sg.bigo.ads.core.g.d.d(str)) {
            sg.bigo.ads.core.a.a aVar = dVar.f71876e;
            sg.bigo.ads.api.core.b.InterfaceC0698b interfaceC0698bN = aVar != null ? aVar.N() : null;
            if (interfaceC0698bN != null) {
                interfaceC0698bN.a(str);
            }
        }
        dVar.a("AdVPAIDClickThru", dVar.f71836a.f71487b.getClickPoints(), new int[]{z10 ? 1 : 0});
    }

    public static /* synthetic */ boolean b(d dVar) {
        dVar.f71841l = false;
        return false;
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        this.f71836a.f71487b.a("window.vpaidwrapper.pauseAd()");
        this.f71841l = false;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void a(boolean z10) {
        super.a(z10);
        if (!this.f71838i) {
            this.f71841l = z10;
            return;
        }
        sg.bigo.ads.core.g.a.b bVar = this.f71836a.f71487b;
        bVar.f71502d.a(3);
        bVar.a("window.vpaidwrapper.startAd()");
        if (!sg.bigo.ads.common.aa.b.a(getContext())) {
            sg.bigo.ads.common.t.a.b("VPAIDPlayView", "screen is off, start ad cancel");
        } else {
            setPlayOrPauseViewHidden(true);
            d(true);
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void b() {
        if (q() || this.f71843n) {
            if (this.f71843n) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "tryStartAd, video is completed play, unregister it from list");
                d(false);
                return;
            }
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "try start play video ad");
        if (this.f71837h == 1) {
            a(false);
        } else {
            this.f71836a.f71487b.a("window.vpaidwrapper.resumeAd()");
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final boolean c() {
        return this.f71839j;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void d() {
        d(false);
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean e() {
        return this.f71838i;
    }

    public final String getAdCompanions() {
        return this.f71836a.f71487b.getAdCompanions();
    }

    public final int getAdDuration() {
        return this.f71836a.f71487b.getAdDuration();
    }

    public final boolean getAdExpanded() {
        return this.f71836a.f71487b.getAdExpanded();
    }

    public final int getAdHeight() {
        return this.f71836a.f71487b.getAdHeight();
    }

    public final boolean getAdIcons() {
        return this.f71836a.f71487b.getAdIcons();
    }

    public final boolean getAdLinear() {
        return this.f71836a.f71487b.getAdLinear();
    }

    public final int getAdRemainingTime() {
        return this.f71836a.f71487b.getAdRemainingTime();
    }

    public final boolean getAdSkippableState() {
        return this.f71836a.f71487b.getAdSkippableState();
    }

    public final float getAdVolume() {
        return this.f71836a.f71487b.getAdVolume();
    }

    public final int getAdWidth() {
        return this.f71836a.f71487b.getAdWidth();
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final int getPlayStatus() {
        return this.f71837h;
    }

    public final void setAdVolume(float f10) {
        this.f71836a.f71487b.setAdVolume(f10);
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void setMute(boolean z10) {
        setAdVolume(z10 ? 0.0f : 1.0f);
    }

    public final void setVPAIDClickable(boolean z10) {
        this.f71836a.f71487b.setVPAIDClickable(z10);
    }
}

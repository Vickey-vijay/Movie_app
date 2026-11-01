package com.fyber.inneractive.sdk.player.controller;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.media.InteractionType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements b, p, o, com.fyber.inneractive.sdk.player.ui.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.f f16258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f16259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f16260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.s f16261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f16262e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f16264g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f16267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16268k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f16270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f16271n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.g f16278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f16279v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16263f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16265h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16266i = -0.1f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16269l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16272o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16273p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16274q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16275r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16276s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f16277t = com.fyber.inneractive.sdk.ignite.m.NONE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16280w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16282y = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Skip f16281x = null;

    public abstract boolean A();

    public void a() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        i1 i1Var;
        IAlog.a("IAVideoUIControllerBase: showEndCard: dismiss time: %d sec.", Integer.valueOf(bVar.f15362f));
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar2 = new com.fyber.inneractive.sdk.player.ui.b(a(cVar.d()));
            if (bVar2.f18047a) {
                com.fyber.inneractive.sdk.web.b0 b0VarK = k();
                com.fyber.inneractive.sdk.flow.endcard.a aVar = (com.fyber.inneractive.sdk.flow.endcard.a) cVar.f();
                if ((aVar instanceof com.fyber.inneractive.sdk.flow.endcard.u) && (i1Var = ((com.fyber.inneractive.sdk.flow.endcard.u) aVar).e().f16200a) != null) {
                    i1Var.setListener(b0VarK);
                }
                this.f16261d.e(false);
                this.f16261d.a(cVar, bVar2);
                ViewGroup viewGroup = this.f16261d.f18123l;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.o) {
            com.fyber.inneractive.sdk.flow.endcard.o oVar = (com.fyber.inneractive.sdk.flow.endcard.o) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar3 = new com.fyber.inneractive.sdk.player.ui.b(a(oVar.d()));
            if (bVar3.f18047a) {
                com.fyber.inneractive.sdk.web.b0 b0VarK2 = k();
                i1 i1Var2 = ((com.fyber.inneractive.sdk.flow.endcard.p) oVar.f()).e().f16200a;
                if (i1Var2 != null) {
                    i1Var2.setListener(b0VarK2);
                }
                this.f16261d.a(oVar, bVar3);
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.d) {
            com.fyber.inneractive.sdk.flow.endcard.d dVar = (com.fyber.inneractive.sdk.flow.endcard.d) bVar;
            com.fyber.inneractive.sdk.player.ui.c cVarD = dVar.d();
            String str = this.f16279v;
            if (str == null) {
                com.fyber.inneractive.sdk.config.global.r rVar = this.f16260c;
                if (rVar != null) {
                    com.fyber.inneractive.sdk.config.global.features.d dVar2 = (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class);
                    dVar2.d(IAConfigManager.O.f15020o);
                    com.fyber.inneractive.sdk.model.vast.a aVar2 = dVar2.f15089e;
                    if (aVar2 == null || !aVar2.f15870d) {
                        str = null;
                    } else {
                        str = aVar2.f15867a;
                    }
                } else {
                    str = null;
                }
            }
            cVarD.f18058c = str;
            com.fyber.inneractive.sdk.player.ui.b bVar4 = new com.fyber.inneractive.sdk.player.ui.b(a(cVarD));
            if (bVar4.f18047a) {
                this.f16261d.e(false);
                this.f16261d.a(dVar, bVar4);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    public abstract void b(g1 g1Var);

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null) {
            return false;
        }
        if (!this.f16265h && fVar.f17963a != null && ((sVar = this.f16261d) == null || !sVar.i())) {
            int iC = this.f16258a.f17963a.c();
            com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
            if (!com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(fVar2), ((com.fyber.inneractive.sdk.player.n) fVar2).f18028s) || this.f16265h || this.f16263f != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
        if (this.f16272o && !this.f16269l) {
            this.f16269l = true;
        }
    }

    public boolean e() {
        String str;
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.g gVar = kVarJ.f15375a.f15755d;
        return (gVar != null && (str = gVar.E) != null && TextUtils.equals(str, "1")) ^ true;
    }

    public final void f(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (qVar = fVar.f17963a) != null) {
            qVar.b(z10);
        }
        this.f16261d.setMuteButtonState(true);
    }

    public void g() {
        if (this.f16278u != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
        }
    }

    public void h(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null) {
            if (!fVar.f17969g) {
                E();
                return;
            }
            if (z10 && (qVar = fVar.f17963a) != null) {
                qVar.a(0, true);
                return;
            }
            q qVar2 = fVar.f17963a;
            if (qVar2 != null) {
                com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f16237e;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    qVar2.a(1, true);
                } else {
                    qVar2.j();
                }
            }
        }
    }

    public abstract int i();

    public abstract int o();

    public abstract void r();

    public abstract void t();

    public abstract void v();

    public void w() {
    }

    public static int l() {
        int i10;
        try {
            i10 = Integer.parseInt(IAConfigManager.O.f15026u.f15195b.a("max_rv_tsec", Integer.toString(30)));
        } catch (Throwable unused) {
            i10 = 30;
        }
        if (i10 < 1) {
            return 30;
        }
        return i10;
    }

    public boolean B() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        t0 t0Var;
        s0 s0Var = this.f16259b;
        boolean z10 = (s0Var == null || (t0Var = ((r0) s0Var).f15149f) == null || t0Var.f15209j != UnitDisplayType.REWARDED) ? false : true;
        if (!InneractiveAdManager.isCurrentUserAChild() || !z10 || this.f16261d == null || (fVar = this.f16258a) == null || (qVar = fVar.f17963a) == null) {
            return false;
        }
        int iB = qVar.b() / 1000;
        return (this.f16258a.f17963a.c() / 1000) - iB <= 0 || iB < l();
    }

    public void C() {
        Boolean boolC;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16260c;
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        boolean zBooleanValue = (uVar == null || (boolC = uVar.c("show_cta")) == null) ? true : boolC.booleanValue();
        g0 g0Var = this.f16264g;
        if (g0Var != null) {
            this.f16277t = g0Var.p();
        }
        com.fyber.inneractive.sdk.ignite.m mVar = this.f16277t;
        this.f16261d.a(mVar == com.fyber.inneractive.sdk.ignite.m.NONE ? zBooleanValue : true, mVar);
    }

    public final void D() {
        com.fyber.inneractive.sdk.flow.endcard.b bVarA;
        g0 g0Var;
        com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar;
        boolean z10;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar3;
        View view;
        View view2;
        com.fyber.inneractive.sdk.flow.endcard.b bVar;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        this.f16261d.h();
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            bVarA = kVarJ.a();
            com.fyber.inneractive.sdk.flow.endcard.h hVar = kVarJ.f15379e;
            com.fyber.inneractive.sdk.flow.endcard.m mVar = kVarJ.f15376b;
            hVar.getClass();
            if (mVar.f15411a.size() >= 1) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = mVar.a();
                com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
                Iterator it = mVar.f15411a.iterator();
                do {
                    if (!it.hasNext()) {
                        bVar = null;
                        break;
                    }
                    bVar = (com.fyber.inneractive.sdk.flow.endcard.b) it.next();
                } while (bVar.i() != iVar);
                if (bVarA2 != null && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && bVarA2.l() && (oVar = bVarA2.f15359c.f15756e.f15877f) != null && oVar.f15931d && bVar != null && bVar.l()) {
                    hVar.a(bVarA2, bVar.l());
                    hVar.a(bVar, true, bVarA2.k());
                } else if (bVarA2 == bVar || bVarA2 == null || bVarA2.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
                    hVar.a(bVarA2, false, false);
                } else {
                    hVar.a(bVarA2, false);
                }
            }
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            if (e() || (g0Var = this.f16264g) == null) {
                return;
            }
            g0Var.j();
            return;
        }
        a(bVarA);
        if (n() != null) {
            com.fyber.inneractive.sdk.flow.storepromo.b bVarN = n();
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f16261d;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVarN.f15587d;
            if (bVar2 == null || (cVar = bVar2.f15596c) == null || !(z10 = cVar.f15607e)) {
                bVarN.f15584a.a();
                bVarN.a();
                bVarN.a((bVarN.f15587d == null ? com.fyber.inneractive.sdk.flow.storepromo.events.a.CONTROLLER_NOT_INITIALIZED : com.fyber.inneractive.sdk.flow.storepromo.events.a.TEMPLATE_NOT_LOADED).name(), (String) null, (String) null);
                return;
            }
            bVar2.f15602i = kVarJ;
            if (!z10 || (cVar2 = bVar2.f15597d) == null || bVar2.f15600g) {
                return;
            }
            if (cVar2.f15685b == null || (view2 = cVar2.f15684a) == null || view2.getParent() == null || cVar2.f15685b.getVisibility() != 0) {
                com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar4 = bVar2.f15597d;
                if (cVar4.f15685b == null || cVar4.f15684a == null) {
                    IAlog.f("StorePromoView: show: missing container or content", new Object[0]);
                    return;
                }
                cVar4.a();
                com.fyber.inneractive.sdk.util.v.a(cVar4.f15685b);
                sVar.addView(cVar4.f15685b);
                cVar4.f15684a.setAnimation(cVar4.f15686c);
                cVar4.f15685b.setVisibility(0);
                com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = cVar4.f15689f;
                if (bVar3 != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar4 = bVar3.f15587d;
                    com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar5 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar4 == null || (cVar3 = bVar4.f15597d) == null || cVar3.f15685b == null || (view = cVar3.f15684a) == null || view.getParent() == null || cVar3.f15685b.getVisibility() != 0) ? false : true, bVar3.f15592i);
                    Iterator it2 = bVar3.f15591h.iterator();
                    while (it2.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it2.next()).a(bVar5);
                    }
                    JSONObject jSONObject = new JSONObject();
                    Integer numValueOf = Integer.valueOf(bVar3.f15590g);
                    try {
                        jSONObject.put("screenshots", numValueOf);
                    } catch (Exception unused) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "screenshots", numValueOf);
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_IMPRESSION;
                    InneractiveAdRequest inneractiveAdRequest = bVar3.f15586c;
                    com.fyber.inneractive.sdk.response.e eVar = bVar3.f15585b;
                    String str = bVar3.f15589f;
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
                    try {
                        jSONObject.put("templateURL", str);
                    } catch (Exception unused2) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                    }
                    wVar.f16132f.put(jSONObject);
                    wVar.a((String) null);
                }
            }
        }
    }

    public void E() {
        boolean z10;
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (((qVar2 = fVar.f17963a) != null && qVar2.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed) || this.f16274q)) {
            fVar.a();
        }
        boolean zA = IAConfigManager.O.f15026u.f15195b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f16261d;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
        sVar.e((fVar2 == null || (qVar = fVar2.f17963a) == null || qVar.f16237e != com.fyber.inneractive.sdk.player.enums.b.Completed) && !(((z10 = this.f16274q) && !zA) || this.f16275r || (z10 && zA)));
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void destroy() {
        q qVar;
        Application application;
        u uVar = this.f16270m;
        if (uVar != null && (application = com.fyber.inneractive.sdk.util.o.f18599a) != null) {
            application.unregisterActivityLifecycleCallbacks(uVar);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (qVar = fVar.f17963a) != null) {
            qVar.f16234b.remove(this);
            this.f16258a.f17963a.f16235c.remove(this);
        }
        g();
        Runnable runnable = this.f16267j;
        if (runnable != null) {
            this.f16261d.removeCallbacks(runnable);
            this.f16267j = null;
        }
        this.f16264g = null;
    }

    public final void i(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (qVar = fVar.f17963a) != null) {
            qVar.d(z10);
        }
        this.f16261d.setMuteButtonState(false);
    }

    public final com.fyber.inneractive.sdk.flow.endcard.k j() {
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f18029t;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.web.b0 k() {
        return new w(this);
    }

    public final float m() {
        try {
            return ((AudioManager) this.f16261d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public com.fyber.inneractive.sdk.flow.storepromo.b n() {
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f18031v;
        }
        return null;
    }

    public final boolean p() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || (qVar = fVar.f17963a) == null) {
            return false;
        }
        return qVar.g() || ((double) m()) == 0.0d;
    }

    public final void q() {
        this.f16261d.a(true);
        this.f16261d.e(false);
        Runnable runnable = this.f16267j;
        if (runnable == null) {
            if (runnable == null) {
                this.f16267j = new t(this);
            }
            int i10 = i();
            IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(i10));
            this.f16261d.postDelayed(this.f16267j, i10);
        }
    }

    public void u() {
        Runnable runnable = this.f16267j;
        if (runnable != null) {
            this.f16261d.removeCallbacks(runnable);
            this.f16267j = null;
        }
        this.f16261d.a(false);
        E();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    public void x() {
        q qVar;
        this.f16261d.a(false);
        this.f16261d.e(false);
        Runnable runnable = this.f16267j;
        if (runnable != null) {
            this.f16261d.removeCallbacks(runnable);
            this.f16267j = null;
        }
        if (this.f16258a != null && A() && !this.f16265h) {
            int iC = this.f16258a.f17963a.c();
            com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
            if (com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(fVar), ((com.fyber.inneractive.sdk.player.n) fVar).f18028s)) {
                if (this.f16263f <= 0) {
                    this.f16261d.g(true);
                    h();
                } else {
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
                    if (fVar2 == null || (qVar = fVar2.f17963a) == null) {
                        if (!this.f16273p) {
                            this.f16261d.g(true);
                            b(this.f16263f);
                            this.f16273p = true;
                        }
                    } else if (this.f16263f >= qVar.c() / 1000) {
                        this.f16261d.g(false);
                    } else if (!this.f16273p) {
                        this.f16261d.g(true);
                        b(this.f16263f);
                        this.f16273p = true;
                    }
                }
            }
        }
        g0 g0Var = this.f16264g;
        if (g0Var != null && !this.f16268k) {
            this.f16268k = true;
            g0Var.k();
        }
        this.f16274q = false;
    }

    public final void y() {
        com.fyber.inneractive.sdk.player.ui.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f16261d;
        if (sVar != null) {
            sVar.o();
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && fVar.f17963a != null && (gVar = this.f16278u) != null) {
            gVar.invalidate();
            this.f16278u.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f16261d;
        if (sVar2 != null) {
            sVar2.invalidate();
            this.f16261d.requestLayout();
        }
    }

    public void z() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || (qVar = fVar.f17963a) == null) {
            return;
        }
        if (qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), qVar.f16237e);
            return;
        }
        IAlog.a("%spauseVideo %s", IAlog.a(this), this.f16261d);
        TextureView textureView = qVar.f16242j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.f16261d.getTextureHost()) {
            return;
        }
        qVar.i();
    }

    public z(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        q qVar;
        this.f16258a = fVar;
        this.f16259b = s0Var;
        this.f16260c = rVar;
        this.f16261d = sVar;
        this.f16271n = z10;
        this.f16279v = str;
        sVar.setListener(this);
        if (fVar != null && (qVar = fVar.f17963a) != null) {
            if (!qVar.f16234b.contains(this)) {
                qVar.f16234b.add(this);
            }
            q qVar2 = fVar.f17963a;
            if (!qVar2.f16235c.contains(this)) {
                qVar2.f16235c.add(this);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.n
    public void c() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        g();
    }

    public void s() {
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    public final void d(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        q qVar2;
        t0 t0Var;
        g0 g0Var;
        com.fyber.inneractive.sdk.player.f fVar2;
        q qVar3;
        com.fyber.inneractive.sdk.measurement.f fVar3;
        q qVar4;
        s0 s0Var;
        t0 t0Var2;
        this.f16274q = true;
        x0 x0Var = IAConfigManager.O.f15029x;
        if (z10 && x0Var != null && (s0Var = this.f16259b) != null && (t0Var2 = ((r0) s0Var).f15149f) != null) {
            x0Var.a(t0Var2.f15209j, "LAST_VAST_SKIPED", "1");
        }
        com.fyber.inneractive.sdk.player.f fVar4 = this.f16258a;
        if (fVar4 != null && (qVar4 = fVar4.f17963a) != null) {
            qVar4.k();
            this.f16258a.f17963a.i();
        }
        com.fyber.inneractive.sdk.player.f fVar5 = this.f16258a;
        if (fVar5 != null && z10 && (fVar3 = fVar5.f17967e) != null && fVar3.f15817c != null) {
            IAlog.a("%s skipped", "OMVideo");
            try {
                fVar3.f15817c.skipped();
            } catch (Throwable th2) {
                fVar3.a(th2);
            }
        }
        if (!this.f16261d.b()) {
            this.f16261d.a(false);
            Runnable runnable = this.f16267j;
            if (runnable != null) {
                this.f16261d.removeCallbacks(runnable);
                this.f16267j = null;
            }
            this.f16268k = false;
            this.f16265h = true;
            s0 s0Var2 = this.f16259b;
            if (s0Var2 != null && (t0Var = ((r0) s0Var2).f15149f) != null && t0Var.f15209j == UnitDisplayType.REWARDED && (g0Var = this.f16264g) != null) {
                if (this.f16274q && (fVar2 = this.f16258a) != null && (qVar3 = fVar2.f17963a) != null) {
                    int iB = qVar3.b();
                    int iC = qVar3.c() - iB;
                    int iL = l() * 1000;
                    if (iC > 0 && iB < iL) {
                        this.f16282y = true;
                    } else {
                        this.f16264g.onCompleted();
                    }
                } else {
                    g0Var.onCompleted();
                }
            }
        }
        if (z10) {
            boolean zA = IAConfigManager.O.f15026u.f15195b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a();
            com.fyber.inneractive.sdk.player.f fVar6 = this.f16258a;
            if ((fVar6 != null && (qVar2 = fVar6.f17963a) != null && qVar2.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed) || ((this.f16274q && !zA) || this.f16275r)) {
                D();
            }
        } else {
            D();
        }
        g0 g0Var2 = this.f16264g;
        if (g0Var2 != null && (this.f16263f <= 0 || this.f16265h || ((fVar = this.f16258a) != null && (qVar = fVar.f17963a) != null && qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed))) {
            g0Var2.a(z10);
        }
        g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    public void g(boolean z10) {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        Context context = this.f16261d.getContext();
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16260c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            if (new ArrayList(cVar2.f15091c.values()).size() > 0) {
                cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.f16260c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            } else {
                cVar = null;
            }
        } else {
            cVar = null;
        }
        new f0(context, cVar, new v(this, z10)).f16220b.show();
    }

    public final void e(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || (qVar = fVar.f17963a) == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f16237e;
        if (z10 && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f16261d.b()) {
            h(false);
            return;
        }
        if (!z10 && bVar == com.fyber.inneractive.sdk.player.enums.b.Paused && this.f16261d.b()) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    public void f() {
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.measurement.f fVar;
        if (this.f16278u == null) {
            com.fyber.inneractive.sdk.player.ui.g gVar = new com.fyber.inneractive.sdk.player.ui.g(this.f16261d);
            this.f16278u = gVar;
            gVar.setId(R.id.ia_inn_texture_view);
            com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
            if (fVar2 != null && (fVar = fVar2.f17967e) != null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f16261d;
                View[] trackingFriendlyView = sVar.getTrackingFriendlyView();
                AdSession adSession = fVar.f15815a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(sVar);
                    } catch (Throwable th2) {
                        fVar.a(th2);
                    }
                }
                if (fVar.f15815a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                fVar.f15815a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.f16261d.getTrackingFriendlyViewObstructionPurposeOther();
                if (fVar.f15815a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                fVar.f15815a.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            } catch (Throwable th4) {
                                fVar.a(th4);
                            }
                        }
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.f16261d.getTextureHost());
        if (this.f16278u != null && this.f16261d.getTextureHost().equals(this.f16278u.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f16258a;
        if (fVar3 != null && (qVar2 = fVar3.f17963a) != null) {
            qVar2.a(this.f16278u);
        }
        com.fyber.inneractive.sdk.player.ui.g gVar2 = this.f16278u;
        if (gVar2 != null && gVar2.getParent() == null) {
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f16261d.getTextureHost().addView(this.f16278u, layoutParams);
        }
        this.f16269l = false;
        x xVar = new x(this);
        this.f16262e = xVar;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f16258a;
        if (fVar4 == null || (qVar = fVar4.f17963a) == null) {
            return;
        }
        qVar.f16236d = xVar;
    }

    public void h() {
        if (A()) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f16260c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f15020o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f15089e;
                if (aVar != null && aVar.f15870d) {
                    str = aVar.f15868b;
                }
            }
            if (TextUtils.isEmpty(this.f16279v) && str != null) {
                this.f16261d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f16261d;
                sVar.setSkipText(sVar.getContext().getString(R.string.ia_video_skip_text));
            }
            this.f16261d.g();
            this.f16263f = 0;
            g0 g0Var = this.f16264g;
            if (g0Var != null) {
                g0Var.d();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(boolean z10) {
        IAlog.a("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || fVar.f17963a == null) {
            return;
        }
        this.f16261d.setUnitConfig(this.f16259b);
        this.f16261d.a(this.f16271n, this.f16258a.f17963a.f(), this.f16258a.f17963a.e());
        if (A()) {
            this.f16263f = o();
        } else {
            this.f16261d.g(false);
        }
        if (!z10) {
            a(this.f16258a.f17963a.b());
            a(this.f16258a.f17963a.f16237e, false);
        }
        this.f16261d.setMuteButtonState(p());
    }

    public final void b(int i10) {
        if (this.f16261d != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f16260c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f15020o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f15089e;
                if (aVar != null && aVar.f15870d) {
                    str = aVar.f15869c;
                }
            }
            if (TextUtils.isEmpty(this.f16279v) && str != null) {
                this.f16261d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i10)));
            } else {
                this.f16261d.setSkipText(String.valueOf(i10));
            }
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f18031v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f15583k) {
                bVar.f15591h.remove(aVar);
            }
            return;
        }
        IAlog.f("Unable to remove store promo observer, promo manager is unavailable", new Object[0]);
    }

    public final com.fyber.inneractive.sdk.player.ui.c a(com.fyber.inneractive.sdk.player.ui.c cVar) {
        String string;
        cVar.f18063h = this.f16258a != null && com.fyber.inneractive.sdk.player.f.a(this.f16260c, this.f16277t);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16260c;
        com.fyber.inneractive.sdk.config.global.features.n nVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.n) rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) : null;
        if (nVar != null) {
            string = nVar.a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.f16261d.getContext().getString(R.string.ia_video_app_info_text);
        }
        cVar.f18064i = string;
        cVar.f18062g = this.f16277t;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z10) {
        g0 g0Var;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        switch (y.f16256a[bVar.ordinal()]) {
            case 1:
                boolean z11 = this.f16280w;
                if (z11) {
                    IAlog.a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", bVar, String.valueOf(z11));
                    q();
                }
                break;
            case 2:
                if (this.f16272o) {
                    E();
                    w();
                }
                break;
            case 3:
                if (this.f16272o) {
                    this.f16280w = true;
                    q();
                }
                break;
            case 4:
                if (this.f16280w) {
                    this.f16280w = false;
                }
                if (this.f16272o) {
                    x();
                }
                break;
            case 5:
                u();
                break;
            case 6:
                if (this.f16272o || (!e() && !this.f16276s)) {
                    this.f16276s = true;
                    if (!this.f16261d.b()) {
                        this.f16261d.a(false);
                        Runnable runnable = this.f16267j;
                        if (runnable != null) {
                            this.f16261d.removeCallbacks(runnable);
                            this.f16267j = null;
                        }
                        E();
                        D();
                        this.f16268k = false;
                        this.f16265h = true;
                    }
                    if (z10 && (g0Var = this.f16264g) != null) {
                        g0Var.onCompleted();
                        break;
                    }
                }
                break;
            case 7:
                if (this.f16272o || ((sVar = this.f16261d) != null && sVar.isShown())) {
                    s();
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    @Override // com.fyber.inneractive.sdk.player.controller.o
    public final void a(int i10) {
        s0 s0Var;
        t0 t0Var;
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || fVar.f17963a == null) {
            return;
        }
        float fM = m();
        com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
        if (fVar2 != null && (qVar = fVar2.f17963a) != null && qVar.h()) {
            float f10 = this.f16266i;
            if (fM != f10) {
                if (fM > 0.0f && f10 >= 0.0f && p()) {
                    i(true);
                } else if (fM == 0.0d) {
                    f(true);
                }
            }
            this.f16261d.setMuteButtonState(p());
        }
        this.f16266i = fM;
        int iC = this.f16258a.f17963a.c();
        int iB = this.f16258a.f17963a.b();
        int i11 = iB / 1000;
        int i12 = iC / 1000;
        int i13 = i12 - i11;
        if (i13 < 0 || (!this.f16258a.f17963a.h() && iB == iC)) {
            i13 = 0;
        }
        g0 g0Var = this.f16264g;
        if (g0Var != null) {
            g0Var.onProgress(iC, iB);
        }
        if (this.f16261d.l()) {
            return;
        }
        this.f16261d.setRemainingTime(Integer.toString(i13));
        if (this.f16263f < i12) {
            if (A()) {
                int iC2 = this.f16258a.f17963a.c();
                com.fyber.inneractive.sdk.player.f fVar3 = this.f16258a;
                if (com.fyber.inneractive.sdk.player.f.a(iC2, com.fyber.inneractive.sdk.player.f.a(fVar3), ((com.fyber.inneractive.sdk.player.n) fVar3).f18028s) && !this.f16265h) {
                    int i14 = this.f16263f;
                    if (i11 < i14) {
                        b(i14 - i11);
                    } else {
                        this.f16263f = 0;
                        h();
                    }
                    this.f16261d.g(true);
                } else {
                    this.f16261d.g(false);
                }
            } else {
                this.f16261d.g(false);
            }
        } else {
            this.f16261d.g(false);
            b(i13);
        }
        if (this.f16258a.f17963a.f16237e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            this.f16261d.a(iC, iB);
            int iL = l();
            if (i12 <= iL || i11 <= iL || (s0Var = this.f16259b) == null || (t0Var = ((r0) s0Var).f15149f) == null || t0Var.f15209j != UnitDisplayType.REWARDED) {
                return;
            }
            h();
            this.f16261d.g(true);
        }
    }

    public final void a(String str) {
        t0 t0Var;
        x0 x0Var = IAConfigManager.O.f15029x;
        s0 s0Var = this.f16259b;
        if (s0Var == null || (t0Var = ((r0) s0Var).f15149f) == null) {
            return;
        }
        x0Var.a(t0Var.f15209j, "LAST_VAST_CLICKED_TYPE", str);
    }

    public void a(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        Application application;
        if (this.f16272o == z10 || (fVar = this.f16258a) == null || fVar.f17963a == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z10), this.f16261d);
        if (z10) {
            this.f16272o = true;
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f16258a.f17963a.f16237e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f16261d.b()) {
                if (bVar != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
                        this.f16258a.getClass();
                    } else {
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            x();
                        }
                        com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
                        if (!fVar2.f17972j) {
                            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar2;
                            nVar.a(nVar.f18025p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
                            fVar2.f17972j = true;
                        }
                        f();
                        if (this.f16270m != null || (application = com.fyber.inneractive.sdk.util.o.f18599a) == null) {
                            return;
                        }
                        u uVar = new u(this);
                        this.f16270m = uVar;
                        application.registerActivityLifecycleCallbacks(uVar);
                        return;
                    }
                }
                s();
                return;
            }
            if (!this.f16276s) {
                this.f16276s = true;
                if (!this.f16282y) {
                    if (!this.f16261d.b()) {
                        this.f16261d.a(false);
                        Runnable runnable = this.f16267j;
                        if (runnable != null) {
                            this.f16261d.removeCallbacks(runnable);
                            this.f16267j = null;
                        }
                        E();
                        D();
                        this.f16268k = false;
                        this.f16265h = true;
                    }
                    g0 g0Var = this.f16264g;
                    if (g0Var != null) {
                        g0Var.onCompleted();
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f16261d;
            if (sVar2 != null) {
                sVar2.k();
                return;
            }
            return;
        }
        this.f16272o = false;
        com.fyber.inneractive.sdk.player.f fVar3 = this.f16258a;
        if (fVar3 != null && (qVar = fVar3.f17963a) != null && (xVar = qVar.f16236d) != null && xVar.equals(this.f16262e)) {
            IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
            z();
            if (this.f16258a.f17963a.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((sVar = this.f16261d) != null && sVar.b())) {
                this.f16261d.j();
            }
        }
        com.fyber.inneractive.sdk.player.ui.s sVar3 = this.f16261d;
        if (sVar3 == null || !sVar3.f18074h) {
            g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i10, g1 g1Var) {
        IAlog.a("onClicked called with %d", Integer.valueOf(i10));
        switch (i10) {
            case 1:
                if (p()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
                    if (fVar != null) {
                        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                        nVar.a(nVar.f18025p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
                    if (fVar2 != null) {
                        com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                        nVar2.a(nVar2.f18025p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_MUTE);
                    }
                }
                this.f16261d.setMuteButtonState(p());
                break;
            case 2:
                v();
                break;
            case 3:
                a(w0.CTA_BUTTON.a());
                a(false, VideoClickOrigin.CTA, g1Var);
                break;
            case 4:
                a(w0.COMPANION.a());
                com.fyber.inneractive.sdk.player.f fVar3 = this.f16258a;
                String str = null;
                if (fVar3 != null) {
                    com.fyber.inneractive.sdk.player.n nVar3 = (com.fyber.inneractive.sdk.player.n) fVar3;
                    com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar3.f18029t.f15376b.a();
                    if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVarA;
                        String str2 = cVar.f15363g.f15894g;
                        if (TextUtils.isEmpty(str2)) {
                            com.fyber.inneractive.sdk.model.vast.b bVar = nVar3.f18025p;
                            if (bVar != null) {
                                str = bVar.f15873b;
                            }
                        } else {
                            str = str2;
                        }
                        fVar3.a(cVar, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f16261d;
                if (sVar != null) {
                    sVar.f();
                }
                g0 g0Var = this.f16264g;
                if (g0Var != null) {
                    g0Var.a(str, g1Var, false);
                }
                break;
            case 5:
                t();
                break;
            case 6:
                if (B()) {
                    g(true);
                } else {
                    d(true);
                }
                break;
            case 7:
                b(g1Var);
                break;
            case 8:
                a(w0.COMPANION.a());
                a(true, VideoClickOrigin.COMPANION, g1Var);
                break;
            case 9:
                com.fyber.inneractive.sdk.player.f fVar4 = this.f16258a;
                if (fVar4 != null && !this.f16261d.f18074h) {
                    fVar4.f17969g = true;
                    h(false);
                    break;
                }
                break;
            case 10:
                a(w0.APP_INFO.a());
                a(false, VideoClickOrigin.APP_INFO, g1Var);
                break;
            case 11:
                a(w0.STORE_PROMO.a());
                a(false, VideoClickOrigin.STORE_PROMO, g1Var);
                break;
        }
    }

    public final boolean a(boolean z10, VideoClickOrigin videoClickOrigin, g1 g1Var) {
        com.fyber.inneractive.sdk.util.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f16261d;
        if (sVar != null) {
            sVar.f();
        }
        g0 g0Var = this.f16264g;
        boolean z11 = false;
        if (g0Var != null) {
            if (z10) {
                com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f18025p;
                    g0Var.a(bVar != null ? bVar.f15873b : null, g1Var, true);
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) this.f16258a;
                    nVar.a(nVar.f18025p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            } else {
                int i10 = y.f16257b[videoClickOrigin.ordinal()];
                if (i10 == 1) {
                    gVar = com.fyber.inneractive.sdk.util.g.STORE_PROMO_CTA;
                } else if (i10 == 2) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CLICK;
                } else if (i10 != 3) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
                } else {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_APP_INFO;
                }
                com.fyber.inneractive.sdk.util.d0 d0VarA = this.f16264g.a(g1Var, gVar);
                com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
                if (fVar2 != null) {
                    com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                    nVar2.a(nVar2.f18025p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    com.fyber.inneractive.sdk.measurement.f fVar3 = this.f16258a.f17967e;
                    if (fVar3 != null && fVar3.f15817c != null) {
                        IAlog.a("%s click", "OMVideo");
                        try {
                            fVar3.f15817c.adUserInteraction(InteractionType.CLICK);
                        } catch (Throwable th2) {
                            fVar3.a(th2);
                        }
                    }
                }
                if (d0VarA.f18572a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                    z11 = true;
                }
            }
        }
        if (videoClickOrigin == VideoClickOrigin.VIDEO) {
            a(w0.VIDEO.a());
        }
        return z11;
    }

    public final boolean a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f18031v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f15583k) {
                bVar.f15591h.add(aVar);
            }
            return true;
        }
        IAlog.f("Unable to add store promo observer, promo manager is unavailable", new Object[0]);
        return false;
    }
}

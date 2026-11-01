package com.inmobi.media;

import android.view.ViewGroup;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3207te extends AbstractC3317y implements InterfaceC2786cj, Ck, InterfaceC2843f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3232ue f25388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jc f25389c;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "Initialize Called");
        }
        InterfaceC2786cj interfaceC2786cj = this.f25388b.f25469g.f22585c.f22360c;
        I i10 = interfaceC2786cj instanceof I ? (I) interfaceC2786cj : null;
        if (i10 != null) {
            i10.g();
        }
        C3232ue c3232ue = this.f25388b;
        C3186si c3186si = c3232ue.f25464b;
        if (!c3186si.f25339a) {
            c3186si.f25339a = true;
            AbstractC2819e1 abstractC2819e1 = c3232ue.f25467e;
            if (abstractC2819e1.f24279c == null) {
                InterfaceC3028m9 interfaceC3028m9 = abstractC2819e1.f24278b;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).a(AbstractC2819e1.f24276f, "Failed to startAdSession. adSession is null");
                }
            } else {
                InterfaceC3028m9 interfaceC3028m10 = abstractC2819e1.f24278b;
                if (interfaceC3028m10 != null) {
                    ((C3053n9) interfaceC3028m10).a(AbstractC2819e1.f24276f, "startAdSession");
                }
                P4.a(abstractC2819e1.f24277a, new C2742b1(abstractC2819e1, null));
            }
            C3232ue c3232ue2 = this.f25388b;
            AbstractC2819e1 abstractC2819e2 = c3232ue2.f25467e;
            ViewGroup parentView$media_release = c3232ue2.f25465c.f23523a.getParentView$media_release();
            abstractC2819e2.getClass();
            ck.p.j(parentView$media_release, "adView");
            if (abstractC2819e2.f24279c == null) {
                InterfaceC3028m9 interfaceC3028m11 = abstractC2819e2.f24278b;
                if (interfaceC3028m11 != null) {
                    ((C3053n9) interfaceC3028m11).a(AbstractC2819e1.f24276f, "Failed to registerAdView. adSession is null");
                }
            } else {
                InterfaceC3028m9 interfaceC3028m12 = abstractC2819e2.f24278b;
                if (interfaceC3028m12 != null) {
                    ((C3053n9) interfaceC3028m12).a(AbstractC2819e1.f24276f, "registerAdView");
                }
                P4.a(abstractC2819e2.f24277a, new Y0(abstractC2819e2, parentView$media_release, null));
            }
            G g10 = this.f25754a.f25677b;
            ck.p.j(g10, "<this>");
            MetaInfo metaInfo = g10.f22695d;
            if (ck.p.e(metaInfo != null ? metaInfo.getCreativeType() : null, "video")) {
                this.f25388b.f25467e.a(true);
            } else {
                this.f25388b.f25467e.a();
            }
        }
        InterfaceC3028m9 interfaceC3028m9L2 = l();
        if (interfaceC3028m9L2 != null) {
            ((C3053n9) interfaceC3028m9L2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        nk.j.d(this.f25388b.f25470h, null, null, new C2858fe(((C3006lc) this.f25388b.f25469g.f22589g.getValue()).f24768e, null, this), 3, null);
        P4.a(this.f25388b.f25470h, new C2781ce(this, null));
        C3232ue c3232ue3 = this.f25388b;
        if (c3232ue3.f25464b.f25340b) {
            InterfaceC3028m9 interfaceC3028m9L3 = l();
            if (interfaceC3028m9L3 != null) {
                ((C3053n9) interfaceC3028m9L3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            nk.j.d(c3232ue3.f25470h, null, null, new C3157re(this, null), 3, null);
        }
        if (this.f25388b.f25464b.f25341c) {
            InterfaceC3028m9 interfaceC3028m9L4 = l();
            if (interfaceC3028m9L4 != null) {
                ((C3053n9) interfaceC3028m9L4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            G g11 = this.f25754a.f25677b;
            ck.p.j(g11, "<this>");
            if (g11.f22704m.f22611a == 0) {
                InterfaceC3028m9 interfaceC3028m9L5 = l();
                if (interfaceC3028m9L5 != null) {
                    ((C3053n9) interfaceC3028m9L5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                nk.j.d(this.f25388b.f25470h, null, null, new C3058ne(this, null), 3, null);
            }
        }
        if (!this.f25388b.f25464b.f25342d) {
            if (AbstractC3347z4.a(this.f25754a.f25677b, "mrc50").isEmpty()) {
                InterfaceC3028m9 interfaceC3028m9L6 = l();
                if (interfaceC3028m9L6 != null) {
                    ((C3053n9) interfaceC3028m9L6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map mapA = AbstractC2939ik.a(((Dc) this.f25388b.f25469g.f22588f.getValue()).f22517a);
                Wj wj2 = Wj.f23753a;
                Wj.b("MRCViewable50Started", mapA, EnumC2735ak.SDK);
                nk.j.d(this.f25388b.f25470h, null, null, new C3108pe(this, null), 3, null);
            }
        }
        C3006lc c3006lc = (C3006lc) this.f25388b.f25469g.f22589g.getValue();
        qk.l lVar = ((yo) this.f25388b.f25474l.getValue()).f25818b;
        c3006lc.getClass();
        ck.p.j(lVar, "windowFlow");
        C3053n9 c3053n9 = c3006lc.f24764a;
        if (c3053n9 != null) {
            c3053n9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        AbstractC2946j2 abstractC2946j2 = c3006lc.f24765b;
        if (abstractC2946j2 != null) {
            abstractC2946j2.a(lVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3207te(C3232ue c3232ue, Jc jc2) {
        super(c3232ue.f25469g.f22583a);
        ck.p.j(c3232ue, IronSourceConstants.EVENTS_PROVIDER);
        ck.p.j(jc2, "stateMachine");
        this.f25388b = c3232ue;
        this.f25389c = jc2;
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "Finalize Called");
        }
        P4.a(this.f25388b.k(), new C2807de(this, null));
        F3.a(this.f25388b.f25470h);
        ((Fd) this.f25388b.f25473k.getValue()).f22640a.a();
        ((C2857fd) this.f25388b.f25472j.getValue()).a();
        H6.a(((yo) this.f25388b.f25474l.getValue()).f25817a);
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "unTrackViews");
        }
        C3006lc c3006lc = (C3006lc) this.f25388b.f25469g.f22589g.getValue();
        C3053n9 c3053n9 = c3006lc.f24764a;
        if (c3053n9 != null) {
            c3053n9.a("MediaViewManager", "detachObserversAndPause called");
        }
        AbstractC2946j2 abstractC2946j2 = c3006lc.f24765b;
        if (abstractC2946j2 != null) {
            abstractC2946j2.b();
        }
        C3232ue c3232ue = this.f25388b;
        Sg sg2 = c3232ue.f25465c;
        this.f25389c.a(new C3332ye(sg2.f23525c, sg2.f23524b, c3232ue.f25464b, c3232ue.f25467e, c3232ue.f25466d, c3232ue.f25468f, c3232ue.f25469g, this.f25389c), this);
    }

    public final void m() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        C3232ue c3232ue = this.f25388b;
        c3232ue.f25464b.f25341c = true;
        Map mapA = AbstractC2939ik.a(((Dc) c3232ue.f25469g.f22588f.getValue()).f22517a);
        Wj wj2 = Wj.f23753a;
        Wj.b("AdImpressionSuccessful", mapA, EnumC2735ak.SDK);
        this.f25388b.f25469g.f22585c.g();
        this.f25388b.f25468f.f23238b.f23076f.a(Te.f23560a);
        AbstractC2819e1 abstractC2819e1 = this.f25388b.f25467e;
        if (abstractC2819e1.f24281e == null) {
            InterfaceC3028m9 interfaceC3028m9 = abstractC2819e1.f24278b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a(AbstractC2819e1.f24276f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = abstractC2819e1.f24278b;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a(AbstractC2819e1.f24276f, "registerImpression");
        }
        P4.a(abstractC2819e1.f24277a, new Z0(abstractC2819e1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L57;
     */
    @Override // com.inmobi.media.InterfaceC2843f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rj.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3207te.a(rj.c):java.lang.Object");
    }
}

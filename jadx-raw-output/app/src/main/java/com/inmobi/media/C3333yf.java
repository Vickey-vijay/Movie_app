package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3333yf extends En {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fn f25794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ae f25795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3151r8 f25796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3028m9 f25797g;

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C3333yf c3333yf, ContinuationImpl continuationImpl) throws Throwable {
        C3283wf c3283wf;
        InterfaceC3028m9 interfaceC3028m9;
        c3333yf.getClass();
        if (continuationImpl instanceof C3283wf) {
            c3283wf = (C3283wf) continuationImpl;
            int i10 = c3283wf.f25645c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3283wf.f25645c = i10 - Integer.MIN_VALUE;
            } else {
                c3283wf = new C3283wf(c3333yf, continuationImpl);
            }
        } else {
            c3283wf = new C3283wf(c3333yf, continuationImpl);
        }
        Object objG = c3283wf.f25643a;
        Object objF = sj.a.f();
        int i11 = c3283wf.f25645c;
        mj.r rVar = null;
        if (i11 == 0) {
            kotlin.c.b(objG);
            C3109pf c3109pf = C3109pf.f25078a;
            c3283wf.f25645c = 1;
            Context context = Ji.f22951a;
            objG = context == null ? "" : nk.h.g(nk.w0.b(), new C3059nf(context, null), c3283wf);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objG);
        }
        String str = (String) objG;
        C3151r8 c3151r8 = c3333yf.f25796f;
        if (c3151r8 == null) {
            interfaceC3028m9 = c3333yf.f25797g;
            if (interfaceC3028m9 != null) {
                ck.p.i("yf", "TAG");
                ((C3053n9) interfaceC3028m9).a("yf", "OmidInfo is null, cannot track ad");
                mj.r rVar2 = mj.r.f64562a;
            }
        } else {
            Ae ae2 = c3333yf.f25795e;
            if (ae2 != null) {
                ae2.a(str, c3151r8.f25248a, c3151r8.f25249b, c3151r8.f25251d, c3151r8.f25250c, c3151r8.f25252e);
                rVar = mj.r.f64562a;
            }
            if (rVar == null) {
                interfaceC3028m9 = c3333yf.f25797g;
                if (interfaceC3028m9 != null) {
                    ck.p.i("yf", "TAG");
                    ((C3053n9) interfaceC3028m9).a("yf", "OmidInfo is null, cannot track ad");
                    mj.r rVar3 = mj.r.f64562a;
                }
            }
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3333yf(Context context, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Fn fn2, nk.l0 l0Var, Ae ae2, C3151r8 c3151r8, InterfaceC3028m9 interfaceC3028m9) {
        super(gestureDetectorOnGestureListenerC2785ci);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "adContainer");
        ck.p.j(fn2, "mViewableAd");
        ck.p.j(l0Var, "hybridScope");
        this.f25794d = fn2;
        this.f25795e = ae2;
        this.f25796f = c3151r8;
        this.f25797g = interfaceC3028m9;
        nk.l0 l0VarA = P4.a(l0Var);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        if (interfaceC3028m9 != null) {
            ck.p.i("yf", "TAG");
            ((C3053n9) interfaceC3028m9).b("yf", "initializeOMSDK called");
        }
        int i10 = AbstractC2984kf.f24677a;
        Context applicationContext = context.getApplicationContext();
        ck.p.i(applicationContext, "getApplicationContext(...)");
        AbstractC2984kf.a(applicationContext);
        nk.j.d(l0VarA, null, null, new C3308xf(this, null), 3, null);
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f25794d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3028m9 interfaceC3028m9 = this.f25797g;
        if (interfaceC3028m9 != null) {
            ck.p.i("yf", "TAG");
            ((C3053n9) interfaceC3028m9).c("yf", "inflateView called");
        }
        return this.f25794d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        InterfaceC3028m9 interfaceC3028m9 = this.f25797g;
        if (interfaceC3028m9 != null) {
            ck.p.i("yf", "TAG");
            ((C3053n9) interfaceC3028m9).a("yf", "stopTrackingForImpression");
        }
        this.f25794d.d();
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        ck.p.j(view, "childView");
        ck.p.j(friendlyObstructionPurpose, "obstructionCode");
        Ae ae2 = this.f25795e;
        if (ae2 != null) {
            ck.p.j(view, "childView");
            ck.p.j(friendlyObstructionPurpose, "friendlyObstruction");
            if (ae2.f24279c == null) {
                InterfaceC3028m9 interfaceC3028m9 = ae2.f24278b;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).a(AbstractC2819e1.f24276f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            InterfaceC3028m9 interfaceC3028m10 = ae2.f24278b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a(AbstractC2819e1.f24276f, "addObstruction");
            }
            P4.a(ae2.f24277a, new X0(ae2, view, friendlyObstructionPurpose, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        ck.p.j(view, "childView");
        Ae ae2 = this.f25795e;
        if (ae2 != null) {
            ck.p.j(view, "childView");
            if (ae2.f24279c == null) {
                return;
            }
            P4.a(ae2.f24277a, new C2716a1(ae2, view, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25797g;
        if (interfaceC3028m9 != null) {
            ck.p.i("yf", "TAG");
            ((C3053n9) interfaceC3028m9).a("yf", "startTrackingForImpression");
        }
        this.f25794d.a(map);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f25794d.a(context, b10);
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f25797g;
        if (interfaceC3028m9 != null) {
            ck.p.i("yf", "TAG");
            ((C3053n9) interfaceC3028m9).c("yf", "destroy");
        }
        WeakReference weakReference = this.f22688b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f25795e = null;
        this.f25794d.a();
    }
}

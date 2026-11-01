package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Dd extends AbstractC3317y implements InterfaceC2786cj, InterfaceC2843f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ec f22519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jc f22520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2819e1 f22521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nk.l0 f22522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3267w f22523f;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        nk.j.d(this.f22522e, null, null, new C3156rd(this, null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dd(Ec ec2, Jc jc2) {
        NativeMedia media;
        super(ec2.f22583a);
        ck.p.j(ec2, "nativeAdUnitComponent");
        ck.p.j(jc2, "stateMachine");
        this.f22519b = ec2;
        this.f22520c = jc2;
        ck.p.j(ec2, "<this>");
        JsonAssetObject assetsObject = ec2.f22584b.getAssetsObject();
        nk.l0 l0Var = ec2.f22583a.f25676a.f24941e;
        this.f22521d = ck.p.e((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video") ? new Ae(l0Var, ec2.f22583a.f25676a.f24939c) : new Cc(l0Var, ec2.f22583a.f25676a.f24939c);
        this.f22522e = P4.a(k());
        C3292x c3292x = ec2.f22583a;
        JsonAssetObject assetsObject2 = ec2.f22584b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        ck.p.j(c3292x, "adComponent");
        this.f22523f = new C3267w(c3292x.f25676a.f24938b, adChoice, c3292x.f25677b.f22692a.f25028b.getNative().getAdChoiceConfig(), c3292x.f25676a.f24939c);
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
        F3.a(this.f22522e);
    }

    @Override // com.inmobi.media.InterfaceC2843f
    public final Object a(rj.c cVar) throws Throwable {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeLoadingState", "onDestroy");
        }
        Object objA = this.f22520c.a(new Vc(), this, (ContinuationImpl) cVar);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nk.p0 p0Var, ContinuationImpl continuationImpl) throws Throwable {
        Bd bd2;
        if (continuationImpl instanceof Bd) {
            bd2 = (Bd) continuationImpl;
            int i10 = bd2.f22417c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bd2.f22417c = i10 - Integer.MIN_VALUE;
            } else {
                bd2 = new Bd(this, continuationImpl);
            }
        } else {
            bd2 = new Bd(this, continuationImpl);
        }
        Object objY = bd2.f22415a;
        Object objF = sj.a.f();
        int i11 = bd2.f22417c;
        try {
            if (i11 == 0) {
                kotlin.c.b(objY);
                bd2.f22417c = 1;
                objY = p0Var.y(bd2);
                if (objY == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objY);
            }
            View view = (View) objY;
            InterfaceC3028m9 interfaceC3028m9L = l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("NativeLoadingState", "waitForAdChoiceView - ad choice view inflated successfully");
            }
            return view;
        } catch (Exception e10) {
            C3053n9 c3053n9 = this.f22519b.f22583a.f25676a.f24939c;
            if (c3053n9 == null) {
                return null;
            }
            c3053n9.b("NativeLoadingState", "AdChoiceView inflation failed: " + e10);
            return null;
        }
    }

    public final void a(MediaView mediaView, View view, Nc nc2) {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.f22520c.a(new C3132qd(mediaView, view, this.f22521d, nc2, this.f22519b, this.f22520c), this);
    }

    public final void a(short s10) {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeLoadingState", "transitionToFailedState - errorCode: " + ((int) s10));
        }
        this.f22520c.a(new Xc(s10, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f22519b, this.f22520c), this);
    }
}

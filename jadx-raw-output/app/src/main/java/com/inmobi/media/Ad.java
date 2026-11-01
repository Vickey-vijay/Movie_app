package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Ad extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Nc f22361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dd f22364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(Dd dd2, rj.c cVar) {
        super(2, cVar);
        this.f22364d = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Ad ad2 = new Ad(this.f22364d, cVar);
        ad2.f22363c = obj;
        return ad2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Ad ad2 = new Ad(this.f22364d, (rj.c) obj2);
        ad2.f22363c = (nk.l0) obj;
        return ad2.invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:55:0x019c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01aa  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00db, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String type;
        AbstractC3274w6 bk2;
        nk.p0 p0VarB;
        NativeMedia media;
        View view;
        C6 c10;
        InterfaceC3028m9 interfaceC3028m9L;
        Nc nc2;
        Object objG;
        Nc nc3;
        InterfaceC3028m9 interfaceC3028m9L2;
        InterfaceC3028m9 interfaceC3028m9L3;
        Object objF = sj.a.f();
        int i10 = this.f22362b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        nc3 = this.f22361a;
                        view = (View) this.f22363c;
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    view = (View) this.f22363c;
                    kotlin.c.b(obj);
                    c10 = (C6) obj;
                    if (c10 instanceof C3349z6) {
                        interfaceC3028m9L3 = this.f22364d.l();
                        if (interfaceC3028m9L3 != null) {
                            ((C3053n9) interfaceC3028m9L3).a("NativeLoadingState", "Experience Result Failure - errorCode: " + ((int) ((C3349z6) c10).f25829a));
                        }
                        this.f22364d.a(((C3349z6) c10).f25829a);
                    } else if (c10 instanceof A6) {
                        interfaceC3028m9L2 = this.f22364d.l();
                        if (interfaceC3028m9L2 != null) {
                            ((C3053n9) interfaceC3028m9L2).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                        }
                        Dd dd2 = this.f22364d;
                        A6 a10 = (A6) c10;
                        C2990kl c2990kl = a10.f22346b;
                        C2767c0 c2767c0 = dd2.f25754a.f25676a.f24940d;
                        Ec ec2 = dd2.f22519b;
                        ck.p.j(ec2, "<this>");
                        this.f22364d.a(a10.f22345a, view, new Nc(c2990kl, c2767c0, new C3286wi(ec2.f22583a.f25677b.f22698g)));
                    } else {
                        if (c10 instanceof B6) {
                            interfaceC3028m9L = this.f22364d.l();
                            if (interfaceC3028m9L != null) {
                                ((C3053n9) interfaceC3028m9L).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                            }
                            Dd dd3 = this.f22364d;
                            C2990kl c2990kl2 = ((B6) c10).f22406a;
                            C2767c0 c2767c1 = dd3.f25754a.f25676a.f24940d;
                            Ec ec3 = dd3.f22519b;
                            ck.p.j(ec3, "<this>");
                            nc2 = new Nc(c2990kl2, c2767c1, new C3286wi(ec3.f22583a.f25677b.f22698g));
                            C3006lc c3006lc = (C3006lc) this.f22364d.f22519b.f22589g.getValue();
                            this.f22363c = view;
                            this.f22361a = nc2;
                            this.f22362b = 3;
                            c3006lc.getClass();
                            objG = nk.h.g(nk.w0.c(), new C2956jc(c3006lc, null), this);
                            if (objG != sj.a.f()) {
                                objG = mj.r.f64562a;
                            }
                            if (objG != objF) {
                                nc3 = nc2;
                            }
                            return objF;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return mj.r.f64562a;
                }
            } else {
                p0VarB = (nk.p0) this.f22363c;
                kotlin.c.b(obj);
            }
            this.f22364d.a(null, view, nc3);
            return mj.r.f64562a;
        }
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f22363c;
        InterfaceC3028m9 interfaceC3028m9L4 = this.f22364d.l();
        if (interfaceC3028m9L4 != null) {
            ((C3053n9) interfaceC3028m9L4).a("NativeLoadingState", "loadMediaViews - building experience loader");
        }
        Dd dd4 = this.f22364d;
        Ec ec4 = dd4.f22519b;
        AbstractC2819e1 abstractC2819e1 = dd4.f22521d;
        ck.p.j(ec4, "nativeAdUnitComponent");
        ck.p.j(abstractC2819e1, "adSessionManager");
        JsonAssetObject assetsObject = ec4.f22584b.getAssetsObject();
        if (assetsObject != null && (media = assetsObject.getMedia()) != null) {
            type = media.getType();
        } else {
            type = null;
        }
        if (ck.p.e(type, "static")) {
            bk2 = new C3113pj(ec4, abstractC2819e1);
        } else if (ck.p.e(type, "video")) {
            bk2 = new Wl(ec4, abstractC2819e1);
        } else {
            bk2 = new Bk(ec4, abstractC2819e1);
        }
        p0VarB = nk.j.b(l0Var, null, null, new C3356zd(bk2, null), 3, null);
        nk.p0 p0VarB2 = nk.j.b(l0Var, null, null, new C3331yd(this.f22364d, null), 3, null);
        Dd dd5 = this.f22364d;
        this.f22363c = p0VarB;
        this.f22362b = 1;
        obj = dd5.a(p0VarB2, this);
        if (obj != objF) {
        }
        return objF;
        View view2 = (View) obj;
        this.f22363c = view2;
        this.f22362b = 2;
        Object objY = p0VarB.y(this);
        if (objY != objF) {
            view = view2;
            obj = objY;
            c10 = (C6) obj;
            if (c10 instanceof C3349z6) {
                interfaceC3028m9L3 = this.f22364d.l();
                if (interfaceC3028m9L3 != null) {
                    ((C3053n9) interfaceC3028m9L3).a("NativeLoadingState", "Experience Result Failure - errorCode: " + ((int) ((C3349z6) c10).f25829a));
                }
                this.f22364d.a(((C3349z6) c10).f25829a);
            } else if (c10 instanceof A6) {
                interfaceC3028m9L2 = this.f22364d.l();
                if (interfaceC3028m9L2 != null) {
                    ((C3053n9) interfaceC3028m9L2).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                }
                Dd dd6 = this.f22364d;
                A6 a11 = (A6) c10;
                C2990kl c2990kl3 = a11.f22346b;
                C2767c0 c2767c2 = dd6.f25754a.f25676a.f24940d;
                Ec ec5 = dd6.f22519b;
                ck.p.j(ec5, "<this>");
                this.f22364d.a(a11.f22345a, view, new Nc(c2990kl3, c2767c2, new C3286wi(ec5.f22583a.f25677b.f22698g)));
            } else if (c10 instanceof B6) {
                interfaceC3028m9L = this.f22364d.l();
                if (interfaceC3028m9L != null) {
                    ((C3053n9) interfaceC3028m9L).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                }
                Dd dd7 = this.f22364d;
                C2990kl c2990kl4 = ((B6) c10).f22406a;
                C2767c0 c2767c3 = dd7.f25754a.f25676a.f24940d;
                Ec ec6 = dd7.f22519b;
                ck.p.j(ec6, "<this>");
                nc2 = new Nc(c2990kl4, c2767c3, new C3286wi(ec6.f22583a.f25677b.f22698g));
                C3006lc c3006lc2 = (C3006lc) this.f22364d.f22519b.f22589g.getValue();
                this.f22363c = view;
                this.f22361a = nc2;
                this.f22362b = 3;
                c3006lc2.getClass();
                objG = nk.h.g(nk.w0.c(), new C2956jc(c3006lc2, null), this);
                if (objG != sj.a.f()) {
                    objG = mj.r.f64562a;
                }
                if (objG != objF) {
                    nc3 = nc2;
                    this.f22364d.a(null, view, nc3);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return mj.r.f64562a;
        }
        return objF;
    }
}

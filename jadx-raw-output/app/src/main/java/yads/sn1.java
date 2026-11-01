package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sn1 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao1 f82704c;

    public abstract void a(CustomizableMediaView customizableMediaView);

    public abstract void a(on1 on1Var);

    public abstract rn1 d();

    @Override // yads.hk3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        ao1 ao1Var = this.f82704c;
        rn1 rn1VarD = d();
        if (ao1Var.f75583c) {
            if (ao1Var.f75581a.f76559a == e00.f76862g) {
                zn1 zn1Var = new zn1(ao1Var, customizableMediaView, rn1VarD);
                wl3 wl3Var = kl3.f79470a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new jl3(customizableMediaView, zn1Var));
            }
            ao1Var.f75583c = false;
        }
    }

    public sn1(CustomizableMediaView customizableMediaView, ao1 ao1Var) {
        super(customizableMediaView);
        this.f82704c = ao1Var;
    }
}

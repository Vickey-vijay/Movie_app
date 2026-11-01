package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes8.dex */
public final class fv2 extends sn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik3 f77507d;

    @Override // yads.hk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f77507d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.sn1
    public final void a(on1 on1Var) {
    }

    @Override // yads.sn1
    public final rn1 d() {
        return rn1.f82341c;
    }

    public fv2(CustomizableMediaView customizableMediaView, ao1 ao1Var, ik3 ik3Var) {
        super(customizableMediaView, ao1Var);
        this.f77507d = ik3Var;
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        on1 on1Var = (on1) obj;
        this.f77507d.a(oiVar, kk3Var, on1Var != null ? on1Var.f81110a : null);
    }

    @Override // yads.sn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f77507d.a();
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        oj1 oj1Var = ((on1) obj).f81110a;
        if (oj1Var != null) {
            return this.f77507d.a(oj1Var);
        }
        return false;
    }

    @Override // yads.sn1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        super.b(customizableMediaView, on1Var);
        oj1 oj1Var = on1Var.f81110a;
        if (oj1Var == null) {
            return;
        }
        this.f77507d.b(oj1Var);
    }
}

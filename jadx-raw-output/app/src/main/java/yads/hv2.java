package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes2.dex */
public final class hv2 extends sn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik3 f78400d;

    @Override // yads.hk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f78400d.a();
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
        return rn1.f82342d;
    }

    public hv2(CustomizableMediaView customizableMediaView, ao1 ao1Var, ik3 ik3Var) {
        super(customizableMediaView, ao1Var);
        this.f78400d = ik3Var;
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        on1 on1Var = (on1) obj;
        this.f78400d.a(oiVar, kk3Var, on1Var != null ? on1Var.f81111b : null);
    }

    @Override // yads.hk3
    public final void a() {
        this.f78400d.f78689a.a();
    }

    @Override // yads.sn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f78400d.a();
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        sd3 sd3Var = ((on1) obj).f81111b;
        if (sd3Var != null) {
            return this.f78400d.a(sd3Var);
        }
        return false;
    }

    @Override // yads.sn1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        super.b(customizableMediaView, on1Var);
        sd3 sd3Var = on1Var.f81111b;
        if (sd3Var == null) {
            return;
        }
        this.f78400d.b(sd3Var);
    }
}

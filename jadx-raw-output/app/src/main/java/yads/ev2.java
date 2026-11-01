package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ev2 extends sn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik3 f77210d;

    @Override // yads.hk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f77210d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.sn1
    public final rn1 d() {
        return rn1.f82344f;
    }

    public ev2(CustomizableMediaView customizableMediaView, ao1 ao1Var, ik3 ik3Var) {
        super(customizableMediaView, ao1Var);
        this.f77210d = ik3Var;
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        on1 on1Var = (on1) obj;
        this.f77210d.a(oiVar, kk3Var, a(on1Var != null ? on1Var.f81112c : null));
    }

    public static u41 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (u41) list.get(0);
    }

    @Override // yads.sn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f77210d.a();
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        u41 u41VarA = a(((on1) obj).f81112c);
        if (u41VarA != null) {
            return this.f77210d.a(u41VarA);
        }
        return false;
    }

    @Override // yads.sn1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        super.b(customizableMediaView, on1Var);
        u41 u41VarA = a(on1Var.f81112c);
        if (u41VarA == null) {
            return;
        }
        this.f77210d.b(u41VarA);
    }

    @Override // yads.sn1
    public final void a(on1 on1Var) {
        u41 u41VarA = a(on1Var.f81112c);
        if (u41VarA == null) {
            return;
        }
        this.f77210d.b(u41VarA);
    }
}

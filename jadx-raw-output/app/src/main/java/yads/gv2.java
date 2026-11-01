package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gv2 extends sn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik3 f77952d;

    @Override // yads.hk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f77952d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.sn1
    public final rn1 d() {
        return rn1.f82343e;
    }

    public gv2(CustomizableMediaView customizableMediaView, ao1 ao1Var, ik3 ik3Var) {
        super(customizableMediaView, ao1Var);
        this.f77952d = ik3Var;
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        on1 on1Var = (on1) obj;
        this.f77952d.a(oiVar, kk3Var, on1Var != null ? on1Var.f81112c : null);
    }

    @Override // yads.sn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f77952d.a();
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        List list = ((on1) obj).f81112c;
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return this.f77952d.a(list);
    }

    @Override // yads.sn1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        super.b(customizableMediaView, on1Var);
        List list = on1Var.f81112c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f77952d.b(list);
    }

    @Override // yads.sn1
    public final void a(on1 on1Var) {
        List list = on1Var.f81112c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f77952d.b(list);
    }
}

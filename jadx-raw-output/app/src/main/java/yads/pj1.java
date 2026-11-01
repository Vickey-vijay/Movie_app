package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes11.dex */
public final class pj1 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz1 f81429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj1 f81430b;

    public /* synthetic */ pj1(y00 y00Var) {
        this(new bz1(), new qj1(y00Var));
    }

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f81429a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float fA = this.f81430b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new ok2(fA.floatValue(), new hj1()));
    }

    public pj1(bz1 bz1Var, qj1 qj1Var) {
        this.f81429a = bz1Var;
        this.f81430b = qj1Var;
    }
}

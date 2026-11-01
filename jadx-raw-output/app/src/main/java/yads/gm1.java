package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes11.dex */
public final class gm1 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz1 f77857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj1 f77858b;

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f77857a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float fA = this.f77858b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new oy(new ok2(Math.min(Math.max(fA.floatValue(), 1.0f), 1.7777778f), new hj1()), new dj1(viewGroup, 0.5f, viewGroup.getContext().getApplicationContext())));
    }

    public gm1(bz1 bz1Var, qj1 qj1Var) {
        this.f77857a = bz1Var;
        this.f77858b = qj1Var;
    }
}

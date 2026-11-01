package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class dl1 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f76719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz1 f76720b;

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f76720b.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        if (extendedViewContainer != null) {
            y00 y00Var = this.f76719a;
            if (y00Var.f84769d == null && y00Var.f84766a == null) {
                extendedViewContainer.setVisibility(8);
            }
        }
    }

    public dl1(y00 y00Var, bz1 bz1Var) {
        this.f76719a = y00Var;
        this.f76720b = bz1Var;
    }
}

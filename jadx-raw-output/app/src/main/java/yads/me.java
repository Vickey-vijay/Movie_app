package yads;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes10.dex */
public final class me implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f80150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz1 f80151b;

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f80151b.getClass();
        View viewFindViewById = viewGroup.findViewById(R$id.age_divider);
        if (viewFindViewById == null || this.f80150a.f84771f != null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public me(y00 y00Var, rz1 rz1Var) {
        this.f80150a = y00Var;
        this.f80151b = rz1Var;
    }
}

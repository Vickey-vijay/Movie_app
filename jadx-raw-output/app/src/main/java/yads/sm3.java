package yads;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class sm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xx1 f82700a;

    public final void a(View view, boolean z10) {
        int i10;
        int i11 = z10 ? this.f82700a.f84737a : this.f82700a.f84738b;
        if (z10) {
            i10 = this.f82700a.f84739c;
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = this.f82700a.f84740d;
        }
        view.setBackground(ContextCompat.getDrawable(view.getContext(), i11));
        view.setContentDescription(ContextCompat.getString(view.getContext(), i10));
    }

    public sm3(xx1 xx1Var) {
        this.f82700a = xx1Var;
    }
}

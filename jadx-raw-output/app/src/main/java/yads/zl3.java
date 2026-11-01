package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zl3 implements f03 {
    @Override // yads.f03
    public final void a(View view) {
        view.setVisibility(0);
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // yads.f03
    public final void b(View view) {
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}

package yads;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class am0 implements cw {
    @Override // yads.cw
    public final void a(View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // yads.cw
    public final void b(View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}

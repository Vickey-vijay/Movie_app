package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements uc1 {
    @Override // yads.uc1
    public final void a(Context context, View view) {
        view.setVisibility(0);
        view.setMinimumHeight(kl3.a(context, 50.0f));
    }

    @Override // yads.uc1
    public final void onAttachedToWindow() {
    }

    @Override // yads.uc1
    public final void onDetachedFromWindow() {
    }
}

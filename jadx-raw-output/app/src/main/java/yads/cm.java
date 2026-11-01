package yads;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class cm implements gf {
    @Override // yads.gf
    public final void cancel() {
    }

    @Override // yads.gf
    public final void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }
}

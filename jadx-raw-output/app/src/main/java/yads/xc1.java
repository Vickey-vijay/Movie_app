package yads;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xc1 {
    public static uc1 a(View view, km kmVar) {
        if (view.isInEditMode()) {
            return new wc1();
        }
        return new vc1(kmVar);
    }
}

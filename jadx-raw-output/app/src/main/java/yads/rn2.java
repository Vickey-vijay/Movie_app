package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class rn2 {
    public static void a(e72 e72Var, un2 un2Var, Bitmap bitmap) {
        un2Var.setAlpha(0.0f);
        un2Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new qn2(un2Var, bitmap)).withEndAction(new pn2(e72Var, un2Var)).start();
    }
}

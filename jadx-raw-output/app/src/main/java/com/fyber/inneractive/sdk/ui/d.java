package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f18543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f18544b;

    public d(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f18544b = fyberAdIdentifierLocal;
        this.f18543a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f18544b;
        if (fyberAdIdentifierLocal.f18516o) {
            fyberAdIdentifierLocal.f18514m.setImageResource(R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f18544b;
            FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.f18514m, fyberAdIdentifierLocal2.f18532g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f18519r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f18514m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f18514m.setImageResource(R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.a(this.f18544b.f18514m, null);
        }
        this.f18543a.start();
        this.f18544b.f18517p = this.f18543a;
    }
}

package com.inmobi.media;

import android.transition.TransitionManager;
import android.widget.RelativeLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class M7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f23139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f23140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(rj.c cVar, N7 n10, VideoViewPosition videoViewPosition) {
        super(2, cVar);
        this.f23139a = n10;
        this.f23140b = videoViewPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new M7(cVar, this.f23139a, this.f23140b);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new M7((rj.c) obj2, this.f23139a, this.f23140b).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        TransitionManager.beginDelayedTransition(this.f23139a.f23209n);
        this.f23139a.f23200e.setVideoViewPosition(this.f23140b);
        int iB = (int) (J5.b() * this.f23140b.getWidth());
        int iB2 = (int) (J5.b() * this.f23140b.getHeight());
        G1 g10 = this.f23139a.f23209n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f23139a.f23200e.getVideoViewPosition() != null) {
            layoutParams.setMargins(this.f23140b.getX(), this.f23140b.getY(), 0, 0);
        }
        g10.setLayoutParams(layoutParams);
        if (this.f23139a.f23204i > 0 && this.f23139a.f23205j > 0) {
            N7 n10 = this.f23139a;
            G1 g11 = n10.f23209n;
            int i10 = n10.f23204i;
            int i11 = this.f23139a.f23205j;
            g11.getClass();
            if (i10 > 0 && i11 > 0) {
                g11.f22709a = i10 / i11;
                g11.requestLayout();
            }
        }
        this.f23139a.f23209n.requestLayout();
        return mj.r.f64562a;
    }
}

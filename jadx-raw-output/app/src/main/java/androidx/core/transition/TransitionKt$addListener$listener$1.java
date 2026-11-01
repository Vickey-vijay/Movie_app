package androidx.core.transition;

import android.transition.Transition;
import bk.l;
import mj.r;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    public final /* synthetic */ l<Transition, r> $onCancel;
    public final /* synthetic */ l<Transition, r> $onEnd;
    public final /* synthetic */ l<Transition, r> $onPause;
    public final /* synthetic */ l<Transition, r> $onResume;
    public final /* synthetic */ l<Transition, r> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(l<? super Transition, r> lVar, l<? super Transition, r> lVar2, l<? super Transition, r> lVar3, l<? super Transition, r> lVar4, l<? super Transition, r> lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}

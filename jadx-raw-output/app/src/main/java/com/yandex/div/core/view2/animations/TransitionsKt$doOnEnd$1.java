package com.yandex.div.core.view2.animations;

import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import bk.a;
import mj.r;

/* JADX INFO: compiled from: Transitions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TransitionsKt$doOnEnd$1 extends TransitionListenerAdapter {
    public final /* synthetic */ a<r> $action;
    public final /* synthetic */ Transition $this_doOnEnd;

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$action.invoke();
        this.$this_doOnEnd.removeListener(this);
    }
}

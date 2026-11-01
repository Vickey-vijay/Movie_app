package com.yandex.div.core.view2.animations;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Transitions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TransitionsKt {
    public static final void plusAssign(TransitionSet transitionSet, Iterable<? extends Transition> iterable) {
        Iterator<? extends Transition> it = iterable.iterator();
        while (it.hasNext()) {
            transitionSet.addTransition(it.next());
        }
    }
}

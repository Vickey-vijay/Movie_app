package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.yandex.div.internal.widget.TransientView;

/* JADX INFO: compiled from: OutlineAwareVisibility.kt */
/* JADX INFO: loaded from: classes8.dex */
public class OutlineAwareVisibility extends Visibility {
    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i10, final TransitionValues transitionValues2, int i11) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        final TransientView transientView = view instanceof TransientView ? (TransientView) view : null;
        if (transientView != null) {
            transientView.transitionStarted(transitionValues2.view);
        }
        addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onAppear$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.transitionFinished(transitionValues2.view);
                }
                this.removeListener(this);
            }
        });
        return super.onAppear(viewGroup, transitionValues, i10, transitionValues2, i11);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, final TransitionValues transitionValues, int i10, TransitionValues transitionValues2, int i11) {
        View view = transitionValues != null ? transitionValues.view : null;
        final TransientView transientView = view instanceof TransientView ? (TransientView) view : null;
        if (transientView != null) {
            transientView.transitionStarted(transitionValues.view);
        }
        addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onDisappear$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.transitionFinished(transitionValues.view);
                }
                this.removeListener(this);
            }
        });
        return super.onDisappear(viewGroup, transitionValues, i10, transitionValues2, i11);
    }
}

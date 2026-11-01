package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;

/* JADX INFO: compiled from: SceneRootWatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SceneRootWatcher {
    public static final SceneRootWatcher INSTANCE = new SceneRootWatcher();

    /* JADX INFO: compiled from: SceneRootWatcher.kt */
    public static final class OnDetachListener implements View.OnAttachStateChangeListener {
        private final ViewGroup sceneRoot;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.sceneRoot.removeOnAttachStateChangeListener(this);
            TransitionManager.endTransitions(this.sceneRoot);
        }

        public OnDetachListener(ViewGroup viewGroup) {
            this.sceneRoot = viewGroup;
        }
    }

    private SceneRootWatcher() {
    }

    public final void watchFor(Scene scene, Transition transition) {
        watchFor(scene.getSceneRoot(), transition);
    }

    public final void watchFor(final ViewGroup viewGroup, final Transition transition) {
        final OnDetachListener onDetachListener = new OnDetachListener(viewGroup);
        viewGroup.addOnAttachStateChangeListener(onDetachListener);
        transition.addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.SceneRootWatcher$watchFor$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                viewGroup.removeOnAttachStateChangeListener(onDetachListener);
                transition.removeListener(this);
            }
        });
    }
}

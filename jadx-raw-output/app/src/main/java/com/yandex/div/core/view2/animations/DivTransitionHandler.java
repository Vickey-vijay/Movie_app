package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import ck.i;
import ck.p;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: DivTransitionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTransitionHandler {
    private final Div2View divView;
    private boolean posted;
    private List<TransitionData> pendingTransitions = new ArrayList();
    private List<TransitionData> activeTransitions = new ArrayList();

    /* JADX INFO: compiled from: DivTransitionHandler.kt */
    public static abstract class ChangeType {

        /* JADX INFO: compiled from: DivTransitionHandler.kt */
        public static final class Visibility extends ChangeType {

            /* JADX INFO: renamed from: new, reason: not valid java name */
            private final int f3262new;

            public Visibility(int i10) {
                super(null);
                this.f3262new = i10;
            }

            public void apply(View view) {
                view.setVisibility(this.f3262new);
            }

            public final int getNew() {
                return this.f3262new;
            }
        }

        private ChangeType() {
        }

        public /* synthetic */ ChangeType(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTransitionHandler.kt */
    public static final class TransitionData {
        private final List<ChangeType.Visibility> changes;
        private final List<ChangeType.Visibility> savedChanges;
        private final View target;
        private final Transition transition;

        public final List<ChangeType.Visibility> getChanges() {
            return this.changes;
        }

        public final List<ChangeType.Visibility> getSavedChanges() {
            return this.savedChanges;
        }

        public final View getTarget() {
            return this.target;
        }

        public final Transition getTransition() {
            return this.transition;
        }

        public TransitionData(Transition transition, View view, List<ChangeType.Visibility> list, List<ChangeType.Visibility> list2) {
            this.transition = transition;
            this.target = view;
            this.changes = list;
            this.savedChanges = list2;
        }
    }

    public final void runTransitions(ViewGroup viewGroup, boolean z10) {
        this.posted = false;
        beginDelayedTransitions(viewGroup, z10);
    }

    public static /* synthetic */ void beginDelayedTransitions$default(DivTransitionHandler divTransitionHandler, ViewGroup viewGroup, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            viewGroup = divTransitionHandler.divView;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        divTransitionHandler.beginDelayedTransitions(viewGroup, z10);
    }

    private final List<ChangeType.Visibility> getChange(List<TransitionData> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (TransitionData transitionData : list) {
            ChangeType.Visibility visibility = p.e(transitionData.getTarget(), view) ? (ChangeType.Visibility) b0.s0(transitionData.getSavedChanges()) : null;
            if (visibility != null) {
                arrayList.add(visibility);
            }
        }
        return arrayList;
    }

    private final void postTransitions() {
        if (this.posted) {
            return;
        }
        this.posted = true;
        this.divView.post(new Runnable() { // from class: xd.a
            @Override // java.lang.Runnable
            public final void run() {
                DivTransitionHandler.postTransitions$lambda$0(this.f74431b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTransitions$lambda$0(DivTransitionHandler divTransitionHandler) {
        if (divTransitionHandler.posted) {
            beginDelayedTransitions$default(divTransitionHandler, null, false, 3, null);
        }
        divTransitionHandler.posted = false;
    }

    public final ChangeType.Visibility getLastChange(View view) {
        ChangeType.Visibility visibility = (ChangeType.Visibility) b0.s0(getChange(this.pendingTransitions, view));
        if (visibility != null) {
            return visibility;
        }
        ChangeType.Visibility visibility2 = (ChangeType.Visibility) b0.s0(getChange(this.activeTransitions, view));
        if (visibility2 != null) {
            return visibility2;
        }
        return null;
    }

    public final void putTransition(Transition transition, View view, ChangeType.Visibility visibility) {
        this.pendingTransitions.add(new TransitionData(transition, view, s.q(visibility), new ArrayList()));
        postTransitions();
    }

    public DivTransitionHandler(Div2View div2View) {
        this.divView = div2View;
    }

    private final void beginDelayedTransitions(ViewGroup viewGroup, boolean z10) {
        if (!viewGroup.isAttachedToWindow()) {
            this.pendingTransitions.clear();
            return;
        }
        if (z10) {
            TransitionManager.endTransitions(viewGroup);
        }
        final TransitionSet transitionSet = new TransitionSet();
        Iterator<T> it = this.pendingTransitions.iterator();
        while (it.hasNext()) {
            transitionSet.addTransition(((TransitionData) it.next()).getTransition());
        }
        transitionSet.addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$beginDelayedTransitions$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                this.activeTransitions.clear();
                transitionSet.removeListener(this);
            }
        });
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
        for (TransitionData transitionData : this.pendingTransitions) {
            for (ChangeType.Visibility visibility : transitionData.getChanges()) {
                visibility.apply(transitionData.getTarget());
                transitionData.getSavedChanges().add(visibility);
            }
        }
        this.activeTransitions.clear();
        this.activeTransitions.addAll(this.pendingTransitions);
        this.pendingTransitions.clear();
    }
}

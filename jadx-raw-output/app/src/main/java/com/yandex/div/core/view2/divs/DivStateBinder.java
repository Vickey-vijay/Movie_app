package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationSet;
import androidx.core.view.ViewGroupKt;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.util.DivTreeWalk;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTransitionTrigger;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import mj.r;
import nj.b0;
import nj.s;
import oe.e2;

/* JADX INFO: compiled from: DivStateBinder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStateBinder extends DivViewBinder<Div.n, DivState, DivStateLayout> {
    private static final Companion Companion = new Companion(null);
    private final DivBaseBinder baseBinder;
    private final Div2Logger div2Logger;
    private final DivActionBeaconSender divActionBeaconSender;
    private final DivActionBinder divActionBinder;
    private final DivPatchCache divPatchCache;
    private final DivPatchManager divPatchManager;
    private final DivStateCache divStateCache;
    private final DivVisibilityActionTracker divVisibilityActionTracker;
    private final ErrorCollectors errorCollectors;
    private final DivRuntimeVisitor runtimeVisitor;
    private final TemporaryDivStateCache temporaryStateCache;
    private final TwoWayStringVariableBinder variableBinder;
    private final jj.a<DivBinder> viewBinder;
    private final DivViewCreator viewCreator;

    /* JADX INFO: compiled from: DivStateBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:96:0x0205  */
    private final void bindState(DivStateLayout divStateLayout, BindingContext bindingContext, DivState divState, DivState.State state, DivState divState2, DivState.State state2, Div div, DivStatePath divStatePath, ExpressionResolver expressionResolver, String str) {
        DivStatePath divStatePath2;
        Div div2;
        View view;
        ExpressionResolver expressionResolver2;
        Div2View div2View;
        ExpressionResolver expressionResolver3;
        DivStatePath divStatePath3;
        View view2;
        boolean z10;
        View incomingView;
        Div div3;
        DivStatePath divStatePath4;
        DivState divState3;
        final Div div4;
        Div2View div2View2;
        e2 e2VarB;
        String id2;
        View view3;
        ReusableTokenList currentRebindReusableList$div_release;
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver4 = bindingContext.getExpressionResolver();
        Div div5 = state.f49049c;
        e2 e2VarB2 = div5 != null ? div5.b() : null;
        DivStatePath divStatePathAppend$div_release = divStatePath.append$div_release(str, state, state.f49050d);
        View childAt = divStateLayout.getChildCount() != 0 ? divStateLayout.getChildAt(0) : null;
        View uniqueViewForDiv = (div5 == null || (currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release()) == null) ? null : currentRebindReusableList$div_release.getUniqueViewForDiv(div5);
        if (p.e(divStateLayout.getStateId(), state.f49050d)) {
            divStatePath2 = divStatePathAppend$div_release;
            div2 = div5;
            view = childAt;
            if (e2VarB2 != null) {
                if (view == null || expressionResolver == null) {
                    expressionResolver2 = expressionResolver4;
                    div2View = divView;
                    expressionResolver3 = expressionResolver;
                    divStatePath3 = divStatePath;
                } else {
                    expressionResolver2 = expressionResolver4;
                    div2View = divView;
                    expressionResolver3 = expressionResolver;
                    divStatePath3 = divStatePath;
                    z10 = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, div, div2, expressionResolver, expressionResolver2, null, 16, null);
                    if (z10) {
                        incomingView = view;
                    } else {
                        incomingView = getIncomingView(uniqueViewForDiv, div2, expressionResolver2);
                    }
                    if (!z10) {
                        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                        divStateLayout.addView(incomingView);
                    }
                    if (incomingView != null) {
                        this.viewBinder.get().bind(bindingContext, incomingView, div2, divStatePath2);
                    }
                    view2 = incomingView;
                }
                if (z10) {
                    incomingView = view;
                } else {
                    incomingView = getIncomingView(uniqueViewForDiv, div2, expressionResolver2);
                }
                if (!z10) {
                    ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                    divStateLayout.addView(incomingView);
                }
                if (incomingView != null) {
                    this.viewBinder.get().bind(bindingContext, incomingView, div2, divStatePath2);
                }
                view2 = incomingView;
            } else {
                expressionResolver2 = expressionResolver4;
                div2View = divView;
                expressionResolver3 = expressionResolver;
                divStatePath3 = divStatePath;
                ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                view2 = null;
            }
        } else {
            View view4 = childAt;
            View incomingView2 = div5 != null ? getIncomingView(uniqueViewForDiv, div5, expressionResolver4) : null;
            divStatePath2 = divStatePathAppend$div_release;
            div2 = div5;
            Transition transitionReplaceViewsAnimated = replaceViewsAnimated(bindingContext, divState, state, state2, incomingView2, view4);
            if (transitionReplaceViewsAnimated != null) {
                TransitionManager.endTransitions(divStateLayout);
                SceneRootWatcher.INSTANCE.watchFor(divStateLayout, transitionReplaceViewsAnimated);
                TransitionManager.beginDelayedTransition(divStateLayout, transitionReplaceViewsAnimated);
            }
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, divView);
            if (incomingView2 != null) {
                divStateLayout.addView(incomingView2);
                if (div2 != null) {
                    this.viewBinder.get().bind(bindingContext, incomingView2, div2, divStatePath2);
                }
            }
            view = view4;
            if (view != null) {
                divView.getDivTransitionHandler$div_release().runTransitions(divStateLayout, false);
            }
            view2 = incomingView2;
            expressionResolver2 = expressionResolver4;
            div2View = divView;
            expressionResolver3 = expressionResolver;
            divStatePath3 = divStatePath;
        }
        if (view != null) {
            view.startAnimation(new AnimationSet(false));
            Div div6 = div2;
            divState3 = divState;
            if (p.e(divState2, divState3) && p.e(state, state2)) {
                divStatePath4 = divStatePath2;
                div3 = div6;
            } else {
                div2View.unbindViewFromDiv$div_release(view);
                if (div == null || expressionResolver3 == null) {
                    divStatePath4 = divStatePath2;
                    div3 = div6;
                } else {
                    divStatePath4 = divStatePath2;
                    div3 = div6;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, div2View, expressionResolver, null, div, null, null, 48, null);
                    untrackRecursively(view, div2View, expressionResolver3);
                }
            }
        } else {
            div3 = div2;
            divStatePath4 = divStatePath2;
            divState3 = divState;
        }
        if (view2 == null || e2VarB2 == null || (e2VarB2.v() == null && e2VarB2.a() == null)) {
            div4 = div3;
        } else {
            div4 = div3;
            div2View.bindViewToDiv$div_release(view2, div4);
            final View view5 = view2;
            final Div2View div2View3 = div2View;
            final ExpressionResolver expressionResolver5 = expressionResolver2;
            view5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindState$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view6.removeOnLayoutChangeListener(this);
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.this$0.divVisibilityActionTracker, div2View3, expressionResolver5, view5, div4, null, null, 48, null);
                }
            });
        }
        if (div == null || (e2VarB = div.b()) == null || (id2 = e2VarB.getId()) == null) {
            div2View2 = div2View;
        } else {
            List<View> listBuildViewsForId = this.divPatchManager.buildViewsForId(bindingContext, id2);
            if (listBuildViewsForId == null) {
                view3 = null;
            } else if (listBuildViewsForId.size() > 1) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivStateBinder", "Unable to patch state because there is more than 1 div in the patch");
                }
                view3 = null;
            } else {
                view3 = (View) b0.h0(listBuildViewsForId);
            }
            List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(div2View.getDataTag(), id2);
            Div div7 = patchDivListById != null ? (Div) b0.h0(patchDivListById) : null;
            if (view3 == null || div7 == null) {
                div2View2 = div2View;
            } else {
                div2View2 = div2View;
                ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View2);
                divStateLayout.addView(view3);
                if (DivUtilKt.getHasSightActions(div7.b())) {
                    div2View2.bindViewToDiv$div_release(view3, div7);
                }
                this.viewBinder.get().bind(bindingContext, view3, div7, divStatePath4);
            }
        }
        divStateLayout.setActiveStateDiv$div_release(div4);
        divStateLayout.setPath(divStatePath4);
        if (view != null) {
            this.runtimeVisitor.createAndAttachRuntimesToState(div2View2, divState3, divStatePath3, expressionResolver2);
        }
    }

    private final void bind(final DivStateLayout divStateLayout, final BindingContext bindingContext, DivState divState, DivState divState2, DivState.State state, DivStatePath divStatePath) {
        BaseDivViewExtensionsKt.applyDivActions(divStateLayout, bindingContext, divState.f49020b, divState.f49022d, divState.f49044z, divState.f49035q, divState.f49041w, divState.f49040v, divState.D, divState.C, divState.f49021c, divState.f49029k);
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        fixAlignment(divStateLayout, divState, divState2, expressionResolver);
        observeStateIdVariable(divStateLayout, divState, bindingContext, divStatePath);
        bk.a<r> aVar = null;
        BaseDivViewExtensionsKt.bindClipChildren(divStateLayout, divState.f49030l, divState2 != null ? divState2.f49030l : null, expressionResolver);
        final List<DivAction> list = state.f49051e;
        if (list != null) {
            aVar = new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.swipeOut(divStateLayout, bindingContext.getDivView(), expressionResolver, list);
                }
            };
        }
        divStateLayout.setSwipeOutCallback(aVar);
    }

    private final void createLayoutParams(View view) {
        view.setLayoutParams(new DivLayoutParams(-1, -2));
    }

    private final View getIncomingView(View view, Div div, ExpressionResolver expressionResolver) {
        if (view != null) {
            return view;
        }
        View viewCreate = this.viewCreator.create(div, expressionResolver);
        createLayoutParams(viewCreate);
        return viewCreate;
    }

    private final void observeStateIdVariable(final DivStateLayout divStateLayout, final DivState divState, final BindingContext bindingContext, final DivStatePath divStatePath) {
        String str = divState.H;
        if (str == null) {
            return;
        }
        divStateLayout.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$observeStateIdVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(String str2) {
                if (str2 == null || divStateLayout.getStateId() == null || p.e(str2, divStateLayout.getStateId())) {
                    return;
                }
                for (Object obj : divState.I) {
                    if (p.e(((DivState.State) obj).f49050d, str2)) {
                        bindingContext.getDivView().switchToState(divStatePath.append$div_release(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, divState, null, 1, null), (DivState.State) obj, str2), true);
                    }
                }
                obj = null;
                bindingContext.getDivView().switchToState(divStatePath.append$div_release(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, divState, null, 1, null), (DivState.State) obj, str2), true);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(l<? super String, r> lVar) {
                divStateLayout.setVariableUpdater(lVar);
            }
        }, divStatePath));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if ((r1 != null && com.yandex.div.core.util.DivUtilKt.containsStateInnerTransitions(r1, r6)) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.transition.Transition replaceViewsAnimated(com.yandex.div.core.view2.BindingContext r9, com.yandex.div2.DivState r10, com.yandex.div2.DivState.State r11, com.yandex.div2.DivState.State r12, android.view.View r13, android.view.View r14) {
        /*
            r8 = this;
            if (r14 == 0) goto L65
            com.yandex.div.core.view2.BindingContext r0 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.getBindingContext(r14)
            if (r0 == 0) goto L65
            com.yandex.div.json.expressions.ExpressionResolver r7 = r0.getExpressionResolver()
            if (r7 != 0) goto Lf
            goto L65
        Lf:
            com.yandex.div.json.expressions.ExpressionResolver r6 = r9.getExpressionResolver()
            boolean r10 = com.yandex.div.core.view2.animations.DivTransitionsKt.allowsTransitionsOnStateChange(r10, r6)
            if (r10 == 0) goto L5a
            r10 = 1
            r0 = 0
            if (r12 == 0) goto L29
            com.yandex.div2.Div r1 = r12.f49049c
            if (r1 == 0) goto L29
            boolean r1 = com.yandex.div.core.util.DivUtilKt.containsStateInnerTransitions(r1, r7)
            if (r1 != r10) goto L29
            r1 = r10
            goto L2a
        L29:
            r1 = r0
        L2a:
            if (r1 != 0) goto L3a
            com.yandex.div2.Div r1 = r11.f49049c
            if (r1 == 0) goto L37
            boolean r1 = com.yandex.div.core.util.DivUtilKt.containsStateInnerTransitions(r1, r6)
            if (r1 != r10) goto L37
            goto L38
        L37:
            r10 = r0
        L38:
            if (r10 == 0) goto L5a
        L3a:
            com.yandex.div.core.view2.Div2View r10 = r9.getDivView()
            com.yandex.div.core.dagger.Div2ViewComponent r10 = r10.getViewComponent$div_release()
            com.yandex.div.core.view2.DivTransitionBuilder r2 = r10.getTransitionBuilder()
            com.yandex.div.core.view2.Div2View r9 = r9.getDivView()
            com.yandex.div.core.dagger.Div2ViewComponent r9 = r9.getViewComponent$div_release()
            com.yandex.div.core.view2.state.DivStateTransitionHolder r3 = r9.getStateTransitionHolder()
            r1 = r8
            r4 = r11
            r5 = r12
            androidx.transition.Transition r9 = r1.setupTransitions(r2, r3, r4, r5, r6, r7)
            goto L64
        L5a:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            androidx.transition.Transition r9 = r0.setupAnimation(r1, r2, r3, r4, r5)
        L64:
            return r9
        L65:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            androidx.transition.Transition r9 = r0.setupAnimation(r1, r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinder.replaceViewsAnimated(com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivState, com.yandex.div2.DivState$State, com.yandex.div2.DivState$State, android.view.View, android.view.View):androidx.transition.Transition");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeOut(final DivStateLayout divStateLayout, final Div2View div2View, final ExpressionResolver expressionResolver, final List<DivAction> list) {
        div2View.bulkActions$div_release(new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder.swipeOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DivActionBinder divActionBinder = DivStateBinder.this.divActionBinder;
                final Div2View div2View2 = div2View;
                final ExpressionResolver expressionResolver2 = expressionResolver;
                List<DivAction> list2 = list;
                final DivStateBinder divStateBinder = DivStateBinder.this;
                final DivStateLayout divStateLayout2 = divStateLayout;
                divActionBinder.handleActions$div_release(div2View2, expressionResolver2, list2, "state_swipe_out", new l<DivAction, r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder.swipeOut.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(DivAction divAction) {
                        invoke2(divAction);
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DivAction divAction) {
                        divStateBinder.div2Logger.logSwipedAway(div2View2, expressionResolver2, divStateLayout2, divAction);
                        divStateBinder.divActionBeaconSender.sendSwipeOutActionBeacon(divAction, expressionResolver2);
                    }
                });
            }
        });
    }

    private final void untrackRecursively(View view, Div2View div2View, ExpressionResolver expressionResolver) {
        if (view instanceof ViewGroup) {
            for (View view2 : ViewGroupKt.getChildren((ViewGroup) view)) {
                Div divUnbindViewFromDiv$div_release = div2View.unbindViewFromDiv$div_release(view2);
                if (divUnbindViewFromDiv$div_release != null) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, div2View, expressionResolver, null, divUnbindViewFromDiv$div_release, null, null, 48, null);
                }
                untrackRecursively(view2, div2View, expressionResolver);
            }
        }
    }

    public void bindView(final BindingContext bindingContext, DivStateLayout divStateLayout, Div.n nVar, final DivStatePath divStatePath) {
        DivState divStateC = nVar.c();
        Div.n div = divStateLayout.getDiv();
        BindingContext bindingContext2 = divStateLayout.getBindingContext();
        ExpressionResolver expressionResolver = bindingContext2 != null ? bindingContext2.getExpressionResolver() : null;
        String id$div_release = DivPathUtils.INSTANCE.getId$div_release(divStateC, new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindView$id$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData()).logError(ParsingExceptionKt.missingValue("id", divStatePath.toString()));
            }
        });
        Pair<DivState.State, DivState.State> states = getStates(divStateC, bindingContext, divStateLayout, divStatePath, id$div_release);
        DivState.State stateComponent1 = states.component1();
        DivState.State stateComponent2 = states.component2();
        if (stateComponent1 == null || stateComponent2 == null) {
            return;
        }
        Div activeStateDiv$div_release = divStateLayout.getActiveStateDiv$div_release();
        if (div != nVar) {
            this.baseBinder.bindView(bindingContext, divStateLayout, nVar, activeStateDiv$div_release);
            bind(divStateLayout, bindingContext, divStateC, div != null ? div.c() : null, stateComponent2, divStatePath);
        }
        bindState(divStateLayout, bindingContext, divStateC, stateComponent2, div != null ? div.c() : null, stateComponent1, activeStateDiv$div_release, divStatePath, expressionResolver, id$div_release);
    }

    public DivStateBinder(DivBaseBinder divBaseBinder, DivViewCreator divViewCreator, jj.a<DivBinder> aVar, DivStateCache divStateCache, TemporaryDivStateCache temporaryDivStateCache, DivActionBinder divActionBinder, DivActionBeaconSender divActionBeaconSender, DivPatchManager divPatchManager, DivPatchCache divPatchCache, Div2Logger div2Logger, DivVisibilityActionTracker divVisibilityActionTracker, ErrorCollectors errorCollectors, TwoWayStringVariableBinder twoWayStringVariableBinder, DivRuntimeVisitor divRuntimeVisitor) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.viewBinder = aVar;
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.divActionBinder = divActionBinder;
        this.divActionBeaconSender = divActionBeaconSender;
        this.divPatchManager = divPatchManager;
        this.divPatchCache = divPatchCache;
        this.div2Logger = div2Logger;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.errorCollectors = errorCollectors;
        this.variableBinder = twoWayStringVariableBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    private final DivContentAlignmentHorizontal extractParentContentAlignmentHorizontal(View view, ExpressionResolver expressionResolver) {
        DivHolderView divHolderView;
        Div div;
        Div.b bVar;
        ViewParent parent = view.getParent();
        if (parent instanceof DivHolderView) {
            divHolderView = (DivHolderView) parent;
        } else {
            divHolderView = null;
        }
        if (divHolderView != null) {
            div = divHolderView.getDiv();
        } else {
            div = null;
        }
        if (div instanceof Div.b) {
            bVar = (Div.b) div;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        return bVar.c().f46725o.evaluate(expressionResolver);
    }

    private final DivContentAlignmentVertical extractParentContentAlignmentVertical(View view, ExpressionResolver expressionResolver) {
        DivHolderView divHolderView;
        Div div;
        Div.b bVar;
        ViewParent parent = view.getParent();
        if (parent instanceof DivHolderView) {
            divHolderView = (DivHolderView) parent;
        } else {
            divHolderView = null;
        }
        if (divHolderView != null) {
            div = divHolderView.getDiv();
        } else {
            div = null;
        }
        if (div instanceof Div.b) {
            bVar = (Div.b) div;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        return bVar.c().f46726p.evaluate(expressionResolver);
    }

    private final void fixAlignment(DivStateLayout divStateLayout, DivState divState, DivState divState2, ExpressionResolver expressionResolver) {
        Expression<DivAlignmentHorizontal> expressionG;
        DivAlignmentHorizontal alignmentHorizontal;
        DivAlignmentVertical divAlignmentVerticalEvaluate;
        Expression<DivAlignmentVertical> expressionN;
        Expression<DivAlignmentHorizontal> expressionG2 = divState.g();
        Expression<DivAlignmentVertical> expressionN2 = divState.n();
        DivAlignmentVertical alignmentVertical = null;
        if (divState2 != null) {
            expressionG = divState2.g();
        } else {
            expressionG = null;
        }
        if (p.e(expressionG2, expressionG)) {
            if (divState2 != null) {
                expressionN = divState2.n();
            } else {
                expressionN = null;
            }
            if (p.e(expressionN2, expressionN)) {
                return;
            }
        }
        if (expressionG2 == null || (alignmentHorizontal = expressionG2.evaluate(expressionResolver)) == null) {
            DivContentAlignmentHorizontal divContentAlignmentHorizontalExtractParentContentAlignmentHorizontal = extractParentContentAlignmentHorizontal(divStateLayout, expressionResolver);
            if (divContentAlignmentHorizontalExtractParentContentAlignmentHorizontal != null) {
                alignmentHorizontal = DivUtilKt.toAlignmentHorizontal(divContentAlignmentHorizontalExtractParentContentAlignmentHorizontal);
            } else {
                alignmentHorizontal = null;
            }
        }
        if (expressionN2 != null && (divAlignmentVerticalEvaluate = expressionN2.evaluate(expressionResolver)) != null) {
            alignmentVertical = divAlignmentVerticalEvaluate;
        } else {
            DivContentAlignmentVertical divContentAlignmentVerticalExtractParentContentAlignmentVertical = extractParentContentAlignmentVertical(divStateLayout, expressionResolver);
            if (divContentAlignmentVerticalExtractParentContentAlignmentVertical != null) {
                alignmentVertical = DivUtilKt.toAlignmentVertical(divContentAlignmentVerticalExtractParentContentAlignmentVertical);
            }
        }
        BaseDivViewExtensionsKt.applyAlignment(divStateLayout, alignmentHorizontal, alignmentVertical);
    }

    private final Pair<DivState.State, DivState.State> getStates(DivState divState, BindingContext bindingContext, DivStateLayout divStateLayout, DivStatePath divStatePath, String str) {
        Object next;
        String id2 = bindingContext.getDivView().getDivTag().getId();
        String str2 = divStatePath.getStatesString$div_release() + '/' + str;
        String state = this.temporaryStateCache.getState(id2, str2);
        if (state == null) {
            state = this.divStateCache.getState(id2, str2);
        }
        Object obj = null;
        if (state != null) {
            l<String, r> variableUpdater = divStateLayout.getVariableUpdater();
            if (variableUpdater != null) {
                variableUpdater.invoke(state);
            }
        } else {
            String str3 = divState.H;
            if (str3 != null) {
                state = getValueFromVariable(bindingContext, str3);
            } else {
                state = null;
            }
        }
        Iterator<T> it = divState.I.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!p.e(((DivState.State) next).f49050d, divStateLayout.getStateId()));
        DivState.State defaultState = (DivState.State) next;
        if (defaultState == null) {
            defaultState = DivUtilKt.getDefaultState(divState, bindingContext.getExpressionResolver());
        }
        for (Object obj2 : divState.I) {
            if (p.e(((DivState.State) obj2).f49050d, state)) {
                obj = obj2;
                break;
            }
        }
        DivState.State defaultState2 = (DivState.State) obj;
        if (defaultState2 == null) {
            defaultState2 = DivUtilKt.getDefaultState(divState, bindingContext.getExpressionResolver());
        }
        return new Pair<>(defaultState, defaultState2);
    }

    private final String getValueFromVariable(BindingContext bindingContext, String str) {
        Variable mutableVariable;
        Object value;
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null || (mutableVariable = variableController.getMutableVariable(str)) == null || (value = mutableVariable.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    private final Transition setupAnimation(BindingContext bindingContext, DivState.State state, DivState.State state2, View view, View view2) {
        DivAnimation divAnimation;
        List<DivAnimation> listK;
        BindingContext bindingContext2;
        List<DivAnimation> listK2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivAnimation divAnimation2 = state.f49047a;
        ExpressionResolver expressionResolver2 = null;
        if (state2 != null) {
            divAnimation = state2.f49048b;
        } else {
            divAnimation = null;
        }
        if (divAnimation2 == null && divAnimation == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (divAnimation2 != null && view != null) {
            if (divAnimation2.f46439e.evaluate(expressionResolver) != DivAnimation.Name.SET) {
                listK2 = nj.r.e(divAnimation2);
            } else {
                listK2 = divAnimation2.f46438d;
                if (listK2 == null) {
                    listK2 = s.k();
                }
            }
            for (DivAnimation divAnimation3 : listK2) {
                Transition transition = DivStateBinderKt.toTransition(divAnimation3, true, expressionResolver);
                if (transition != null) {
                    transitionSet.addTransition(transition.addTarget(view).setDuration(divAnimation3.f46435a.evaluate(expressionResolver).longValue()).setStartDelay(divAnimation3.f46441g.evaluate(expressionResolver).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation3.f46437c.evaluate(expressionResolver))));
                }
            }
        }
        if (view2 != null && (bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(view2)) != null) {
            expressionResolver2 = bindingContext2.getExpressionResolver();
        }
        if (divAnimation != null && expressionResolver2 != null) {
            if (divAnimation.f46439e.evaluate(expressionResolver2) != DivAnimation.Name.SET) {
                listK = nj.r.e(divAnimation);
            } else {
                listK = divAnimation.f46438d;
                if (listK == null) {
                    listK = s.k();
                }
            }
            for (DivAnimation divAnimation4 : listK) {
                Transition transition2 = DivStateBinderKt.toTransition(divAnimation4, false, expressionResolver2);
                if (transition2 != null) {
                    transitionSet.addTransition(transition2.addTarget(view2).setDuration(divAnimation4.f46435a.evaluate(expressionResolver2).longValue()).setStartDelay(divAnimation4.f46441g.evaluate(expressionResolver2).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation4.f46437c.evaluate(expressionResolver2))));
                }
            }
        }
        if (view2 != null) {
            view2.clearAnimation();
        }
        return transitionSet;
    }

    private final Transition setupTransitions(DivTransitionBuilder divTransitionBuilder, DivStateTransitionHolder divStateTransitionHolder, DivState.State state, DivState.State state2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        kk.i<DivItemBuilderResult> iVarZ;
        DivTreeWalk divTreeWalkWalk;
        DivTreeWalk divTreeWalkOnEnter;
        Div div;
        DivTreeWalk divTreeWalkWalk2;
        DivTreeWalk divTreeWalkOnEnter2;
        kk.i<DivItemBuilderResult> iVarZ2 = null;
        if (p.e(state, state2)) {
            return null;
        }
        if (state2 != null && (div = state2.f49049c) != null && (divTreeWalkWalk2 = DivTreeWalkKt.walk(div, expressionResolver2)) != null && (divTreeWalkOnEnter2 = divTreeWalkWalk2.onEnter(new l<Div, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$1
            @Override // bk.l
            public final Boolean invoke(Div div2) {
                return Boolean.valueOf(!(div2 instanceof Div.n));
            }
        })) != null) {
            iVarZ = SequencesKt___SequencesKt.z(divTreeWalkOnEnter2, new l<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$2
                @Override // bk.l
                public final Boolean invoke(DivItemBuilderResult divItemBuilderResult) {
                    List<DivTransitionTrigger> listM = divItemBuilderResult.getDiv().b().m();
                    return Boolean.valueOf(listM != null ? DivTransitionsKt.allowsTransitionsOnStateChange(listM) : true);
                }
            });
        } else {
            iVarZ = null;
        }
        Div div2 = state.f49049c;
        if (div2 != null && (divTreeWalkWalk = DivTreeWalkKt.walk(div2, expressionResolver)) != null && (divTreeWalkOnEnter = divTreeWalkWalk.onEnter(new l<Div, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$3
            @Override // bk.l
            public final Boolean invoke(Div div3) {
                return Boolean.valueOf(!(div3 instanceof Div.n));
            }
        })) != null) {
            iVarZ2 = SequencesKt___SequencesKt.z(divTreeWalkOnEnter, new l<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$4
                @Override // bk.l
                public final Boolean invoke(DivItemBuilderResult divItemBuilderResult) {
                    List<DivTransitionTrigger> listM = divItemBuilderResult.getDiv().b().m();
                    return Boolean.valueOf(listM != null ? DivTransitionsKt.allowsTransitionsOnStateChange(listM) : true);
                }
            });
        }
        TransitionSet transitionSetBuildTransitions = divTransitionBuilder.buildTransitions(iVarZ, iVarZ2, expressionResolver2, expressionResolver);
        divStateTransitionHolder.append(transitionSetBuildTransitions);
        return transitionSetBuildTransitions;
    }
}

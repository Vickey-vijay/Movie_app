package com.yandex.div.core.view2;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnyThread;
import androidx.core.os.HandlerCompat;
import androidx.core.view.ViewGroupKt;
import bk.l;
import bk.s;
import ck.i;
import ck.p;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SynchronizedWeakHashMap;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivSightExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivVisibilityAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import mj.h;
import mj.r;
import nj.b0;
import oe.c9;

/* JADX INFO: compiled from: DivVisibilityActionTracker.kt */
/* JADX INFO: loaded from: classes7.dex */
public class DivVisibilityActionTracker {
    private static final Companion Companion = new Companion(null);
    private boolean hasPostedUpdateVisibilityTask;
    private final ViewVisibilityCalculator viewVisibilityCalculator;
    private final DivVisibilityActionDispatcher visibilityActionDispatcher;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final DivVisibilityTokenHolder appearTrackedTokens = new DivVisibilityTokenHolder();
    private final DivVisibilityTokenHolder disappearTrackedTokens = new DivVisibilityTokenHolder();
    private final SightActionIsEnabledObserver isEnabledObserver = new SightActionIsEnabledObserver(new s<Div2View, ExpressionResolver, View, Div, c9, r>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$1
        {
            super(5);
        }

        @Override // bk.s
        public /* bridge */ /* synthetic */ r invoke(Div2View div2View, ExpressionResolver expressionResolver, View view, Div div, c9 c9Var) {
            invoke2(div2View, expressionResolver, view, div, c9Var);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Div2View div2View, ExpressionResolver expressionResolver, View view, Div div, c9 c9Var) {
            if (c9Var instanceof DivVisibilityAction) {
                this.this$0.trackVisibilityActions(div2View, expressionResolver, view, div, nj.r.e(c9Var), nj.s.k());
            } else if (c9Var instanceof DivDisappearAction) {
                this.this$0.trackVisibilityActions(div2View, expressionResolver, view, div, nj.s.k(), nj.r.e(c9Var));
            }
        }
    }, new s<Div2View, ExpressionResolver, View, Div, c9, r>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$2
        {
            super(5);
        }

        @Override // bk.s
        public /* bridge */ /* synthetic */ r invoke(Div2View div2View, ExpressionResolver expressionResolver, View view, Div div, c9 c9Var) {
            invoke2(div2View, expressionResolver, view, div, c9Var);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Div2View div2View, ExpressionResolver expressionResolver, View view, Div div, c9 c9Var) {
            if (c9Var instanceof DivVisibilityAction) {
                DivVisibilityActionTracker divVisibilityActionTracker = this.this$0;
                divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver, null, c9Var, 0, divVisibilityActionTracker.appearTrackedTokens);
            } else if (c9Var instanceof DivDisappearAction) {
                DivVisibilityActionTracker divVisibilityActionTracker2 = this.this$0;
                divVisibilityActionTracker2.shouldTrackVisibilityAction(div2View, expressionResolver, null, c9Var, 0, divVisibilityActionTracker2.disappearTrackedTokens);
            }
        }
    });
    private final WeakHashMap<View, Div> visibleActions = new WeakHashMap<>();
    private final WeakHashMap<View, Div> enqueuedVisibilityActions = new WeakHashMap<>();
    private final WeakHashMap<View, Boolean> previousVisibilityIsFull = new WeakHashMap<>();
    private final SynchronizedWeakHashMap<View, Div> divWithWaitingDisappearActions = new SynchronizedWeakHashMap<>();
    private final WeakHashMap<View, Set<DivDisappearAction>> appearedForDisappearActions = new WeakHashMap<>();
    private final Runnable updateVisibilityTask = new Runnable() { // from class: wd.u
        @Override // java.lang.Runnable
        public final void run() {
            DivVisibilityActionTracker.updateVisibilityTask$lambda$0(this.f74059b);
        }
    };

    /* JADX INFO: compiled from: DivVisibilityActionTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private void updateVisibility(View view, Div div, int i10) {
        if (i10 > 0) {
            this.visibleActions.put(view, div);
        } else {
            this.visibleActions.remove(view);
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }

    @AnyThread
    public void trackVisibilityActionsOf(final Div2View div2View, final ExpressionResolver expressionResolver, final View view, final Div div, final List<DivVisibilityAction> list, final List<DivDisappearAction> list2) {
        final List<? extends c9> listY0 = b0.y0(list, list2);
        if (listY0.isEmpty()) {
            return;
        }
        final DivDataTag dataTag = div2View.getDataTag();
        if (view == null) {
            this.isEnabledObserver.cancelObserving(listY0);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                shouldTrackVisibilityAction(div2View, expressionResolver, null, (DivVisibilityAction) it.next(), 0, this.appearTrackedTokens);
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                shouldTrackVisibilityAction(div2View, expressionResolver, null, (DivDisappearAction) it2.next(), 0, this.disappearTrackedTokens);
            }
            return;
        }
        if (this.enqueuedVisibilityActions.containsKey(view)) {
            return;
        }
        if (ViewsKt.isHierarchyLaidOut(view) && !view.isLayoutRequested()) {
            if (p.e(div2View.getDataTag(), dataTag)) {
                this.isEnabledObserver.observe(view, div2View, expressionResolver, div, listY0);
                trackVisibilityActions(div2View, expressionResolver, view, div, filterEnabled(list, expressionResolver), filterEnabled(list2, expressionResolver));
            }
            this.enqueuedVisibilityActions.remove(view);
            return;
        }
        View viewFarthestLayoutCaller = ViewsKt.farthestLayoutCaller(view);
        if (viewFarthestLayoutCaller != null) {
            viewFarthestLayoutCaller.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActionsOf$$inlined$doOnHierarchyLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view2.removeOnLayoutChangeListener(this);
                    if (p.e(div2View.getDataTag(), dataTag)) {
                        this.isEnabledObserver.observe(view, div2View, expressionResolver, div, listY0);
                        DivVisibilityActionTracker divVisibilityActionTracker = this;
                        Div2View div2View2 = div2View;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        divVisibilityActionTracker.trackVisibilityActions(div2View2, expressionResolver2, view, div, divVisibilityActionTracker.filterEnabled(list, expressionResolver2), this.filterEnabled(list2, expressionResolver));
                    }
                    this.enqueuedVisibilityActions.remove(view);
                }
            });
            r rVar = r.f64562a;
        }
        this.enqueuedVisibilityActions.put(view, div);
    }

    private void cancelTracking(CompositeLogId compositeLogId, View view, c9 c9Var, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "DivVisibilityActionTracker", "cancelTracking: id=" + compositeLogId);
        }
        divVisibilityTokenHolder.remove(compositeLogId, new l<Map<CompositeLogId, ? extends c9>, r>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker.cancelTracking.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Map<CompositeLogId, ? extends c9> map) {
                invoke2(map);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<CompositeLogId, ? extends c9> map) {
                DivVisibilityActionTracker.this.handler.removeCallbacksAndMessages(map);
            }
        });
        Set<DivDisappearAction> set = this.appearedForDisappearActions.get(view);
        if (!(c9Var instanceof DivDisappearAction) || view == null || set == null) {
            return;
        }
        set.remove(c9Var);
        if (set.isEmpty()) {
            this.appearedForDisappearActions.remove(view);
            this.divWithWaitingDisappearActions.remove(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends c9> List<T> filterEnabled(List<? extends T> list, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c9) obj).isEnabled().evaluate(expressionResolver).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public boolean shouldTrackVisibilityAction(Div2View div2View, ExpressionResolver expressionResolver, View view, c9 c9Var, int i10, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        boolean z10;
        if (!(c9Var instanceof DivVisibilityAction)) {
            if (c9Var instanceof DivDisappearAction) {
                Set<DivDisappearAction> set = this.appearedForDisappearActions.get(view);
                if ((set != null ? set.contains(c9Var) : false) && i10 <= ((DivDisappearAction) c9Var).f47012k.evaluate(expressionResolver).longValue()) {
                    z10 = true;
                }
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Trying to check visibility for class without known visibility range");
                }
            }
            z10 = false;
        } else if (i10 >= ((DivVisibilityAction) c9Var).f50104k.evaluate(expressionResolver).longValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        CompositeLogId logId = divVisibilityTokenHolder.getLogId(CompositeLogIdKt.compositeLogIdOf(div2View, c9Var.b().evaluate(expressionResolver)));
        if (view != null && logId == null && z10) {
            return true;
        }
        if ((view == null || logId != null || z10) && (view == null || logId == null || !z10)) {
            if (view != null && logId != null && !z10) {
                cancelTracking(logId, view, c9Var, divVisibilityTokenHolder);
            } else if (view == null && logId != null) {
                cancelTracking(logId, null, c9Var, divVisibilityTokenHolder);
            }
        }
        return false;
    }

    private void startTracking(final Div2View div2View, final ExpressionResolver expressionResolver, final View view, final List<? extends c9> list, long j10, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        HashMap map = new HashMap(list.size(), 1.0f);
        for (c9 c9Var : list) {
            CompositeLogId compositeLogIdCompositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(div2View, c9Var.b().evaluate(expressionResolver));
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, "DivVisibilityActionTracker", "startTracking: id=" + compositeLogIdCompositeLogIdOf);
            }
            Pair pairA = h.a(compositeLogIdCompositeLogIdOf, c9Var);
            map.put(pairA.getFirst(), pairA.getSecond());
        }
        final Map<CompositeLogId, c9> mapSynchronizedMap = Collections.synchronizedMap(map);
        divVisibilityTokenHolder.add(mapSynchronizedMap);
        final String logId = div2View.getLogId();
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTracking$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                KLog kLog2 = KLog.INSTANCE;
                if (kLog2.isAtLeast(Severity.INFO)) {
                    kLog2.print(4, "DivVisibilityActionTracker", "dispatchActions: id=" + b0.p0(mapSynchronizedMap.keySet(), null, null, null, 0, null, null, 63, null));
                }
                Set set = (Set) this.this$0.appearedForDisappearActions.get(view);
                if (set != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof DivDisappearAction) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.remove((DivDisappearAction) it.next());
                    }
                    if (set.isEmpty()) {
                        this.this$0.appearedForDisappearActions.remove(view);
                        this.this$0.divWithWaitingDisappearActions.remove(view);
                    }
                }
                if (p.e(div2View.getLogId(), logId)) {
                    this.this$0.visibilityActionDispatcher.dispatchActions(div2View, expressionResolver, view, (c9[]) mapSynchronizedMap.values().toArray(new c9[0]));
                }
            }
        };
        if (mapSynchronizedMap == null) {
            handler.postDelayed(runnable, j10);
        } else {
            HandlerCompat.postDelayed(handler, runnable, mapSynchronizedMap, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackVisibilityActions(Div2View div2View, ExpressionResolver expressionResolver, View view, Div div, List<DivVisibilityAction> list, List<DivDisappearAction> list2) {
        ExpressionResolver expressionResolver2 = expressionResolver;
        Assert.assertMainThread();
        int iCalculateVisibilityPercentage = this.viewVisibilityCalculator.calculateVisibilityPercentage(view);
        updateVisibility(view, div, iCalculateVisibilityPercentage);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long lValueOf = Long.valueOf(DivSightExtensionsKt.getDuration((DivVisibilityAction) obj).evaluate(expressionResolver2).longValue());
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            List list3 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(list3.size());
            for (Object obj2 : list3) {
                if (shouldTrackVisibilityAction(div2View, expressionResolver, view, (DivVisibilityAction) obj2, iCalculateVisibilityPercentage, this.appearTrackedTokens)) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                startTracking(div2View, expressionResolver, view, arrayList2, jLongValue, this.appearTrackedTokens);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list2) {
            Long lValueOf2 = Long.valueOf(DivSightExtensionsKt.getDuration((DivDisappearAction) obj3).evaluate(expressionResolver2).longValue());
            Object arrayList3 = linkedHashMap2.get(lValueOf2);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap2.put(lValueOf2, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long jLongValue2 = ((Number) entry2.getKey()).longValue();
            List<DivDisappearAction> list4 = (List) entry2.getValue();
            boolean z10 = false;
            for (DivDisappearAction divDisappearAction : list4) {
                boolean z11 = z10;
                boolean z12 = ((long) iCalculateVisibilityPercentage) > divDisappearAction.f47012k.evaluate(expressionResolver2).longValue();
                z10 = z11 || z12;
                if (z12) {
                    WeakHashMap<View, Set<DivDisappearAction>> weakHashMap = this.appearedForDisappearActions;
                    Set<DivDisappearAction> linkedHashSet = weakHashMap.get(view);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        weakHashMap.put(view, linkedHashSet);
                    }
                    linkedHashSet.add(divDisappearAction);
                }
            }
            if (z10) {
                this.divWithWaitingDisappearActions.put(view, div);
            }
            ArrayList arrayList4 = new ArrayList(list4.size());
            for (Object obj4 : list4) {
                if (shouldTrackVisibilityAction(div2View, expressionResolver, view, (DivDisappearAction) obj4, iCalculateVisibilityPercentage, this.disappearTrackedTokens)) {
                    arrayList4.add(obj4);
                }
            }
            if (!arrayList4.isEmpty()) {
                startTracking(div2View, expressionResolver, view, arrayList4, jLongValue2, this.disappearTrackedTokens);
            }
            expressionResolver2 = expressionResolver;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackVisibilityActionsOf$default(DivVisibilityActionTracker divVisibilityActionTracker, Div2View div2View, ExpressionResolver expressionResolver, View view, Div div, List list, List list2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityActionsOf");
        }
        if ((i10 & 16) != 0) {
            list = DivUtilKt.getAllAppearActions(div.b());
        }
        List list3 = list;
        if ((i10 & 32) != 0) {
            list2 = DivUtilKt.getAllDisappearActions(div.b());
        }
        divVisibilityActionTracker.trackVisibilityActionsOf(div2View, expressionResolver, view, div, list3, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVisibilityTask$lambda$0(DivVisibilityActionTracker divVisibilityActionTracker) {
        divVisibilityActionTracker.visibilityActionDispatcher.dispatchVisibleViewsChanged(divVisibilityActionTracker.visibleActions);
        divVisibilityActionTracker.hasPostedUpdateVisibilityTask = false;
    }

    public void cancelTrackingViewsHierarchy(final BindingContext bindingContext, View view, Div div) {
        trackViewsHierarchy(bindingContext, view, div, new bk.p<View, Div, Boolean>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker.cancelTrackingViewsHierarchy.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Boolean mo1invoke(View view2, Div div2) {
                DivVisibilityActionTracker.this.previousVisibilityIsFull.remove(view2);
                if (div2 != null) {
                    DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                    BindingContext bindingContext2 = bindingContext;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext2.getDivView(), bindingContext2.getExpressionResolver(), null, div2, null, null, 48, null);
                }
                return Boolean.TRUE;
            }
        });
    }

    public Map<View, Div> getDivWithWaitingDisappearActions() {
        return this.divWithWaitingDisappearActions.createMap();
    }

    public void startTrackingViewsHierarchy(final BindingContext bindingContext, View view, Div div) {
        trackViewsHierarchy(bindingContext, view, div, new bk.p<View, Div, Boolean>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker.startTrackingViewsHierarchy.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Boolean mo1invoke(View view2, Div div2) {
                boolean z10;
                boolean zIsViewFullyVisible = DivVisibilityActionTracker.this.viewVisibilityCalculator.isViewFullyVisible(view2);
                if (zIsViewFullyVisible && p.e(DivVisibilityActionTracker.this.previousVisibilityIsFull.get(view2), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    DivVisibilityActionTracker.this.previousVisibilityIsFull.put(view2, Boolean.valueOf(zIsViewFullyVisible));
                    if (div2 != null) {
                        DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                        BindingContext bindingContext2 = bindingContext;
                        DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext2.getDivView(), bindingContext2.getExpressionResolver(), view2, div2, null, null, 48, null);
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    @AnyThread
    public void updateVisibleViews(List<? extends View> list) {
        Iterator<Map.Entry<View, Div>> it = this.visibleActions.entrySet().iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next().getKey())) {
                it.remove();
            }
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }

    public DivVisibilityActionTracker(ViewVisibilityCalculator viewVisibilityCalculator, DivVisibilityActionDispatcher divVisibilityActionDispatcher) {
        this.viewVisibilityCalculator = viewVisibilityCalculator;
        this.visibilityActionDispatcher = divVisibilityActionDispatcher;
    }

    private void trackViewsHierarchy(BindingContext bindingContext, View view, Div div, bk.p<? super View, ? super Div, Boolean> pVar) {
        if (pVar.mo1invoke(view, div).booleanValue() && (view instanceof ViewGroup)) {
            for (View view2 : ViewGroupKt.getChildren((ViewGroup) view)) {
                trackViewsHierarchy(bindingContext, view2, bindingContext.getDivView().takeBindingDiv$div_release(view2), pVar);
            }
        }
    }

    public void trackDetachedView(BindingContext bindingContext, View view, Div div) {
        List<DivDisappearAction> listK = div.b().k();
        if (listK == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        trackVisibilityActions(bindingContext.getDivView(), expressionResolver, view, div, nj.s.k(), filterEnabled(listK, expressionResolver));
    }
}

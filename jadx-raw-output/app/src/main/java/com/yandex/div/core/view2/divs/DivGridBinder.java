package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGrid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mj.r;
import nj.b0;
import nj.s;
import nj.x;
import oe.e2;

/* JADX INFO: compiled from: DivGridBinder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivGridBinder extends DivViewBinder<Div.f, DivGrid, DivGridLayout> {
    private final jj.a<DivBinder> divBinder;
    private final DivPatchManager divPatchManager;
    private final jj.a<DivViewCreator> divViewCreator;

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivGridLayout divGridLayout, BindingContext bindingContext, DivGrid divGrid, DivGrid divGrid2) {
        divGridLayout.setReleaseViewVisitor$div_release(bindingContext.getDivView().getReleaseViewVisitor$div_release());
        BaseDivViewExtensionsKt.applyDivActions(divGridLayout, bindingContext, divGrid.f47457b, divGrid.f47459d, divGrid.A, divGrid.f47472q, divGrid.f47478w, divGrid.f47477v, divGrid.E, divGrid.D, divGrid.f47458c, divGrid.f47466k);
        divGridLayout.addSubscription(divGrid.f47467l.observeAndGet(bindingContext.getExpressionResolver(), new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder.bind.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f64562a;
            }

            public final void invoke(long j10) {
                int i10;
                DivGridLayout divGridLayout2 = divGridLayout;
                long j11 = j10 >> 31;
                if (j11 == 0 || j11 == -1) {
                    i10 = (int) j10;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + j10 + "' to Int");
                    }
                    i10 = j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divGridLayout2.setColumnCount(i10);
            }
        }));
        observeContentAlignment(divGridLayout, divGrid.f47469n, divGrid.f47470o, bindingContext.getExpressionResolver());
    }

    public DivGridBinder(DivBaseBinder divBaseBinder, DivPatchManager divPatchManager, jj.a<DivBinder> aVar, jj.a<DivViewCreator> aVar2) {
        super(divBaseBinder);
        this.divPatchManager = divPatchManager;
        this.divBinder = aVar;
        this.divViewCreator = aVar2;
    }

    private final void applyColumnSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        DivLayoutParams divLayoutParams;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long jLongValue = expression.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 != 0 && j10 != -1) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                if (jLongValue > 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = Integer.MIN_VALUE;
                }
            } else {
                i10 = (int) jLongValue;
            }
        } else {
            i10 = 1;
        }
        if (divLayoutParams.getColumnSpan() != i10) {
            divLayoutParams.setColumnSpan(i10);
            view.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGridLayoutParams(View view, ExpressionResolver expressionResolver, e2 e2Var) {
        applyColumnSpan(view, expressionResolver, e2Var.b());
        applyRowSpan(view, expressionResolver, e2Var.e());
    }

    private final List<Div> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Div div, int i10) {
        Div2View divView = bindingContext.getDivView();
        String id2 = div.b().getId();
        if (id2 != null && !divView.getComplexRebindInProgress$div_release()) {
            Map<Div, View> mapCreateViewsForId = this.divPatchManager.createViewsForId(bindingContext, id2);
            if (mapCreateViewsForId == null) {
                return nj.r.e(div);
            }
            viewGroup.removeViewAt(i10);
            int i11 = 0;
            Iterator<Map.Entry<Div, View>> it = mapCreateViewsForId.entrySet().iterator();
            while (it.hasNext()) {
                viewGroup.addView(it.next().getValue(), i11 + i10, new DivLayoutParams(-2, -2));
                i11++;
            }
            return b0.O0(mapCreateViewsForId.keySet());
        }
        return nj.r.e(div);
    }

    private final void applyRowSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        DivLayoutParams divLayoutParams;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long jLongValue = expression.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 != 0 && j10 != -1) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                if (jLongValue > 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = Integer.MIN_VALUE;
                }
            } else {
                i10 = (int) jLongValue;
            }
        } else {
            i10 = 1;
        }
        if (divLayoutParams.getRowSpan() != i10) {
            divLayoutParams.setRowSpan(i10);
            view.requestLayout();
        }
    }

    private final void bindItems(DivGridLayout divGridLayout, BindingContext bindingContext, DivGrid divGrid, DivGrid divGrid2, DivStatePath divStatePath) {
        List<DivItemBuilderResult> divItemBuilderResult;
        List<Div> list;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<Div> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(divGrid);
        RebindUtilsKt.tryRebindPlainContainerChildren(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(nonNullItems, expressionResolver), this.divViewCreator);
        List<Div> listDispatchBinding = dispatchBinding(divGridLayout, bindingContext, nonNullItems, divStatePath);
        Div2View divView = bindingContext.getDivView();
        List<DivItemBuilderResult> divItemBuilderResult2 = DivCollectionExtensionsKt.toDivItemBuilderResult(listDispatchBinding, expressionResolver);
        if (divGrid2 != null && (list = divGrid2.f47480y) != null) {
            divItemBuilderResult = DivCollectionExtensionsKt.toDivItemBuilderResult(list, expressionResolver);
        } else {
            divItemBuilderResult = null;
        }
        BaseDivViewExtensionsKt.trackVisibilityActions(divGridLayout, divView, divItemBuilderResult2, divItemBuilderResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindLayoutParams(final View view, final e2 e2Var, final ExpressionResolver expressionResolver) {
        Disposable disposableObserve;
        applyGridLayoutParams(view, expressionResolver, e2Var);
        if (!(view instanceof ExpressionSubscriber)) {
            return;
        }
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindLayoutParams$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.this$0.applyGridLayoutParams(view, expressionResolver, e2Var);
            }
        };
        ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
        Expression<Long> expressionB = e2Var.b();
        Disposable disposableObserve2 = null;
        if (expressionB != null) {
            disposableObserve = expressionB.observe(expressionResolver, lVar);
        } else {
            disposableObserve = null;
        }
        expressionSubscriber.addSubscription(disposableObserve);
        Expression<Long> expressionE = e2Var.e();
        if (expressionE != null) {
            disposableObserve2 = expressionE.observe(expressionResolver, lVar);
        }
        expressionSubscriber.addSubscription(disposableObserve2);
    }

    private final List<Div> dispatchBinding(DivGridLayout divGridLayout, BindingContext bindingContext, List<? extends Div> list, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int size = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                s.u();
            }
            List<Div> listApplyPatchToChild = applyPatchToChild(divGridLayout, bindingContext, (Div) obj, i11 + size);
            size += listApplyPatchToChild.size() - 1;
            x.C(arrayList, listApplyPatchToChild);
            i11 = i12;
        }
        List<String> ids = DivPathUtils.INSTANCE.getIds(arrayList);
        for (Object obj2 : arrayList) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            Div div = (Div) obj2;
            View childAt = divGridLayout.getChildAt(i10);
            e2 e2VarB = div.b();
            this.divBinder.get().bind(bindingContext, childAt, div, divStatePath.appendDiv(ids.get(i10)));
            bindLayoutParams(childAt, e2VarB, expressionResolver);
            if (DivUtilKt.getHasSightActions(e2VarB)) {
                divView.bindViewToDiv$div_release(childAt, div);
            } else {
                divView.unbindViewFromDiv$div_release(childAt);
            }
            i10 = i13;
        }
        return arrayList;
    }

    private final void observeContentAlignment(final DivGridLayout divGridLayout, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2, final ExpressionResolver expressionResolver) {
        divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
            }
        };
        divGridLayout.addSubscription(expression.observe(expressionResolver, lVar));
        divGridLayout.addSubscription(expression2.observe(expressionResolver, lVar));
    }

    public void bindView(BindingContext bindingContext, DivGridLayout divGridLayout, Div.f fVar, DivStatePath divStatePath) {
        DivGrid divGridC;
        super.bindView(bindingContext, divGridLayout, fVar, divStatePath);
        DivGrid divGridC2 = fVar.c();
        Div.f div = divGridLayout.getDiv();
        if (div != null) {
            divGridC = div.c();
        } else {
            divGridC = null;
        }
        bindItems(divGridLayout, bindingContext, divGridC2, divGridC, divStatePath);
    }
}

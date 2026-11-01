package com.yandex.div.core.view2.divs;

import android.view.MotionEvent;
import android.view.View;
import bk.l;
import bk.p;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivSelect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.i;
import kotlin.sequences.SequencesKt___SequencesKt;
import mj.r;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: DivSelectBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSelectBinder extends DivViewBinder<Div.k, DivSelect, DivSelectView> {
    private final ErrorCollectors errorCollectors;
    private final DivTypefaceResolver typefaceResolver;
    private final TwoWayStringVariableBinder variableBinder;

    private final List<String> createObservedItemList(final DivSelectView divSelectView, DivSelect divSelect, ExpressionResolver expressionResolver) {
        final ArrayList arrayList = new ArrayList();
        final int i10 = 0;
        for (Object obj : divSelect.A) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivSelect.Option option = (DivSelect.Option) obj;
            Expression<String> expression = option.f48609a;
            if (expression == null) {
                expression = option.f48610b;
            }
            arrayList.add(expression.evaluate(expressionResolver));
            expression.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$createObservedItemList$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(String str) {
                    invoke2(str);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    arrayList.set(i10, str);
                    divSelectView.setItems(arrayList);
                }
            });
            i10 = i11;
        }
        return arrayList;
    }

    private final void observeBaseTextProperties(DivSelectView divSelectView, DivSelect divSelect, DivSelect divSelect2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeBaseTextProperties(divSelectView, divSelect.f48593m, divSelect.f48594n, divSelect.f48604x, divSelect.F, divSelect.f48605y, divSelect.f48592l, divSelect.f48596p, divSelect.f48597q, divSelect.f48595o, divSelect2 != null ? divSelect2.f48593m : null, divSelect2 != null ? divSelect2.f48594n : null, divSelect2 != null ? divSelect2.f48604x : null, divSelect2 != null ? divSelect2.F : null, divSelect2 != null ? divSelect2.f48605y : null, divSelect2 != null ? divSelect2.f48592l : null, divSelect2 != null ? divSelect2.f48596p : null, divSelect2 != null ? divSelect2.f48597q : null, divSelect2 != null ? divSelect2.f48595o : null, divSelect2, this.typefaceResolver, expressionResolver);
    }

    private final void observeHintColor(final DivSelectView divSelectView, DivSelect divSelect, ExpressionResolver expressionResolver) {
        divSelectView.addSubscription(divSelect.f48600t.observeAndGet(expressionResolver, new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder.observeHintColor.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f64562a;
            }

            public final void invoke(int i10) {
                divSelectView.setHintTextColor(i10);
            }
        }));
    }

    private final void observeHintText(final DivSelectView divSelectView, DivSelect divSelect, ExpressionResolver expressionResolver) {
        Expression<String> expression = divSelect.f48601u;
        if (expression == null) {
            return;
        }
        divSelectView.addSubscription(expression.observeAndGet(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder.observeHintText.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(String str) {
                invoke2(str);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                divSelectView.setHint(str);
            }
        }));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivSelectView divSelectView, BindingContext bindingContext, DivSelect divSelect, DivSelect divSelect2, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divSelectView.setTextAlignment(5);
        divSelectView.setFocusTracker(divView.getInputFocusTracker$div_release());
        applyOptions(divSelectView, divSelect, bindingContext);
        observeVariable(divSelectView, divSelect, bindingContext, divStatePath);
        observeBaseTextProperties(divSelectView, divSelect, divSelect2, expressionResolver);
        observeHintText(divSelectView, divSelect, expressionResolver);
        observeHintColor(divSelectView, divSelect, expressionResolver);
    }

    public DivSelectBinder(DivBaseBinder divBaseBinder, DivTypefaceResolver divTypefaceResolver, TwoWayStringVariableBinder twoWayStringVariableBinder, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.errorCollectors = errorCollectors;
    }

    private final void applyOptions(final DivSelectView divSelectView, final DivSelect divSelect, final BindingContext bindingContext) {
        View.OnTouchListener onTouchListener = null;
        final p<View, MotionEvent, Boolean> pVarCreateAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(divSelectView, bindingContext, UtilsKt.getDEFAULT_CLICK_ANIMATION(), null);
        if (pVarCreateAnimatedTouchListener != null) {
            onTouchListener = new View.OnTouchListener() { // from class: yd.k
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return DivSelectBinder.applyOptions$lambda$0(pVarCreateAnimatedTouchListener, view, motionEvent);
                }
            };
        }
        divSelectView.setOnTouchListener(onTouchListener);
        final List<String> listCreateObservedItemList = createObservedItemList(divSelectView, divSelect, bindingContext.getExpressionResolver());
        divSelectView.setItems(listCreateObservedItemList);
        divSelectView.setOnItemSelectedListener(new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder.applyOptions.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f64562a;
            }

            public final void invoke(int i10) {
                divSelectView.setText(listCreateObservedItemList.get(i10));
                l<String, r> valueUpdater = divSelectView.getValueUpdater();
                if (valueUpdater != null) {
                    valueUpdater.invoke(divSelect.A.get(i10).f48610b.evaluate(bindingContext.getExpressionResolver()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyOptions$lambda$0(p pVar, View view, MotionEvent motionEvent) {
        return ((Boolean) pVar.mo1invoke(view, motionEvent)).booleanValue();
    }

    private final void observeVariable(final DivSelectView divSelectView, final DivSelect divSelect, BindingContext bindingContext, DivStatePath divStatePath) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSelectView.addSubscription(this.variableBinder.bindVariable(bindingContext, divSelect.M, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(final String str) {
                String strEvaluate;
                i iVarS = b0.S(divSelect.A);
                final ExpressionResolver expressionResolver2 = expressionResolver;
                Iterator it = SequencesKt___SequencesKt.z(iVarS, new l<DivSelect.Option, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public final Boolean invoke(DivSelect.Option option) {
                        return Boolean.valueOf(ck.p.e(option.f48610b.evaluate(expressionResolver2), str));
                    }
                }).iterator();
                DivSelectView divSelectView2 = divSelectView;
                if (it.hasNext()) {
                    DivSelect.Option option = (DivSelect.Option) it.next();
                    if (it.hasNext()) {
                        orCreate.logWarning(new Throwable("Multiple options found with value = \"" + str + "\", selecting first one"));
                    }
                    Expression<String> expression = option.f48609a;
                    if (expression == null) {
                        expression = option.f48610b;
                    }
                    strEvaluate = expression.evaluate(expressionResolver);
                } else {
                    orCreate.logWarning(new Throwable("No option found with value = \"" + str + '\"'));
                    strEvaluate = "";
                }
                divSelectView2.setText(strEvaluate);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(l<? super String, r> lVar) {
                divSelectView.setValueUpdater(lVar);
            }
        }, divStatePath));
    }
}

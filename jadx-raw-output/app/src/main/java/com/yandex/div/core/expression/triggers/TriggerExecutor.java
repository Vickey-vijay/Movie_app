package com.yandex.div.core.expression.triggers;

import bk.l;
import ck.x;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTrigger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import mj.r;

/* JADX INFO: compiled from: TriggersController.kt */
/* JADX INFO: loaded from: classes5.dex */
final class TriggerExecutor {
    private final List<DivAction> actions;
    private final Set<DivViewFacade> attachedViews;
    private Disposable bindCompletionDisposable;
    private final DivActionBinder divActionBinder;
    private final ErrorCollector errorCollector;
    private final Expression.MutableExpression<?, Boolean> expression;
    private final Div2Logger logger;
    private final Expression<DivTrigger.Mode> mode;
    private Disposable modeObserver;
    private Disposable observersDisposable;
    private Disposable removingDisposable;
    private final ExpressionResolverImpl resolver;
    private final l<Boolean, r> changeTrigger = new l<Boolean, r>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$changeTrigger$1
        {
            super(1);
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return r.f64562a;
        }

        public final void invoke(boolean z10) {
            this.this$0.tryTriggerActions();
        }
    };
    private DivTrigger.Mode currentMode = DivTrigger.Mode.ON_CONDITION;
    private WeakHashMap<DivViewFacade, Boolean> wasConditionSatisfied = new WeakHashMap<>();

    private final boolean conditionSatisfied(DivViewFacade divViewFacade) throws Exception {
        RuntimeException runtimeException;
        try {
            boolean zBooleanValue = this.expression.evaluate(this.resolver).booleanValue();
            Boolean bool = this.wasConditionSatisfied.get(divViewFacade);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean zBooleanValue2 = bool.booleanValue();
            this.wasConditionSatisfied.put(divViewFacade, Boolean.valueOf(zBooleanValue));
            if (zBooleanValue) {
                return (this.currentMode == DivTrigger.Mode.ON_CONDITION && zBooleanValue2) ? false : true;
            }
            return false;
        } catch (Exception e10) {
            if (e10 instanceof ClassCastException) {
                runtimeException = new RuntimeException("Condition evaluated in non-boolean result! (expression: '" + this.expression.getRawValue() + "')", e10);
            } else {
                if (!(e10 instanceof EvaluableException)) {
                    throw e10;
                }
                runtimeException = new RuntimeException("Condition evaluation failed! (expression: '" + this.expression.getRawValue() + "')", e10);
            }
            this.errorCollector.logError(runtimeException);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryTriggerActions() {
        Assert.assertMainThread();
        Iterator<T> it = this.attachedViews.iterator();
        while (it.hasNext()) {
            tryTriggerActions((DivViewFacade) it.next());
        }
    }

    private final void invalidateObservation() {
        if (this.attachedViews.isEmpty()) {
            stopObserving();
        } else {
            startObserving();
        }
    }

    private final void startObserving() {
        this.modeObserver.close();
        this.observersDisposable = this.expression.observe(this.resolver, this.changeTrigger);
        this.removingDisposable = this.resolver.getVariableController().subscribeToVariablesUndeclared(this.expression.getVariablesName(this.resolver), new l<Variable, r>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor.startObserving.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Variable variable) {
                invoke2(variable);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                TriggerExecutor.this.stopObserving();
            }
        });
        this.modeObserver = this.mode.observeAndGet(this.resolver, new l<DivTrigger.Mode, r>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor.startObserving.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivTrigger.Mode mode) {
                invoke2(mode);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivTrigger.Mode mode) {
                TriggerExecutor.this.currentMode = mode;
            }
        });
        tryTriggerActions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObserving() {
        this.modeObserver.close();
        this.observersDisposable.close();
        this.removingDisposable.close();
        this.bindCompletionDisposable.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.core.downloader.PersistentDivDataObserver, com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1] */
    private final void tryTriggerActionsAfterBind(final Div2View div2View) {
        this.bindCompletionDisposable.close();
        final ?? r10 = new PersistentDivDataObserver() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1
            @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
            public void onAfterDivDataChanged() {
                div2View.removePersistentDivDataObserver$div_release(this);
                this.tryTriggerActions();
            }
        };
        this.bindCompletionDisposable = new Disposable() { // from class: com.yandex.div.core.expression.triggers.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                div2View.removePersistentDivDataObserver$div_release(r10);
            }
        };
        div2View.addPersistentDivDataObserver$div_release(r10);
    }

    public final void onAttach(DivViewFacade divViewFacade) {
        this.attachedViews.add(divViewFacade);
        invalidateObservation();
    }

    public final void onDetach(DivViewFacade divViewFacade) {
        x.a(this.attachedViews).remove(divViewFacade);
        invalidateObservation();
    }

    public TriggerExecutor(Expression.MutableExpression<?, Boolean> mutableExpression, List<DivAction> list, Expression<DivTrigger.Mode> expression, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector, Div2Logger div2Logger, DivActionBinder divActionBinder) {
        this.expression = mutableExpression;
        this.actions = list;
        this.mode = expression;
        this.resolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
        this.modeObserver = expression.observeAndGet(expressionResolverImpl, new l<DivTrigger.Mode, r>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$modeObserver$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivTrigger.Mode mode) {
                invoke2(mode);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivTrigger.Mode mode) {
                this.this$0.currentMode = mode;
            }
        });
        Disposable disposable = Disposable.NULL;
        this.observersDisposable = disposable;
        this.removingDisposable = disposable;
        this.bindCompletionDisposable = disposable;
        this.attachedViews = new LinkedHashSet();
    }

    private final void tryTriggerActions(DivViewFacade divViewFacade) {
        boolean z10 = divViewFacade instanceof Div2View;
        Div2View div2View = z10 ? (Div2View) divViewFacade : null;
        if (div2View != null) {
            if (!div2View.getInMiddleOfBind$div_release()) {
                div2View = null;
            }
            if (div2View != null) {
                tryTriggerActionsAfterBind(div2View);
                return;
            }
        }
        if (conditionSatisfied(divViewFacade)) {
            for (DivAction divAction : this.actions) {
                Div2View div2View2 = z10 ? (Div2View) divViewFacade : null;
                if (div2View2 != null) {
                    this.logger.logTrigger(div2View2, divAction);
                }
            }
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, divViewFacade, this.resolver, this.actions, "trigger", null, 16, null);
        }
    }
}

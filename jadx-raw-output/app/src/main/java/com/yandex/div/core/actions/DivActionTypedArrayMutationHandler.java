package com.yandex.div.core.actions;

import bk.l;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionArrayInsertValue;
import com.yandex.div2.DivActionArrayRemoveValue;
import com.yandex.div2.DivActionArraySetValue;
import com.yandex.div2.DivActionTyped;
import ik.k;
import java.util.List;
import mj.r;
import org.json.JSONArray;

/* JADX INFO: compiled from: DivActionTypedArrayMutationHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionTypedArrayMutationHandler implements DivActionTypedHandler {
    private final void handle(DivActionArrayInsertValue divActionArrayInsertValue, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String strEvaluate = divActionArrayInsertValue.f46089c.evaluate(expressionResolver);
        Expression<Long> expression = divActionArrayInsertValue.f46087a;
        final Integer numValueOf = expression != null ? Integer.valueOf((int) expression.evaluate(expressionResolver).longValue()) : null;
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(divActionArrayInsertValue.f46088b, expressionResolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, strEvaluate, expressionResolver, new l<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public final JSONArray invoke(JSONArray jSONArray) {
                int length = jSONArray.length();
                Integer num = numValueOf;
                boolean z10 = true;
                if (num != null && num.intValue() != length) {
                    z10 = false;
                }
                if (z10) {
                    final Object obj = objEvaluate;
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new l<List<Object>, r>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(List<Object> list) {
                            invoke2(list);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.add(obj);
                        }
                    });
                }
                if (k.q(0, length).l(num.intValue())) {
                    final Integer num2 = numValueOf;
                    final Object obj2 = objEvaluate;
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new l<List<Object>, r>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(List<Object> list) {
                            invoke2(list);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.add(num2.intValue(), obj2);
                        }
                    });
                }
                DivActionTypedUtilsKt.logError(div2View, new IndexOutOfBoundsException("Index out of bound (" + numValueOf + ") for mutation " + strEvaluate + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (divActionTyped instanceof DivActionTyped.c) {
            handle(((DivActionTyped.c) divActionTyped).c(), div2View, expressionResolver);
            return true;
        }
        if (divActionTyped instanceof DivActionTyped.d) {
            handle(((DivActionTyped.d) divActionTyped).c(), div2View, expressionResolver);
            return true;
        }
        if (!(divActionTyped instanceof DivActionTyped.e)) {
            return false;
        }
        handle(((DivActionTyped.e) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }

    private final void handle(DivActionArrayRemoveValue divActionArrayRemoveValue, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String strEvaluate = divActionArrayRemoveValue.f46099b.evaluate(expressionResolver);
        final int iLongValue = (int) divActionArrayRemoveValue.f46098a.evaluate(expressionResolver).longValue();
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, strEvaluate, expressionResolver, new l<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public final JSONArray invoke(JSONArray jSONArray) {
                int length = jSONArray.length();
                final int i10 = iLongValue;
                boolean z10 = false;
                if (i10 >= 0 && i10 < length) {
                    z10 = true;
                }
                if (z10) {
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new l<List<Object>, r>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(List<Object> list) {
                            invoke2(list);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.remove(i10);
                        }
                    });
                }
                DivActionTypedUtilsKt.logError(div2View, new IndexOutOfBoundsException("Index out of bound (" + iLongValue + ") for mutation " + strEvaluate + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    private final void handle(DivActionArraySetValue divActionArraySetValue, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String strEvaluate = divActionArraySetValue.f46109c.evaluate(expressionResolver);
        final int iLongValue = (int) divActionArraySetValue.f46107a.evaluate(expressionResolver).longValue();
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(divActionArraySetValue.f46108b, expressionResolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, strEvaluate, expressionResolver, new l<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public final JSONArray invoke(JSONArray jSONArray) {
                int length = jSONArray.length();
                final int i10 = iLongValue;
                boolean z10 = false;
                if (i10 >= 0 && i10 < length) {
                    z10 = true;
                }
                if (z10) {
                    final Object obj = objEvaluate;
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new l<List<Object>, r>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(List<Object> list) {
                            invoke2(list);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.set(i10, obj);
                        }
                    });
                }
                DivActionTypedUtilsKt.logError(div2View, new IndexOutOfBoundsException("Index out of bound (" + iLongValue + ") for mutation " + strEvaluate + " (" + length + ')'));
                return jSONArray;
            }
        });
    }
}

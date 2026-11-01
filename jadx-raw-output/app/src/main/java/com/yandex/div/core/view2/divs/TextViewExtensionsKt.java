package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import java.util.Iterator;
import java.util.List;
import mj.r;
import nj.b0;
import oe.e2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: TextViewExtensions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TextViewExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends TextView & FixedLineHeightView> void applyLineHeight(T t10, Expression<Long> expression, Expression<DivSizeUnit> expression2, ExpressionResolver expressionResolver) {
        t10.setFixedLineHeight(expression != null ? BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression.evaluate(expressionResolver).longValue()), t10.getResources().getDisplayMetrics(), expression2.evaluate(expressionResolver)) : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTypeface(TextView textView, Expression<String> expression, Expression<DivFontWeight> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        Integer numValueOf;
        int i10;
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(expression != null ? expression.evaluate(expressionResolver) : null);
        DivFontWeight divFontWeightEvaluate = expression2 != null ? expression2.evaluate(expressionResolver) : null;
        if (expression3 != null) {
            long jLongValue = expression3.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        textView.setTypeface(DivTypefaceResolverKt.getTypeface(divFontWeightEvaluate, numValueOf, typefaceProvider));
        if (getSupportFontVariations() && typefaceProvider.isVariable()) {
            textView.setFontVariationSettings(null);
            applyFontVariationSettings(textView, expression2, expression3, expression4, expressionResolver);
        }
    }

    public static final String getFontVariations(Expression<DivFontWeight> expression, Expression<Long> expression2, Expression<JSONObject> expression3, ExpressionResolver expressionResolver) {
        Integer numValueOf;
        int i10;
        DivFontWeight divFontWeightEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        if (expression2 != null) {
            long jLongValue = expression2.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return getFontVariations(divFontWeightEvaluate, numValueOf, expression3 != null ? expression3.evaluate(expressionResolver) : null);
    }

    public static final <T extends TextView & FixedLineHeightView & ExpressionSubscriber> void observeBaseTextProperties(T t10, Expression<Long> expression, Expression<DivSizeUnit> expression2, Expression<Double> expression3, Expression<Integer> expression4, Expression<Long> expression5, Expression<String> expression6, Expression<DivFontWeight> expression7, Expression<Long> expression8, Expression<JSONObject> expression9, Expression<Long> expression10, Expression<DivSizeUnit> expression11, Expression<Double> expression12, Expression<Integer> expression13, Expression<Long> expression14, Expression<String> expression15, Expression<DivFontWeight> expression16, Expression<Long> expression17, Expression<JSONObject> expression18, e2 e2Var, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        T t11 = t10;
        observeFontSize(t10, expression, expression2, expression10, expression11, expressionResolver, t11);
        observeLetterSpacing(t10, expression3, expression, expression12, expression10, expressionResolver, t11);
        observeTextColor(t10, expression4, expression13, expressionResolver);
        observeLineHeight(t10, expression5, expression2, expression14, expression11, expressionResolver, t11);
        observeTypeface(t10, expression6, expression7, expression8, expression9, expression15, expression16, expression17, expression18, e2Var, divTypefaceResolver, expressionResolver);
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTypeface(T t10, Expression<String> expression, Expression<DivFontWeight> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, Expression<String> expression5, Expression<DivFontWeight> expression6, Expression<Long> expression7, Expression<JSONObject> expression8, e2 e2Var, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        if (e2Var != null && ExpressionsKt.equalsToConstant(expression, expression5) && ExpressionsKt.equalsToConstant(expression2, expression6) && ExpressionsKt.equalsToConstant(expression3, expression7) && (!getSupportFontVariations() || ExpressionsKt.equalsToConstant(expression4, expression8))) {
            return;
        }
        applyTypeface(t10, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeTypeface(t10, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeFontVariationSettings(t10, expression2, expression3, expression4, expressionResolver);
    }

    public static final boolean getSupportFontVariations() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private static final String getVariation(String str, Number number) {
        return '\'' + str + "' " + number;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFontSize(TextView textView, Expression<Long> expression, Expression<DivSizeUnit> expression2, ExpressionResolver expressionResolver) {
        textView.setTextSize(BaseDivViewExtensionsKt.toAndroidUnit(expression2.evaluate(expressionResolver)), expression.evaluate(expressionResolver).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(26)
    public static final void applyFontVariationSettings(TextView textView, Expression<DivFontWeight> expression, Expression<Long> expression2, Expression<JSONObject> expression3, ExpressionResolver expressionResolver) {
        textView.setFontVariationSettings(getFontVariations(expression, expression2, expression3, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyLetterSpacing(TextView textView, Expression<Double> expression, Expression<Long> expression2, ExpressionResolver expressionResolver) {
        textView.setLetterSpacing(((float) expression.evaluate(expressionResolver).doubleValue()) / expression2.evaluate(expressionResolver).floatValue());
    }

    public static final void observeFontSize(final TextView textView, final Expression<Long> expression, final Expression<DivSizeUnit> expression2, Expression<Long> expression3, Expression<DivSizeUnit> expression4, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyFontSize(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontSize$callback$1
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
                TextViewExtensionsKt.applyFontSize(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, lVar));
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeFontVariationSettings(final T t10, final Expression<DivFontWeight> expression, final Expression<Long> expression2, final Expression<JSONObject> expression3, final ExpressionResolver expressionResolver) {
        Disposable disposableObserve;
        if (getSupportFontVariations() && !ExpressionsKt.isConstantOrNull(expression3)) {
            T t11 = t10;
            if (expression3 != null) {
                disposableObserve = expression3.observe(expressionResolver, new l<JSONObject, r>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt.observeFontVariationSettings.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivFontWeight;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(JSONObject jSONObject) {
                        invoke2(jSONObject);
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(JSONObject jSONObject) {
                        TextViewExtensionsKt.applyFontVariationSettings(t10, expression, expression2, expression3, expressionResolver);
                    }
                });
            } else {
                disposableObserve = null;
            }
            t11.addSubscription(disposableObserve);
        }
    }

    public static final void observeLetterSpacing(final TextView textView, final Expression<Double> expression, final Expression<Long> expression2, Expression<Double> expression3, Expression<Long> expression4, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLetterSpacing(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        l<? super Double, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLetterSpacing$callback$1
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
                TextViewExtensionsKt.applyLetterSpacing(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, lVar));
    }

    public static final <T extends TextView & FixedLineHeightView> void observeLineHeight(final T t10, final Expression<Long> expression, final Expression<DivSizeUnit> expression2, Expression<Long> expression3, Expression<DivSizeUnit> expression4, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLineHeight(t10, expression, expression2, expressionResolver);
        if (expression != null) {
            if (!ExpressionsKt.isConstant(expression) || !ExpressionsKt.isConstant(expression2)) {
                l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLineHeight$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivSizeUnit;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
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
                        TextViewExtensionsKt.applyLineHeight(t10, expression, expression2, expressionResolver);
                    }
                };
                expressionSubscriber.addSubscription(expression.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(expression2.observe(expressionResolver, lVar));
            }
        }
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTextColor(final T t10, Expression<Integer> expression, Expression<Integer> expression2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        t10.setTextColor(expression.evaluate(expressionResolver).intValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        t10.addSubscription(expression.observe(expressionResolver, new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt.observeTextColor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f64562a;
            }

            public final void invoke(int i10) {
                t10.setTextColor(i10);
            }
        }));
    }

    private static final <T extends TextView & ExpressionSubscriber> void observeTypeface(final T t10, final Expression<String> expression, final Expression<DivFontWeight> expression2, final Expression<Long> expression3, final Expression<JSONObject> expression4, final DivTypefaceResolver divTypefaceResolver, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTypeface$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/String;>;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivFontWeight;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
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
                TextViewExtensionsKt.applyTypeface(t10, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
            }
        };
        if (expression != null) {
            t10.addSubscription(expression.observe(expressionResolver, lVar));
        }
        if (expression2 != null) {
            t10.addSubscription(expression2.observe(expressionResolver, lVar));
        }
        if (expression3 != null) {
            t10.addSubscription(expression3.observe(expressionResolver, lVar));
        }
    }

    public static final String getFontVariations(DivFontWeight divFontWeight, Integer num, JSONObject jSONObject) throws JSONException {
        boolean z10 = (divFontWeight == null && num == null) ? false : true;
        int typefaceValue = DivTypefaceResolverKt.getTypefaceValue(divFontWeight, num);
        if (!((jSONObject == null || JsonUtilsKt.isEmpty(jSONObject)) ? false : true)) {
            if (z10) {
                return getVariation("wght", Integer.valueOf(typefaceValue));
            }
            return null;
        }
        if (z10 && !jSONObject.has("wght")) {
            jSONObject.put("wght", typefaceValue);
        }
        List listC = nj.r.c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Number) {
                listC.add(getVariation(next, (Number) obj));
            }
        }
        return b0.p0(nj.r.a(listC), ", ", null, null, 0, null, null, 62, null);
    }
}

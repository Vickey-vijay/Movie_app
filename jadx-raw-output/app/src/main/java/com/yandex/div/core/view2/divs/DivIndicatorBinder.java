package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.util.Log;
import bk.l;
import ck.i;
import ck.p;
import ck.s;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.SearchRoute;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivDefaultIndicatorItemPlacement;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import nj.b0;
import nj.d0;
import nj.v;
import oe.e2;

/* JADX INFO: compiled from: DivIndicatorBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivIndicatorBinder extends DivViewBinder<Div.h, DivIndicator, DivPagerIndicatorView> {
    public static final Companion Companion = new Companion(null);
    private final PagerIndicatorConnector pagerIndicatorConnector;

    /* JADX INFO: compiled from: DivIndicatorBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final IndicatorParams$Shape createCircle$div_release(int i10, float f10, float f11) {
            return new IndicatorParams$Shape.Circle(i10, new IndicatorParams$ItemSize.Circle(f10 * f11));
        }

        public final IndicatorParams$Shape createRoundedRectangle$div_release(int i10, float f10, float f11, float f12, float f13, Float f14, Integer num) {
            return new IndicatorParams$Shape.RoundedRect(i10, new IndicatorParams$ItemSize.RoundedRect(f10 * f13, f11 * f13, f12 * f13), f14 != null ? f14.floatValue() : 0.0f, num != null ? num.intValue() : 0);
        }
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f10) {
        DivSizeUnit divSizeUnitEvaluate;
        Expression<Integer> expression2;
        Expression<Double> expression3;
        Expression<DivSizeUnit> expression4;
        DivStroke divStroke = divRoundedRectangleShape.f48519e;
        if (divStroke == null || (expression4 = divStroke.f49133c) == null || (divSizeUnitEvaluate = expression4.evaluate(expressionResolver)) == null) {
            divSizeUnitEvaluate = DivSizeUnit.DP;
        }
        DivStroke divStroke2 = divRoundedRectangleShape.f48519e;
        Integer numEvaluate = null;
        Integer numValueOf = (divStroke2 == null || (expression3 = divStroke2.f49134d) == null) ? null : Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Double.valueOf(expression3.evaluate(expressionResolver).doubleValue()), displayMetrics, divSizeUnitEvaluate));
        Companion companion = Companion;
        Expression<Integer> expression5 = divRoundedRectangleShape.f48515a;
        if (expression5 == null) {
            expression5 = expression;
        }
        int iIntValue = expression5.evaluate(expressionResolver).intValue();
        float pxF = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.f48518d, displayMetrics, expressionResolver);
        float pxF2 = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.f48517c, displayMetrics, expressionResolver);
        float pxF3 = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.f48516b, displayMetrics, expressionResolver);
        Float fValueOf = numValueOf != null ? Float.valueOf(numValueOf.intValue()) : null;
        DivStroke divStroke3 = divRoundedRectangleShape.f48519e;
        if (divStroke3 != null && (expression2 = divStroke3.f49131a) != null) {
            numEvaluate = expression2.evaluate(expressionResolver);
        }
        return companion.createRoundedRectangle$div_release(iIntValue, pxF, pxF2, pxF3, f10, fValueOf, numEvaluate);
    }

    public static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(divRoundedRectangleShape, displayMetrics, expressionResolver, (Expression<Integer>) expression, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x014d  */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    public final void applyStyle(DivPagerIndicatorView divPagerIndicatorView, ExpressionResolver expressionResolver, DivIndicator divIndicator) {
        IndicatorParams$Shape indicatorParamsShape;
        IndicatorParams$Shape indicatorParams$Shape;
        IndicatorParams$Shape indicatorParams$ShapeMultiply;
        IndicatorParams$Shape indicatorParams$ShapeMultiply$default;
        DivIndicatorItemPlacement itemsPlacementCompat;
        IndicatorParams$ItemPlacement stretch;
        long jLongValue;
        long j10;
        int i10;
        DisplayMetrics displayMetrics = divPagerIndicatorView.getResources().getDisplayMetrics();
        DivRoundedRectangleShape divRoundedRectangleShape = divIndicator.f47703d;
        DivRoundedRectangleShape divRoundedRectangleShape2 = divIndicator.f47720u;
        DivRoundedRectangleShape divRoundedRectangleShape3 = divIndicator.f47719t;
        float fDoubleValue = (float) divIndicator.f47702c.evaluate(expressionResolver).doubleValue();
        float fDoubleValue2 = (float) divIndicator.f47724y.evaluate(expressionResolver).doubleValue();
        if (divRoundedRectangleShape2 == null || (indicatorParamsShape = toIndicatorParamsShape$default(this, divRoundedRectangleShape2, displayMetrics, expressionResolver, divIndicator.f47718s, 0.0f, 8, (Object) null)) == null) {
            if (divRoundedRectangleShape != null) {
                indicatorParamsShape = toIndicatorParamsShape(divRoundedRectangleShape, displayMetrics, expressionResolver, divIndicator.f47718s, 1 / fDoubleValue);
            } else {
                indicatorParamsShape = divRoundedRectangleShape3 != null ? toIndicatorParamsShape(divRoundedRectangleShape3, displayMetrics, expressionResolver, divIndicator.f47718s, fDoubleValue2) : null;
                if (indicatorParamsShape == null) {
                    indicatorParamsShape = toIndicatorParamsShape$default(this, divIndicator.E, displayMetrics, expressionResolver, divIndicator.f47718s, 0.0f, 8, (Object) null);
                }
            }
        }
        IndicatorParams$Shape indicatorParams$Shape2 = indicatorParamsShape;
        if (divRoundedRectangleShape != null) {
            indicatorParams$Shape = indicatorParams$Shape2;
            indicatorParams$ShapeMultiply = toIndicatorParamsShape$default(this, divRoundedRectangleShape, displayMetrics, expressionResolver, divIndicator.f47701b, 0.0f, 8, (Object) null);
            if (indicatorParams$ShapeMultiply == null) {
            }
            IndicatorParams$Shape indicatorParams$Shape3 = indicatorParams$ShapeMultiply;
            if (divRoundedRectangleShape3 != null || (indicatorParams$ShapeMultiply$default = toIndicatorParamsShape$default(this, divRoundedRectangleShape3, displayMetrics, expressionResolver, divIndicator.f47718s, 0.0f, 8, (Object) null)) == null) {
                indicatorParams$ShapeMultiply$default = multiply$default(this, indicatorParams$Shape, fDoubleValue2, null, 2, null);
            }
            IndicatorParams$Shape indicatorParams$Shape4 = indicatorParams$ShapeMultiply$default;
            IndicatorParams$Animation indicatorParams$AnimationConvert = convert(divIndicator.f47707h.evaluate(expressionResolver));
            itemsPlacementCompat = getItemsPlacementCompat(divIndicator);
            if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.b) {
                stretch = new IndicatorParams$ItemPlacement.Default(BaseDivViewExtensionsKt.toPx(((DivIndicatorItemPlacement.b) itemsPlacementCompat).c().f46973a, displayMetrics, expressionResolver));
            } else {
                if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.c) {
                    throw new NoWhenBranchMatchedException();
                }
                DivIndicatorItemPlacement.c cVar = (DivIndicatorItemPlacement.c) itemsPlacementCompat;
                float px = BaseDivViewExtensionsKt.toPx(cVar.c().f49117a, displayMetrics, expressionResolver);
                jLongValue = cVar.c().f49118b.evaluate(expressionResolver).longValue();
                j10 = jLongValue >> 31;
                if (j10 != 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                stretch = new IndicatorParams$ItemPlacement.Stretch(px, i10);
            }
            divPagerIndicatorView.setStyle(new IndicatorParams$Style(indicatorParams$AnimationConvert, indicatorParams$Shape3, indicatorParams$Shape, indicatorParams$Shape4, stretch));
        }
        indicatorParams$Shape = indicatorParams$Shape2;
        indicatorParams$ShapeMultiply = multiply(indicatorParams$Shape, fDoubleValue, divIndicator.f47701b.evaluate(expressionResolver));
        IndicatorParams$Shape indicatorParams$Shape5 = indicatorParams$ShapeMultiply;
        if (divRoundedRectangleShape3 != null) {
            indicatorParams$ShapeMultiply$default = multiply$default(this, indicatorParams$Shape, fDoubleValue2, null, 2, null);
        } else {
            indicatorParams$ShapeMultiply$default = multiply$default(this, indicatorParams$Shape, fDoubleValue2, null, 2, null);
        }
        IndicatorParams$Shape indicatorParams$Shape6 = indicatorParams$ShapeMultiply$default;
        IndicatorParams$Animation indicatorParams$AnimationConvert2 = convert(divIndicator.f47707h.evaluate(expressionResolver));
        itemsPlacementCompat = getItemsPlacementCompat(divIndicator);
        if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.b) {
            stretch = new IndicatorParams$ItemPlacement.Default(BaseDivViewExtensionsKt.toPx(((DivIndicatorItemPlacement.b) itemsPlacementCompat).c().f46973a, displayMetrics, expressionResolver));
        } else {
            if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.c) {
                throw new NoWhenBranchMatchedException();
            }
            DivIndicatorItemPlacement.c cVar2 = (DivIndicatorItemPlacement.c) itemsPlacementCompat;
            float px2 = BaseDivViewExtensionsKt.toPx(cVar2.c().f49117a, displayMetrics, expressionResolver);
            jLongValue = cVar2.c().f49118b.evaluate(expressionResolver).longValue();
            j10 = jLongValue >> 31;
            if (j10 != 0) {
                i10 = (int) jLongValue;
            } else {
                i10 = (int) jLongValue;
            }
            stretch = new IndicatorParams$ItemPlacement.Stretch(px2, i10);
        }
        divPagerIndicatorView.setStyle(new IndicatorParams$Style(indicatorParams$AnimationConvert2, indicatorParams$Shape5, indicatorParams$Shape, indicatorParams$Shape6, stretch));
    }

    private final DivIndicatorItemPlacement getItemsPlacementCompat(DivIndicator divIndicator) {
        DivIndicatorItemPlacement divIndicatorItemPlacement = divIndicator.f47721v;
        return divIndicatorItemPlacement == null ? new DivIndicatorItemPlacement.b(new DivDefaultIndicatorItemPlacement(divIndicator.F)) : divIndicatorItemPlacement;
    }

    private final IndicatorParams$Shape multiply(IndicatorParams$Shape indicatorParams$Shape, float f10, Integer num) {
        if (!(indicatorParams$Shape instanceof IndicatorParams$Shape.RoundedRect)) {
            if (indicatorParams$Shape instanceof IndicatorParams$Shape.Circle) {
                return Companion.createCircle$div_release(num != null ? num.intValue() : indicatorParams$Shape.getColor(), ((IndicatorParams$Shape.Circle) indicatorParams$Shape).getItemSize().getRadius(), f10);
            }
            throw new NoWhenBranchMatchedException();
        }
        Companion companion = Companion;
        int iIntValue = num != null ? num.intValue() : indicatorParams$Shape.getColor();
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) indicatorParams$Shape;
        return companion.createRoundedRectangle$div_release(iIntValue, roundedRect.getItemSize().getItemWidth(), roundedRect.getItemSize().getItemHeight(), roundedRect.getItemSize().getCornerRadius(), f10, Float.valueOf(roundedRect.getStrokeWidth()), Integer.valueOf(roundedRect.getStrokeColor()));
    }

    public static /* synthetic */ IndicatorParams$Shape multiply$default(DivIndicatorBinder divIndicatorBinder, IndicatorParams$Shape indicatorParams$Shape, float f10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return divIndicatorBinder.multiply(indicatorParams$Shape, f10, num);
    }

    public static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, DivShape divShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(divShape, displayMetrics, expressionResolver, (Expression<Integer>) expression, f10);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivPagerIndicatorView divPagerIndicatorView, BindingContext bindingContext, final DivIndicator divIndicator, DivIndicator divIndicator2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
        l<? super DivIndicator.Animation, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bind$callback$1
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
                this.this$0.applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
            }
        };
        divPagerIndicatorView.addSubscription(divIndicator.f47707h.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f47701b.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f47702c.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f47718s.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f47724y.observe(expressionResolver, lVar));
        ExpressionSubscribersKt.observeShape(divPagerIndicatorView, divIndicator.E, expressionResolver, lVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.f47703d, expressionResolver, lVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.f47720u, expressionResolver, lVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.f47719t, expressionResolver, lVar);
        DivIndicatorItemPlacement itemsPlacementCompat = getItemsPlacementCompat(divIndicator);
        if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.b) {
            DivIndicatorItemPlacement.b bVar = (DivIndicatorItemPlacement.b) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(bVar.c().f46973a.f47188b.observe(expressionResolver, lVar));
            divPagerIndicatorView.addSubscription(bVar.c().f46973a.f47187a.observe(expressionResolver, lVar));
        } else if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.c) {
            DivIndicatorItemPlacement.c cVar = (DivIndicatorItemPlacement.c) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(cVar.c().f49117a.f47188b.observe(expressionResolver, lVar));
            divPagerIndicatorView.addSubscription(cVar.c().f49117a.f47187a.observe(expressionResolver, lVar));
            divPagerIndicatorView.addSubscription(cVar.c().f49118b.observe(expressionResolver, lVar));
        }
        observeWidthAndHeightSubscription(divPagerIndicatorView, divIndicator, expressionResolver, lVar);
    }

    public final IndicatorParams$Animation convert(DivIndicator.Animation animation) {
        if (animation == DivIndicator.Animation.WORM) {
            return IndicatorParams$Animation.WORM;
        }
        return animation == DivIndicator.Animation.SLIDER ? IndicatorParams$Animation.SLIDER : IndicatorParams$Animation.SCALE;
    }

    public DivIndicatorBinder(DivBaseBinder divBaseBinder, PagerIndicatorConnector pagerIndicatorConnector) {
        super(divBaseBinder);
        this.pagerIndicatorConnector = pagerIndicatorConnector;
    }

    private final void observeWidthAndHeightSubscription(DivPagerIndicatorView divPagerIndicatorView, e2 e2Var, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        Object objB = e2Var.getWidth().b();
        if (objB instanceof DivFixedSize) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (DivFixedSize) objB, expressionResolver, lVar);
        }
        Object objB2 = e2Var.getHeight().b();
        if (objB2 instanceof DivFixedSize) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (DivFixedSize) objB2, expressionResolver, lVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, com.yandex.div.core.util.SearchRoute] */
    public void bindView(BindingContext bindingContext, DivPagerIndicatorView divPagerIndicatorView, Div.h hVar) {
        e2 e2Var;
        boolean z10;
        Div divRootDiv$div_release = bindingContext.getDivView().rootDiv$div_release();
        if (divRootDiv$div_release != null) {
            ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
            e2 e2VarB = hVar.b();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ArrayList<SearchRoute> arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator itZ = v.z(DivTreeWalkKt.walk(divRootDiv$div_release, expressionResolver).onEnter(new l<Div, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // bk.l
                public final Boolean invoke(Div div) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onEnter();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onEnter();
                    }
                    return Boolean.TRUE;
                }
            }).onLeave(new l<Div, r>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Div div) {
                    invoke2(div);
                    return r.f64562a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Div div) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onLeave();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onLeave();
                    }
                }
            }).iterator());
            while (true) {
                boolean z11 = false;
                e2Var = null;
                if (!itZ.hasNext()) {
                    break;
                }
                e2 e2VarB2 = ((DivItemBuilderResult) ((d0) itZ.next()).b()).getDiv().b();
                if (e2VarB2 == e2VarB) {
                    for (SearchRoute searchRoute : arrayList) {
                        if (((e2) searchRoute.getItem()) != null) {
                            linkedHashMap.put(searchRoute.getItem(), Integer.valueOf(searchRoute.distance()));
                        }
                    }
                    arrayList.clear();
                    ref$ObjectRef.element = new SearchRoute(null);
                }
                if (e2VarB2 instanceof DivPager) {
                    DivPager divPager = (DivPager) e2VarB2;
                    if (hVar.c().A == null || p.e(divPager.getId(), hVar.c().A)) {
                        z11 = true;
                    }
                    if (z11) {
                        T t10 = ref$ObjectRef.element;
                        if (t10 != 0) {
                            linkedHashMap.put(e2VarB2, Integer.valueOf(((SearchRoute) t10).distance()));
                        } else {
                            arrayList.add(new SearchRoute(e2VarB2));
                        }
                    }
                }
            }
            Integer num = (Integer) b0.u0(linkedHashMap.values());
            if (num != null) {
                int iIntValue = num.intValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() == iIntValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap2.keySet();
                if (!setKeySet.isEmpty()) {
                    if (setKeySet.size() > 1) {
                        Log.w("SearchUtil", "Distance clash when searching for the nearest " + s.b(DivPager.class).i() + ". First found is taken");
                    }
                    e2Var = (e2) b0.e0(setKeySet);
                }
            }
            DivPager divPager2 = (DivPager) e2Var;
            if (divPager2 != null) {
                this.pagerIndicatorConnector.submitIndicator$div_release(divPagerIndicatorView, divPager2);
            }
        }
        super.bindView(bindingContext, divPagerIndicatorView, hVar);
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(DivShape divShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f10) {
        if (divShape instanceof DivShape.c) {
            return toIndicatorParamsShape(((DivShape.c) divShape).c(), displayMetrics, expressionResolver, expression, f10);
        }
        if (!(divShape instanceof DivShape.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Companion.createCircle$div_release(expression.evaluate(expressionResolver).intValue(), BaseDivViewExtensionsKt.toPxF(((DivShape.a) divShape).c().f46599b, displayMetrics, expressionResolver), f10);
    }
}

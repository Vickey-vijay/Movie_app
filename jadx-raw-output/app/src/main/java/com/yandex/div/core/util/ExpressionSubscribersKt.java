package com.yandex.div.core.util;

import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivCircleShape;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivNinePatchBackground;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixed;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivWrapContentSize;
import java.util.Iterator;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: ExpressionSubscribers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExpressionSubscribersKt {
    public static final void observeAbsoluteEdgeInsets(ExpressionSubscriber expressionSubscriber, DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divAbsoluteEdgeInsets == null) {
            return;
        }
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f45978b.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f45980d.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f45979c.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f45977a.observe(expressionResolver, lVar));
    }

    public static final void observeBackground(ExpressionSubscriber expressionSubscriber, DivBackground divBackground, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divBackground != null) {
            if (divBackground instanceof DivBackground.f) {
                expressionSubscriber.addSubscription(((DivBackground.f) divBackground).c().f49006a.observe(expressionResolver, lVar));
                return;
            }
            if (divBackground instanceof DivBackground.b) {
                DivImageBackground divImageBackgroundC = ((DivBackground.b) divBackground).c();
                expressionSubscriber.addSubscription(divImageBackgroundC.f47586a.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f47590e.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f47587b.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f47588c.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f47591f.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f47592g.observe(expressionResolver, lVar));
                List<DivFilter> list = divImageBackgroundC.f47589d;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        observeFilter(expressionSubscriber, (DivFilter) it.next(), expressionResolver, lVar);
                    }
                    return;
                }
                return;
            }
            if (divBackground instanceof DivBackground.c) {
                DivLinearGradient divLinearGradientC = ((DivBackground.c) divBackground).c();
                expressionSubscriber.addSubscription(divLinearGradientC.f48038a.observe(expressionResolver, lVar));
                ExpressionList<Integer> expressionList = divLinearGradientC.f48040c;
                expressionSubscriber.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, lVar) : null);
                List<DivLinearGradient.ColorPoint> list2 = divLinearGradientC.f48039b;
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        observeColorPoint(expressionSubscriber, (DivLinearGradient.ColorPoint) it2.next(), expressionResolver, lVar);
                    }
                    return;
                }
                return;
            }
            if (!(divBackground instanceof DivBackground.e)) {
                if (divBackground instanceof DivBackground.d) {
                    DivNinePatchBackground divNinePatchBackgroundC = ((DivBackground.d) divBackground).c();
                    expressionSubscriber.addSubscription(divNinePatchBackgroundC.f48077a.observe(expressionResolver, lVar));
                    observeAbsoluteEdgeInsets(expressionSubscriber, divNinePatchBackgroundC.f48078b, expressionResolver, lVar);
                    return;
                }
                return;
            }
            DivRadialGradient divRadialGradientC = ((DivBackground.e) divBackground).c();
            ExpressionList<Integer> expressionList2 = divRadialGradientC.f48433d;
            expressionSubscriber.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, lVar) : null);
            observeRadialGradientCenter(expressionSubscriber, divRadialGradientC.f48430a, expressionResolver, lVar);
            observeRadialGradientCenter(expressionSubscriber, divRadialGradientC.f48431b, expressionResolver, lVar);
            observeRadialGradientRadius(expressionSubscriber, divRadialGradientC.f48434e, expressionResolver, lVar);
        }
    }

    public static final void observeCircleShape(ExpressionSubscriber expressionSubscriber, DivCircleShape divCircleShape, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divCircleShape == null) {
            return;
        }
        Expression<Integer> expression = divCircleShape.f46598a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        observeFixedSize(expressionSubscriber, divCircleShape.f46599b, expressionResolver, lVar);
        observeStroke(expressionSubscriber, divCircleShape.f46600c, expressionResolver, lVar);
    }

    public static final void observeColorPoint(ExpressionSubscriber expressionSubscriber, DivLinearGradient.ColorPoint colorPoint, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (colorPoint == null) {
            return;
        }
        expressionSubscriber.addSubscription(colorPoint.f48044a.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(colorPoint.f48045b.observe(expressionResolver, lVar));
    }

    public static final void observeDrawable(ExpressionSubscriber expressionSubscriber, DivDrawable divDrawable, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divDrawable == null || !(divDrawable instanceof DivDrawable.b)) {
            return;
        }
        DivShapeDrawable divShapeDrawableC = ((DivDrawable.b) divDrawable).c();
        expressionSubscriber.addSubscription(divShapeDrawableC.f48788a.observe(expressionResolver, lVar));
        observeShape(expressionSubscriber, divShapeDrawableC.f48789b, expressionResolver, lVar);
        observeStroke(expressionSubscriber, divShapeDrawableC.f48790c, expressionResolver, lVar);
    }

    public static final void observeEdgeInsets(ExpressionSubscriber expressionSubscriber, DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divEdgeInsets == null) {
            return;
        }
        expressionSubscriber.addSubscription(divEdgeInsets.f47059f.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divEdgeInsets.f47054a.observe(expressionResolver, lVar));
        Expression<Long> expression = divEdgeInsets.f47058e;
        if (expression == null && divEdgeInsets.f47055b == null) {
            expressionSubscriber.addSubscription(divEdgeInsets.f47056c.observe(expressionResolver, lVar));
            expressionSubscriber.addSubscription(divEdgeInsets.f47057d.observe(expressionResolver, lVar));
        } else {
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
            Expression<Long> expression2 = divEdgeInsets.f47055b;
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
        }
    }

    public static final void observeFilter(ExpressionSubscriber expressionSubscriber, DivFilter divFilter, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divFilter == null || (divFilter instanceof DivFilter.c) || !(divFilter instanceof DivFilter.a)) {
            return;
        }
        expressionSubscriber.addSubscription(((DivFilter.a) divFilter).c().f46529a.observe(expressionResolver, lVar));
    }

    public static final void observeFixedSize(ExpressionSubscriber expressionSubscriber, DivFixedSize divFixedSize, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divFixedSize == null) {
            return;
        }
        expressionSubscriber.addSubscription(divFixedSize.f47188b.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divFixedSize.f47187a.observe(expressionResolver, lVar));
    }

    public static final void observePivot(ExpressionSubscriber expressionSubscriber, DivPivot divPivot, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divPivot != null) {
            if (!(divPivot instanceof DivPivot.b)) {
                if (divPivot instanceof DivPivot.c) {
                    expressionSubscriber.addSubscription(((DivPivot.c) divPivot).c().f48407a.observe(expressionResolver, lVar));
                }
            } else {
                DivPivotFixed divPivotFixedC = ((DivPivot.b) divPivot).c();
                Expression<Long> expression = divPivotFixedC.f48392b;
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
                expressionSubscriber.addSubscription(divPivotFixedC.f48391a.observe(expressionResolver, lVar));
            }
        }
    }

    public static final void observeRadialGradientCenter(ExpressionSubscriber expressionSubscriber, DivRadialGradientCenter divRadialGradientCenter, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divRadialGradientCenter != null) {
            if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
                DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
                expressionSubscriber.addSubscription(bVar.c().f48453a.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(bVar.c().f48454b.observe(expressionResolver, lVar));
            } else if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
                expressionSubscriber.addSubscription(((DivRadialGradientCenter.c) divRadialGradientCenter).c().f48478a.observe(expressionResolver, lVar));
            }
        }
    }

    public static final void observeRadialGradientRadius(ExpressionSubscriber expressionSubscriber, DivRadialGradientRadius divRadialGradientRadius, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divRadialGradientRadius != null) {
            if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
                DivRadialGradientRadius.b bVar = (DivRadialGradientRadius.b) divRadialGradientRadius;
                expressionSubscriber.addSubscription(bVar.c().f47187a.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(bVar.c().f47188b.observe(expressionResolver, lVar));
            } else if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
                expressionSubscriber.addSubscription(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f48485a.observe(expressionResolver, lVar));
            }
        }
    }

    public static final void observeRoundedRectangleShape(ExpressionSubscriber expressionSubscriber, DivRoundedRectangleShape divRoundedRectangleShape, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divRoundedRectangleShape == null) {
            return;
        }
        Expression<Integer> expression = divRoundedRectangleShape.f48515a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.f48516b, expressionResolver, lVar);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.f48518d, expressionResolver, lVar);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.f48517c, expressionResolver, lVar);
        observeStroke(expressionSubscriber, divRoundedRectangleShape.f48519e, expressionResolver, lVar);
    }

    public static final void observeShape(ExpressionSubscriber expressionSubscriber, DivShape divShape, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divShape != null) {
            if (divShape instanceof DivShape.c) {
                observeRoundedRectangleShape(expressionSubscriber, ((DivShape.c) divShape).c(), expressionResolver, lVar);
            } else if (divShape instanceof DivShape.a) {
                observeCircleShape(expressionSubscriber, ((DivShape.a) divShape).c(), expressionResolver, lVar);
            }
        }
    }

    public static final void observeSize(ExpressionSubscriber expressionSubscriber, DivSize divSize, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        Expression<DivSizeUnit> expression;
        Expression<Long> expression2;
        Expression<DivSizeUnit> expression3;
        Expression<Long> expression4;
        Expression<DivSizeUnit> expression5;
        Expression<Long> expression6;
        Expression<DivSizeUnit> expression7;
        Expression<Long> expression8;
        if (divSize != null) {
            if (divSize instanceof DivSize.b) {
                DivFixedSize divFixedSizeC = ((DivSize.b) divSize).c();
                expressionSubscriber.addSubscription(divFixedSizeC.f47188b.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divFixedSizeC.f47187a.observe(expressionResolver, lVar));
                return;
            }
            Disposable disposableObserve = null;
            if (divSize instanceof DivSize.c) {
                DivMatchParentSize divMatchParentSizeC = ((DivSize.c) divSize).c();
                Expression<Double> expression9 = divMatchParentSizeC.f48061c;
                expressionSubscriber.addSubscription(expression9 != null ? expression9.observe(expressionResolver, lVar) : null);
                DivSizeUnitValue divSizeUnitValue = divMatchParentSizeC.f48060b;
                expressionSubscriber.addSubscription((divSizeUnitValue == null || (expression8 = divSizeUnitValue.f48817b) == null) ? null : expression8.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue2 = divMatchParentSizeC.f48060b;
                expressionSubscriber.addSubscription((divSizeUnitValue2 == null || (expression7 = divSizeUnitValue2.f48816a) == null) ? null : expression7.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue3 = divMatchParentSizeC.f48059a;
                expressionSubscriber.addSubscription((divSizeUnitValue3 == null || (expression6 = divSizeUnitValue3.f48817b) == null) ? null : expression6.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue4 = divMatchParentSizeC.f48059a;
                if (divSizeUnitValue4 != null && (expression5 = divSizeUnitValue4.f48816a) != null) {
                    disposableObserve = expression5.observe(expressionResolver, lVar);
                }
                expressionSubscriber.addSubscription(disposableObserve);
                return;
            }
            if (divSize instanceof DivSize.d) {
                DivWrapContentSize divWrapContentSizeC = ((DivSize.d) divSize).c();
                Expression<Boolean> expression10 = divWrapContentSizeC.f50125a;
                expressionSubscriber.addSubscription(expression10 != null ? expression10.observe(expressionResolver, lVar) : null);
                DivSizeUnitValue divSizeUnitValue5 = divWrapContentSizeC.f50127c;
                expressionSubscriber.addSubscription((divSizeUnitValue5 == null || (expression4 = divSizeUnitValue5.f48817b) == null) ? null : expression4.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue6 = divWrapContentSizeC.f50127c;
                expressionSubscriber.addSubscription((divSizeUnitValue6 == null || (expression3 = divSizeUnitValue6.f48816a) == null) ? null : expression3.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue7 = divWrapContentSizeC.f50126b;
                expressionSubscriber.addSubscription((divSizeUnitValue7 == null || (expression2 = divSizeUnitValue7.f48817b) == null) ? null : expression2.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue8 = divWrapContentSizeC.f50126b;
                if (divSizeUnitValue8 != null && (expression = divSizeUnitValue8.f48816a) != null) {
                    disposableObserve = expression.observe(expressionResolver, lVar);
                }
                expressionSubscriber.addSubscription(disposableObserve);
            }
        }
    }

    public static final void observeStroke(ExpressionSubscriber expressionSubscriber, DivStroke divStroke, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divStroke == null) {
            return;
        }
        expressionSubscriber.addSubscription(divStroke.f49131a.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divStroke.f49134d.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divStroke.f49133c.observe(expressionResolver, lVar));
    }

    public static final void observeTransform(ExpressionSubscriber expressionSubscriber, DivTransform divTransform, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (divTransform == null) {
            return;
        }
        Expression<Double> expression = divTransform.f49901c;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        observePivot(expressionSubscriber, divTransform.f49899a, expressionResolver, lVar);
        observePivot(expressionSubscriber, divTransform.f49900b, expressionResolver, lVar);
    }
}

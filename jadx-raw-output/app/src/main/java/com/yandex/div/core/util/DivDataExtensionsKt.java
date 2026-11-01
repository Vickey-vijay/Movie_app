package com.yandex.div.core.util;

import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTransform;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nj.b0;
import nj.s;
import qj.b;

/* JADX INFO: compiled from: DivDataExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivDataExtensionsKt {
    public static final boolean equalsToConstant(DivSize divSize, DivSize divSize2) {
        if (divSize == null) {
            if (divSize2 == null) {
                return true;
            }
        } else if (!(divSize instanceof DivSize.b)) {
            if (divSize instanceof DivSize.c) {
                if (divSize2 instanceof DivSize.c) {
                    DivSize.c cVar = (DivSize.c) divSize;
                    DivSize.c cVar2 = (DivSize.c) divSize2;
                    if (ExpressionsKt.equalsToConstant(cVar.c().f48061c, cVar2.c().f48061c)) {
                        DivSizeUnitValue divSizeUnitValue = cVar.c().f48060b;
                        Expression<Long> expression = divSizeUnitValue != null ? divSizeUnitValue.f48817b : null;
                        DivSizeUnitValue divSizeUnitValue2 = cVar2.c().f48060b;
                        if (ExpressionsKt.equalsToConstant(expression, divSizeUnitValue2 != null ? divSizeUnitValue2.f48817b : null)) {
                            DivSizeUnitValue divSizeUnitValue3 = cVar.c().f48060b;
                            Expression<DivSizeUnit> expression2 = divSizeUnitValue3 != null ? divSizeUnitValue3.f48816a : null;
                            DivSizeUnitValue divSizeUnitValue4 = cVar2.c().f48060b;
                            if (ExpressionsKt.equalsToConstant(expression2, divSizeUnitValue4 != null ? divSizeUnitValue4.f48816a : null)) {
                                DivSizeUnitValue divSizeUnitValue5 = cVar.c().f48059a;
                                Expression<Long> expression3 = divSizeUnitValue5 != null ? divSizeUnitValue5.f48817b : null;
                                DivSizeUnitValue divSizeUnitValue6 = cVar2.c().f48059a;
                                if (ExpressionsKt.equalsToConstant(expression3, divSizeUnitValue6 != null ? divSizeUnitValue6.f48817b : null)) {
                                    DivSizeUnitValue divSizeUnitValue7 = cVar.c().f48059a;
                                    Expression<DivSizeUnit> expression4 = divSizeUnitValue7 != null ? divSizeUnitValue7.f48816a : null;
                                    DivSizeUnitValue divSizeUnitValue8 = cVar2.c().f48059a;
                                    if (ExpressionsKt.equalsToConstant(expression4, divSizeUnitValue8 != null ? divSizeUnitValue8.f48816a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(divSize instanceof DivSize.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (divSize2 instanceof DivSize.d) {
                    DivSize.d dVar = (DivSize.d) divSize;
                    DivSize.d dVar2 = (DivSize.d) divSize2;
                    if (ExpressionsKt.equalsToConstant(dVar.c().f50125a, dVar2.c().f50125a)) {
                        DivSizeUnitValue divSizeUnitValue9 = dVar.c().f50127c;
                        Expression<Long> expression5 = divSizeUnitValue9 != null ? divSizeUnitValue9.f48817b : null;
                        DivSizeUnitValue divSizeUnitValue10 = dVar2.c().f50127c;
                        if (ExpressionsKt.equalsToConstant(expression5, divSizeUnitValue10 != null ? divSizeUnitValue10.f48817b : null)) {
                            DivSizeUnitValue divSizeUnitValue11 = dVar.c().f50127c;
                            Expression<DivSizeUnit> expression6 = divSizeUnitValue11 != null ? divSizeUnitValue11.f48816a : null;
                            DivSizeUnitValue divSizeUnitValue12 = dVar2.c().f50127c;
                            if (ExpressionsKt.equalsToConstant(expression6, divSizeUnitValue12 != null ? divSizeUnitValue12.f48816a : null)) {
                                DivSizeUnitValue divSizeUnitValue13 = dVar.c().f50126b;
                                Expression<Long> expression7 = divSizeUnitValue13 != null ? divSizeUnitValue13.f48817b : null;
                                DivSizeUnitValue divSizeUnitValue14 = dVar2.c().f50126b;
                                if (ExpressionsKt.equalsToConstant(expression7, divSizeUnitValue14 != null ? divSizeUnitValue14.f48817b : null)) {
                                    DivSizeUnitValue divSizeUnitValue15 = dVar.c().f50126b;
                                    Expression<DivSizeUnit> expression8 = divSizeUnitValue15 != null ? divSizeUnitValue15.f48816a : null;
                                    DivSizeUnitValue divSizeUnitValue16 = dVar2.c().f50126b;
                                    if (ExpressionsKt.equalsToConstant(expression8, divSizeUnitValue16 != null ? divSizeUnitValue16.f48816a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (divSize2 instanceof DivSize.b) {
            DivSize.b bVar = (DivSize.b) divSize;
            DivSize.b bVar2 = (DivSize.b) divSize2;
            if (ExpressionsKt.equalsToConstant(bVar.c().f47188b, bVar2.c().f47188b) && ExpressionsKt.equalsToConstant(bVar.c().f47187a, bVar2.c().f47187a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(DivSize divSize) {
        if (divSize != null) {
            if (divSize instanceof DivSize.b) {
                DivSize.b bVar = (DivSize.b) divSize;
                if (!ExpressionsKt.isConstant(bVar.c().f47188b) || !ExpressionsKt.isConstant(bVar.c().f47187a)) {
                    return false;
                }
            } else {
                if (divSize instanceof DivSize.c) {
                    DivSize.c cVar = (DivSize.c) divSize;
                    if (!ExpressionsKt.isConstantOrNull(cVar.c().f48061c)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue = cVar.c().f48060b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue != null ? divSizeUnitValue.f48817b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue2 = cVar.c().f48060b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue2 != null ? divSizeUnitValue2.f48816a : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue3 = cVar.c().f48059a;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue3 != null ? divSizeUnitValue3.f48817b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue4 = cVar.c().f48059a;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue4 != null ? divSizeUnitValue4.f48816a : null)) {
                        return false;
                    }
                } else {
                    if (!(divSize instanceof DivSize.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DivSize.d dVar = (DivSize.d) divSize;
                    if (!ExpressionsKt.isConstantOrNull(dVar.c().f50125a)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue5 = dVar.c().f50127c;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue5 != null ? divSizeUnitValue5.f48817b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue6 = dVar.c().f50127c;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue6 != null ? divSizeUnitValue6.f48816a : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue7 = dVar.c().f50126b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue7 != null ? divSizeUnitValue7.f48817b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue8 = dVar.c().f50126b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue8 != null ? divSizeUnitValue8.f48816a : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final Colormap toColormap(DivLinearGradient divLinearGradient, final ExpressionResolver expressionResolver) {
        List<DivLinearGradient.ColorPoint> list = divLinearGradient.f48039b;
        List listH0 = list != null ? b0.H0(list, new Comparator() { // from class: com.yandex.div.core.util.DivDataExtensionsKt$toColormap$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return b.d(((DivLinearGradient.ColorPoint) t10).f48045b.evaluate(expressionResolver), ((DivLinearGradient.ColorPoint) t11).f48045b.evaluate(expressionResolver));
            }
        }) : null;
        ExpressionList<Integer> expressionList = divLinearGradient.f48040c;
        if (listH0 == null) {
            return expressionList != null ? new Colormap(b0.N0(expressionList.evaluate(expressionResolver)), null, 2, null) : Colormap.EMPTY;
        }
        int[] iArr = new int[listH0.size()];
        float[] fArr = new float[listH0.size()];
        int size = listH0.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((DivLinearGradient.ColorPoint) listH0.get(i10)).f48044a.evaluate(expressionResolver).intValue();
            fArr[i10] = (float) ((DivLinearGradient.ColorPoint) listH0.get(i10)).f48045b.evaluate(expressionResolver).doubleValue();
        }
        return new Colormap(iArr, fArr);
    }

    public static final boolean isConstant(DivFixedSize divFixedSize) {
        if (divFixedSize == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divFixedSize.f47188b) && ExpressionsKt.isConstant(divFixedSize.f47187a);
    }

    public static final boolean isConstant(DivEdgeInsets divEdgeInsets) {
        if (divEdgeInsets == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divEdgeInsets.f47056c) && ExpressionsKt.isConstant(divEdgeInsets.f47059f) && ExpressionsKt.isConstant(divEdgeInsets.f47057d) && ExpressionsKt.isConstant(divEdgeInsets.f47054a) && ExpressionsKt.isConstantOrNull(divEdgeInsets.f47058e) && ExpressionsKt.isConstantOrNull(divEdgeInsets.f47055b);
    }

    public static final boolean equalsToConstant(DivFixedSize divFixedSize, DivFixedSize divFixedSize2) {
        if (divFixedSize == null && divFixedSize2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divFixedSize != null ? divFixedSize.f47188b : null, divFixedSize2 != null ? divFixedSize2.f47188b : null)) {
            if (ExpressionsKt.equalsToConstant(divFixedSize != null ? divFixedSize.f47187a : null, divFixedSize2 != null ? divFixedSize2.f47187a : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2) {
        if (divEdgeInsets == null && divEdgeInsets2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f47056c : null, divEdgeInsets2 != null ? divEdgeInsets2.f47056c : null)) {
            if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f47059f : null, divEdgeInsets2 != null ? divEdgeInsets2.f47059f : null)) {
                if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f47057d : null, divEdgeInsets2 != null ? divEdgeInsets2.f47057d : null)) {
                    if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f47054a : null, divEdgeInsets2 != null ? divEdgeInsets2.f47054a : null)) {
                        if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f47058e : null, divEdgeInsets2 != null ? divEdgeInsets2.f47058e : null)) {
                            if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f47055b : null, divEdgeInsets2 != null ? divEdgeInsets2.f47055b : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) {
        if (divAbsoluteEdgeInsets == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f45978b) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f45980d) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f45979c) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f45977a);
    }

    public static final boolean isConstant(DivTransform divTransform) {
        if (divTransform == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divTransform.f49901c) && isConstant(divTransform.f49899a) && isConstant(divTransform.f49900b);
    }

    public static final boolean equalsToConstant(DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, DivAbsoluteEdgeInsets divAbsoluteEdgeInsets2) {
        if (divAbsoluteEdgeInsets == null && divAbsoluteEdgeInsets2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f45978b : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f45978b : null)) {
            if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f45980d : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f45980d : null)) {
                if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f45979c : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f45979c : null)) {
                    if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f45977a : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f45977a : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(DivPivot divPivot) {
        if (divPivot == null) {
            return true;
        }
        if (divPivot instanceof DivPivot.b) {
            DivPivot.b bVar = (DivPivot.b) divPivot;
            return ExpressionsKt.isConstantOrNull(bVar.c().f48392b) && ExpressionsKt.isConstantOrNull(bVar.c().f48392b);
        }
        if (divPivot instanceof DivPivot.c) {
            return ExpressionsKt.isConstant(((DivPivot.c) divPivot).c().f48407a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(DivTransform divTransform, DivTransform divTransform2) {
        if (divTransform == null && divTransform2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divTransform != null ? divTransform.f49901c : null, divTransform2 != null ? divTransform2.f49901c : null)) {
            if (equalsToConstant(divTransform != null ? divTransform.f49899a : null, divTransform2 != null ? divTransform2.f49899a : null)) {
                if (equalsToConstant(divTransform != null ? divTransform.f49900b : null, divTransform2 != null ? divTransform2.f49900b : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(DivFilter divFilter) {
        if (divFilter == null || (divFilter instanceof DivFilter.c)) {
            return true;
        }
        if (divFilter instanceof DivFilter.a) {
            return ExpressionsKt.isConstant(((DivFilter.a) divFilter).c().f46529a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(DivDrawable divDrawable) {
        if (divDrawable == null) {
            return true;
        }
        if (!(divDrawable instanceof DivDrawable.b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivDrawable.b bVar = (DivDrawable.b) divDrawable;
        return ExpressionsKt.isConstant(bVar.c().f48788a) && isConstant(bVar.c().f48789b) && isConstant(bVar.c().f48790c);
    }

    public static final boolean equalsToConstant(DivPivot divPivot, DivPivot divPivot2) {
        if (divPivot == null) {
            if (divPivot2 == null) {
                return true;
            }
        } else if (divPivot instanceof DivPivot.b) {
            if (divPivot2 instanceof DivPivot.b) {
                DivPivot.b bVar = (DivPivot.b) divPivot;
                DivPivot.b bVar2 = (DivPivot.b) divPivot2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f48392b, bVar2.c().f48392b) && ExpressionsKt.equalsToConstant(bVar.c().f48391a, bVar2.c().f48391a)) {
                    return true;
                }
            }
        } else {
            if (!(divPivot instanceof DivPivot.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divPivot2 instanceof DivPivot.c) && ExpressionsKt.equalsToConstant(((DivPivot.c) divPivot).c().f48407a, ((DivPivot.c) divPivot2).c().f48407a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(DivShape divShape) {
        if (divShape != null) {
            if (divShape instanceof DivShape.c) {
                DivShape.c cVar = (DivShape.c) divShape;
                if (!ExpressionsKt.isConstantOrNull(cVar.c().f48515a) || !isConstant(cVar.c().f48519e) || !isConstant(cVar.c().f48518d) || !isConstant(cVar.c().f48517c) || !isConstant(cVar.c().f48516b)) {
                    return false;
                }
            } else {
                if (!(divShape instanceof DivShape.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                DivShape.a aVar = (DivShape.a) divShape;
                if (!ExpressionsKt.isConstantOrNull(aVar.c().f46598a)) {
                    return false;
                }
                DivStroke divStroke = aVar.c().f46600c;
                if (((divStroke == null || isConstant(divStroke)) ? false : true) || !isConstant(aVar.c().f46599b)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean equalsToConstant(DivFilter divFilter, DivFilter divFilter2) {
        if (divFilter == null) {
            if (divFilter2 == null) {
                return true;
            }
        } else {
            if (divFilter instanceof DivFilter.c) {
                return divFilter2 instanceof DivFilter.c;
            }
            if (!(divFilter instanceof DivFilter.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divFilter2 instanceof DivFilter.a) && ExpressionsKt.equalsToConstant(((DivFilter.a) divFilter).c().f46529a, ((DivFilter.a) divFilter2).c().f46529a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivDrawable divDrawable, DivDrawable divDrawable2) {
        if (divDrawable == null) {
            if (divDrawable2 == null) {
                return true;
            }
        } else {
            if (!(divDrawable instanceof DivDrawable.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (divDrawable2 instanceof DivDrawable.b) {
                DivDrawable.b bVar = (DivDrawable.b) divDrawable;
                DivDrawable.b bVar2 = (DivDrawable.b) divDrawable2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f48788a, bVar2.c().f48788a) && equalsToConstant(bVar.c().f48789b, bVar2.c().f48789b) && equalsToConstant(bVar.c().f48790c, bVar2.c().f48790c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(DivStroke divStroke) {
        if (divStroke == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divStroke.f49131a) && ExpressionsKt.isConstant(divStroke.f49134d) && ExpressionsKt.isConstant(divStroke.f49133c);
    }

    public static final boolean equalsToConstant(DivShape divShape, DivShape divShape2) {
        if (divShape == null) {
            if (divShape2 == null) {
                return true;
            }
        } else if (divShape instanceof DivShape.c) {
            if (divShape2 instanceof DivShape.c) {
                DivShape.c cVar = (DivShape.c) divShape;
                DivShape.c cVar2 = (DivShape.c) divShape2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f48515a, cVar2.c().f48515a) && equalsToConstant(cVar.c().f48519e, cVar2.c().f48519e) && equalsToConstant(cVar.c().f48518d, cVar2.c().f48518d) && equalsToConstant(cVar.c().f48517c, cVar2.c().f48517c) && equalsToConstant(cVar.c().f48516b, cVar2.c().f48516b)) {
                    return true;
                }
            }
        } else {
            if (!(divShape instanceof DivShape.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (divShape2 instanceof DivShape.a) {
                DivShape.a aVar = (DivShape.a) divShape;
                DivShape.a aVar2 = (DivShape.a) divShape2;
                if (ExpressionsKt.equalsToConstant(aVar.c().f46598a, aVar2.c().f46598a) && equalsToConstant(aVar.c().f46600c, aVar2.c().f46600c) && equalsToConstant(aVar.c().f46599b, aVar2.c().f46599b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divBorder.f46537a) && isConstant(divBorder.f46538b) && ExpressionsKt.isConstant(divBorder.f46539c) && isConstant(divBorder.f46540d) && isConstant(divBorder.f46541e);
    }

    public static final boolean isConstant(DivCornersRadius divCornersRadius) {
        if (divCornersRadius == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divCornersRadius.f46838c) && ExpressionsKt.isConstantOrNull(divCornersRadius.f46839d) && ExpressionsKt.isConstantOrNull(divCornersRadius.f46837b) && ExpressionsKt.isConstantOrNull(divCornersRadius.f46836a);
    }

    public static final boolean isConstant(DivShadow divShadow) {
        if (divShadow == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divShadow.f48767a) && ExpressionsKt.isConstant(divShadow.f48768b) && ExpressionsKt.isConstant(divShadow.f48769c) && isConstant(divShadow.f48770d);
    }

    public static final boolean equalsToConstant(DivStroke divStroke, DivStroke divStroke2) {
        if (divStroke == null && divStroke2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.f49131a : null, divStroke2 != null ? divStroke2.f49131a : null)) {
            if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.f49134d : null, divStroke2 != null ? divStroke2.f49134d : null)) {
                if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.f49133c : null, divStroke2 != null ? divStroke2.f49133c : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivBorder divBorder, DivBorder divBorder2) {
        if (divBorder == null && divBorder2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divBorder != null ? divBorder.f46537a : null, divBorder2 != null ? divBorder2.f46537a : null)) {
            if (equalsToConstant(divBorder != null ? divBorder.f46538b : null, divBorder2 != null ? divBorder2.f46538b : null)) {
                if (ExpressionsKt.equalsToConstant(divBorder != null ? divBorder.f46539c : null, divBorder2 != null ? divBorder2.f46539c : null)) {
                    if (equalsToConstant(divBorder != null ? divBorder.f46540d : null, divBorder2 != null ? divBorder2.f46540d : null)) {
                        if (equalsToConstant(divBorder != null ? divBorder.f46541e : null, divBorder2 != null ? divBorder2.f46541e : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(DivPoint divPoint) {
        if (divPoint == null) {
            return true;
        }
        return isConstant(divPoint.f48418a) && isConstant(divPoint.f48419b);
    }

    public static final boolean isConstant(DivDimension divDimension) {
        if (divDimension == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divDimension.f46982a) && ExpressionsKt.isConstant(divDimension.f46983b);
    }

    public static final boolean isConstant(DivBackground divBackground) {
        boolean z10;
        if (divBackground != null) {
            if (divBackground instanceof DivBackground.f) {
                return ExpressionsKt.isConstant(((DivBackground.f) divBackground).c().f49006a);
            }
            if (divBackground instanceof DivBackground.b) {
                DivBackground.b bVar = (DivBackground.b) divBackground;
                if (!ExpressionsKt.isConstant(bVar.c().f47586a) || !ExpressionsKt.isConstant(bVar.c().f47587b) || !ExpressionsKt.isConstant(bVar.c().f47588c)) {
                    return false;
                }
                List<DivFilter> list = bVar.c().f47589d;
                if (list != null && !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = true;
                            break;
                        }
                        if (!isConstant((DivFilter) it.next())) {
                            z10 = false;
                            break;
                        }
                    }
                } else {
                    z10 = true;
                    break;
                }
                if (!z10 || !ExpressionsKt.isConstant(bVar.c().f47590e) || !ExpressionsKt.isConstant(bVar.c().f47591f) || !ExpressionsKt.isConstant(bVar.c().f47592g)) {
                    return false;
                }
            } else if (divBackground instanceof DivBackground.c) {
                DivBackground.c cVar = (DivBackground.c) divBackground;
                if (!ExpressionsKt.isConstant(cVar.c().f48038a) || !ExpressionsKt.isConstantOrNull(cVar.c().f48040c)) {
                    return false;
                }
            } else if (divBackground instanceof DivBackground.e) {
                DivBackground.e eVar = (DivBackground.e) divBackground;
                if (!isConstant(eVar.c().f48430a) || !isConstant(eVar.c().f48431b) || !ExpressionsKt.isConstantOrNull(eVar.c().f48433d) || !isConstant(eVar.c().f48434e)) {
                    return false;
                }
            } else {
                if (!(divBackground instanceof DivBackground.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                DivBackground.d dVar = (DivBackground.d) divBackground;
                if (!ExpressionsKt.isConstant(dVar.c().f48077a) || !isConstant(dVar.c().f48078b)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean equalsToConstant(DivCornersRadius divCornersRadius, DivCornersRadius divCornersRadius2) {
        if (divCornersRadius == null && divCornersRadius2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f46838c : null, divCornersRadius2 != null ? divCornersRadius2.f46838c : null)) {
            if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f46839d : null, divCornersRadius2 != null ? divCornersRadius2.f46839d : null)) {
                if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f46837b : null, divCornersRadius2 != null ? divCornersRadius2.f46837b : null)) {
                    if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f46836a : null, divCornersRadius2 != null ? divCornersRadius2.f46836a : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivShadow divShadow, DivShadow divShadow2) {
        if (divShadow == null && divShadow2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.f48767a : null, divShadow2 != null ? divShadow2.f48767a : null)) {
            if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.f48768b : null, divShadow2 != null ? divShadow2.f48768b : null)) {
                if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.f48769c : null, divShadow2 != null ? divShadow2.f48769c : null)) {
                    if (equalsToConstant(divShadow != null ? divShadow.f48770d : null, divShadow2 != null ? divShadow2.f48770d : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivPoint divPoint, DivPoint divPoint2) {
        if (divPoint == null && divPoint2 == null) {
            return true;
        }
        if (equalsToConstant(divPoint != null ? divPoint.f48418a : null, divPoint2 != null ? divPoint2.f48418a : null)) {
            if (equalsToConstant(divPoint != null ? divPoint.f48419b : null, divPoint2 != null ? divPoint2.f48419b : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivDimension divDimension, DivDimension divDimension2) {
        if (divDimension == null && divDimension2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divDimension != null ? divDimension.f46982a : null, divDimension2 != null ? divDimension2.f46982a : null)) {
            if (ExpressionsKt.equalsToConstant(divDimension != null ? divDimension.f46983b : null, divDimension2 != null ? divDimension2.f46983b : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivBackground divBackground, DivBackground divBackground2) {
        boolean z10;
        boolean z11;
        if (divBackground == null) {
            if (divBackground2 == null) {
                return true;
            }
        } else if (divBackground instanceof DivBackground.f) {
            if ((divBackground2 instanceof DivBackground.f) && ExpressionsKt.equalsToConstant(((DivBackground.f) divBackground).c().f49006a, ((DivBackground.f) divBackground2).c().f49006a)) {
                return true;
            }
        } else if (divBackground instanceof DivBackground.b) {
            DivBackground.b bVar = (DivBackground.b) divBackground;
            List<DivFilter> listK = bVar.c().f47589d;
            if (listK == null) {
                listK = s.k();
            }
            if (divBackground2 instanceof DivBackground.b) {
                DivBackground.b bVar2 = (DivBackground.b) divBackground2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f47586a, bVar2.c().f47586a) && ExpressionsKt.equalsToConstant(bVar.c().f47587b, bVar2.c().f47587b) && ExpressionsKt.equalsToConstant(bVar.c().f47588c, bVar2.c().f47588c)) {
                    List<DivFilter> listK2 = bVar2.c().f47589d;
                    if (listK2 == null) {
                        listK2 = s.k();
                    }
                    if (listK.size() == listK2.size()) {
                        Iterator<T> it = listK.iterator();
                        int i10 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                s.u();
                            }
                            if (!equalsToConstant((DivFilter) next, listK2.get(i10))) {
                                z11 = false;
                                break;
                            }
                            i10 = i11;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                    if (z11 && ExpressionsKt.equalsToConstant(bVar.c().f47590e, bVar2.c().f47590e) && ExpressionsKt.equalsToConstant(bVar.c().f47591f, bVar2.c().f47591f) && ExpressionsKt.equalsToConstant(bVar.c().f47592g, bVar2.c().f47592g)) {
                        return true;
                    }
                }
            }
        } else if (divBackground instanceof DivBackground.c) {
            DivBackground.c cVar = (DivBackground.c) divBackground;
            List<DivLinearGradient.ColorPoint> listK3 = cVar.c().f48039b;
            if (listK3 == null) {
                listK3 = s.k();
            }
            if (divBackground2 instanceof DivBackground.c) {
                DivBackground.c cVar2 = (DivBackground.c) divBackground2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f48038a, cVar2.c().f48038a) && ExpressionsKt.equalsToConstant(cVar.c().f48040c, cVar2.c().f48040c)) {
                    List<DivLinearGradient.ColorPoint> listK4 = cVar2.c().f48039b;
                    if (listK4 == null) {
                        listK4 = s.k();
                    }
                    if (listK3.size() == listK4.size()) {
                        Iterator<T> it2 = listK3.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                z10 = true;
                                break;
                            }
                            Object next2 = it2.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                s.u();
                            }
                            if (!equalsToConstant((DivLinearGradient.ColorPoint) next2, listK4.get(i12))) {
                                z10 = false;
                                break;
                            }
                            i12 = i13;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
        } else if (divBackground instanceof DivBackground.e) {
            if (divBackground2 instanceof DivBackground.e) {
                DivBackground.e eVar = (DivBackground.e) divBackground;
                DivBackground.e eVar2 = (DivBackground.e) divBackground2;
                if (equalsToConstant(eVar.c().f48430a, eVar2.c().f48430a) && equalsToConstant(eVar.c().f48431b, eVar2.c().f48431b) && ExpressionsKt.equalsToConstant(eVar.c().f48433d, eVar2.c().f48433d) && equalsToConstant(eVar.c().f48434e, eVar2.c().f48434e)) {
                    return true;
                }
            }
        } else {
            if (!(divBackground instanceof DivBackground.d)) {
                throw new NoWhenBranchMatchedException();
            }
            if (divBackground2 instanceof DivBackground.d) {
                DivBackground.d dVar = (DivBackground.d) divBackground;
                DivBackground.d dVar2 = (DivBackground.d) divBackground2;
                if (ExpressionsKt.equalsToConstant(dVar.c().f48077a, dVar2.c().f48077a) && equalsToConstant(dVar.c().f48078b, dVar2.c().f48078b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(DivLinearGradient.ColorPoint colorPoint) {
        if (colorPoint == null) {
            return true;
        }
        return ExpressionsKt.isConstant(colorPoint.f48044a) && ExpressionsKt.isConstant(colorPoint.f48045b);
    }

    public static final boolean isConstant(DivRadialGradientCenter divRadialGradientCenter) {
        if (divRadialGradientCenter == null) {
            return true;
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
            return ExpressionsKt.isConstant(bVar.c().f48453a) && ExpressionsKt.isConstant(bVar.c().f48454b);
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return ExpressionsKt.isConstant(((DivRadialGradientCenter.c) divRadialGradientCenter).c().f48478a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(DivRadialGradientRadius divRadialGradientRadius) {
        if (divRadialGradientRadius == null) {
            return true;
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            DivRadialGradientRadius.b bVar = (DivRadialGradientRadius.b) divRadialGradientRadius;
            return ExpressionsKt.isConstant(bVar.c().f47187a) && ExpressionsKt.isConstant(bVar.c().f47188b);
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
            return ExpressionsKt.isConstant(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f48485a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(DivInput.NativeInterface nativeInterface) {
        if (nativeInterface == null) {
            return true;
        }
        return ExpressionsKt.isConstant(nativeInterface.f47854a);
    }

    public static final boolean equalsToConstant(DivLinearGradient.ColorPoint colorPoint, DivLinearGradient.ColorPoint colorPoint2) {
        if (colorPoint == null && colorPoint2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(colorPoint != null ? colorPoint.f48044a : null, colorPoint2 != null ? colorPoint2.f48044a : null)) {
            if (ExpressionsKt.equalsToConstant(colorPoint != null ? colorPoint.f48045b : null, colorPoint2 != null ? colorPoint2.f48045b : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivRadialGradientCenter divRadialGradientCenter, DivRadialGradientCenter divRadialGradientCenter2) {
        if (divRadialGradientCenter == null) {
            if (divRadialGradientCenter2 == null) {
                return true;
            }
        } else if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            if (divRadialGradientCenter2 instanceof DivRadialGradientCenter.b) {
                DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
                DivRadialGradientCenter.b bVar2 = (DivRadialGradientCenter.b) divRadialGradientCenter2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f48453a, bVar2.c().f48453a) && ExpressionsKt.equalsToConstant(bVar.c().f48454b, bVar2.c().f48454b)) {
                    return true;
                }
            }
        } else {
            if (!(divRadialGradientCenter instanceof DivRadialGradientCenter.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divRadialGradientCenter2 instanceof DivRadialGradientCenter.c) && ExpressionsKt.equalsToConstant(((DivRadialGradientCenter.c) divRadialGradientCenter).c().f48478a, ((DivRadialGradientCenter.c) divRadialGradientCenter2).c().f48478a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivRadialGradientRadius divRadialGradientRadius, DivRadialGradientRadius divRadialGradientRadius2) {
        if (divRadialGradientRadius == null) {
            if (divRadialGradientRadius2 == null) {
                return true;
            }
        } else if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            if (divRadialGradientRadius2 instanceof DivRadialGradientRadius.b) {
                DivRadialGradientRadius.b bVar = (DivRadialGradientRadius.b) divRadialGradientRadius;
                DivRadialGradientRadius.b bVar2 = (DivRadialGradientRadius.b) divRadialGradientRadius2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f47187a, bVar2.c().f47187a) && ExpressionsKt.equalsToConstant(bVar.c().f47188b, bVar2.c().f47188b)) {
                    return true;
                }
            }
        } else {
            if (!(divRadialGradientRadius instanceof DivRadialGradientRadius.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divRadialGradientRadius2 instanceof DivRadialGradientRadius.c) && ExpressionsKt.equalsToConstant(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f48485a, ((DivRadialGradientRadius.c) divRadialGradientRadius2).c().f48485a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(DivInput.NativeInterface nativeInterface, DivInput.NativeInterface nativeInterface2) {
        if (nativeInterface == null && nativeInterface2 == null) {
            return true;
        }
        return ExpressionsKt.equalsToConstant(nativeInterface != null ? nativeInterface.f47854a : null, nativeInterface2 != null ? nativeInterface2.f47854a : null);
    }
}

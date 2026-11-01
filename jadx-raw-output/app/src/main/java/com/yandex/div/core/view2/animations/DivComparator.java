package com.yandex.div.core.view2.animations;

import ck.p;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import nj.b0;
import nj.s;
import oe.e2;

/* JADX INFO: compiled from: DivComparator.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivComparator {
    public static final DivComparator INSTANCE = new DivComparator();

    private DivComparator() {
    }

    public final boolean areDivsReplaceable(Div div, Div div2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter) {
        if (!p.e(div != null ? div.getClass() : null, div2 != null ? div2.getClass() : null)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentClasses();
            }
            return false;
        }
        if (div == null || div2 == null || div == div2) {
            return true;
        }
        return areValuesReplaceable(div.b(), div2.b(), expressionResolver, expressionResolver2, divComparatorReporter) && areChildrenReplaceable(extractChildren(div, expressionResolver), extractChildren(div2, expressionResolver2), divComparatorReporter);
    }

    public final boolean isDivDataReplaceable(DivData divData, DivData divData2, long j10, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter) {
        Object obj;
        Object next;
        if (divData == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoOldData();
            }
            return false;
        }
        Iterator<T> it = divData.f46937c.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((DivData.State) next).f46947b == j10));
        DivData.State state = (DivData.State) next;
        for (Object obj2 : divData2.f46937c) {
            if (((DivData.State) obj2).f46947b == j10) {
                obj = obj2;
                break;
            }
        }
        DivData.State state2 = (DivData.State) obj;
        if (state == null || state2 == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoState();
            }
            return false;
        }
        boolean zAreDivsReplaceable = areDivsReplaceable(state.f46946a, state2.f46946a, expressionResolver, expressionResolver2, divComparatorReporter);
        if (zAreDivsReplaceable && divComparatorReporter != null) {
            divComparatorReporter.onComparisonSuccess();
        }
        return zAreDivsReplaceable;
    }

    public static /* synthetic */ boolean areChildrenReplaceable$default(DivComparator divComparator, List list, List list2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areChildrenReplaceable(list, list2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areDivsReplaceable$default(DivComparator divComparator, Div div, Div div2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areDivsReplaceable(div, div2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areValuesReplaceable$default(DivComparator divComparator, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areValuesReplaceable(e2Var, e2Var2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    private final List<DivItemBuilderResult> extractChildren(Div div, ExpressionResolver expressionResolver) {
        if (div instanceof Div.b) {
            return DivCollectionExtensionsKt.buildItems(((Div.b) div).c(), expressionResolver);
        }
        if (div instanceof Div.f) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.f) div).c(), expressionResolver);
        }
        if (div instanceof Div.g) {
            return s.k();
        }
        if (div instanceof Div.e) {
            return s.k();
        }
        if (div instanceof Div.q) {
            return s.k();
        }
        if (div instanceof Div.l) {
            return s.k();
        }
        if (div instanceof Div.d) {
            return s.k();
        }
        if (div instanceof Div.j) {
            return s.k();
        }
        if (div instanceof Div.p) {
            return s.k();
        }
        if (div instanceof Div.n) {
            return s.k();
        }
        if (div instanceof Div.c) {
            return s.k();
        }
        if (div instanceof Div.i) {
            return s.k();
        }
        if (div instanceof Div.k) {
            return s.k();
        }
        if (div instanceof Div.h) {
            return s.k();
        }
        if (div instanceof Div.m) {
            return s.k();
        }
        if (div instanceof Div.r) {
            return s.k();
        }
        if (div instanceof Div.o) {
            return s.k();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean isOverlap(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return divContainer.I.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP;
    }

    private final boolean hasTransitions(e2 e2Var) {
        if (e2Var.x() == null && e2Var.i() == null && e2Var.j() == null) {
            return false;
        }
        return true;
    }

    public final boolean areChildrenReplaceable(List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivComparatorReporter divComparatorReporter) {
        if (list.size() != list2.size()) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentChildCount();
            }
            return false;
        }
        List<Pair> listV0 = b0.V0(list, list2);
        if (!(listV0 instanceof Collection) || !listV0.isEmpty()) {
            for (Pair pair : listV0) {
                if (!INSTANCE.areDivsReplaceable(((DivItemBuilderResult) pair.getFirst()).getDiv(), ((DivItemBuilderResult) pair.getSecond()).getDiv(), ((DivItemBuilderResult) pair.getFirst()).getExpressionResolver(), ((DivItemBuilderResult) pair.getSecond()).getExpressionResolver(), divComparatorReporter)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean areValuesReplaceable(e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter) {
        if (e2Var.getId() != null && e2Var2.getId() != null && !p.e(e2Var.getId(), e2Var2.getId()) && (hasTransitions(e2Var) || hasTransitions(e2Var2))) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentIdsWithTransition();
            }
            return false;
        }
        if ((e2Var instanceof DivCustom) && (e2Var2 instanceof DivCustom) && !p.e(((DivCustom) e2Var).f46874j, ((DivCustom) e2Var2).f46874j)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentCustomTypes();
            }
            return false;
        }
        if ((e2Var instanceof DivContainer) && (e2Var2 instanceof DivContainer)) {
            DivContainer divContainer = (DivContainer) e2Var;
            DivContainer divContainer2 = (DivContainer) e2Var2;
            if (isOverlap(divContainer, expressionResolver) != isOverlap(divContainer2, expressionResolver2)) {
                if (divComparatorReporter != null) {
                    divComparatorReporter.onComparisonDifferentOverlap();
                }
                return false;
            }
            if (DivUtilKt.isWrapContainer(divContainer, expressionResolver) != DivUtilKt.isWrapContainer(divContainer2, expressionResolver2)) {
                if (divComparatorReporter != null) {
                    divComparatorReporter.onComparisonDifferentWrap();
                }
                return false;
            }
            return true;
        }
        return true;
    }
}

package com.yandex.div.core.view2.animations;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import java.util.List;

/* JADX INFO: compiled from: DivTransitions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivTransitionsKt {

    /* JADX INFO: compiled from: DivTransitions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTransitionSelector.values().length];
            try {
                iArr[DivTransitionSelector.DATA_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTransitionSelector.ANY_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTransitionSelector.STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean allowsTransitionsOnDataChange(DivTransitionSelector divTransitionSelector) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public static final boolean allowsTransitionsOnStateChange(DivTransitionSelector divTransitionSelector) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i10 == 2 || i10 == 3;
    }

    public static final boolean allowsTransitionsOnDataChange(List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.DATA_CHANGE);
    }

    public static final boolean allowsTransitionsOnStateChange(List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.STATE_CHANGE);
    }

    public static final boolean allowsTransitionsOnVisibilityChange(List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.VISIBILITY_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(DivData divData, ExpressionResolver expressionResolver) {
        return allowsTransitionsOnDataChange(divData.f46939e.evaluate(expressionResolver));
    }

    public static final boolean allowsTransitionsOnStateChange(DivState divState, ExpressionResolver expressionResolver) {
        return allowsTransitionsOnStateChange(divState.L.evaluate(expressionResolver));
    }
}

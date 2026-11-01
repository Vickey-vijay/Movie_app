package com.yandex.div.core.util;

import com.yandex.div.core.expression.local.LocalFunction;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFunction;
import com.yandex.div2.DivFunctionArgument;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nj.t;

/* JADX INFO: compiled from: FunctionMapper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FunctionMapperKt {

    /* JADX INFO: compiled from: FunctionMapper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivEvaluableType.values().length];
            try {
                iArr[DivEvaluableType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivEvaluableType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivEvaluableType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivEvaluableType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivEvaluableType.DATETIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivEvaluableType.COLOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivEvaluableType.URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivEvaluableType.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivEvaluableType.ARRAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final EvaluableType toEvaluableType(DivEvaluableType divEvaluableType) {
        switch (WhenMappings.$EnumSwitchMapping$0[divEvaluableType.ordinal()]) {
            case 1:
                return EvaluableType.STRING;
            case 2:
                return EvaluableType.INTEGER;
            case 3:
                return EvaluableType.NUMBER;
            case 4:
                return EvaluableType.BOOLEAN;
            case 5:
                return EvaluableType.DATETIME;
            case 6:
                return EvaluableType.COLOR;
            case 7:
                return EvaluableType.URL;
            case 8:
                return EvaluableType.DICT;
            case 9:
                return EvaluableType.ARRAY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<LocalFunction> toLocalFunctions(List<DivFunction> list) {
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        for (DivFunction divFunction : list) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (DivFunctionArgument divFunctionArgument : divFunction.f47235a) {
                arrayList2.add(divFunctionArgument.f47242a);
                arrayList3.add(new FunctionArgument(toEvaluableType(divFunctionArgument.f47243b), false, 2, null));
            }
            arrayList.add(new LocalFunction(divFunction.f47237c, arrayList3, toEvaluableType(divFunction.f47238d), arrayList2, divFunction.f47236b));
        }
        return arrayList;
    }
}

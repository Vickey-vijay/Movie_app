package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import org.json.JSONArray;

/* JADX INFO: compiled from: StoredValueFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class GetStoredArrayValue extends GetStoredComplexValue<JSONArray> {
    public static final GetStoredArrayValue INSTANCE = new GetStoredArrayValue();
    private static final String name = "getStoredArrayValue";
    private static final EvaluableType resultType = EvaluableType.ARRAY;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    private GetStoredArrayValue() {
    }
}

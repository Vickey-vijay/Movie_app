package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import org.json.JSONObject;

/* JADX INFO: compiled from: StoredValueFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetStoredDictValue extends GetStoredComplexValue<JSONObject> {
    public static final GetStoredDictValue INSTANCE = new GetStoredDictValue();
    private static final String name = "getStoredDictValue";
    private static final EvaluableType resultType = EvaluableType.DICT;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    private GetStoredDictValue() {
    }
}

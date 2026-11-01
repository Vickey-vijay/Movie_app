package com.yandex.div.evaluable.function;

import ck.p;
import com.ironsource.C3426d4;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Pair;
import nj.b0;
import nj.l0;
import nj.r;
import nj.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ToString.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DictToString extends Function {
    private static final boolean isPure = false;
    public static final DictToString INSTANCE = new DictToString();
    private static final String name = "toString";
    private static final List<FunctionArgument> declaredArgs = r.e(new FunctionArgument(EvaluableType.DICT, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.STRING;

    private final Map<String, Object> sort(JSONObject jSONObject) throws JSONException {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        p.i(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            p.i(next, C3426d4.i.W);
            arrayList.add(next);
        }
        w.A(arrayList);
        SortedMap sortedMapH = l0.h(new Pair[0]);
        for (String str : arrayList) {
            Object objSort = jSONObject.get(str);
            if (objSort instanceof JSONObject) {
                objSort = INSTANCE.sort((JSONObject) objSort);
            }
            sortedMapH.put(str, objSort);
        }
        return sortedMapH;
    }

    private final String toStringLikeJson(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
            return sb2.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('\"');
            sb3.append(entry.getKey());
            sb3.append("\":");
            Object value = entry.getValue();
            sb3.append(value != null ? INSTANCE.toStringLikeJson(value) : null);
            arrayList.add(sb3.toString());
        }
        return '{' + b0.p0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null) + '}';
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type org.json.JSONObject");
        return toStringLikeJson(sort((JSONObject) objF0));
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }

    private DictToString() {
    }
}

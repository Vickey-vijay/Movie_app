package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac {
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    public static final B9 a(Ac ac2, K9 k10, Map map) {
        int i10;
        Object value;
        ac2.getClass();
        B9 b10 = new B9();
        switch (k10) {
            case UNKNOWN:
                i10 = 0;
                break;
            case APPSFLYER:
                i10 = 1;
                break;
            case ADJUST:
                i10 = 2;
                break;
            case KOCHAVA:
                i10 = 3;
                break;
            case TENJIN:
                i10 = 4;
                break;
            case AIRBRIDGE:
                i10 = 5;
                break;
            case SINGULAR:
                i10 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        b10.f55013a = i10;
        Bc.f55021b.getClass();
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 != null) {
                    double dDoubleValue = ((Number) value2).doubleValue();
                    if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                        value = null;
                    } else {
                        value = entry.getValue();
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
            } else {
                value = entry.getValue();
            }
            Pair pairA = mj.h.a(key, value);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        String string = new JSONObject(linkedHashMap).toString();
        if (string != null) {
            b10.f55014b = string.getBytes(lk.c.f63591b);
        }
        return b10;
    }
}

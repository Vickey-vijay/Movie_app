package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ryl extends zih {
    public ryl() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.MOD);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw;
        Object objOuw2 = this.ouw.ouw(map);
        if (objOuw2 == null || (objOuw = this.vt.ouw(map)) == null) {
            return null;
        }
        Number number = (Number) objOuw2;
        Number number2 = (Number) objOuw;
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            int iIntValue = number.intValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Integer.valueOf(iIntValue % number2.intValue());
            }
            if (number2 instanceof Long) {
                return Long.valueOf(((long) iIntValue) % number2.longValue());
            }
            if (number2 instanceof Float) {
                return Float.valueOf(iIntValue % number2.floatValue());
            }
            if (number2 instanceof Double) {
                return Double.valueOf(((double) iIntValue) % number2.doubleValue());
            }
            throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
        }
        if (number instanceof Long) {
            long jLongValue = number.longValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Long.valueOf(jLongValue % ((long) number2.intValue()));
            }
            if (number2 instanceof Long) {
                return Long.valueOf(jLongValue % number2.longValue());
            }
            if (number2 instanceof Float) {
                return Float.valueOf(jLongValue % number2.floatValue());
            }
            if (number2 instanceof Double) {
                return Double.valueOf(jLongValue % number2.doubleValue());
            }
            throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
        }
        if (number instanceof Float) {
            float fFloatValue = number.floatValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Float.valueOf(fFloatValue % number2.intValue());
            }
            if (number2 instanceof Long) {
                return Float.valueOf(fFloatValue % number2.longValue());
            }
            if (number2 instanceof Float) {
                return Float.valueOf(fFloatValue % number2.floatValue());
            }
            if (number2 instanceof Double) {
                return Double.valueOf(((double) fFloatValue) % number2.doubleValue());
            }
            throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
        }
        if (!(number instanceof Double)) {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        double dDoubleValue = number.doubleValue();
        if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
            return Double.valueOf(dDoubleValue % ((double) number2.intValue()));
        }
        if (number2 instanceof Long) {
            return Double.valueOf(dDoubleValue % number2.longValue());
        }
        if (number2 instanceof Float) {
            return Double.valueOf(dDoubleValue % ((double) number2.floatValue()));
        }
        if (number2 instanceof Double) {
            return Double.valueOf(dDoubleValue % number2.doubleValue());
        }
        throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
    }
}

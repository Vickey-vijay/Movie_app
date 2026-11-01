package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class vm extends zih {
    private static final ThreadLocal<StringBuilder> yu = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.ouw.vt.vt.ouw.vm.1
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public vm() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.PLUS);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw;
        Object objOuw2 = this.ouw.ouw(map);
        if (objOuw2 == null || (objOuw = this.vt.ouw(map)) == null) {
            return null;
        }
        if ((objOuw2 instanceof String) || (objOuw instanceof String)) {
            StringBuilder sb2 = yu.get();
            sb2.append(objOuw2);
            sb2.append(objOuw);
            String string = sb2.toString();
            sb2.setLength(0);
            return string;
        }
        Number number = (Number) objOuw2;
        Number number2 = (Number) objOuw;
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            int iIntValue = number.intValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Integer.valueOf(iIntValue + number2.intValue());
            }
            if (number2 instanceof Long) {
                return Long.valueOf(((long) iIntValue) + number2.longValue());
            }
            if (number2 instanceof Float) {
                return Float.valueOf(iIntValue + number2.floatValue());
            }
            if (number2 instanceof Double) {
                return Double.valueOf(((double) iIntValue) + number2.doubleValue());
            }
            throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
        }
        if (number instanceof Long) {
            long jLongValue = number.longValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Long.valueOf(jLongValue + ((long) number2.intValue()));
            }
            if (number2 instanceof Long) {
                return Long.valueOf(jLongValue + number2.longValue());
            }
            if (number2 instanceof Float) {
                return Float.valueOf(jLongValue + number2.floatValue());
            }
            if (number2 instanceof Double) {
                return Double.valueOf(jLongValue + number2.doubleValue());
            }
            throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
        }
        if (number instanceof Float) {
            float fFloatValue = number.floatValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Float.valueOf(fFloatValue + number2.intValue());
            }
            if (number2 instanceof Long) {
                return Float.valueOf(fFloatValue + number2.longValue());
            }
            if (number2 instanceof Float) {
                return Float.valueOf(fFloatValue + number2.floatValue());
            }
            if (number2 instanceof Double) {
                return Double.valueOf(((double) fFloatValue) + number2.doubleValue());
            }
            throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
        }
        if (!(number instanceof Double)) {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        double dDoubleValue = number.doubleValue();
        if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
            return Double.valueOf(dDoubleValue + ((double) number2.intValue()));
        }
        if (number2 instanceof Long) {
            return Double.valueOf(dDoubleValue + number2.longValue());
        }
        if (number2 instanceof Float) {
            return Double.valueOf(dDoubleValue + ((double) number2.floatValue()));
        }
        if (number2 instanceof Double) {
            return Double.valueOf(dDoubleValue + number2.doubleValue());
        }
        throw new UnsupportedOperationException(number2.getClass().getName() + "This type of addition operation is not supported");
    }
}

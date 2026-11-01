package com.bytedance.adsdk.ouw.vt.fkw.ouw;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    private static Object ouw(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 < ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f10 < ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f10 < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static Object ouw(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                    return Boolean.valueOf(jLongValue < ((long) number.intValue()));
                }
                if (number instanceof Long) {
                    return Boolean.valueOf(jLongValue < number.longValue());
                }
                if (number instanceof Float) {
                    return Boolean.valueOf(((float) jLongValue) < number.floatValue());
                }
                if (number instanceof Double) {
                    return Boolean.valueOf(((double) jLongValue) < number.doubleValue());
                }
                throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
            }
            if (obj instanceof Float) {
                return ouw(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                    return Boolean.valueOf(dDoubleValue < ((double) number.intValue()));
                }
                if (number instanceof Long) {
                    return Boolean.valueOf(dDoubleValue < ((double) number.longValue()));
                }
                if (number instanceof Float) {
                    return Boolean.valueOf(dDoubleValue < ((double) number.floatValue()));
                }
                if (number instanceof Double) {
                    return Boolean.valueOf(dDoubleValue < number.doubleValue());
                }
                throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
            }
            if (obj instanceof String) {
                try {
                    return ouw(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
        int iIntValue = ((Number) obj).intValue();
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(iIntValue < number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) iIntValue) < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) iIntValue) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) iIntValue) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }
}

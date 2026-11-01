package io.bidmachine.utils.data;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface DataConverter {
    @Nullable
    default Boolean toBooleanOrNull(@Nullable Object obj) {
        return toBooleanOrNull(obj, null);
    }

    @Nullable
    Boolean toBooleanOrNull(@Nullable Object obj, @Nullable Boolean bool);

    @Nullable
    default Double toDoubleOrNull(@Nullable Object obj) {
        return toDoubleOrNull(obj, null);
    }

    @Nullable
    Double toDoubleOrNull(@Nullable Object obj, @Nullable Double d10);

    @Nullable
    default Float toFloatOrNull(@Nullable Object obj) {
        return toFloatOrNull(obj, null);
    }

    @Nullable
    Float toFloatOrNull(@Nullable Object obj, @Nullable Float f10);

    @Nullable
    default Integer toIntegerOrNull(@Nullable Object obj) {
        return toIntegerOrNull(obj, null);
    }

    @Nullable
    Integer toIntegerOrNull(@Nullable Object obj, @Nullable Integer num);

    @Nullable
    List<Object> toListOrNull(@Nullable Object obj);

    @Nullable
    Map<Object, Object> toMapOrNull(@Nullable Object obj);

    @Nullable
    default <T> T toOrNull(@Nullable Object obj) throws Exception {
        return (T) toOrNull(obj, null);
    }

    @Nullable
    <T> T toOrNull(@Nullable Object obj, @Nullable T t10) throws Exception;

    @Nullable
    default String toStringOrNull(@Nullable Object obj) {
        return toStringOrNull(obj, null);
    }

    @Nullable
    String toStringOrNull(@Nullable Object obj, @Nullable String str);

    default boolean toBoolean(@Nullable Object obj, boolean z10) {
        Boolean booleanOrNull = toBooleanOrNull(obj);
        if (booleanOrNull != null) {
            return booleanOrNull.booleanValue();
        }
        return z10;
    }

    default double toDouble(@Nullable Object obj, double d10) {
        Double doubleOrNull = toDoubleOrNull(obj);
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        return d10;
    }

    default float toFloat(@Nullable Object obj, float f10) {
        Float floatOrNull = toFloatOrNull(obj);
        if (floatOrNull != null) {
            return floatOrNull.floatValue();
        }
        return f10;
    }

    default int toInteger(@Nullable Object obj, int i10) {
        Integer integerOrNull = toIntegerOrNull(obj);
        if (integerOrNull != null) {
            return integerOrNull.intValue();
        }
        return i10;
    }
}

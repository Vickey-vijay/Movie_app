package io.bidmachine.utils.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.Function;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface DataRetriever<K> {
    boolean contains(@NonNull K k10);

    default boolean getBoolean(@NonNull K k10) {
        return getBoolean(k10, false);
    }

    boolean getBoolean(@NonNull K k10, boolean z10);

    @Nullable
    Boolean getBooleanOrNull(@NonNull K k10, @Nullable Boolean bool);

    double getDouble(@NonNull K k10, double d10);

    @Nullable
    default Double getDoubleOrNull(@NonNull K k10) {
        return getDoubleOrNull(k10, null);
    }

    @Nullable
    Double getDoubleOrNull(@NonNull K k10, @Nullable Double d10);

    default float getFloat(@NonNull K k10) {
        return getFloat(k10, 0.0f);
    }

    float getFloat(@NonNull K k10, float f10);

    @Nullable
    default Float getFloatOrNull(@NonNull K k10) {
        return getFloatOrNull(k10, null);
    }

    @Nullable
    Float getFloatOrNull(@NonNull K k10, @Nullable Float f10);

    default int getInteger(@NonNull K k10) {
        return getInteger(k10, 0);
    }

    int getInteger(@NonNull K k10, int i10);

    @Nullable
    default Integer getIntegerOrNull(@NonNull K k10) {
        return getIntegerOrNull(k10, null);
    }

    @Nullable
    Integer getIntegerOrNull(@NonNull K k10, @Nullable Integer num);

    @Nullable
    List<Object> getListOrNull(@NonNull K k10);

    @Nullable
    Map<Object, Object> getMapOrNull(@NonNull K k10);

    @Nullable
    default Object getObjectOrNull(@NonNull K k10) {
        return getObjectOrNull(k10, null);
    }

    @Nullable
    Object getObjectOrNull(@NonNull K k10, @Nullable Object obj);

    @Nullable
    default <T> T getOrNull(@NonNull K k10) throws Exception {
        return (T) getOrNull(k10, null);
    }

    @Nullable
    <T> T getOrNull(@NonNull K k10, @Nullable T t10) throws Exception;

    @Nullable
    default <T> T getOrNullSafely(@NonNull K k10, @NonNull Function<Object, T> function) {
        return (T) getOrNullSafely(k10, null, function);
    }

    @Nullable
    default String getStringOrNull(@NonNull K k10) {
        return getStringOrNull(k10, null);
    }

    @Nullable
    String getStringOrNull(@NonNull K k10, @Nullable String str);

    @Nullable
    default Boolean getBooleanOrNull(@NonNull K k10) {
        return getBooleanOrNull(k10, Boolean.FALSE);
    }

    default double getDouble(@NonNull K k10) {
        return getDouble(k10, 0.0d);
    }

    @Nullable
    default <T> T getOrNullSafely(@NonNull K k10, @Nullable T t10, @NonNull Function<Object, T> function) {
        try {
            Object objectOrNull = getObjectOrNull(k10, t10);
            if (objectOrNull == null) {
                return null;
            }
            return function.apply(objectOrNull);
        } catch (Exception unused) {
            return t10;
        }
    }
}

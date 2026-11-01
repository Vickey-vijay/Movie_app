package io.bidmachine.utils.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class SmartDataConverter implements DataConverter {

    @NonNull
    private final DataConverter castDataConverter = new CastDataConverter();

    @Override // io.bidmachine.utils.data.DataConverter
    public /* bridge */ /* synthetic */ boolean toBoolean(@Nullable Object obj, boolean z10) {
        return super.toBoolean(obj, z10);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public /* bridge */ /* synthetic */ Boolean toBooleanOrNull(@Nullable Object obj) {
        return super.toBooleanOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Boolean toBooleanOrNull(@Nullable Object obj, @Nullable Boolean bool) {
        if (obj == null) {
            return bool;
        }
        Boolean booleanOrNull = this.castDataConverter.toBooleanOrNull(obj);
        if (booleanOrNull != null) {
            return booleanOrNull;
        }
        String stringOrNull = this.castDataConverter.toStringOrNull(obj);
        if (stringOrNull == null) {
            return bool;
        }
        try {
            return Boolean.valueOf(stringOrNull);
        } catch (Exception e10) {
            Logger.w(e10);
            return bool;
        }
    }

    @Override // io.bidmachine.utils.data.DataConverter
    public /* bridge */ /* synthetic */ double toDouble(@Nullable Object obj, double d10) {
        return super.toDouble(obj, d10);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public /* bridge */ /* synthetic */ Double toDoubleOrNull(@Nullable Object obj) {
        return super.toDoubleOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Double toDoubleOrNull(@Nullable Object obj, @Nullable Double d10) {
        if (obj == null) {
            return d10;
        }
        Double doubleOrNull = this.castDataConverter.toDoubleOrNull(obj);
        if (doubleOrNull != null) {
            return doubleOrNull;
        }
        Integer integerOrNull = this.castDataConverter.toIntegerOrNull(obj);
        if (integerOrNull != null) {
            return Double.valueOf(integerOrNull.doubleValue());
        }
        String stringOrNull = toStringOrNull(obj);
        if (stringOrNull != null) {
            try {
                return Double.valueOf(stringOrNull);
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
        return d10;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    public /* bridge */ /* synthetic */ float toFloat(@Nullable Object obj, float f10) {
        return super.toFloat(obj, f10);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public /* bridge */ /* synthetic */ Float toFloatOrNull(@Nullable Object obj) {
        return super.toFloatOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Float toFloatOrNull(@Nullable Object obj, @Nullable Float f10) {
        if (obj == null) {
            return f10;
        }
        Float floatOrNull = this.castDataConverter.toFloatOrNull(obj);
        if (floatOrNull != null) {
            return floatOrNull;
        }
        Integer integerOrNull = this.castDataConverter.toIntegerOrNull(obj);
        if (integerOrNull != null) {
            return Float.valueOf(integerOrNull.floatValue());
        }
        String stringOrNull = toStringOrNull(obj);
        if (stringOrNull != null) {
            try {
                return Float.valueOf(stringOrNull);
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
        return f10;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    public /* bridge */ /* synthetic */ int toInteger(@Nullable Object obj, int i10) {
        return super.toInteger(obj, i10);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public /* bridge */ /* synthetic */ Integer toIntegerOrNull(@Nullable Object obj) {
        return super.toIntegerOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Integer toIntegerOrNull(@Nullable Object obj, @Nullable Integer num) {
        if (obj == null) {
            return num;
        }
        Integer integerOrNull = this.castDataConverter.toIntegerOrNull(obj);
        if (integerOrNull != null) {
            return integerOrNull;
        }
        Double doubleOrNull = this.castDataConverter.toDoubleOrNull(obj);
        if (doubleOrNull != null) {
            return Integer.valueOf(doubleOrNull.intValue());
        }
        Float floatOrNull = this.castDataConverter.toFloatOrNull(obj);
        if (floatOrNull != null) {
            return Integer.valueOf(floatOrNull.intValue());
        }
        String stringOrNull = this.castDataConverter.toStringOrNull(obj);
        if (stringOrNull != null) {
            try {
                return Integer.valueOf(stringOrNull);
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
        return num;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public /* bridge */ /* synthetic */ Object toOrNull(@Nullable Object obj) throws Exception {
        return super.toOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public <T> T toOrNull(@Nullable Object obj, @Nullable T t10) throws Exception {
        return (T) this.castDataConverter.toOrNull(obj, t10);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public /* bridge */ /* synthetic */ String toStringOrNull(@Nullable Object obj) {
        return super.toStringOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public String toStringOrNull(@Nullable Object obj, @Nullable String str) {
        if (obj == null) {
            return str;
        }
        String stringOrNull = this.castDataConverter.toStringOrNull(obj);
        if (stringOrNull != null) {
            return stringOrNull;
        }
        try {
            return String.valueOf(obj);
        } catch (Exception e10) {
            Logger.w(e10);
            return str;
        }
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public List<Object> toListOrNull(@Nullable Object obj) {
        return this.castDataConverter.toListOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Map<Object, Object> toMapOrNull(@Nullable Object obj) {
        return this.castDataConverter.toMapOrNull(obj);
    }
}

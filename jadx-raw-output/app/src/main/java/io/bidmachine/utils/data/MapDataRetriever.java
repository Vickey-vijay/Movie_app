package io.bidmachine.utils.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.Function;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class MapDataRetriever<K> implements DataRetriever<K> {

    @NonNull
    private final DataConverter dataConverter;

    @NonNull
    private final Map<K, Object> params;

    public MapDataRetriever() {
        this(new ConcurrentHashMap(), new SmartDataConverter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ boolean getBoolean(@NonNull Object obj) {
        return super.getBoolean(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public boolean getBoolean(@NonNull K k10, boolean z10) {
        return this.dataConverter.toBoolean(getObjectOrNull(k10, Boolean.valueOf(z10)), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Boolean getBooleanOrNull(@NonNull Object obj) {
        return super.getBooleanOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Boolean getBooleanOrNull(@NonNull K k10, @Nullable Boolean bool) {
        return this.dataConverter.toBooleanOrNull(getObjectOrNull(k10, bool), bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ double getDouble(@NonNull Object obj) {
        return super.getDouble(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public double getDouble(@NonNull K k10, double d10) {
        return this.dataConverter.toDouble(getObjectOrNull(k10, Double.valueOf(d10)), d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Double getDoubleOrNull(@NonNull Object obj) {
        return super.getDoubleOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Double getDoubleOrNull(@NonNull K k10, @Nullable Double d10) {
        return this.dataConverter.toDoubleOrNull(getObjectOrNull(k10, d10), d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ float getFloat(@NonNull Object obj) {
        return super.getFloat(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public float getFloat(@NonNull K k10, float f10) {
        return this.dataConverter.toFloat(getObjectOrNull(k10, Float.valueOf(f10)), f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Float getFloatOrNull(@NonNull Object obj) {
        return super.getFloatOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Float getFloatOrNull(@NonNull K k10, @Nullable Float f10) {
        return this.dataConverter.toFloatOrNull(getObjectOrNull(k10, f10), f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ int getInteger(@NonNull Object obj) {
        return super.getInteger(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public int getInteger(@NonNull K k10, int i10) {
        return this.dataConverter.toInteger(getObjectOrNull(k10, Integer.valueOf(i10)), i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Integer getIntegerOrNull(@NonNull Object obj) {
        return super.getIntegerOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Integer getIntegerOrNull(@NonNull K k10, @Nullable Integer num) {
        return this.dataConverter.toIntegerOrNull(getObjectOrNull(k10, num), num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getObjectOrNull(@NonNull Object obj) {
        return super.getObjectOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Object getObjectOrNull(@NonNull K k10, @Nullable Object obj) {
        return contains(k10) ? getParams().get(k10) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getOrNull(@NonNull Object obj) throws Exception {
        return super.getOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public <T> T getOrNull(@NonNull K k10, @Nullable T t10) throws Exception {
        return (T) this.dataConverter.toOrNull(getObjectOrNull(k10, t10), t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getOrNullSafely(@NonNull Object obj, @NonNull Function function) {
        return super.getOrNullSafely(obj, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getOrNullSafely(@NonNull Object obj, @Nullable Object obj2, @NonNull Function function) {
        return super.getOrNullSafely(obj, obj2, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ String getStringOrNull(@NonNull Object obj) {
        return super.getStringOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public String getStringOrNull(@NonNull K k10, @Nullable String str) {
        return this.dataConverter.toStringOrNull(getObjectOrNull(k10, str), str);
    }

    public MapDataRetriever(@NonNull Map<K, Object> map, @NonNull DataConverter dataConverter) {
        this.params = map;
        this.dataConverter = dataConverter;
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public List<Object> getListOrNull(@NonNull K k10) {
        return this.dataConverter.toListOrNull(getObjectOrNull(k10, null));
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    public Map<Object, Object> getMapOrNull(@NonNull K k10) {
        return this.dataConverter.toMapOrNull(getObjectOrNull(k10, null));
    }

    @NonNull
    public Map<K, Object> getParams() {
        return this.params;
    }

    public void clear() {
        getParams().clear();
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    public boolean contains(@NonNull K k10) {
        return getParams().containsKey(k10);
    }

    public void put(@NonNull K k10, @NonNull Object obj) {
        getParams().put(k10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setParams(@Nullable Map<K, Object> map) {
        clear();
        if (map != 0) {
            getParams().putAll(map);
        }
    }
}

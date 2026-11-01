package io.bidmachine.utils.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Struct;
import io.bidmachine.Function;
import io.bidmachine.utils.ProtoUtils;

/* JADX INFO: loaded from: classes2.dex */
public class StructDataRetriever extends MapDataRetriever<String> {
    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ boolean getBoolean(@NonNull Object obj) {
        return super.getBoolean(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Boolean getBooleanOrNull(@NonNull Object obj) {
        return super.getBooleanOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ double getDouble(@NonNull Object obj) {
        return super.getDouble(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Double getDoubleOrNull(@NonNull Object obj) {
        return super.getDoubleOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ float getFloat(@NonNull Object obj) {
        return super.getFloat(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Float getFloatOrNull(@NonNull Object obj) {
        return super.getFloatOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    public /* bridge */ /* synthetic */ int getInteger(@NonNull Object obj) {
        return super.getInteger(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Integer getIntegerOrNull(@NonNull Object obj) {
        return super.getIntegerOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getObjectOrNull(@NonNull Object obj) {
        return super.getObjectOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getOrNull(@NonNull Object obj) throws Exception {
        return super.getOrNull(obj);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getOrNullSafely(@NonNull Object obj, @NonNull Function function) {
        return super.getOrNullSafely(obj, function);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ Object getOrNullSafely(@NonNull Object obj, @Nullable Object obj2, @NonNull Function function) {
        return super.getOrNullSafely(obj, obj2, function);
    }

    @Override // io.bidmachine.utils.data.MapDataRetriever, io.bidmachine.utils.data.DataRetriever, io.bidmachine.unified.UnifiedMediationParams
    @Nullable
    public /* bridge */ /* synthetic */ String getStringOrNull(@NonNull Object obj) {
        return super.getStringOrNull(obj);
    }

    public void setStruct(@Nullable Struct struct) {
        setParams(ProtoUtils.toMapOrNull(struct));
    }
}

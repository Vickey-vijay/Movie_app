package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.ironsource.C3426d4;
import io.bidmachine.models.ICustomParams;
import io.bidmachine.utils.ProtoUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: CustomParams.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH\u0016J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u001c\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lio/bidmachine/CustomParams;", "Lio/bidmachine/models/ICustomParams;", "", C3426d4.i.W, "value", "addParam", "", "", "", "", "", "params", "addParams", "Lcom/explorestack/protobuf/Struct$Builder;", "builder", "Lmj/r;", "fillStructBuilder", "", "", "customMap", "Ljava/util/Map;", "<init>", "()V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class CustomParams implements ICustomParams<CustomParams> {
    private final Map<String, Object> customMap = new LinkedHashMap();

    @Override // io.bidmachine.models.ICustomParams
    public /* bridge */ /* synthetic */ CustomParams addParams(Map map) {
        return addParams((Map<String, String>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ICustomParams
    public CustomParams addParams(Map<String, String> params) {
        ck.p.j(params, "params");
        this.customMap.putAll(params);
        return this;
    }

    public final void fillStructBuilder(Struct.Builder builder) {
        ck.p.j(builder, "builder");
        ProtoUtils.fillStructWithPrimitiveValues(builder, this.customMap);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ICustomParams
    public CustomParams addParam(String key, String value) {
        ck.p.j(key, C3426d4.i.W);
        ck.p.j(value, "value");
        this.customMap.put(key, value);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ICustomParams
    public CustomParams addParam(String key, int value) {
        ck.p.j(key, C3426d4.i.W);
        this.customMap.put(key, Integer.valueOf(value));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ICustomParams
    public CustomParams addParam(String key, float value) {
        ck.p.j(key, C3426d4.i.W);
        this.customMap.put(key, Float.valueOf(value));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ICustomParams
    public CustomParams addParam(String key, double value) {
        ck.p.j(key, C3426d4.i.W);
        this.customMap.put(key, Double.valueOf(value));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ICustomParams
    public CustomParams addParam(String key, boolean value) {
        ck.p.j(key, C3426d4.i.W);
        this.customMap.put(key, Boolean.valueOf(value));
        return this;
    }
}

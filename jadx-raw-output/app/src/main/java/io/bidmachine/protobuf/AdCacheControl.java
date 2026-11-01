package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes.dex */
public enum AdCacheControl implements ProtocolMessageEnum {
    AD_CACHE_CONTROL_DISABLED(0),
    AD_CACHE_CONTROL_ENABLED(1),
    UNRECOGNIZED(-1);

    public static final int AD_CACHE_CONTROL_DISABLED_VALUE = 0;
    public static final int AD_CACHE_CONTROL_ENABLED_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<AdCacheControl> internalValueMap = new Internal.EnumLiteMap<AdCacheControl>() { // from class: io.bidmachine.protobuf.AdCacheControl.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public AdCacheControl findValueByNumber(int i10) {
            return AdCacheControl.forNumber(i10);
        }
    };
    private static final AdCacheControl[] VALUES = values();

    public static AdCacheControl forNumber(int i10) {
        if (i10 == 0) {
            return AD_CACHE_CONTROL_DISABLED;
        }
        if (i10 != 1) {
            return null;
        }
        return AD_CACHE_CONTROL_ENABLED;
    }

    public static Internal.EnumLiteMap<AdCacheControl> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static AdCacheControl valueOf(int i10) {
        return forNumber(i10);
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum, com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    AdCacheControl(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(5);
    }

    public static AdCacheControl valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }
}

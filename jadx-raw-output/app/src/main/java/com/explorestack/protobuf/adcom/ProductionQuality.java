package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes6.dex */
public enum ProductionQuality implements ProtocolMessageEnum {
    PRODUCTION_QUALITY_INVALID(0),
    PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED(1),
    PRODUCTION_QUALITY_PROSUMER(2),
    PRODUCTION_QUALITY_USER_GENERATED(3),
    UNRECOGNIZED(-1);

    public static final int PRODUCTION_QUALITY_INVALID_VALUE = 0;
    public static final int PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED_VALUE = 1;
    public static final int PRODUCTION_QUALITY_PROSUMER_VALUE = 2;
    public static final int PRODUCTION_QUALITY_USER_GENERATED_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap<ProductionQuality> internalValueMap = new Internal.EnumLiteMap<ProductionQuality>() { // from class: com.explorestack.protobuf.adcom.ProductionQuality.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public ProductionQuality findValueByNumber(int i10) {
            return ProductionQuality.forNumber(i10);
        }
    };
    private static final ProductionQuality[] VALUES = values();

    public static ProductionQuality forNumber(int i10) {
        if (i10 == 0) {
            return PRODUCTION_QUALITY_INVALID;
        }
        if (i10 == 1) {
            return PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED;
        }
        if (i10 == 2) {
            return PRODUCTION_QUALITY_PROSUMER;
        }
        if (i10 != 3) {
            return null;
        }
        return PRODUCTION_QUALITY_USER_GENERATED;
    }

    public static Internal.EnumLiteMap<ProductionQuality> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static ProductionQuality valueOf(int i10) {
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

    ProductionQuality(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(27);
    }

    public static ProductionQuality valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

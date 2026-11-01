package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum DeliveryMethod implements ProtocolMessageEnum {
    DELIVERY_METHOD_INVALID(0),
    DELIVERY_METHOD_STREAMING(1),
    DELIVERY_METHOD_PROGRESSIVE(2),
    DELIVERY_METHOD_DOWNLOAD(3),
    UNRECOGNIZED(-1);

    public static final int DELIVERY_METHOD_DOWNLOAD_VALUE = 3;
    public static final int DELIVERY_METHOD_INVALID_VALUE = 0;
    public static final int DELIVERY_METHOD_PROGRESSIVE_VALUE = 2;
    public static final int DELIVERY_METHOD_STREAMING_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<DeliveryMethod> internalValueMap = new Internal.EnumLiteMap<DeliveryMethod>() { // from class: com.explorestack.protobuf.adcom.DeliveryMethod.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public DeliveryMethod findValueByNumber(int i10) {
            return DeliveryMethod.forNumber(i10);
        }
    };
    private static final DeliveryMethod[] VALUES = values();

    public static DeliveryMethod forNumber(int i10) {
        if (i10 == 0) {
            return DELIVERY_METHOD_INVALID;
        }
        if (i10 == 1) {
            return DELIVERY_METHOD_STREAMING;
        }
        if (i10 == 2) {
            return DELIVERY_METHOD_PROGRESSIVE;
        }
        if (i10 != 3) {
            return null;
        }
        return DELIVERY_METHOD_DOWNLOAD;
    }

    public static Internal.EnumLiteMap<DeliveryMethod> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static DeliveryMethod valueOf(int i10) {
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

    DeliveryMethod(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(8);
    }

    public static DeliveryMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

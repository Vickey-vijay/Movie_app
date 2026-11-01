package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes10.dex */
public enum CompanionType implements ProtocolMessageEnum {
    COMPANION_TYPE_INVALID(0),
    COMPANION_TYPE_STATIC_RESOURCE(1),
    COMPANION_TYPE_HTML_RESOURCE(2),
    COMPANION_TYPE_IFRAME_RESOURCE(3),
    UNRECOGNIZED(-1);

    public static final int COMPANION_TYPE_HTML_RESOURCE_VALUE = 2;
    public static final int COMPANION_TYPE_IFRAME_RESOURCE_VALUE = 3;
    public static final int COMPANION_TYPE_INVALID_VALUE = 0;
    public static final int COMPANION_TYPE_STATIC_RESOURCE_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<CompanionType> internalValueMap = new Internal.EnumLiteMap<CompanionType>() { // from class: com.explorestack.protobuf.adcom.CompanionType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public CompanionType findValueByNumber(int i10) {
            return CompanionType.forNumber(i10);
        }
    };
    private static final CompanionType[] VALUES = values();

    public static CompanionType forNumber(int i10) {
        if (i10 == 0) {
            return COMPANION_TYPE_INVALID;
        }
        if (i10 == 1) {
            return COMPANION_TYPE_STATIC_RESOURCE;
        }
        if (i10 == 2) {
            return COMPANION_TYPE_HTML_RESOURCE;
        }
        if (i10 != 3) {
            return null;
        }
        return COMPANION_TYPE_IFRAME_RESOURCE;
    }

    public static Internal.EnumLiteMap<CompanionType> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static CompanionType valueOf(int i10) {
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

    CompanionType(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(4);
    }

    public static CompanionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

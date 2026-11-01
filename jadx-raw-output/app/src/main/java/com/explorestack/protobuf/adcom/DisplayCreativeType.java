package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes6.dex */
public enum DisplayCreativeType implements ProtocolMessageEnum {
    DISPLAY_CREATIVE_TYPE_INVALID(0),
    DISPLAY_CREATIVE_TYPE_HTML(1),
    DISPLAY_CREATIVE_TYPE_AMPHTML(2),
    DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT(3),
    DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT(4),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_CREATIVE_TYPE_AMPHTML_VALUE = 2;
    public static final int DISPLAY_CREATIVE_TYPE_HTML_VALUE = 1;
    public static final int DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT_VALUE = 3;
    public static final int DISPLAY_CREATIVE_TYPE_INVALID_VALUE = 0;
    public static final int DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT_VALUE = 4;
    private final int value;
    private static final Internal.EnumLiteMap<DisplayCreativeType> internalValueMap = new Internal.EnumLiteMap<DisplayCreativeType>() { // from class: com.explorestack.protobuf.adcom.DisplayCreativeType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public DisplayCreativeType findValueByNumber(int i10) {
            return DisplayCreativeType.forNumber(i10);
        }
    };
    private static final DisplayCreativeType[] VALUES = values();

    public static DisplayCreativeType forNumber(int i10) {
        if (i10 == 0) {
            return DISPLAY_CREATIVE_TYPE_INVALID;
        }
        if (i10 == 1) {
            return DISPLAY_CREATIVE_TYPE_HTML;
        }
        if (i10 == 2) {
            return DISPLAY_CREATIVE_TYPE_AMPHTML;
        }
        if (i10 == 3) {
            return DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT;
        }
        if (i10 != 4) {
            return null;
        }
        return DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT;
    }

    public static Internal.EnumLiteMap<DisplayCreativeType> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static DisplayCreativeType valueOf(int i10) {
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

    DisplayCreativeType(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(11);
    }

    public static DisplayCreativeType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

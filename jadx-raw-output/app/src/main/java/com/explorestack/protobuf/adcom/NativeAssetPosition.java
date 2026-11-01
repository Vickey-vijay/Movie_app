package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum NativeAssetPosition implements ProtocolMessageEnum {
    ASSET_POSITION_TOP_LEFT(0),
    ASSET_POSITION_TOP_RIGHT(1),
    ASSET_POSITION_BOTTOM_LEFT(2),
    ASSET_POSITION_BOTTOM_RIGHT(3),
    UNRECOGNIZED(-1);

    public static final int ASSET_POSITION_BOTTOM_LEFT_VALUE = 2;
    public static final int ASSET_POSITION_BOTTOM_RIGHT_VALUE = 3;
    public static final int ASSET_POSITION_TOP_LEFT_VALUE = 0;
    public static final int ASSET_POSITION_TOP_RIGHT_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<NativeAssetPosition> internalValueMap = new Internal.EnumLiteMap<NativeAssetPosition>() { // from class: com.explorestack.protobuf.adcom.NativeAssetPosition.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public NativeAssetPosition findValueByNumber(int i10) {
            return NativeAssetPosition.forNumber(i10);
        }
    };
    private static final NativeAssetPosition[] VALUES = values();

    public static NativeAssetPosition forNumber(int i10) {
        if (i10 == 0) {
            return ASSET_POSITION_TOP_LEFT;
        }
        if (i10 == 1) {
            return ASSET_POSITION_TOP_RIGHT;
        }
        if (i10 == 2) {
            return ASSET_POSITION_BOTTOM_LEFT;
        }
        if (i10 != 3) {
            return null;
        }
        return ASSET_POSITION_BOTTOM_RIGHT;
    }

    public static Internal.EnumLiteMap<NativeAssetPosition> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static NativeAssetPosition valueOf(int i10) {
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

    NativeAssetPosition(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(22);
    }

    public static NativeAssetPosition valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

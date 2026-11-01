package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes10.dex */
public enum PostbannerType implements ProtocolMessageEnum {
    DISABLED(0),
    MAIN(1),
    STORE(2),
    MIXED(3),
    UNRECOGNIZED(-1);

    public static final int DISABLED_VALUE = 0;
    public static final int MAIN_VALUE = 1;
    public static final int MIXED_VALUE = 3;
    public static final int STORE_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<PostbannerType> internalValueMap = new Internal.EnumLiteMap<PostbannerType>() { // from class: io.bidmachine.protobuf.PostbannerType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public PostbannerType findValueByNumber(int i10) {
            return PostbannerType.forNumber(i10);
        }
    };
    private static final PostbannerType[] VALUES = values();

    public static PostbannerType forNumber(int i10) {
        if (i10 == 0) {
            return DISABLED;
        }
        if (i10 == 1) {
            return MAIN;
        }
        if (i10 == 2) {
            return STORE;
        }
        if (i10 != 3) {
            return null;
        }
        return MIXED;
    }

    public static Internal.EnumLiteMap<PostbannerType> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static PostbannerType valueOf(int i10) {
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

    PostbannerType(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(0);
    }

    public static PostbannerType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

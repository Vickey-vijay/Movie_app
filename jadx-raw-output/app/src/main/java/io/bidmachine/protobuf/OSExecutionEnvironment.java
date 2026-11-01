package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes11.dex */
public enum OSExecutionEnvironment implements ProtocolMessageEnum {
    OS_EXECUTION_ENVIRONMENT_UNKNOWN(0),
    OS_EXECUTION_ENVIRONMENT_MAC_CATALYST(1),
    OS_EXECUTION_ENVIRONMENT_MAC_IOS(2),
    OS_EXECUTION_ENVIRONMENT_NATIVE_IOS(3),
    UNRECOGNIZED(-1);

    public static final int OS_EXECUTION_ENVIRONMENT_MAC_CATALYST_VALUE = 1;
    public static final int OS_EXECUTION_ENVIRONMENT_MAC_IOS_VALUE = 2;
    public static final int OS_EXECUTION_ENVIRONMENT_NATIVE_IOS_VALUE = 3;
    public static final int OS_EXECUTION_ENVIRONMENT_UNKNOWN_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<OSExecutionEnvironment> internalValueMap = new Internal.EnumLiteMap<OSExecutionEnvironment>() { // from class: io.bidmachine.protobuf.OSExecutionEnvironment.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public OSExecutionEnvironment findValueByNumber(int i10) {
            return OSExecutionEnvironment.forNumber(i10);
        }
    };
    private static final OSExecutionEnvironment[] VALUES = values();

    public static OSExecutionEnvironment forNumber(int i10) {
        if (i10 == 0) {
            return OS_EXECUTION_ENVIRONMENT_UNKNOWN;
        }
        if (i10 == 1) {
            return OS_EXECUTION_ENVIRONMENT_MAC_CATALYST;
        }
        if (i10 == 2) {
            return OS_EXECUTION_ENVIRONMENT_MAC_IOS;
        }
        if (i10 != 3) {
            return null;
        }
        return OS_EXECUTION_ENVIRONMENT_NATIVE_IOS;
    }

    public static Internal.EnumLiteMap<OSExecutionEnvironment> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static OSExecutionEnvironment valueOf(int i10) {
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

    OSExecutionEnvironment(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return InitProto.getDescriptor().getEnumTypes().get(0);
    }

    public static OSExecutionEnvironment valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

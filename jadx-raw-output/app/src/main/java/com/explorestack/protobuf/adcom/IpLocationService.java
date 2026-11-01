package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum IpLocationService implements ProtocolMessageEnum {
    IP_LOCATION_SERVICE_INVALID(0),
    IP_LOCATION_SERVICE_IP2LOCATION(1),
    IP_LOCATION_SERVICE_NEUSTAR(2),
    IP_LOCATION_SERVICE_MAXMIND(3),
    IP_LOCATION_SERVICE_NETAQUITY(4),
    UNRECOGNIZED(-1);

    public static final int IP_LOCATION_SERVICE_INVALID_VALUE = 0;
    public static final int IP_LOCATION_SERVICE_IP2LOCATION_VALUE = 1;
    public static final int IP_LOCATION_SERVICE_MAXMIND_VALUE = 3;
    public static final int IP_LOCATION_SERVICE_NETAQUITY_VALUE = 4;
    public static final int IP_LOCATION_SERVICE_NEUSTAR_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<IpLocationService> internalValueMap = new Internal.EnumLiteMap<IpLocationService>() { // from class: com.explorestack.protobuf.adcom.IpLocationService.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public IpLocationService findValueByNumber(int i10) {
            return IpLocationService.forNumber(i10);
        }
    };
    private static final IpLocationService[] VALUES = values();

    public static IpLocationService forNumber(int i10) {
        if (i10 == 0) {
            return IP_LOCATION_SERVICE_INVALID;
        }
        if (i10 == 1) {
            return IP_LOCATION_SERVICE_IP2LOCATION;
        }
        if (i10 == 2) {
            return IP_LOCATION_SERVICE_NEUSTAR;
        }
        if (i10 == 3) {
            return IP_LOCATION_SERVICE_MAXMIND;
        }
        if (i10 != 4) {
            return null;
        }
        return IP_LOCATION_SERVICE_NETAQUITY;
    }

    public static Internal.EnumLiteMap<IpLocationService> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static IpLocationService valueOf(int i10) {
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

    IpLocationService(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(16);
    }

    public static IpLocationService valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

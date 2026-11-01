package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes5.dex */
public enum MediaRating implements ProtocolMessageEnum {
    MEDIA_RATING_INVALID(0),
    MEDIA_RATING_ALL_AUDIENCES(1),
    MEDIA_RATING_EVERYONE_OVER_AGE_12(2),
    MEDIA_RATING_MATURE_AUDIENCES(3),
    UNRECOGNIZED(-1);

    public static final int MEDIA_RATING_ALL_AUDIENCES_VALUE = 1;
    public static final int MEDIA_RATING_EVERYONE_OVER_AGE_12_VALUE = 2;
    public static final int MEDIA_RATING_INVALID_VALUE = 0;
    public static final int MEDIA_RATING_MATURE_AUDIENCES_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap<MediaRating> internalValueMap = new Internal.EnumLiteMap<MediaRating>() { // from class: com.explorestack.protobuf.adcom.MediaRating.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public MediaRating findValueByNumber(int i10) {
            return MediaRating.forNumber(i10);
        }
    };
    private static final MediaRating[] VALUES = values();

    public static MediaRating forNumber(int i10) {
        if (i10 == 0) {
            return MEDIA_RATING_INVALID;
        }
        if (i10 == 1) {
            return MEDIA_RATING_ALL_AUDIENCES;
        }
        if (i10 == 2) {
            return MEDIA_RATING_EVERYONE_OVER_AGE_12;
        }
        if (i10 != 3) {
            return null;
        }
        return MEDIA_RATING_MATURE_AUDIENCES;
    }

    public static Internal.EnumLiteMap<MediaRating> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static MediaRating valueOf(int i10) {
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

    MediaRating(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(19);
    }

    public static MediaRating valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

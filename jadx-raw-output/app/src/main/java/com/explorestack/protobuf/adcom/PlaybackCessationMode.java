package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes10.dex */
public enum PlaybackCessationMode implements ProtocolMessageEnum {
    PLAYBACK_CESSATION_MODE_INVALID(0),
    PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION(1),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT(2),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING(3),
    UNRECOGNIZED(-1);

    public static final int PLAYBACK_CESSATION_MODE_INVALID_VALUE = 0;
    public static final int PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING_VALUE = 3;
    public static final int PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_VALUE = 2;
    public static final int PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<PlaybackCessationMode> internalValueMap = new Internal.EnumLiteMap<PlaybackCessationMode>() { // from class: com.explorestack.protobuf.adcom.PlaybackCessationMode.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public PlaybackCessationMode findValueByNumber(int i10) {
            return PlaybackCessationMode.forNumber(i10);
        }
    };
    private static final PlaybackCessationMode[] VALUES = values();

    public static PlaybackCessationMode forNumber(int i10) {
        if (i10 == 0) {
            return PLAYBACK_CESSATION_MODE_INVALID;
        }
        if (i10 == 1) {
            return PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION;
        }
        if (i10 == 2) {
            return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT;
        }
        if (i10 != 3) {
            return null;
        }
        return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING;
    }

    public static Internal.EnumLiteMap<PlaybackCessationMode> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static PlaybackCessationMode valueOf(int i10) {
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

    PlaybackCessationMode(int i10) {
        this.value = i10;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(24);
    }

    public static PlaybackCessationMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

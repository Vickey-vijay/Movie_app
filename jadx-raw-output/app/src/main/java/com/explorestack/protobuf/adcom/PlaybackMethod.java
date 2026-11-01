package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes2.dex */
public enum PlaybackMethod implements ProtocolMessageEnum {
    PLAYBACK_METHOD_INVALID(0),
    PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON(1),
    PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF(2),
    PLAYBACK_METHOD_ON_CLICK_SOUND_ON(3),
    PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON(4),
    PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON(5),
    PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF(6),
    UNRECOGNIZED(-1);

    public static final int PLAYBACK_METHOD_INVALID_VALUE = 0;
    public static final int PLAYBACK_METHOD_ON_CLICK_SOUND_ON_VALUE = 3;
    public static final int PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF_VALUE = 6;
    public static final int PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON_VALUE = 5;
    public static final int PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON_VALUE = 4;
    public static final int PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF_VALUE = 2;
    public static final int PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<PlaybackMethod> internalValueMap = new Internal.EnumLiteMap<PlaybackMethod>() { // from class: com.explorestack.protobuf.adcom.PlaybackMethod.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public PlaybackMethod findValueByNumber(int i10) {
            return PlaybackMethod.forNumber(i10);
        }
    };
    private static final PlaybackMethod[] VALUES = values();

    public static Internal.EnumLiteMap<PlaybackMethod> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static PlaybackMethod valueOf(int i10) {
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

    PlaybackMethod(int i10) {
        this.value = i10;
    }

    public static PlaybackMethod forNumber(int i10) {
        switch (i10) {
            case 0:
                return PLAYBACK_METHOD_INVALID;
            case 1:
                return PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON;
            case 2:
                return PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF;
            case 3:
                return PLAYBACK_METHOD_ON_CLICK_SOUND_ON;
            case 4:
                return PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON;
            case 5:
                return PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON;
            case 6:
                return PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(25);
    }

    public static PlaybackMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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

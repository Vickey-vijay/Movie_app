package com.android.cast.dlna.dmr;

import org.fourthline.cling.support.model.TransportState;

/* JADX INFO: compiled from: RenderControl.kt */
/* JADX INFO: loaded from: classes.dex */
public enum RenderState {
    IDLE,
    PREPARING,
    PLAYING,
    PAUSED,
    STOPPED,
    ERROR;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ uj.a f6219c = kotlin.enums.a.a(d());

    /* JADX INFO: compiled from: RenderControl.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RenderState.values().length];
            try {
                iArr[RenderState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderState.PREPARING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RenderState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RenderState.STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RenderState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static uj.a getEntries() {
        return f6219c;
    }

    public final TransportState toTransportState() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return TransportState.PLAYING;
        }
        if (i10 != 3) {
            return (i10 == 4 || i10 == 5) ? TransportState.STOPPED : TransportState.NO_MEDIA_PRESENT;
        }
        return TransportState.PAUSED_PLAYBACK;
    }
}

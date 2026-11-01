package org.fourthline.cling.support.model;

/* JADX INFO: loaded from: classes11.dex */
public enum TransportState {
    STOPPED,
    PLAYING,
    TRANSITIONING,
    PAUSED_PLAYBACK,
    PAUSED_RECORDING,
    RECORDING,
    NO_MEDIA_PRESENT,
    CUSTOM;

    public String value = name();

    public String getValue() {
        return this.value;
    }

    public TransportState setValue(String str) {
        this.value = str;
        return this;
    }

    TransportState() {
    }

    public static TransportState valueOrCustomOf(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return CUSTOM.setValue(str);
        }
    }
}

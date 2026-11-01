package org.fourthline.cling.support.model;

/* JADX INFO: loaded from: classes6.dex */
public enum TransportStatus {
    OK,
    ERROR_OCCURRED,
    CUSTOM;

    public String value = name();

    public String getValue() {
        return this.value;
    }

    public TransportStatus setValue(String str) {
        this.value = str;
        return this;
    }

    TransportStatus() {
    }

    public static TransportStatus valueOrCustomOf(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return CUSTOM.setValue(str);
        }
    }
}

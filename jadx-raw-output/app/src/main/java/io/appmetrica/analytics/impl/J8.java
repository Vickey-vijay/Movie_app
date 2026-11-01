package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public enum J8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55423a;

    public static J8 a(Integer num) {
        if (num != null) {
            for (J8 j10 : values()) {
                if (j10.f55423a == num.intValue()) {
                    return j10;
                }
            }
        }
        return NONE;
    }

    J8(int i10) {
        this.f55423a = i10;
    }
}

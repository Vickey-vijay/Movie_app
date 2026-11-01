package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public enum Ed {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26473a;

    public final String b() {
        return this.f26473a;
    }

    Ed(String str) {
        this.f26473a = str;
    }
}

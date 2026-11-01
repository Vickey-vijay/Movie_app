package com.applovin.sdk;

/* JADX INFO: loaded from: classes5.dex */
public interface AppLovinCmpError {

    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10401a;

        public int getValue() {
            return this.f10401a;
        }

        Code(int i10) {
            this.f10401a = i10;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}

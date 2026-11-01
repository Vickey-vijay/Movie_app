package com.applovin.impl.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9073b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public int getCode() {
        return this.f9072a;
    }

    @Nullable
    public String getMessage() {
        return this.f9073b;
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }

    public AppLovinError(int i10, @Nullable String str) {
        this.f9072a = i10;
        this.f9073b = str;
    }

    public int hashCode() {
        int iHashCode;
        int code = getCode() + 59;
        String message = getMessage();
        int i10 = code * 59;
        if (message == null) {
            iHashCode = 43;
        } else {
            iHashCode = message.hashCode();
        }
        return i10 + iHashCode;
    }
}

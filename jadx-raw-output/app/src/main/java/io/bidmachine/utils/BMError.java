package io.bidmachine.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class BMError {
    public static final int BAD_CONTENT = 101;
    public static final int DESTROYED = 106;
    public static final int DUPLICATED = 111;
    public static final int EXPIRED = 107;
    public static final int HB_NETWORK = 200;
    public static final int HTTP_BAD_REQUEST = 110;
    public static final int INTERNAL = 108;
    public static final int NO_CONNECTION = 100;
    public static final int NO_CONTENT = 103;
    public static final int PLACEHOLDER_TIMEOUT = 201;
    public static final int SERVER = 109;
    public static final int TIMEOUT = 102;
    private final int code;

    @Nullable
    private final BMError errorExtension;

    @NonNull
    private final String message;
    private final boolean trackError;
    public static final BMError NoConnection = new BMError(100, "Can't connect to server");
    public static final BMError TimeoutError = new BMError(102, "Timeout reached");
    public static final BMError Request = new BMError(110, "Request contains bad syntax or cannot be fulfilled");
    public static final BMError Server = new BMError(109, "Server failed to fulfil an apparently valid request");
    public static final BMError RequestExpired = new BMError(107, "AdRequest expired, load new one please");
    public static final BMError RequestDestroyed = new BMError(106, "AdRequest destroyed, create new one please");
    public static final BMError ResponseExpired = new BMError(107, "AdResponse expired, load new one please");
    public static final BMError ResponseDuplicated = new BMError(111, "AdResponse already was shown");
    public static final BMError AlreadyShown = new BMError(111, "Ads was already shown, load new one please");
    public static final BMError Expired = new BMError(107, "Ads was expired, load new one please");
    public static final BMError Destroyed = new BMError(106, "Ads destroyed, load new one please");
    public static final BMError PlaceholderTimeout = new BMError(201, "Placeholder timeout error");
    public static final BMError NoFill = new BMError(103, "No ads fill");
    public static final BMError InternalUnknownError = internal("Unknown error");
    public static final BMError BMServerNoFill = new BMError(103, "No bid", false);

    public BMError(@NonNull BMError bMError, int i10, @Nullable String str) {
        this(bMError.getCode(), bMError.getMessage(), bMError.isTrackError(), new BMError(i10, str));
    }

    public static BMError throwable(@NonNull String str, @Nullable Throwable th2) {
        BMError bMError = null;
        if (th2 != null) {
            try {
                StringBuilder sb2 = new StringBuilder(th2.getClass().getName());
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb2.append(": ");
                    sb2.append(message);
                }
                bMError = new BMError(-1, sb2.toString());
            } catch (Throwable unused) {
            }
        }
        return new BMError(108, str, true, bMError);
    }

    public static BMError adapter(@NonNull String str) {
        return new BMError(200, str);
    }

    public static BMError adapterGetsParameter(@NonNull String str) {
        return adapter(str + " not found");
    }

    public static BMError adapterInitialization(@NonNull String str) {
        return adapter("Adapter SDK initialization error: " + str);
    }

    public static BMError adapterNotInitialized() {
        return adapter("Adapter SDK not initialized");
    }

    public static BMError incorrectContent(@NonNull String str) {
        return new BMError(101, str);
    }

    public static BMError internal(@NonNull String str) {
        return new BMError(108, str);
    }

    public static BMError notFound(@NonNull String str) {
        return new BMError(103, str + " not found");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BMError bMError = (BMError) obj;
        if (this.code != bMError.code) {
            return false;
        }
        return this.message.equals(bMError.message);
    }

    public int getCode() {
        return this.code;
    }

    @Nullable
    public BMError getErrorExtension() {
        return this.errorExtension;
    }

    @NonNull
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.code * 31) + this.message.hashCode();
    }

    public boolean isTrackError() {
        return this.trackError;
    }

    @NonNull
    public String toString() {
        if (this.errorExtension == null) {
            return "(" + this.code + ") " + this.message;
        }
        return "(" + this.code + ") " + this.message + " - (" + this.errorExtension.getCode() + " - " + this.errorExtension.getMessage() + ")";
    }

    public BMError(@NonNull BMError bMError, @Nullable BMError bMError2) {
        this(bMError.getCode(), bMError.getMessage(), bMError.isTrackError(), bMError2);
    }

    public BMError(int i10, @Nullable String str) {
        this(i10, str, true);
    }

    private BMError(int i10, @Nullable String str, boolean z10) {
        this(i10, str, z10, null);
    }

    private BMError(int i10, @Nullable String str, boolean z10, @Nullable BMError bMError) {
        this.code = i10;
        this.message = Utils.checkIfEmpty(str, "Unknown error");
        this.trackError = z10;
        this.errorExtension = bMError;
    }
}

package io.bidmachine.iab;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class IabError {
    public static final int ERROR_CODE_BAD_CONTENT = 3;
    public static final int ERROR_CODE_EXPIRED = 6;
    public static final int ERROR_CODE_INCORRECT_STATE = 4;
    public static final int ERROR_CODE_INTERNAL = 0;
    public static final int ERROR_CODE_NO_FILL = 7;
    public static final int ERROR_CODE_NO_NETWORK = 1;
    public static final int ERROR_CODE_NO_REQUIRED_ARGUMENTS = 2;
    public static final int ERROR_CODE_PLACEHOLDER_TIMEOUT = 5;

    @NonNull
    public static final IabError NO_NETWORK = new IabError(1, "No internet connection");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59146b;

    public IabError(int i10, @NonNull String str) {
        this.f59145a = i10;
        this.f59146b = str;
    }

    @NonNull
    public static IabError badContent(@NonNull String str) {
        return new IabError(3, str);
    }

    @NonNull
    public static IabError expired(@NonNull String str) {
        return new IabError(6, str);
    }

    @NonNull
    public static IabError incorrectState(@NonNull String str) {
        return new IabError(4, str);
    }

    @NonNull
    public static IabError internal(@NonNull String str) {
        return new IabError(0, str);
    }

    @NonNull
    public static IabError noFIll(@NonNull String str) {
        return new IabError(7, str);
    }

    @NonNull
    public static IabError noRequiredArguments(@NonNull String str) {
        return new IabError(2, str);
    }

    @NonNull
    public static IabError placeholder(@NonNull String str) {
        return new IabError(5, str);
    }

    @NonNull
    public static IabError throwable(@NonNull String str, @Nullable Throwable th2) {
        if (th2 != null) {
            try {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(" - ");
                sb2.append(th2.getClass().getName());
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb2.append(": ");
                    sb2.append(message);
                }
                return internal(sb2.toString());
            } catch (Throwable unused) {
            }
        }
        return internal(str);
    }

    public int getCode() {
        return this.f59145a;
    }

    @NonNull
    public String getMessage() {
        return this.f59146b;
    }

    @NonNull
    public String toString() {
        return String.format("(%s) %s", Integer.valueOf(this.f59145a), this.f59146b);
    }
}

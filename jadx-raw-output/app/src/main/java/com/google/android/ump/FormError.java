package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes6.dex */
public class FormError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20252b;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f20251a = i10;
        this.f20252b = str;
    }

    public int getErrorCode() {
        return this.f20251a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f20252b;
    }
}

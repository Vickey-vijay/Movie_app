package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @RequiresApi(29)
    public static class Api29Impl {
        @DoNotInline
        public static void startForeground(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & 255);
            }
        }

        private Api29Impl() {
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        @DoNotInline
        public static void startForeground(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }

        private Api34Impl() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StopForegroundFlags {
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static void stopForeground(Service service, int i10) {
            service.stopForeground(i10);
        }
    }

    public static void startForeground(@NonNull Service service, int i10, @NonNull Notification notification, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            Api34Impl.startForeground(service, i10, notification, i11);
        } else if (i12 >= 29) {
            Api29Impl.startForeground(service, i10, notification, i11);
        } else {
            service.startForeground(i10, notification);
        }
    }

    private ServiceCompat() {
    }

    public static void stopForeground(@NonNull Service service, int i10) {
        Api24Impl.stopForeground(service, i10);
    }
}

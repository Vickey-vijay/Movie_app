package g5;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.StringRes;

/* JADX INFO: compiled from: NotificationUtil.java */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"InlinedApi"})
public final class r {
    public static void a(Context context, String str, @StringRes int i10, @StringRes int i11, int i12) {
        if (k0.f53108a >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i10), i12);
            if (i11 != 0) {
                notificationChannel.setDescription(context.getString(i11));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}

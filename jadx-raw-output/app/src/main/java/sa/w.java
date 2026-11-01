package sa;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.fvvcl.flickverse.R;

/* JADX INFO: compiled from: NotifyUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class w {
    public static void a(Context context, Class cls, String str, String str2, int i10) {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.setFlags(268435456);
        if (i10 > 0) {
            intent.putExtra("id", i10);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("default", "默认通知", 4));
        }
        notificationManager.notify(iCurrentTimeMillis, new NotificationCompat.Builder(context, "default").setSmallIcon(R.mipmap.ic_launcher).setContentTitle(str).setContentText(str2).setAutoCancel(true).setDefaults(-1).setWhen(System.currentTimeMillis()).setContentIntent(PendingIntent.getActivity(context, iCurrentTimeMillis, intent, 134217728)).build());
    }
}

package io.bidmachine.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.R;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class DownloadNotificationHelper {

    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    @RequiresApi(31)
    public static final class a {
        private a() {
        }

        @DoNotInline
        @SuppressLint({"WrongConstant"})
        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }

    private Notification buildEndStateNotification(Context context, @DrawableRes int i10, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i11) {
        return buildNotification(context, i10, pendingIntent, str, i11, 0, 0, false, false, true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    public Notification buildProgressNotification(Context context, @DrawableRes int i10, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        float percentDownloaded;
        boolean z12;
        float f10 = 0.0f;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i16 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            Download download = list.get(i17);
            int i18 = download.state;
            if (i18 == 0) {
                z15 = true;
            } else if (i18 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f10 += percentDownloaded;
                    z13 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            } else if (i18 == 5) {
                z17 = true;
            } else if (i18 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f10 += percentDownloaded;
                    z13 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            }
        }
        if (!z14) {
            if (z15 && i11 != 0) {
                i12 = (i11 & 2) != 0 ? R.string.exo_download_paused_for_wifi : (i11 & 1) != 0 ? R.string.exo_download_paused_for_network : R.string.exo_download_paused;
                z10 = false;
            } else if (z17) {
                i13 = R.string.exo_download_removing;
            } else {
                z10 = true;
                i12 = 0;
            }
            if (z10) {
                if (z14) {
                    int i19 = (int) (f10 / i16);
                    z11 = !z13 && z16;
                    i15 = i19;
                } else {
                    z11 = true;
                    i15 = 0;
                }
                i14 = 100;
            } else {
                i14 = 0;
                i15 = 0;
                z11 = false;
            }
            return buildNotification(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
        }
        i13 = R.string.exo_download_downloading;
        i12 = i13;
        z10 = true;
        if (z10) {
            if (z14) {
                int i110 = (int) (f10 / i16);
                z11 = !z13 && z16;
                i15 = i110;
            } else {
                z11 = true;
                i15 = 0;
            }
            i14 = 100;
        } else {
            i14 = 0;
            i15 = 0;
            z11 = false;
        }
        return buildNotification(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
    }

    private Notification buildNotification(Context context, @DrawableRes int i10, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.notificationBuilder.setSmallIcon(i10);
        this.notificationBuilder.setContentTitle(i11 == 0 ? null : context.getResources().getString(i11));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i12, i13, z10);
        this.notificationBuilder.setOngoing(z11);
        this.notificationBuilder.setShowWhen(z12);
        if (Util.SDK_INT >= 31) {
            a.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int i10, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i10, pendingIntent, str, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int i10, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i10, pendingIntent, str, R.string.exo_download_failed);
    }

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }
}

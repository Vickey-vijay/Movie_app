package com.luck.picture.lib.service;

import a8.e;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import o8.l;

/* JADX INFO: loaded from: classes4.dex */
public class ForegroundService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f32330b = "com.luck.picture.lib." + ForegroundService.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f32331c = false;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        f32331c = false;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        f32331c = true;
        return super.onStartCommand(intent, i10, i11);
    }

    public static void c(Context context) {
        try {
            if (!f32331c && PictureSelectionConfig.e().f32231q0) {
                Intent intent = new Intent(context, (Class<?>) ForegroundService.class);
                if (l.d()) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void stopService(Context context) {
        try {
            if (f32331c) {
                context.stopService(new Intent(context, (Class<?>) ForegroundService.class));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final Notification a() {
        int i10;
        int i11;
        if (l.a()) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (l.d()) {
            NotificationChannel notificationChannel = new NotificationChannel(f32330b, "com.luck.picture.lib", i10);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.canBypassDnd();
            notificationChannel.setBypassDnd(true);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
        if (PictureSelectionConfig.e().f32200b == e.b()) {
            i11 = R$string.ps_use_sound;
        } else {
            i11 = R$string.ps_use_camera;
        }
        return new NotificationCompat.Builder(this, f32330b).setSmallIcon(R$drawable.ps_ic_trans_1px).setContentTitle(b()).setContentText(getString(i11)).setOngoing(true).build();
    }

    public final String b() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(1, a());
    }
}

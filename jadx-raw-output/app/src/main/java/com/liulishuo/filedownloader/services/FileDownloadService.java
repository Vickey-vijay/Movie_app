package com.liulishuo.filedownloader.services;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.yk.e.util.AdLog;
import java.lang.ref.WeakReference;
import m7.c0;
import p7.a;
import r7.b;
import u7.g;
import u7.i;
import u7.j;
import w7.c;
import w7.d;
import w7.e;
import w7.f;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"Registered"})
public class FileDownloadService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f31913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f31914c;

    public static class SeparateProcessService extends FileDownloadService {
    }

    public static class SharedMainProcessService extends FileDownloadService {
    }

    public final void a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (intent.getBooleanExtra("is_foreground", false)) {
                i iVarH = a.j().h();
                if (iVarH.f() && Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel(iVarH.c(), iVarH.d(), 2);
                    NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                    if (notificationManager == null) {
                        return;
                    } else {
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                if (Build.VERSION.SDK_INT < 29) {
                    startForeground(iVarH.e(), iVarH.b(this));
                }
                if (d.f73535a) {
                    d.a(this, "run service foreground with config: %s", iVarH);
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f31913b.onBind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f31914c.e();
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f31913b.h(intent, i10, i11);
        a(intent);
        return 1;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c.b(this);
        try {
            f.T(e.a().f73536a);
            f.U(e.a().f73537b);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
        g gVar = new g();
        if (e.a().f73539d) {
            this.f31913b = new u7.e(new WeakReference(this), gVar);
        } else {
            this.f31913b = new u7.d(new WeakReference(this), gVar);
        }
        c0.a();
        c0 c0Var = new c0((b) this.f31913b);
        this.f31914c = c0Var;
        c0Var.d();
    }
}

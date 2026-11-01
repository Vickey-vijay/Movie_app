package com.mgs.carparking.download;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.util.HashMap;
import sa.n0;
import t9.b;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, Object> f41064b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f41065c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m9.a f41066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41067e;

    public class a extends Binder {
        public a() {
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.f41065c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        b.a("DownloadService onCreate");
        this.f41067e = n0.a();
        this.f41066d = m9.a.a();
    }
}

package org.fourthline.cling.android;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import co.g;
import fn.c;
import fn.d;

/* JADX INFO: loaded from: classes.dex */
public class AndroidUpnpServiceImpl extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fn.b f65749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f65750c = new b();

    public class a extends d {
        @Override // fn.d, fn.b
        public synchronized void shutdown() {
            ((gn.b) c()).v();
            super.i(true);
        }

        public a(c cVar, g... gVarArr) {
            super(cVar, gVarArr);
        }

        @Override // fn.d
        public mo.a h(zn.a aVar, co.c cVar) {
            return AndroidUpnpServiceImpl.this.b(getConfiguration(), aVar, AndroidUpnpServiceImpl.this);
        }
    }

    public class b extends Binder implements gn.c {
        public b() {
        }

        public fn.b get() {
            return AndroidUpnpServiceImpl.this.f65749b;
        }

        public co.c getRegistry() {
            return AndroidUpnpServiceImpl.this.f65749b.getRegistry();
        }
    }

    public c a() {
        return new gn.d();
    }

    public gn.b b(c cVar, zn.a aVar, Context context) {
        return new gn.b(cVar, aVar, context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f65750c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f65749b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f65749b = new a(a(), new g[0]);
    }
}

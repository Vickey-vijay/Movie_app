package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: AdvertisingIdClient.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f35253b;

        public b(String str, boolean z10) {
            this.f35252a = str;
            this.f35253b = z10;
        }

        public String a() {
            return this.f35252a;
        }

        public boolean b() {
            return this.f35253b;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    public final class ServiceConnectionC0335c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f35255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35256b;

        private ServiceConnectionC0335c() {
            this.f35255a = new LinkedBlockingQueue<>(1);
            this.f35256b = false;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public IBinder a() throws InterruptedException {
            if (this.f35256b) {
                throw new IllegalStateException();
            }
            this.f35256b = true;
            return this.f35255a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f35255a.put(iBinder);
            } catch (InterruptedException e10) {
                q0.b("AdvertisingIdClient", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    public final class d implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f35258a;

        public d(IBinder iBinder) {
            this.f35258a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f35258a;
        }

        public boolean a(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            boolean z11 = false;
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f35258a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z11 = true;
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return z11;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f35258a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC0335c serviceConnectionC0335c = new ServiceConnectionC0335c();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, serviceConnectionC0335c, 1)) {
                    try {
                        try {
                            d dVar = new d(serviceConnectionC0335c.a());
                            b bVar = new b(dVar.getId(), dVar.a(true));
                            context.unbindService(serviceConnectionC0335c);
                            return bVar;
                        } catch (Exception e10) {
                            throw e10;
                        }
                    } catch (Throwable th2) {
                        context.unbindService(serviceConnectionC0335c);
                        throw th2;
                    }
                }
                throw new IOException("Google Play connection failed");
            } catch (Exception e11) {
                throw e11;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}

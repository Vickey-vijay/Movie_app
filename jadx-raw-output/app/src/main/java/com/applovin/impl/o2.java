package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8589b;

    public static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f8590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s4 f8591b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.k.o().unbindService(this);
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8590a.d("LicenseVerificationManager", "Failed to unbind license service", e10);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.o.a()) {
                this.f8590a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f8591b.a((Object) illegalStateException);
        }

        public a(com.applovin.impl.sdk.o oVar, s4 s4Var) {
            this.f8590a = oVar;
            this.f8591b = s4Var;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8590a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f8590a, this.f8591b, iNextInt, new Runnable() { // from class: com.applovin.impl.vc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9756b.a();
                }
            });
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                parcelObtain.writeLong(iNextInt);
                parcelObtain.writeString(com.applovin.impl.sdk.k.o().getPackageName());
                parcelObtain.writeStrongBinder(bVar);
                if (!iBinder.transact(1, parcelObtain, null, 1)) {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8590a.a("LicenseVerificationManager", "Failed to check license", e10);
                }
                a();
                this.f8591b.a((Object) e10);
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static final class b extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f8592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s4 f8593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f8595d;

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i12 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8592a.a("LicenseVerificationManager", "Verified with code " + i12);
                }
                this.f8593b.b(p2.a().b(string).a(string2).b(i12).a(this.f8594c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.f8595d.run();
                return true;
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8592a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th2);
                    }
                    this.f8593b.a((Object) new Exception(th2));
                    return false;
                } finally {
                    this.f8595d.run();
                }
            }
        }

        public b(com.applovin.impl.sdk.o oVar, s4 s4Var, int i10, Runnable runnable) {
            this.f8592a = oVar;
            this.f8593b = s4Var;
            this.f8594c = i10;
            this.f8595d = runnable;
        }
    }

    public s4 a(long j10) {
        s4 s4Var = new s4("verify_license");
        if (j10 > 0) {
            i6.a(j10, s4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f8588a);
        }
        try {
            if (!com.applovin.impl.sdk.k.o().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f8589b, s4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8589b.k("LicenseVerificationManager", exc.getMessage());
                }
                s4Var.a((Object) exc);
            }
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8589b.a("LicenseVerificationManager", "Failed to verify license", e10);
            }
            s4Var.a((Object) e10);
        }
        return s4Var;
    }

    public o2(com.applovin.impl.sdk.k kVar) {
        this.f8588a = kVar;
        this.f8589b = kVar.O();
    }
}

package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f54842a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f54842a;
    }

    public m(IBinder iBinder) {
        this.f54842a = iBinder;
    }

    public final String a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f54842a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            boolean z10 = false;
            this.f54842a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

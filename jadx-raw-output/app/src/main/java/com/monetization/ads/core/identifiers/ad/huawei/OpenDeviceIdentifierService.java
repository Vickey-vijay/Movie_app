package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface OpenDeviceIdentifierService extends IInterface {

    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f42906b = 0;

        public static final class Proxy implements OpenDeviceIdentifierService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f42907a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f42907a;
            }

            public Proxy(IBinder iBinder) {
                this.f42907a = iBinder;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public String getOaid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f42907a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    boolean z10 = false;
                    this.f42907a.transact(2, parcelObtain, parcelObtain2, 0);
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
    }

    String getOaid() throws RemoteException;

    boolean getOaidTrackLimited() throws RemoteException;
}

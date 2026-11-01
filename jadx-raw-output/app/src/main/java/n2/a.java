package n2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IReceiverService.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: n2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IReceiverService.java */
    public static abstract class AbstractBinderC0588a extends Binder implements a {

        /* JADX INFO: renamed from: n2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IReceiverService.java */
        public static class C0589a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static a f64670c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f64671b;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f64671b;
            }

            public C0589a(IBinder iBinder) {
                this.f64671b = iBinder;
            }

            @Override // n2.a
            public int j(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f64671b.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC0588a.i() != null) {
                        return AbstractBinderC0588a.i().j(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0589a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a i() {
            return C0589a.f64670c;
        }
    }

    int j(Bundle bundle) throws RemoteException;
}

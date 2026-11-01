package r7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: compiled from: IFileDownloadIPCCallback.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: r7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IFileDownloadIPCCallback.java */
    public static abstract class AbstractBinderC0623a extends Binder implements a {

        /* JADX INFO: renamed from: r7.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IFileDownloadIPCCallback.java */
        public static class C0624a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static a f66714c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f66715b;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f66715b;
            }

            public C0624a(IBinder iBinder) {
                this.f66715b = iBinder;
            }

            @Override // r7.a
            public void g(MessageSnapshot messageSnapshot) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (messageSnapshot != null) {
                        parcelObtain.writeInt(1);
                        messageSnapshot.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f66715b.transact(1, parcelObtain, null, 1) && AbstractBinderC0623a.i() != null) {
                        AbstractBinderC0623a.i().g(messageSnapshot);
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                g(parcel.readInt() != 0 ? MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return true;
        }

        public static a h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0624a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a i() {
            return C0624a.f66714c;
        }

        public AbstractBinderC0623a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }
    }

    void g(MessageSnapshot messageSnapshot) throws RemoteException;
}

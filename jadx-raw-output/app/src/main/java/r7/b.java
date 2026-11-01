package r7;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* JADX INFO: compiled from: IFileDownloadIPCService.java */
/* JADX INFO: loaded from: classes4.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: IFileDownloadIPCService.java */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: r7.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IFileDownloadIPCService.java */
        public static class C0625a implements b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static b f66716c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f66717b;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f66717b;
            }

            @Override // r7.b
            public void d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    int i13 = 1;
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    if (fileDownloadHeader != null) {
                        parcelObtain.writeInt(1);
                        fileDownloadHeader.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!z12) {
                        i13 = 0;
                    }
                    parcelObtain.writeInt(i13);
                    try {
                        if (this.f66717b.transact(4, parcelObtain, parcelObtain2, 0) || a.l() == null) {
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } else {
                            a.l().d(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }

            public C0625a(IBinder iBinder) {
                this.f66717b = iBinder;
            }

            @Override // r7.b
            public boolean a(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(i10);
                    boolean z10 = false;
                    if (!this.f66717b.transact(5, parcelObtain, parcelObtain2, 0) && a.l() != null) {
                        return a.l().a(i10);
                    }
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

            @Override // r7.b
            public void b(boolean z10) throws RemoteException {
                int i10;
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    parcelObtain.writeInt(i10);
                    if (!this.f66717b.transact(13, parcelObtain, null, 1) && a.l() != null) {
                        a.l().b(z10);
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // r7.b
            public byte c(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(i10);
                    if (!this.f66717b.transact(10, parcelObtain, parcelObtain2, 0) && a.l() != null) {
                        return a.l().c(i10);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readByte();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // r7.b
            public void e(r7.a aVar) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    if (aVar != null) {
                        iBinderAsBinder = aVar.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    if (!this.f66717b.transact(1, parcelObtain, null, 1) && a.l() != null) {
                        a.l().e(aVar);
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // r7.b
            public void s() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    if (!this.f66717b.transact(6, parcelObtain, parcelObtain2, 0) && a.l() != null) {
                        a.l().s();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // r7.b
            public void w(r7.a aVar) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    if (aVar != null) {
                        iBinderAsBinder = aVar.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    if (!this.f66717b.transact(2, parcelObtain, null, 1) && a.l() != null) {
                        a.l().w(aVar);
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

        public static b k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0625a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b l() {
            return C0625a.f66716c;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    e(r7.a.AbstractBinderC0623a.h(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    w(r7.a.AbstractBinderC0623a.h(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zT = t(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zT ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    d(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? FileDownloadHeader.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zA = a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zA ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    s();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zV = v(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zV ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    long jY = y(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jY);
                    return true;
                case 9:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    long jR = r(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jR);
                    return true;
                case 10:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    byte bC = c(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeByte(bC);
                    return true;
                case 11:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zP = p();
                    parcel2.writeNoException();
                    parcel2.writeInt(zP ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    u(parcel.readInt(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 13:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    b(parcel.readInt() != 0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zX = x(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zX ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    q();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        public a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCService");
        }
    }

    boolean a(int i10) throws RemoteException;

    void b(boolean z10) throws RemoteException;

    byte c(int i10) throws RemoteException;

    void d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) throws RemoteException;

    void e(r7.a aVar) throws RemoteException;

    boolean p() throws RemoteException;

    void q() throws RemoteException;

    long r(int i10) throws RemoteException;

    void s() throws RemoteException;

    boolean t(String str, String str2) throws RemoteException;

    void u(int i10, Notification notification) throws RemoteException;

    boolean v(int i10) throws RemoteException;

    void w(r7.a aVar) throws RemoteException;

    boolean x(int i10) throws RemoteException;

    long y(int i10) throws RemoteException;
}

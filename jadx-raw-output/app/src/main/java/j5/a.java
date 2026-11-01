package j5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import j3.b;
import j3.c;

/* JADX INFO: compiled from: IGetInstallReferrerService.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IGetInstallReferrerService.java */
    public static abstract class AbstractBinderC0543a extends b implements a {

        /* JADX INFO: renamed from: j5.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IGetInstallReferrerService.java */
        public static class C0544a extends j3.a implements a {
            public C0544a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // j5.a
            public final Bundle f(Bundle bundle) throws RemoteException {
                Parcel parcelH = h();
                c.b(parcelH, bundle);
                Parcel parcelI = i(parcelH);
                Bundle bundle2 = (Bundle) c.a(parcelI, Bundle.CREATOR);
                parcelI.recycle();
                return bundle2;
            }
        }

        public static a h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0544a(iBinder);
        }
    }

    Bundle f(Bundle bundle) throws RemoteException;
}

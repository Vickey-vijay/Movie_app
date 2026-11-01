package u7;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: FDServiceSeparateHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends r7.b.a implements s7.c.b, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteCallbackList<r7.a> f72759b = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f72760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<FileDownloadService> f72761d;

    @Override // r7.b
    public void d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) throws RemoteException {
        this.f72760c.n(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
    }

    @Override // u7.j
    public void h(Intent intent, int i10, int i11) {
    }

    public final synchronized int m(MessageSnapshot messageSnapshot) {
        int iBeginBroadcast;
        RemoteCallbackList<r7.a> remoteCallbackList;
        iBeginBroadcast = this.f72759b.beginBroadcast();
        for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
            try {
                try {
                    ((r7.a) this.f72759b.getBroadcastItem(i10)).g(messageSnapshot);
                } catch (Throwable th2) {
                    this.f72759b.finishBroadcast();
                    throw th2;
                }
            } catch (RemoteException e10) {
                w7.d.c(this, e10, "callback error", new Object[0]);
                remoteCallbackList = this.f72759b;
                remoteCallbackList.finishBroadcast();
                return iBeginBroadcast;
            }
        }
        remoteCallbackList = this.f72759b;
        remoteCallbackList.finishBroadcast();
        return iBeginBroadcast;
    }

    @Override // u7.j
    public IBinder onBind(Intent intent) {
        return this;
    }

    @Override // r7.b
    public boolean a(int i10) throws RemoteException {
        return this.f72760c.k(i10);
    }

    @Override // r7.b
    public void b(boolean z10) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f72761d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f72761d.get().stopForeground(z10);
    }

    @Override // r7.b
    public byte c(int i10) throws RemoteException {
        return this.f72760c.f(i10);
    }

    @Override // r7.b
    public void e(r7.a aVar) throws RemoteException {
        this.f72759b.register(aVar);
    }

    @Override // r7.b
    public boolean p() throws RemoteException {
        return this.f72760c.j();
    }

    @Override // r7.b
    public void q() throws RemoteException {
        this.f72760c.c();
    }

    @Override // r7.b
    public long r(int i10) throws RemoteException {
        return this.f72760c.g(i10);
    }

    @Override // r7.b
    public void s() throws RemoteException {
        this.f72760c.l();
    }

    @Override // r7.b
    public boolean t(String str, String str2) throws RemoteException {
        return this.f72760c.i(str, str2);
    }

    @Override // r7.b
    public void u(int i10, Notification notification) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f72761d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f72761d.get().startForeground(i10, notification);
    }

    @Override // r7.b
    public boolean v(int i10) throws RemoteException {
        return this.f72760c.m(i10);
    }

    @Override // r7.b
    public void w(r7.a aVar) throws RemoteException {
        this.f72759b.unregister(aVar);
    }

    @Override // r7.b
    public boolean x(int i10) throws RemoteException {
        return this.f72760c.d(i10);
    }

    @Override // r7.b
    public long y(int i10) throws RemoteException {
        return this.f72760c.e(i10);
    }

    public d(WeakReference<FileDownloadService> weakReference, g gVar) {
        this.f72761d = weakReference;
        this.f72760c = gVar;
        s7.c.a().c(this);
    }

    @Override // s7.c.b
    public void i(MessageSnapshot messageSnapshot) {
        m(messageSnapshot);
    }
}

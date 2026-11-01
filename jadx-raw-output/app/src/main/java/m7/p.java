package m7;

import android.os.IBinder;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;

/* JADX INFO: compiled from: FileDownloadServiceUIGuard.java */
/* JADX INFO: loaded from: classes7.dex */
public class p extends u7.a<a, r7.b> {

    /* JADX INFO: compiled from: FileDownloadServiceUIGuard.java */
    public static class a extends r7.a.AbstractBinderC0623a {
        @Override // r7.a
        public void g(MessageSnapshot messageSnapshot) throws RemoteException {
            s7.c.a().b(messageSnapshot);
        }
    }

    public p() {
        super(FileDownloadService.SeparateProcessService.class);
    }

    @Override // u7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public a p() {
        return new a();
    }

    @Override // m7.v
    public boolean a(int i10) {
        if (!isConnected()) {
            return w7.a.c(i10);
        }
        try {
            return q().a(i10);
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // m7.v
    public void b(boolean z10) {
        if (!isConnected()) {
            w7.a.e(z10);
            return;
        }
        try {
            try {
                q().b(z10);
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
        } finally {
            this.f72747e = false;
        }
    }

    @Override // m7.v
    public byte c(int i10) {
        if (!isConnected()) {
            return w7.a.a(i10);
        }
        try {
            return q().c(i10);
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return (byte) 0;
        }
    }

    @Override // m7.v
    public boolean d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        if (!isConnected()) {
            return w7.a.d(str, str2, z10);
        }
        try {
            q().d(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
            return true;
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // u7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public r7.b h(IBinder iBinder) {
        return r7.b.a.k(iBinder);
    }

    @Override // u7.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void r(r7.b bVar, a aVar) throws RemoteException {
        bVar.e(aVar);
    }

    @Override // u7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void t(r7.b bVar, a aVar) throws RemoteException {
        bVar.w(aVar);
    }
}

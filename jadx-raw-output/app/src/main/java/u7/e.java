package u7;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import java.lang.ref.WeakReference;
import m7.n;

/* JADX INFO: compiled from: FDServiceSharedHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends r7.b.a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f72762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<FileDownloadService> f72763c;

    /* JADX INFO: compiled from: FDServiceSharedHandler.java */
    public interface a {
        void e(e eVar);
    }

    @Override // r7.b
    public void d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        this.f72762b.n(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
    }

    @Override // r7.b
    public void e(r7.a aVar) {
    }

    @Override // u7.j
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // r7.b
    public void w(r7.a aVar) {
    }

    @Override // r7.b
    public boolean a(int i10) {
        return this.f72762b.k(i10);
    }

    @Override // r7.b
    public void b(boolean z10) {
        WeakReference<FileDownloadService> weakReference = this.f72763c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f72763c.get().stopForeground(z10);
    }

    @Override // r7.b
    public byte c(int i10) {
        return this.f72762b.f(i10);
    }

    @Override // r7.b
    public boolean p() {
        return this.f72762b.j();
    }

    @Override // r7.b
    public void q() {
        this.f72762b.c();
    }

    @Override // r7.b
    public long r(int i10) {
        return this.f72762b.g(i10);
    }

    @Override // r7.b
    public void s() {
        this.f72762b.l();
    }

    @Override // r7.b
    public boolean t(String str, String str2) {
        return this.f72762b.i(str, str2);
    }

    @Override // r7.b
    public void u(int i10, Notification notification) {
        WeakReference<FileDownloadService> weakReference = this.f72763c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f72763c.get().startForeground(i10, notification);
    }

    @Override // r7.b
    public boolean v(int i10) {
        return this.f72762b.m(i10);
    }

    @Override // r7.b
    public boolean x(int i10) {
        return this.f72762b.d(i10);
    }

    @Override // r7.b
    public long y(int i10) {
        return this.f72762b.e(i10);
    }

    public e(WeakReference<FileDownloadService> weakReference, g gVar) {
        this.f72763c = weakReference;
        this.f72762b = gVar;
    }

    @Override // u7.j
    public void h(Intent intent, int i10, int i11) {
        n.e().e(this);
    }
}

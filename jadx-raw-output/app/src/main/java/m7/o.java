package m7;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FileDownloadServiceSharedTransmit.java */
/* JADX INFO: loaded from: classes8.dex */
public class o implements v, u7.e.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?> f64236e = FileDownloadService.SharedMainProcessService.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64237b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Runnable> f64238c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u7.e f64239d;

    @Override // m7.v
    public void o(Context context) {
        n(context, null);
    }

    @Override // u7.e.a
    public void e(u7.e eVar) {
        this.f64239d = eVar;
        List list = (List) this.f64238c.clone();
        this.f64238c.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        f.e().b(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, f64236e));
    }

    @Override // m7.v
    public boolean isConnected() {
        return this.f64239d != null;
    }

    @Override // m7.v
    public boolean m() {
        return this.f64237b;
    }

    @Override // m7.v
    public void n(Context context, Runnable runnable) {
        if (runnable != null && !this.f64238c.contains(runnable)) {
            this.f64238c.add(runnable);
        }
        Intent intent = new Intent(context, f64236e);
        boolean zP = w7.f.P(context);
        this.f64237b = zP;
        intent.putExtra("is_foreground", zP);
        if (!this.f64237b) {
            context.startService(intent);
            return;
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    @Override // m7.v
    public boolean a(int i10) {
        if (!isConnected()) {
            return w7.a.c(i10);
        }
        return this.f64239d.a(i10);
    }

    @Override // m7.v
    public void b(boolean z10) {
        if (!isConnected()) {
            w7.a.e(z10);
        } else {
            this.f64239d.b(z10);
            this.f64237b = false;
        }
    }

    @Override // m7.v
    public byte c(int i10) {
        if (!isConnected()) {
            return w7.a.a(i10);
        }
        return this.f64239d.c(i10);
    }

    @Override // m7.v
    public boolean d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        if (!isConnected()) {
            return w7.a.d(str, str2, z10);
        }
        this.f64239d.d(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
        return true;
    }
}

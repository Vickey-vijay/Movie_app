package u7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m7.v;

/* JADX INFO: compiled from: BaseFileServiceUIGuard.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<CALLBACK extends Binder, INTERFACE extends IInterface> implements v, ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile INTERFACE f72745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f72746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f72747e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, Object> f72748f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Context> f72749g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<Runnable> f72750h = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CALLBACK f72744b = (CALLBACK) p();

    public abstract INTERFACE h(IBinder iBinder);

    @Override // m7.v
    public void o(Context context) {
        n(context, null);
    }

    public abstract CALLBACK p();

    public abstract void r(INTERFACE r10, CALLBACK callback) throws RemoteException;

    public abstract void t(INTERFACE r10, CALLBACK callback) throws RemoteException;

    @Override // m7.v
    public boolean m() {
        return this.f72747e;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (w7.d.f73535a) {
            w7.d.a(this, "onServiceDisconnected %s %s", componentName, this.f72745c);
        }
        s(true);
    }

    public INTERFACE q() {
        return this.f72745c;
    }

    public final void s(boolean z10) {
        if (!z10 && this.f72745c != null) {
            try {
                t(this.f72745c, this.f72744b);
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "release connect resources %s", this.f72745c);
        }
        this.f72745c = null;
        m7.f.e().b(new DownloadServiceConnectChangedEvent(z10 ? DownloadServiceConnectChangedEvent.ConnectStatus.lost : DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, this.f72746d));
    }

    public a(Class<?> cls) {
        this.f72746d = cls;
    }

    @Override // m7.v
    public boolean isConnected() {
        if (q() != null) {
            return true;
        }
        return false;
    }

    @Override // m7.v
    public void n(Context context, Runnable runnable) {
        if (!w7.f.J(context)) {
            if (w7.d.f73535a) {
                w7.d.a(this, "bindStartByContext %s", context.getClass().getSimpleName());
            }
            Intent intent = new Intent(context, this.f72746d);
            if (runnable != null && !this.f72750h.contains(runnable)) {
                this.f72750h.add(runnable);
            }
            if (!this.f72749g.contains(context)) {
                this.f72749g.add(context);
            }
            boolean zP = w7.f.P(context);
            this.f72747e = zP;
            intent.putExtra("is_foreground", zP);
            context.bindService(intent, this, 1);
            if (this.f72747e) {
                if (w7.d.f73535a) {
                    w7.d.a(this, "start foreground service", new Object[0]);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                    return;
                }
                return;
            }
            context.startService(intent);
            return;
        }
        throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f72745c = (INTERFACE) h(iBinder);
        if (w7.d.f73535a) {
            w7.d.a(this, "onServiceConnected %s %s", componentName, this.f72745c);
        }
        try {
            r(this.f72745c, this.f72744b);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
        List list = (List) this.f72750h.clone();
        this.f72750h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        m7.f.e().b(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, this.f72746d));
    }
}

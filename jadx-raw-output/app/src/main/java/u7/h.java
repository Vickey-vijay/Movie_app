package u7;

import android.util.SparseArray;
import com.liulishuo.filedownloader.download.DownloadLaunchRunnable;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: FileDownloadThreadPool.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f72767b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72769d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<DownloadLaunchRunnable> f72766a = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72768c = AndroidInitializeBoldSDK.MSG_NETWORK;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72770e = 0;

    public synchronized int b() {
        d();
        return this.f72766a.size();
    }

    public final synchronized void d() {
        SparseArray<DownloadLaunchRunnable> sparseArray = new SparseArray<>();
        int size = this.f72766a.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = this.f72766a.keyAt(i10);
            DownloadLaunchRunnable downloadLaunchRunnable = this.f72766a.get(iKeyAt);
            if (downloadLaunchRunnable != null && downloadLaunchRunnable.p()) {
                sparseArray.put(iKeyAt, downloadLaunchRunnable);
            }
        }
        this.f72766a = sparseArray;
    }

    public synchronized int e(String str, int i10) {
        if (str == null) {
            return 0;
        }
        int size = this.f72766a.size();
        for (int i11 = 0; i11 < size; i11++) {
            DownloadLaunchRunnable downloadLaunchRunnableValueAt = this.f72766a.valueAt(i11);
            if (downloadLaunchRunnableValueAt != null && downloadLaunchRunnableValueAt.p() && downloadLaunchRunnableValueAt.k() != i10 && str.equals(downloadLaunchRunnableValueAt.l())) {
                return downloadLaunchRunnableValueAt.k();
            }
        }
        return 0;
    }

    public synchronized List<Integer> f() {
        ArrayList arrayList;
        d();
        arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f72766a.size(); i10++) {
            SparseArray<DownloadLaunchRunnable> sparseArray = this.f72766a;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i10)).k()));
        }
        return arrayList;
    }

    public synchronized boolean g(int i10) {
        DownloadLaunchRunnable downloadLaunchRunnable;
        downloadLaunchRunnable = this.f72766a.get(i10);
        return downloadLaunchRunnable != null && downloadLaunchRunnable.p();
    }

    public synchronized boolean h(int i10) {
        if (b() > 0) {
            w7.d.i(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int iB = w7.e.b(i10);
        if (w7.d.f73535a) {
            w7.d.a(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.f72769d), Integer.valueOf(iB));
        }
        List<Runnable> listShutdownNow = this.f72767b.shutdownNow();
        this.f72767b = w7.b.a(iB, AndroidInitializeBoldSDK.MSG_NETWORK);
        if (listShutdownNow.size() > 0) {
            w7.d.i(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(listShutdownNow.size()));
        }
        this.f72769d = iB;
        return true;
    }

    public h(int i10) {
        this.f72767b = w7.b.a(i10, AndroidInitializeBoldSDK.MSG_NETWORK);
        this.f72769d = i10;
    }

    public void a(int i10) {
        d();
        synchronized (this) {
            DownloadLaunchRunnable downloadLaunchRunnable = this.f72766a.get(i10);
            if (downloadLaunchRunnable != null) {
                downloadLaunchRunnable.r();
                boolean zRemove = this.f72767b.remove(downloadLaunchRunnable);
                if (w7.d.f73535a) {
                    w7.d.a(this, "successful cancel %d %B", Integer.valueOf(i10), Boolean.valueOf(zRemove));
                }
            }
            this.f72766a.remove(i10);
        }
    }

    public void c(DownloadLaunchRunnable downloadLaunchRunnable) {
        downloadLaunchRunnable.s();
        synchronized (this) {
            this.f72766a.put(downloadLaunchRunnable.k(), downloadLaunchRunnable);
        }
        this.f72767b.execute(downloadLaunchRunnable);
        int i10 = this.f72770e;
        if (i10 >= 600) {
            d();
            this.f72770e = 0;
        } else {
            this.f72770e = i10 + 1;
        }
    }
}

package m7;

import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;

/* JADX INFO: compiled from: FileDownloadConnectListener.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e extends q7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DownloadServiceConnectChangedEvent.ConnectStatus f64216a;

    public abstract void e();

    public abstract void f();

    @Override // q7.c
    public boolean d(q7.b bVar) {
        if (!(bVar instanceof DownloadServiceConnectChangedEvent)) {
            return false;
        }
        DownloadServiceConnectChangedEvent.ConnectStatus connectStatusB = ((DownloadServiceConnectChangedEvent) bVar).b();
        this.f64216a = connectStatusB;
        if (connectStatusB == DownloadServiceConnectChangedEvent.ConnectStatus.connected) {
            e();
            return false;
        }
        f();
        return false;
    }

    public DownloadServiceConnectChangedEvent.ConnectStatus g() {
        return this.f64216a;
    }
}

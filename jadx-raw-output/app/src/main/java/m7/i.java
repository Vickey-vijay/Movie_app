package m7;

/* JADX INFO: compiled from: FileDownloadListener.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i {
    public i() {
    }

    public void blockComplete(a aVar) throws Throwable {
    }

    public abstract void completed(a aVar);

    public void connected(a aVar, String str, boolean z10, int i10, int i11) {
    }

    public abstract void error(a aVar, Throwable th2);

    public boolean isInvalid() {
        return false;
    }

    public abstract void paused(a aVar, int i10, int i11);

    public abstract void pending(a aVar, int i10, int i11);

    public abstract void progress(a aVar, int i10, int i11);

    public void retry(a aVar, Throwable th2, int i10, int i11) {
    }

    public void started(a aVar) {
    }

    public abstract void warn(a aVar);

    public i(int i10) {
        w7.d.i(this, "not handle priority any more", new Object[0]);
    }
}

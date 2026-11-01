package s7;

import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: compiled from: MessageSnapshotFlow.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d f67039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f67040b;

    /* JADX INFO: compiled from: MessageSnapshotFlow.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f67041a = new c();
    }

    /* JADX INFO: compiled from: MessageSnapshotFlow.java */
    public interface b {
        void i(MessageSnapshot messageSnapshot);
    }

    public void b(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof s7.a) {
            if (this.f67040b != null) {
                this.f67040b.i(messageSnapshot);
            }
        } else if (this.f67039a != null) {
            this.f67039a.b(messageSnapshot);
        }
    }

    public void c(b bVar) {
        this.f67040b = bVar;
        if (bVar == null) {
            this.f67039a = null;
        } else {
            this.f67039a = new d(5, bVar);
        }
    }

    public static c a() {
        return a.f67041a;
    }
}

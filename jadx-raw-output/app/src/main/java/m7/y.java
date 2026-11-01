package m7;

import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: compiled from: ITaskHunter.java */
/* JADX INFO: loaded from: classes6.dex */
public interface y extends s {

    /* JADX INFO: compiled from: ITaskHunter.java */
    public interface a {
        u b();

        MessageSnapshot e(Throwable th2);

        boolean i(MessageSnapshot messageSnapshot);

        boolean k(MessageSnapshot messageSnapshot);

        boolean l(MessageSnapshot messageSnapshot);

        boolean n(MessageSnapshot messageSnapshot);
    }

    /* JADX INFO: compiled from: ITaskHunter.java */
    public interface b {
        void start();
    }

    Throwable a();

    int d();

    void f();

    void free();

    byte getStatus();

    long j();

    long m();
}

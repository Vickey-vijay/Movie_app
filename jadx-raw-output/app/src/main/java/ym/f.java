package ym;

import java.util.EventListener;

/* JADX INFO: compiled from: LifeCycle.java */
/* JADX INFO: loaded from: classes6.dex */
public interface f {

    /* JADX INFO: compiled from: LifeCycle.java */
    public interface a extends EventListener {
        void B(f fVar, Throwable th2);

        void i(f fVar);

        void k(f fVar);

        void n(f fVar);

        void u(f fVar);
    }

    boolean I();

    boolean isRunning();

    boolean isStarted();

    boolean isStopped();

    boolean s();

    void start() throws Exception;

    void stop() throws Exception;
}

package q5;

import java.util.logging.Logger;

/* JADX INFO: compiled from: LazyLogger.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Logger f66523b;

    public Logger a() {
        Logger logger = this.f66523b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            Logger logger2 = this.f66523b;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f66522a);
            this.f66523b = logger3;
            return logger3;
        }
    }

    public h(Class<?> cls) {
        this.f66522a = cls.getName();
    }
}

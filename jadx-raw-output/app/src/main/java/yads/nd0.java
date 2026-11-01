package yads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class nd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md0 f80641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f80642b = new AtomicBoolean(false);

    public final mq0 a(Object... objArr) {
        Constructor constructorA;
        synchronized (this.f80642b) {
            if (!this.f80642b.get()) {
                try {
                    constructorA = this.f80641a.a();
                } catch (ClassNotFoundException unused) {
                    this.f80642b.set(true);
                    constructorA = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (mq0) constructorA.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public nd0(md0 md0Var) {
        this.f80641a = md0Var;
    }
}

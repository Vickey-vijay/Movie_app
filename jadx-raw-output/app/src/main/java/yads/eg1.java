package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class eg1 extends IOException {
    public eg1(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
    }
}

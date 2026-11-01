package com.yandex.div.core;

import com.yandex.div.core.Disposable;
import java.io.Closeable;

/* JADX INFO: compiled from: Disposable.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface Disposable extends AutoCloseable, Closeable {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Disposable NULL = new Disposable() { // from class: od.a
        @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
        public final void close() {
            Disposable.NULL$lambda$0();
        }
    };

    /* JADX INFO: compiled from: Disposable.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static void NULL$lambda$0() {
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    void close();
}

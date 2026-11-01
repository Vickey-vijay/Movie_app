package yads;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class qc0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cursor f81823a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f81823a.close();
    }

    public qc0(Cursor cursor) {
        this.f81823a = cursor;
    }
}

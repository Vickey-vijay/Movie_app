package com.yandex.div.storage.database;

import android.database.Cursor;
import ck.i;
import com.yandex.div.internal.util.IOUtils;
import java.io.Closeable;
import mj.r;

/* JADX INFO: compiled from: ReadState.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ReadState implements Closeable {
    private Cursor _cursor;
    private final jj.a<Cursor> cursorProvider;
    private final bk.a<r> onCloseState;

    public ReadState(bk.a<r> aVar, jj.a<Cursor> aVar2) {
        this.onCloseState = aVar;
        this.cursorProvider = aVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.closeCursorSilently(this._cursor);
        this.onCloseState.invoke();
    }

    public final Cursor getCursor() {
        if (this._cursor != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor cursor = this.cursorProvider.get();
        this._cursor = cursor;
        return cursor;
    }

    public /* synthetic */ ReadState(bk.a aVar, jj.a aVar2, int i10, i iVar) {
        this((i10 & 1) != 0 ? new bk.a<r>() { // from class: com.yandex.div.storage.database.ReadState.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }
        } : aVar, aVar2);
    }
}

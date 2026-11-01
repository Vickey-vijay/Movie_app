package io.bidmachine.media3.database;

import android.database.SQLException;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException) {
        super(sQLException);
    }

    public DatabaseIOException(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}

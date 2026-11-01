package com.yandex.div.storage.database;

import android.database.SQLException;
import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: StorageStatement.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface StorageStatement {
    @WorkerThread
    void execute(SqlCompiler sqlCompiler) throws SQLException;
}

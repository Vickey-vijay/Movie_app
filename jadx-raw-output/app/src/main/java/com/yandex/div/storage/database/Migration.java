package com.yandex.div.storage.database;

import android.database.SQLException;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface Migration {
    void migrate(DatabaseOpenHelper.Database database) throws SQLException;
}

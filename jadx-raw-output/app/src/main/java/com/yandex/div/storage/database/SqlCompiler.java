package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: SqlCompiler.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface SqlCompiler {
    ReadState compileQuery(String str, String... strArr);

    SQLiteStatement compileStatement(String str);
}

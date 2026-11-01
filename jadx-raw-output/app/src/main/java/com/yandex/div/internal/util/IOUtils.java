package com.yandex.div.internal.util;

import android.database.Cursor;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class IOUtils {
    public static void closeCursorSilently(@Nullable Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}

package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface ouw {
    int ouw(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    int ouw(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr);

    Cursor ouw(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    Uri ouw(@NonNull Uri uri, @Nullable ContentValues contentValues);

    @NonNull
    String ouw();

    String ouw(@NonNull Uri uri);
}

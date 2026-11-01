package com.bytedance.sdk.openadsdk.multipro.yu;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.zih;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lh implements com.bytedance.sdk.openadsdk.multipro.ouw {
    private Context ouw;

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Cursor ouw(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (uri.getPath().split("/")[2].equals("get_all")) {
            SharedPreferences sharedPreferencesOuw = vt.ouw(vt(), uri.getQueryParameter("sp_file_name"));
            Map<String, ?> all = sharedPreferencesOuw == null ? null : sharedPreferencesOuw.getAll();
            if (all != null) {
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
                for (String str3 : all.keySet()) {
                    Object[] objArr = new Object[3];
                    objArr[0] = str3;
                    Object obj = all.get(str3);
                    objArr[2] = obj;
                    if (obj instanceof Boolean) {
                        objArr[1] = TypedValues.Custom.S_BOOLEAN;
                    } else if (obj instanceof String) {
                        objArr[1] = TypedValues.Custom.S_STRING;
                    } else if (obj instanceof Integer) {
                        objArr[1] = ImpressionLog.f43647w;
                    } else if (obj instanceof Long) {
                        objArr[1] = "long";
                    } else if (obj instanceof Float) {
                        objArr[1] = TypedValues.Custom.S_FLOAT;
                    }
                    matrixCursor.addRow(objArr);
                }
                return matrixCursor;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    @NonNull
    public final String ouw() {
        return "t_sp";
    }

    private Context vt() {
        Context context = this.ouw;
        return context == null ? zih.ouw() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw(@NonNull Uri uri) {
        String[] strArrSplit = uri.getPath().split("/");
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(vt.ouw(zih.ouw(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return vt.ouw(vt(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Uri ouw(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            vt.ouw(vt(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            vt.vt(vt(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (vt.ouw(vt(), uri.getQueryParameter("sp_file_name"), str2)) {
            vt.vt(vt(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        ouw(uri, contentValues);
        return 0;
    }
}

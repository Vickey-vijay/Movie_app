package com.bytedance.sdk.openadsdk.multipro.ouw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.fkw;
import com.bytedance.sdk.openadsdk.core.zih;

/* JADX INFO: loaded from: classes2.dex */
public final class vt implements com.bytedance.sdk.openadsdk.multipro.ouw {
    private static final Object vt = new Object();
    private Context ouw;

    private static boolean vt(Uri uri) {
        boolean z10 = uri == null || TextUtils.isEmpty(uri.getPath());
        if (z10) {
            ko.vt("DBMultiProviderImpl", "==check uri is null==");
        }
        return z10;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Cursor ouw(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (vt) {
            if (vt(uri)) {
                return null;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str3 = strArrSplit[2];
                String str4 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str3)) {
                    return null;
                }
                return fkw.ouw(vt()).ouw().ouw(str4, strArr, str, strArr2, null, null, str2);
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    @NonNull
    public final String ouw() {
        return "t_db";
    }

    private Context vt() {
        Context context = this.ouw;
        return context == null ? zih.ouw() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw(@NonNull Uri uri) {
        synchronized (vt) {
            if (vt(uri)) {
                return null;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 5) {
                String str = strArrSplit[2];
                String str2 = strArrSplit[4];
                if ("ttopensdk.db".equals(str)) {
                    if ("execSQL".equals(str2)) {
                        String queryParameter = uri.getQueryParameter("sql");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            fkw.ouw(vt()).ouw().ouw(Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        fkw.ouw(vt()).ouw().vt();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        fkw.ouw(vt()).ouw().lh();
                    } else if ("transactionEnd".equals(str2)) {
                        fkw.ouw(vt()).ouw().yu();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Uri ouw(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (vt) {
            if (vt(uri)) {
                return null;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str = strArrSplit[2];
                String str2 = strArrSplit[3];
                if ("ttopensdk.db".equals(str)) {
                    fkw.ouw(vt()).ouw().ouw(str2, (String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (vt) {
            if (vt(uri)) {
                return 0;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str2 = strArrSplit[2];
                String str3 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return fkw.ouw(vt()).ouw().ouw(str3, str, strArr);
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (vt) {
            if (vt(uri)) {
                return 0;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str2 = strArrSplit[2];
                String str3 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return fkw.ouw(vt()).ouw().ouw(str3, contentValues, str, strArr);
            }
            return 0;
        }
    }
}

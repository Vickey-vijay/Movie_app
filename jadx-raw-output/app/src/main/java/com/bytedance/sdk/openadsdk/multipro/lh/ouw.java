package com.bytedance.sdk.openadsdk.multipro.lh;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.le.ouw.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.yu;
import com.ironsource.mediationsdk.metadata.a;

/* JADX INFO: loaded from: classes5.dex */
public final class ouw implements com.bytedance.sdk.openadsdk.multipro.ouw {
    public static boolean ouw(String str) {
        if (zih.ouw() == null) {
            return false;
        }
        try {
            le leVarYu = yu();
            if (leVarYu != null) {
                return "true".equals(leVarYu.ouw(Uri.parse(fkw() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Cursor ouw(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Uri ouw(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    @NonNull
    public final String ouw() {
        return "t_frequent";
    }

    private static String fkw() {
        return yu.vt + "/t_frequent/";
    }

    public static String lh() {
        if (zih.ouw() == null) {
            return null;
        }
        try {
            le leVarYu = yu();
            if (leVarYu != null) {
                return leVarYu.ouw(Uri.parse(fkw() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean vt() {
        if (zih.ouw() == null) {
            return false;
        }
        try {
            le leVarYu = yu();
            if (leVarYu != null) {
                return "true".equals(leVarYu.ouw(Uri.parse(fkw() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static le yu() {
        try {
            if (zih.ouw() != null) {
                return com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw(@NonNull Uri uri) {
        ko.vt("FrequentCallProviderImpl", "get type uri: ".concat(String.valueOf(uri)));
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().ouw(uri.getQueryParameter("rit")) ? "true" : a.f29886h;
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().vt() ? "true" : a.f29886h;
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().lh();
        }
        return null;
    }
}

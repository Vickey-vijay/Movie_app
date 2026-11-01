package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class fkw implements ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final List<ouw> f13264lh;
    private static volatile fkw ouw;
    private static WeakReference<Context> vt;

    public static fkw ouw(Context context) {
        if (context != null) {
            vt = new WeakReference<>(context.getApplicationContext());
        }
        if (ouw == null) {
            synchronized (fkw.class) {
                if (ouw == null) {
                    ouw = new fkw();
                }
            }
        }
        return ouw;
    }

    private static ouw vt(Uri uri) {
        if (uri == null) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            ko.vt("TTProviderManager", "uri is error2");
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            ko.vt("TTProviderManager", "uri is error3");
            return null;
        }
        for (ouw ouwVar : f13264lh) {
            if (str.equals(ouwVar.ouw())) {
                return ouwVar;
            }
        }
        ko.vt("TTProviderManager", "uri is error4");
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    @NonNull
    public final String ouw() {
        return "";
    }

    static {
        List<ouw> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        f13264lh = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.yu.lh());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.ouw.vt());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.lh.ouw());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.yu.ouw.lh(new com.bytedance.sdk.component.le.ouw.vt.vt.ouw()));
        Iterator<ouw> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private fkw() {
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Cursor ouw(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider query error==", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw(@NonNull Uri uri) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri);
            }
            return null;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider getType error==", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Uri ouw(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, contentValues);
            }
            return null;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider insert error==", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, str, strArr);
            }
            return 0;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider delete error==", th2);
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider update error==", th2);
            return 0;
        }
    }
}

package com.bytedance.sdk.openadsdk.yu.ouw;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.utils.ko;

/* JADX INFO: loaded from: classes2.dex */
public final class lh implements com.bytedance.sdk.openadsdk.multipro.ouw {
    private final com.bytedance.sdk.component.le.ouw.vt.vt.ouw ouw;

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Cursor ouw(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Uri ouw(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw() {
        if (this.ouw != null) {
            return "ad_log_event";
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw(Uri uri) {
        ko.vt("wrapper getType1");
        if (this.ouw != null) {
            return com.bytedance.sdk.component.le.ouw.vt.vt.ouw.ouw(uri);
        }
        return null;
    }

    public lh(com.bytedance.sdk.component.le.ouw.vt.vt.ouw ouwVar) {
        this.ouw = ouwVar;
    }
}

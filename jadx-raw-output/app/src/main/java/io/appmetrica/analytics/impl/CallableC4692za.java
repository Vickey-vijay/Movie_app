package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC4692za implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Aa f58046a;

    public CallableC4692za(Aa aa2) {
        this.f58046a = aa2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f58046a.f54957a.getContentResolver();
        Aa aa2 = this.f58046a;
        aa2.f54958b = contentResolver.query(uri, null, null, new String[]{aa2.f54957a.getPackageName()}, null);
        Cursor cursor = this.f58046a.f54958b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f58046a.f54958b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C4424og(string, this.f58046a.f54958b.getLong(1), this.f58046a.f54958b.getLong(2), EnumC4399ng.f57351d);
            }
        }
        return null;
    }
}

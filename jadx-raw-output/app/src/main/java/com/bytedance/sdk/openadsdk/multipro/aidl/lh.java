package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lh implements Cursor {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13259lh = 0;
    public Map<String, List<String>> ouw;
    public String[] vt;

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public final void deactivate() {
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i10) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public final int getCount() {
        try {
            String[] strArr = this.vt;
            if (strArr != null && strArr.length != 0) {
                return this.ouw.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public final int getType(int i10) {
        return 0;
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        String[] strArr = this.vt;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        String[] strArr = this.vt;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.vt;
            if (i10 >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i10])) {
                return i10;
            }
            i10++;
        }
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i10) {
        if (i10 < 0) {
            return "";
        }
        String[] strArr = this.vt;
        return i10 < strArr.length ? strArr[i10] : "";
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.vt;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f13259lh;
    }

    @Override // android.database.Cursor
    public final String getString(int i10) {
        return (i10 < 0 || i10 >= getColumnCount()) ? "" : this.ouw.get(this.vt[i10]).get(getPosition());
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f13259lh == 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.f13259lh == getCount() - 1;
    }

    @Override // android.database.Cursor
    public final boolean move(int i10) {
        if (this.f13259lh + i10 >= getCount()) {
            return false;
        }
        this.f13259lh += i10;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        if (this.f13259lh + 1 >= getCount()) {
            return false;
        }
        this.f13259lh++;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        int i10 = this.f13259lh;
        if (i10 - 1 < 0) {
            return false;
        }
        this.f13259lh = i10 - 1;
        return true;
    }

    public lh(Map<String, List<String>> map) {
        if (map != null && map.keySet() != null) {
            this.ouw = map;
            try {
                this.vt = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.ouw = new HashMap();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i10) {
        try {
            return Double.parseDouble(getString(i10));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public final float getFloat(int i10) {
        try {
            return Float.parseFloat(getString(i10));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public final int getInt(int i10) {
        try {
            return Integer.parseInt(getString(i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public final long getLong(int i10) {
        try {
            return Long.parseLong(getString(i10));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public final short getShort(int i10) {
        try {
            return Short.parseShort(getString(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i10) {
        if (getString(i10) == null) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.f13259lh = 0;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.f13259lh = this.ouw.get(this.vt[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i10) {
        if (i10 >= getCount()) {
            return false;
        }
        this.f13259lh = i10;
        return true;
    }
}

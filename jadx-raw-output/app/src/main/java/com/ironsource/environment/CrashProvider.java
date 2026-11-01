package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.I4;
import com.ironsource.Z7;

/* JADX INFO: loaded from: classes5.dex */
public class CrashProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I4 f28815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28816c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f28818e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28822i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UriMatcher f28817d = new UriMatcher(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28819f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28820g = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f28823j = Z7.f27983c;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f28817d.match(uri);
        if (iMatch == 1) {
            return this.f28821h;
        }
        if (iMatch == 2) {
            return this.f28822i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f28817d.match(uri);
        if (iMatch == 1) {
            return I4.c();
        }
        if (iMatch == 2) {
            return I4.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f28814a = getContext();
        this.f28815b = new I4(this.f28814a);
        this.f28816c = this.f28814a.getPackageName();
        this.f28818e = Uri.parse("content://" + this.f28816c + "/" + Z7.f27983c);
        this.f28821h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f28822i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }
}

package com.mbridge.msdk.config.component.load.downloader.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.ironsource.Y5;

/* JADX INFO: compiled from: DownloadInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33380i;

    public void a(long j10) {
        this.f33373b = j10;
    }

    public long b() {
        return this.f33373b;
    }

    public String c() {
        return this.f33375d;
    }

    public void d(String str) {
        this.f33372a = str;
    }

    public void a(int i10) {
        this.f33379h = i10;
    }

    public void b(String str) {
        this.f33375d = str;
    }

    public void c(long j10) {
        this.f33376e = j10;
    }

    public void d(long j10) {
        this.f33374c = j10;
    }

    public String e() {
        return this.f33372a;
    }

    public int f() {
        return this.f33379h;
    }

    public long g() {
        return this.f33377f;
    }

    public long h() {
        return this.f33376e;
    }

    public long i() {
        return this.f33374c;
    }

    private b() {
    }

    public String a() {
        return this.f33380i;
    }

    public void b(long j10) {
        this.f33377f = j10;
    }

    public void c(String str) {
        this.f33378g = str;
    }

    public String d() {
        return this.f33378g;
    }

    public void a(String str) {
        this.f33380i = str;
    }

    public static b a(String str, String str2, long j10, long j11, long j12, long j13, String str3, int i10, String str4) {
        b bVar = new b();
        bVar.b(str);
        bVar.d(str2);
        bVar.b(j13);
        bVar.a(j10);
        bVar.d(j11);
        bVar.c(j12);
        bVar.a(str3);
        bVar.a(i10);
        bVar.c(str4);
        return bVar;
    }

    public static b a(Cursor cursor) {
        b bVar = new b();
        cursor.moveToFirst();
        for (String str : cursor.getColumnNames()) {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                str.hashCode();
                switch (str) {
                    case "successTime":
                        bVar.d(cursor.getLong(columnIndex));
                        break;
                    case "status":
                        bVar.a(cursor.getInt(columnIndex));
                        break;
                    case "filePath":
                        bVar.d(cursor.getString(columnIndex));
                        break;
                    case "fileSize":
                        bVar.b(cursor.getLong(columnIndex));
                        break;
                    case "contentType":
                        bVar.a(cursor.getString(columnIndex));
                        break;
                    case "URL":
                        bVar.b(cursor.getString(columnIndex));
                        break;
                    case "md5":
                        bVar.c(cursor.getString(columnIndex));
                        break;
                    case "touchTime":
                        bVar.c(cursor.getLong(columnIndex));
                        break;
                    case "createTime":
                        bVar.a(cursor.getLong(columnIndex));
                        break;
                }
            }
        }
        return bVar;
    }

    public static ContentValues a(b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("URL", bVar.c());
        contentValues.put(Y5.c.f27929c, bVar.e());
        contentValues.put("fileSize", Long.valueOf(bVar.g()));
        contentValues.put("touchTime", Long.valueOf(bVar.h()));
        contentValues.put("createTime", Long.valueOf(bVar.b()));
        contentValues.put("successTime", Long.valueOf(bVar.i()));
        contentValues.put("md5", bVar.d());
        contentValues.put("status", Integer.valueOf(bVar.f()));
        return contentValues;
    }
}

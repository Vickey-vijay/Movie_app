package hd;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: CropParameters.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.CompressFormat f53846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f53849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f53850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f53851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f53852i;

    public Bitmap.CompressFormat a() {
        return this.f53846c;
    }

    public int b() {
        return this.f53847d;
    }

    public Uri c() {
        return this.f53851h;
    }

    public Uri d() {
        return this.f53852i;
    }

    public b e() {
        return this.f53850g;
    }

    public String f() {
        return this.f53848e;
    }

    public String g() {
        return this.f53849f;
    }

    public int h() {
        return this.f53844a;
    }

    public int i() {
        return this.f53845b;
    }

    public void j(Uri uri) {
        this.f53851h = uri;
    }

    public void k(Uri uri) {
        this.f53852i = uri;
    }

    public a(int i10, int i11, Bitmap.CompressFormat compressFormat, int i12, String str, String str2, b bVar) {
        this.f53844a = i10;
        this.f53845b = i11;
        this.f53846c = compressFormat;
        this.f53847d = i12;
        this.f53848e = str;
        this.f53849f = str2;
        this.f53850g = bVar;
    }
}

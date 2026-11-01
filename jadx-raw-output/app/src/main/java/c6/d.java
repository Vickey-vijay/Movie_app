package c6;

import java.util.List;

/* JADX INFO: compiled from: DecoderResult.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<byte[]> f5666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f5668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f5669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5672j;

    public d(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public d(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f5663a = bArr;
        this.f5664b = bArr == null ? 0 : bArr.length * 8;
        this.f5665c = str;
        this.f5666d = list;
        this.f5667e = str2;
        this.f5671i = i11;
        this.f5672j = i10;
    }

    public List<byte[]> a() {
        return this.f5666d;
    }

    public String b() {
        return this.f5667e;
    }

    public int c() {
        return this.f5664b;
    }

    public Object d() {
        return this.f5670h;
    }

    public byte[] e() {
        return this.f5663a;
    }

    public int f() {
        return this.f5671i;
    }

    public int g() {
        return this.f5672j;
    }

    public String h() {
        return this.f5665c;
    }

    public boolean i() {
        return this.f5671i >= 0 && this.f5672j >= 0;
    }

    public void j(Integer num) {
        this.f5669g = num;
    }

    public void k(Integer num) {
        this.f5668f = num;
    }

    public void l(int i10) {
        this.f5664b = i10;
    }

    public void m(Object obj) {
        this.f5670h = obj;
    }
}

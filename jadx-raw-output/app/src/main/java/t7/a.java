package t7;

import android.content.ContentValues;
import java.util.List;
import w7.f;

/* JADX INFO: compiled from: ConnectionModel.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f72281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f72282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f72283e;

    public String toString() {
        return f.o("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.f72279a), Integer.valueOf(this.f72280b), Long.valueOf(this.f72281c), Long.valueOf(this.f72283e), Long.valueOf(this.f72282d));
    }

    public long a() {
        return this.f72282d;
    }

    public long b() {
        return this.f72283e;
    }

    public int c() {
        return this.f72279a;
    }

    public int d() {
        return this.f72280b;
    }

    public long e() {
        return this.f72281c;
    }

    public void g(long j10) {
        this.f72282d = j10;
    }

    public void h(long j10) {
        this.f72283e = j10;
    }

    public void i(int i10) {
        this.f72279a = i10;
    }

    public void j(int i10) {
        this.f72280b = i10;
    }

    public void k(long j10) {
        this.f72281c = j10;
    }

    public ContentValues l() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(this.f72279a));
        contentValues.put("connectionIndex", Integer.valueOf(this.f72280b));
        contentValues.put("startOffset", Long.valueOf(this.f72281c));
        contentValues.put("currentOffset", Long.valueOf(this.f72282d));
        contentValues.put("endOffset", Long.valueOf(this.f72283e));
        return contentValues;
    }

    public static long f(List<a> list) {
        long jA = 0;
        for (a aVar : list) {
            jA += aVar.a() - aVar.e();
        }
        return jA;
    }
}

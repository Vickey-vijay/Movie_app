package f5;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.TreeSet;

/* JADX INFO: compiled from: CachedContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet<m> f52852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f52853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52854e;

    public g(int i10, String str) {
        this(i10, str, k.f52875c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f52850a == gVar.f52850a && this.f52851b.equals(gVar.f52851b) && this.f52852c.equals(gVar.f52852c) && this.f52853d.equals(gVar.f52853d);
    }

    public g(int i10, String str, k kVar) {
        this.f52850a = i10;
        this.f52851b = str;
        this.f52853d = kVar;
        this.f52852c = new TreeSet<>();
    }

    public void a(m mVar) {
        this.f52852c.add(mVar);
    }

    public boolean b(j jVar) {
        k kVar = this.f52853d;
        k kVarE = kVar.e(jVar);
        this.f52853d = kVarE;
        return !kVarE.equals(kVar);
    }

    public k c() {
        return this.f52853d;
    }

    public m d(long j10) {
        m mVarH = m.h(this.f52851b, j10);
        m mVarFloor = this.f52852c.floor(mVarH);
        if (mVarFloor != null && mVarFloor.f52845c + mVarFloor.f52846d > j10) {
            return mVarFloor;
        }
        m mVarCeiling = this.f52852c.ceiling(mVarH);
        return mVarCeiling == null ? m.i(this.f52851b, j10) : m.g(this.f52851b, j10, mVarCeiling.f52845c - j10);
    }

    public TreeSet<m> e() {
        return this.f52852c;
    }

    public boolean f() {
        return this.f52852c.isEmpty();
    }

    public boolean g() {
        return this.f52854e;
    }

    public boolean h(e eVar) {
        if (!this.f52852c.remove(eVar)) {
            return false;
        }
        eVar.f52848f.delete();
        return true;
    }

    public int hashCode() {
        return (((this.f52850a * 31) + this.f52851b.hashCode()) * 31) + this.f52853d.hashCode();
    }

    public m i(m mVar, long j10, boolean z10) {
        g5.a.f(this.f52852c.remove(mVar));
        File file = mVar.f52848f;
        if (z10) {
            File fileJ = m.j(file.getParentFile(), this.f52850a, mVar.f52845c, j10);
            if (file.renameTo(fileJ)) {
                file = fileJ;
            } else {
                g5.m.h("CachedContent", "Failed to rename " + file + " to " + fileJ);
            }
        }
        m mVarD = mVar.d(file, j10);
        this.f52852c.add(mVarD);
        return mVarD;
    }

    public void j(boolean z10) {
        this.f52854e = z10;
    }
}

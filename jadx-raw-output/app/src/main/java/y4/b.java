package y4;

import g5.k0;
import java.util.Collections;
import java.util.List;
import t4.e;

/* JADX INFO: compiled from: SubripSubtitle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.b[] f75270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f75271c;

    @Override // t4.e
    public long getEventTime(int i10) {
        g5.a.a(i10 >= 0);
        g5.a.a(i10 < this.f75271c.length);
        return this.f75271c[i10];
    }

    @Override // t4.e
    public List<t4.b> getCues(long j10) {
        t4.b bVar;
        int iH = k0.h(this.f75271c, j10, true, false);
        return (iH == -1 || (bVar = this.f75270b[iH]) == t4.b.f72219p) ? Collections.emptyList() : Collections.singletonList(bVar);
    }

    @Override // t4.e
    public int getEventTimeCount() {
        return this.f75271c.length;
    }

    @Override // t4.e
    public int getNextEventTimeIndex(long j10) {
        int iE = k0.e(this.f75271c, j10, false, false);
        if (iE < this.f75271c.length) {
            return iE;
        }
        return -1;
    }

    public b(t4.b[] bVarArr, long[] jArr) {
        this.f75270b = bVarArr;
        this.f75271c = jArr;
    }
}

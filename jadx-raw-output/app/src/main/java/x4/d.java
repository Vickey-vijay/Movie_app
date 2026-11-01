package x4;

import g5.k0;
import java.util.Collections;
import java.util.List;
import t4.e;

/* JADX INFO: compiled from: SsaSubtitle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<List<t4.b>> f74360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Long> f74361c;

    @Override // t4.e
    public long getEventTime(int i10) {
        g5.a.a(i10 >= 0);
        g5.a.a(i10 < this.f74361c.size());
        return this.f74361c.get(i10).longValue();
    }

    @Override // t4.e
    public List<t4.b> getCues(long j10) {
        int iF = k0.f(this.f74361c, Long.valueOf(j10), true, false);
        return iF == -1 ? Collections.emptyList() : this.f74360b.get(iF);
    }

    @Override // t4.e
    public int getEventTimeCount() {
        return this.f74361c.size();
    }

    @Override // t4.e
    public int getNextEventTimeIndex(long j10) {
        int iD = k0.d(this.f74361c, Long.valueOf(j10), false, false);
        if (iD < this.f74361c.size()) {
            return iD;
        }
        return -1;
    }

    public d(List<List<t4.b>> list, List<Long> list2) {
        this.f74360b = list;
        this.f74361c = list2;
    }
}

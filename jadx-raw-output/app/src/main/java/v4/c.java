package v4;

import java.util.List;
import t4.e;

/* JADX INFO: compiled from: DvbSubtitle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<t4.b> f73106b;

    @Override // t4.e
    public long getEventTime(int i10) {
        return 0L;
    }

    @Override // t4.e
    public int getEventTimeCount() {
        return 1;
    }

    @Override // t4.e
    public int getNextEventTimeIndex(long j10) {
        return -1;
    }

    @Override // t4.e
    public List<t4.b> getCues(long j10) {
        return this.f73106b;
    }

    public c(List<t4.b> list) {
        this.f73106b = list;
    }
}

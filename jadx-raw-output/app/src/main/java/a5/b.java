package a5;

import java.util.Collections;
import java.util.List;
import t4.e;

/* JADX INFO: compiled from: Tx3gSubtitle.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3488c = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<t4.b> f3489b;

    public b(t4.b bVar) {
        this.f3489b = Collections.singletonList(bVar);
    }

    @Override // t4.e
    public int getEventTimeCount() {
        return 1;
    }

    @Override // t4.e
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // t4.e
    public List<t4.b> getCues(long j10) {
        return j10 >= 0 ? this.f3489b : Collections.emptyList();
    }

    @Override // t4.e
    public long getEventTime(int i10) {
        g5.a.a(i10 == 0);
        return 0L;
    }

    public b() {
        this.f3489b = Collections.emptyList();
    }
}

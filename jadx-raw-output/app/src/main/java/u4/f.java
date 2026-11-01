package u4;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CeaSubtitle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements t4.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<t4.b> f72705b;

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
        return j10 >= 0 ? this.f72705b : Collections.emptyList();
    }

    @Override // t4.e
    public long getEventTime(int i10) {
        g5.a.a(i10 == 0);
        return 0L;
    }

    public f(List<t4.b> list) {
        this.f72705b = list;
    }
}

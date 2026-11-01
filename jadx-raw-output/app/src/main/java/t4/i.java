package t4;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends o3.f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public e f72238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f72239c;

    @Override // o3.f
    public abstract void release();

    public void a(long j10, e eVar, long j11) {
        this.timeUs = j10;
        this.f72238b = eVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f72239c = j10;
    }

    @Override // t4.e
    public List<b> getCues(long j10) {
        return ((e) g5.a.e(this.f72238b)).getCues(j10 - this.f72239c);
    }

    @Override // t4.e
    public long getEventTime(int i10) {
        return ((e) g5.a.e(this.f72238b)).getEventTime(i10) + this.f72239c;
    }

    @Override // t4.e
    public int getEventTimeCount() {
        return ((e) g5.a.e(this.f72238b)).getEventTimeCount();
    }

    @Override // t4.e
    public int getNextEventTimeIndex(long j10) {
        return ((e) g5.a.e(this.f72238b)).getNextEventTimeIndex(j10 - this.f72239c);
    }

    @Override // o3.a
    public void clear() {
        super.clear();
        this.f72238b = null;
    }
}

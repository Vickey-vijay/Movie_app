package c5;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import g5.k0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import m4.l;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements com.google.android.exoplayer2.trackselection.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackGroup f5637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f5639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format[] f5640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f5641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5642f;

    /* JADX INFO: compiled from: BaseTrackSelection.java */
    public static final class b implements Comparator<Format> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Format format, Format format2) {
            return format2.f18966f - format.f18966f;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int b(Format format) {
        for (int i10 = 0; i10 < this.f5638b; i10++) {
            if (this.f5640d[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5637a == aVar.f5637a && Arrays.equals(this.f5639c, aVar.f5639c);
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f5638b; i11++) {
            if (this.f5639c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void onPlaybackSpeed(float f10) {
    }

    public final boolean c(int i10, long j10) {
        return this.f5641e[i10] > j10;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final Format getFormat(int i10) {
        return this.f5640d[i10];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int getIndexInTrackGroup(int i10) {
        return this.f5639c[i10];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final Format getSelectedFormat() {
        return this.f5640d[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int getSelectedIndexInTrackGroup() {
        return this.f5639c[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final TrackGroup getTrackGroup() {
        return this.f5637a;
    }

    public int hashCode() {
        if (this.f5642f == 0) {
            this.f5642f = (System.identityHashCode(this.f5637a) * 31) + Arrays.hashCode(this.f5639c);
        }
        return this.f5642f;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int length() {
        return this.f5639c.length;
    }

    public a(TrackGroup trackGroup, int... iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.f(z10);
        this.f5637a = (TrackGroup) g5.a.e(trackGroup);
        int length = iArr.length;
        this.f5638b = length;
        this.f5640d = new Format[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f5640d[i11] = trackGroup.a(iArr[i11]);
        }
        Arrays.sort(this.f5640d, new b());
        this.f5639c = new int[this.f5638b];
        while (true) {
            int i12 = this.f5638b;
            if (i10 < i12) {
                this.f5639c[i10] = trackGroup.b(this.f5640d[i10]);
                i10++;
            } else {
                this.f5641e = new long[i12];
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final boolean blacklist(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zC = c(i10, jElapsedRealtime);
        for (int i11 = 0; i11 < this.f5638b && !zC; i11++) {
            if (i11 != i10 && !c(i11, jElapsedRealtime)) {
                zC = true;
            } else {
                zC = false;
            }
        }
        if (!zC) {
            return false;
        }
        long[] jArr = this.f5641e;
        jArr[i10] = Math.max(jArr[i10], k0.b(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int evaluateQueueSize(long j10, List<? extends l> list) {
        return list.size();
    }
}

package c5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
import m4.l;
import m4.m;

/* JADX INFO: compiled from: FixedTrackSelection.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Object f5644h;

    public b(TrackGroup trackGroup, int i10, int i11, @Nullable Object obj) {
        super(trackGroup, i10);
        this.f5643g = i11;
        this.f5644h = obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void a(long j10, long j11, long j12, List<? extends l> list, m[] mVarArr) {
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int getSelectedIndex() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    @Nullable
    public Object getSelectionData() {
        return this.f5644h;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int getSelectionReason() {
        return this.f5643g;
    }
}

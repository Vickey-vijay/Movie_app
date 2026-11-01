package c5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import k3.q0;
import k3.v0;
import k4.r;

/* JADX INFO: compiled from: TrackSelector.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f5648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public e5.c f5649b;

    /* JADX INFO: compiled from: TrackSelector.java */
    public interface a {
        void onTrackSelectionsInvalidated();
    }

    public abstract void d(Object obj);

    public abstract e e(q0[] q0VarArr, TrackGroupArray trackGroupArray, r.a aVar, v0 v0Var) throws ExoPlaybackException;

    public final e5.c a() {
        return (e5.c) g5.a.e(this.f5649b);
    }

    public final void b(a aVar, e5.c cVar) {
        this.f5648a = aVar;
        this.f5649b = cVar;
    }

    public final void c() {
        a aVar = this.f5648a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }
}

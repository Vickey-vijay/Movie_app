package c5;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackSelectionArray.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.c[] f5646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5647c;

    @Nullable
    public com.google.android.exoplayer2.trackselection.c a(int i10) {
        return this.f5646b[i10];
    }

    public com.google.android.exoplayer2.trackselection.c[] b() {
        return (com.google.android.exoplayer2.trackselection.c[]) this.f5646b.clone();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5646b, ((c) obj).f5646b);
    }

    public int hashCode() {
        if (this.f5647c == 0) {
            this.f5647c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f5646b);
        }
        return this.f5647c;
    }

    public c(com.google.android.exoplayer2.trackselection.c... cVarArr) {
        this.f5646b = cVarArr;
        this.f5645a = cVarArr.length;
    }
}

package m3;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;

/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f63964f = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AudioAttributes f63969e;

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f63970a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f63971b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f63972c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f63973d = 1;

        public c a() {
            return new c(this.f63970a, this.f63971b, this.f63972c, this.f63973d);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f63965a == cVar.f63965a && this.f63966b == cVar.f63966b && this.f63967c == cVar.f63967c && this.f63968d == cVar.f63968d;
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f63965a = i10;
        this.f63966b = i11;
        this.f63967c = i12;
        this.f63968d = i13;
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.f63969e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f63965a).setFlags(this.f63966b).setUsage(this.f63967c);
            if (k0.f53108a >= 29) {
                usage.setAllowedCapturePolicy(this.f63968d);
            }
            this.f63969e = usage.build();
        }
        return this.f63969e;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f63965a) * 31) + this.f63966b) * 31) + this.f63967c) * 31) + this.f63968d;
    }
}

package sg.bigo.ads.controller.c;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements sg.bigo.ads.api.core.n.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f70724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f70725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f70726c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f70727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f70728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f70729f;

    public s(@NonNull JSONObject jSONObject) {
        this.f70724a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.f70725b = jSONObject.optInt("play_ad_threshold", 50);
        this.f70727d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.f70728e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final long a() {
        return this.f70729f;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(long j10) {
        this.f70729f = j10;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(boolean z10) {
        this.f70726c = z10;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean b() {
        return this.f70724a;
    }

    @Override // sg.bigo.ads.api.core.n.d
    @IntRange(from = 1, to = 100)
    public final int c() {
        if (!this.f70724a) {
            return 100;
        }
        long j10 = this.f70729f;
        if (j10 <= this.f70727d) {
            return 100;
        }
        long j11 = this.f70728e;
        if (j10 <= j11) {
            return this.f70725b;
        }
        return j10 < (3 * j11) / 2 ? (int) ((((long) this.f70725b) * j11) / j10) : (this.f70725b * 2) / 3;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean d() {
        return this.f70726c;
    }
}

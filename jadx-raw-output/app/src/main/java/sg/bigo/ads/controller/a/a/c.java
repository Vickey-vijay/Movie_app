package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f70366d = r.f70032c.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f70367e = r.f70031b.a(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f70368f = r.f70030a.a(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f70369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f70370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f70371i;

    public c(@NonNull String str) {
        super(str, "");
        this.f70371i = f70366d;
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        super.a(parcel);
        parcel.writeLong(this.f70371i);
        parcel.writeLong(this.f70369g);
        parcel.writeLong(this.f70370h);
    }

    @Override // sg.bigo.ads.controller.a.a.b
    public final void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        super.a(jSONObject, z10, str, i10);
        this.f70371i = Math.max(jSONObject.optLong("interval", f70366d / 1000) * 1000, f70368f);
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        super.b(parcel);
        this.f70371i = n.a(parcel, f70366d);
        this.f70369g = n.a(parcel, 0L);
        this.f70370h = n.a(parcel, 0L);
    }

    public final boolean b() {
        long j10 = this.f70369g;
        long j11 = this.f70370h;
        if (j10 == j11) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j10 > j11) {
            return Math.abs(jCurrentTimeMillis - this.f70369g) > f70367e;
        }
        return Math.abs(jCurrentTimeMillis - this.f70370h) > this.f70371i;
    }
}

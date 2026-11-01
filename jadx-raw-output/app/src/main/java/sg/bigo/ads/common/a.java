package sg.bigo.ads.common;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69454a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f69457d;

    private a() {
        this.f69455b = "";
        this.f69456c = true;
    }

    public a(@NonNull Parcel parcel) {
        b(parcel);
    }

    public a(@NonNull String str, boolean z10) {
        this.f69455b = str;
        this.f69456c = z10;
        this.f69457d = r.b();
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f69455b);
        parcel.writeInt(this.f69456c ? 1 : 0);
        parcel.writeLong(this.f69457d);
    }

    public final boolean a() {
        return Math.abs(r.b() - this.f69457d) > r.f70033d.a(1);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f69455b = parcel.readString();
        this.f69456c = parcel.readInt() != 0;
        this.f69457d = parcel.readLong();
    }

    public final String toString() {
        return "{advertisingId='" + this.f69455b + "', isLimitAdTrackingEnabled=" + this.f69456c + ", lastUpdateTime=" + this.f69457d + '}';
    }
}

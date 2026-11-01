package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f70402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f70403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f70404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f70405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f70406e;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f70402a);
            parcel.writeLong(this.f70403b);
            parcel.writeLong(this.f70404c);
            parcel.writeLong(this.f70405d);
            parcel.writeLong(this.f70406e);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f70402a = n.a(parcel, 0L);
            this.f70403b = n.a(parcel, 0L);
            this.f70404c = n.a(parcel, 0L);
            this.f70405d = n.a(parcel, 0L);
            this.f70406e = n.a(parcel, 0L);
        }
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}

package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements k, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70575a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70576b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70577c = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        n.a(parcel, this.f70575a);
        n.a(parcel, this.f70576b);
        parcel.writeInt(this.f70577c);
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean a() {
        return this.f70575a;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f70575a = n.b(parcel, true);
        this.f70575a = n.b(parcel, false);
        this.f70577c = n.a(parcel, 0);
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean b() {
        return this.f70576b;
    }

    @Override // sg.bigo.ads.api.a.k
    public final int c() {
        return this.f70577c;
    }

    @NonNull
    public final String toString() {
        return "{isNativeVideoClickable=" + this.f70575a + ", isNativeVideoClickable=" + this.f70575a + ", clickTriggerType=" + this.f70577c + '}';
    }
}

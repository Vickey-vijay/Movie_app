package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
final class a implements sg.bigo.ads.api.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f70508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f70511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f70512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f70513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f70514g;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f70508a);
        parcel.writeString(this.f70509b);
        parcel.writeString(this.f70510c);
        parcel.writeString(this.f70511d);
        parcel.writeString(this.f70512e);
        parcel.writeString(this.f70513f);
        parcel.writeString(this.f70514g);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f70508a = parcel.readLong();
        this.f70509b = parcel.readString();
        this.f70510c = parcel.readString();
        this.f70511d = parcel.readString();
        this.f70512e = parcel.readString();
        this.f70513f = parcel.readString();
        this.f70514g = parcel.readString();
    }

    @NonNull
    public final String toString() {
        return "{expressId=" + this.f70508a + ", name='" + this.f70509b + "', url='" + this.f70510c + "', md5='" + this.f70511d + "', style='" + this.f70512e + "', adTypes='" + this.f70513f + "', fileId='" + this.f70514g + "'}";
    }
}

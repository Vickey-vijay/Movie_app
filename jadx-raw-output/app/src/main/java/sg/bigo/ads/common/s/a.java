package sg.bigo.ads.common.s;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f69896a = r.f70032c.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f69897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f69899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f69900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f69903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f69904i;

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private a(@NonNull Context context, byte b10) {
        this.f69898c = false;
        this.f69897b = context;
        this.f69904i = 0L;
    }

    public a(@NonNull Context context, @NonNull Parcel parcel) {
        this.f69898c = false;
        this.f69897b = context;
        b(parcel);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeDouble(this.f69899d);
        parcel.writeDouble(this.f69900e);
        parcel.writeString(this.f69901f);
        parcel.writeString(this.f69902g);
        parcel.writeString(this.f69903h);
        parcel.writeLong(this.f69904i);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f69899d = parcel.readDouble();
        this.f69900e = parcel.readDouble();
        this.f69901f = parcel.readString();
        this.f69902g = parcel.readString();
        this.f69903h = parcel.readString();
        this.f69904i = parcel.readLong();
    }

    public final String toString() {
        return "{longitude=" + this.f69899d + ", latitude=" + this.f69900e + ", countryCode='" + this.f69901f + "', state='" + this.f69902g + "', city='" + this.f69903h + "', updateTime='" + this.f69904i + "'}";
    }
}

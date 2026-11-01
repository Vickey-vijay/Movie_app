package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new Parcelable.Creator<LandingPageStyleConfig>() { // from class: sg.bigo.ads.controller.landing.LandingPageStyleConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LandingPageStyleConfig createFromParcel(Parcel parcel) {
            return new LandingPageStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LandingPageStyleConfig[] newArray(int i10) {
            return new LandingPageStyleConfig[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f70935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f70936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<? extends d> f70937g;

    public LandingPageStyleConfig(Parcel parcel) {
        this.f70937g = (Class) parcel.readSerializable();
        this.f70933c = parcel.readInt();
        this.f70931a = parcel.readInt();
        this.f70932b = parcel.readInt();
        this.f70934d = parcel.readInt();
        this.f70935e = parcel.readInt();
        this.f70936f = parcel.readFloat();
    }

    public LandingPageStyleConfig(Class<? extends d> cls, int i10, int i11, int i12, int i13, int i14, float f10) {
        this.f70937g = cls;
        this.f70933c = i10;
        this.f70931a = i11;
        this.f70932b = i12;
        this.f70934d = i13;
        this.f70935e = i14;
        this.f70936f = f10;
    }

    public final boolean a() {
        return this.f70937g != null && this.f70934d > 0;
    }

    public final boolean b() {
        int i10 = this.f70931a;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f70937g);
        parcel.writeInt(this.f70933c);
        parcel.writeInt(this.f70931a);
        parcel.writeInt(this.f70932b);
        parcel.writeInt(this.f70934d);
        parcel.writeInt(this.f70935e);
        parcel.writeFloat(this.f70936f);
    }
}

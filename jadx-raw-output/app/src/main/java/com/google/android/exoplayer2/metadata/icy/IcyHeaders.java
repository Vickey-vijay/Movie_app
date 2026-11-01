package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import g5.m;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f19292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f19293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19295g;

    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, int i11) {
        g5.a.a(i11 == -1 || i11 > 0);
        this.f19290b = i10;
        this.f19291c = str;
        this.f19292d = str2;
        this.f19293e = str3;
        this.f19294f = z10;
        this.f19295g = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f19290b == icyHeaders.f19290b && k0.c(this.f19291c, icyHeaders.f19291c) && k0.c(this.f19292d, icyHeaders.f19292d) && k0.c(this.f19293e, icyHeaders.f19293e) && this.f19294f == icyHeaders.f19294f && this.f19295g == icyHeaders.f19295g;
    }

    @Nullable
    public static IcyHeaders a(Map<String, List<String>> map) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List<String> list = map.get("icy-br");
        int i12 = -1;
        boolean z11 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        m.h("IcyHeaders", "Invalid bitrate: " + str4);
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        m.h("IcyHeaders", "Invalid bitrate header: " + str4);
                    }
                    z10 = false;
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            i10 = -1;
            z10 = false;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        m.h("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        m.h("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z10) {
            return new IcyHeaders(i10, str, str2, str3, zEquals, i12);
        }
        return null;
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f19290b) * 31;
        String str = this.f19291c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19292d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19293e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f19294f ? 1 : 0)) * 31) + this.f19295g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f19292d + "\", genre=\"" + this.f19291c + "\", bitrate=" + this.f19290b + ", metadataInterval=" + this.f19295g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19290b);
        parcel.writeString(this.f19291c);
        parcel.writeString(this.f19292d);
        parcel.writeString(this.f19293e);
        k0.O0(parcel, this.f19294f);
        parcel.writeInt(this.f19295g);
    }

    public IcyHeaders(Parcel parcel) {
        this.f19290b = parcel.readInt();
        this.f19291c = parcel.readString();
        this.f19292d = parcel.readString();
        this.f19293e = parcel.readString();
        this.f19294f = k0.u0(parcel);
        this.f19295g = parcel.readInt();
    }
}

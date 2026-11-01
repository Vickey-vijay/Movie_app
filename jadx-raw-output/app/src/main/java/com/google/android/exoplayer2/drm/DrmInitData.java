package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import g5.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import k3.k;

/* JADX INFO: loaded from: classes4.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeData[] f19168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f19170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19171e;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f19173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f19174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f19175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final byte[] f19176f;

        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.f19173c = (UUID) g5.a.e(uuid);
            this.f19174d = str;
            this.f19175e = (String) g5.a.e(str2);
            this.f19176f = bArr;
        }

        public SchemeData c(@Nullable byte[] bArr) {
            return new SchemeData(this.f19173c, this.f19174d, this.f19175e, bArr);
        }

        public boolean d() {
            return this.f19176f != null;
        }

        public boolean e(UUID uuid) {
            return k.f62189a.equals(this.f19173c) || uuid.equals(this.f19173c);
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return k0.c(this.f19174d, schemeData.f19174d) && k0.c(this.f19175e, schemeData.f19175e) && k0.c(this.f19173c, schemeData.f19173c) && Arrays.equals(this.f19176f, schemeData.f19176f);
        }

        public int hashCode() {
            if (this.f19172b == 0) {
                int iHashCode = this.f19173c.hashCode() * 31;
                String str = this.f19174d;
                this.f19172b = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19175e.hashCode()) * 31) + Arrays.hashCode(this.f19176f);
            }
            return this.f19172b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f19173c.getMostSignificantBits());
            parcel.writeLong(this.f19173c.getLeastSignificantBits());
            parcel.writeString(this.f19174d);
            parcel.writeString(this.f19175e);
            parcel.writeByteArray(this.f19176f);
        }

        public boolean b(SchemeData schemeData) {
            if (d() && !schemeData.d() && e(schemeData.f19173c)) {
                return true;
            }
            return false;
        }

        public SchemeData(Parcel parcel) {
            this.f19173c = new UUID(parcel.readLong(), parcel.readLong());
            this.f19174d = parcel.readString();
            this.f19175e = (String) k0.i(parcel.readString());
            this.f19176f = parcel.createByteArray();
        }
    }

    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static boolean b(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f19173c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return k0.c(this.f19170d, drmInitData.f19170d) && Arrays.equals(this.f19168b, drmInitData.f19168b);
    }

    public DrmInitData(@Nullable String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    @Nullable
    public static DrmInitData d(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f19170d;
            for (SchemeData schemeData : drmInitData.f19168b) {
                if (schemeData.d()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f19170d;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f19168b) {
                if (schemeData2.d() && !b(arrayList, size, schemeData2.f19173c)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = k.f62189a;
        if (uuid.equals(schemeData.f19173c)) {
            return uuid.equals(schemeData2.f19173c) ? 0 : 1;
        }
        return schemeData.f19173c.compareTo(schemeData2.f19173c);
    }

    public DrmInitData c(@Nullable String str) {
        return k0.c(this.f19170d, str) ? this : new DrmInitData(str, false, this.f19168b);
    }

    public SchemeData e(int i10) {
        return this.f19168b[i10];
    }

    public DrmInitData f(DrmInitData drmInitData) {
        String str;
        String str2 = this.f19170d;
        g5.a.f(str2 == null || (str = drmInitData.f19170d) == null || TextUtils.equals(str2, str));
        String str3 = this.f19170d;
        if (str3 == null) {
            str3 = drmInitData.f19170d;
        }
        return new DrmInitData(str3, (SchemeData[]) k0.p0(this.f19168b, drmInitData.f19168b));
    }

    public int hashCode() {
        if (this.f19169c == 0) {
            String str = this.f19170d;
            this.f19169c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f19168b);
        }
        return this.f19169c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19170d);
        parcel.writeTypedArray(this.f19168b, 0);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, boolean z10, SchemeData... schemeDataArr) {
        this.f19170d = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f19168b = schemeDataArr;
        this.f19171e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f19170d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) k0.i((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f19168b = schemeDataArr;
        this.f19171e = schemeDataArr.length;
    }
}

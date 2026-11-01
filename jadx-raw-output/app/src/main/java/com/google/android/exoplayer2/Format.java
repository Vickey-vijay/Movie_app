package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;
import g5.p;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p3.i;

/* JADX INFO: loaded from: classes9.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();
    public final int A;

    @Nullable
    public final String B;
    public final int C;

    @Nullable
    public final Class<? extends i> D;
    public int E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f18962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f18963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f18967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Metadata f18968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f18969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f18970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<byte[]> f18972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final DrmInitData f18973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f18974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f18977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f18979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f18980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final byte[] f18981u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final ColorInfo f18982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f18983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f18984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f18985y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f18986z;

    public class a implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Format[] newArray(int i10) {
            return new Format[i10];
        }
    }

    public Format(@Nullable String str, @Nullable String str2, int i10, int i11, int i12, @Nullable String str3, @Nullable Metadata metadata, @Nullable String str4, @Nullable String str5, int i13, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, long j10, int i14, int i15, float f10, int i16, float f11, @Nullable byte[] bArr, int i17, @Nullable ColorInfo colorInfo, int i18, int i19, int i20, int i21, int i22, @Nullable String str6, int i23, @Nullable Class<? extends i> cls) {
        this.f18962b = str;
        this.f18963c = str2;
        this.f18964d = i10;
        this.f18965e = i11;
        this.f18966f = i12;
        this.f18967g = str3;
        this.f18968h = metadata;
        this.f18969i = str4;
        this.f18970j = str5;
        this.f18971k = i13;
        this.f18972l = list == null ? Collections.emptyList() : list;
        this.f18973m = drmInitData;
        this.f18974n = j10;
        this.f18975o = i14;
        this.f18976p = i15;
        this.f18977q = f10;
        int i24 = i16;
        this.f18978r = i24 == -1 ? 0 : i24;
        this.f18979s = f11 == -1.0f ? 1.0f : f11;
        this.f18981u = bArr;
        this.f18980t = i17;
        this.f18982v = colorInfo;
        this.f18983w = i18;
        this.f18984x = i19;
        this.f18985y = i20;
        int i25 = i21;
        this.f18986z = i25 == -1 ? 0 : i25;
        this.A = i22 != -1 ? i22 : 0;
        this.B = k0.n0(str6);
        this.C = i23;
        this.D = cls;
    }

    public static Format B(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, float f10, @Nullable List<byte[]> list, int i14, float f11, @Nullable DrmInitData drmInitData) {
        return C(str, str2, str3, i10, i11, i12, i13, f10, list, i14, f11, null, -1, null, drmInitData);
    }

    public static Format C(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, float f10, @Nullable List<byte[]> list, int i14, float f11, @Nullable byte[] bArr, int i15, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i10, str3, null, null, str2, i11, list, drmInitData, Long.MAX_VALUE, i12, i13, f10, i14, f11, bArr, i15, colorInfo, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format n(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i17, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, i17, 0, i10, str3, metadata, null, str2, i11, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, str4, -1, null);
    }

    public static Format o(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, int i14, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i15, @Nullable String str4) {
        return n(str, str2, str3, i10, i11, i12, i13, i14, -1, -1, list, drmInitData, i15, str4, null);
    }

    public static Format p(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i14, @Nullable String str4) {
        return o(str, str2, str3, i10, i11, i12, i13, -1, list, drmInitData, i14, str4);
    }

    public static Format u(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i10, int i11, int i12, @Nullable String str6) {
        return v(str, str2, str3, str4, str5, i10, i11, i12, str6, -1);
    }

    public static Format w(@Nullable String str, @Nullable String str2, int i10, @Nullable String str3) {
        return x(str, str2, i10, str3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i11 = this.E;
        if (i11 == 0 || (i10 = format.E) == 0 || i11 == i10) {
            return this.f18964d == format.f18964d && this.f18965e == format.f18965e && this.f18966f == format.f18966f && this.f18971k == format.f18971k && this.f18974n == format.f18974n && this.f18975o == format.f18975o && this.f18976p == format.f18976p && this.f18978r == format.f18978r && this.f18980t == format.f18980t && this.f18983w == format.f18983w && this.f18984x == format.f18984x && this.f18985y == format.f18985y && this.f18986z == format.f18986z && this.A == format.A && this.C == format.C && Float.compare(this.f18977q, format.f18977q) == 0 && Float.compare(this.f18979s, format.f18979s) == 0 && k0.c(this.D, format.D) && k0.c(this.f18962b, format.f18962b) && k0.c(this.f18963c, format.f18963c) && k0.c(this.f18967g, format.f18967g) && k0.c(this.f18969i, format.f18969i) && k0.c(this.f18970j, format.f18970j) && k0.c(this.B, format.B) && Arrays.equals(this.f18981u, format.f18981u) && k0.c(this.f18968h, format.f18968h) && k0.c(this.f18982v, format.f18982v) && k0.c(this.f18973m, format.f18973m) && E(format);
        }
        return false;
    }

    public static Format A(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Metadata metadata, int i10, int i11, int i12, float f10, @Nullable List<byte[]> list, int i13, int i14) {
        return new Format(str, str2, i13, i14, i10, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, i11, i12, f10, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static String F(@Nullable Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(format.f18962b);
        sb2.append(", mimeType=");
        sb2.append(format.f18970j);
        if (format.f18966f != -1) {
            sb2.append(", bitrate=");
            sb2.append(format.f18966f);
        }
        if (format.f18967g != null) {
            sb2.append(", codecs=");
            sb2.append(format.f18967g);
        }
        if (format.f18975o != -1 && format.f18976p != -1) {
            sb2.append(", res=");
            sb2.append(format.f18975o);
            sb2.append(VastAttributes.HORIZONTAL_POSITION);
            sb2.append(format.f18976p);
        }
        if (format.f18977q != -1.0f) {
            sb2.append(", fps=");
            sb2.append(format.f18977q);
        }
        if (format.f18983w != -1) {
            sb2.append(", channels=");
            sb2.append(format.f18983w);
        }
        if (format.f18984x != -1) {
            sb2.append(", sample_rate=");
            sb2.append(format.f18984x);
        }
        if (format.B != null) {
            sb2.append(", language=");
            sb2.append(format.B);
        }
        if (format.f18963c != null) {
            sb2.append(", label=");
            sb2.append(format.f18963c);
        }
        return sb2.toString();
    }

    public static Format m(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Metadata metadata, int i10, int i11, int i12, @Nullable List<byte[]> list, int i13, int i14, @Nullable String str6) {
        return new Format(str, str2, i13, i14, i10, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i11, i12, -1, -1, -1, str6, -1, null);
    }

    public static Format q(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i10, int i11, int i12, @Nullable String str6) {
        return new Format(str, str2, i11, i12, i10, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1, null);
    }

    public static Format r(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, i11, 0, i10, str3, null, null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1, null);
    }

    public static Format s(@Nullable String str, @Nullable String str2, long j10) {
        return new Format(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j10, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format t(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i10, str3, null, null, str2, -1, null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format v(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i10, int i11, int i12, @Nullable String str6, int i13) {
        return new Format(str, str2, i11, i12, i10, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i13, null);
    }

    public static Format y(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable String str4, int i12, @Nullable DrmInitData drmInitData, long j10, @Nullable List<byte[]> list) {
        return new Format(str, null, i11, 0, i10, str3, null, null, str2, -1, list, drmInitData, j10, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i12, null);
    }

    public int D() {
        int i10;
        int i11 = this.f18975o;
        if (i11 == -1 || (i10 = this.f18976p) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean E(Format format) {
        if (this.f18972l.size() != format.f18972l.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18972l.size(); i10++) {
            if (!Arrays.equals(this.f18972l.get(i10), format.f18972l.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public Format a(@Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        if (drmInitData == this.f18973m && metadata == this.f18968h) {
            return this;
        }
        return new Format(this.f18962b, this.f18963c, this.f18964d, this.f18965e, this.f18966f, this.f18967g, metadata, this.f18969i, this.f18970j, this.f18971k, this.f18972l, drmInitData, this.f18974n, this.f18975o, this.f18976p, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, this.B, this.C, this.D);
    }

    public Format b(int i10) {
        return new Format(this.f18962b, this.f18963c, this.f18964d, this.f18965e, i10, this.f18967g, this.f18968h, this.f18969i, this.f18970j, this.f18971k, this.f18972l, this.f18973m, this.f18974n, this.f18975o, this.f18976p, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, this.B, this.C, this.D);
    }

    public Format c(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Metadata metadata, int i10, int i11, int i12, int i13, int i14, @Nullable String str5) {
        Metadata metadata2 = this.f18968h;
        return new Format(str, str2, i14, this.f18965e, i10, str4, metadata2 != null ? metadata2.b(metadata) : metadata, this.f18969i, str3, this.f18971k, this.f18972l, this.f18973m, this.f18974n, i11, i12, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, i13, this.f18984x, this.f18985y, this.f18986z, this.A, str5, this.C, this.D);
    }

    public Format d(@Nullable DrmInitData drmInitData) {
        return a(drmInitData, this.f18968h);
    }

    public Format e(@Nullable Class<? extends i> cls) {
        return new Format(this.f18962b, this.f18963c, this.f18964d, this.f18965e, this.f18966f, this.f18967g, this.f18968h, this.f18969i, this.f18970j, this.f18971k, this.f18972l, this.f18973m, this.f18974n, this.f18975o, this.f18976p, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, this.B, this.C, cls);
    }

    public Format f(float f10) {
        return new Format(this.f18962b, this.f18963c, this.f18964d, this.f18965e, this.f18966f, this.f18967g, this.f18968h, this.f18969i, this.f18970j, this.f18971k, this.f18972l, this.f18973m, this.f18974n, this.f18975o, this.f18976p, f10, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, this.B, this.C, this.D);
    }

    public Format g(int i10, int i11) {
        return new Format(this.f18962b, this.f18963c, this.f18964d, this.f18965e, this.f18966f, this.f18967g, this.f18968h, this.f18969i, this.f18970j, this.f18971k, this.f18972l, this.f18973m, this.f18974n, this.f18975o, this.f18976p, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, i10, i11, this.B, this.C, this.D);
    }

    public Format h(@Nullable String str) {
        return new Format(this.f18962b, str, this.f18964d, this.f18965e, this.f18966f, this.f18967g, this.f18968h, this.f18969i, this.f18970j, this.f18971k, this.f18972l, this.f18973m, this.f18974n, this.f18975o, this.f18976p, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, this.B, this.C, this.D);
    }

    public int hashCode() {
        if (this.E == 0) {
            String str = this.f18962b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f18963c;
            int iHashCode2 = (((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f18964d) * 31) + this.f18965e) * 31) + this.f18966f) * 31;
            String str3 = this.f18967g;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.f18968h;
            int iHashCode4 = (iHashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.f18969i;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f18970j;
            int iHashCode6 = (((((((((((((((((((((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f18971k) * 31) + ((int) this.f18974n)) * 31) + this.f18975o) * 31) + this.f18976p) * 31) + Float.floatToIntBits(this.f18977q)) * 31) + this.f18978r) * 31) + Float.floatToIntBits(this.f18979s)) * 31) + this.f18980t) * 31) + this.f18983w) * 31) + this.f18984x) * 31) + this.f18985y) * 31) + this.f18986z) * 31) + this.A) * 31;
            String str6 = this.B;
            int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.C) * 31;
            Class<? extends i> cls = this.D;
            this.E = iHashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.E;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    public Format i(Format format) {
        String str;
        String str2;
        if (this == format) {
            return this;
        }
        int iH = p.h(this.f18970j);
        String str3 = format.f18962b;
        String str4 = format.f18963c;
        if (str4 == null) {
            str4 = this.f18963c;
        }
        String str5 = str4;
        String str6 = ((iH == 3 || iH == 1) && (str = format.B) != null) ? str : this.B;
        int i10 = this.f18966f;
        if (i10 == -1) {
            i10 = format.f18966f;
        }
        int i11 = i10;
        String str7 = this.f18967g;
        if (str7 == null) {
            String strD = k0.D(format.f18967g, iH);
            if (k0.F0(strD).length == 1) {
                str2 = strD;
            } else {
                str2 = str7;
            }
        } else {
            str2 = str7;
        }
        Metadata metadata = this.f18968h;
        Metadata metadataB = metadata == null ? format.f18968h : metadata.b(format.f18968h);
        float f10 = this.f18977q;
        return new Format(str3, str5, this.f18964d | format.f18964d, this.f18965e | format.f18965e, i11, str2, metadataB, this.f18969i, this.f18970j, this.f18971k, this.f18972l, DrmInitData.d(format.f18973m, this.f18973m), this.f18974n, this.f18975o, this.f18976p, (f10 == -1.0f && iH == 2) ? format.f18977q : f10, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, str6, this.C, this.D);
    }

    public Format j(int i10) {
        return new Format(this.f18962b, this.f18963c, this.f18964d, this.f18965e, this.f18966f, this.f18967g, this.f18968h, this.f18969i, this.f18970j, i10, this.f18972l, this.f18973m, this.f18974n, this.f18975o, this.f18976p, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, this.B, this.C, this.D);
    }

    public Format k(@Nullable Metadata metadata) {
        return a(this.f18973m, metadata);
    }

    public Format l(long j10) {
        return new Format(this.f18962b, this.f18963c, this.f18964d, this.f18965e, this.f18966f, this.f18967g, this.f18968h, this.f18969i, this.f18970j, this.f18971k, this.f18972l, this.f18973m, j10, this.f18975o, this.f18976p, this.f18977q, this.f18978r, this.f18979s, this.f18981u, this.f18980t, this.f18982v, this.f18983w, this.f18984x, this.f18985y, this.f18986z, this.A, this.B, this.C, this.D);
    }

    public String toString() {
        return "Format(" + this.f18962b + ", " + this.f18963c + ", " + this.f18969i + ", " + this.f18970j + ", " + this.f18967g + ", " + this.f18966f + ", " + this.B + ", [" + this.f18975o + ", " + this.f18976p + ", " + this.f18977q + "], [" + this.f18983w + ", " + this.f18984x + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18962b);
        parcel.writeString(this.f18963c);
        parcel.writeInt(this.f18964d);
        parcel.writeInt(this.f18965e);
        parcel.writeInt(this.f18966f);
        parcel.writeString(this.f18967g);
        parcel.writeParcelable(this.f18968h, 0);
        parcel.writeString(this.f18969i);
        parcel.writeString(this.f18970j);
        parcel.writeInt(this.f18971k);
        int size = this.f18972l.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f18972l.get(i11));
        }
        parcel.writeParcelable(this.f18973m, 0);
        parcel.writeLong(this.f18974n);
        parcel.writeInt(this.f18975o);
        parcel.writeInt(this.f18976p);
        parcel.writeFloat(this.f18977q);
        parcel.writeInt(this.f18978r);
        parcel.writeFloat(this.f18979s);
        k0.O0(parcel, this.f18981u != null);
        byte[] bArr = this.f18981u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f18980t);
        parcel.writeParcelable(this.f18982v, i10);
        parcel.writeInt(this.f18983w);
        parcel.writeInt(this.f18984x);
        parcel.writeInt(this.f18985y);
        parcel.writeInt(this.f18986z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
    }

    public static Format x(@Nullable String str, @Nullable String str2, int i10, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return y(str, str2, null, -1, i10, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format z(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable String str4, @Nullable DrmInitData drmInitData, long j10) {
        return y(str, str2, str3, i10, i11, str4, -1, drmInitData, j10, Collections.emptyList());
    }

    public Format(Parcel parcel) {
        this.f18962b = parcel.readString();
        this.f18963c = parcel.readString();
        this.f18964d = parcel.readInt();
        this.f18965e = parcel.readInt();
        this.f18966f = parcel.readInt();
        this.f18967g = parcel.readString();
        this.f18968h = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f18969i = parcel.readString();
        this.f18970j = parcel.readString();
        this.f18971k = parcel.readInt();
        int i10 = parcel.readInt();
        this.f18972l = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18972l.add(parcel.createByteArray());
        }
        this.f18973m = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f18974n = parcel.readLong();
        this.f18975o = parcel.readInt();
        this.f18976p = parcel.readInt();
        this.f18977q = parcel.readFloat();
        this.f18978r = parcel.readInt();
        this.f18979s = parcel.readFloat();
        this.f18981u = k0.u0(parcel) ? parcel.createByteArray() : null;
        this.f18980t = parcel.readInt();
        this.f18982v = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f18983w = parcel.readInt();
        this.f18984x = parcel.readInt();
        this.f18985y = parcel.readInt();
        this.f18986z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = null;
    }
}

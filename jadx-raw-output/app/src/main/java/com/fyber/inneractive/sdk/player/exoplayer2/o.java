package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n();
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f17502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f17506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.d f17507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f17509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f17510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f17511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f17512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f17513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f17514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.c f17515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f17517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f17518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f17519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f17521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f17522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f17523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f17524z;

    public o(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        this.f17499a = str;
        this.f17503e = str2;
        this.f17504f = str3;
        this.f17501c = str4;
        this.f17500b = i10;
        this.f17505g = i11;
        this.f17508j = i12;
        this.f17509k = i13;
        this.f17510l = f10;
        this.f17511m = i14;
        this.f17512n = f11;
        this.f17514p = bArr;
        this.f17513o = i15;
        this.f17515q = cVar;
        this.f17516r = i16;
        this.f17517s = i17;
        this.f17518t = i18;
        this.f17519u = i19;
        this.f17520v = i20;
        this.f17522x = i21;
        this.f17523y = str5;
        this.f17524z = i22;
        this.f17521w = j10;
        this.f17506h = list == null ? Collections.emptyList() : list;
        this.f17507i = dVar;
        this.f17502d = bVar;
    }

    public static o a(String str, String str2, int i10, int i11, int i12, List list, int i13, float f10, byte[] bArr, int i14, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, i10, i11, i12, -1.0f, i13, f10, bArr, i14, cVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dVar, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f17500b == oVar.f17500b && this.f17505g == oVar.f17505g && this.f17508j == oVar.f17508j && this.f17509k == oVar.f17509k && this.f17510l == oVar.f17510l && this.f17511m == oVar.f17511m && this.f17512n == oVar.f17512n && this.f17513o == oVar.f17513o && this.f17516r == oVar.f17516r && this.f17517s == oVar.f17517s && this.f17518t == oVar.f17518t && this.f17519u == oVar.f17519u && this.f17520v == oVar.f17520v && this.f17521w == oVar.f17521w && this.f17522x == oVar.f17522x && z.a(this.f17499a, oVar.f17499a) && z.a(this.f17523y, oVar.f17523y) && this.f17524z == oVar.f17524z && z.a(this.f17503e, oVar.f17503e) && z.a(this.f17504f, oVar.f17504f) && z.a(this.f17501c, oVar.f17501c) && z.a(this.f17507i, oVar.f17507i) && z.a(this.f17502d, oVar.f17502d) && z.a(this.f17515q, oVar.f17515q) && Arrays.equals(this.f17514p, oVar.f17514p) && this.f17506h.size() == oVar.f17506h.size()) {
                for (int i10 = 0; i10 < this.f17506h.size(); i10++) {
                    if (!Arrays.equals((byte[]) this.f17506h.get(i10), (byte[]) oVar.f17506h.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, String str3) {
        return a(str, str2, i10, i11, i12, i13, -1, -1, -1, list, dVar, 0, str3, null);
    }

    public final int b() {
        int i10;
        int i11 = this.f17508j;
        if (i11 == -1 || (i10 = this.f17509k) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.f17499a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f17503e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f17504f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f17501c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f17500b) * 31) + this.f17508j) * 31) + this.f17509k) * 31) + this.f17516r) * 31) + this.f17517s) * 31;
            String str5 = this.f17523y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f17524z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar = this.f17507i;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar = this.f17502d;
            this.A = iHashCode6 + (bVar != null ? Arrays.hashCode(bVar.f17463a) : 0);
        }
        return this.A;
    }

    public final String toString() {
        return "Format(" + this.f17499a + ", " + this.f17503e + ", " + this.f17504f + ", " + this.f17500b + ", " + this.f17523y + ", [" + this.f17508j + ", " + this.f17509k + ", " + this.f17510l + "], [" + this.f17516r + ", " + this.f17517s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17499a);
        parcel.writeString(this.f17503e);
        parcel.writeString(this.f17504f);
        parcel.writeString(this.f17501c);
        parcel.writeInt(this.f17500b);
        parcel.writeInt(this.f17505g);
        parcel.writeInt(this.f17508j);
        parcel.writeInt(this.f17509k);
        parcel.writeFloat(this.f17510l);
        parcel.writeInt(this.f17511m);
        parcel.writeFloat(this.f17512n);
        parcel.writeInt(this.f17514p != null ? 1 : 0);
        byte[] bArr = this.f17514p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f17513o);
        parcel.writeParcelable(this.f17515q, i10);
        parcel.writeInt(this.f17516r);
        parcel.writeInt(this.f17517s);
        parcel.writeInt(this.f17518t);
        parcel.writeInt(this.f17519u);
        parcel.writeInt(this.f17520v);
        parcel.writeInt(this.f17522x);
        parcel.writeString(this.f17523y);
        parcel.writeInt(this.f17524z);
        parcel.writeLong(this.f17521w);
        int size = this.f17506h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) this.f17506h.get(i11));
        }
        parcel.writeParcelable(this.f17507i, 0);
        parcel.writeParcelable(this.f17502d, 0);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, int i17, String str3, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        return new o(str, null, str2, null, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str3, -1, Long.MAX_VALUE, list, dVar, bVar);
    }

    public static o a(String str, String str2, int i10, String str3, int i11, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, long j10, List list) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, str3, i11, j10, list, dVar, null);
    }

    public static o a(String str, String str2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dVar, null);
    }

    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f17504f);
        String str = this.f17523y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.f17505g);
        a(mediaFormat, "width", this.f17508j);
        a(mediaFormat, "height", this.f17509k);
        float f10 = this.f17510l;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        a(mediaFormat, "rotation-degrees", this.f17511m);
        a(mediaFormat, "channel-count", this.f17516r);
        a(mediaFormat, "sample-rate", this.f17517s);
        a(mediaFormat, "encoder-delay", this.f17519u);
        a(mediaFormat, "encoder-padding", this.f17520v);
        for (int i10 = 0; i10 < this.f17506h.size(); i10++) {
            mediaFormat.setByteBuffer(m.a("csd-", i10), ByteBuffer.wrap((byte[]) this.f17506h.get(i10)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = this.f17515q;
        if (cVar != null) {
            a(mediaFormat, "color-transfer", cVar.f17910c);
            a(mediaFormat, "color-standard", cVar.f17908a);
            a(mediaFormat, "color-range", cVar.f17909b);
            byte[] bArr = cVar.f17911d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public o(Parcel parcel) {
        this.f17499a = parcel.readString();
        this.f17503e = parcel.readString();
        this.f17504f = parcel.readString();
        this.f17501c = parcel.readString();
        this.f17500b = parcel.readInt();
        this.f17505g = parcel.readInt();
        this.f17508j = parcel.readInt();
        this.f17509k = parcel.readInt();
        this.f17510l = parcel.readFloat();
        this.f17511m = parcel.readInt();
        this.f17512n = parcel.readFloat();
        this.f17514p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f17513o = parcel.readInt();
        this.f17515q = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.c.class.getClassLoader());
        this.f17516r = parcel.readInt();
        this.f17517s = parcel.readInt();
        this.f17518t = parcel.readInt();
        this.f17519u = parcel.readInt();
        this.f17520v = parcel.readInt();
        this.f17522x = parcel.readInt();
        this.f17523y = parcel.readString();
        this.f17524z = parcel.readInt();
        this.f17521w = parcel.readLong();
        int i10 = parcel.readInt();
        this.f17506h = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17506h.add(parcel.createByteArray());
        }
        this.f17507i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class.getClassLoader());
        this.f17502d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class.getClassLoader());
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}

package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import w7.f;

/* JADX INFO: loaded from: classes6.dex */
public class FileDownloadModel implements Parcelable {
    public static final Parcelable.Creator<FileDownloadModel> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f31903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f31904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f31905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f31906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f31907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f31909m;

    public class a implements Parcelable.Creator<FileDownloadModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel createFromParcel(Parcel parcel) {
            return new FileDownloadModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel[] newArray(int i10) {
            return new FileDownloadModel[i10];
        }
    }

    public FileDownloadModel() {
        this.f31904h = new AtomicLong();
        this.f31903g = new AtomicInteger();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void s() {
        this.f31908l = 1;
    }

    public void A(byte b10) {
        this.f31903g.set(b10);
    }

    public void C(String str) {
        this.f31899c = str;
    }

    public ContentValues D() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(g()));
        contentValues.put("url", n());
        contentValues.put("path", h());
        contentValues.put("status", Byte.valueOf(j()));
        contentValues.put("sofar", Long.valueOf(i()));
        contentValues.put(C3426d4.i.f28550l, Long.valueOf(m()));
        contentValues.put("errMsg", e());
        contentValues.put(DownloadModel.ETAG, d());
        contentValues.put("connectionCount", Integer.valueOf(c()));
        contentValues.put("pathAsDirectory", Boolean.valueOf(r()));
        if (r() && f() != null) {
            contentValues.put("filename", f());
        }
        return contentValues;
    }

    public int c() {
        return this.f31908l;
    }

    public String d() {
        return this.f31907k;
    }

    public String e() {
        return this.f31906j;
    }

    public String f() {
        return this.f31902f;
    }

    public int g() {
        return this.f31898b;
    }

    public String h() {
        return this.f31900d;
    }

    public long i() {
        return this.f31904h.get();
    }

    public byte j() {
        return (byte) this.f31903g.get();
    }

    public long m() {
        return this.f31905i;
    }

    public String n() {
        return this.f31899c;
    }

    public void o(long j10) {
        this.f31904h.addAndGet(j10);
    }

    public boolean p() {
        return this.f31905i == -1;
    }

    public boolean q() {
        return this.f31909m;
    }

    public boolean r() {
        return this.f31901e;
    }

    public void t(int i10) {
        this.f31908l = i10;
    }

    public String toString() {
        return f.o("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.f31898b), this.f31899c, this.f31900d, Integer.valueOf(this.f31903g.get()), this.f31904h, Long.valueOf(this.f31905i), this.f31907k, super.toString());
    }

    public void u(String str) {
        this.f31907k = str;
    }

    public void v(String str) {
        this.f31906j = str;
    }

    public void w(String str) {
        this.f31902f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f31898b);
        parcel.writeString(this.f31899c);
        parcel.writeString(this.f31900d);
        parcel.writeByte(this.f31901e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f31902f);
        parcel.writeByte((byte) this.f31903g.get());
        parcel.writeLong(this.f31904h.get());
        parcel.writeLong(this.f31905i);
        parcel.writeString(this.f31906j);
        parcel.writeString(this.f31907k);
        parcel.writeInt(this.f31908l);
        parcel.writeByte(this.f31909m ? (byte) 1 : (byte) 0);
    }

    public void x(int i10) {
        this.f31898b = i10;
    }

    public void y(String str, boolean z10) {
        this.f31900d = str;
        this.f31901e = z10;
    }

    public void z(long j10) {
        this.f31904h.set(j10);
    }

    public void B(long j10) {
        boolean z10;
        if (j10 > 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31909m = z10;
        this.f31905i = j10;
    }

    public String k() {
        return f.B(h(), r(), f());
    }

    public String l() {
        if (k() == null) {
            return null;
        }
        return f.C(k());
    }

    public FileDownloadModel(Parcel parcel) {
        this.f31898b = parcel.readInt();
        this.f31899c = parcel.readString();
        this.f31900d = parcel.readString();
        this.f31901e = parcel.readByte() != 0;
        this.f31902f = parcel.readString();
        this.f31903g = new AtomicInteger(parcel.readByte());
        this.f31904h = new AtomicLong(parcel.readLong());
        this.f31905i = parcel.readLong();
        this.f31906j = parcel.readString();
        this.f31907k = parcel.readString();
        this.f31908l = parcel.readInt();
        this.f31909m = parcel.readByte() != 0;
    }
}

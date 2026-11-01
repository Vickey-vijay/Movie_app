package com.android.cast.dlna.dmr;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;

/* JADX INFO: compiled from: RenderControl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CastAction implements Parcelable {
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6207f;

    /* JADX INFO: compiled from: RenderControl.kt */
    public static final class a implements Parcelable.Creator<CastAction> {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CastAction createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new CastAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CastAction[] newArray(int i10) {
            return new CastAction[i10];
        }
    }

    public CastAction() {
        this(null, null, null, null, null, 31, null);
    }

    public CastAction(String str, String str2, String str3, String str4, String str5) {
        this.f6203b = str;
        this.f6204c = str2;
        this.f6205d = str3;
        this.f6206e = str4;
        this.f6207f = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String c() {
        return this.f6207f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "parcel");
        parcel.writeString(this.f6203b);
        parcel.writeString(this.f6204c);
        parcel.writeString(this.f6205d);
        parcel.writeString(this.f6206e);
    }

    public /* synthetic */ CastAction(String str, String str2, String str3, String str4, String str5, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastAction(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, 16, null);
        p.j(parcel, "parcel");
    }
}

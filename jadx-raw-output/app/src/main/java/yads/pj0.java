package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class pj0 implements Parcelable {
    public static final Parcelable.Creator<pj0> CREATOR = new oj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f81423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f81424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f81425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f81426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f81428h;

    public pj0(Parcel parcel) {
        this.f81422b = (String) ib3.a((Object) parcel.readString());
        this.f81423c = Uri.parse((String) ib3.a((Object) parcel.readString()));
        this.f81424d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((v33) parcel.readParcelable(v33.class.getClassLoader()));
        }
        this.f81425e = Collections.unmodifiableList(arrayList);
        this.f81426f = parcel.createByteArray();
        this.f81427g = parcel.readString();
        this.f81428h = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj0)) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        return this.f81422b.equals(pj0Var.f81422b) && this.f81423c.equals(pj0Var.f81423c) && ib3.a(this.f81424d, pj0Var.f81424d) && this.f81425e.equals(pj0Var.f81425e) && Arrays.equals(this.f81426f, pj0Var.f81426f) && ib3.a(this.f81427g, pj0Var.f81427g) && Arrays.equals(this.f81428h, pj0Var.f81428h);
    }

    public final int hashCode() {
        int iHashCode = (this.f81423c.hashCode() + (this.f81422b.hashCode() * 961)) * 31;
        String str = this.f81424d;
        int iHashCode2 = (Arrays.hashCode(this.f81426f) + ((this.f81425e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f81427g;
        return Arrays.hashCode(this.f81428h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f81424d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f81422b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f81422b);
        parcel.writeString(this.f81423c.toString());
        parcel.writeString(this.f81424d);
        parcel.writeInt(this.f81425e.size());
        for (int i11 = 0; i11 < this.f81425e.size(); i11++) {
            parcel.writeParcelable((Parcelable) this.f81425e.get(i11), 0);
        }
        parcel.writeByteArray(this.f81426f);
        parcel.writeString(this.f81427g);
        parcel.writeByteArray(this.f81428h);
    }

    public pj0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iA = ib3.a(uri, str2);
        if (iA == 0 || iA == 2 || iA == 1) {
            ni.a("customCacheKey must be null for type: " + iA, str3 == null);
        }
        this.f81422b = str;
        this.f81423c = uri;
        this.f81424d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f81425e = Collections.unmodifiableList(arrayList);
        this.f81426f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f81427g = str3;
        this.f81428h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : ib3.f78561f;
    }
}

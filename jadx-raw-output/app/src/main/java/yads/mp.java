package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class mp extends v21 {
    public static final Parcelable.Creator<mp> CREATOR = new lp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f80312c;

    public mp(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f80312c = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mp.class != obj.getClass()) {
            return false;
        }
        mp mpVar = (mp) obj;
        return this.f83729b.equals(mpVar.f83729b) && Arrays.equals(this.f80312c, mpVar.f80312c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f80312c) + k4.a(this.f83729b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f83729b);
        parcel.writeByteArray(this.f80312c);
    }

    public mp(String str, byte[] bArr) {
        super(str);
        this.f80312c = bArr;
    }
}

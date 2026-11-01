package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;

/* JADX INFO: compiled from: ActivityResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    private final Intent data;
    private final int resultCode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: androidx.activity.result.ActivityResult$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new ActivityResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    };

    /* JADX INFO: compiled from: ActivityResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        public final String resultCodeToString(int i10) {
            if (i10 != -1) {
                return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }
    }

    public ActivityResult(int i10, Intent intent) {
        this.resultCode = i10;
        this.data = intent;
    }

    public static final String resultCodeToString(int i10) {
        return Companion.resultCodeToString(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getData() {
        return this.data;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + Companion.resultCodeToString(this.resultCode) + ", data=" + this.data + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeInt(this.resultCode);
        parcel.writeInt(this.data == null ? 0 : 1);
        Intent intent = this.data;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        p.j(parcel, "parcel");
    }
}

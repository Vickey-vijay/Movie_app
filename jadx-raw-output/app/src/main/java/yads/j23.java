package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j23 implements ss1 {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}

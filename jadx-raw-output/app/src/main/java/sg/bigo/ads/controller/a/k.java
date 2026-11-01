package sg.bigo.ads.controller.a;

import android.os.Parcel;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes2.dex */
public class k implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f70507c;

    public k() {
    }

    public k(String str, String str2, boolean z10) {
        this.f70507c = str;
        this.f70505a = str2;
        this.f70506b = z10;
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f70507c);
        parcel.writeString(this.f70505a);
        n.a(parcel, this.f70506b);
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        this.f70507c = n.a(parcel, "");
        this.f70505a = n.a(parcel, "");
        this.f70506b = n.b(parcel, false);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}

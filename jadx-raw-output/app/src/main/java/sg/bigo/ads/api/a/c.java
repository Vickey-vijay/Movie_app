package sg.bigo.ads.api.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f69305a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sg.bigo.ads.common.f.a<c> f69306b = new sg.bigo.ads.common.f.a<c>() { // from class: sg.bigo.ads.api.a.c.1
        @Override // sg.bigo.ads.common.f.a
        public final /* synthetic */ sg.bigo.ads.common.f a() {
            return new c((byte) 0);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f69307c;

    private c() {
    }

    public /* synthetic */ c(byte b10) {
        this();
    }

    public c(String str) {
        this.f69307c = str;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f69307c);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f69307c = parcel.readString();
    }

    public final String toString() {
        return q.a(this.f69307c);
    }
}

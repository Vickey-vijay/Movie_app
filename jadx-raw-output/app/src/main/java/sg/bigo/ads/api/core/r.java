package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements sg.bigo.ads.api.a.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f69423a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f69424b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f69425c = 21600000;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f69423a + StringUtils.COMMA + this.f69424b + StringUtils.COMMA + this.f69425c);
    }

    @Override // sg.bigo.ads.api.a.n
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f69423a = jSONObject.optInt("duration_on", 0);
            this.f69424b = jSONObject.optLong("duration_valid_interval", 5000L);
            this.f69425c = jSONObject.optLong("suspend_limit", 21600000L);
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final boolean a() {
        return this.f69423a == 1;
    }

    @Override // sg.bigo.ads.api.a.n
    public final long b() {
        return this.f69424b;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split(StringUtils.COMMA);
            if (strArrSplit.length >= 3) {
                this.f69423a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 0);
                this.f69424b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 5000L);
                this.f69425c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], 21600000L);
            }
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final long c() {
        return this.f69425c;
    }
}

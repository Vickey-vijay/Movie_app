package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements sg.bigo.ads.api.a.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f69405a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69406b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69407c = 5;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f69405a + StringUtils.COMMA + this.f69406b + StringUtils.COMMA + this.f69407c);
    }

    @Override // sg.bigo.ads.api.a.g
    public final void a(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f69405a = jSONObject.optInt("id_show_loading", 2);
            this.f69406b = jSONObject.optInt("loading_timeout", 3);
            this.f69407c = jSONObject.optInt("material_show_close_button", 5);
        }
    }

    @Override // sg.bigo.ads.api.a.g
    public final boolean a() {
        return this.f69405a == 2;
    }

    @Override // sg.bigo.ads.api.a.g
    public final int b() {
        return this.f69406b;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        String[] strArrSplit;
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string) || (strArrSplit = string.split(StringUtils.COMMA)) == null || strArrSplit.length != 3) {
                return;
            }
            this.f69405a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 2);
            this.f69406b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 3);
            this.f69407c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], 5);
        }
    }

    @Override // sg.bigo.ads.api.a.g
    public final int c() {
        return this.f69407c;
    }
}

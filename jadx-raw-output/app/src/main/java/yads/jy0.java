package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* JADX INFO: loaded from: classes9.dex */
public final class jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju3 f79238a;

    public final Intent a(Context context, long j10) {
        this.f79238a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j10);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }

    public jy0(ju3 ju3Var) {
        this.f79238a = ju3Var;
    }
}

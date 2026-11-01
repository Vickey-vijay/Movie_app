package fb;

import android.content.Context;
import android.util.TypedValue;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: BannerUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f52935a = new a();

    public final int a(Context context, int i10) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public final int b(Context context, float f10) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return (int) ((f10 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final int c(Context context, float f10) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return (int) ((f10 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}

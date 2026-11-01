package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class v61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83782a;

    public final File a() {
        File file = new File(this.f83782a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }

    public v61(Context context) {
        this.f83782a = context;
    }
}

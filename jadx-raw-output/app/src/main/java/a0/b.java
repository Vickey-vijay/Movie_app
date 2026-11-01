package a0;

import android.content.Context;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: ContentDirectoryServiceController.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements a0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3421c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f3422d = {"_id", "title", "_data", "mime_type", "_size"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.b f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3424b;

    /* JADX INFO: compiled from: ContentDirectoryServiceController.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f3423a = v.b.f73000b.a("ContentDirectoryService");
        Context applicationContext = context.getApplicationContext();
        p.i(applicationContext, "getApplicationContext(...)");
        this.f3424b = applicationContext;
    }
}

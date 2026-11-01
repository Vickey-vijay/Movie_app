package o8;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.luck.picture.lib.thread.PictureThreadUtils;

/* JADX INFO: compiled from: ToastUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f65151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f65152b;

    /* JADX INFO: compiled from: ToastUtils.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f65153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f65154c;

        public a(Context context, String str) {
            this.f65153b = context;
            this.f65154c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextB = y7.b.c().b();
            if (contextB == null) {
                contextB = this.f65153b.getApplicationContext();
            }
            Toast.makeText(contextB, this.f65154c, 0).show();
            String unused = r.f65152b = this.f65154c;
        }
    }

    public static boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f65151a < 1000) {
            return true;
        }
        f65151a = jCurrentTimeMillis;
        return false;
    }

    public static void c(Context context, String str) {
        if (b() && TextUtils.equals(str, f65152b)) {
            return;
        }
        Context contextB = y7.b.c().b();
        if (contextB == null) {
            contextB = context.getApplicationContext();
        }
        if (PictureThreadUtils.m()) {
            Toast.makeText(contextB, str, 0).show();
            f65152b = str;
        } else {
            PictureThreadUtils.n(new a(context, str));
        }
    }
}

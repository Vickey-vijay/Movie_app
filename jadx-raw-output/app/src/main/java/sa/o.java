package sa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.fvvcl.flickverse.R;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: ImgUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f67180a = new o();

    public static final void c(Activity activity, Bitmap bitmap) {
        String str;
        ck.p.j(activity, GAMConfig.KEY_CONTEXT);
        if (bitmap == null) {
            em.p.b("地址为空");
            return;
        }
        String str2 = Build.BRAND;
        if (ck.p.e(str2, "xiaomi")) {
            str = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/";
        } else if (ck.p.e(str2, "Huawei")) {
            str = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/";
        } else {
            str = Environment.getExternalStorageDirectory().getPath() + "/DCIM/";
        }
        File file = new File(str, System.currentTimeMillis() + ".jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            activity.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
            if (zCompress) {
                activity.runOnUiThread(new Runnable() { // from class: sa.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.d();
                    }
                });
            } else {
                activity.runOnUiThread(new Runnable() { // from class: sa.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.e();
                    }
                });
            }
        } catch (IOException e10) {
            em.p.b("保存图片找不到文件夹");
            e10.printStackTrace();
        }
    }

    public static final void d() {
        em.p.b(em.r.a().getResources().getString(R.string.str_save_sucess));
    }

    public static final void e() {
        em.p.b(em.r.a().getResources().getString(R.string.str_save_fail));
    }
}

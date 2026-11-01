package sa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: compiled from: ShareImageUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class h0 {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x003d -> B:30:0x0040). Please report as a decompilation issue!!! */
    public static void c(Bitmap bitmap, String str, String str2) throws Throwable {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        ?? r10 = 0;
        FileOutputStream fileOutputStream = null;
        r10 = 0;
        try {
            try {
                try {
                    File file2 = new File(str, str2);
                    file2.createNewFile();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        r10 = 100;
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        r10 = fileOutputStream;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            r10 = fileOutputStream;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = fileOutputStream2;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
            r10 = r10;
        }
    }

    public static Uri a(Context context, String str, File file) {
        return FileProvider.getUriForFile(context, str, file);
    }

    public static boolean b(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i10 = 0; i10 < installedPackages.size(); i10++) {
                if (installedPackages.get(i10).packageName.equals("com.tencent.mm")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void d(Context context, Bitmap bitmap, int i10) throws Throwable {
        if (b(context)) {
            c(bitmap, Environment.getExternalStorageDirectory().getPath(), "shareImage.jpg");
            String str = Environment.getExternalStorageDirectory() + "/shareImage.jpg";
            Intent intent = new Intent();
            if (i10 == 1) {
                intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
                intent.putExtra("Kdescription", "");
            } else if (i10 == 2) {
                intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"));
                intent.putExtra("Kdescription", "");
            }
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", a(context, BaseApplication.getInstance().getPackageName() + ".fileProvider", new File(str)));
            intent.setType("image/*");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return;
        }
        em.p.b("请先安装微信APP");
    }
}

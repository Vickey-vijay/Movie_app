package sa;

import android.content.SharedPreferences;
import android.os.Environment;
import java.io.File;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: compiled from: UserPreferencesUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class n0 {
    public static String a() {
        return b().getString("browser_download", Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "Download");
    }

    public static SharedPreferences b() {
        return BaseApplication.getInstance().getSharedPreferences("user.sharePreferences", 0);
    }
}

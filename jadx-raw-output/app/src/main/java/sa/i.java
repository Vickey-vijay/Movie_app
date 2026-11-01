package sa;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: compiled from: ClipBoardUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class i {
    public static void a() {
        ClipboardManager clipboardManager = (ClipboardManager) BaseApplication.getInstance().getSystemService("clipboard");
        if (clipboardManager != null) {
            try {
                clipboardManager.setPrimaryClip(clipboardManager.getPrimaryClip());
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static String b(Context context) {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }
}

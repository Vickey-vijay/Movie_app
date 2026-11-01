package com.mbridge.msdk.foundation.download.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.directory.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class HTMLResourceManager {
    public static final int EXPIRE_TIME = 259200000;
    private static final String TAG = "HTMLResourceManager";
    private String mFileSaveSDDir;

    public static class ResourceManagerHolder {
        public static HTMLResourceManager instance = new HTMLResourceManager();

        private ResourceManagerHolder() {
        }
    }

    private HTMLResourceManager() {
        init();
    }

    public static HTMLResourceManager getInstance() {
        return ResourceManagerHolder.instance;
    }

    public void cleanHtmlRes() {
        try {
            if (TextUtils.isEmpty(this.mFileSaveSDDir)) {
                return;
            }
            DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.HTMLResourceManager.1
                @Override // com.mbridge.msdk.foundation.same.task.a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void pauseTask(boolean z10) {
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void runTask() {
                    o0.a(HTMLResourceManager.this.mFileSaveSDDir);
                }
            });
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void init() {
        this.mFileSaveSDDir = e.b(c.MBRIDGE_700_HTML);
    }

    public boolean saveResHtmlFile(String str, byte[] bArr) {
        try {
            q0.c(TAG, "saveResHtmlFile url:" + str);
            if (bArr == null || bArr.length <= 0) {
                return false;
            }
            String str2 = this.mFileSaveSDDir + "/" + SameMD5.getMD5(c1.b(str)) + ".html";
            q0.c(TAG, "saveResHtmlFile folderName:" + str2);
            return o0.a(bArr, new File(str2));
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public String getHtmlContentFromUrl(String str) {
        try {
            File file = new File(this.mFileSaveSDDir + "/" + SameMD5.getMD5(c1.b(str)) + ".html");
            if (file.exists()) {
                return o0.e(file);
            }
            return null;
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public String getHtmlPathFromUrl(String str) {
        try {
            String str2 = this.mFileSaveSDDir + "/" + SameMD5.getMD5(c1.b(str)) + ".html";
            File file = new File(str2);
            if (file.exists()) {
                g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD != null && !TextUtils.isEmpty(gVarD.T())) {
                    d.a(str, file);
                }
                return "file:////" + str2;
            }
            return null;
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
                return null;
            }
            return null;
        }
    }
}

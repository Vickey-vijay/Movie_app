package com.yk.e.pl;

import android.content.Context;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.StringUtil;
import java.io.File;
import m7.m;
import m7.r;

/* JADX INFO: loaded from: classes.dex */
public class PreloadDownloadHandler {

    public interface IGetMD5Callback {
        void onFailed(int i10, String str);

        void onSuccess(String str);
    }

    public static class OktFileDownloadListener extends m {
        public void fileExists() {
        }
    }

    private m7.a createDownloadTask(Context context, String str, String str2, m mVar) {
        return addDownloadTask(context, str, str2, mVar);
    }

    private void printErrMsg(String str) {
        AdLog.e(PreloadManager.tag, str);
    }

    private m7.a createDownloadTask(Context context, String str, m mVar) {
        return addDownloadTask(context, str, getImgPreloadFilePath(context, str), mVar);
    }

    private void getMD5Checksum(Context context, final String str, final IGetMD5Callback iGetMD5Callback) {
        new Thread(new Runnable() { // from class: com.yk.e.pl.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f51171b.lambda$getMD5Checksum$0(str, iGetMD5Callback);
            }
        }).start();
    }

    private void printErrMsg(String str, Throwable th2) {
        AdLog.e(PreloadManager.tag, str, th2);
    }

    private void printMsg(String str) {
        AdLog.i(PreloadManager.tag, str);
    }

    public void downloadFile(Context context, String str, String str2, m mVar) {
        printMsg("downloadFile, url = " + str);
        createDownloadTask(context, str, mVar).start();
    }

    public void start(Context context, String str, String str2, OktFileDownloadListener oktFileDownloadListener) {
        try {
            if (new File(getImgPreloadFilePath(context, str)).exists()) {
                printMsg("缓存文件已存在：" + CoreUtils.getUrlFileName(str));
                if (oktFileDownloadListener != null) {
                    oktFileDownloadListener.fileExists();
                }
            } else {
                downloadFile(context, str, str2, oktFileDownloadListener);
            }
        } catch (Exception e10) {
            printErrMsg(e10.getMessage(), e10);
        }
    }

    private m7.a addDownloadTask(Context context, String str, String str2, m mVar) {
        return r.c().b(str).B(str2).m(Integer.MAX_VALUE).c(1000).E(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMD5Checksum$0(String str, IGetMD5Callback iGetMD5Callback) {
        try {
            iGetMD5Callback.onSuccess(CoreUtils.getMD5Checksum(str));
        } catch (Exception e10) {
            printErrMsg("获取文件MD5值失败，" + e10.getMessage(), e10);
            iGetMD5Callback.onFailed(-1, e10.getMessage());
        }
    }

    public String getImgPreloadFilePath(Context context, String str) {
        File filesDir = context.getFilesDir();
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        return filesDir.getAbsolutePath() + File.separator + StringUtil.encryptToMD5(str);
    }
}

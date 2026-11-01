package com.yk.e.pl;

import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import f0.f;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public class PreloadTask implements Runnable {
    private static final List<String> blackList = new ArrayList();
    private IPreloadCallback callback;
    public f mCacheServer;
    private boolean mIsCanceled;
    private boolean mIsExecuted;
    public int mPosition;
    public String mRawUrl;
    public boolean mIsAll = false;
    private boolean isCallbackSuccess = false;
    private final int RETRY_TIMES = 2;

    public interface IPreloadCallback {
        void onCancel(int i10);

        void onFailed(int i10, String str);

        void onSuccess(int i10);
    }

    private void printErrMsg(String str) {
        AdLog.e(PreloadManager.tag, str);
    }

    private void onCancel(int i10) {
        IPreloadCallback iPreloadCallback = this.callback;
        if (iPreloadCallback != null) {
            iPreloadCallback.onCancel(i10);
        }
    }

    private void onFailed(int i10, String str) {
        IPreloadCallback iPreloadCallback = this.callback;
        if (iPreloadCallback != null) {
            iPreloadCallback.onFailed(i10, str);
        }
    }

    private void onSuccess(int i10) {
        IPreloadCallback iPreloadCallback;
        if (this.isCallbackSuccess || (iPreloadCallback = this.callback) == null) {
            return;
        }
        this.isCallbackSuccess = true;
        iPreloadCallback.onSuccess(i10);
    }

    private void printErrMsg(String str, Throwable th2) {
        AdLog.e(PreloadManager.tag, str, th2);
    }

    private void printMsg(String str) {
        AdLog.i(PreloadManager.tag, str);
    }

    private void start(int i10) throws Throwable {
        StringBuilder sb2;
        if (blackList.contains(this.mRawUrl)) {
            onFailed(this.mPosition, "preload failed, in blackList");
            return;
        }
        String urlFileName = CoreUtils.getUrlFileName(this.mRawUrl);
        printMsg("预加载开始：" + urlFileName);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                URL url = new URL(this.mCacheServer.k(this.mRawUrl));
                printMsg("url " + url);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setReadTimeout(10000);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
                    byte[] bArr = new byte[8192];
                    int i11 = -1;
                    while (true) {
                        int i12 = bufferedInputStream.read(bArr);
                        if (i12 == -1) {
                            break;
                        }
                        i11 += i12;
                        if (!this.mIsCanceled) {
                            if (!this.mIsAll && i11 >= 838860) {
                                printMsg("预加载成功：" + urlFileName + " 读取数据：" + i11 + " Byte");
                                onSuccess(this.mPosition);
                                break;
                            }
                        } else {
                            printMsg("预加载取消：" + urlFileName + " 读取数据：" + i11 + " Byte");
                            onCancel(this.mPosition);
                            break;
                        }
                    }
                    printMsg("预加载成功：" + urlFileName + " 读取数据：" + i11 + " Byte");
                    onSuccess(this.mPosition);
                    httpURLConnection2.disconnect();
                    sb2 = new StringBuilder();
                } catch (SocketTimeoutException unused) {
                    httpURLConnection = httpURLConnection2;
                    printErrMsg("预加载超时：" + urlFileName);
                    if (i10 < 2) {
                        printMsg("预加载重试，" + urlFileName);
                        start(i10 + 1);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    sb2 = new StringBuilder();
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    printErrMsg("预加载异常：" + urlFileName + " 异常信息：" + e.getMessage(), e);
                    blackList.add(this.mRawUrl);
                    onFailed(this.mPosition, "预加载异常：" + urlFileName + " 异常信息：" + e.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    sb2 = new StringBuilder();
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    printMsg("预加载结束: " + urlFileName);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SocketTimeoutException unused2) {
        } catch (Exception e11) {
            e = e11;
        }
        sb2.append("预加载结束: ");
        sb2.append(urlFileName);
        printMsg(sb2.toString());
    }

    public void cancel() {
        if (this.mIsExecuted) {
            this.mIsCanceled = true;
        }
    }

    public void executeOn(ExecutorService executorService) {
        if (this.mIsExecuted) {
            return;
        }
        this.mIsExecuted = true;
        executorService.submit(this);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (!this.mIsCanceled) {
            start(0);
        }
        this.mIsExecuted = false;
        this.mIsCanceled = false;
    }

    public void setCallback(IPreloadCallback iPreloadCallback) {
        this.callback = iPreloadCallback;
    }
}

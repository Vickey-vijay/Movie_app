package com.yk.e.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.Y5;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yk.e.net.TaskThreadPool;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class FileLoader {
    public Context context;
    public String filePath;
    public String fileUrl;
    public String packageName;
    public long startTime;
    public String strSpeed;
    public ArrayList<FileLoadCallBack> callBackList = new ArrayList<>();
    public long lastDownSize = 0;
    public long lastTime = 0;
    public long lastProgress = 0;
    public long fileContentSize = 0;
    public Handler handler = new Handler(new Handler.Callback() { // from class: com.yk.e.util.FileLoader.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == -1) {
                Intent intent = new Intent(Constant.ActionDownLoad);
                intent.putExtra(Y5.c.f27927a, FileLoader.this.fileUrl);
                intent.putExtra("downLoadFail", true);
                FileLoader.this.context.sendBroadcast(intent);
            } else {
                FileLoader.this.sendPackageName();
            }
            if (new File(FileLoader.this.filePath).exists()) {
                double dRound = ((double) Math.round(((System.currentTimeMillis() - FileLoader.this.startTime) * 100) / 1000)) / 100.0d;
                LogUtil.i("zhazha", "文件花费的时间 = " + dRound + "秒");
                LogUtil.i("zhazha", "总下载平均速度 = " + FileLoader.this.initSpeedStr(((double) FileLoader.this.fileContentSize) / dRound));
            }
            FileLoader.this.callBack();
            Constant.removeFileLoader(FileLoader.this.fileUrl);
            return false;
        }
    });

    public interface FileLoadCallBack {
        void execute(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBack() {
        for (int i10 = 0; i10 < this.callBackList.size(); i10++) {
            try {
                FileLoadCallBack fileLoadCallBack = this.callBackList.get(i10);
                if (fileLoadCallBack != null) {
                    fileLoadCallBack.execute(this.filePath);
                }
            } catch (Exception e10) {
                AdLog.e("FileLoader callback error, msg = " + e10.getMessage(), e10);
                return;
            }
        }
    }

    public static String getPathByUrl(Context context, String str) {
        String fileNameFromUrl;
        String absolutePath = "";
        File file = new File(AppUtil.getCacheDirectory(context), Constant.fileLoaderPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            if (str.contains(".apk")) {
                fileNameFromUrl = StringUtil.getFileNameFromUrl(str, "apk");
                if (fileNameFromUrl.length() > 30) {
                    fileNameFromUrl = fileNameFromUrl.substring(fileNameFromUrl.length() - 30);
                }
            } else {
                fileNameFromUrl = str.contains(".mp4") ? StringUtil.getFileNameFromUrl(str, "mp4") : "";
            }
            absolutePath = new File(file.getAbsolutePath() + "/" + fileNameFromUrl).getAbsolutePath();
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        LogUtil.i("zhazha", "filePath = " + absolutePath);
        return absolutePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:63:0x0182 A[Catch: Exception -> 0x017e, TRY_LEAVE, TryCatch #1 {Exception -> 0x017e, blocks: (B:59:0x017a, B:63:0x0182), top: B:67:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[SYNTHETIC] */
    public void loadFileFromNet() throws Throwable {
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        this.startTime = System.currentTimeMillis();
        String trueUrl = getTrueUrl(this.fileUrl);
        this.filePath = getPathByUrl(this.context, trueUrl);
        if (new File(this.filePath).exists()) {
            this.handler.sendEmptyMessage(1);
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(trueUrl).openConnection();
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                httpURLConnection.setRequestMethod("GET");
                LogUtil.i("zhazha", "con.getResponseCode() = " + httpURLConnection.getResponseCode());
                if (httpURLConnection.getResponseCode() == 200) {
                    String str = this.filePath + "_temp";
                    long contentLength = httpURLConnection.getContentLength();
                    this.fileContentSize = contentLength;
                    LogUtil.i("zhazha", "下载的文件的大小 = " + ((contentLength / 1024) / 1024) + "MB");
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        fileOutputStream = new FileOutputStream(str, false);
                        try {
                            byte[] bArr = new byte[1024];
                            int i10 = 0;
                            int i11 = -1;
                            while (true) {
                                long j10 = inputStream2.read(bArr);
                                if (j10 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, (int) j10);
                                i10 = (int) (((long) i10) + j10);
                                int i12 = (int) ((((double) i10) * 100.0d) / contentLength);
                                if (i11 != i12) {
                                    Intent intent = new Intent(Constant.ActionDownLoad);
                                    intent.putExtra("progress", i12);
                                    intent.putExtra(Y5.c.f27927a, this.fileUrl);
                                    intent.putExtra("speed", this.strSpeed);
                                    this.context.sendBroadcast(intent);
                                    i11 = i12;
                                }
                                showSpeed(i10, i11);
                                if (i12 == 100) {
                                    Thread.sleep(100L);
                                    File file = new File(str);
                                    if (file.exists()) {
                                        file.renameTo(new File(this.filePath));
                                    }
                                }
                            }
                            AdLog.d("dl", "下载好的文件 = filePath = " + this.filePath);
                            this.handler.sendEmptyMessage(1);
                            inputStream = inputStream2;
                        } catch (Exception e10) {
                            e = e10;
                            inputStream = inputStream2;
                            try {
                                AdLog.e(e.getMessage(), e);
                                this.handler.sendEmptyMessage(-1);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th3 = th4;
                                th2 = th3;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e11) {
                                        AdLog.e(e11.getMessage(), e11);
                                        throw th2;
                                    }
                                }
                                if (fileOutputStream == null) {
                                    throw th2;
                                }
                                fileOutputStream.close();
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            inputStream = inputStream2;
                            th2 = th3;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (fileOutputStream == null) {
                                throw th2;
                            }
                            fileOutputStream.close();
                            throw th2;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                    } catch (Throwable th6) {
                        th3 = th6;
                        fileOutputStream = null;
                    }
                } else {
                    this.handler.sendEmptyMessage(-1);
                    fileOutputStream = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e13) {
                AdLog.e(e13.getMessage(), e13);
            }
        } catch (Exception e14) {
            e = e14;
            fileOutputStream = null;
        } catch (Throwable th7) {
            th2 = th7;
            fileOutputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (fileOutputStream == null) {
                throw th2;
            }
            fileOutputStream.close();
            throw th2;
        }
    }

    private void showSpeed(int i10, int i11) {
        if (this.lastTime == 0) {
            this.lastTime = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.lastTime;
        if (jCurrentTimeMillis - j10 == 0) {
            return;
        }
        if (jCurrentTimeMillis - j10 >= 1000 || i11 != this.lastProgress) {
            this.lastTime = jCurrentTimeMillis;
            this.lastDownSize = i10;
            this.lastProgress = i11;
        }
    }

    public String getTrueUrl(String str) {
        String string;
        if (str.contains(".mp4") || str.contains(".apk")) {
            return str;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestMethod("GET");
            LogUtil.i("zhazha", "获取真实url中 con.getResponseCode() = " + httpURLConnection.getResponseCode());
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                string = httpURLConnection.getURL().toString();
                LogUtil.i("zhazha", "200获取真实url中 realUrl = " + string);
            } else if (responseCode == 307 || responseCode == 301 || responseCode == 302) {
                string = httpURLConnection.getHeaderField("Location");
                LogUtil.i("zhazha", "非200获取真实url中 realUrl = " + string);
            } else {
                string = "";
            }
            return string.contains(".apk") ? string : getTrueUrl(string);
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return "";
        }
    }

    public String initSpeedStr(double d10) {
        this.strSpeed = "";
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (d10 > 1024.0d) {
            StringBuilder sb2 = new StringBuilder();
            double d11 = d10 / 1024.0d;
            sb2.append(decimalFormat.format(d11));
            sb2.append("KB/S");
            this.strSpeed = sb2.toString();
            if (d10 > 1048576.0d) {
                this.strSpeed = decimalFormat.format(d11 / 1024.0d) + "MB/S";
            }
        } else {
            this.strSpeed = d10 + "B/S";
        }
        return this.strSpeed;
    }

    public void loadFile(Context context) {
        if (Constant.fileLoadRunning(this.fileUrl)) {
            AdLog.d("dl", "已经在下载中fileUrl = " + this.fileUrl);
            return;
        }
        this.context = context;
        AdLog.d("dl", "fileUrl = " + this.fileUrl);
        this.filePath = getPathByUrl(context, this.fileUrl);
        if (!new File(this.filePath).exists()) {
            Constant.downLoadMap.put(this.fileUrl, this);
            TaskThreadPool.executeRunnable(new Runnable() { // from class: com.yk.e.util.FileLoader.2
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    FileLoader.this.loadFileFromNet();
                }
            });
        } else {
            AdLog.d("dl", "loadFile 文件已存在");
            callBack();
            Constant.removeFileLoader(this.fileUrl);
        }
    }

    public void sendPackageName() {
        if (this.filePath.lastIndexOf(".apk") != -1) {
            this.packageName = AppUtil.getPackageName(this.context, this.filePath);
            Intent intent = new Intent(Constant.ActionDownLoad);
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
            this.context.sendBroadcast(intent);
        }
    }

    public void setCallBack(FileLoadCallBack fileLoadCallBack) {
        if (fileLoadCallBack != null) {
            this.callBackList.add(fileLoadCallBack);
        }
    }

    public FileLoader(String str) {
        this.fileUrl = str;
    }

    public static boolean isApkVaild(Context context, String str) {
        String pathByUrl = getPathByUrl(context, str);
        String packageName = AppUtil.getPackageName(context, pathByUrl);
        File file = new File(pathByUrl);
        if (!file.exists()) {
            return false;
        }
        if (TextUtils.isEmpty(packageName)) {
            file.delete();
            return false;
        }
        return true;
    }
}

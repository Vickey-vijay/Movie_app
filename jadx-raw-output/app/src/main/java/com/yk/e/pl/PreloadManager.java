package com.yk.e.pl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bp.b;
import com.yk.e.object.PreCacheParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.UsLocalSaveHelper;
import f0.f;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class PreloadManager {
    public static final int PRELOAD_LENGTH = 838860;
    private static PreloadManager sPreloadManager = null;
    public static String tag = "MainPreload";
    private final f mHttpProxyCacheServer;
    private final ExecutorService mExecutorService = Executors.newSingleThreadExecutor();
    private final ExecutorService mExecutorService4Play = Executors.newSingleThreadExecutor();
    private final ExecutorService mExecutorService4PauseInsert = Executors.newSingleThreadExecutor();
    private final ExecutorService mExecutorService4Splash = Executors.newSingleThreadExecutor();
    private final LinkedHashMap<String, PreloadTask> mPreloadTasks = new LinkedHashMap<>();
    private boolean mIsStartPreload = true;

    public class ImgPreloadListener implements ImageHandler.IImageHandlerCallback {
        private String adsID;
        private Context context;
        private String imgUrl;

        public ImgPreloadListener(Context context, String str, String str2) {
            this.context = context;
            this.imgUrl = str;
            this.adsID = str2;
        }

        @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
        public void onFailed(String str) {
            PreloadManager.this.printMsg("preload img error, url = " + this.imgUrl + ", msg = " + str);
        }

        @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
        public void onSuccess(Drawable drawable) {
            PreloadManager.this.printMsg("preload img onSuccess, url = " + CoreUtils.getUrlFileName(this.imgUrl));
            CoreUtils.addCacheImgAdsID(this.context, this.adsID);
        }
    }

    public class ImgPreloadTaskListener extends PreloadDownloadHandler.OktFileDownloadListener {
        private String adsID;
        private Context context;
        private String imgUrl;

        private void completed() {
            PreloadManager.this.printMsg("preload img onSuccess, url = " + CoreUtils.getUrlFileName(this.imgUrl));
        }

        public ImgPreloadTaskListener(Context context, String str, String str2) {
            this.context = context;
            this.imgUrl = str;
            this.adsID = str2;
        }

        @Override // m7.m, m7.i
        public void completed(m7.a aVar) {
            super.completed(aVar);
            completed();
            CoreUtils.addCacheImgAdsID(this.context, this.adsID);
        }

        @Override // m7.m, m7.i
        public void error(m7.a aVar, Throwable th2) {
            super.error(aVar, th2);
            PreloadManager.this.printMsg("preload img error, url = " + this.imgUrl + ", msg = " + th2.getMessage());
        }

        @Override // com.yk.e.pl.PreloadDownloadHandler.OktFileDownloadListener
        public void fileExists() {
            super.fileExists();
            completed();
        }

        @Override // m7.m, m7.i
        public void progress(m7.a aVar, int i10, int i11) {
            super.progress(aVar, i10, i11);
        }
    }

    public class VideoPreloadCallback implements PreloadTask.IPreloadCallback {
        private String adsID;
        private Context context;
        private String url;

        @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
        public void onCancel(int i10) {
        }

        @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
        public void onFailed(int i10, String str) {
        }

        public VideoPreloadCallback(Context context, String str, String str2) {
            this.context = context;
            this.url = str;
            this.adsID = str2;
        }

        @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
        public void onSuccess(int i10) {
            CoreUtils.addCacheVideoAdsID(this.context, this.adsID);
        }
    }

    private boolean isPreloaded(String str) {
        try {
            File fileG = this.mHttpProxyCacheServer.g(str);
            if (!fileG.exists()) {
                File fileM = this.mHttpProxyCacheServer.m(str);
                return fileM.exists() && fileM.length() >= 838860;
            }
            if (fileG.length() >= 1024) {
                return true;
            }
            fileG.delete();
            return false;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return false;
    }

    public void addPreloadTask(String str, int i10, PreloadTask.IPreloadCallback iPreloadCallback) {
        addPreloadTask(str, i10, false, iPreloadCallback);
    }

    public void removePreloadCacheIDList(Context context) {
    }

    public static PreloadManager getInstance(Context context) {
        if (sPreloadManager == null) {
            synchronized (PreloadManager.class) {
                if (sPreloadManager == null) {
                    sPreloadManager = new PreloadManager(context.getApplicationContext());
                }
            }
        }
        return sPreloadManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printMsg(String str) {
        AdLog.i(tag, str);
    }

    public void addPauseInsertLoadTask(String str, int i10, boolean z10, PreloadTask.IPreloadCallback iPreloadCallback) {
        AdLog.d("addPauseInsertLoadTask ");
        addPreloadTask(str, i10, z10, this.mExecutorService4PauseInsert, iPreloadCallback);
    }

    public void addPlayLoadTask(String str, int i10, boolean z10, PreloadTask.IPreloadCallback iPreloadCallback) {
        AdLog.d("addPlayLoadTask ");
        addPreloadTask(str, i10, z10, this.mExecutorService4Play, iPreloadCallback);
    }

    public void addPreloadTask(String str, int i10, boolean z10, PreloadTask.IPreloadCallback iPreloadCallback) {
        addPreloadTask(str, i10, z10, this.mExecutorService, iPreloadCallback);
    }

    public void addSplashLoadTask(String str, int i10, boolean z10, PreloadTask.IPreloadCallback iPreloadCallback) {
        AdLog.d("addSplashLoadTask ");
        addPreloadTask(str, i10, z10, this.mExecutorService4Splash, iPreloadCallback);
    }

    public String getPlayUrl(String str) {
        AdLog.subAd("getPlayUrl " + str);
        PreloadTask preloadTask = this.mPreloadTasks.get(str);
        if (preloadTask != null) {
            preloadTask.cancel();
        }
        if (!isPreloaded(str)) {
            printMsg("加载RawUrl：" + str);
            return str;
        }
        String strK = this.mHttpProxyCacheServer.k(str);
        printMsg("加载本地缓存视频：" + strK);
        return strK;
    }

    public void pausePreload(int i10, boolean z10) {
        b.a("pausePreload：" + i10 + " isReverseScroll: " + z10);
        this.mIsStartPreload = false;
        Iterator<Map.Entry<String, PreloadTask>> it = this.mPreloadTasks.entrySet().iterator();
        while (it.hasNext()) {
            PreloadTask value = it.next().getValue();
            if (z10) {
                if (value.mPosition >= i10) {
                    value.cancel();
                }
            } else if (value.mPosition <= i10) {
                value.cancel();
            }
        }
    }

    public void preloadCacheList4Init(Context context) {
        printMsg("preloadCacheList4Init");
        preloadCacheList(context, UsLocalSaveHelper.getInstance().getPreCache4InitList());
    }

    public void preloadCacheList4Timer(Context context) {
        printMsg("preloadCacheList4Time");
        preloadCacheList(context, UsLocalSaveHelper.getInstance().getTimerCacheList());
    }

    public void removeAllPreloadTask() {
        Iterator<Map.Entry<String, PreloadTask>> it = this.mPreloadTasks.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel();
            it.remove();
        }
    }

    public void removePreloadTask(String str) {
        PreloadTask preloadTask = this.mPreloadTasks.get(str);
        if (preloadTask != null) {
            preloadTask.cancel();
            this.mPreloadTasks.remove(str);
        }
    }

    public void resumePreload(int i10, boolean z10) {
        b.a("resumePreload：" + i10 + " isReverseScroll: " + z10);
        this.mIsStartPreload = true;
        Iterator<Map.Entry<String, PreloadTask>> it = this.mPreloadTasks.entrySet().iterator();
        while (it.hasNext()) {
            PreloadTask value = it.next().getValue();
            if (z10) {
                if (value.mPosition < i10 && !isPreloaded(value.mRawUrl)) {
                    value.executeOn(this.mExecutorService);
                }
            } else if (value.mPosition > i10 && !isPreloaded(value.mRawUrl)) {
                value.executeOn(this.mExecutorService);
            }
        }
    }

    private PreloadManager(Context context) {
        this.mHttpProxyCacheServer = ProxyVideoCacheManager.getProxy(context);
    }

    private void addPreloadTask(String str, int i10, boolean z10, ExecutorService executorService, PreloadTask.IPreloadCallback iPreloadCallback) {
        try {
            if (isPreloaded(str)) {
                printMsg("缓存文件已存在：" + CoreUtils.getUrlFileName(str));
                if (iPreloadCallback != null) {
                    iPreloadCallback.onSuccess(i10);
                    return;
                }
                return;
            }
            PreloadTask preloadTask = new PreloadTask();
            preloadTask.setCallback(iPreloadCallback);
            preloadTask.mRawUrl = str;
            preloadTask.mPosition = i10;
            preloadTask.mIsAll = z10;
            preloadTask.mCacheServer = this.mHttpProxyCacheServer;
            this.mPreloadTasks.put(str, preloadTask);
            if (this.mIsStartPreload) {
                preloadTask.executeOn(executorService);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            if (iPreloadCallback != null) {
                iPreloadCallback.onFailed(i10, e10.getMessage());
            }
        }
    }

    public void preloadCacheList(Context context, List<PreCacheParams> list) {
        if (list.size() == 0) {
            printMsg("资源加载列表为空");
            return;
        }
        for (PreCacheParams preCacheParams : list) {
            String videoUrl = preCacheParams.getVideoUrl();
            String imgUrl = preCacheParams.getImgUrl();
            preCacheParams.getFileAlias();
            String adsID = preCacheParams.getAdsID();
            if (!TextUtils.isEmpty(videoUrl)) {
                addPreloadTask(videoUrl, (int) System.currentTimeMillis(), false, new VideoPreloadCallback(context, videoUrl, adsID));
            }
            if (!TextUtils.isEmpty(imgUrl)) {
                new ImageHandler().preloadImg(context, imgUrl, new ImgPreloadListener(context, imgUrl, adsID));
            }
        }
    }
}

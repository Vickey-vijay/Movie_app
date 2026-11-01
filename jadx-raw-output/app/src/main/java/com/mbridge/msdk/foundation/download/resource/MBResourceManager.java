package com.mbridge.msdk.foundation.download.resource;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.core.ExecutorManager;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.resource.stream.FileDownloadRandomAccessDownloadFile;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.UnzipUtility;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class MBResourceManager {
    private static volatile MBResourceManager MBResourceManager;

    public void deleteFile(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                deleteFile(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }

    public static MBResourceManager getInstance() {
        if (MBResourceManager == null) {
            synchronized (MBResourceManager.class) {
                if (MBResourceManager == null) {
                    MBResourceManager = new MBResourceManager();
                }
            }
        }
        return MBResourceManager;
    }

    public void executeResourceStrategy(final ResourceConfig resourceConfig) {
        final Queue<ResourceStrategy> resourceStrategyQueue;
        if (resourceConfig == null || resourceConfig.getResourceStrategyQueue() == null || resourceConfig.getResourceStrategyQueue().isEmpty() || (resourceStrategyQueue = resourceConfig.getResourceStrategyQueue()) == null || resourceStrategyQueue.isEmpty()) {
            return;
        }
        GlobalComponent.getInstance().getLogger().log(ResourceStrategy.TAG, "配置的资源管理策略数量： " + resourceStrategyQueue.size());
        ExecutorManager.getInstance().getExecutorSupplier().getLruCacheThreadTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.resource.MBResourceManager.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    ResourceStrategy resourceStrategy = (ResourceStrategy) resourceStrategyQueue.poll();
                    if (resourceStrategy == null) {
                        return;
                    }
                    ResourceStrategyExecutor resourceStrategyExecutor = new ResourceStrategyExecutor(resourceStrategy);
                    GlobalComponent.getInstance().getLogger().log(ResourceStrategy.TAG, "执行策略： " + resourceStrategyExecutor.getResourceStrategyName());
                    MBResourceManager unused = MBResourceManager.MBResourceManager;
                    resourceStrategyExecutor.processResource(MBResourceManager.getInstance(), GlobalComponent.getInstance().getDatabaseHelper(), resourceConfig);
                }
            }
        });
    }

    public DownloadFileOutputStream getDownloadFileOutputStream(File file) throws IOException {
        if (file == null) {
            throw new IOException("file is null");
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        return new FileDownloadRandomAccessDownloadFile(file);
    }

    public String getDownloadId(String str) {
        try {
            URL url = new URL(str);
            String str2 = url.getProtocol() + "://" + url.getHost() + url.getPath();
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str2.getBytes("UTF-8"));
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }

    private MBResourceManager() {
    }

    public long getFileSize(File file, String str, String str2) {
        if (Objects.exists(file, str, str2)) {
            try {
                return file.length();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public String getUnZipResourcePath(String str, String str2) {
        List<String> queryParameters;
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (queryParameters = Uri.parse(str2).getQueryParameters(ResourceManager.KEY_INDEX_HTML)) != null && !queryParameters.isEmpty()) {
            String str4 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str4)) {
                String str5 = str + "/" + str4 + "/" + str4 + ".html";
                if (o0.e(str5)) {
                    g gVarD = h.b().d(c.n().b());
                    if (gVarD != null && !TextUtils.isEmpty(gVarD.T())) {
                        d.a(str2, new File(str5));
                    }
                    String strSubstring = str2.substring(str2.indexOf("?") + 1);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        str3 = "?" + strSubstring;
                    } else {
                        str3 = "";
                    }
                    return AdPayload.FILE_SCHEME + str5 + str3;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public void unZip(String str, String str2) throws IOException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                try {
                    if (new UnzipUtility().unzip(str, str2) != 0) {
                        o0.b(str, str2);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (Exception unused2) {
                o0.b(str, str2);
                return;
            }
            return;
        }
        throw new IOException("zipFilePath or destDirectory is null");
    }

    public void deleteFile(String str) {
        deleteFile(new File(str));
    }
}

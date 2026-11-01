package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt;
import com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.ouw;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.core.zih;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class CacheDirFactory {
    public static volatile vt MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String ouw;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }

    public static String getImageCacheDir(String str) {
        if (ouw == null) {
            ouw = getDiskCacheDirPath(str);
        }
        return ouw;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileOuw = ra.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh(), "tt_ad");
        if (fileOuw.isFile()) {
            fileOuw.delete();
        }
        if (!fileOuw.exists()) {
            fileOuw.mkdirs();
        }
        String absolutePath = fileOuw.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static vt ouw() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    ouw ouwVar = new ouw();
                    MEDIA_CACHE_DIR = ouwVar;
                    ouwVar.ouw(getRootDir());
                    MEDIA_CACHE_DIR.yu();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static vt getICacheDir(int i10) {
        return ouw();
    }
}

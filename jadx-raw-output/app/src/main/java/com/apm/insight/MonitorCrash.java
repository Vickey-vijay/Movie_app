package com.apm.insight;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class MonitorCrash {
    public static CustomRequestHeader mCustomRequestHeader;
    private static volatile boolean sAppMonitorCrashInit;
    public Config mConfig;
    public AttachUserData mCustomData;
    public AttachUserData mCustomLongData;
    public HeaderParams mParams;
    public HashMap<String, String> mTagMap = new HashMap<>();

    public class Config {
        public String mAid;
        public String mChannel;
        public String mDeviceId;
        public String[] mPackageName;
        public String mSSID;
        public String[] mSoList;
        public String[] mThreadList;
        public String mUID;
        public long mVersionInt = -1;
        public String mVersionStr;

        public Config setPackageName(String... strArr) {
            this.mPackageName = strArr;
            com.apm.insight.j.b.c();
            return this;
        }

        public Config() {
        }

        public Config setChannel(String str) {
            this.mChannel = str;
            com.apm.insight.j.b.c();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            com.apm.insight.j.b.c();
            return this;
        }

        public Config setSSID(String str) {
            this.mSSID = str;
            com.apm.insight.j.b.c();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            com.apm.insight.j.b.c();
            return this;
        }

        public Config setThreadList(String[] strArr) {
            this.mThreadList = strArr;
            com.apm.insight.j.b.c();
            return this;
        }

        public Config setUID(String str) {
            this.mUID = str;
            com.apm.insight.j.b.c();
            return this;
        }

        public Config setPackageName(String str) {
            return setPackageName(str);
        }
    }

    public interface HeaderParams {
        Map<String, Object> getCommonParams();
    }

    private MonitorCrash(Context context, String str, long j10, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        config.mVersionInt = j10;
        config.mVersionStr = str2;
        d.a(context, this);
    }

    public static MonitorCrash initSDK(Context context, String str, long j10, String str2, String str3, String[] strArr) {
        l.a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j10, str2, str3);
        monitorCrash.config().setPackageName(str3).setSoList(strArr);
        return monitorCrash;
    }

    @Nullable
    public static MonitorCrash init(Context context, String str, long j10, String str2) {
        if (sAppMonitorCrashInit) {
            return null;
        }
        synchronized (MonitorCrash.class) {
            if (sAppMonitorCrashInit) {
                return null;
            }
            sAppMonitorCrashInit = true;
            l.a(context);
            return new MonitorCrash(context, str, j10, str2);
        }
    }

    public static void setCustomRequestHeaderCallback(CustomRequestHeader customRequestHeader) {
        mCustomRequestHeader = customRequestHeader;
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    @NonNull
    public Config config() {
        return this.mConfig;
    }

    public void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        if (this == d.f6355a) {
            l.a(iCrashCallback, crashType);
        } else {
            l.a(new b(this.mConfig.mAid, iCrashCallback), crashType);
        }
    }

    public void registerOOMCallback(IOOMCallback iOOMCallback) {
        if (this == d.f6355a) {
            l.a(iOOMCallback);
        } else {
            l.a(new b(this.mConfig.mAid, iOOMCallback));
        }
    }

    public void reportCustomErr(String str, String str2, Throwable th2) {
        com.apm.insight.f.b.a(this, th2, str, str2, "core_exception_monitor");
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash withOtherHeaders(@Nullable HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }

    public MonitorCrash setReportUrl(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        int iIndexOf = str.indexOf("://");
        if (iIndexOf < 0) {
            i10 = 8;
            str = "https://".concat(str);
        } else {
            i10 = iIndexOf + 3;
        }
        int iIndexOf2 = str.indexOf("/", i10);
        if (iIndexOf2 >= 0) {
            str = str.substring(0, iIndexOf2);
        }
        a.a((Object) "set url ".concat(String.valueOf(str)));
        e.i().setLaunchCrashUrl(str + ConfigManager.EXCEPTION_URL_SUFFIX);
        e.i().setJavaCrashUploadUrl(str + ConfigManager.JAVA_URL_SUFFIX);
        e.i().setNativeCrashUrl(str + ConfigManager.NATIVE_URL_SUFFIX);
        e.i().setConfigUrl(str + ConfigManager.CONFIG_URL_SUFFIX);
        return this;
    }

    public static MonitorCrash initSDK(Context context, String str, long j10, String str2, String[] strArr, String[] strArr2) {
        l.a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j10, str2, strArr);
        monitorCrash.config().setPackageName(strArr).setSoList(strArr2);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j10, String str2, String str3) {
        l.a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j10, str2, str3);
        monitorCrash.config().setPackageName(str3);
        return monitorCrash;
    }

    private MonitorCrash(String str, long j10, String str2, String... strArr) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        config.mVersionInt = j10;
        config.mVersionStr = str2;
        config.mPackageName = strArr;
        d.a(this);
    }

    public static MonitorCrash initSDK(Context context, String str, long j10, String str2, String... strArr) {
        l.a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j10, str2, strArr);
        monitorCrash.config().setPackageName(strArr);
        return monitorCrash;
    }
}

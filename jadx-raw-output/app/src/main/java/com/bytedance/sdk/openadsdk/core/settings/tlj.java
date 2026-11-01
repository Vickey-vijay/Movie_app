package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.zin;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.mwh;
import com.safedk.android.internal.partials.PangleFilesBridge;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tlj implements fkw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f13065cf;
    private final String pno;
    private final ouw tlj;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f13067lh = new ConcurrentHashMap<>();
    private final Object yu = new Object();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Object f13066le = new Object();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final CountDownLatch f13068ra = new CountDownLatch(1);
    private Properties bly = new Properties();
    public volatile boolean fkw = false;

    public interface ouw {
        void ouw();

        void vt();
    }

    public class vt implements fkw.ouw {
        private final Map<String, Object> vt = new HashMap();

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final Object f13069lh = new Object();

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final void ouw() {
            Object obj;
            boolean z10 = false;
            ko.ouw("SdkSettings.Prop", "commit: ", this.vt);
            Properties properties = new Properties();
            synchronized (this.f13069lh) {
                properties.putAll(tlj.this.bly);
                for (Map.Entry<String, Object> entry : this.vt.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z10 = true;
                        }
                    } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                        properties.put(key, String.valueOf(value));
                        z10 = true;
                    }
                }
                this.vt.clear();
                if (z10) {
                    tlj.ouw(tlj.this, properties);
                    tlj.this.bly = properties;
                    tlj.this.f13067lh.clear();
                    tlj.lh(tlj.this);
                }
            }
        }

        public vt() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, String str2) {
            synchronized (this.f13069lh) {
                this.vt.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, int i10) {
            synchronized (this.f13069lh) {
                this.vt.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, long j10) {
            synchronized (this.f13069lh) {
                this.vt.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str) {
            synchronized (this.f13069lh) {
                this.vt.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, float f10) {
            synchronized (this.f13069lh) {
                this.vt.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, boolean z10) {
            synchronized (this.f13069lh) {
                this.vt.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public static /* synthetic */ boolean lh(tlj tljVar) {
        tljVar.f13065cf = false;
        return false;
    }

    private void yu() {
        if (this.f13065cf && zih.ouw() != null) {
            ouw(true);
        }
        if (this.fkw) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f13068ra.await(bs.le() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            qbp.ouw("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    public final void lh() {
        ouw ouwVar = this.tlj;
        if (ouwVar != null) {
            ouwVar.vt();
        }
    }

    public final String ouw(String str, String str2) {
        if (str.isEmpty()) {
            return str2;
        }
        yu();
        return this.bly.getProperty(str, str2);
    }

    public tlj(String str, ouw ouwVar) {
        this.pno = str;
        this.tlj = ouwVar;
        bs.ouw(new com.bytedance.sdk.component.pno.pno("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.tlj.1
            @Override // java.lang.Runnable
            public final void run() {
                tlj.this.ouw(false);
            }
        });
    }

    @Nullable
    private File fkw() {
        Context contextOuw = zih.ouw();
        if (contextOuw != null) {
            return new File(contextOuw.getFilesDir(), this.pno);
        }
        return null;
    }

    public final void vt() {
        File fileFkw = fkw();
        if (fileFkw == null || !fileFkw.exists()) {
            return;
        }
        fileFkw.delete();
    }

    public final int ouw(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            yu();
            try {
                return Integer.parseInt(this.bly.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                qbp.ouw("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public final long ouw(String str, long j10) {
        if (str.isEmpty()) {
            return j10;
        }
        yu();
        try {
            return Long.parseLong(this.bly.getProperty(str, String.valueOf(j10)));
        } catch (NumberFormatException e10) {
            qbp.ouw("SdkSettings.Prop", "", e10);
            return j10;
        }
    }

    public final float ouw(String str) {
        if (str != null && !str.isEmpty()) {
            yu();
            try {
                return Float.parseFloat(this.bly.getProperty(str, NastAdapter.ADAPTER_SDK_VERSION_NAME));
            } catch (NumberFormatException e10) {
                qbp.ouw("SdkSettings.Prop", "", e10);
            }
        }
        return 1.0f;
    }

    public final boolean ouw(String str, boolean z10) {
        if (str != null && !str.isEmpty()) {
            yu();
            try {
                return Boolean.parseBoolean(this.bly.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                qbp.ouw("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    public final void ouw(boolean z10) {
        ouw ouwVar;
        Object obj;
        synchronized (this.yu) {
            if (this.fkw && !z10) {
                ko.vt("SdkSettings.Prop", "reload: already loaded, ignore");
                return;
            }
            if (zih.ouw() != null) {
                boolean z11 = false;
                this.f13065cf = false;
                File fileFkw = fkw();
                if (fileFkw != null && fileFkw.exists()) {
                    Properties properties = new Properties();
                    FileInputStream fileInputStream = null;
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(fileFkw);
                            try {
                                properties.load(fileInputStream2);
                                ko.ouw("SdkSettings.Prop", "reload: find", Integer.valueOf(properties.size()), "items from " + fileFkw.getAbsolutePath());
                                if (!properties.isEmpty()) {
                                    this.bly = properties;
                                    this.f13067lh.clear();
                                }
                                mwh.ouw(fileInputStream2);
                                obj = this.yu;
                            } catch (OutOfMemoryError unused) {
                                fileInputStream = fileInputStream2;
                                try {
                                    com.bytedance.sdk.component.utils.ra.lh(fileFkw);
                                } catch (Throwable th2) {
                                    qbp.ouw("SdkSettings.Prop", "delete: ", th2);
                                }
                                if (fileInputStream != null) {
                                    mwh.ouw(fileInputStream);
                                }
                                obj = this.yu;
                            } catch (Throwable th3) {
                                th = th3;
                                fileInputStream = fileInputStream2;
                                qbp.ouw("SdkSettings.Prop", "reload: ", th);
                                if (fileInputStream != null) {
                                    mwh.ouw(fileInputStream);
                                }
                                obj = this.yu;
                            }
                        } catch (Throwable th4) {
                            if (fileInputStream != null) {
                                mwh.ouw(fileInputStream);
                            }
                            this.yu.notifyAll();
                            throw th4;
                        }
                    } catch (OutOfMemoryError unused2) {
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    obj.notifyAll();
                } else if (zin.ouw(zih.ouw()) && "tt_sdk_settings.prop".equals(this.pno)) {
                    try {
                        SharedPreferences sharedPreferences = zih.ouw().getSharedPreferences("tt_sdk_settings", 0);
                        if (!sharedPreferences.getAll().isEmpty()) {
                            fkw.ouw ouwVarOuw = ouw();
                            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (key != null && !key.isEmpty() && value != null) {
                                    ouwVarOuw.ouw(key, value.toString());
                                    z11 = true;
                                }
                            }
                            if (z11) {
                                ouwVarOuw.ouw();
                            }
                            sharedPreferences.edit().clear().commit();
                        }
                    } catch (Exception unused3) {
                    }
                }
            } else {
                this.f13065cf = true;
            }
            if (!this.fkw && (ouwVar = this.tlj) != null) {
                ouwVar.ouw();
            }
            this.fkw = true;
            this.f13068ra.countDown();
        }
    }

    public final fkw.ouw ouw() {
        return new vt();
    }

    public final <T> T ouw(String str, T t10, fkw.vt<T> vtVar) {
        T tOuw;
        if (str.isEmpty()) {
            return t10;
        }
        T t11 = (T) this.f13067lh.get(str);
        if (t11 != null) {
            return t11;
        }
        yu();
        String property = this.bly.getProperty(str, null);
        if (property == null || vtVar == null || (tOuw = vtVar.ouw(property)) == null) {
            return t10;
        }
        this.f13067lh.put(str, tOuw);
        return tOuw;
    }

    public static /* synthetic */ void ouw(tlj tljVar, Properties properties) {
        synchronized (tljVar.f13066le) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(tljVar.fkw());
                    try {
                        properties.store(fileOutputStreamFileOutputStreamCtor, (String) null);
                        mwh.ouw(fileOutputStreamFileOutputStreamCtor);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                        qbp.ouw("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            mwh.ouw(fileOutputStream);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                        if (fileOutputStream != null) {
                            mwh.ouw(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        cf.ouw();
    }
}

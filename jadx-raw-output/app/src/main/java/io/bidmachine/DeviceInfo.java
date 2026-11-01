package io.bidmachine;

import android.content.Context;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.bidmachine.core.Utils;
import io.bidmachine.util.DeviceUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceInfo {
    private static final String OS_NAME = "android";
    private static volatile DeviceInfo instance;

    @NonNull
    private final y3 cache;

    @NonNull
    private final b cpu;

    @NonNull
    private final c gpu;

    @Nullable
    private String hwv;

    @Nullable
    private Boolean isRooted;
    public final boolean isTablet;

    @Nullable
    public final String manufacturer;

    @Nullable
    public final String model;

    @NonNull
    public final String osName;

    @NonNull
    public final String osVersion;

    @Nullable
    public final String phoneCarrier;

    @Nullable
    public final String phoneMCCMNC;
    public final float screenDensity;
    public final int screenDpi;

    @Nullable
    private Long totalDiskSpaceInMB;

    @NonNull
    private final a audio = new a();

    @NonNull
    private final d ram = new d();

    public static final class a {
        @Nullable
        private AudioManager getAudioManager(@NonNull Context context) {
            return (AudioManager) context.getSystemService("audio");
        }

        @Nullable
        public Float getVolumeLevel(@NonNull Context context) {
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamMinVolume = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                streamMinVolume = audioManager.getStreamMinVolume(3);
            }
            int i10 = streamMaxVolume - streamMinVolume;
            if (i10 == 0) {
                return Float.valueOf(0.0f);
            }
            return Float.valueOf((streamVolume - streamMinVolume) / i10);
        }

        @Nullable
        public Boolean isRingMuted(@NonNull Context context) {
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int ringerMode = audioManager.getRingerMode();
            boolean z10 = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class b {

        @NonNull
        public static final String KEY_NAME = "cpu_name";

        @NonNull
        public static final String KEY_VENDOR = "cpu_vendor";

        @NonNull
        private final y3 cache;

        @Nullable
        private String name;

        @Nullable
        private String vendor;

        private void read() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile("/proc/cpuinfo", "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("model name:") || line.startsWith("Hardware:")) {
                                this.name = findValue(line);
                            } else if (line.startsWith("vendor_id:")) {
                                this.vendor = findValue(line);
                            }
                            if (this.name != null && this.vendor != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        Utils.close(randomAccessFile2);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.close(randomAccessFile);
                        throw th2;
                    }
                }
                Utils.close(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                randomAccessFile = null;
                th2 = th4;
            }
        }

        @Nullable
        private String findValue(String str) {
            Matcher matcher = Pattern.compile(":\\s*(.*)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        @Nullable
        public String getName() {
            return this.name;
        }

        @Nullable
        public String getVendor() {
            return this.vendor;
        }

        public void update(@NonNull Context context) throws Throwable {
            if (TextUtils.isEmpty(this.name)) {
                this.name = this.cache.read(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = this.cache.read(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                this.cache.store(context, KEY_NAME, this.name);
                this.cache.store(context, KEY_VENDOR, this.vendor);
            }
        }

        public b(@NonNull y3 y3Var) {
            this.cache = y3Var;
        }

        private void extract() throws Throwable {
            read();
            if (TextUtils.isEmpty(this.name)) {
                this.name = Build.BOARD;
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = Build.HARDWARE;
            }
        }
    }

    public static final class c {

        @NonNull
        public static final String KEY_NAME = "gpu_name";

        @NonNull
        public static final String KEY_VENDOR = "gpu_vendor";

        @NonNull
        private final y3 cache;

        @Nullable
        private String name;

        @Nullable
        private String vendor;

        private EGLConfig chooseEGLConfig(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0);
            if (iArr[0] == 0) {
                return null;
            }
            return eGLConfigArr[0];
        }

        private EGLSurface createEGLSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        }

        private void extract() throws Throwable {
            EGLContext eGLContext;
            EGLSurface eGLSurfaceCreateEGLSurface;
            EGLContext eGLContext2;
            EGLContext eGLContext3;
            EGLDisplay eGLDisplay = null;
            eGLContextCreateEGLContext = null;
            EGLContext eGLContextCreateEGLContext = null;
            EGLSurface eGLSurface = null;
            EGLDisplay eGLDisplay2 = null;
            try {
                EGLDisplay eGLDisplayInitEGLDisplay = initEGLDisplay();
                try {
                    EGLConfig eGLConfigChooseEGLConfig = chooseEGLConfig(eGLDisplayInitEGLDisplay);
                    if (eGLConfigChooseEGLConfig != null) {
                        eGLSurfaceCreateEGLSurface = createEGLSurface(eGLDisplayInitEGLDisplay, eGLConfigChooseEGLConfig);
                        try {
                            eGLContextCreateEGLContext = createEGLContext(eGLDisplayInitEGLDisplay, eGLConfigChooseEGLConfig);
                            makeCurrent(eGLDisplayInitEGLDisplay, eGLSurfaceCreateEGLSurface, eGLContextCreateEGLContext);
                            this.name = GLES20.glGetString(7937);
                            this.vendor = GLES20.glGetString(7936);
                            eGLContext3 = eGLContextCreateEGLContext;
                            eGLSurface = eGLSurfaceCreateEGLSurface;
                        } catch (Exception unused) {
                            eGLContext2 = eGLContextCreateEGLContext;
                            eGLDisplay2 = eGLDisplayInitEGLDisplay;
                            cleanUpEGL(eGLDisplay2, eGLSurfaceCreateEGLSurface, eGLContext2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            eGLContext = eGLContextCreateEGLContext;
                            eGLDisplay = eGLDisplayInitEGLDisplay;
                            cleanUpEGL(eGLDisplay, eGLSurfaceCreateEGLSurface, eGLContext);
                            throw th;
                        }
                    } else {
                        eGLContext3 = null;
                    }
                    cleanUpEGL(eGLDisplayInitEGLDisplay, eGLSurface, eGLContext3);
                } catch (Exception unused2) {
                    eGLSurfaceCreateEGLSurface = null;
                    eGLDisplay2 = eGLDisplayInitEGLDisplay;
                    eGLContext2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    eGLSurfaceCreateEGLSurface = null;
                    eGLDisplay = eGLDisplayInitEGLDisplay;
                    eGLContext = null;
                }
            } catch (Exception unused3) {
                eGLContext2 = null;
                eGLSurfaceCreateEGLSurface = null;
            } catch (Throwable th4) {
                th = th4;
                eGLContext = null;
                eGLSurfaceCreateEGLSurface = null;
            }
        }

        private EGLDisplay initEGLDisplay() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            return eGLDisplayEglGetDisplay;
        }

        private void cleanUpEGL(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface, @Nullable EGLContext eGLContext) {
            if (eGLDisplay != null) {
                makeCurrent(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                }
                EGL14.eglTerminate(eGLDisplay);
            }
        }

        private EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        }

        @Nullable
        public String getName() {
            return this.name;
        }

        @Nullable
        public String getVendor() {
            return this.vendor;
        }

        public void update(@NonNull Context context) throws Throwable {
            if (TextUtils.isEmpty(this.name)) {
                this.name = this.cache.read(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = this.cache.read(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                this.cache.store(context, KEY_NAME, this.name);
                this.cache.store(context, KEY_VENDOR, this.vendor);
            }
        }

        public c(@NonNull y3 y3Var) {
            this.cache = y3Var;
        }

        private void makeCurrent(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface, @Nullable EGLContext eGLContext) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
    }

    public static final class d {

        @Nullable
        private Long freeMem;

        @Nullable
        private Long totalMem;

        public void update() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("MemTotal:")) {
                                this.totalMem = parseValue(findValue(line));
                            } else if (line.startsWith("MemAvailable:")) {
                                this.freeMem = parseValue(findValue(line));
                            }
                            if (this.totalMem != null && this.freeMem != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        Utils.close(randomAccessFile2);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.close(randomAccessFile);
                        throw th2;
                    }
                }
                Utils.close(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                randomAccessFile = null;
                th2 = th4;
            }
        }

        @Nullable
        private String findValue(@Nullable String str) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        @Nullable
        private Long parseValue(@Nullable String str) {
            if (str != null) {
                try {
                    return Long.valueOf(Long.parseLong(str) * 1024);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        @Nullable
        public Long getFreeMemBytes() {
            return this.freeMem;
        }

        @Nullable
        public Long getTotalMemBytes() {
            return this.totalMem;
        }
    }

    @Nullable
    private String getKernelVersionThroughProcVersion() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String line = randomAccessFile.readLine();
                Utils.close(randomAccessFile);
                return line;
            } catch (Exception unused) {
                Utils.close(randomAccessFile);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                Utils.close(randomAccessFile);
                throw th2;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th4) {
            randomAccessFile = null;
            th2 = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    @Nullable
    private String getKernelVersionThroughUName() throws Throwable {
        InputStreamReader inputStreamReader;
        ?? bufferedReader;
        Throwable th2;
        Process processExec;
        try {
            processExec = Runtime.getRuntime().exec("uname -a");
            try {
                inputStreamReader = new InputStreamReader(processExec.getInputStream());
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        Utils.close(bufferedReader);
                        Utils.close(inputStreamReader);
                        processExec.destroy();
                        return line;
                    } catch (Exception unused) {
                        Utils.close(bufferedReader);
                        Utils.close(inputStreamReader);
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.close(bufferedReader);
                        Utils.close(inputStreamReader);
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        throw th2;
                    }
                } catch (Exception unused2) {
                    bufferedReader = 0;
                } catch (Throwable th4) {
                    bufferedReader = 0;
                    th2 = th4;
                }
            } catch (Exception unused3) {
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                Utils.close(bufferedReader);
                Utils.close(inputStreamReader);
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            } catch (Throwable th5) {
                bufferedReader = 0;
                th2 = th5;
                inputStreamReader = null;
            }
        } catch (Exception unused4) {
            processExec = null;
            inputStreamReader = null;
        } catch (Throwable th6) {
            inputStreamReader = null;
            bufferedReader = 0;
            th2 = th6;
            processExec = null;
        }
    }

    @Nullable
    public Long getAvailableDiskSpaceInMB() {
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static DeviceInfo obtain(@NonNull Context context) {
        DeviceInfo deviceInfo = instance;
        if (deviceInfo == null) {
            synchronized (DeviceInfo.class) {
                deviceInfo = instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context);
                    instance = deviceInfo;
                }
            }
        }
        return deviceInfo;
    }

    @NonNull
    public a getAudio() {
        return this.audio;
    }

    @NonNull
    public b getCpu() {
        return this.cpu;
    }

    @NonNull
    public c getGpu() {
        return this.gpu;
    }

    @Nullable
    public String getHWV() throws Throwable {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    @NonNull
    public d getRam() {
        return this.ram;
    }

    @Nullable
    public Long getTotalDiskSpaceInMB() {
        Long l10 = this.totalDiskSpaceInMB;
        if (l10 != null) {
            return l10;
        }
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            Long lValueOf = Long.valueOf((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            this.totalDiskSpaceInMB = lValueOf;
            return lValueOf;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isDeviceRooted() {
        Boolean bool = this.isRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10]).exists()) {
                    this.isRooted = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() == null) {
                z10 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.isRooted = boolValueOf;
            boolean zBooleanValue = boolValueOf.booleanValue();
            processExec.destroy();
            return zBooleanValue;
        } catch (Exception unused2) {
            if (processExec != null) {
                processExec.destroy();
            }
            this.isRooted = Boolean.FALSE;
            return false;
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
    }

    public void updateHwInfo(@NonNull Context context) throws Throwable {
        this.cpu.update(context);
        this.gpu.update(context);
        this.ram.update();
    }

    private DeviceInfo(@NonNull Context context) {
        y3 y3Var = new y3();
        this.cache = y3Var;
        this.cpu = new b(y3Var);
        this.gpu = new c(y3Var);
        this.osName = "android";
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.manufacturer = DeviceUtils.getManufacturer();
        this.model = DeviceUtils.getModel();
        this.screenDpi = io.bidmachine.utils.DeviceUtils.getScreenDpi(context);
        this.screenDensity = DeviceUtils.getScreenDensity(context);
        this.isTablet = DeviceUtils.isTablet(context);
        this.phoneMCCMNC = DeviceUtils.getPhoneMCCMNC(context);
        this.phoneCarrier = DeviceUtils.getPhoneOperatorName(context);
    }
}

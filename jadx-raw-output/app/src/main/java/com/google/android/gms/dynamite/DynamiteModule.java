package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.PathClassLoader;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzc = null;
    private static String zzd = null;
    private static boolean zze = false;
    private static int zzf = -1;
    private static Boolean zzg;
    private static zzp zzl;
    private static zzq zzm;
    private final Context zzk;
    private static final ThreadLocal zzh = new ThreadLocal();
    private static final ThreadLocal zzi = new zze();
    private static final VersionPolicy.IVersions zzj = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzk();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzl();

    @NonNull
    public static final VersionPolicy zza = new zzm();

    @NonNull
    public static final VersionPolicy zzb = new zzc();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, Throwable th2, byte[] bArr) {
            super(str, th2);
        }

        public /* synthetic */ LoadingException(String str, byte[] bArr) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str, boolean z10) throws LoadingException;

            int zzb(@NonNull Context context, @NonNull String str);
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    private static void zzf(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzm = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, bArr);
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzk;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f5 A[Catch: all -> 0x0368, TryCatch #6 {all -> 0x0368, blocks: (B:5:0x0045, B:9:0x00bc, B:14:0x00c4, B:17:0x00ca, B:30:0x00ec, B:103:0x0270, B:104:0x027b, B:115:0x0291, B:117:0x02b9, B:119:0x02c8, B:129:0x02ec, B:130:0x02f4, B:107:0x027f, B:109:0x0281, B:110:0x028b, B:131:0x02f5, B:132:0x0316, B:133:0x0317, B:134:0x0367), top: B:153:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x00ca A[Catch: all -> 0x0368, TRY_LEAVE, TryCatch #6 {all -> 0x0368, blocks: (B:5:0x0045, B:9:0x00bc, B:14:0x00c4, B:17:0x00ca, B:30:0x00ec, B:103:0x0270, B:104:0x027b, B:115:0x0291, B:117:0x02b9, B:119:0x02c8, B:129:0x02ec, B:130:0x02f4, B:107:0x027f, B:109:0x0281, B:110:0x028b, B:131:0x02f5, B:132:0x0316, B:133:0x0317, B:134:0x0367), top: B:153:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f5 A[Catch: all -> 0x026a, TryCatch #7 {, blocks: (B:32:0x00ef, B:34:0x00f5, B:35:0x00f7, B:96:0x0261, B:97:0x0269), top: B:154:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0101 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0138 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ac A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b8 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ef A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fe A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:82:0x020d A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0218 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0228 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:89:0x023d A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0246 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:92:0x024f A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0258 A[Catch: all -> 0x026d, LoadingException -> 0x027c, RemoteException -> 0x0280, TryCatch #8 {RemoteException -> 0x0280, LoadingException -> 0x027c, all -> 0x026d, blocks: (B:31:0x00ee, B:37:0x00fa, B:39:0x0101, B:40:0x0132, B:44:0x0138, B:46:0x0140, B:48:0x0144, B:49:0x014e, B:56:0x015b, B:58:0x0161, B:60:0x0188, B:62:0x0190, B:63:0x0197, B:64:0x019f, B:59:0x0175, B:67:0x01a2, B:68:0x01a3, B:69:0x01ab, B:70:0x01ac, B:71:0x01b4, B:74:0x01b7, B:75:0x01b8, B:77:0x01ef, B:79:0x01f6, B:81:0x01fe, B:87:0x0237, B:89:0x023d, B:90:0x0246, B:91:0x024e, B:82:0x020d, B:83:0x0215, B:85:0x0218, B:86:0x0228, B:92:0x024f, B:93:0x0257, B:94:0x0258, B:95:0x0260, B:100:0x026c), top: B:155:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0261 A[Catch: all -> 0x026a, TRY_ENTER, TryCatch #7 {, blocks: (B:32:0x00ef, B:34:0x00f5, B:35:0x00f7, B:96:0x0261, B:97:0x0269), top: B:154:0x00ef }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.dynamite.DynamiteModule$VersionPolicy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Class<com.google.android.gms.dynamite.DynamiteModule>] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.content.Context] */
    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        int i10;
        DynamiteModule dynamiteModuleZze;
        Cursor cursor;
        int i11;
        Boolean bool;
        zzp zzpVarZzg;
        int iZzi;
        IObjectWrapper iObjectWrapperZze;
        Object objUnwrap;
        zzn zznVar;
        zzq zzqVar;
        zzn zznVar2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze2;
        Cursor cursor2;
        ?? r10 = DynamiteModule.class;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzh;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzi;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzj);
            int i12 = selectionResultSelectModule.localVersion;
            int i13 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i12).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i13).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i12);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i13);
            Log.i("DynamiteModule", sb2.toString());
            int i14 = selectionResultSelectModule.selection;
            if (i14 != 0) {
                if (i14 != -1) {
                    if (i14 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i14 == -1) {
                            DynamiteModule dynamiteModuleZze2 = zze(applicationContext, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = zznVar4.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModuleZze2;
                        }
                        if (i14 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i14);
                            throw new LoadingException(sb3.toString(), null);
                        }
                        try {
                            try {
                                i11 = selectionResultSelectModule.remoteVersion;
                                try {
                                    synchronized (r10) {
                                        if (zzb(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzc;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i11);
                                        Log.i("DynamiteModule", sb4.toString());
                                        synchronized (r10) {
                                            zzqVar = zzm;
                                        }
                                        if (zzqVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null || zznVar2.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = zznVar2.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (r10) {
                                            boolValueOf = Boolean.valueOf(zzf >= 2);
                                        }
                                        if (boolValueOf.booleanValue()) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            iObjectWrapperZze2 = zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i11, ObjectWrapper.wrap(cursor3));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            iObjectWrapperZze2 = zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i11, ObjectWrapper.wrap(cursor3));
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze2);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModuleZze = new DynamiteModule(context2);
                                    } else {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                                        sb5.append("Selected remote version of ");
                                        sb5.append(str);
                                        sb5.append(", version >= ");
                                        sb5.append(i11);
                                        Log.i("DynamiteModule", sb5.toString());
                                        zzpVarZzg = zzg(context);
                                        if (zzpVarZzg != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        iZzi = zzpVarZzg.zzi();
                                        if (iZzi >= 3) {
                                            zznVar = (zzn) threadLocal.get();
                                            if (zznVar != null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapperZze = zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, i11, ObjectWrapper.wrap(zznVar.zza));
                                        } else if (iZzi == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            iObjectWrapperZze = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, i11);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            iObjectWrapperZze = zzpVarZzg.zze(ObjectWrapper.wrap(context), str, i11);
                                        }
                                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZze);
                                        if (objUnwrap != null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModuleZze = new DynamiteModule((Context) objUnwrap);
                                    }
                                    if (jLongValue == 0) {
                                        zzi.remove();
                                    } else {
                                        zzi.set(Long.valueOf(jLongValue));
                                    }
                                    cursor = zznVar4.zza;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    zzh.set(zznVar3);
                                    return dynamiteModuleZze;
                                } catch (RemoteException e10) {
                                    throw new LoadingException("Failed to load remote module.", e10, null);
                                } catch (LoadingException e11) {
                                    throw e11;
                                } catch (Throwable th2) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th2);
                                    throw new LoadingException("Failed to load remote module.", th2, null);
                                }
                            } catch (LoadingException e12) {
                                e = e12;
                                r10 = context;
                                String message = e.getMessage();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb6.append("Failed to load remote module: ");
                                sb6.append(message);
                                Log.w("DynamiteModule", sb6.toString());
                                i10 = selectionResultSelectModule.localVersion;
                                if (i10 != 0 || versionPolicy.selectModule(r10, str, new zzo(i10, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                                }
                                dynamiteModuleZze = zze(applicationContext, str);
                            }
                        } catch (LoadingException e13) {
                            e = e13;
                            String message2 = e.getMessage();
                            StringBuilder sb7 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb7.append("Failed to load remote module: ");
                            sb7.append(message2);
                            Log.w("DynamiteModule", sb7.toString());
                            i10 = selectionResultSelectModule.localVersion;
                            if (i10 != 0) {
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i14 = -1;
                    if (i14 == 1) {
                    }
                    if (i14 == -1) {
                        DynamiteModule dynamiteModuleZze3 = zze(applicationContext, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = zznVar4.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModuleZze3;
                    }
                    if (i14 == 1) {
                        StringBuilder sb8 = new StringBuilder(String.valueOf(i14).length() + 36);
                        sb8.append("VersionPolicy returned invalid code:");
                        sb8.append(i14);
                        throw new LoadingException(sb8.toString(), null);
                    }
                    i11 = selectionResultSelectModule.remoteVersion;
                    synchronized (r10) {
                        if (zzb(context)) {
                            throw new LoadingException("Remote loading disabled", null);
                        }
                        bool = zzc;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                            sb9.append("Selected remote version of ");
                            sb9.append(str);
                            sb9.append(", version >= ");
                            sb9.append(i11);
                            Log.i("DynamiteModule", sb9.toString());
                            synchronized (r10) {
                                zzqVar = zzm;
                                if (zzqVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                zznVar2 = (zzn) threadLocal.get();
                                if (zznVar2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                        sb10.append("Selected remote version of ");
                        sb10.append(str);
                        sb10.append(", version >= ");
                        sb10.append(i11);
                        Log.i("DynamiteModule", sb10.toString());
                        zzpVarZzg = zzg(context);
                        if (zzpVarZzg != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        iZzi = zzpVarZzg.zzi();
                        if (iZzi >= 3) {
                            zznVar = (zzn) threadLocal.get();
                            if (zznVar != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapperZze = zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, i11, ObjectWrapper.wrap(zznVar.zza));
                        } else if (iZzi == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZze = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, i11);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZze = zzpVarZzg.zze(ObjectWrapper.wrap(context), str, i11);
                        }
                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZze);
                        if (objUnwrap != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModuleZze = new DynamiteModule((Context) objUnwrap);
                        if (jLongValue == 0) {
                            zzi.remove();
                        } else {
                            zzi.set(Long.valueOf(jLongValue));
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzh.set(zznVar3);
                        return dynamiteModuleZze;
                    }
                }
            }
            int i15 = selectionResultSelectModule.localVersion;
            int i16 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i15).length() + 23 + String.valueOf(i16).length() + 1);
            sb11.append("No acceptable module ");
            sb11.append(str);
            sb11.append(" found. Local version is ");
            sb11.append(i15);
            sb11.append(" and remote version is ");
            sb11.append(i16);
            sb11.append(".");
            throw new LoadingException(sb11.toString(), null);
        } catch (Throwable th3) {
            if (jLongValue == 0) {
                zzi.remove();
            } else {
                zzi.set(Long.valueOf(jLongValue));
            }
            Cursor cursor4 = zznVar4.zza;
            if (cursor4 != null) {
                cursor4.close();
            }
            zzh.set(zznVar3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[Catch: all -> 0x00b6, TryCatch #9 {, blocks: (B:10:0x002a, B:12:0x0036, B:49:0x00b4, B:15:0x003c, B:17:0x0043, B:19:0x0049, B:22:0x004c, B:24:0x0050, B:28:0x005a, B:30:0x0062, B:33:0x0069, B:40:0x0093, B:41:0x009b, B:36:0x0070, B:38:0x0076, B:39:0x0085, B:44:0x009e, B:47:0x00a1, B:48:0x00ab, B:16:0x003f), top: B:135:0x002a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0179 A[Catch: all -> 0x01dd, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01dd, blocks: (B:4:0x0006, B:62:0x00e2, B:64:0x00e8, B:69:0x0111, B:91:0x016b, B:95:0x0179, B:116:0x01d6, B:117:0x01d9, B:111:0x01ce, B:67:0x00ee, B:120:0x01dc, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:60:0x00df, B:20:0x004a, B:42:0x009c, B:45:0x009f, B:53:0x00b8, B:61:0x00e1, B:59:0x00be), top: B:137:0x0006, inners: #6, #10 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z10) {
        Throwable th2;
        RemoteException e10;
        ?? r10;
        ?? r11;
        ?? r12;
        boolean zZzd;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzc;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzf(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzb(context)) {
                                    return 0;
                                }
                                if (zze) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iZzc = zzc(context, str, z10, true);
                                            String str2 = zzd;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        final String str3 = zzd;
                                                        Preconditions.checkNotNull(str3);
                                                        final ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                                                        classLoaderZza = new PathClassLoader(str3, systemClassLoader) { // from class: dalvik.system.DelegateLastClassLoader
                                                            static {
                                                                throw new NoClassDefFoundError();
                                                            }
                                                        };
                                                    } else {
                                                        String str4 = zzd;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new zzd(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                zzf(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzc = bool2;
                                                return iZzc;
                                            }
                                            return iZzc;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                            }
                            zzc = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String string = e11.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(string);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzc(context, str, z10, false);
                    } catch (LoadingException e12) {
                        String message = e12.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                ?? r13 = "Failed to retrieve remote module version: ";
                zzp zzpVarZzg = zzg(context);
                if (zzpVarZzg != null) {
                    try {
                        try {
                            int iZzi = zzpVarZzg.zzi();
                            if (iZzi >= 3) {
                                zzn zznVar = (zzn) zzh.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, z10, ((Long) zzi.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                if (i10 <= 0 || !(zZzd = zzd(cursor3))) {
                                                    r11 = r13;
                                                    r12 = zZzd;
                                                    r11 = zZzd;
                                                    r11 = r13;
                                                    cursor2 = cursor3;
                                                    r12 = r11;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i10;
                                                r13 = r12;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                r13 = r13;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                    r13 = r13;
                                                }
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            r10 = r13;
                                            String message2 = e10.getMessage();
                                            ?? sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb4.append(r10);
                                            sb4.append(message2);
                                            Log.w("DynamiteModule", sb4.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        r13 = r13;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                            r13 = r13;
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                    r13 = r13;
                                }
                            } else if (iZzi == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, z10);
                                r13 = r13;
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzpVarZzg.zzf(ObjectWrapper.wrap(context), str, z10);
                                r13 = r13;
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                            r10 = r13;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                return iZzf;
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    private static boolean zzb(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzg)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzg == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzg = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zze = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x017b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:380), block:B:100:0x017b */
    private static int zzc(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z12 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) zzi.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z13 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr4[i11] = null;
                                        } else if (type == 1) {
                                            objArr4[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr4[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr4[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzd = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zzf = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                            z12 = false;
                                        }
                                        zze = z12;
                                        z13 = z12;
                                    }
                                }
                                if (zzd(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new LoadingException(sb2.toString(), e, objArr == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th5) {
                th = th5;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th6) {
            th = th6;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private static boolean zzd(Cursor cursor) {
        zzn zznVar = (zzn) zzh.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzl;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzl = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzk.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzk = context;
    }

    private static DynamiteModule zze(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }
}

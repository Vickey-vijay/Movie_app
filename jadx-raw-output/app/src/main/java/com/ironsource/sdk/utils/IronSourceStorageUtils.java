package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.B7;
import com.ironsource.C3426d4;
import com.ironsource.C3676r4;
import com.ironsource.C3721tf;
import com.ironsource.C8;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceFilesBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceStorageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31213a = "supersonicads";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C3721tf f31214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f31215c;

    private static void a(Context context) {
        C3721tf c3721tf = f31214b;
        if (c3721tf != null && c3721tf.b()) {
            deleteCacheDirectories(context);
        }
        C3721tf c3721tf2 = f31214b;
        if (c3721tf2 == null || !c3721tf2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        B7 b7I = Lb.U().i();
        C3721tf c3721tf = f31214b;
        return (c3721tf == null || !c3721tf.d()) ? b7I.f(context) : b7I.l(context);
    }

    private static File c(Context context) {
        B7 b7I = Lb.U().i();
        C3721tf c3721tf = f31214b;
        return (c3721tf == null || !c3721tf.d()) ? b7I.j(context) : b7I.B(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objC = c(file2);
                    if (objC instanceof JSONArray) {
                        jSONObjectJsonObjectInit.put("files", c(file2));
                    } else if (objC instanceof JSONObject) {
                        jSONObjectJsonObjectInit.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static JSONObject buildFilesMapOfDirectory(C8 c10, JSONObject jSONObject) throws Exception {
        if (c10 == null || !c10.isDirectory()) {
            return IronSourceVideoBridge.jsonObjectInit();
        }
        File[] fileArrListFiles = c10.listFiles();
        if (fileArrListFiles == null) {
            return IronSourceVideoBridge.jsonObjectInit();
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (File file : fileArrListFiles) {
            C8 c11 = new C8(file.getPath());
            if (c11.isFile()) {
                String name = c11.getName();
                JSONObject jSONObjectA = c11.a();
                if (jSONObject.has(name)) {
                    jSONObjectJsonObjectInit.put(name, SDKUtils.mergeJSONObjects(jSONObjectA, jSONObject.getJSONObject(name)));
                } else {
                    jSONObjectJsonObjectInit.put(name, jSONObjectA);
                }
            } else if (c11.isDirectory()) {
                jSONObjectJsonObjectInit.put(c11.getName(), buildFilesMapOfDirectory(c11, jSONObject));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static synchronized boolean deleteFile(C8 c10) {
        if (!c10.exists()) {
            return false;
        }
        return c10.delete();
    }

    public static synchronized boolean deleteFolder(String str) {
        File file;
        file = new File(str);
        return deleteFolderContentRecursive(file) && file.delete();
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C3721tf c3721tf = f31214b;
        if (c3721tf == null || !c3721tf.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(C3426d4.c.f28456u + canonicalPath2);
        }
    }

    public static ArrayList<C8> getFilesInFolderRecursive(C8 c10) {
        if (c10 == null || !c10.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C8> arrayList = new ArrayList<>();
        File[] fileArrListFiles = c10.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C8 c11 = new C8(file.getPath());
                if (c11.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c11));
                }
                if (c11.isFile()) {
                    arrayList.add(c11);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileB = b(new File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(C8 c10) {
        long totalSizeOfDir;
        long j10 = 0;
        if (c10 != null && c10.isDirectory()) {
            File[] fileArrListFiles = c10.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                C8 c11 = new C8(file.getPath());
                if (c11.isFile()) {
                    totalSizeOfDir = c11.length();
                } else {
                    if (c11.isDirectory()) {
                        totalSizeOfDir = getTotalSizeOfDir(c11);
                    }
                }
                j10 += totalSizeOfDir;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(Context context, C3721tf c3721tf) {
        f31214b = c3721tf;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f31215c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C8 c10) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c10));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        FileOutputStream fileOutputStreamFileOutputStreamCtor = IronSourceFilesBridge.fileOutputStreamCtor(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int i11 = byteArrayInputStream.read(bArr2);
                if (i11 == -1) {
                    fileOutputStreamFileOutputStreamCtor.close();
                    byteArrayInputStream.close();
                    return i10;
                }
                fileOutputStreamFileOutputStreamCtor.write(bArr2, 0, i11);
                i10 += i11;
            }
        } catch (Throwable th2) {
            fileOutputStreamFileOutputStreamCtor.close();
            byteArrayInputStream.close();
            throw th2;
        }
    }

    public static void deleteCacheDirectories(Context context) {
        B7 b7I = Lb.U().i();
        a(b7I.l(context));
        a(b7I.B(context));
    }

    public static void deleteFilesDirectories(Context context) {
        B7 b7I = Lb.U().i();
        a(b7I.f(context));
        a(b7I.j(context));
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (a() && SDKUtils.isExternalStorageAvailable() && (fileB = b(context)) != null && fileB.canWrite()) {
            f31215c = true;
            return fileB.getPath();
        }
        return c(context).getPath();
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(f31213a);
        sb2.append(str);
        return new File(sb2.toString());
    }

    private static Object c(File file) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONArray jSONArray = new JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObjectJsonObjectInit.put(file2.getName(), c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObjectJsonObjectInit.put("files", jSONArray);
                }
            }
            return jSONObjectJsonObjectInit;
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static boolean a() {
        C3721tf c3721tf;
        return Build.VERSION.SDK_INT > 29 && (c3721tf = f31214b) != null && c3721tf.a();
    }
}

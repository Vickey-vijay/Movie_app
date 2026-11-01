package com.pgl.ssdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f43300a = 28800;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f43301b = 5;

    public static long a(long j10, InputStream inputStream) throws IOException {
        if (j10 != -1) {
            return j10;
        }
        long j11 = 0;
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j11;
            }
            j11 += (long) i10;
        }
    }

    public static void a(JSONObject jSONObject, String str, List<String> list, boolean z10) {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        if (z10) {
            try {
                jSONObject.put(str + "_size", list.size());
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put(str, n.a(list));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized void c() {
        try {
            if (d()) {
                String strC = v.c();
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                File file = new File(strC);
                if (file.exists()) {
                    JSONObject jSONObjectA = a(file, true);
                    jSONObjectA.put("apk_info", v.b());
                    jSONObjectA.put("app_name", ab.d(z.a()));
                    PglSSManager pglSSManager = PglSSManager.getInstance();
                    if (pglSSManager == null) {
                        au.a(String.valueOf(jSONObjectA));
                        return;
                    }
                    PglSSCallBack pglCallBack = pglSSManager.getPglCallBack();
                    if (pglCallBack != null) {
                        pglCallBack.reportSoftDecData("detailed_app_info", jSONObjectA.toString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean e() {
        boolean z10 = f43301b == 100;
        if (z10) {
            return z10;
        }
        return ((int) ((Math.random() * 100.0d) + 1.0d)) <= f43301b;
    }

    public static long b() {
        Context contextA = z.a();
        if (contextA == null) {
            return 0L;
        }
        long jA = ax.a(contextA, "pgl_frt", 0L);
        if (jA == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            ax.b(contextA, "pgl_frt", jCurrentTimeMillis);
            return jCurrentTimeMillis;
        }
        return jA;
    }

    private static boolean d() {
        int iA = ax.a(z.a(), "pgl_is_hit", 0);
        au.a("hitsTimes " + iA);
        if (iA > 0) {
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - b();
        au.a("runningTime ".concat(String.valueOf(jCurrentTimeMillis)));
        if (jCurrentTimeMillis < f43300a) {
            return false;
        }
        ax.b(z.a(), "pgl_is_hit", 1);
        return e();
    }

    private static JSONObject a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : list) {
            if (str.endsWith(".png")) {
                arrayList2.add(str.substring(0, str.lastIndexOf(".png")));
            } else if (str.endsWith(".xml")) {
                arrayList.add(str.substring(0, str.lastIndexOf(".xml")));
            } else {
                arrayList3.add(str);
            }
        }
        a(jSONObject, "xml", arrayList, true);
        a(jSONObject, "png", arrayList2, true);
        a(jSONObject, "other", arrayList3, true);
        return jSONObject;
    }

    public static JSONObject a() throws JSONException {
        String[] strArr;
        Context contextA = z.a();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (contextA == null) {
            return jSONObject;
        }
        ApplicationInfo applicationInfo = contextA.getApplicationInfo();
        String str = applicationInfo.nativeLibraryDir;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                    for (File file2 : fileArrListFiles) {
                        arrayList.add(file2.getName());
                    }
                }
                if ("arm64".equals(file.getName())) {
                    a(jSONObject2, "v8a", arrayList, false);
                } else {
                    a(jSONObject2, "v7a", arrayList, false);
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("lib", jSONObject2);
                }
            }
        }
        if (!arrayList.isEmpty() || (strArr = applicationInfo.splitPublicSourceDirs) == null) {
            return jSONObject;
        }
        for (String str2 : strArr) {
            if (str2.endsWith("armeabi-v7a.apk") || str2.endsWith("arm64_v8a.apk")) {
                File file3 = new File(str2);
                return file3.exists() ? a(file3, false) : jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01aa A[EXC_TOP_SPLITTER, PHI: r0 r8
  0x01aa: PHI (r0v2 org.json.JSONObject) = (r0v4 org.json.JSONObject), (r0v10 org.json.JSONObject), (r0v10 org.json.JSONObject), (r0v10 org.json.JSONObject) binds: [B:89:0x01a7, B:80:0x0190, B:82:0x0196, B:83:0x0198] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r8v1 java.util.zip.ZipFile) = (r8v2 java.util.zip.ZipFile), (r8v4 java.util.zip.ZipFile), (r8v4 java.util.zip.ZipFile), (r8v4 java.util.zip.ZipFile) binds: [B:89:0x01a7, B:80:0x0190, B:82:0x0196, B:83:0x0198] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static JSONObject a(File file, boolean z10) {
        JSONObject jSONObject;
        ZipFile zipFile;
        JSONObject jSONObjectA;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        JSONObject jSONObject4 = new JSONObject();
        try {
            zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement != null) {
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name) || !zipEntryNextElement.isDirectory()) {
                            String[] strArrSplit = name.split("/");
                            long size = zipEntryNextElement.getSize();
                            Enumeration<? extends ZipEntry> enumeration = enumerationEntries;
                            if (name.startsWith("res/drawable/")) {
                                jSONObject2 = jSONObject3;
                                if (name.length() > 13) {
                                    try {
                                        arrayList2.add(strArrSplit[2]);
                                    } catch (Throwable unused) {
                                        jSONObject = jSONObject2;
                                        jSONObjectA = jSONObject;
                                        if (zipFile != null) {
                                            zipFile.close();
                                        }
                                        return jSONObjectA;
                                    }
                                }
                                enumerationEntries = enumeration;
                                jSONObject3 = jSONObject2;
                            } else {
                                jSONObject2 = jSONObject3;
                            }
                            if (name.startsWith("res/") && strArrSplit.length == 2) {
                                arrayList3.add(strArrSplit[1]);
                            } else if (name.startsWith("assets/") && strArrSplit.length >= 2) {
                                arrayList.add(strArrSplit[1]);
                                if (name.startsWith("assets/assets/resources/native/") && strArrSplit.length >= 6 && jSONObject4.length() < 10) {
                                    if (!TextUtils.isEmpty(strArrSplit[4]) && !jSONObject4.has(strArrSplit[4])) {
                                        jSONObject4.put(strArrSplit[4], a(size, zipFile.getInputStream(zipEntryNextElement)));
                                    } else if (jSONObject4.has(strArrSplit[4])) {
                                        jSONObject4.put(strArrSplit[4], jSONObject4.getLong(strArrSplit[4]) + a(size, zipFile.getInputStream(zipEntryNextElement)));
                                    }
                                }
                            } else if (name.startsWith("lib/armeabi/") && name.length() > 12) {
                                arrayList4.add(strArrSplit[2]);
                            } else if (name.startsWith("lib/armeabi-v7a/") && name.length() > 16) {
                                arrayList5.add(strArrSplit[2]);
                            } else if (name.startsWith("lib/arm64-v8a/") && name.length() > 14) {
                                arrayList6.add(strArrSplit[2]);
                            }
                            enumerationEntries = enumeration;
                            jSONObject3 = jSONObject2;
                        }
                    }
                }
                jSONObject2 = jSONObject3;
                JSONObject jSONObject5 = new JSONObject();
                a(jSONObject5, "eabi", arrayList4, false);
                a(jSONObject5, "v7a", arrayList5, false);
                a(jSONObject5, "v8a", arrayList6, false);
                if (jSONObject5.length() > 0) {
                    jSONObject = jSONObject2;
                    try {
                        jSONObject.put("lib", jSONObject5);
                    } catch (Throwable unused2) {
                        jSONObjectA = jSONObject;
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return jSONObjectA;
                    }
                } else {
                    jSONObject = jSONObject2;
                }
                jSONObjectA = (!z10 || jSONObject5.length() > 0) ? jSONObject : a();
                try {
                    if (jSONObject4.length() > 0) {
                        jSONObjectA.put("cocos", jSONObject4);
                    }
                    a(jSONObjectA, "assets", arrayList, false);
                    JSONObject jSONObjectA2 = a(arrayList2);
                    if (jSONObjectA2 != null && jSONObjectA2.length() > 0) {
                        jSONObjectA.put("drawable", jSONObjectA2);
                    }
                    JSONObject jSONObjectA3 = a(arrayList3);
                    if (jSONObjectA3 != null && jSONObjectA3.length() > 0) {
                        jSONObjectA.put("res", jSONObjectA3);
                    }
                } catch (Throwable unused3) {
                    if (zipFile != null) {
                    }
                    return jSONObjectA;
                }
            } catch (Throwable unused4) {
                jSONObject = jSONObject3;
            }
        } catch (Throwable unused5) {
            jSONObject = jSONObject3;
            zipFile = null;
        }
        try {
            zipFile.close();
        } catch (IOException unused6) {
        }
        return jSONObjectA;
    }
}

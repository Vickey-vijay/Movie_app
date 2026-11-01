package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.C3784xa;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.pgl.ssdk.ces.out.DungeonFlag;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f43319a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f43320b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f43321c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f43322d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f43323e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f43324f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f43325g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f43326h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f43327i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile long f43328j = -1;

    public static void a(File file, boolean z10) throws Throwable {
        e eVarA;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                    try {
                        if (TextUtils.isEmpty(f43319a) && (eVarA = a(file)) != null) {
                            f43319a = a(eVarA.a());
                            f43322d = eVarA.b();
                            if (z10) {
                                a();
                                try {
                                    randomAccessFile2.close();
                                    return;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return;
                                }
                            }
                        }
                        if (TextUtils.isEmpty(f43323e)) {
                            f43323e = a(randomAccessFile2);
                        }
                        if (f43326h == 0) {
                            f43326h = randomAccessFile2.length() / 1024;
                        }
                        if (f43327i == 0) {
                            f43327i = b(file);
                        }
                        randomAccessFile2.close();
                    } catch (FileNotFoundException e11) {
                        e = e11;
                        randomAccessFile = randomAccessFile2;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (IOException e12) {
                        e = e12;
                        randomAccessFile = randomAccessFile2;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            } catch (FileNotFoundException e15) {
                e = e15;
            } catch (IOException e16) {
                e = e16;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String b() throws Throwable {
        String string;
        String string2;
        String string3;
        String string4;
        int i10;
        long j10;
        long j11;
        if (TextUtils.isEmpty(f43319a) || TextUtils.isEmpty(f43323e) || f43325g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            long j12 = -1;
            if (sharedPreferencesA != null) {
                j12 = sharedPreferencesA.getLong(Q6.f27414a1, -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j10 = sharedPreferencesA.getLong("as", 0L);
                j11 = sharedPreferencesA.getLong("ds", 0L);
                i10 = sharedPreferencesA.getInt("cpc", -1);
                string = sharedPreferencesA.getString(C3784xa.f31581c, null);
            } else {
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                i10 = 0;
                j10 = 0;
                j11 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strC);
            Integer num = (Integer) objArr[0];
            String str = (String) objArr[1];
            long jLastModified = file.lastModified();
            if (jLastModified != j12 || string2 == null || i10 == -1) {
                f43328j = jLastModified;
                if (str != null) {
                    f43324f = str;
                }
                if (num != null) {
                    f43325g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f43319a = string2;
                f43322d = string3;
                f43326h = j10;
                f43327i = j11;
                f43323e = string4;
                f43325g = i10;
                f43324f = string;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f43319a)) {
                jSONObject.put("sign", f43319a);
            }
            if (!TextUtils.isEmpty(f43322d)) {
                jSONObject.put("subject", f43322d);
            }
            if (!TextUtils.isEmpty(f43323e)) {
                jSONObject.put("md5", f43323e);
            }
            if (!TextUtils.isEmpty(f43324f)) {
                jSONObject.put("path", f43324f);
            }
            long j13 = f43326h;
            if (j13 != 0) {
                jSONObject.put("apkSize", j13);
            }
            long j14 = f43327i;
            if (j14 != 0) {
                jSONObject.put("dexSize", j14);
            }
            int i11 = f43325g;
            if (i11 != -1) {
                jSONObject.put("code", i11);
            }
            e();
            jSONObject.put("signpm", f43320b);
            if (!TextUtils.isEmpty(f43320b) && !TextUtils.isEmpty(f43319a)) {
                if (!f43320b.equals(f43319a)) {
                    f43321c = true;
                }
                jSONObject.put("rebud", f43321c);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f43319a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            String string = null;
            long j10 = -1;
            if (sharedPreferencesA != null) {
                j10 = sharedPreferencesA.getLong(Q6.f27414a1, -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j10 || string == null) {
                f43328j = jLastModified;
                a(file, true);
                a();
            } else {
                f43319a = string;
            }
        }
        e();
        if (TextUtils.isEmpty(f43320b) || TextUtils.isEmpty(f43319a) || f43320b.equals(f43319a)) {
            return;
        }
        f43321c = true;
    }

    public static String e() {
        if (!TextUtils.isEmpty(f43320b)) {
            return f43320b;
        }
        try {
            String strA = a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
            f43320b = strA;
            return strA;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static String c() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        return packageCodePath;
    }

    public static boolean f() throws Throwable {
        d();
        return f43321c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f43319a)) {
                sharedPreferencesA.edit().putString("sa", f43319a).apply();
            }
            if (!TextUtils.isEmpty(f43323e)) {
                sharedPreferencesA.edit().putString("md5", f43323e).apply();
            }
            if (!TextUtils.isEmpty(f43322d)) {
                sharedPreferencesA.edit().putString("sj", f43322d).apply();
            }
            if (f43326h != 0) {
                sharedPreferencesA.edit().putLong("as", f43326h).apply();
            }
            if (f43327i != 0) {
                sharedPreferencesA.edit().putLong("ds", f43327i).apply();
            }
            if (f43328j != -1) {
                sharedPreferencesA.edit().putLong(Q6.f27414a1, f43328j).apply();
            }
            if (f43325g != -1) {
                sharedPreferencesA.edit().putInt("cpc", f43325g).apply();
            }
            if (TextUtils.isEmpty(f43324f)) {
                return;
            }
            sharedPreferencesA.edit().putString(C3784xa.f31581c, f43324f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @DungeonFlag
    private static e a(File file) throws Throwable {
        Throwable th2;
        RandomAccessFile randomAccessFile;
        List<e> listA;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    q qVarA = r.a(randomAccessFile, 0L, randomAccessFile.length());
                    listA = l.a(qVarA, c.a(qVarA));
                    try {
                        randomAccessFile.close();
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                } catch (g.a unused) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        th2.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        listA = null;
                    } catch (Throwable th4) {
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th4;
                    }
                }
            } catch (IOException e12) {
                e = e12;
                listA = null;
            }
        } catch (g.a unused2) {
            randomAccessFile = null;
        } catch (Throwable th5) {
            th2 = th5;
            randomAccessFile = null;
        }
        if (listA == null || listA.isEmpty()) {
            listA = k.a(file);
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    int i10 = 0;
                    int size = 0;
                    while (true) {
                        if (i10 == 0) {
                            str = "classes.dex";
                        } else {
                            str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                        }
                        try {
                            ZipEntry entry = zipFile2.getEntry(str);
                            if (entry == null) {
                                break;
                            }
                            size = (int) (((long) size) + entry.getSize());
                            i10++;
                        } catch (ZipException e10) {
                            e = e10;
                            zipFile = zipFile2;
                            e.printStackTrace();
                            if (zipFile == null) {
                                return 0L;
                            }
                            zipFile.close();
                            return 0L;
                        } catch (IOException e11) {
                            e = e11;
                            zipFile = zipFile2;
                            e.printStackTrace();
                            if (zipFile == null) {
                                return 0L;
                            }
                            zipFile.close();
                            return 0L;
                        } catch (Throwable th2) {
                            th = th2;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    long j10 = size / 1000;
                    try {
                        zipFile2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    return j10;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (ZipException e14) {
                e = e14;
            } catch (IOException e15) {
                e = e15;
            }
        } catch (IOException e16) {
            e16.printStackTrace();
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[1048576];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            return string;
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return "";
        } catch (IOException e11) {
            e11.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e12) {
            e12.printStackTrace();
            return "";
        }
    }
}

package sg.bigo.ads.common.aa;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f69465a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f69466b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f69467c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f69468d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.aa.a$a, reason: collision with other inner class name */
    public final class C0699a implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i10 = 3; i10 < name.length(); i10++) {
                if (!Character.isDigit(name.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int a() {
        if (f69465a) {
            return f69467c;
        }
        int iA = sg.bigo.ads.common.x.a.a();
        f69467c = iA;
        if (iA != 0) {
            f69465a = true;
            return iA;
        }
        try {
            f69467c = new File("/sys/devices/system/cpu/").listFiles(new C0699a()).length;
        } catch (Throwable unused) {
        }
        if (f69467c <= 1) {
            f69467c = Runtime.getRuntime().availableProcessors();
        }
        f69465a = true;
        sg.bigo.ads.common.x.a.a(f69467c);
        return f69467c;
    }

    public static long b() {
        if (f69466b) {
            long j10 = f69468d;
            if (j10 != 0) {
                return j10;
            }
        }
        long jB = sg.bigo.ads.common.x.a.b();
        f69468d = jB;
        if (jB != 0) {
            f69466b = true;
            return jB;
        }
        int i10 = -1;
        int iIntValue = -1;
        for (int i11 = 0; i11 < a(); i11++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i12 = 0;
                        while (Character.isDigit(bArr[i12]) && i12 < 128) {
                            i12++;
                        }
                        Integer numValueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i12)));
                        if (numValueOf.intValue() > iIntValue) {
                            iIntValue = numValueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                    fileInputStream.close();
                }
            } catch (Exception unused2) {
            }
        }
        if (iIntValue == -1) {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
                    if ("cpu MHz".equals(strArrSplit[0].replaceAll("[\\t\\n\\r]", ""))) {
                        int i13 = (strArrSplit[1].contains(".") ? (int) Double.parseDouble(strArrSplit[1]) : Integer.parseInt(strArrSplit[1])) * 1000;
                        if (i13 > iIntValue) {
                            iIntValue = i13;
                        }
                    }
                } catch (Exception unused3) {
                } catch (Throwable th3) {
                    fileReader.close();
                    bufferedReader.close();
                    throw th3;
                }
            }
            fileReader.close();
            bufferedReader.close();
        }
        i10 = iIntValue;
        f69466b = true;
        long j11 = i10 / 1000;
        f69468d = j11;
        sg.bigo.ads.common.x.a.a(j11);
        return f69468d;
    }
}

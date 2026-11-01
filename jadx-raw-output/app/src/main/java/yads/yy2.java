package yads;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class yy2 extends zr {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f85150h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f85151i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f85152j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r3
  0x009f: PHI (r3v11 java.util.regex.Matcher) = (r3v5 java.util.regex.Matcher), (r3v3 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    public static yy2 a(File file, long j10, long j11, ls lsVar) {
        File file2;
        long j12;
        String strGroup;
        File file3;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f85151i.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                int i10 = ib3.f78556a;
                int length = strGroup.length();
                int iEnd = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (strGroup.charAt(i12) == '%') {
                        i11++;
                    }
                }
                if (i11 != 0) {
                    int i13 = length - (i11 * 2);
                    StringBuilder sb2 = new StringBuilder(i13);
                    Matcher matcher2 = ib3.f78564i.matcher(strGroup);
                    while (i11 > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c10 = (char) Integer.parseInt(strGroup2, 16);
                        sb2.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb2.append(c10);
                        iEnd = matcher2.end();
                        i11--;
                    }
                    if (iEnd < length) {
                        sb2.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb2.length() != i13) {
                        strGroup = null;
                    } else {
                        strGroup = sb2.toString();
                    }
                }
            } else {
                matcher = f85150h.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    throw new IllegalStateException();
                }
                int i14 = lsVar.a(strGroup).f78339a;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j13 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                file3 = new File(parentFile, i14 + "." + j13 + "." + Long.parseLong(strGroup4) + ".v3.exo");
                if (!file.renameTo(file3)) {
                    file3 = null;
                }
            } else {
                file3 = null;
            }
            if (file3 == null) {
                return null;
            }
            name = file3.getName();
            file2 = file3;
        }
        Matcher matcher3 = f85152j.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String strGroup5 = matcher3.group(1);
        strGroup5.getClass();
        String str = (String) lsVar.f79895b.get(Integer.parseInt(strGroup5));
        if (str == null) {
            return null;
        }
        long length2 = j10 == -1 ? file2.length() : j10;
        if (length2 == 0) {
            return null;
        }
        String strGroup6 = matcher3.group(2);
        strGroup6.getClass();
        long j14 = Long.parseLong(strGroup6);
        if (j11 == -9223372036854775807L) {
            String strGroup7 = matcher3.group(3);
            strGroup7.getClass();
            j12 = Long.parseLong(strGroup7);
        } else {
            j12 = j11;
        }
        return new yy2(str, j14, length2, j12, file2);
    }

    public yy2(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }
}

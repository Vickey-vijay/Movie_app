package h8;

import android.content.Context;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.mbridge.msdk.foundation.tools.SameMD5;
import f8.v;
import java.io.File;
import java.io.FileFilter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import o8.j;
import o8.l;
import o8.o;
import o8.s;

/* JADX INFO: compiled from: SandboxFileLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: compiled from: SandboxFileLoader.java */
    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isDirectory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153 A[PHI: r17
  0x0153: PHI (r17v4 java.io.File[]) = (r17v3 java.io.File[]), (r17v3 java.io.File[]), (r17v3 java.io.File[]), (r17v5 java.io.File[]) binds: [B:76:0x0164, B:73:0x015d, B:68:0x0151, B:81:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    public static ArrayList<LocalMedia> a(Context context, String str) {
        MessageDigest messageDigest;
        long jLastModified;
        int i10;
        int i11;
        int iC;
        int iB;
        long j10;
        int iC2;
        int iB2;
        long jA;
        File[] fileArr;
        int i12;
        int i13;
        ArrayList<LocalMedia> arrayList;
        LocalMedia localMediaC;
        v vVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<LocalMedia> arrayList2 = new ArrayList<>();
        File file = new File(str);
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new a());
            if (fileArrListFiles == null) {
                return arrayList2;
            }
            PictureSelectionConfig pictureSelectionConfigE = PictureSelectionConfig.e();
            try {
                messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
                messageDigest = null;
            }
            int length = fileArrListFiles.length;
            int i14 = 0;
            while (i14 < length) {
                File file2 = fileArrListFiles[i14];
                String strI = j.i(file2.getAbsolutePath());
                if (pictureSelectionConfigE.f32200b != a8.e.c() ? pictureSelectionConfigE.f32200b != a8.e.d() ? pictureSelectionConfigE.f32200b != a8.e.b() || a8.d.d(strI) : a8.d.i(strI) : a8.d.h(strI)) {
                    List<String> list = pictureSelectionConfigE.R;
                    if ((list == null || list.size() <= 0 || pictureSelectionConfigE.R.contains(strI)) && (pictureSelectionConfigE.F || !a8.d.f(strI))) {
                        String absolutePath = file2.getAbsolutePath();
                        long length2 = file2.length();
                        if (length2 <= 0) {
                            messageDigest = messageDigest;
                            arrayList = arrayList2;
                            fileArr = fileArrListFiles;
                            i10 = length;
                            i11 = i14;
                        } else {
                            if (messageDigest != null) {
                                messageDigest.update(absolutePath.getBytes());
                                jLastModified = new BigInteger(1, messageDigest.digest()).longValue();
                            } else {
                                jLastModified = file2.lastModified() / 1000;
                            }
                            i10 = length;
                            i11 = i14;
                            long jE = s.e(Integer.valueOf(file.getName().hashCode()));
                            ArrayList<LocalMedia> arrayList3 = arrayList2;
                            long jLastModified2 = file2.lastModified() / 1000;
                            if (a8.d.i(strI)) {
                                d8.b bVarL = j.l(context, absolutePath);
                                iC2 = bVarL.c();
                                iB2 = bVarL.b();
                                jA = bVarL.a();
                            } else {
                                if (a8.d.d(strI)) {
                                    d8.b bVarD = j.d(context, absolutePath);
                                    iC2 = bVarD.c();
                                    iB2 = bVarD.b();
                                    jA = bVarD.a();
                                } else {
                                    d8.b bVarF = j.f(context, absolutePath);
                                    iC = bVarF.c();
                                    iB = bVarF.b();
                                    j10 = 0;
                                }
                                if (!a8.d.i(strI) || a8.d.d(strI)) {
                                    fileArr = fileArrListFiles;
                                    i12 = pictureSelectionConfigE.f32234s;
                                    if ((i12 <= 0 && j10 < i12) || (((i13 = pictureSelectionConfigE.f32232r) > 0 && j10 > i13) || j10 == 0)) {
                                        arrayList = arrayList3;
                                    }
                                } else {
                                    fileArr = fileArrListFiles;
                                }
                                localMediaC = LocalMedia.c();
                                localMediaC.i0(jLastModified);
                                localMediaC.p0(absolutePath);
                                localMediaC.r0(absolutePath);
                                localMediaC.f0(file2.getName());
                                localMediaC.o0(file.getName());
                                localMediaC.d0(j10);
                                localMediaC.R(pictureSelectionConfigE.f32200b);
                                localMediaC.k0(strI);
                                localMediaC.w0(iC);
                                localMediaC.h0(iB);
                                localMediaC.t0(length2);
                                localMediaC.P(jE);
                                localMediaC.c0(jLastModified2);
                                vVar = PictureSelectionConfig.f32189h1;
                                if (vVar == null && vVar.a(localMediaC)) {
                                    arrayList = arrayList3;
                                } else {
                                    if (!l.e()) {
                                        absolutePath = null;
                                    }
                                    localMediaC.s0(absolutePath);
                                    arrayList = arrayList3;
                                    arrayList.add(localMediaC);
                                }
                            }
                            iC = iC2;
                            iB = iB2;
                            j10 = jA;
                            if (a8.d.i(strI)) {
                                fileArr = fileArrListFiles;
                                i12 = pictureSelectionConfigE.f32234s;
                                if (i12 <= 0) {
                                    localMediaC = LocalMedia.c();
                                    localMediaC.i0(jLastModified);
                                    localMediaC.p0(absolutePath);
                                    localMediaC.r0(absolutePath);
                                    localMediaC.f0(file2.getName());
                                    localMediaC.o0(file.getName());
                                    localMediaC.d0(j10);
                                    localMediaC.R(pictureSelectionConfigE.f32200b);
                                    localMediaC.k0(strI);
                                    localMediaC.w0(iC);
                                    localMediaC.h0(iB);
                                    localMediaC.t0(length2);
                                    localMediaC.P(jE);
                                    localMediaC.c0(jLastModified2);
                                    vVar = PictureSelectionConfig.f32189h1;
                                    if (vVar == null) {
                                    }
                                    if (!l.e()) {
                                        absolutePath = null;
                                    }
                                    localMediaC.s0(absolutePath);
                                    arrayList = arrayList3;
                                    arrayList.add(localMediaC);
                                } else {
                                    localMediaC = LocalMedia.c();
                                    localMediaC.i0(jLastModified);
                                    localMediaC.p0(absolutePath);
                                    localMediaC.r0(absolutePath);
                                    localMediaC.f0(file2.getName());
                                    localMediaC.o0(file.getName());
                                    localMediaC.d0(j10);
                                    localMediaC.R(pictureSelectionConfigE.f32200b);
                                    localMediaC.k0(strI);
                                    localMediaC.w0(iC);
                                    localMediaC.h0(iB);
                                    localMediaC.t0(length2);
                                    localMediaC.P(jE);
                                    localMediaC.c0(jLastModified2);
                                    vVar = PictureSelectionConfig.f32189h1;
                                    if (vVar == null) {
                                    }
                                    if (!l.e()) {
                                        absolutePath = null;
                                    }
                                    localMediaC.s0(absolutePath);
                                    arrayList = arrayList3;
                                    arrayList.add(localMediaC);
                                }
                            } else {
                                fileArr = fileArrListFiles;
                                i12 = pictureSelectionConfigE.f32234s;
                                if (i12 <= 0) {
                                    localMediaC = LocalMedia.c();
                                    localMediaC.i0(jLastModified);
                                    localMediaC.p0(absolutePath);
                                    localMediaC.r0(absolutePath);
                                    localMediaC.f0(file2.getName());
                                    localMediaC.o0(file.getName());
                                    localMediaC.d0(j10);
                                    localMediaC.R(pictureSelectionConfigE.f32200b);
                                    localMediaC.k0(strI);
                                    localMediaC.w0(iC);
                                    localMediaC.h0(iB);
                                    localMediaC.t0(length2);
                                    localMediaC.P(jE);
                                    localMediaC.c0(jLastModified2);
                                    vVar = PictureSelectionConfig.f32189h1;
                                    if (vVar == null) {
                                    }
                                    if (!l.e()) {
                                        absolutePath = null;
                                    }
                                    localMediaC.s0(absolutePath);
                                    arrayList = arrayList3;
                                    arrayList.add(localMediaC);
                                } else {
                                    localMediaC = LocalMedia.c();
                                    localMediaC.i0(jLastModified);
                                    localMediaC.p0(absolutePath);
                                    localMediaC.r0(absolutePath);
                                    localMediaC.f0(file2.getName());
                                    localMediaC.o0(file.getName());
                                    localMediaC.d0(j10);
                                    localMediaC.R(pictureSelectionConfigE.f32200b);
                                    localMediaC.k0(strI);
                                    localMediaC.w0(iC);
                                    localMediaC.h0(iB);
                                    localMediaC.t0(length2);
                                    localMediaC.P(jE);
                                    localMediaC.c0(jLastModified2);
                                    vVar = PictureSelectionConfig.f32189h1;
                                    if (vVar == null) {
                                    }
                                    if (!l.e()) {
                                        absolutePath = null;
                                    }
                                    localMediaC.s0(absolutePath);
                                    arrayList = arrayList3;
                                    arrayList.add(localMediaC);
                                }
                            }
                            arrayList = arrayList3;
                        }
                    } else {
                        messageDigest = messageDigest;
                        arrayList = arrayList2;
                        fileArr = fileArrListFiles;
                        i10 = length;
                        i11 = i14;
                    }
                } else {
                    messageDigest = messageDigest;
                    arrayList = arrayList2;
                    fileArr = fileArrListFiles;
                    i10 = length;
                    i11 = i14;
                }
                i14 = i11 + 1;
                length = i10;
                arrayList2 = arrayList;
                messageDigest = messageDigest;
                fileArrListFiles = fileArr;
            }
        }
        return arrayList2;
    }

    public static LocalMediaFolder b(Context context, String str) {
        ArrayList<LocalMedia> arrayListA = a(context, str);
        if (arrayListA != null && arrayListA.size() > 0) {
            o.f(arrayListA);
            LocalMedia localMedia = arrayListA.get(0);
            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
            localMediaFolder.q(localMedia.v());
            localMediaFolder.o(localMedia.w());
            localMediaFolder.p(localMedia.s());
            localMediaFolder.l(localMedia.g());
            localMediaFolder.r(arrayListA.size());
            localMediaFolder.n(arrayListA);
            return localMediaFolder;
        }
        return null;
    }
}

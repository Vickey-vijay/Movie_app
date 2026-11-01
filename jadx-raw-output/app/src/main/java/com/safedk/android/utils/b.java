package com.safedk.android.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<String> f44899a = Arrays.asList(k.f45011d, "java.util.List", "java.util.ArrayList", "java.util.Map", "java.util.HashMap", "org.json.JSONObject", "com.five_corp.ad.internal.cache", "com.five_corp.ad.internal.context", ImpressionLog.f43647w, "long");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44900b = "DebugUtils";

    /* JADX WARN: Code duplicated, block: B:20:0x0185 A[PHI: r3
  0x0185: PHI (r3v29 java.lang.String) = (r3v28 java.lang.String), (r3v34 java.lang.String) binds: [B:9:0x0112, B:11:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(String str, String str2, ViewGroup viewGroup, String str3) {
        String str4;
        try {
            int childCount = viewGroup.getChildCount();
            int length = (childCount + "").length();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                float z10 = 0.0f;
                if (Build.VERSION.SDK_INT >= 21) {
                    z10 = childAt.getZ();
                }
                String str5 = str3 + String.format(str2 + Z7.f27998r + ("|— %0" + length + "d/%0" + length + "d %s"), Integer.valueOf(i10 + 1), Integer.valueOf(childCount), "type : " + childAt.getClass().getName() + ", viewId :" + Integer.toHexString(childAt.getId()) + ", address : " + BrandSafetyUtils.a(childAt) + ", top/left/width/height : " + childAt.getTop() + StringUtils.COMMA + childAt.getLeft() + StringUtils.COMMA + childAt.getWidth() + StringUtils.COMMA + childAt.getHeight() + ",z-order : " + z10);
                if (childAt instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) childAt;
                    str5 = str5 + ", surfaceView Holder : " + surfaceView.getHolder();
                    if (surfaceView.getHolder() != null) {
                        str4 = str5 + ", surfaceView Holder Surface object : " + surfaceView.getHolder().getSurface();
                    } else {
                        str4 = str5;
                    }
                } else {
                    str4 = str5;
                }
                Logger.d(str, str4);
                if (childAt instanceof ViewGroup) {
                    a(str, str2, (ViewGroup) childAt, str3 + "  ");
                }
            }
        } catch (Throwable th2) {
            Logger.e(f44900b, "Exception in printViewHierarchy", th2);
        }
    }

    private static void a(View view, String str, String str2) {
        try {
            Logger.d(str, str2 + " getViewDetails started, View type is " + view.getClass().getName() + ", Id=" + Integer.toHexString(view.getId()));
            if (view.getParent() != null) {
                if (view.getParent() instanceof View) {
                    a((View) view.getParent(), str, str2);
                } else {
                    Log.d(str, str2 + " getViewDetails parent is ViewParent, view : " + view.getId() + ", View type is " + view.getClass().getName());
                }
            }
        } catch (Throwable th2) {
            Logger.e(str, str2 + " Exception in getViewDetails", th2);
        }
    }

    private static void a(Context context, String str) {
        File file = new File(context.getFilesDir() + "/" + str);
        if (file.exists()) {
            a(file);
        } else {
            Logger.d(f44900b, "listFiles directory does not exist : " + file);
        }
    }

    private static void a(Context context) {
        Logger.d(f44900b, "listFilesInFilesDir started, dir : " + context.getFilesDir().getPath());
        a(context.getFilesDir());
    }

    private static void b(Context context) {
        a(context.getCacheDir());
    }

    private static void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                Logger.d(f44900b, "listFilesInDir file " + a(file.length()) + Z7.f27998r + file.getPath());
                return;
            }
            if (file.isDirectory()) {
                Logger.d(f44900b, "listFilesInDir dir  " + file.getPath());
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
        }
    }

    private static String a(long j10) {
        if (j10 <= 0) {
            return "0 Bytes";
        }
        String[] strArr = {"Bt", "kB", "MB", "GB", "TB"};
        int iLog10 = (int) (Math.log10(j10) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(j10 / Math.pow(1024.0d, iLog10)) + Z7.f27998r + strArr[iLog10];
    }

    private static void a(String str, String str2, Object obj, int i10, int i11) {
        if (obj != null) {
            try {
                if (obj.getClass() != null) {
                    if (i10 > i11) {
                        Log.d(str, str2 + " reflectRecursively cannot go beyond level " + i11 + " current level is " + i10);
                        return;
                    }
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        String string = null;
                        if (c(field.getType().getName())) {
                            string = obj2 != null ? obj2.toString() : "null";
                        }
                        String strReplace = new String(new char[i10 * 2]).replace("\u0000", "-");
                        if (f44899a.contains(field.getType().getName())) {
                            Logger.d(str, str2 + " reflectRecursively level " + i10 + strReplace + ", name : " + field.getName() + ", type : " + field.getType().getName() + ", value : " + string);
                        } else {
                            Logger.d(str, str2 + " reflectRecursively level " + i10 + strReplace + ", name : " + field.getName() + ", type : " + field.getType().getName());
                        }
                        if (!field.getType().isPrimitive() && obj2 != null) {
                            a(str, str2, obj2, i10 + 1, i11);
                        }
                    }
                }
            } catch (Throwable th2) {
                Logger.e(str, str2 + " reflectRecursively Exception, stopping", th2);
            }
        }
    }

    private static boolean c(String str) {
        Iterator<String> it = f44899a.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().startsWith(it.next().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, String str2) {
        String str3 = Environment.getExternalStorageDirectory() + File.separator + (str2 != null ? str2 + File.separator : "");
        String[] strArrSplit = str.split("/");
        String str4 = str3 + strArrSplit[strArrSplit.length - 1];
        Logger.d(f44900b, "copyFileToExternalStorage target = " + str4);
        Logger.d(f44900b, "copyFileToExternalStorage result = " + b(str, str4));
    }

    private static boolean b(String str, String str2) {
        int i10;
        try {
            if (new File(str).exists()) {
                FileInputStream fileInputStream = new FileInputStream(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                byte[] bArr = new byte[1444];
                i10 = 0;
                while (true) {
                    int i11 = fileInputStream.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    i10 += i11;
                    fileOutputStream.write(bArr, 0, i11);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                i10 = 0;
            }
            if (new File(str2).exists()) {
                Logger.d(f44900b, "copyFile finished creating file " + str2 + ", " + i10 + " bytes written");
            } else {
                Logger.d(f44900b, "copyFile failed to create file " + str2);
            }
            return true;
        } catch (Throwable th2) {
            Logger.d(f44900b, "Exception in copyFile : " + th2.getMessage(), th2);
            return false;
        }
    }

    public static List<String> a(String str) {
        File[] fileArrListFiles = new File(str).listFiles(new FileFilter() { // from class: com.safedk.android.utils.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<String> f44901a = Arrays.asList("jpeg", "jpg", "png", "bmp", "gif");

            @Override // java.io.FileFilter
            public boolean accept(File pathname) {
                String path = pathname.getPath();
                return this.f44901a.contains(path.substring(path.lastIndexOf(".") + 1));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                arrayList.add(file.getName());
            }
        }
        return arrayList;
    }

    private static void a(File file, File file2) throws IOException {
        FileChannel channel;
        FileChannel channel2;
        try {
            channel = new FileInputStream(file).getChannel();
            try {
                channel2 = new FileOutputStream(file2).getChannel();
            } catch (FileNotFoundException e10) {
                e = e10;
                Logger.d(f44900b, "Exception copying file :" + e.getMessage(), e);
                channel2 = null;
            }
        } catch (FileNotFoundException e11) {
            e = e11;
            channel = null;
        }
        try {
            channel.transferTo(0L, channel.size(), channel2);
        } catch (Throwable th2) {
            Logger.d(f44900b, "Exception copying file :" + th2.getMessage(), th2);
        } finally {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        }
    }

    public static String b(String str) {
        SafeDK.getInstance().l();
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (FileNotFoundException e10) {
            Logger.e(f44900b, "Exception reading file " + str, e10);
        } catch (IOException e11) {
            Logger.e(f44900b, "Exception reading file " + str, e11);
        }
        return sb2.toString();
    }
}

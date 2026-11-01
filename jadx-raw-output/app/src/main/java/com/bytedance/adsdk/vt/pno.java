package com.bytedance.adsdk.vt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.SparseArray;
import androidx.multidex.MultiDexExtractor;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class pno {
    private static final Map<String, jg<ra>> ouw = new HashMap();
    private static final Set<Object> vt = new HashSet();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final byte[] f11311lh = {80, 75, 3, 4};

    public static mwh<ra> lh(Context context, String str) {
        return lh(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static jg<ra> ouw(Context context, String str) {
        return ouw(context, str, "url_".concat(String.valueOf(str)));
    }

    public static jg<ra> vt(Context context, String str) {
        return vt(context, str, "asset_".concat(String.valueOf(str)));
    }

    private static String yu(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append(ouw(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static mwh<ra> lh(Context context, String str, String str2) {
        try {
            if (!str.endsWith(MultiDexExtractor.EXTRACTED_SUFFIX) && !str.endsWith(".lottie")) {
                return lh(context.getAssets().open(str), str2);
            }
            return ouw(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new mwh<>((Throwable) e10);
        }
    }

    public static jg<ra> ouw(final Context context, final String str, final String str2) {
        return ouw(str2, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                mwh<ra> mwhVarOuw;
                com.bytedance.adsdk.vt.yu.ra raVar;
                Pair<com.bytedance.adsdk.vt.yu.lh, InputStream> pairOuw;
                com.bytedance.adsdk.vt.yu.pno pnoVarOuw = fkw.ouw(context);
                Context context2 = context;
                String str3 = str;
                String str4 = str2;
                ra raVar2 = null;
                if (str4 != null && (raVar = pnoVarOuw.ouw) != null && (pairOuw = raVar.ouw(str3)) != null) {
                    com.bytedance.adsdk.vt.yu.lh lhVar = (com.bytedance.adsdk.vt.yu.lh) pairOuw.first;
                    InputStream inputStream = (InputStream) pairOuw.second;
                    ra raVar3 = (lhVar == com.bytedance.adsdk.vt.yu.lh.ZIP ? pno.ouw(context2, new ZipInputStream(inputStream), str4) : pno.vt(inputStream, str4)).ouw;
                    if (raVar3 != null) {
                        raVar2 = raVar3;
                    }
                }
                if (raVar2 != null) {
                    mwhVarOuw = new mwh<>(raVar2);
                } else {
                    com.bytedance.adsdk.vt.le.yu.ouw("Animation for " + str3 + " not found in cache. Fetching from network.");
                    mwhVarOuw = pnoVarOuw.ouw(context2, str3, str4);
                }
                if (str2 != null && mwhVarOuw.ouw != null) {
                    com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str2, mwhVarOuw.ouw);
                }
                return mwhVarOuw;
            }
        });
    }

    public static jg<ra> ouw(Context context, int i10) {
        return ouw(context, i10, yu(context, i10));
    }

    public static jg<ra> vt(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return ouw(str2, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.4
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                return pno.lh(applicationContext, str, str2);
            }
        });
    }

    public static jg<ra> ouw(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return ouw(str, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return pno.lh(context2, i10);
            }
        });
    }

    public static mwh<ra> vt(Context context, int i10) {
        yu(context, i10);
        return lh(context, i10);
    }

    public static mwh<ra> vt(InputStream inputStream, String str) {
        return lh(inputStream, str);
    }

    public static mwh<ra> lh(Context context, int i10) {
        try {
            return lh(context.getResources().openRawResource(i10), yu(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new mwh<>((Throwable) e10);
        }
    }

    private static boolean ouw(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0110 A[Catch: IOException -> 0x02a2, TryCatch #3 {IOException -> 0x02a2, blocks: (B:3:0x000a, B:6:0x0014, B:8:0x0020, B:62:0x014c, B:9:0x0025, B:11:0x0031, B:12:0x0036, B:14:0x0042, B:15:0x0057, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:25:0x007d, B:27:0x0085, B:30:0x008e, B:31:0x0093, B:33:0x0099, B:34:0x00a2, B:54:0x0106, B:56:0x0110, B:57:0x012a, B:53:0x00e8, B:58:0x012e, B:60:0x0134, B:61:0x013d, B:35:0x00c0, B:42:0x00d7, B:51:0x00e6, B:50:0x00e3, B:47:0x00de, B:37:0x00c7, B:38:0x00c9, B:40:0x00d0, B:41:0x00d4, B:45:0x00dc), top: B:121:0x000a, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0110, please report this as an issue */
    private static mwh<ra> vt(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ra raVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    raVar = ouw(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).ouw;
                } else if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                                if (!file.delete()) {
                                    com.bytedance.adsdk.vt.le.yu.vt("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                                }
                                map2.put(str3, typefaceCreateFromFile);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            com.bytedance.adsdk.vt.le.yu.ouw("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                com.bytedance.adsdk.vt.le.yu.vt("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile2);
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (raVar == null) {
                return new mwh<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                tlj tljVarOuw = ouw(raVar, (String) entry.getKey());
                if (tljVarOuw != null) {
                    tljVarOuw.f11341cf = com.bytedance.adsdk.vt.le.pno.ouw((Bitmap) entry.getValue(), tljVarOuw.ouw, tljVarOuw.vt);
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z10 = false;
                for (com.bytedance.adsdk.vt.lh.lh lhVar : raVar.yu.values()) {
                    if (lhVar.ouw.equals(entry2.getKey())) {
                        lhVar.yu = (Typeface) entry2.getValue();
                        z10 = true;
                    }
                }
                if (!z10) {
                    com.bytedance.adsdk.vt.le.yu.vt("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, tlj>> it = raVar.f11320lh.entrySet().iterator();
                while (it.hasNext()) {
                    tlj value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String str4 = value.yu;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (str4.startsWith("data:") && str4.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str4.substring(str4.indexOf(44) + 1), 0);
                            value.f11341cf = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e10) {
                            com.bytedance.adsdk.vt.le.yu.ouw("data URL did not have correct base64 format.", e10);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, tlj> entry3 : raVar.f11320lh.entrySet()) {
                if (entry3.getValue().f11341cf == null) {
                    return new mwh<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().yu));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str, raVar);
            }
            return new mwh<>(raVar);
        } catch (IOException e11) {
            return new mwh<>((Throwable) e11);
        }
    }

    public static jg<ra> ouw(final InputStream inputStream, final String str) {
        return ouw(str, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.6
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                return pno.vt(inputStream, str);
            }
        });
    }

    private static void ouw(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static mwh<ra> lh(InputStream inputStream, String str) {
        try {
            return ouw(new JsonReader(new InputStreamReader(inputStream)), str, true);
        } finally {
            com.bytedance.adsdk.vt.le.pno.ouw(inputStream);
        }
    }

    public static mwh<ra> ouw(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return vt(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.vt.le.pno.ouw(zipInputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lh() {
        ArrayList arrayList = new ArrayList(vt);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }

    private static jg<ra> ouw(final String str, Callable<mwh<ra>> callable) {
        final ra raVarOuw = str == null ? null : com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str);
        if (raVarOuw != null) {
            return new jg<>(new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.7
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ mwh<ra> call() throws Exception {
                    return new mwh<>(raVarOuw);
                }
            });
        }
        if (str != null) {
            Map<String, jg<ra>> map = ouw;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        jg<ra> jgVar = new jg<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jgVar.ouw(new cf<ra>() { // from class: com.bytedance.adsdk.vt.pno.2
                @Override // com.bytedance.adsdk.vt.cf
                public final /* synthetic */ void ouw(ra raVar) {
                    pno.ouw.remove(str);
                    atomicBoolean.set(true);
                    if (pno.ouw.size() == 0) {
                        pno.lh();
                    }
                }
            });
            jgVar.lh(new cf<Throwable>() { // from class: com.bytedance.adsdk.vt.pno.3
                @Override // com.bytedance.adsdk.vt.cf
                public final /* synthetic */ void ouw(Throwable th2) {
                    pno.ouw.remove(str);
                    atomicBoolean.set(true);
                    if (pno.ouw.size() == 0) {
                        pno.lh();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, jg<ra>> map2 = ouw;
                map2.put(str, jgVar);
                if (map2.size() == 1) {
                    lh();
                }
            }
        }
        return jgVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129 A[PHI: r22
  0x0129: PHI (r22v18 java.lang.String) = 
  (r22v2 java.lang.String)
  (r22v3 java.lang.String)
  (r22v4 java.lang.String)
  (r22v5 java.lang.String)
  (r22v6 java.lang.String)
  (r22v7 java.lang.String)
  (r22v8 java.lang.String)
  (r22v9 java.lang.String)
  (r22v10 java.lang.String)
  (r22v11 java.lang.String)
  (r22v12 java.lang.String)
  (r22v13 java.lang.String)
  (r22v14 java.lang.String)
  (r22v15 java.lang.String)
  (r22v16 java.lang.String)
  (r22v19 java.lang.String)
 binds: [B:52:0x0125, B:49:0x0119, B:46:0x010c, B:43:0x00ff, B:40:0x00f3, B:37:0x00e7, B:34:0x00da, B:31:0x00ce, B:28:0x00c0, B:25:0x00b2, B:22:0x00a5, B:19:0x0097, B:16:0x0089, B:13:0x007b, B:10:0x006d, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    private static mwh<ra> ouw(JsonReader jsonReader, String str, boolean z10) {
        String str2;
        byte b10;
        JsonReader jsonReader2 = jsonReader;
        try {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            String strNextString = null;
            LongSparseArray<com.bytedance.adsdk.vt.lh.lh.fkw> longSparseArray = new LongSparseArray<>();
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            SparseArray<com.bytedance.adsdk.vt.lh.yu> sparseArray = new SparseArray<>();
            ra.lh lhVar = new ra.lh();
            ra.ouw ouwVar = new ra.ouw();
            ra.vt vtVar = new ra.vt();
            ra raVar = new ra();
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            float fNextDouble2 = 0.0f;
            float fNextDouble3 = 0.0f;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                switch (strNextName.hashCode()) {
                    case -1408207997:
                        str2 = strNextString;
                        if (!strNextName.equals("assets")) {
                            b10 = -1;
                        } else {
                            b10 = 7;
                        }
                        break;
                    case -1109732030:
                        str2 = strNextString;
                        if (!strNextName.equals("layers")) {
                            b10 = -1;
                        } else {
                            b10 = 6;
                        }
                        break;
                    case -865448777:
                        str2 = strNextString;
                        if (!strNextName.equals("globalEvent")) {
                            b10 = -1;
                        } else {
                            b10 = 13;
                        }
                        break;
                    case 104:
                        str2 = strNextString;
                        if (!strNextName.equals("h")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 118:
                        str2 = strNextString;
                        if (!strNextName.equals("v")) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case 119:
                        str2 = strNextString;
                        if (!strNextName.equals("w")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 3208:
                        str2 = strNextString;
                        if (!strNextName.equals("dl")) {
                            b10 = -1;
                        } else {
                            b10 = 12;
                        }
                        break;
                    case 3276:
                        str2 = strNextString;
                        if (!strNextName.equals("fr")) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 3292:
                        str2 = strNextString;
                        if (!strNextName.equals("gc")) {
                            b10 = -1;
                        } else {
                            b10 = 14;
                        }
                        break;
                    case 3367:
                        str2 = strNextString;
                        if (!strNextName.equals("ip")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case 3553:
                        str2 = strNextString;
                        if (!strNextName.equals("op")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 94623709:
                        str2 = strNextString;
                        if (!strNextName.equals("chars")) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 97615364:
                        str2 = strNextString;
                        if (!strNextName.equals("fonts")) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 110364485:
                        str2 = strNextString;
                        if (!strNextName.equals("timer")) {
                            b10 = -1;
                        } else {
                            b10 = 11;
                        }
                        break;
                    case 839250809:
                        str2 = strNextString;
                        if (!strNextName.equals("markers")) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    default:
                        str2 = strNextString;
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        iNextInt = jsonReader.nextInt();
                        break;
                    case 1:
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case 2:
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    case 3:
                        fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                        break;
                    case 4:
                        fNextDouble3 = (float) jsonReader.nextDouble();
                        strNextString = str2;
                        jsonReader2 = jsonReader;
                        continue;
                    case 5:
                        String[] strArrSplit = jsonReader.nextString().split("\\.");
                        if (!com.bytedance.adsdk.vt.le.pno.ouw(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]))) {
                            raVar.ouw("Lottie only supports bodymovin >= 4.4.0");
                        }
                        break;
                    case 6:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, raVar, arrayList, longSparseArray);
                        break;
                    case 7:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, raVar, map, map2);
                        break;
                    case 8:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, map3);
                        break;
                    case 9:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, raVar, sparseArray);
                        break;
                    case 10:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, arrayList2);
                        break;
                    case 11:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, lhVar);
                        break;
                    case 12:
                        strNextString = jsonReader.nextString();
                        continue;
                    case 13:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, vtVar);
                        break;
                    case 14:
                        com.bytedance.adsdk.vt.fkw.zin.ouw(jsonReader2, ouwVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
                jsonReader2 = jsonReader;
                strNextString = str2;
            }
            jsonReader.endObject();
            raVar.bly = new Rect(0, 0, (int) (iNextInt * fOuw), (int) (iNextInt2 * fOuw));
            raVar.tlj = fNextDouble;
            raVar.f11316cf = fNextDouble2;
            raVar.ryl = fNextDouble3;
            raVar.pno = arrayList;
            raVar.f11321ra = longSparseArray;
            raVar.vt = map;
            raVar.f11320lh = map2;
            raVar.f11319le = sparseArray;
            raVar.yu = map3;
            raVar.fkw = arrayList2;
            raVar.f11318ko = lhVar;
            raVar.f11322rn = strNextString;
            raVar.zih = ouwVar;
            raVar.f11324vm = vtVar;
            com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str, raVar);
            return new mwh<>(raVar);
        } catch (Exception e10) {
            return new mwh<>((Throwable) e10);
        } finally {
            if (z10) {
                ouw(jsonReader);
            }
        }
    }

    private static tlj ouw(ra raVar, String str) {
        for (tlj tljVar : raVar.f11320lh.values()) {
            if (tljVar.yu.equals(str)) {
                return tljVar;
            }
        }
        return null;
    }
}

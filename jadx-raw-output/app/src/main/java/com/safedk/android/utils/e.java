package com.safedk.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import androidx.appcompat.widget.ActivityChooserModel;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44903a = 620;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44904b = "MemoryUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44905c = new Object();

    public static long a(Context context) {
        return Runtime.getRuntime().freeMemory();
    }

    public static boolean b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static String a() {
        try {
            return a(a(Environment.getDataDirectory()));
        } catch (Throwable th2) {
            Logger.e(f44904b, "error in getHumanReadableFreeInternalMemory()");
            return "";
        }
    }

    public static long b() {
        return a(Environment.getDataDirectory());
    }

    private static long a(File file) {
        long blockSize;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            } else {
                blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            }
            return blockSize;
        } catch (Throwable th2) {
            Logger.e(f44904b, "error in getAvailableMemoryInPath");
            return 0L;
        }
    }

    public static String a(long j10) {
        long j11 = 1024 * 1024;
        long j12 = j11 * 1024;
        long j13 = j12 * 1024;
        long j14 = j13 * 1024;
        long j15 = j14 * 1024;
        if (j10 < 1024) {
            return a(j10) + " byte";
        }
        if (j10 >= 1024 && j10 < j11) {
            return a(j10 / 1024) + " Kb";
        }
        if (j10 >= j11 && j10 < j12) {
            return a(j10 / j11) + " Mb";
        }
        if (j10 >= j12 && j10 < j13) {
            return a(j10 / j12) + " Gb";
        }
        if (j10 >= j13 && j10 < j14) {
            return a(j10 / j13) + " Tb";
        }
        if (j10 < j14 || j10 >= j15) {
            return j10 >= j15 ? a(j10 / j15) + " Eb" : "???";
        }
        return a(j10 / j14) + " Pb";
    }

    private static String a(double d10) {
        return new DecimalFormat("#.##").format(d10);
    }

    public static long c() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }

    public static void a(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(f44904b, "loaded from prefs: " + strA);
        Logger.d(f44904b, "available heap size: " + strA2);
        if (b(SafeDK.getInstance().l())) {
            Logger.e(f44904b, "android low memory!");
        }
    }

    public static void b(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(f44904b, "saved in prefs: " + strA);
        boolean zB = b(SafeDK.getInstance().l());
        Logger.d(f44904b, "available heap size: " + strA2);
        if (zB) {
            Logger.e(f44904b, "android low memory!");
        }
    }

    public static void a(Map<?, ?> map, String str, boolean z10) {
        int iR;
        if (map != null && map.size() > (iR = SafeDK.getInstance().R())) {
            String string = UUID.randomUUID().toString();
            try {
                a(map, str, iR, string, z10);
                a(map, str, iR, string);
            } catch (Throwable th2) {
                Logger.d(f44904b, "Exception in clear CIs from memory " + string + " - " + th2.getMessage(), th2);
            }
        }
    }

    private static void a(Map<?, ?> map, String str, int i10, String str2, boolean z10) {
        List list;
        HashSet hashSet = new HashSet();
        if (z10) {
            for (String str3 : CreativeInfoManager.i()) {
                for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
                    int iA = a(map, str3, adType, str2);
                    if (iA > i10) {
                        hashSet.add(str3 + "_" + adType.name());
                        if (iA > 0) {
                            Logger.d(f44904b, "clear CIs from memory (expired) " + str2 + " - for " + str + ", adType: " + adType.name() + ", sdkPackageName: " + str3 + ", item count: " + iA + ", max items: " + i10);
                        }
                    }
                }
            }
        }
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            CreativeInfo creativeInfo = null;
            if (next != null && next.getValue() != null) {
                if (next.getValue() instanceof CreativeInfo) {
                    creativeInfo = (CreativeInfo) next.getValue();
                } else if ((next.getValue() instanceof List) && (list = (List) next.getValue()) != null && list.size() > 0 && (list.get(0) instanceof CreativeInfo)) {
                    creativeInfo = (CreativeInfo) list.get(0);
                }
            }
            if (creativeInfo != null) {
                String strQ = creativeInfo.Q();
                BrandSafetyUtils.AdType adTypeK = creativeInfo.K();
                a(z10, str2, hashSet, it, creativeInfo, next.getKey().toString());
                if (a(map, strQ, adTypeK, str2) <= i10) {
                    return;
                }
            }
        }
    }

    private static void a(Map<?, ?> map, String str, int i10, String str2) {
        int i11;
        for (String str3 : CreativeInfoManager.i()) {
            for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
                Map<Long, List<String>> mapB = b(map, str3, adType, str2);
                int iA = a(mapB, str2);
                if (iA > i10 && (i11 = iA - i10) > 0) {
                    ArrayList arrayList = new ArrayList(mapB.keySet());
                    Collections.sort(arrayList);
                    Logger.d(f44904b, "clear CIs from memory (oldest) " + str2 + " - after clean iteration itemsToBeRemovedList = " + arrayList);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        int i12 = i11;
                        if (!it.hasNext()) {
                            break;
                        }
                        List<String> list = mapB.get((Long) it.next());
                        if (list != null) {
                            for (String str4 : list) {
                                if (map.containsKey(str4)) {
                                    map.remove(str4);
                                    Logger.d(f44904b, "clear CIs from memory (oldest) " + str2 + " - after clean removed adId: " + str4 + ", itemsToBeRemovedCount: " + i12);
                                    i12--;
                                    if (i12 <= 0) {
                                        return;
                                    }
                                }
                            }
                        }
                        i11 = i12;
                    }
                }
            }
        }
    }

    private static int a(Map<Long, List<String>> map, String str) {
        int i10;
        int size = 0;
        if (map == null) {
            i10 = 0;
        } else {
            Iterator<List<String>> it = map.values().iterator();
            while (true) {
                i10 = size;
                if (!it.hasNext()) {
                    break;
                }
                size = it.next().size() + i10;
            }
        }
        if (i10 > 0) {
            Logger.d(f44904b, "clear CIs from memory " + str + " - countItemsInTsMap returned " + i10);
        }
        return i10;
    }

    private static void a(boolean z10, String str, Set<String> set, Iterator<? extends Map.Entry<?, ?>> it, CreativeInfo creativeInfo, String str2) {
        if (creativeInfo != null && CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (creativeInfo.Y() != null && creativeInfo.Y().before(new Timestamp(jCurrentTimeMillis))) {
                if (!z10) {
                    Logger.d(f44904b, "clear CIs from memory " + str + " - removing CI item. expiration time: " + a(creativeInfo.Y()) + ", sdk: " + creativeInfo.Q() + ", adType = " + creativeInfo.K() + ", key: " + str2);
                    it.remove();
                } else if (set.contains(creativeInfo.Q() + "_" + creativeInfo.K().name())) {
                    Logger.d(f44904b, "clear CIs from memory " + str + " - removing list item. expiration time: " + a(creativeInfo.Y()) + ", sdk: " + creativeInfo.Q() + ", adType = " + creativeInfo.K() + ", key: " + str2);
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    private static int a(Map<?, ?> map, String str, BrandSafetyUtils.AdType adType, String str2) {
        CreativeInfo creativeInfo;
        int i10 = 0;
        for (Object obj : map.values()) {
            if (obj instanceof CreativeInfo) {
                creativeInfo = (CreativeInfo) obj;
            } else if (!(obj instanceof List)) {
                creativeInfo = null;
            } else {
                List list = (List) obj;
                if (list.isEmpty() || !(list.get(0) instanceof CreativeInfo)) {
                    creativeInfo = null;
                } else {
                    creativeInfo = (CreativeInfo) list.get(0);
                }
            }
            if (creativeInfo != null && creativeInfo.Q() != null && creativeInfo.Q().equals(str) && ((creativeInfo.K() == null && adType == null) || (creativeInfo.K() != null && creativeInfo.K().equals(adType)))) {
                i10++;
            }
            i10 = i10;
        }
        if (i10 > 0) {
            Logger.d(f44904b, "clear CIs from memory " + str2 + " get CI count returned " + i10 + " for SdkPackage " + str + ", adType " + (adType != null ? adType.name() : "null"));
        }
        return i10;
    }

    private static Map<Long, List<String>> b(Map<?, ?> map, String str, BrandSafetyUtils.AdType adType, String str2) {
        HashMap map2 = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            CreativeInfo creativeInfo = null;
            if (entry.getValue() instanceof CreativeInfo) {
                creativeInfo = (CreativeInfo) entry.getValue();
            } else if (entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                    creativeInfo = (CreativeInfo) list.get(0);
                }
            }
            if (a(creativeInfo, str, adType, str2)) {
                List arrayList = (List) map2.get(Long.valueOf(creativeInfo.ab()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(Long.valueOf(creativeInfo.ab()), arrayList);
                }
                arrayList.add(entry.getKey().toString());
            }
        }
        if (map2.size() > 0) {
            Logger.d(f44904b, "clear CIs from memory " + str2 + " get TS CI count returned " + map2.size() + " items for SdkPackage " + str + ", adType " + (adType != null ? adType.name() : "null"));
        }
        return map2;
    }

    private static boolean a(CreativeInfo creativeInfo, String str, BrandSafetyUtils.AdType adType, String str2) {
        return creativeInfo != null && creativeInfo.Q() != null && creativeInfo.Q().equals(str) && ((creativeInfo.K() == null && adType == null) || (creativeInfo.K() != null && creativeInfo.K().equals(adType)));
    }

    private static String a(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp.getTime()));
    }

    public static String b(long j10) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) new Date(j10));
    }
}

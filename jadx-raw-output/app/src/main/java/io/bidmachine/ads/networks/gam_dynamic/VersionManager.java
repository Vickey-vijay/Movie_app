package io.bidmachine.ads.networks.gam_dynamic;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.gam_dynamic.VersionManager;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.VersionWrapperImpl;
import io.bidmachine.utils.version.Version;
import io.bidmachine.utils.version.VersionRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class VersionManager {
    @NonNull
    @VisibleForTesting
    public static List<Pair<VersionRange, VersionWrapper>> initializeVersionWrapperList() {
        ArrayList arrayList = new ArrayList();
        ArrayList<VersionWrapper> arrayList2 = new ArrayList<VersionWrapper>() { // from class: io.bidmachine.ads.networks.gam_dynamic.VersionManager.1
            {
                add(new VersionWrapperImpl());
                add(new io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.VersionWrapperImpl());
                add(new io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.VersionWrapperImpl());
            }
        };
        Collections.sort(arrayList2, new Comparator() { // from class: if.i0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VersionManager.lambda$initializeVersionWrapperList$0((VersionWrapper) obj, (VersionWrapper) obj2);
            }
        });
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            VersionWrapper versionWrapper = arrayList2.get(i10);
            Version versionForWhichCompiled = null;
            VersionWrapper versionWrapper2 = i10 < size + (-1) ? arrayList2.get(i10 + 1) : null;
            Version versionForWhichCompiled2 = versionWrapper.getVersionForWhichCompiled();
            if (versionWrapper2 != null) {
                versionForWhichCompiled = versionWrapper2.getVersionForWhichCompiled();
            }
            arrayList.add(new Pair(new VersionRange(versionForWhichCompiled2, versionForWhichCompiled, true, false), versionWrapper));
            i10++;
        }
        return arrayList;
    }

    @Nullable
    @VisibleForTesting
    public static Version findVersion(@NonNull List<Pair<VersionRange, VersionWrapper>> list) {
        Version versionSafeGetVersion;
        Iterator<Pair<VersionRange, VersionWrapper>> it = list.iterator();
        while (it.hasNext()) {
            VersionWrapper versionWrapper = (VersionWrapper) it.next().second;
            if (Build.VERSION.SDK_INT >= versionWrapper.getMinDeviceApiVersion() && (versionSafeGetVersion = safeGetVersion(versionWrapper)) != null) {
                return versionSafeGetVersion;
            }
        }
        return null;
    }

    @Nullable
    public static VersionWrapper findVersionWrapper(@NonNull String str) {
        List<Pair<VersionRange, VersionWrapper>> listInitializeVersionWrapperList;
        Version versionFindVersion;
        VersionRange versionRange = VersionRange.parseVersionRange(str);
        if (versionRange == null || (versionFindVersion = findVersion((listInitializeVersionWrapperList = initializeVersionWrapperList()))) == null || !versionRange.contains(versionFindVersion)) {
            return null;
        }
        for (Pair<VersionRange, VersionWrapper> pair : listInitializeVersionWrapperList) {
            if (((VersionRange) pair.first).contains(versionFindVersion)) {
                return (VersionWrapper) pair.second;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$initializeVersionWrapperList$0(VersionWrapper versionWrapper, VersionWrapper versionWrapper2) {
        return versionWrapper.getVersionForWhichCompiled().compareTo(versionWrapper2.getVersionForWhichCompiled());
    }

    @Nullable
    @VisibleForTesting
    public static Version safeGetVersion(@NonNull VersionWrapper versionWrapper) {
        try {
            return versionWrapper.getVersion();
        } catch (Throwable unused) {
            return null;
        }
    }
}

package yads;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class xc2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return qj.b.d(Integer.valueOf(((ScanResult) obj2).level), Integer.valueOf(((ScanResult) obj).level));
    }
}

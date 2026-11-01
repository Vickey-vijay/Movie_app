package yads;

import android.location.Location;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class eh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg1 f77074a = new zg1();

    public final Location a(List list) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Iterator it = list.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.f77074a.getClass();
            if (location != null) {
                long time = location2.getTime() - location.getTime();
                long j10 = zg1.f85386a;
                boolean z15 = true;
                if (time > j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (time < (-j10)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (time > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int accuracy = (int) (location2.getAccuracy() - location.getAccuracy());
                if (accuracy > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (accuracy < 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (accuracy <= 200) {
                    z15 = false;
                }
                boolean zE = ck.p.e(location2.getProvider(), location.getProvider());
                if (!z10 && (z11 || (!z14 && ((!z12 || z13) && (!z12 || z15 || !zE))))) {
                }
            }
            location = location2;
        }
        return location;
    }
}

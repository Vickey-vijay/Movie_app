package yads;

import android.content.Context;
import android.location.LocationManager;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class j53 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f78917c = new HashSet(nj.r.e("gps"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f78918d = new HashSet(nj.s.n("gps", "passive"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f78919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc2 f78920b;

    public /* synthetic */ j53(Context context, LocationManager locationManager) {
        this(locationManager, new gc2(context));
    }

    public j53(LocationManager locationManager, gc2 gc2Var) {
        this.f78919a = locationManager;
        this.f78920b = gc2Var;
    }
}

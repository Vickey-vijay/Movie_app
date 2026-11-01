package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3459f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28853b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f28854c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3565l0 f28855a;

    /* JADX INFO: renamed from: com.ironsource.f1$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return qj.b.d(Integer.valueOf(((LevelPlayAdSize) t11).getWidth()), Integer.valueOf(((LevelPlayAdSize) t10).getWidth()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f1$c */
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f28856a;

        public c(Comparator comparator) {
            this.f28856a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f28856a.compare(t10, t11);
            return iCompare != 0 ? iCompare : qj.b.d(Integer.valueOf(((LevelPlayAdSize) t11).getHeight()), Integer.valueOf(((LevelPlayAdSize) t10).getHeight()));
        }
    }

    public final LevelPlayAdSize a(Context context, Integer num) {
        LevelPlayAdSize levelPlayAdSize;
        int i10;
        LevelPlayAdSize levelPlayAdSizeCreateCustomSize;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        if (!this.f28855a.d()) {
            IronLog.API.error(C3565l0.a(this.f28855a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer numB = this.f28855a.b(context);
        if (numB == null) {
            IronLog.API.error(C3565l0.a(this.f28855a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int iIntValue = numB.intValue();
        int iA = a(num, context);
        int iA2 = this.f28855a.a(iA);
        List<LevelPlayAdSize> listA = a();
        Iterator<T> it = a(listA, iIntValue, iA).iterator();
        while (true) {
            if (!it.hasNext()) {
                levelPlayAdSize = null;
                break;
            }
            levelPlayAdSize = (LevelPlayAdSize) it.next();
            if (levelPlayAdSize.getWidth() <= iA && (levelPlayAdSize.getHeight() <= iA2 || iA2 == -1)) {
                iA2 = Math.max(iA2, levelPlayAdSize.getHeight());
                break;
            }
        }
        if (levelPlayAdSize == null) {
            int height = ((LevelPlayAdSize) nj.b0.r0(listA)).getHeight();
            i10 = height;
            levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.Companion.createCustomSize(iA, height);
        } else {
            i10 = iA2;
            levelPlayAdSizeCreateCustomSize = levelPlayAdSize;
        }
        IronLog.INTERNAL.info(C3565l0.a(this.f28855a, "Adaptive: " + iA + VastAttributes.HORIZONTAL_POSITION + i10 + " Fallback: " + levelPlayAdSizeCreateCustomSize, (String) null, 2, (Object) null));
        return new LevelPlayAdSize(iA, i10, "CUSTOM", true, levelPlayAdSizeCreateCustomSize);
    }

    public C3459f1(C3565l0 c3565l0) {
        ck.p.j(c3565l0, "adSizeTools");
        this.f28855a = c3565l0;
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C3565l0.a(this.f28855a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return C3445e5.f28736a.b(context);
        }
        if (num == null) {
            return C3445e5.f28736a.b(context);
        }
        return num.intValue();
    }

    private final List<LevelPlayAdSize> a() {
        return nj.b0.H0(this.f28855a.b(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i10 && levelPlayAdSize.getWidth() <= i11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

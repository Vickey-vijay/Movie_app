package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.datepicker.UtcDates;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3560kd implements P7, P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f29359a = "CappingManager.IS_DELIVERY_ENABLED";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29360b = "CappingManager.IS_CAPPING_ENABLED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29361c = "CappingManager.IS_PACING_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f29362d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29363e = "CappingManager.CAPPING_TYPE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f29364f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f29365g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f29366h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f29367i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.kd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.P7
    public synchronized b a(Context context, AbstractC3726u3 abstractC3726u3, IronSource.a aVar) {
        try {
            if (context == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC3726u3 == null) {
                return b.NOT_CAPPED;
            }
            String strA = a(aVar);
            if (abstractC3726u3.c() == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC3726u3.a() == null) {
                return b.NOT_CAPPED;
            }
            return b(context, strA, abstractC3726u3.c());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ironsource.P7.a
    public synchronized void b(Context context, AbstractC3726u3 abstractC3726u3, IronSource.a aVar) {
        if (context == null || abstractC3726u3 == null) {
            return;
        }
        C3507hd c3507hdA = abstractC3726u3.a();
        if (c3507hdA == null) {
            return;
        }
        a(context, a(aVar), abstractC3726u3.c(), c3507hdA);
    }

    @Override // com.ironsource.P7
    public synchronized boolean c(Context context, AbstractC3726u3 abstractC3726u3, IronSource.a aVar) {
        return a(context, abstractC3726u3, aVar) != b.NOT_CAPPED;
    }

    /* JADX INFO: renamed from: com.ironsource.kd$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29368a;

        static {
            int[] iArr = new int[EnumC3578ld.values().length];
            f29368a = iArr;
            try {
                iArr[EnumC3578ld.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29368a[EnumC3578ld.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, f29359a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, f29361c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, f29367i, str2), 0L) < IronSourceUtils.a(context, a(str, f29364f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, f29360b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, f29362d, str2), 0);
            String strA = a(str, f29365g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, f29366h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.P7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(Context context, String str, String str2) {
        if (IronSourceUtils.a(context, a(str, f29361c, str2), false)) {
            IronSourceUtils.b(context, a(str, f29367i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, f29360b, str2), false)) {
            String strA = a(str, f29365g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, f29363e, str2), EnumC3578ld.PER_DAY.toString());
                EnumC3578ld enumC3578ld = null;
                for (EnumC3578ld enumC3578ld2 : EnumC3578ld.values()) {
                    if (enumC3578ld2.f29406a.equals(strC)) {
                        enumC3578ld = enumC3578ld2;
                        break;
                    }
                }
                IronSourceUtils.b(context, a(str, f29366h, str2), a(enumC3578ld));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private long a(EnumC3578ld enumC3578ld) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
        int i10 = a.f29368a[enumC3578ld.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(Context context, String str, String str2, C3507hd c3507hd) {
        boolean zE = c3507hd.e();
        IronSourceUtils.b(context, a(str, f29359a, str2), zE);
        if (zE) {
            boolean zD = c3507hd.d();
            IronSourceUtils.b(context, a(str, f29360b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, f29362d, str2), c3507hd.b());
                IronSourceUtils.f(context, a(str, f29363e, str2), c3507hd.a().toString());
            }
            boolean zF = c3507hd.f();
            IronSourceUtils.b(context, a(str, f29361c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f29364f, str2), c3507hd.c());
            }
        }
    }

    private String a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (aVar == IronSource.a.BANNER) {
            return "Banner";
        }
        return aVar == IronSource.a.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : aVar.toString();
    }
}

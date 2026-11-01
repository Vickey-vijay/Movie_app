package mk;

import ck.p;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes11.dex */
public class e {
    public static final double a(double d10, DurationUnit durationUnit, DurationUnit durationUnit2) {
        p.j(durationUnit, "sourceUnit");
        p.j(durationUnit2, "targetUnit");
        long jConvert = durationUnit2.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d10 * jConvert : d10 / durationUnit.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit2.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j10, DurationUnit durationUnit, DurationUnit durationUnit2) {
        p.j(durationUnit, "sourceUnit");
        p.j(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j10, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long c(long j10, DurationUnit durationUnit, DurationUnit durationUnit2) {
        p.j(durationUnit, "sourceUnit");
        p.j(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j10, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final TimeUnit d(DurationUnit durationUnit) {
        p.j(durationUnit, "<this>");
        return durationUnit.getTimeUnit$kotlin_stdlib();
    }
}

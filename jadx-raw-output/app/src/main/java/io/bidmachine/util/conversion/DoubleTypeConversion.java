package io.bidmachine.util.conversion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: DoubleTypeConversion.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014¢\u0006\u0002\u0010\u0007J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0014¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lio/bidmachine/util/conversion/DoubleTypeConversion;", "Lio/bidmachine/util/conversion/BaseTypeConversion;", "", "()V", TypedValues.TransitionType.S_TO, "value", "", "(Ljava/lang/Object;)Ljava/lang/Double;", "", "(Ljava/lang/String;)Ljava/lang/Double;", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DoubleTypeConversion extends BaseTypeConversion<Double> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.util.conversion.BaseTypeConversion
    public Double to(Object value) {
        p.j(value, "value");
        if (value instanceof Integer) {
            return Double.valueOf(((Number) value).intValue());
        }
        if (value instanceof Long) {
            return Double.valueOf(((Number) value).longValue());
        }
        if (value instanceof String) {
            return (Double) TypeConversion.toOrDefault$default((TypeConversion) this, (String) value, (Object) null, 2, (Object) null);
        }
        return to(value.toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.util.conversion.BaseTypeConversion
    public Double to(String value) {
        p.j(value, "value");
        try {
            return Double.valueOf(Double.parseDouble(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}

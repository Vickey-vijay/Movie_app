package io.bidmachine.util.conversion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: StringTypeConversion.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/conversion/StringTypeConversion;", "Lio/bidmachine/util/conversion/BaseTypeConversion;", "", "()V", TypedValues.TransitionType.S_TO, "value", "", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StringTypeConversion extends BaseTypeConversion<String> {
    @Override // io.bidmachine.util.conversion.BaseTypeConversion
    public String to(String value) {
        p.j(value, "value");
        return value;
    }

    @Override // io.bidmachine.util.conversion.BaseTypeConversion
    public String to(Object value) {
        p.j(value, "value");
        return value.toString();
    }
}

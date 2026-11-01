package com.facebook.internal;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import java.util.EnumSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: SmartLoginOption.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "", "value", "J", "getValue", "()J", "<init>", "(Ljava/lang/String;IJ)V", VastTagName.COMPANION, "a", "None", "Enabled", "RequireConfirm", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet<SmartLoginOption> f14337b;
    private final long value;

    /* JADX INFO: renamed from: com.facebook.internal.SmartLoginOption$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SmartLoginOption.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/SmartLoginOption$a;", "", "", "bitmask", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "a", "ALL", "Ljava/util/EnumSet;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final EnumSet<SmartLoginOption> a(long bitmask) {
            EnumSet<SmartLoginOption> enumSetNoneOf = EnumSet.noneOf(SmartLoginOption.class);
            for (SmartLoginOption smartLoginOption : SmartLoginOption.f14337b) {
                if ((smartLoginOption.getValue() & bitmask) != 0) {
                    enumSetNoneOf.add(smartLoginOption);
                }
            }
            ck.p.i(enumSetNoneOf, "result");
            return enumSetNoneOf;
        }
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j10) {
        return INSTANCE.a(j10);
    }

    static {
        EnumSet<SmartLoginOption> enumSetAllOf = EnumSet.allOf(SmartLoginOption.class);
        ck.p.i(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f14337b = enumSetAllOf;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SmartLoginOption[] valuesCustom() {
        SmartLoginOption[] smartLoginOptionArrValuesCustom = values();
        return (SmartLoginOption[]) Arrays.copyOf(smartLoginOptionArrValuesCustom, smartLoginOptionArrValuesCustom.length);
    }

    public final long getValue() {
        return this.value;
    }

    SmartLoginOption(long j10) {
        this.value = j10;
    }
}

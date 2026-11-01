package org.fourthline.cling.model.types;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class UnsignedVariableInteger {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f65798b = Logger.getLogger(UnsignedVariableInteger.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f65799a;

    public enum Bits {
        EIGHT(255),
        SIXTEEN(65535),
        TWENTYFOUR(16777215),
        THIRTYTWO(4294967295L);

        private long maxValue;

        public long getMaxValue() {
            return this.maxValue;
        }

        Bits(long j10) {
            this.maxValue = j10;
        }
    }

    public UnsignedVariableInteger() {
    }

    public abstract Bits a();

    public int b() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f65799a == ((UnsignedVariableInteger) obj).f65799a;
    }

    public UnsignedVariableInteger(long j10) throws NumberFormatException {
        f(j10);
    }

    public Long c() {
        return Long.valueOf(this.f65799a);
    }

    public UnsignedVariableInteger d(boolean z10) {
        if (this.f65799a + 1 > a().getMaxValue()) {
            this.f65799a = z10 ? 1L : 0L;
        } else {
            this.f65799a++;
        }
        return this;
    }

    public int hashCode() {
        long j10 = this.f65799a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return Long.toString(this.f65799a);
    }

    public void e(long j10) throws NumberFormatException {
        if (j10 >= b() && j10 <= a().getMaxValue()) {
            return;
        }
        throw new NumberFormatException("Value must be between " + b() + " and " + a().getMaxValue() + ": " + j10);
    }

    public UnsignedVariableInteger f(long j10) {
        e(j10);
        this.f65799a = j10;
        return this;
    }

    public UnsignedVariableInteger(String str) throws NumberFormatException {
        if (str.startsWith("-")) {
            f65798b.warning("Invalid negative integer value '" + str + "', assuming value 0!");
            str = "0";
        }
        f(Long.parseLong(str.trim()));
    }
}

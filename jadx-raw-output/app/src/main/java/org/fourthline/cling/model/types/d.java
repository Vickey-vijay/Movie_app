package org.fourthline.cling.model.types;

/* JADX INFO: compiled from: UnsignedIntegerTwoBytes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends UnsignedVariableInteger {
    public d(long j10) throws NumberFormatException {
        super(j10);
    }

    public d(String str) throws NumberFormatException {
        super(str);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits a() {
        return UnsignedVariableInteger.Bits.SIXTEEN;
    }
}

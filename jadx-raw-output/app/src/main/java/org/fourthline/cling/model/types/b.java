package org.fourthline.cling.model.types;

/* JADX INFO: compiled from: UnsignedIntegerFourBytes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends UnsignedVariableInteger {
    public b(long j10) throws NumberFormatException {
        super(j10);
    }

    public b(String str) throws NumberFormatException {
        super(str);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits a() {
        return UnsignedVariableInteger.Bits.THIRTYTWO;
    }
}

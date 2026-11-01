package org.fourthline.cling.model.types;

/* JADX INFO: compiled from: UnsignedIntegerOneByte.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends UnsignedVariableInteger {
    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits a() {
        return UnsignedVariableInteger.Bits.EIGHT;
    }

    public c(String str) throws NumberFormatException {
        super(str);
    }
}

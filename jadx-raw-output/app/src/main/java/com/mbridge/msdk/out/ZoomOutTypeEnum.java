package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes7.dex */
public enum ZoomOutTypeEnum {
    FloatBall(1),
    BigView(4),
    MediumView(3),
    SmallView(2);

    private int index;

    public int getIndex() {
        return this.index;
    }

    ZoomOutTypeEnum(int i10) {
        this.index = i10;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1341Jc extends AbstractRunnableC1664Vt {
    public static String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ JU A00;
    public final /* synthetic */ boolean A01;

    public C1341Jc(JU ju, boolean z10) {
        this.A00 = ju;
        this.A01 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        boolean z10;
        AbstractC1707Xm abstractC1707XmA0C = this.A00.A0N.A0C();
        if (abstractC1707XmA0C != null) {
            if (this.A01) {
                z10 = false;
            } else {
                boolean zA0B = abstractC1707XmA0C.A0B();
                if (A02[4].length() != 25) {
                    throw new RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (zA0B) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            abstractC1707XmA0C.setPageDetailsVisible(z10);
            abstractC1707XmA0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}

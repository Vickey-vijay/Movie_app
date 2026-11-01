package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BT {
    public static byte[] A0G;
    public static String[] A0H = {"pVyOFxmsQ66MTtm1tfRFfgviAXYtJVde", "2uUwIcomsi7SFa7PXkK2f37odc1wLlYz", "QkwYj4Lqiyfn1sjUd74ET1yWKOC2yQQp", "dFCgemChCTNfDzsLBkcDawIxAoCNtdjt", "sEgyiM3VxaELP8J5ElL8PsjgrXzRWZa", "oraRcW9NweHiYSV9WAd4vPrbGQ1KpHw2", "RucdtTHsidUdQvrsj3emf0t2ky4JUHkt", "bkvUCljONwekC27QIXEAtZgyfnOfNHe"};
    public static final Requirements A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1154Bv A05;
    public List<B8> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B;
    public final BQ A0C;
    public final InterfaceC2509mT A0D;
    public final InterfaceC1150Br A0E;
    public final CopyOnWriteArraySet<BS> A0F;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0H[0].charAt(31) != 'e') {
                throw new RuntimeException();
            }
            A0H[1] = "Q4q55Cq4Bi7IKuCSPoembBRK5ZQkCbyv";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 123);
            i13++;
        }
    }

    public static void A03() {
        A0G = new byte[]{34, 31, 8, 55, 11, 6, 30, 2, 21, 93, 35, 8, 16, 9, 11, 8, 6, 3, ExifInterface.START_CODE, 6, 9, 6, 0, 2, 21};
    }

    static {
        A03();
        A0I = new Requirements(1);
    }

    public BT(Context context, InterfaceC09784m interfaceC09784m, InterfaceC1404Ln interfaceC1404Ln, InterfaceC09884w interfaceC09884w, Executor executor) {
        this(context, new C9H(interfaceC09784m), new C2518mc(new C2307ix().A06(interfaceC1404Ln).A05(interfaceC09884w), executor));
    }

    public BT(Context context, InterfaceC2509mT interfaceC2509mT, InterfaceC1141Bh interfaceC1141Bh) {
        this.A0A = context.getApplicationContext();
        this.A0D = interfaceC2509mT;
        this.A01 = 3;
        this.A02 = 5;
        this.A07 = true;
        this.A06 = Collections.emptyList();
        this.A0F = new CopyOnWriteArraySet<>();
        Handler handlerA0b = AbstractC09664a.A0b(new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.BM
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A0B(message);
            }
        });
        this.A0B = handlerA0b;
        HandlerThread handlerThread = new HandlerThread(A01(0, 25, 28));
        handlerThread.start();
        this.A0C = new BQ(handlerThread, interfaceC2509mT, interfaceC1141Bh, handlerA0b, this.A01, this.A02, this.A07);
        InterfaceC1150Br requirementsListener = new InterfaceC1150Br() { // from class: com.facebook.ads.redexgen.X.mb
            @Override // com.facebook.ads.redexgen.core.InterfaceC1150Br
            public final void AEz(C1154Bv c1154Bv, int i10) {
                this.A00.A07(c1154Bv, i10);
            }
        };
        this.A0E = requirementsListener;
        this.A05 = new C1154Bv(context, requirementsListener, A0I);
        this.A03 = this.A05.A09();
        this.A04 = 1;
        this.A0C.obtainMessage(0, this.A03, 0).sendToTarget();
    }

    public static B8 A00(B8 b10, DownloadRequest downloadRequest, int i10, long j10) {
        long j11;
        int i11;
        int i12 = b10.A02;
        if (i12 == 5 || b10.A02()) {
            j11 = j10;
        } else {
            j11 = b10.A05;
        }
        if (i12 == 5 || i12 == 7) {
            i11 = 7;
        } else if (i10 != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return new B8(b10.A07.A02(downloadRequest), i11, j11, j10, -1L, i10, 0);
    }

    private void A02() {
        Iterator<BS> it = this.A0F.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0H[2].charAt(11) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[4] = "SmTtusU6hPZNCMRD5EytmTKQlQAuGgF";
            strArr[7] = "GYCdxmdyxLWQsNM7s6qdd5Bkhe8SJ7C";
            if (zHasNext) {
                BS listener = it.next();
                listener.AFv(this, this.A09);
            } else {
                return;
            }
        }
    }

    private void A04(int i10, int i11) {
        this.A04 -= i10;
        this.A00 = i11;
        if (A0I()) {
            Iterator<BS> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().ADS(this);
            }
        }
    }

    private void A05(BO bo2) {
        this.A06 = Collections.unmodifiableList(bo2.A02);
        B8 b10 = bo2.A00;
        boolean zA0A = A0A();
        if (bo2.A03) {
            Iterator<BS> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().AD4(this, b10);
            }
        } else {
            Iterator<BS> it2 = this.A0F.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                if (A0H[5].charAt(25) == 'r') {
                    throw new RuntimeException();
                }
                A0H[5] = "ysMk9cu0SrkjVTb8eZ5DX1SyqV41ya5j";
                if (!zHasNext) {
                    break;
                } else {
                    it2.next().AD3(this, b10, bo2.A01);
                }
            }
        }
        if (zA0A) {
            A02();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C1154Bv c1154Bv, int i10) {
        Requirements requirementsA0A = c1154Bv.A0A();
        if (this.A03 != i10) {
            this.A03 = i10;
            this.A04++;
            this.A0C.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zA0A = A0A();
        Iterator<BS> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next().AEy(this, requirementsA0A, i10);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A08(List<B8> list) {
        this.A08 = true;
        this.A06 = Collections.unmodifiableList(list);
        boolean zA0A = A0A();
        Iterator<BS> it = this.A0F.iterator();
        while (waitingForRequirementsChanged) {
            it.next().ADX(this);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A09(boolean z10) {
        if (this.A07 == z10) {
            return;
        }
        this.A07 = z10;
        this.A04++;
        this.A0C.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
        boolean zA0A = A0A();
        Iterator<BS> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (zA0A) {
            A02();
        }
    }

    private boolean A0A() {
        boolean z10 = false;
        boolean waitingForRequirements = this.A07;
        if (!waitingForRequirements && this.A03 != 0) {
            for (int i10 = 0; i10 < this.A06.size(); i10++) {
                if (this.A06.get(i10).A02 == 0) {
                    z10 = true;
                    break;
                }
            }
        }
        boolean waitingForRequirements2 = this.A09;
        boolean z11 = waitingForRequirements2 != z10;
        this.A09 = z10;
        String[] strArr = A0H;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[4] = "HT4e9GATQ3DYWsFwZyJzXpwOkn6HfQP";
        strArr2[7] = "eDZDx6DsGZ1y85uRp2IzKIBDtNa9GCG";
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B(Message message) {
        switch (message.what) {
            case 0:
                A08((List) message.obj);
                return true;
            case 1:
                int i10 = message.arg1;
                int i11 = message.arg2;
                if (A0H[2].charAt(11) == 'k') {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[3] = "sxyw1qPQ7JLPTOY8e9sgs42WDZnpuN2t";
                strArr[6] = "KeBMIxstq15Te8zzUw5dJy9ueqCuctUt";
                A04(i10, i11);
                return true;
            case 2:
                BO update = (BO) message.obj;
                A05(update);
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final List<B8> A0D() {
        return this.A06;
    }

    public final void A0E() {
        A09(false);
    }

    public final void A0F(BS bs) {
        C3M.A01(bs);
        this.A0F.add(bs);
    }

    public final void A0G(DownloadRequest downloadRequest) {
        A0H(downloadRequest, 0);
    }

    public final void A0H(DownloadRequest downloadRequest, int i10) {
        this.A04++;
        this.A0C.obtainMessage(6, i10, 0, downloadRequest).sendToTarget();
    }

    public final boolean A0I() {
        return this.A00 == 0 && this.A04 == 0;
    }
}

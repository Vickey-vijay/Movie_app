package yads;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f84420a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f84421b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f84422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f84423d;

    public static void a(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(mg2.a("SNTP: Untrusted mode: ", b11));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(mg2.a("SNTP: Untrusted stratum: ", i10));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long b(int i10, byte[] bArr) {
        long jA = a(i10, bArr);
        long jA2 = a(i10 + 4, bArr);
        if (jA == 0 && jA2 == 0) {
            return 0L;
        }
        return ((jA2 * 1000) / 4294967296L) + ((jA - 2208988800L) * 1000);
    }

    public static long a(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long a() throws UnknownHostException {
        synchronized (f84421b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
            } else {
                long j10 = jCurrentTimeMillis / 1000;
                long j11 = jCurrentTimeMillis - (j10 * 1000);
                long j12 = j10 + 2208988800L;
                bArr[40] = (byte) (j12 >> 24);
                bArr[41] = (byte) (j12 >> 16);
                bArr[42] = (byte) (j12 >> 8);
                bArr[43] = (byte) j12;
                long j13 = (j11 * 4294967296L) / 1000;
                bArr[44] = (byte) (j13 >> 24);
                bArr[45] = (byte) (j13 >> 16);
                bArr[46] = (byte) (j13 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j14 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b10 = bArr[0];
            int i10 = bArr[1] & 255;
            long jB = b(24, bArr);
            long jB2 = b(32, bArr);
            long jB3 = b(40, bArr);
            a((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, jB3);
            long j15 = (j14 + (((jB3 - j14) + (jB2 - jB)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j15;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}

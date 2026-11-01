package d4;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f51862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f51863b;

    public static void c(DataOutputStream dataOutputStream, long j10) throws IOException {
        dataOutputStream.writeByte(((int) (j10 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j10) & 255);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f51862a.reset();
        try {
            b(this.f51863b, eventMessage.f19274b);
            String str = eventMessage.f19275c;
            if (str == null) {
                str = "";
            }
            b(this.f51863b, str);
            c(this.f51863b, eventMessage.f19276d);
            c(this.f51863b, eventMessage.f19277e);
            this.f51863b.write(eventMessage.f19278f);
            this.f51863b.flush();
            return this.f51862a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f51862a = byteArrayOutputStream;
        this.f51863b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}

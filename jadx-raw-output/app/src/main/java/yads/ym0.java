package yads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f85048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f85049b;

    public final byte[] a(wm0 wm0Var) {
        this.f85048a.reset();
        try {
            DataOutputStream dataOutputStream = this.f85049b;
            dataOutputStream.writeBytes(wm0Var.f84265b);
            dataOutputStream.writeByte(0);
            String str = wm0Var.f84266c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f85049b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f85049b.writeLong(wm0Var.f84267d);
            this.f85049b.writeLong(wm0Var.f84268e);
            this.f85049b.write(wm0Var.f84269f);
            this.f85049b.flush();
            return this.f85048a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public ym0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f85048a = byteArrayOutputStream;
        this.f85049b = new DataOutputStream(byteArrayOutputStream);
    }
}
